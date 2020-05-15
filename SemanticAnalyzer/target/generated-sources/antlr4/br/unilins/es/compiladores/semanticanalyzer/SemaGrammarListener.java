// Generated from br\u005Cunilins\es\compiladores\semanticanalyzer\SemaGrammar.g4 by ANTLR 4.8
package br.unilins.es.compiladores.semanticanalyzer;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SemaGrammarParser}.
 */
public interface SemaGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SemaGrammarParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(SemaGrammarParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemaGrammarParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(SemaGrammarParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemaGrammarParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(SemaGrammarParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemaGrammarParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(SemaGrammarParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemaGrammarParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoAritmetica(SemaGrammarParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemaGrammarParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoAritmetica(SemaGrammarParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemaGrammarParser#termoAritmetico}.
	 * @param ctx the parse tree
	 */
	void enterTermoAritmetico(SemaGrammarParser.TermoAritmeticoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemaGrammarParser#termoAritmetico}.
	 * @param ctx the parse tree
	 */
	void exitTermoAritmetico(SemaGrammarParser.TermoAritmeticoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemaGrammarParser#fatorAritmetico}.
	 * @param ctx the parse tree
	 */
	void enterFatorAritmetico(SemaGrammarParser.FatorAritmeticoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemaGrammarParser#fatorAritmetico}.
	 * @param ctx the parse tree
	 */
	void exitFatorAritmetico(SemaGrammarParser.FatorAritmeticoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemaGrammarParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoRelacional(SemaGrammarParser.ExpressaoRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemaGrammarParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoRelacional(SemaGrammarParser.ExpressaoRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemaGrammarParser#termoRelacional}.
	 * @param ctx the parse tree
	 */
	void enterTermoRelacional(SemaGrammarParser.TermoRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemaGrammarParser#termoRelacional}.
	 * @param ctx the parse tree
	 */
	void exitTermoRelacional(SemaGrammarParser.TermoRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemaGrammarParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(SemaGrammarParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemaGrammarParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(SemaGrammarParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemaGrammarParser#comandoAtribuicao}.
	 * @param ctx the parse tree
	 */
	void enterComandoAtribuicao(SemaGrammarParser.ComandoAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemaGrammarParser#comandoAtribuicao}.
	 * @param ctx the parse tree
	 */
	void exitComandoAtribuicao(SemaGrammarParser.ComandoAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemaGrammarParser#comandoEntrada}.
	 * @param ctx the parse tree
	 */
	void enterComandoEntrada(SemaGrammarParser.ComandoEntradaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemaGrammarParser#comandoEntrada}.
	 * @param ctx the parse tree
	 */
	void exitComandoEntrada(SemaGrammarParser.ComandoEntradaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemaGrammarParser#comandoSaida}.
	 * @param ctx the parse tree
	 */
	void enterComandoSaida(SemaGrammarParser.ComandoSaidaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemaGrammarParser#comandoSaida}.
	 * @param ctx the parse tree
	 */
	void exitComandoSaida(SemaGrammarParser.ComandoSaidaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemaGrammarParser#comandoCondicao}.
	 * @param ctx the parse tree
	 */
	void enterComandoCondicao(SemaGrammarParser.ComandoCondicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemaGrammarParser#comandoCondicao}.
	 * @param ctx the parse tree
	 */
	void exitComandoCondicao(SemaGrammarParser.ComandoCondicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemaGrammarParser#comandoRepeticao}.
	 * @param ctx the parse tree
	 */
	void enterComandoRepeticao(SemaGrammarParser.ComandoRepeticaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemaGrammarParser#comandoRepeticao}.
	 * @param ctx the parse tree
	 */
	void exitComandoRepeticao(SemaGrammarParser.ComandoRepeticaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemaGrammarParser#subAlgoritmo}.
	 * @param ctx the parse tree
	 */
	void enterSubAlgoritmo(SemaGrammarParser.SubAlgoritmoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemaGrammarParser#subAlgoritmo}.
	 * @param ctx the parse tree
	 */
	void exitSubAlgoritmo(SemaGrammarParser.SubAlgoritmoContext ctx);
}