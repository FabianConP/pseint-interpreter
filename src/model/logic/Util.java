/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.logic;

public class Util {
    public static boolean sameType(Object a, Object b){
        return a.getClass() == b.getClass();
    }
    
    public static void semanticError(int line, int col, String message){
        System.err.printf("<%d:%d> Error semantico %s.", line, col, message);
        System.exit(-1);
    }
}
