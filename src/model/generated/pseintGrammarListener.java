// Generated from pseintGrammar.g by ANTLR 4.5.1
package model.generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link pseintGrammarParser}.
 */
public interface pseintGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link pseintGrammarParser#pseint}.
	 * @param ctx the parse tree
	 */
	void enterPseint(pseintGrammarParser.PseintContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseintGrammarParser#pseint}.
	 * @param ctx the parse tree
	 */
	void exitPseint(pseintGrammarParser.PseintContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseintGrammarParser#procedure}.
	 * @param ctx the parse tree
	 */
	void enterProcedure(pseintGrammarParser.ProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseintGrammarParser#procedure}.
	 * @param ctx the parse tree
	 */
	void exitProcedure(pseintGrammarParser.ProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseintGrammarParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(pseintGrammarParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseintGrammarParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(pseintGrammarParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseintGrammarParser#commands}.
	 * @param ctx the parse tree
	 */
	void enterCommands(pseintGrammarParser.CommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseintGrammarParser#commands}.
	 * @param ctx the parse tree
	 */
	void exitCommands(pseintGrammarParser.CommandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseintGrammarParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(pseintGrammarParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseintGrammarParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(pseintGrammarParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseintGrammarParser#bloqueSi}.
	 * @param ctx the parse tree
	 */
	void enterBloqueSi(pseintGrammarParser.BloqueSiContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseintGrammarParser#bloqueSi}.
	 * @param ctx the parse tree
	 */
	void exitBloqueSi(pseintGrammarParser.BloqueSiContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseintGrammarParser#bloquePara}.
	 * @param ctx the parse tree
	 */
	void enterBloquePara(pseintGrammarParser.BloqueParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseintGrammarParser#bloquePara}.
	 * @param ctx the parse tree
	 */
	void exitBloquePara(pseintGrammarParser.BloqueParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseintGrammarParser#bloqueMientras}.
	 * @param ctx the parse tree
	 */
	void enterBloqueMientras(pseintGrammarParser.BloqueMientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseintGrammarParser#bloqueMientras}.
	 * @param ctx the parse tree
	 */
	void exitBloqueMientras(pseintGrammarParser.BloqueMientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseintGrammarParser#bloqueRepetir}.
	 * @param ctx the parse tree
	 */
	void enterBloqueRepetir(pseintGrammarParser.BloqueRepetirContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseintGrammarParser#bloqueRepetir}.
	 * @param ctx the parse tree
	 */
	void exitBloqueRepetir(pseintGrammarParser.BloqueRepetirContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseintGrammarParser#bloqueSegun}.
	 * @param ctx the parse tree
	 */
	void enterBloqueSegun(pseintGrammarParser.BloqueSegunContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseintGrammarParser#bloqueSegun}.
	 * @param ctx the parse tree
	 */
	void exitBloqueSegun(pseintGrammarParser.BloqueSegunContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseintGrammarParser#bloqueDeclaracion}.
	 * @param ctx the parse tree
	 */
	void enterBloqueDeclaracion(pseintGrammarParser.BloqueDeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseintGrammarParser#bloqueDeclaracion}.
	 * @param ctx the parse tree
	 */
	void exitBloqueDeclaracion(pseintGrammarParser.BloqueDeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseintGrammarParser#bloqueAsignacion}.
	 * @param ctx the parse tree
	 */
	void enterBloqueAsignacion(pseintGrammarParser.BloqueAsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseintGrammarParser#bloqueAsignacion}.
	 * @param ctx the parse tree
	 */
	void exitBloqueAsignacion(pseintGrammarParser.BloqueAsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseintGrammarParser#bloqueDimension}.
	 * @param ctx the parse tree
	 */
	void enterBloqueDimension(pseintGrammarParser.BloqueDimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseintGrammarParser#bloqueDimension}.
	 * @param ctx the parse tree
	 */
	void exitBloqueDimension(pseintGrammarParser.BloqueDimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseintGrammarParser#bloqueBorrarPantalla}.
	 * @param ctx the parse tree
	 */
	void enterBloqueBorrarPantalla(pseintGrammarParser.BloqueBorrarPantallaContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseintGrammarParser#bloqueBorrarPantalla}.
	 * @param ctx the parse tree
	 */
	void exitBloqueBorrarPantalla(pseintGrammarParser.BloqueBorrarPantallaContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseintGrammarParser#bloqueEscribir}.
	 * @param ctx the parse tree
	 */
	void enterBloqueEscribir(pseintGrammarParser.BloqueEscribirContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseintGrammarParser#bloqueEscribir}.
	 * @param ctx the parse tree
	 */
	void exitBloqueEscribir(pseintGrammarParser.BloqueEscribirContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseintGrammarParser#bloqueLeer}.
	 * @param ctx the parse tree
	 */
	void enterBloqueLeer(pseintGrammarParser.BloqueLeerContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseintGrammarParser#bloqueLeer}.
	 * @param ctx the parse tree
	 */
	void exitBloqueLeer(pseintGrammarParser.BloqueLeerContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseintGrammarParser#bloqueEsperar}.
	 * @param ctx the parse tree
	 */
	void enterBloqueEsperar(pseintGrammarParser.BloqueEsperarContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseintGrammarParser#bloqueEsperar}.
	 * @param ctx the parse tree
	 */
	void exitBloqueEsperar(pseintGrammarParser.BloqueEsperarContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseintGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(pseintGrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseintGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(pseintGrammarParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseintGrammarParser#booleanExpr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpr(pseintGrammarParser.BooleanExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseintGrammarParser#booleanExpr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpr(pseintGrammarParser.BooleanExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseintGrammarParser#comparisonExpr}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpr(pseintGrammarParser.ComparisonExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseintGrammarParser#comparisonExpr}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpr(pseintGrammarParser.ComparisonExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseintGrammarParser#tipoDato}.
	 * @param ctx the parse tree
	 */
	void enterTipoDato(pseintGrammarParser.TipoDatoContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseintGrammarParser#tipoDato}.
	 * @param ctx the parse tree
	 */
	void exitTipoDato(pseintGrammarParser.TipoDatoContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseintGrammarParser#tipoDatoEntero}.
	 * @param ctx the parse tree
	 */
	void enterTipoDatoEntero(pseintGrammarParser.TipoDatoEnteroContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseintGrammarParser#tipoDatoEntero}.
	 * @param ctx the parse tree
	 */
	void exitTipoDatoEntero(pseintGrammarParser.TipoDatoEnteroContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseintGrammarParser#tipoDatoReal}.
	 * @param ctx the parse tree
	 */
	void enterTipoDatoReal(pseintGrammarParser.TipoDatoRealContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseintGrammarParser#tipoDatoReal}.
	 * @param ctx the parse tree
	 */
	void exitTipoDatoReal(pseintGrammarParser.TipoDatoRealContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseintGrammarParser#tipoDatoCaracter}.
	 * @param ctx the parse tree
	 */
	void enterTipoDatoCaracter(pseintGrammarParser.TipoDatoCaracterContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseintGrammarParser#tipoDatoCaracter}.
	 * @param ctx the parse tree
	 */
	void exitTipoDatoCaracter(pseintGrammarParser.TipoDatoCaracterContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseintGrammarParser#tipoDatoTexto}.
	 * @param ctx the parse tree
	 */
	void enterTipoDatoTexto(pseintGrammarParser.TipoDatoTextoContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseintGrammarParser#tipoDatoTexto}.
	 * @param ctx the parse tree
	 */
	void exitTipoDatoTexto(pseintGrammarParser.TipoDatoTextoContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseintGrammarParser#tipoDatoLogico}.
	 * @param ctx the parse tree
	 */
	void enterTipoDatoLogico(pseintGrammarParser.TipoDatoLogicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseintGrammarParser#tipoDatoLogico}.
	 * @param ctx the parse tree
	 */
	void exitTipoDatoLogico(pseintGrammarParser.TipoDatoLogicoContext ctx);
}