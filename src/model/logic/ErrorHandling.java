/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.logic;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

public class ErrorHandling {
    public static boolean sameType(Object a, Object b){
        if(Integer.class.isInstance(b) && (Integer.class.isInstance(a) || Double.class.isInstance(a)))
            return true;
        return a.getClass() == b.getClass();
    }
    
    public static void semanticError(int line, int col, String message){
        System.err.printf("<%d:%d> Error semantico: %s.\n", line, col, message);
        System.exit(0);
    }
    
    
    public static void semanticError(TerminalNode node, String message){
        System.err.printf("<%d:%d> Error semantico: %s.\n", 
                node.getSymbol().getLine(), 1 + node.getSymbol().getCharPositionInLine(), message);
        System.exit(0);
    }
    
    public static void semanticError(ParserRuleContext rule, String message){
        System.err.printf("<%d:%d> Error semantico: %s.\n", 
                rule.getStart().getLine(), 1 + rule.getStart().getCharPositionInLine(), message);
        System.exit(0);
    }
    
    public static void runtimeError(TerminalNode node, String message){
        System.err.printf("<%d:%d> Error en tiempo de ejecucion: %s.\n", 
                node.getSymbol().getLine(), 1 + node.getSymbol().getCharPositionInLine(), message);
        System.exit(0);
    }
    
    public static void runtimeError(ParserRuleContext rule, String message){
        System.err.printf("<%d:%d> Error en tiempo de ejecucion: %s.\n", 
                rule.getStart().getLine(), 1 + rule.getStart().getCharPositionInLine(), message);
        System.exit(0);
    }
    
    public static String getTypeString ( Object o ) {
        if ( o instanceof Integer )
            return "entero";
        if ( o instanceof Double )
            return "real";
        if ( o instanceof Boolean )
            return "logico";
        if ( o instanceof String )
            return "cadena";
        return "tipo no encontrado";
    }
    
    public static String expectedDifferentTypeErrorMessage (Object expected, Object found) {
        return "tipos de datos incompatibles. Se esperaba: "
               + ErrorHandling.getTypeString(expected)
               + ";​se encontro: " + ErrorHandling.getTypeString(found);
    }
    
    public static String expectedDifferentTypeErrorMessage (String expected, Object found) {
        return "tipos de datos incompatibles. Se esperaba: "
               + expected
               + ";​se encontro: " + ErrorHandling.getTypeString(found);
    }
    
    public static String variableNotDeclaredErrorMessage (String id) {
        return "la variable con nombre \"" + id + "\" no ha sido declarada";
    }
    
    public static String variableAlreadyDeclaredErrorMessage (String id) {
        return "el simbolo con nombre \"" + id + "\" ya ha sido declarado";
    }
    
    public static String variableNotInitializedErrorMessage (String id) {
        return "la variable con nombre \"" + id + "\" no ha sido inicializada";
    }
    
    public static String invalidArrayPositionErrorMessage (Object pos) {
        return "se accedio a una posicion no valida del arreglo: " + pos;
    }
    
    public static String functionMustBeUsedInExpresionErrorMessage (String name) {
        return "la funcion \"" + name + "\" retorna un valor que debe ir en una expresion";
    }
    
    public static String functionMustNotBeUsedInExpresionErrorMessage (String name) {
        return "la funcion \"" + name + "\" es usada en una expresion pero no retorna ningun valor";
    }
    
    public static String incorrectNumberOfParametersErrorMessage (String name) {
        return "numero incorrecto de parametros al llamar la funcion \"" + name + "\"";
    }
    
}    
