// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link fParser}.
 */
public interface fListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link fParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(fParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link fParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(fParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link fParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(fParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(fParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatement(fParser.SimpleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatement(fParser.SimpleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(fParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link fParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(fParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link fParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatements(fParser.BlockStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link fParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatements(fParser.BlockStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link fParser#assignmentstatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentstatement(fParser.AssignmentstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fParser#assignmentstatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentstatement(fParser.AssignmentstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fParser#variableassignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableassignment(fParser.VariableassignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link fParser#variableassignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableassignment(fParser.VariableassignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link fParser#flowvariableassignment}.
	 * @param ctx the parse tree
	 */
	void enterFlowvariableassignment(fParser.FlowvariableassignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link fParser#flowvariableassignment}.
	 * @param ctx the parse tree
	 */
	void exitFlowvariableassignment(fParser.FlowvariableassignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link fParser#declarationstatement}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationstatement(fParser.DeclarationstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fParser#declarationstatement}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationstatement(fParser.DeclarationstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fParser#variabledeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariabledeclaration(fParser.VariabledeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link fParser#variabledeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariabledeclaration(fParser.VariabledeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link fParser#functiondeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctiondeclaration(fParser.FunctiondeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link fParser#functiondeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctiondeclaration(fParser.FunctiondeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link fParser#annotatedvariabledeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotatedvariabledeclaration(fParser.AnnotatedvariabledeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link fParser#annotatedvariabledeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotatedvariabledeclaration(fParser.AnnotatedvariabledeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link fParser#initializationstatement}.
	 * @param ctx the parse tree
	 */
	void enterInitializationstatement(fParser.InitializationstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fParser#initializationstatement}.
	 * @param ctx the parse tree
	 */
	void exitInitializationstatement(fParser.InitializationstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fParser#variableinitialization}.
	 * @param ctx the parse tree
	 */
	void enterVariableinitialization(fParser.VariableinitializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link fParser#variableinitialization}.
	 * @param ctx the parse tree
	 */
	void exitVariableinitialization(fParser.VariableinitializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link fParser#annotatedvariableinitialization}.
	 * @param ctx the parse tree
	 */
	void enterAnnotatedvariableinitialization(fParser.AnnotatedvariableinitializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link fParser#annotatedvariableinitialization}.
	 * @param ctx the parse tree
	 */
	void exitAnnotatedvariableinitialization(fParser.AnnotatedvariableinitializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link fParser#flowvariableinitialization}.
	 * @param ctx the parse tree
	 */
	void enterFlowvariableinitialization(fParser.FlowvariableinitializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link fParser#flowvariableinitialization}.
	 * @param ctx the parse tree
	 */
	void exitFlowvariableinitialization(fParser.FlowvariableinitializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link fParser#annotatedflowvariableinitialization}.
	 * @param ctx the parse tree
	 */
	void enterAnnotatedflowvariableinitialization(fParser.AnnotatedflowvariableinitializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link fParser#annotatedflowvariableinitialization}.
	 * @param ctx the parse tree
	 */
	void exitAnnotatedflowvariableinitialization(fParser.AnnotatedflowvariableinitializationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqexpression}
	 * labeled alternative in {@link fParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void enterEqexpression(fParser.EqexpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqexpression}
	 * labeled alternative in {@link fParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void exitEqexpression(fParser.EqexpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusexpression}
	 * labeled alternative in {@link fParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void enterPlusexpression(fParser.PlusexpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusexpression}
	 * labeled alternative in {@link fParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void exitPlusexpression(fParser.PlusexpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valuetypevariableexpression}
	 * labeled alternative in {@link fParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void enterValuetypevariableexpression(fParser.ValuetypevariableexpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valuetypevariableexpression}
	 * labeled alternative in {@link fParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void exitValuetypevariableexpression(fParser.ValuetypevariableexpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lteexpression}
	 * labeled alternative in {@link fParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void enterLteexpression(fParser.LteexpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lteexpression}
	 * labeled alternative in {@link fParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void exitLteexpression(fParser.LteexpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minusexpression}
	 * labeled alternative in {@link fParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void enterMinusexpression(fParser.MinusexpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minusexpression}
	 * labeled alternative in {@link fParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void exitMinusexpression(fParser.MinusexpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gtexpression}
	 * labeled alternative in {@link fParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void enterGtexpression(fParser.GtexpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gtexpression}
	 * labeled alternative in {@link fParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void exitGtexpression(fParser.GtexpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divexpression}
	 * labeled alternative in {@link fParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void enterDivexpression(fParser.DivexpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divexpression}
	 * labeled alternative in {@link fParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void exitDivexpression(fParser.DivexpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notexpression}
	 * labeled alternative in {@link fParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void enterNotexpression(fParser.NotexpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notexpression}
	 * labeled alternative in {@link fParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void exitNotexpression(fParser.NotexpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gteexpression}
	 * labeled alternative in {@link fParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void enterGteexpression(fParser.GteexpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gteexpression}
	 * labeled alternative in {@link fParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void exitGteexpression(fParser.GteexpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decimalexpression}
	 * labeled alternative in {@link fParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void enterDecimalexpression(fParser.DecimalexpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decimalexpression}
	 * labeled alternative in {@link fParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void exitDecimalexpression(fParser.DecimalexpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringexpression}
	 * labeled alternative in {@link fParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void enterStringexpression(fParser.StringexpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringexpression}
	 * labeled alternative in {@link fParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void exitStringexpression(fParser.StringexpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressioninparentheses}
	 * labeled alternative in {@link fParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressioninparentheses(fParser.ExpressioninparenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressioninparentheses}
	 * labeled alternative in {@link fParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressioninparentheses(fParser.ExpressioninparenthesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orexpression}
	 * labeled alternative in {@link fParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void enterOrexpression(fParser.OrexpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orexpression}
	 * labeled alternative in {@link fParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void exitOrexpression(fParser.OrexpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code neqexpression}
	 * labeled alternative in {@link fParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void enterNeqexpression(fParser.NeqexpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code neqexpression}
	 * labeled alternative in {@link fParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void exitNeqexpression(fParser.NeqexpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andexpression}
	 * labeled alternative in {@link fParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void enterAndexpression(fParser.AndexpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andexpression}
	 * labeled alternative in {@link fParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void exitAndexpression(fParser.AndexpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code memberfunctioninvocationexpression}
	 * labeled alternative in {@link fParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void enterMemberfunctioninvocationexpression(fParser.MemberfunctioninvocationexpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code memberfunctioninvocationexpression}
	 * labeled alternative in {@link fParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void exitMemberfunctioninvocationexpression(fParser.MemberfunctioninvocationexpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulexpression}
	 * labeled alternative in {@link fParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void enterMulexpression(fParser.MulexpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulexpression}
	 * labeled alternative in {@link fParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void exitMulexpression(fParser.MulexpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ltexpression}
	 * labeled alternative in {@link fParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void enterLtexpression(fParser.LtexpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ltexpression}
	 * labeled alternative in {@link fParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void exitLtexpression(fParser.LtexpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code memberaccessexpression}
	 * labeled alternative in {@link fParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void enterMemberaccessexpression(fParser.MemberaccessexpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code memberaccessexpression}
	 * labeled alternative in {@link fParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void exitMemberaccessexpression(fParser.MemberaccessexpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerexpression}
	 * labeled alternative in {@link fParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void enterIntegerexpression(fParser.IntegerexpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerexpression}
	 * labeled alternative in {@link fParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void exitIntegerexpression(fParser.IntegerexpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classicfunctioninvocationexpression}
	 * labeled alternative in {@link fParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void enterClassicfunctioninvocationexpression(fParser.ClassicfunctioninvocationexpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classicfunctioninvocationexpression}
	 * labeled alternative in {@link fParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void exitClassicfunctioninvocationexpression(fParser.ClassicfunctioninvocationexpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code referencetypevariableexpression}
	 * labeled alternative in {@link fParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void enterReferencetypevariableexpression(fParser.ReferencetypevariableexpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code referencetypevariableexpression}
	 * labeled alternative in {@link fParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void exitReferencetypevariableexpression(fParser.ReferencetypevariableexpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolexpression}
	 * labeled alternative in {@link fParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void enterBoolexpression(fParser.BoolexpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolexpression}
	 * labeled alternative in {@link fParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void exitBoolexpression(fParser.BoolexpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pipefunctioninvocationexpression}
	 * labeled alternative in {@link fParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void enterPipefunctioninvocationexpression(fParser.PipefunctioninvocationexpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pipefunctioninvocationexpression}
	 * labeled alternative in {@link fParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void exitPipefunctioninvocationexpression(fParser.PipefunctioninvocationexpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code modexpression}
	 * labeled alternative in {@link fParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void enterModexpression(fParser.ModexpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code modexpression}
	 * labeled alternative in {@link fParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void exitModexpression(fParser.ModexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link fParser#keyvaluepair}.
	 * @param ctx the parse tree
	 */
	void enterKeyvaluepair(fParser.KeyvaluepairContext ctx);
	/**
	 * Exit a parse tree produced by {@link fParser#keyvaluepair}.
	 * @param ctx the parse tree
	 */
	void exitKeyvaluepair(fParser.KeyvaluepairContext ctx);
	/**
	 * Enter a parse tree produced by {@link fParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(fParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link fParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(fParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link fParser#definitionstatement}.
	 * @param ctx the parse tree
	 */
	void enterDefinitionstatement(fParser.DefinitionstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fParser#definitionstatement}.
	 * @param ctx the parse tree
	 */
	void exitDefinitionstatement(fParser.DefinitionstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fParser#functiondefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctiondefinition(fParser.FunctiondefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link fParser#functiondefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctiondefinition(fParser.FunctiondefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link fParser#classdefinition}.
	 * @param ctx the parse tree
	 */
	void enterClassdefinition(fParser.ClassdefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link fParser#classdefinition}.
	 * @param ctx the parse tree
	 */
	void exitClassdefinition(fParser.ClassdefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link fParser#interfacedefinition}.
	 * @param ctx the parse tree
	 */
	void enterInterfacedefinition(fParser.InterfacedefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link fParser#interfacedefinition}.
	 * @param ctx the parse tree
	 */
	void exitInterfacedefinition(fParser.InterfacedefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link fParser#controlflowstatement}.
	 * @param ctx the parse tree
	 */
	void enterControlflowstatement(fParser.ControlflowstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fParser#controlflowstatement}.
	 * @param ctx the parse tree
	 */
	void exitControlflowstatement(fParser.ControlflowstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void enterIfstatement(fParser.IfstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void exitIfstatement(fParser.IfstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fParser#elifstatement}.
	 * @param ctx the parse tree
	 */
	void enterElifstatement(fParser.ElifstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fParser#elifstatement}.
	 * @param ctx the parse tree
	 */
	void exitElifstatement(fParser.ElifstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fParser#elsestatement}.
	 * @param ctx the parse tree
	 */
	void enterElsestatement(fParser.ElsestatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fParser#elsestatement}.
	 * @param ctx the parse tree
	 */
	void exitElsestatement(fParser.ElsestatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fParser#whilestatement}.
	 * @param ctx the parse tree
	 */
	void enterWhilestatement(fParser.WhilestatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fParser#whilestatement}.
	 * @param ctx the parse tree
	 */
	void exitWhilestatement(fParser.WhilestatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(fParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link fParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(fParser.TypeContext ctx);
}