// Generated from C:/Users/gerar/OneDrive/Desktop/code/fluid-lang/compiler-core/src/main/resources\FParser.g4 by ANTLR 4.9.2
package net.liquidlang.compiler.ast;
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
	 * Enter a parse tree produced by {@link FParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(FParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(FParser.LineContext ctx);
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
	 * Enter a parse tree produced by {@link FParser#variable_modifiers}.
	 * @param ctx the parse tree
	 */
	void enterVariable_modifiers(FParser.Variable_modifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#variable_modifiers}.
	 * @param ctx the parse tree
	 */
	void exitVariable_modifiers(FParser.Variable_modifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(FParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(FParser.ImportStatementContext ctx);
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
	 * Enter a parse tree produced by {@link FParser#functionSignature}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSignature(FParser.FunctionSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#functionSignature}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSignature(FParser.FunctionSignatureContext ctx);
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
	 * Enter a parse tree produced by {@link FParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(FParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(FParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#passedParameterList}.
	 * @param ctx the parse tree
	 */
	void enterPassedParameterList(FParser.PassedParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#passedParameterList}.
	 * @param ctx the parse tree
	 */
	void exitPassedParameterList(FParser.PassedParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#newStatement}.
	 * @param ctx the parse tree
	 */
	void enterNewStatement(FParser.NewStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#newStatement}.
	 * @param ctx the parse tree
	 */
	void exitNewStatement(FParser.NewStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#oldStatement}.
	 * @param ctx the parse tree
	 */
	void enterOldStatement(FParser.OldStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#oldStatement}.
	 * @param ctx the parse tree
	 */
	void exitOldStatement(FParser.OldStatementContext ctx);
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
	 * Enter a parse tree produced by {@link FParser#valueExpr}.
	 * @param ctx the parse tree
	 */
	void enterValueExpr(FParser.ValueExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#valueExpr}.
	 * @param ctx the parse tree
	 */
	void exitValueExpr(FParser.ValueExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#functionType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionType(FParser.FunctionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#functionType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionType(FParser.FunctionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#functionValue}.
	 * @param ctx the parse tree
	 */
	void enterFunctionValue(FParser.FunctionValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#functionValue}.
	 * @param ctx the parse tree
	 */
	void exitFunctionValue(FParser.FunctionValueContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link FParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(FParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(FParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(FParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(FParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#reassignment}.
	 * @param ctx the parse tree
	 */
	void enterReassignment(FParser.ReassignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#reassignment}.
	 * @param ctx the parse tree
	 */
	void exitReassignment(FParser.ReassignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(FParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(FParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#elseIfStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseIfStatement(FParser.ElseIfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#elseIfStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseIfStatement(FParser.ElseIfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(FParser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(FParser.ElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(FParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(FParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(FParser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(FParser.LoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(FParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(FParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(FParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(FParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#dropletBlock}.
	 * @param ctx the parse tree
	 */
	void enterDropletBlock(FParser.DropletBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#dropletBlock}.
	 * @param ctx the parse tree
	 */
	void exitDropletBlock(FParser.DropletBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#dropletVarModifiers}.
	 * @param ctx the parse tree
	 */
	void enterDropletVarModifiers(FParser.DropletVarModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#dropletVarModifiers}.
	 * @param ctx the parse tree
	 */
	void exitDropletVarModifiers(FParser.DropletVarModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#dropletAssignment}.
	 * @param ctx the parse tree
	 */
	void enterDropletAssignment(FParser.DropletAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#dropletAssignment}.
	 * @param ctx the parse tree
	 */
	void exitDropletAssignment(FParser.DropletAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#dropletBody}.
	 * @param ctx the parse tree
	 */
	void enterDropletBody(FParser.DropletBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#dropletBody}.
	 * @param ctx the parse tree
	 */
	void exitDropletBody(FParser.DropletBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#dropletDecl}.
	 * @param ctx the parse tree
	 */
	void enterDropletDecl(FParser.DropletDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#dropletDecl}.
	 * @param ctx the parse tree
	 */
	void exitDropletDecl(FParser.DropletDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#castType}.
	 * @param ctx the parse tree
	 */
	void enterCastType(FParser.CastTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#castType}.
	 * @param ctx the parse tree
	 */
	void exitCastType(FParser.CastTypeContext ctx);
}