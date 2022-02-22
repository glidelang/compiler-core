// Generated from C:/Users/gerar/OneDrive/Desktop/code/fluid-lang/compiler-core/src/main/resources\FParser.g4 by ANTLR 4.9.2
package net.fluidlang.compiler.ast;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FParser}.
 */
public interface FParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(FParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(FParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#func_modifiers}.
	 * @param ctx the parse tree
	 */
	void enterFunc_modifiers(FParser.Func_modifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#func_modifiers}.
	 * @param ctx the parse tree
	 */
	void exitFunc_modifiers(FParser.Func_modifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#class_modifiers}.
	 * @param ctx the parse tree
	 */
	void enterClass_modifiers(FParser.Class_modifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#class_modifiers}.
	 * @param ctx the parse tree
	 */
	void exitClass_modifiers(FParser.Class_modifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(FParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(FParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(FParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(FParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(FParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(FParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(FParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(FParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(FParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(FParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(FParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(FParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(FParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(FParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(FParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(FParser.TypeContext ctx);
}