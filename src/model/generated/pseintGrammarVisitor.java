// Generated from pseintGrammar.g by ANTLR 4.5.1
package model.generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link pseintGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface pseintGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link pseintGrammarParser#pseint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseint(pseintGrammarParser.PseintContext ctx);
	/**
	 * Visit a parse tree produced by {@link pseintGrammarParser#procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure(pseintGrammarParser.ProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link pseintGrammarParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(pseintGrammarParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link pseintGrammarParser#commands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommands(pseintGrammarParser.CommandsContext ctx);
	/**
	 * Visit a parse tree produced by {@link pseintGrammarParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(pseintGrammarParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link pseintGrammarParser#bloqueSi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloqueSi(pseintGrammarParser.BloqueSiContext ctx);
	/**
	 * Visit a parse tree produced by {@link pseintGrammarParser#bloquePara}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloquePara(pseintGrammarParser.BloqueParaContext ctx);
	/**
	 * Visit a parse tree produced by {@link pseintGrammarParser#bloqueMientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloqueMientras(pseintGrammarParser.BloqueMientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link pseintGrammarParser#bloqueRepetir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloqueRepetir(pseintGrammarParser.BloqueRepetirContext ctx);
	/**
	 * Visit a parse tree produced by {@link pseintGrammarParser#bloqueSegun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloqueSegun(pseintGrammarParser.BloqueSegunContext ctx);
	/**
	 * Visit a parse tree produced by {@link pseintGrammarParser#bloqueDeclaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloqueDeclaracion(pseintGrammarParser.BloqueDeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link pseintGrammarParser#bloqueAsignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloqueAsignacion(pseintGrammarParser.BloqueAsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link pseintGrammarParser#bloqueDimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloqueDimension(pseintGrammarParser.BloqueDimensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link pseintGrammarParser#bloqueBorrarPantalla}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloqueBorrarPantalla(pseintGrammarParser.BloqueBorrarPantallaContext ctx);
	/**
	 * Visit a parse tree produced by {@link pseintGrammarParser#bloqueEscribir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloqueEscribir(pseintGrammarParser.BloqueEscribirContext ctx);
	/**
	 * Visit a parse tree produced by {@link pseintGrammarParser#bloqueLeer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloqueLeer(pseintGrammarParser.BloqueLeerContext ctx);
	/**
	 * Visit a parse tree produced by {@link pseintGrammarParser#bloqueEsperar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloqueEsperar(pseintGrammarParser.BloqueEsperarContext ctx);
	/**
	 * Visit a parse tree produced by {@link pseintGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(pseintGrammarParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link pseintGrammarParser#booleanExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpr(pseintGrammarParser.BooleanExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link pseintGrammarParser#comparisonExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpr(pseintGrammarParser.ComparisonExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link pseintGrammarParser#tipoDato}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoDato(pseintGrammarParser.TipoDatoContext ctx);
	/**
	 * Visit a parse tree produced by {@link pseintGrammarParser#tipoDatoEntero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoDatoEntero(pseintGrammarParser.TipoDatoEnteroContext ctx);
	/**
	 * Visit a parse tree produced by {@link pseintGrammarParser#tipoDatoReal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoDatoReal(pseintGrammarParser.TipoDatoRealContext ctx);
	/**
	 * Visit a parse tree produced by {@link pseintGrammarParser#tipoDatoCaracter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoDatoCaracter(pseintGrammarParser.TipoDatoCaracterContext ctx);
	/**
	 * Visit a parse tree produced by {@link pseintGrammarParser#tipoDatoTexto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoDatoTexto(pseintGrammarParser.TipoDatoTextoContext ctx);
	/**
	 * Visit a parse tree produced by {@link pseintGrammarParser#tipoDatoLogico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoDatoLogico(pseintGrammarParser.TipoDatoLogicoContext ctx);
}