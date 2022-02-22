// Generated from C:/Users/gerar/OneDrive/Desktop/code/fluid-lang/compiler-core/src/main/resources\FParser.g4 by ANTLR 4.9.2
package net.fluidlang.compiler.ast;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(FParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#func_modifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_modifiers(FParser.Func_modifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#class_modifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_modifiers(FParser.Class_modifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(FParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(FParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(FParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(FParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(FParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(FParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(FParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(FParser.TypeContext ctx);
}