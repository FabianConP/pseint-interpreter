// Generated from pseintGrammar.g4 by ANTLR 4.5
package model.generated;
import org.antlr.v4.runtime.misc.NotNull;
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
	 * Enter a parse tree produced by {@link pseintGrammarParser#procedimiento}.
	 * @param ctx the parse tree
	 */
	void enterProcedimiento(pseintGrammarParser.ProcedimientoContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseintGrammarParser#procedimiento}.
	 * @param ctx the parse tree
	 */
	void exitProcedimiento(pseintGrammarParser.ProcedimientoContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseintGrammarParser#principal}.
	 * @param ctx the parse tree
	 */
	void enterPrincipal(pseintGrammarParser.PrincipalContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseintGrammarParser#principal}.
	 * @param ctx the parse tree
	 */
	void exitPrincipal(pseintGrammarParser.PrincipalContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseintGrammarParser#comandos}.
	 * @param ctx the parse tree
	 */
	void enterComandos(pseintGrammarParser.ComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseintGrammarParser#comandos}.
	 * @param ctx the parse tree
	 */
	void exitComandos(pseintGrammarParser.ComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseintGrammarParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(pseintGrammarParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseintGrammarParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(pseintGrammarParser.ComandoContext ctx);
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
	 * Enter a parse tree produced by {@link pseintGrammarParser#bloqueLlamarFuncion}.
	 * @param ctx the parse tree
	 */
	void enterBloqueLlamarFuncion(pseintGrammarParser.BloqueLlamarFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseintGrammarParser#bloqueLlamarFuncion}.
	 * @param ctx the parse tree
	 */
	void exitBloqueLlamarFuncion(pseintGrammarParser.BloqueLlamarFuncionContext ctx);
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
	 * Enter a parse tree produced by {@link pseintGrammarParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(pseintGrammarParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseintGrammarParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(pseintGrammarParser.ValorContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseintGrammarParser#exprLista}.
	 * @param ctx the parse tree
	 */
	void enterExprLista(pseintGrammarParser.ExprListaContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseintGrammarParser#exprLista}.
	 * @param ctx the parse tree
	 */
	void exitExprLista(pseintGrammarParser.ExprListaContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseintGrammarParser#idLista}.
	 * @param ctx the parse tree
	 */
	void enterIdLista(pseintGrammarParser.IdListaContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseintGrammarParser#idLista}.
	 * @param ctx the parse tree
	 */
	void exitIdLista(pseintGrammarParser.IdListaContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseintGrammarParser#casoLista}.
	 * @param ctx the parse tree
	 */
	void enterCasoLista(pseintGrammarParser.CasoListaContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseintGrammarParser#casoLista}.
	 * @param ctx the parse tree
	 */
	void exitCasoLista(pseintGrammarParser.CasoListaContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseintGrammarParser#llamarFuncion}.
	 * @param ctx the parse tree
	 */
	void enterLlamarFuncion(pseintGrammarParser.LlamarFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseintGrammarParser#llamarFuncion}.
	 * @param ctx the parse tree
	 */
	void exitLlamarFuncion(pseintGrammarParser.LlamarFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseintGrammarParser#varArreglo}.
	 * @param ctx the parse tree
	 */
	void enterVarArreglo(pseintGrammarParser.VarArregloContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseintGrammarParser#varArreglo}.
	 * @param ctx the parse tree
	 */
	void exitVarArreglo(pseintGrammarParser.VarArregloContext ctx);
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