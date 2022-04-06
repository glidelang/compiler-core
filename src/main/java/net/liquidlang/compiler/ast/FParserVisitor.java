// Generated from C:/Users/gerar/OneDrive/Desktop/code/fluid-lang/compiler-core/src/main/resources\FParser.g4 by ANTLR 4.9.2
package net.liquidlang.compiler.ast;
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
	 * Visit a parse tree produced by {@link FParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(FParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#func_modifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_modifiers(FParser.Func_modifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#variable_modifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_modifiers(FParser.Variable_modifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(FParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(FParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#functionSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSignature(FParser.FunctionSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#parameterlessFunctionSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterlessFunctionSignature(FParser.ParameterlessFunctionSignatureContext ctx);
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
	 * Visit a parse tree produced by {@link FParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(FParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(FParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#passedParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPassedParameterList(FParser.PassedParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#newStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewStatement(FParser.NewStatementContext ctx);
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
	 * Visit a parse tree produced by {@link FParser#nullValueExprOperators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullValueExprOperators(FParser.NullValueExprOperatorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#valueExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExpr(FParser.ValueExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#functionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionType(FParser.FunctionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#functionValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionValue(FParser.FunctionValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#closure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosure(FParser.ClosureContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(FParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(FParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#valuedMethodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuedMethodCall(FParser.ValuedMethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(FParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#reassignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReassignment(FParser.ReassignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(FParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#elseIfStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfStatement(FParser.ElseIfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#elseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStatement(FParser.ElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(FParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#loopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStatement(FParser.LoopStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(FParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(FParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#unsafeBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsafeBlock(FParser.UnsafeBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#dropletBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropletBlock(FParser.DropletBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#dropletVarModifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropletVarModifiers(FParser.DropletVarModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#dropletAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropletAssignment(FParser.DropletAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#dropletBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropletBody(FParser.DropletBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#dropletDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropletDecl(FParser.DropletDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#castType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastType(FParser.CastTypeContext ctx);
}