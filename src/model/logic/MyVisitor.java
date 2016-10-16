package model.logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import model.generated.pseintGrammarBaseVisitor;
import model.generated.pseintGrammarParser;

public class MyVisitor<T> extends pseintGrammarBaseVisitor<T> {
    
    private Stack<HashMap<String, Object>> contextVariables;
    final private Scanner in;
    
    public MyVisitor() {
        contextVariables = new Stack<>();
        in = new Scanner(System.in);
    }
    
    @Override
    public T visitIdLista(pseintGrammarParser.IdListaContext ctx) {
        List<String> ids = new LinkedList<>();
        ctx.ID().stream().forEach((id) -> {
            ids.add(id.getText());
        });
        return (T) ids;
//        return super.visitIdLista(ctx); 
    }
    
    @Override
    public T visitExprLista(pseintGrammarParser.ExprListaContext ctx) {
        List<Object> expressions = new LinkedList<>();
        ctx.expr().stream().forEach((expression) -> {
            expressions.add(visitExpr(expression));
        });
        return (T) expressions;
//        return super.visitExprLista(ctx); 
    }
    
    @Override
    public T visitValor(pseintGrammarParser.ValorContext ctx) {
        if (ctx.INT() != null) {
            return (T) (Integer) Integer.parseInt(ctx.INT().toString());
        } else if (ctx.DOUBLE() != null) {
            return (T) (Double) Double.parseDouble(ctx.DOUBLE().toString());
        } else if (ctx.STRING() != null) {
            return (T) ctx.STRING().toString();
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
        return super.visitValor(ctx);
    }
    
    @Override
    public T visitExpr(pseintGrammarParser.ExprContext ctx) {
        return super.visitExpr(ctx);
    }
    
    @Override
    public T visitBloqueEsperar(pseintGrammarParser.BloqueEsperarContext ctx) {
        if (ctx.expr() != null) {
            try {
                int miliseconds = (Integer) visitExpr(ctx.expr());
                if (ctx.SEGUNDOS() != null)
                    miliseconds *= 1000;
                Thread.sleep(miliseconds);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
        return super.visitBloqueEsperar(ctx);
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
        return super.visitBloqueLeer(ctx);
    }
    
    @Override
    public T visitBloqueEscribir(pseintGrammarParser.BloqueEscribirContext ctx) {
        if (ctx.exprLista() != null) {
            StringBuilder out = new StringBuilder();
            ((List<Object>) ctx.exprLista()).stream().forEach((expression) -> {
                out.append(expression.toString());
                out.append('\n');
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
        return super.visitBloqueBorrarPantalla(ctx);
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
        return super.visitBloqueDimension(ctx);
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
                return null;
            setVarValue(id, value);
        }
        return super.visitBloqueAsignacion(ctx);
    }
    
    @Override
    public T visitBloqueDeclaracion(pseintGrammarParser.BloqueDeclaracionContext ctx) {
        if (ctx.idLista().ID() != null && ctx.tipoDato() != null) {
            Object tipoDato = getTipoDato(ctx.tipoDato());
            ctx.idLista().ID().stream().forEach(id -> {
                String ID = id.getText();
                if (isVarDefined(ID))
                    Util.semanticError(0, 0, "La variable " + ID + " ya ha sido declarada");
                setVarValue(ID, tipoDato);
            });
        }
        return super.visitBloqueDeclaracion(ctx);
    }
    
    @Override
    public T visitBloqueSegun(pseintGrammarParser.BloqueSegunContext ctx) {
        
        return super.visitBloqueSegun(ctx);
    }
    
    @Override
    public T visitBloqueRepetir(pseintGrammarParser.BloqueRepetirContext ctx) {
        if (ctx.expr() != null) {
            do {
                visitComandos(ctx.comandos());
            } while ((Boolean) visitExpr(ctx.expr()));
        }
        return super.visitBloqueRepetir(ctx);
    }
    
    @Override
    public T visitBloqueMientras(pseintGrammarParser.BloqueMientrasContext ctx) {
        if (ctx.expr() != null)
            while ((Boolean) visitExpr(ctx.expr()))
                visitComandos(ctx.comandos());
        return super.visitBloqueMientras(ctx);
    }
    
    @Override
    public T visitBloquePara(pseintGrammarParser.BloqueParaContext ctx) {
        if (ctx.ID() != null) {
            String ID = ctx.ID().getText();
            if (!isVarDefined(ID))
                Util.semanticError(0, 0, "No ha sido declarada ...");
            Object var = getVarValue(ID);
            Object value = visitExpr(ctx.expr(0));
            if (!Util.sameType(var, value))
                Util.semanticError(0, 0, "Incompatibilidad de tipos...");
            if (!Integer.class.isInstance(value))
                Util.semanticError(0, 0, "Incompatibilidad de tipos...");
            Integer limit = (Integer) visitExpr(ctx.expr(0));
            Integer step = 1;
            if (ctx.expr(1) != null)
                if (!Integer.class.isInstance(ctx.expr(1)))
                    Util.semanticError(0, 0, "Incompatibilidad de tipos...");
                else
                    step = (Integer) visitExpr(ctx.expr(1));
            while ((Integer) getVarValue(ID) <= limit) {
                visitComandos(ctx.comandos());
                setVarValue(ID, ((Integer) getVarValue(ID)) + step);
            }
        }
        return super.visitBloquePara(ctx);
    }
    
    @Override
    public T visitBloqueSi(pseintGrammarParser.BloqueSiContext ctx) {
        if (ctx.expr() != null) {
            Boolean condition = (Boolean) visitExpr(ctx.expr());
            if (condition)
                visitComandos(ctx.comandos(0));
            else
                visitComandos(ctx.comandos(1));
        }
        return super.visitBloqueSi(ctx);
    }
    
    @Override
    public T visitPrincipal(pseintGrammarParser.PrincipalContext ctx) {
        createContext();
        return super.visitPrincipal(ctx);
    }
    
    /**
     * Pendiente agregar los valores de los parametros
     */
    @Override
    public T visitProcedimiento(pseintGrammarParser.ProcedimientoContext ctx) {
        createContext();
        visitComandos(ctx.comandos());
        deleteContext();
        return super.visitProcedimiento(ctx);
    }
    
    @Override
    public T visitPseint(pseintGrammarParser.PseintContext ctx) {
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
        contextVariables.push(new HashMap<>());
    }
    
    private void deleteContext() {
        contextVariables.pop();
    }
    
    private Object transformByType(String id, String value) {
        Object var = getVarValue(id);
        final String simpleName = var.getClass().getSimpleName();
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
    
    private Object getTipoDato(pseintGrammarParser.TipoDatoContext tipoDatoContext) {
        Object tipoDato = null;
        if (tipoDatoContext.tipoDatoEntero() != null)
            tipoDato = (Integer) 0;
        else if (tipoDatoContext.tipoDatoReal() != null)
            tipoDato = (Double) 0.0;
        else if (tipoDatoContext.tipoDatoCaracter() != null)
            tipoDato = (Character) (char) 0;
        else if (tipoDatoContext.tipoDatoTexto() != null)
            tipoDato = (String) "";
        else if (tipoDatoContext.tipoDatoLogico() != null)
            tipoDato = (Boolean) false;
        else
            Util.semanticError(0, 0, "Tipo de dato invalido");
        return tipoDato;
    }
    
}
