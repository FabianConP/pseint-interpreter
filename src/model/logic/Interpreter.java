package model.logic;

import java.io.File;
import java.io.FileInputStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import model.generated.pseintGrammarLexer;
import model.generated.pseintGrammarParser;

public class Interpreter {

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream(new File("input.txt")));
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        pseintGrammarLexer lexer = new pseintGrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        pseintGrammarParser parser = new pseintGrammarParser(tokens);
        ParseTree tree = parser.pseint();

        MyVisitor<Object> loader = new MyVisitor<>();
        loader.visit(tree);

    }
}
