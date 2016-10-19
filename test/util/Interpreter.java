package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import model.generated.pseintGrammarLexer;
import model.generated.pseintGrammarParser;
import model.logic.MainVisitor;
import model.logic.ProcedureVisitor;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 *
 * @author milder
 */
public class Interpreter {
    
    public static void run ( String in, String out ) throws IOException {
        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(in));
        System.setOut(new PrintStream(new File(out)));
        
        pseintGrammarLexer lexer = new pseintGrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        pseintGrammarParser parser = new pseintGrammarParser(tokens);
        ParseTree tree = parser.pseint();

        ProcedureVisitor<Object> procVisitor = new ProcedureVisitor<>();
        try {
            procVisitor.visit(tree);
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Functions error");
        }

        MainVisitor<Object> loader = new MainVisitor<>(procVisitor.getProcedures());
        try {
            loader.visit(tree);
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Main visitor error");
        }
    }
    
}
