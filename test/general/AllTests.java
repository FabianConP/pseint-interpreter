package general;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.generated.pseintGrammarLexer;
import model.generated.pseintGrammarParser;
import model.logic.Interpreter;
import model.logic.MyVisitor;
import model.logic.ProceduresVisitor;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author milder
 */
public class AllTests {
    
    private final String IN_EXTENSION = ".psc";
    private final String OUT_EXTENSION = ".out";
    private final String CORRECT_EXTENSION = ".out";
    
    private int numberOfTests;
    
    public AllTests() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void random() {
        String baseIn = "test-files/random/random_in", 
               baseOut = "test-files/random/random_out", 
               baseCorrectOut = "test-files/random/random_correct", 
               in = null, out, correct;
        
        numberOfTests = 7;
        for ( int i = 1; i <= numberOfTests; ++i ) {
            try {
                in = baseIn + i + IN_EXTENSION;
                out = baseOut + i + OUT_EXTENSION;
                correct = baseOut + i + CORRECT_EXTENSION;
                
                util.Interpreter.run(in, out);
                
                assertTrue(util.FileComparator.equals(correct, out));
            } catch (Exception ex) {
                System.err.println("Runtime Error while reading " + in);
            }
        }
    }
    
    
    @Test
    public void subprocesos() {
        String baseIn = "test-files/subprocesos/subprocesos_in", 
               baseOut = "test-files/subprocesos/subprocesos_out", 
               baseCorrectOut = "test-files/subprocesos/subprocesos_correct", 
               in = null, out, correct;
        
        numberOfTests = 1;
        for ( int i = 1; i <= numberOfTests; ++i ) {
            try {
                in = baseIn + i + IN_EXTENSION;
                out = baseOut + i + OUT_EXTENSION;
                correct = baseOut + i + CORRECT_EXTENSION;
                
                util.Interpreter.run(in, out);
                
                assertTrue(util.FileComparator.equals(correct, out));
            } catch (Exception ex) {
                System.err.println("Runtime Error while reading " + in);
            }
        }
    }
}
