/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.logic;

import org.antlr.v4.runtime.tree.TerminalNode;

public class Util {
    public static boolean sameType(Object a, Object b){
        if(Integer.class.isInstance(b) && (Integer.class.isInstance(a) || Double.class.isInstance(a)))
            return true;
        return a.getClass() == b.getClass();
    }
    
    public static void semanticError(int line, int col, String message){
        System.err.printf("<%d:%d> Error semantico %s.", line, col, message);
        System.exit(-1);
    }
    
    
    public static void semanticError(TerminalNode node, String message){
        System.err.printf("<%d:%d> Error semantico %s.", node.getSymbol().getLine(), node.getSymbol().getCharPositionInLine(), message);
        System.exit(-1);
    }
}    
