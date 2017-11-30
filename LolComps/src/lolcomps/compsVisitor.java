// Generated from comps.g4 by ANTLR 4.7
package lolcomps;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link compsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface compsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link compsParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(compsParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link compsParser#mais_comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMais_comp(compsParser.Mais_compContext ctx);
	/**
	 * Visit a parse tree produced by {@link compsParser#nome}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNome(compsParser.NomeContext ctx);
	/**
	 * Visit a parse tree produced by {@link compsParser#posicoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosicoes(compsParser.PosicoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link compsParser#listacamps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListacamps(compsParser.ListacampsContext ctx);
	/**
	 * Visit a parse tree produced by {@link compsParser#top}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTop(compsParser.TopContext ctx);
	/**
	 * Visit a parse tree produced by {@link compsParser#jungle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJungle(compsParser.JungleContext ctx);
	/**
	 * Visit a parse tree produced by {@link compsParser#mid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMid(compsParser.MidContext ctx);
	/**
	 * Visit a parse tree produced by {@link compsParser#adc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdc(compsParser.AdcContext ctx);
	/**
	 * Visit a parse tree produced by {@link compsParser#sup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSup(compsParser.SupContext ctx);
	/**
	 * Visit a parse tree produced by {@link compsParser#mais_campeoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMais_campeoes(compsParser.Mais_campeoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link compsParser#campeoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCampeoes(compsParser.CampeoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link compsParser#carac}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCarac(compsParser.CaracContext ctx);
	/**
	 * Visit a parse tree produced by {@link compsParser#lista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista(compsParser.ListaContext ctx);
	/**
	 * Visit a parse tree produced by {@link compsParser#bans}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBans(compsParser.BansContext ctx);
}