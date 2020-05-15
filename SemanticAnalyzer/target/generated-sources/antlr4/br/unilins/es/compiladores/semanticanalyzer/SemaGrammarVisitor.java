// Generated from br\u005Cunilins\es\compiladores\semanticanalyzer\SemaGrammar.g4 by ANTLR 4.8
package br.unilins.es.compiladores.semanticanalyzer;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SemaGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SemaGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SemaGrammarParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(SemaGrammarParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SemaGrammarParser#declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao(SemaGrammarParser.DeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SemaGrammarParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoAritmetica(SemaGrammarParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SemaGrammarParser#termoAritmetico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermoAritmetico(SemaGrammarParser.TermoAritmeticoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SemaGrammarParser#fatorAritmetico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFatorAritmetico(SemaGrammarParser.FatorAritmeticoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SemaGrammarParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoRelacional(SemaGrammarParser.ExpressaoRelacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SemaGrammarParser#termoRelacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermoRelacional(SemaGrammarParser.TermoRelacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SemaGrammarParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando(SemaGrammarParser.ComandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SemaGrammarParser#comandoAtribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoAtribuicao(SemaGrammarParser.ComandoAtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SemaGrammarParser#comandoEntrada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoEntrada(SemaGrammarParser.ComandoEntradaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SemaGrammarParser#comandoSaida}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoSaida(SemaGrammarParser.ComandoSaidaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SemaGrammarParser#comandoCondicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoCondicao(SemaGrammarParser.ComandoCondicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SemaGrammarParser#comandoRepeticao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoRepeticao(SemaGrammarParser.ComandoRepeticaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SemaGrammarParser#subAlgoritmo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubAlgoritmo(SemaGrammarParser.SubAlgoritmoContext ctx);
}