package model.logic;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Stack;
import model.generated.pseintGrammarBaseVisitor;
import model.generated.pseintGrammarParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

public class MainVisitor<T> extends pseintGrammarBaseVisitor<T> {

    private Stack<Map<String, Variable>> contextVariables;
    private Stack<List<String>> contextVariablesNames;
    private final Scanner in;

    private HashMap<String, Procedure> procedures;

    private final double EPS = 1e-9;

    private static final String INTEGER = "Integer";
    private static final String DOUBLE = "Double";
    private static final String CHARACTER = "Character";
    private static final String STRING = "String";
    private static final String BOOLEAN = "Boolean";

    public MainVisitor(HashMap<String, Procedure> procedures) {
        contextVariables = new Stack<>();
        contextVariablesNames = new Stack<>();
        contextVariables.push(new HashMap<>());
        in = new Scanner(System.in);

        this.procedures = procedures;
    }

    @Override
    public T visitIdLista(pseintGrammarParser.IdListaContext ctx) {
        List<String> ids = new LinkedList<>();
        ctx.ID().stream().forEach((id) -> {
            ids.add(id.getText());
        });
//        return super.visitIdLista(ctx); 
        return (T) ids;
    }

    @Override
    public T visitExprLista(pseintGrammarParser.ExprListaContext ctx) {
        List<Object> expressions = new LinkedList<>();
        ctx.expr().stream().forEach((expression) -> {
            expressions.add(visitExpr(expression));
        });
//        return super.visitExprLista(ctx); 
        return (T) expressions;
    }

    @Override
    public T visitValor(pseintGrammarParser.ValorContext ctx) {
        if (ctx.INT() != null) {
            return (T) (Integer) Integer.parseInt(ctx.INT().toString());
        } else if (ctx.DOUBLE() != null) {
            return (T) (Double) Double.parseDouble(ctx.DOUBLE().toString());
        } else if (ctx.STRING() != null) {
            String value = ctx.STRING().toString();
            return (T) value.substring(1, value.length() - 1);
        } else if (ctx.BOOL() != null) {
            final String value = ctx.BOOL().getText().toLowerCase();
            switch (value) {
                case "verdadero":
                    return (T) (Boolean) true;
                case "falso":
                    return (T) (Boolean) false;
                default:
                    ErrorHandling.semanticError(ctx.BOOL(), value);
                    break;
            }
        }
        //return super.visitValor(ctx);
        return null;
    }

    @Override
    public T visitExpr(pseintGrammarParser.ExprContext ctx) {
        if (ctx.valor() != null) {
            return visitValor(ctx.valor());
        } else if (ctx.MULOP() != null) {
            final String op = ctx.MULOP().getText().toLowerCase();
            Object a = visitExpr(ctx.expr(0));
            Object b = visitExpr(ctx.expr(1));
            Object result = mul(ctx.expr(1), a, b, op);
            if (result == null) {
                if ( a instanceof Integer || a instanceof Double )
                    ErrorHandling.semanticError(ctx.expr(1),
                        ErrorHandling.expectedDifferentTypeErrorMessage("entero o real", b));
                else
                    ErrorHandling.semanticError(ctx.expr(0),
                        ErrorHandling.expectedDifferentTypeErrorMessage("entero o real", a));
            }
            return (T) result;
        } else if (ctx.SUMOP() != null) {
            final String op = ctx.SUMOP().getText().toLowerCase();
            Object a = visitExpr(ctx.expr(0));
            Object b = visitExpr(ctx.expr(1));
            Object result = sum(a, b, op);
            if (result == null) {
                if ( a instanceof Integer || a instanceof Double )
                    ErrorHandling.semanticError(ctx.expr(1),
                        ErrorHandling.expectedDifferentTypeErrorMessage("entero o real", b));
                else
                    ErrorHandling.semanticError(ctx.expr(0),
                        ErrorHandling.expectedDifferentTypeErrorMessage("entero o real", a));
            }
            return (T) result;
        } else if (ctx.RESOP() != null) {
            if (ctx.expr(1) != null) {
                final String op = ctx.RESOP().getText().toLowerCase();
                Object a = visitExpr(ctx.expr(0));
                Object b = visitExpr(ctx.expr(1));
                Object result = sub(a, b, op);
                if (result == null) {
                    if ( a instanceof Integer || a instanceof Double )
                        ErrorHandling.semanticError(ctx.expr(1),
                            ErrorHandling.expectedDifferentTypeErrorMessage("entero o real", b));
                    else
                        ErrorHandling.semanticError(ctx.expr(0),
                            ErrorHandling.expectedDifferentTypeErrorMessage("entero o real", a));
                }
                return (T) result;
            } else {
                final String op = ctx.RESOP().getText().toLowerCase();
                Object a = visitExpr(ctx.expr(0));
                Object result = negArit(a, op);
                if (result == null)
                    ErrorHandling.semanticError(ctx.RESOP(), "error en negacion aritmetica");
                return (T) result;
            }
        } else if (ctx.NEGOP() != null) {
            final String op = ctx.NEGOP().getText().toLowerCase();
            Object a = visitExpr(ctx.expr(0));
            Object result = negBool(a, op);
            if (result == null)
                ErrorHandling.semanticError(ctx.NEGOP(), "error en negacion booleana");
            return (T) result;
        } else if (ctx.BINOP() != null) {
            final String op = ctx.BINOP().getText().toLowerCase();
            Object a = visitExpr(ctx.expr(0));
            Object b = visitExpr(ctx.expr(1));

            Object result = binOp(a, b, op);
            if (result == null)
                ErrorHandling.semanticError(ctx.BINOP(), 
                    ErrorHandling.expectedDifferentTypeErrorMessage(a, b));
            return (T) result;
        } else if (ctx.COMPOP() != null) {
            final String op = ctx.COMPOP().getText().toLowerCase();
            Object a = visitExpr(ctx.expr(0));
            Object b = visitExpr(ctx.expr(1));
            Object result = compOp(a, b, op);
            if (result == null)
                ErrorHandling.semanticError(ctx.COMPOP(),
                    ErrorHandling.expectedDifferentTypeErrorMessage(a, b));
            return (T) result;
        } else if (ctx.llamarFuncion() != null) {
            String name = ctx.llamarFuncion().ID().getText();
            int numParams = (ctx.llamarFuncion().exprLista() == null) ? 0 : ctx.llamarFuncion().exprLista().expr().size();
            Procedure procedure = procedures.get(Procedure.buildId(name, numParams));
            if (procedure.getReturnVar() == null)
                ErrorHandling.semanticError(ctx.llamarFuncion(), 
                    ErrorHandling.functionMustNotBeUsedInExpresionErrorMessage(name));
            return visitLlamarFuncion(ctx.llamarFuncion());
        } else if (ctx.varArreglo() != null) {
            String id = ctx.varArreglo().ID().getText();
            String tradArray = "";
            if (ctx.varArreglo().CORIZQ() != null) {
                List<Object> dims = (List<Object>) visitExprLista(ctx.varArreglo().exprLista());
                tradArray = generateTradDimension(ctx.varArreglo(), dims);
            }
            String tradID = id + tradArray;
            boolean idDefined = false;
            for(Entry<String, Variable> entry : contextVariables.peek().entrySet())
                if(entry.getKey().startsWith(id + "$")){
                    idDefined = true;
                    break;
                }
            
            if ( !idDefined )
                ErrorHandling.semanticError(ctx.varArreglo(),
                    ErrorHandling.variableNotDeclaredErrorMessage(id));
            
            if (!isVarDefined(tradID)){
                String index  = tradArray.replaceAll("\\$", ", ");
                index = index.replaceFirst(", ", "");
                ErrorHandling.runtimeError(ctx.varArreglo(), 
                    ErrorHandling.invalidArrayPositionErrorMessage(index));
            }
            
            if (!getVar(tradID).isInitialized())
                ErrorHandling.semanticError(ctx.varArreglo().ID(), 
                    ErrorHandling.variableNotInitializedErrorMessage(id));
            return (T) getVar(tradID).getValue();
        } else if (ctx.PARIZQ() != null) {
            return visitExpr(ctx.expr(0));
        } else if (ctx.ID() != null) {
            String ID = ctx.ID().getText();
            if (!isVarDefined(ID) && !isProcDefined(ID))
                ErrorHandling.semanticError(ctx.ID(), 
                    ErrorHandling.variableNotDeclaredErrorMessage(ID));
            if (isVarDefined(ID)) {
                if (!getVar(ID).isInitialized())
                    ErrorHandling.semanticError(ctx.ID(), 
                        ErrorHandling.variableNotInitializedErrorMessage(ID));
                return (T) getVar(ID).getValue();
            }
            if (isProcDefined(ID)) {
                createContextProcedure(new LinkedList<>(), new LinkedList<>());
                String id = ID + "#0";
                Procedure procedure = procedures.get(id);
                if (procedure.getReturnVar() != null) {
                    Variable returnVar = procedure.getReturnVar();
                    if (!isVarDefined(returnVar.getName()))
                        ErrorHandling.semanticError(procedure.getContext(), 
                            "la variable de retorno no fue creada");
                    Variable var = getVar(returnVar.getName());
                    if (!var.isInitialized())
                        ErrorHandling.semanticError(procedure.getContext(), 
                            "variable de retorno no fue inicializada");
                    deleteContextProcedure();
                    return (T) var.getValue();
                } else
                    deleteContextProcedure();
            }
        }
        //return super.visitExpr(ctx);
        return null;
    }

    @Override
    public T visitLlamarFuncion(pseintGrammarParser.LlamarFuncionContext ctx) {
        String name = ctx.ID().getText().toLowerCase();
        int numParams = 0;
        if (ctx.exprLista() != null && ctx.exprLista().expr() != null)
            numParams = ctx.exprLista().expr().size();
        String id = Procedure.buildId(name, numParams);
        boolean methodExists = isProcDefined(name);
        if (methodExists) {
            if (!procedures.containsKey(id))
                ErrorHandling.semanticError(ctx.ID(), 
                    ErrorHandling.incorrectNumberOfParametersErrorMessage(name));
        } else
            ErrorHandling.semanticError(ctx.ID(),
                ErrorHandling.functionNotDeclaredErrorMessage(id));
        List<Object> paramValues = new LinkedList<>();
        if (ctx.exprLista() != null)
            paramValues = (List<Object>) visitExprLista(ctx.exprLista());
        Procedure procedure = procedures.get(id);
        List<String> paramNames = procedure.getParamNames();
        createContextProcedure(paramNames, paramValues);
        visitComandos(procedure.getContext().comandos());
        if (procedure.getReturnVar() != null) {
            Variable returnVar = procedure.getReturnVar();
            if (!isVarDefined(returnVar.getName()))
                ErrorHandling.semanticError(procedure.getContext(), 
                            "la variable de retorno no fue creada");
            Variable var = getVar(returnVar.getName());
            if (!var.isInitialized())
                ErrorHandling.semanticError(procedure.getContext(), 
                            "variable de retorno no fue inicializada");
            deleteContextProcedure();
            return (T) var.getValue();
        } else
            deleteContextProcedure();
//        return super.visitLlamarFuncion(ctx);
        return null;
    }

    @Override
    public T visitBloqueLlamarFuncion(pseintGrammarParser.BloqueLlamarFuncionContext ctx) {
        String name = ctx.llamarFuncion().ID().getText();
        int numParams = (ctx.llamarFuncion().exprLista() == null) ? 0 : ctx.llamarFuncion().exprLista().expr().size();
        Procedure procedure = procedures.get(Procedure.buildId(name, numParams));
        if (procedure != null && procedure.getReturnVar() != null)
            ErrorHandling.semanticError(ctx.llamarFuncion(), 
                ErrorHandling.functionMustBeUsedInExpresionErrorMessage(name));
        return super.visitBloqueLlamarFuncion(ctx);
    }

    @Override
    public T visitBloqueEsperar(pseintGrammarParser.BloqueEsperarContext ctx) {
        if (ctx.TECLA() != null) {
            in.nextLine();
        } else if (ctx.expr() != null) {
            try {
                int miliseconds = (Integer) visitExpr(ctx.expr());
                if (ctx.SEGUNDOS() != null)
                    miliseconds *= 1000;
                Thread.sleep(miliseconds);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
        //return super.visitBloqueEsperar(ctx);
        return null;
    }

    @Override
    public T visitBloqueLeer(pseintGrammarParser.BloqueLeerContext ctx) {
        if (ctx.idLista() != null) {
            ctx.idLista().ID().stream().forEach((id) -> {
                String ID = id.getText();
                if (!isVarDefined(ID))
                    ErrorHandling.semanticError(id,
                        ErrorHandling.variableNotDeclaredErrorMessage(ID));
                String value = in.next();
                
                String type1 = getVar(ID).getType();
                String type2 = guessTipoDato(value);
                
                try {
                    setVarValue(ID, transformByType(ID, value));
                } catch ( Exception e ) {
                    ErrorHandling.runtimeError(id,
                        ErrorHandling.expectedDifferentTypeErrorMessage(
                            ErrorHandling.getTypeString(type1), value));
                }
            });
        }
        //return super.visitBloqueLeer(ctx);
        return null;
    }

    @Override
    public T visitBloqueEscribir(pseintGrammarParser.BloqueEscribirContext ctx) {
        if (ctx.exprLista() != null) {
            StringBuilder out = new StringBuilder();
            ((List<Object>) visitExprLista(ctx.exprLista())).stream().forEach((expression) -> {
                String value = expression.toString();
                if (Boolean.class.isInstance(expression))
                    value = ((Boolean) expression ? "verdadero" : "falso");
                out.append(value);
//                out.append('\n');
            });
            System.out.println(out.toString());
        }
        return null;
//        return super.visitBloqueEscribir(ctx);
    }

    @Override
    public T visitBloqueBorrarPantalla(pseintGrammarParser.BloqueBorrarPantallaContext ctx) {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows"))
                Runtime.getRuntime().exec("cls");
            else
                Runtime.getRuntime().exec("clear");
        } catch (final Exception e) {
            System.err.print("Error limpiando pantalla");
        }
        //return super.visitBloqueBorrarPantalla(ctx);
        return null;
    }

    @Override
    public T visitBloqueDimension(pseintGrammarParser.BloqueDimensionContext ctx) {
        if (ctx.varArreglo() != null) {
            ctx.varArreglo().stream().forEach(varArreglo -> {
                String ID = varArreglo.ID().getText();
                if (!isVarDefined(ID))
                    ErrorHandling.semanticError(varArreglo, 
                        ErrorHandling.variableNotDeclaredErrorMessage(ID));
                else if (getVar(ID).isInitialized())
                    ErrorHandling.semanticError(varArreglo, 
                            "la variable \"" + ID + "\" ya se inicializo como no arreglo");
                List<Object> dims = (List<Object>) visitExprLista(varArreglo.exprLista());
                List<String> tradAllID = tradAllDimension(varArreglo, ID, dims);
                String type = getVar(ID).getType();
                for (String tradID : tradAllID) {
                    if (isVarDefined(tradID))
                        ErrorHandling.semanticError(varArreglo,
                            ErrorHandling.variableAlreadyDeclaredErrorMessage(ID));
                    createVar(tradID, type);
                }
                deleteVar(ID);
            });
        }
        //return super.visitBloqueDimension(ctx);
        return null;
    }

    @Override
    public T visitBloqueAsignacion(pseintGrammarParser.BloqueAsignacionContext ctx) {
        if (ctx.ID() != null) {
            String id = ctx.ID().getText();
            String tradArray = "";
            if (ctx.CORIZQ() != null) {
                List<Object> dims = (List<Object>) visitExprLista(ctx.exprLista());
                checkDimensions(ctx.CORIZQ(), dims);
                for (Object dim : dims)
                    tradArray += "$" + dim;
            }
            String tradID = id + tradArray;
            if (!isVarDefined(tradID))
                ErrorHandling.semanticError(ctx.ID(),
                    ErrorHandling.variableNotDeclaredErrorMessage(id));
            String type = getVar(tradID).getType();
            Object value = visitExpr(ctx.expr());
            if (!validAssig(type, value))
                ErrorHandling.semanticError(ctx.expr(), 
                     ErrorHandling.expectedDifferentTypeErrorMessage(getVar(tradID).getValue(), value) );
            setVarValue(id + tradArray, value);
        }
        //return super.visitBloqueAsignacion(ctx);
        return null;
    }

    private boolean validAssig(String type, Object value) {
        String typeValue = value.getClass().getSimpleName();
        if (type.equals(DOUBLE))
            return typeValue.equals(DOUBLE) || typeValue.equals(INTEGER);
        return type.equals(typeValue);
    }

    @Override
    public T visitBloqueDeclaracion(pseintGrammarParser.BloqueDeclaracionContext ctx) {
        if (ctx.idLista().ID() != null && ctx.tipoDato() != null) {
            String tipoDato = (String) visitTipoDato(ctx.tipoDato());
            ctx.idLista().ID().stream().forEach(id -> {
                String ID = id.getText();
                if (isVarDefined(ID) || isProcDefined(ID))
                    ErrorHandling.semanticError(id,
                        ErrorHandling.variableAlreadyDeclaredErrorMessage(ID));
                createVar(ID, tipoDato);
            });
        }
        //return super.visitBloqueDeclaracion(ctx);
        return null;
    }

    // Pendiente implementar
    @Override
    public T visitBloqueSegun(pseintGrammarParser.BloqueSegunContext ctx) {
        if (ctx.expr() != null) {
//            createContext();
            Object var = visitExpr(ctx.expr());
            String type = guessTipoDato(var);
            boolean entered = false;
            if (ctx.casoLista() != null) {
                int nCases = ctx.casoLista().CASO().size();
                for (int i = 0; i < nCases; i++) {
                    Object varCase = visitExpr(ctx.casoLista().expr(i));
                    if ( !type.equals(guessTipoDato(varCase)) )
                        ErrorHandling.semanticError(ctx.casoLista().expr(i), 
                            ErrorHandling.expectedDifferentTypeErrorMessage(varCase, var));
                    if (var.equals(varCase)) {
                        visitComandos(ctx.casoLista().comandos(i));
                        entered = true;
                        break;
                    }
                }
            }
            if (ctx.DE() != null && ctx.OTRO() != null && ctx.MODO() != null && !entered)
                visitComandos(ctx.comandos());
//            deleteContext();
        }
        //return super.visitBloqueSegun(ctx);
        return null;
    }

    @Override
    public T visitBloqueRepetir(pseintGrammarParser.BloqueRepetirContext ctx
    ) {
        if (ctx.expr() != null) {
            do {
//                createContext();
                visitComandos(ctx.comandos());
//                deleteContext();
            } while (!evalBooleanExpr(ctx.expr(), visitExpr(ctx.expr())));
        }
        //return super.visitBloqueRepetir(ctx);
        return null;
    }

    @Override
    public T visitBloqueMientras(pseintGrammarParser.BloqueMientrasContext ctx
    ) {
        if (ctx.expr() != null) {
            while (evalBooleanExpr(ctx.expr(), visitExpr(ctx.expr()))) {
//                createContext();
                visitComandos(ctx.comandos());
//                deleteContext();
            }
        }
//        return super.visitBloqueMientras(ctx);
        return null;
    }

    @Override
    public T visitBloquePara(pseintGrammarParser.BloqueParaContext ctx
    ) {
        if (ctx.ID() != null) {
            String ID = ctx.ID().getText();
            if (!isVarDefined(ID))
                ErrorHandling.semanticError(ctx.ID(),
                    ErrorHandling.variableNotDeclaredErrorMessage(ID));
            
            String type = getVar(ID).getType();
            
            if ( !type.equals(INTEGER) && !type.equals(DOUBLE) )
                ErrorHandling.semanticError(ctx.ID(),
                    ErrorHandling.expectedDifferentTypeErrorMessage("entero o real", 
                            getVar(ID).getValue()));
            
            Object value = visitExpr(ctx.expr(0));
            
            if (!validAssig(type, value))
                ErrorHandling.semanticError(ctx.expr(0), 
                    ErrorHandling.expectedDifferentTypeErrorMessage(getVar(ID).getValue(), value));
            
            if (!Integer.class.isInstance(value) && !Double.class.isInstance(value))
                ErrorHandling.semanticError(ctx.expr(0), 
                        ErrorHandling.expectedDifferentTypeErrorMessage(getVar(ID).getValue(), value));
            
            Object l = visitExpr(ctx.expr(1));
            if ( !(l instanceof Integer) && !(l instanceof Double) )
                ErrorHandling.semanticError(ctx.expr(0), 
                        ErrorHandling.expectedDifferentTypeErrorMessage("entero o real", l));
            
            setVarValue(ID, value);           
            Double limit = (Double) Double.parseDouble(visitExpr(ctx.expr(1)).toString());
            Double step = 1.0;
            
            if (ctx.expr(2) != null) {
                Object valueStep = visitExpr(ctx.expr(2));
                
                if ( type.equals(INTEGER) ) {
                    if ( !Integer.class.isInstance(valueStep) )
                        ErrorHandling.semanticError(ctx.expr(2), 
                                ErrorHandling.expectedDifferentTypeErrorMessage("entero", valueStep));
                    else
                        step = (Double) Double.parseDouble(valueStep.toString());
                } else {
                    if ( !Integer.class.isInstance(valueStep) && !Double.class.isInstance(valueStep) )
                        ErrorHandling.semanticError(ctx.expr(2), 
                                ErrorHandling.expectedDifferentTypeErrorMessage("entero o real", valueStep));
                    else
                        step = (Double) Double.parseDouble(valueStep.toString());
                }
            }
            while (cmp(Double.parseDouble(getVar(ID).getValue().toString()) - step, limit) != 0) {
//                createContext();
                visitComandos(ctx.comandos());
                Double next = Double.parseDouble(getVar(ID).getValue().toString()) + step;
                if (cmp(Math.round(next), next) == 0)
                    setVarValue(ID, (Integer) (int) Math.round(next));
                else
                    setVarValue(ID, next);
//                deleteContext();
            }
        }
//        return super.visitBloquePara(ctx);
        return null;
    }

    @Override
    public T visitBloqueSi(pseintGrammarParser.BloqueSiContext ctx
    ) {
        if (ctx.expr() != null) {
            Boolean condition = evalBooleanExpr(ctx.expr(), visitExpr(ctx.expr()));
            if (condition) {
//                createContext();
                visitComandos(ctx.comandos(0));
//                deleteContext();
            } else if (ctx.SINO() != null) {
//                createContext();
                visitComandos(ctx.comandos(1));
//                deleteContext();
            }
        }
//        return super.visitBloqueSi(ctx);
        return null;
    }

    @Override
    public T visitPrincipal(pseintGrammarParser.PrincipalContext ctx
    ) {
        createContext();
        return super.visitPrincipal(ctx);
    }

    /**
     * Pendiente agregar los valores de los parametros
     */
    @Override
    public T visitProcedimiento(pseintGrammarParser.ProcedimientoContext ctx
    ) {
//        createContext();
//        visitComandos(ctx.comandos());
//        deleteContext();
//        return super.visitProcedimiento(ctx);
        return null;
    }

    @Override
    public T visitPseint(pseintGrammarParser.PseintContext ctx
    ) {
        createContext();
        return super.visitPseint(ctx);
    }

    private boolean isProcDefined(String id) {
        boolean defined = false;
        for (Entry<String, Procedure> entry : procedures.entrySet())
            defined |= entry.getValue().getName().equals(id);
        return defined;
    }

    private boolean isVarDefined(String id) {
        return contextVariables.peek().containsKey(id);
    }

    private void createVar(String id, String type) {
        contextVariables.peek().put(id, new Variable(id, type, false));
    }

    private void deleteVar(String id) {
        contextVariables.peek().remove(id);
    }

    private Variable getVar(String id) {
        return contextVariables.peek().get(id);
    }

    private void setVarValue(String id, Object value) {
        Variable var = contextVariables.peek().get(id);
        var.setInitialized(true);
        var.setValue(value);
    }

    private void createContext() {
        List<String> varNames = new LinkedList<>();
        contextVariables.peek().forEach((key, value) -> varNames.add(key));
        contextVariables.push(new HashMap<>(contextVariables.peek()));
        contextVariablesNames.push(varNames);
    }

    private void createContextProcedure(List<String> paramNames, List<Object> paramValues) {
        HashMap<String, Variable> params = new HashMap<>();
        int numParams = paramNames.size();
        for (int i = 0; i < numParams; i++) {
            String name = paramNames.get(i);
            Object value = paramValues.get(i);
            params.put(paramNames.get(i), new Variable(name, guessTipoDato(value), true, value));
        }
        contextVariables.push(new HashMap<>());
        contextVariables.push(params);
    }

    private void deleteContext() {
        Map<String, Variable> curContext = contextVariables.peek();
        contextVariables.pop();
        curContext.forEach((key, value) -> {
            if (isVarDefined(key))
                setVarValue(key, value);
        });

    }

    private void deleteContextProcedure() {
        deleteContext();
        deleteContext();
    }

    private Object transformByType(String id, String value) throws Exception {
        Object var = getVar(id).getValue();
        final String simpleName = var.getClass().getSimpleName();
        switch (simpleName) {
            case INTEGER:
                double temp = (Double) Double.parseDouble(value);
                return (Integer) (int) temp;
            case DOUBLE:
                return (Double) Double.parseDouble(value);
            case STRING:
                return value;
            case BOOLEAN:
                if ( value.equals("verdadero") ) value = "true";
                else if ( value.equals("falso") ) value = "false";
                else 
                    throw new Exception("Bad value for boolean variable");
                return (Boolean) Boolean.parseBoolean(value);
            default:
                ErrorHandling.semanticError(0, 0, value);
        }
        return null;
    }

    @Override
    public T visitTipoDato(pseintGrammarParser.TipoDatoContext ctx) {
        Object tipoDato = null;
        if (ctx.tipoDatoEntero() != null)
            tipoDato = INTEGER;
        else if (ctx.tipoDatoReal() != null)
            tipoDato = DOUBLE;
        else if (ctx.tipoDatoCaracter() != null)
            tipoDato = CHARACTER;
        else if (ctx.tipoDatoTexto() != null)
            tipoDato = STRING;
        else if (ctx.tipoDatoLogico() != null)
            tipoDato = BOOLEAN;
        else
            ErrorHandling.semanticError(ctx.tipoDatoEntero().getTokens(0).get(0), 
                    "tipo de dato invalido");
        return (T) tipoDato;
    }

    private String guessTipoDato(Object value) {
        if (value instanceof Integer)
            return INTEGER;
        if (value instanceof Double)
            return DOUBLE;
        if (value instanceof Character)
            return CHARACTER;
        if (value instanceof String)
            return STRING;
        if (value instanceof Boolean)
            return BOOLEAN;
        ErrorHandling.semanticError(0, 0, 
            "tipo de dato invalido");
        return null;
    }

    public Boolean evalBooleanExpr(ParserRuleContext t, Object expr) {
        if (!Boolean.class
                .isInstance(expr))
            ErrorHandling.semanticError(t, 
                ErrorHandling.expectedDifferentTypeErrorMessage(true, expr));
        return (Boolean) expr;
    }

    private Object mul(ParserRuleContext rule, Object a, Object b, final String op) {
        boolean aIsInteger = a instanceof Integer;
        boolean aIsDouble = a instanceof Double;

        boolean bIsInteger = b instanceof Integer;
        boolean bIsDouble = b instanceof Double;

        double res = 0;

        if ((aIsInteger || aIsDouble) && (bIsInteger || bIsDouble)) {
            double numa = (Double) Double.parseDouble(a.toString()), numb = (Double) Double.parseDouble(b.toString());
            switch (op) {
                case "/":
                    if (numb == 0)
                        ErrorHandling.runtimeError(rule, "division entre 0");
                    else
                        res = (numa / numb);
                    break;
                case "*":
                    res = (numa * numb);
                    break;
                case "%":
                case "mod":
                    if (numb == 0)
                        ErrorHandling.runtimeError(rule, "division entre 0");
                    else
                        res = (numa % numb);
                    break;
                case "^":
                    res = Math.pow(numa, numb);
                    break;
                default:
                    ErrorHandling.semanticError(0, 0, "operador desconocido");
            }
            if (isInteger(res))
                return (Integer) (int) Math.round(res);
            return (Double) res;
        }
        return null;
    }

    private Object sum(Object a, Object b, final String op) {
        boolean aIsInteger = a instanceof Integer;
        boolean aIsDouble = a instanceof Double;

        boolean bIsInteger = b instanceof Integer;
        boolean bIsDouble = b instanceof Double;

        double res = 0;

        if ((aIsInteger || aIsDouble) && (bIsInteger || bIsDouble)) {
            double numa = (Double) Double.parseDouble(a.toString()), numb = (Double) Double.parseDouble(b.toString());
            switch (op) {
                case "+":
                    res = (numa + numb);
                    break;
                default:
                    ErrorHandling.semanticError(0, 0, "operador desconocido");
            }
            if (isInteger(res))
                return (Integer) (int) Math.round(res);
            return (Double) res;
        }
        return null;
    }

    private Object sub(Object a, Object b, final String op) {
        boolean aIsInteger = a instanceof Integer;
        boolean aIsDouble = a instanceof Double;

        boolean bIsInteger = b instanceof Integer;
        boolean bIsDouble = b instanceof Double;

        double res = 0;

        if ((aIsInteger || aIsDouble) && (bIsInteger || bIsDouble)) {
            double numa = (Double) Double.parseDouble(a.toString()), numb = (Double) Double.parseDouble(b.toString());
            switch (op) {
                case "-":
                    res = (numa - numb);
                    break;
                default:
                    ErrorHandling.semanticError(0, 0, "operador desconocido");
            }
            if (isInteger(res))
                return (Integer) (int) Math.round(res);
            return (Double) res;
        }
        return null;
    }

    private Object negArit(Object a, final String op) {
        boolean aIsInteger = a instanceof Integer;
        boolean aIsDouble = a instanceof Double;

        double res = 0;

        if (aIsInteger || aIsDouble) {
            double numa = (Double) Double.parseDouble(a.toString());
            switch (op) {
                case "-":
                    res = -numa;
                    break;
                default:
                    ErrorHandling.semanticError(0, 0, "operador desconocido");
            }
            if (isInteger(res))
                return (Integer) (int) Math.round(res);
            return (Double) res;
        }
        return null;
    }

    private Object negBool(Object a, final String op) {
        boolean aIsBoolean = a instanceof Boolean;

        if (aIsBoolean)
            switch (op) {
                case "~":
                case "no":
                    return (Boolean) (!(Boolean) a);
            }
        return null;
    }

    private Object binOp(Object a, Object b, final String op) {
        boolean aIsBoolean = a instanceof Boolean;
        boolean bIsBoolean = b instanceof Boolean;

        if (aIsBoolean && bIsBoolean) {
            switch (op) {
                case "o":
                case "|":
                    return (Boolean) ((Boolean) a || (Boolean) b);
                case "y":
                case "&":
                    return (Boolean) ((Boolean) a && (Boolean) b);
                default:
                    ErrorHandling.semanticError(0, 0, "operador desconocido");
            }
        }
        return null;
    }

    private Object compOp(Object a, Object b, final String op) {
        boolean aIsInteger = a instanceof Integer;
        boolean aIsDouble = a instanceof Double;
        boolean aIsString = a instanceof String;

        boolean bIsInteger = b instanceof Integer;
        boolean bIsDouble = b instanceof Double;
        boolean bIsString = b instanceof String;

        if ((aIsInteger || aIsDouble) && (bIsInteger || bIsDouble)) {
            double numa = (Double) Double.parseDouble(a.toString()), numb = (Double) Double.parseDouble(b.toString());
            switch (op) {
                case "=":
                    return (Boolean) (cmp(numa, numb) == 0);
                case "<>":
                    return (Boolean) (cmp(numa, numb) != 0);
                case "<":
                    return (Boolean) (cmp(numa, numb) < 0);
                case "<=":
                    return (Boolean) (cmp(numa, numb) <= 0);
                case ">":
                    return (Boolean) (cmp(numa, numb) > 0);
                case ">=":
                    return (Boolean) (cmp(numa, numb) >= 0);
                default:
                    ErrorHandling.semanticError(0, 0, "operador desconocido");
            }
        }
        if (aIsString && bIsString) {
            String strA = (String) a, strB = (String) b;
            switch (op) {
                case "=":
                    return (Boolean) (strA.compareTo(strB) == 0);
                case "<>":
                    return (Boolean) (strA.compareTo(strB) != 0);
                case "<":
                    return (Boolean) (strA.compareTo(strB) < 0);
                case "<=":
                    return (Boolean) (strA.compareTo(strB) <= 0);
                case ">":
                    return (Boolean) (strA.compareTo(strB) > 0);
                case ">=":
                    return (Boolean) (strA.compareTo(strB) >= 0);
                default:
                    ErrorHandling.semanticError(0, 0, "operador desconocido");
            }
        }
        return null;
    }

    private String generateTradDimension(TerminalNode t, List<Object> dims) {
        String trad = "";
        checkDimensions(t, dims);
        for (int i = 0; i < dims.size(); i++)
            trad += "$" + dims.get(i);
        return trad;
    }
    
    private String generateTradDimension(ParserRuleContext t, List<Object> dims) {
        String trad = "";
        checkDimensions(t, dims);
        for (int i = 0; i < dims.size(); i++)
            trad += "$" + dims.get(i);
        return trad;
    }

    private List<String> tradAllDimension(TerminalNode t, String varName, List<Object> dims) {
        List<String> all = new LinkedList<>();
        checkDimensions(t, dims);
        generateAllDimensions(dims, 0, varName, all);
        return all;
    }
    
    private List<String> tradAllDimension(ParserRuleContext t, String varName, List<Object> dims) {
        List<String> all = new LinkedList<>();
        checkDimensions(t, dims);
        generateAllDimensions(dims, 0, varName, all);
        return all;
    }

    private void generateAllDimensions(List<Object> dims, int ndim, String path, List<String> all) {
        if (ndim == dims.size()) {
            all.add(path);
        } else
            for (int i = 0; i < (Integer) dims.get(ndim); i++)
                generateAllDimensions(dims, ndim + 1, path + "$" + i, all);
    }

    private void checkDimensions(TerminalNode t, List<Object> dims) {
        for (Object dim : dims) {
            if (!Integer.class.isInstance(dim))
                ErrorHandling.semanticError(t, 
                    ErrorHandling.expectedDifferentTypeErrorMessage(42, dim));
            if ((Integer) dim < 0)
                ErrorHandling.runtimeError(t, 
                    ErrorHandling.invalidArrayPositionErrorMessage(dim));
        }
    }
    
    private void checkDimensions(ParserRuleContext t, List<Object> dims) {
        for (Object dim : dims) {
            if (!Integer.class.isInstance(dim))
                ErrorHandling.semanticError(t, 
                    ErrorHandling.expectedDifferentTypeErrorMessage(42, dim));
            if ((Integer) dim < 0)
                ErrorHandling.runtimeError(t, 
                    ErrorHandling.invalidArrayPositionErrorMessage(dim));
        }
    }

    private int cmp(double a, double b) {
        double dif = a - b;
        return Math.abs(dif) < EPS ? 0 : dif < 0 ? -1 : 1;
    }

    private boolean isInteger(double a) {
        return cmp(a, Math.round(a)) == 0;
    }
}
