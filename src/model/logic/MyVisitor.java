package model.logic;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
import model.generated.pseintGrammarBaseVisitor;
import model.generated.pseintGrammarParser;

public class MyVisitor<T> extends pseintGrammarBaseVisitor<T> {

    private Stack<Map<String, Object>> contextVariables;
    private Stack<List<String>> contextVariablesNames;
    private final Scanner in;

    private final double EPS = 1e-9;

    public MyVisitor() {
        contextVariables = new Stack<>();
        contextVariablesNames = new Stack<>();
        contextVariables.push(new HashMap<>());
        in = new Scanner(System.in);
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
                    Util.semanticError(0, 0, value);
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
            Object result = mul(a, b, op);
            if (result == null)
                Util.semanticError(0, 0, "error en mult");
            return (T) result;
        } else if (ctx.SUMOP() != null) {
            final String op = ctx.SUMOP().getText().toLowerCase();
            Object a = visitExpr(ctx.expr(0));
            Object b = visitExpr(ctx.expr(1));
            Object result = sum(a, b, op);
            if (result == null)
                Util.semanticError(0, 0, "error en suma");
            return (T) result;
        } else if (ctx.RESOP() != null) {
            if (ctx.expr(1) != null) {
                final String op = ctx.RESOP().getText().toLowerCase();
                Object a = visitExpr(ctx.expr(0));
                Object b = visitExpr(ctx.expr(1));
                Object result = sub(a, b, op);
                if (result == null)
                    Util.semanticError(0, 0, "error en resta");
                return (T) result;
            } else {
                final String op = ctx.RESOP().getText().toLowerCase();
                Object a = visitExpr(ctx.expr(0));
                Object result = negArit(a, op);
                if (result == null)
                    Util.semanticError(0, 0, "error en negacion aritmetica");
                return (T) result;
            }
        } else if (ctx.NEGOP() != null) {
            final String op = ctx.NEGOP().getText().toLowerCase();
            Object a = visitExpr(ctx.expr(0));
            Object result = negBool(a, op);
            if (result == null)
                Util.semanticError(0, 0, "error en negacion booleana");
            return (T) result;
        } else if (ctx.BINOP() != null) {
            final String op = ctx.BINOP().getText().toLowerCase();
            Object a = visitExpr(ctx.expr(0));
            Object b = visitExpr(ctx.expr(1));
            Object result = binOp(a, b, op);
            if (result == null)
                Util.semanticError(0, 0, "error en operacion binaria");
            return (T) result;
        } else if (ctx.COMPOP() != null) {
            final String op = ctx.COMPOP().getText().toLowerCase();
            Object a = visitExpr(ctx.expr(0));
            Object b = visitExpr(ctx.expr(1));
            Object result = compOp(a, b, op);
            if (result == null)
                Util.semanticError(0, 0, "error en comparacion");
            return (T) result;
        } else if (ctx.PARIZQ() != null) {
            return visitExpr(ctx.expr(0));
        } else if (ctx.CORIZQ() != null) {

        } else if (ctx.ID() != null) {
            String ID = ctx.ID().getText();
            return (T) getVarValue(ID);
        }
        //return super.visitExpr(ctx);
        return null;
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
                    Util.semanticError(0, 0, "");
                String value = in.next();
                setVarValue(ID, transformByType(ID, value));
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
                out.append(expression.toString());
                out.append('\n');
            });
            System.out.print(out.toString());
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

    /**
     * Pendiente falta guardar de alguna forma el tamanio de cada dimension
     */
    @Override
    public T visitBloqueDimension(pseintGrammarParser.BloqueDimensionContext ctx) {
        if (ctx.varArreglo() != null) {
            ctx.varArreglo().stream().forEach(varArreglo -> {
                String ID = varArreglo.ID().getText();
                if (isVarDefined(ID))
                    Util.semanticError(0, 0, "La variable " + ID + " ya ha sido declarada");
                List<Object> expressions = (List<Object>) visitExprLista(varArreglo.exprLista());
                int totalSize = 1;
                for (Object size : expressions) {
                    if (!Integer.class.isInstance(size))
                        Util.semanticError(0, 0, size.toString());
                    Integer curSize = (Integer) size;
                    if (curSize <= 0)
                        Util.semanticError(0, 0, "Valor no positivo");
                    totalSize *= curSize;
                }
                int[] matrix = new int[totalSize];
                setVarValue(ID, matrix);
            });
        }
        //return super.visitBloqueDimension(ctx);
        return null;
    }

    /**
     * Pendiente manejar la asignacion para arreglos n-dimensionales
     */
    @Override
    public T visitBloqueAsignacion(pseintGrammarParser.BloqueAsignacionContext ctx) {
        if (ctx.ID() != null) {
            String id = ctx.ID().getText();
            if (!isVarDefined(id))
                return null;
            Object var = getVarValue(id);
            Object value = visitExpr(ctx.expr());
            if (!Util.sameType(var, value))
                Util.semanticError(0, 0, "declaracion de tipo diferente");
            setVarValue(id, value);
        }
        //return super.visitBloqueAsignacion(ctx);
        return null;
    }

    @Override
    public T visitBloqueDeclaracion(pseintGrammarParser.BloqueDeclaracionContext ctx) {
        if (ctx.idLista().ID() != null && ctx.tipoDato() != null) {
            Object tipoDato = visitTipoDato(ctx.tipoDato());
            ctx.idLista().ID().stream().forEach(id -> {
                String ID = id.getText();
                if (isVarDefined(ID))
                    Util.semanticError(0, 0, "La variable " + ID + " ya ha sido declarada");
                setVarValue(ID, tipoDato);
            });
        }
        //return super.visitBloqueDeclaracion(ctx);
        return null;
    }

    // Pendiente implementar
    @Override
    public T visitBloqueSegun(pseintGrammarParser.BloqueSegunContext ctx) {
        if (ctx.expr() != null) {
            createContext();
            Object var = visitExpr(ctx.expr());
            boolean entered = false;
            if (ctx.casoLista() != null) {
                int nCases = ctx.casoLista().CASO().size();
                for (int i = 0; i < nCases; i++)
                    if (var.equals(visitExpr(ctx.casoLista().expr(i)))) {
                        visitComandos(ctx.casoLista().comandos(i));
                        entered = true;
                    }
            }
            if (ctx.DE() != null && ctx.OTRO() != null && ctx.MODO() != null && !entered)
                visitComandos(ctx.comandos());
            deleteContext();
        }
        //return super.visitBloqueSegun(ctx);
        return null;
    }

    @Override
    public T visitBloqueRepetir(pseintGrammarParser.BloqueRepetirContext ctx
    ) {
        if (ctx.expr() != null) {
            do {
                createContext();
                visitComandos(ctx.comandos());
                deleteContext();
            } while (!evalBooleanExpr(visitExpr(ctx.expr())));
        }
        //return super.visitBloqueRepetir(ctx);
        return null;
    }

    @Override
    public T visitBloqueMientras(pseintGrammarParser.BloqueMientrasContext ctx
    ) {
        if (ctx.expr() != null) {
            while (evalBooleanExpr(visitExpr(ctx.expr()))) {
                createContext();
                visitComandos(ctx.comandos());
                deleteContext();
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
                Util.semanticError(0, 0, "No ha sido declarada ...");
            Object var = getVarValue(ID);
            Object value = visitExpr(ctx.expr(0));
            if (!Util.sameType(var, value))
                Util.semanticError(0, 0, "Incompatibilidad de tipos...");
            if (!Integer.class.isInstance(value) && !Double.class.isInstance(value))
                Util.semanticError(0, 0, "Incompatibilidad de tipos...");
            setVarValue(ID, value);
            Double limit = (Double) Double.parseDouble(visitExpr(ctx.expr(1)).toString());
            Double step = 1.0;
            if (ctx.expr(2) != null){
                Object valueStep = visitExpr(ctx.expr(2));
                if (!Integer.class.isInstance(valueStep) && !Double.class.isInstance(valueStep))
                    Util.semanticError(0, 0, "Incompatibilidad de tipos...");
                else
                    step = (Double) Double.parseDouble(valueStep.toString());
            }
            while (cmp(Double.parseDouble(getVarValue(ID).toString()), limit) <= 0) {
                createContext();
                visitComandos(ctx.comandos());
                setVarValue(ID, Double.parseDouble(getVarValue(ID).toString()) + step);
                deleteContext();
            }
        }
//        return super.visitBloquePara(ctx);
        return null;
    }

    @Override
    public T visitBloqueSi(pseintGrammarParser.BloqueSiContext ctx
    ) {
        if (ctx.expr() != null) {
            Boolean condition = (Boolean) visitExpr(ctx.expr());
            if (condition) {
                createContext();
                visitComandos(ctx.comandos(0));
                deleteContext();
            } else {
                createContext();
                visitComandos(ctx.comandos(1));
                deleteContext();
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
        createContext();
        visitComandos(ctx.comandos());
        deleteContext();
        return super.visitProcedimiento(ctx);
    }

    @Override
    public T visitPseint(pseintGrammarParser.PseintContext ctx
    ) {
        createContext();
        return super.visitPseint(ctx);
    }

    private boolean isVarDefined(String id) {
        return contextVariables.peek().containsKey(id);
    }

    private Object getVarValue(String id) {
        return contextVariables.peek().get(id);
    }

    private void setVarValue(String id, Object value) {
        contextVariables.peek().put(id, value);
    }

    private void createContext() {
        List<String> varNames = new LinkedList<>();
        contextVariables.peek().forEach((key, value) -> varNames.add(key));
        contextVariables.push(new HashMap<>(contextVariables.peek()));
        contextVariablesNames.push(varNames);
    }

    private void createContextProcedure() {
        contextVariables.push(new HashMap<>());
        createContext();
    }

    private void deleteContext() {
        Map<String, Object> curContext = contextVariables.peek();
        contextVariables.pop();
        curContext.forEach((key, value) -> {
            if (isVarDefined(key))
                setVarValue(key, value);
        });

    }

    private Object transformByType(String id, String value) {
        Object var = getVarValue(id);
        final String simpleName = var.getClass().getSimpleName();
        boolean errorTransformation;
        switch (simpleName) {
            case "Integer":
                return (Integer) Integer.parseInt(value);
            case "Double":
                return (Double) Double.parseDouble(value);
            case "String":
                return value;
            case "Boolean":
                return (Boolean) Boolean.parseBoolean(value);
            default:
                Util.semanticError(0, 0, value);
        }
        return null;
    }

    @Override
    public T visitTipoDato(pseintGrammarParser.TipoDatoContext ctx) {
        Object tipoDato = null;
        if (ctx.tipoDatoEntero() != null)
            tipoDato = (Integer) 0;
        else if (ctx.tipoDatoReal() != null)
            tipoDato = (Double) 0.0;
        else if (ctx.tipoDatoCaracter() != null)
            tipoDato = (Character) (char) 0;
        else if (ctx.tipoDatoTexto() != null)
            tipoDato = (String) "";
        else if (ctx.tipoDatoLogico() != null)
            tipoDato = (Boolean) false;
        else
            Util.semanticError(0, 0, "Tipo de dato invalido");
        return (T) tipoDato;
    }

    public Boolean
            evalBooleanExpr(Object expr) {
        if (!Boolean.class
                .isInstance(expr))
            Util.semanticError(0, 0, "expresion booleana incorrecta");
        return (Boolean) expr;
    }

    private Object mul(Object a, Object b, final String op) {
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
                        Util.semanticError(0, 0, "division entre 0");
                    else
                        res = (numa / numb);
                    break;
                case "*":
                    res = (numa * numb);
                    break;
                case "%":
                case "mod":
                    if (numb == 0)
                        Util.semanticError(0, 0, "division entre 0");
                    else
                        res = (numa % numb);
                    break;
                case "^":
                    res = Math.pow(numa, numb);
                    break;
                default:
                    Util.semanticError(0, 0, "operador desconocido");
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
                    Util.semanticError(0, 0, "operador desconocido");
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
                    Util.semanticError(0, 0, "operador desconocido");
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
                    Util.semanticError(0, 0, "operador desconocido");
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
                    Util.semanticError(0, 0, "operador desconocido");
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
                    Util.semanticError(0, 0, "operador desconocido");
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
                    Util.semanticError(0, 0, "operador desconocido");
            }
        }
        return null;
    }

    private int cmp(double a, double b) {
        double dif = a - b;
        return Math.abs(dif) < EPS ? 0 : dif < 0 ? -1 : 1;
    }

    private boolean isInteger(double a) {
        return cmp(a, Math.round(a)) == 0;
    }
}
