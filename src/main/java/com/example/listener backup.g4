package com.example;

import java.util.ArrayList;
import java.util.List;

// Generated from java-escape by ANTLR 4.11.1

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * This class provides an empty implementation of {@link fListener},
 * which can be extended to create a listener which only needs to handle a
 * subset
 * of the available methods.
 */
@SuppressWarnings("CheckReturnValue")
public class fBaseListener implements fListener {

	// @Override
	// public void exitVarDecl(fParser.VarDeclContext ctx) {
	// String type = ctx.TYPE().getText();
	// String name = ctx.ID().getText();
	// String value = ctx.expr().getText();

	// builder.append(String.format("%s %s = %s;\n", type, name, value));
	// }
	private StringBuilder builder = new StringBuilder();

	public String getJavaCode() {
		return builder.toString();
	}

	public String decideType(String type) {
		if(type.equals("num")){
			type = "double";
		}
		else if(type.equals("bool")){
			type = "boolean";
		}
		else if(type.equals("str")){
			type = "String";
		}
		else if(type.equals("[]")){
			type = "List";
		}
		else if(type.equals("{}")){
			type = "Map";
		}
		else if(type.equals("any")){
			type = "Object";
		}	
		return type;
	}


	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterProgram(fParser.ProgramContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitProgram(fParser.ProgramContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterStatement(fParser.StatementContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitStatement(fParser.StatementContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterSimpleStatement(fParser.SimpleStatementContext ctx) {

	}

	@Override
	public void exitSimpleStatement(fParser.SimpleStatementContext ctx) {
		builder.append(";");
	}

	@Override
	public void enterBlock(fParser.BlockContext ctx) {
		builder.append("{");
	}

	@Override
	public void exitBlock(fParser.BlockContext ctx) {
		builder.append("}");
	}

	@Override
	public void enterBlockStatements(fParser.BlockStatementsContext ctx) {

	}

	@Override
	public void exitBlockStatements(fParser.BlockStatementsContext ctx) {

	}

	@Override
	public void enterAssignmentstatement(fParser.AssignmentstatementContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */

	@Override
	public void exitAssignmentstatement(fParser.AssignmentstatementContext ctx) {
	}

	@Override
	public void enterVariableassignment(fParser.VariableassignmentContext ctx) {
		// variableassignment: IDENTIFIER ASSIGN expressionstatement;
		// x=5
		String identifier = ctx.IDENTIFIER().getText();
		String assign = ctx.ASSIGN().getText();

		builder.append(String.format("%s %s ", identifier, assign));
	}

	@Override
	public void exitVariableassignment(fParser.VariableassignmentContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterFlowvariableassignment(fParser.FlowvariableassignmentContext ctx) {
		// flowvariableassignment: expressionstatement NEWLINE? FLOWASSIGN NEWLINE?
		// IDENTIFIER;
		// 5|>>x
		String flowassign = ctx.FLOWASSIGN().getText();
		String assign = "=";
		String identifier = ctx.IDENTIFIER().getText();

		builder.append(String.format("%s %s ", identifier, assign));
	}

	@Override
	public void exitFlowvariableassignment(fParser.FlowvariableassignmentContext ctx) {

	}

	@Override
	public void enterDeclarationstatement(fParser.DeclarationstatementContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitDeclarationstatement(fParser.DeclarationstatementContext ctx) {
	}

	@Override
	public void enterVariabledeclaration(fParser.VariabledeclarationContext ctx) {
		// variabledeclaration : type IDENTIFIER;
		// num x
		String type = ctx.type().getText();
		String identifier = ctx.IDENTIFIER().getText();

		// if num -> double , if bool -> boolean , if str -> String , if [] -> List , if
		// {} -> Map, if any -> Object
		type = this.decideType(type);

		builder.append(String.format("%s %s ", type, identifier));
	}

	@Override
	public void exitVariabledeclaration(fParser.VariabledeclarationContext ctx) {

	}

	@Override
	public void enterFunctiondeclaration(fParser.FunctiondeclarationContext ctx) {

	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitFunctiondeclaration(fParser.FunctiondeclarationContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterAnnotatedvariabledeclaration(fParser.AnnotatedvariabledeclarationContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitAnnotatedvariabledeclaration(fParser.AnnotatedvariabledeclarationContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterInitializationstatement(fParser.InitializationstatementContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitInitializationstatement(fParser.InitializationstatementContext ctx) {
	}

	@Override
	public void enterVariableinitialization(fParser.VariableinitializationContext ctx) {
		// variableinitialization :
		// type IDENTIFIER ASSIGN expressionstatement;
		// num x = 5
		String type = ctx.type().getText();
		String identifier = ctx.IDENTIFIER().getText();
		String assign = ctx.ASSIGN().getText();

		type = this.decideType(type);

		builder.append(String.format("%s %s %s ", type, identifier, assign));
	}

	@Override
	public void exitVariableinitialization(fParser.VariableinitializationContext ctx) {

	}

	@Override
	public void enterAnnotatedvariableinitialization(fParser.AnnotatedvariableinitializationContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitAnnotatedvariableinitialization(fParser.AnnotatedvariableinitializationContext ctx) {

	}

	@Override
	public void enterFlowvariableinitialization(fParser.FlowvariableinitializationContext ctx) {
		// flowvariableinitialization:
		// expressionstatement NEWLINE? FLOWASSIGN NEWLINE? type IDENTIFIER;
		// 5 |>> num x
		String flowassign = ctx.FLOWASSIGN().getText();
		String assign = "=";
		String type = ctx.type().getText();
		String identifier = ctx.IDENTIFIER().getText();

		type = this.decideType(type);

		builder.append(String.format("%s %s %s ", type, identifier, assign));
	}

	@Override
	public void exitFlowvariableinitialization(fParser.FlowvariableinitializationContext ctx) {
	}

	@Override
	public void enterAnnotatedflowvariableinitialization(fParser.AnnotatedflowvariableinitializationContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitAnnotatedflowvariableinitialization(fParser.AnnotatedflowvariableinitializationContext ctx) {

	}

	@Override
	public void enterEqexpression(fParser.EqexpressionContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitEqexpression(fParser.EqexpressionContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterEmptyarrayexpression(fParser.EmptyarrayexpressionContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitEmptyarrayexpression(fParser.EmptyarrayexpressionContext ctx) {
		// java dynamic array
		builder.append("new ArrayList()");
	}

	@Override
	public void enterArrayaccessexpression(fParser.ArrayaccessexpressionContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitArrayaccessexpression(fParser.ArrayaccessexpressionContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterPlusexpression(fParser.PlusexpressionContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitPlusexpression(fParser.PlusexpressionContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterLteexpression(fParser.LteexpressionContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitLteexpression(fParser.LteexpressionContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterEmptymapexpression(fParser.EmptymapexpressionContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitEmptymapexpression(fParser.EmptymapexpressionContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterMinusexpression(fParser.MinusexpressionContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitMinusexpression(fParser.MinusexpressionContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterGtexpression(fParser.GtexpressionContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitGtexpression(fParser.GtexpressionContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterDivexpression(fParser.DivexpressionContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitDivexpression(fParser.DivexpressionContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterNotexpression(fParser.NotexpressionContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitNotexpression(fParser.NotexpressionContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterGteexpression(fParser.GteexpressionContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitGteexpression(fParser.GteexpressionContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterDecimalexpression(fParser.DecimalexpressionContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitDecimalexpression(fParser.DecimalexpressionContext ctx) {
		builder.append(ctx.getText());
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterStringexpression(fParser.StringexpressionContext ctx) {

	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitStringexpression(fParser.StringexpressionContext ctx) {
		builder.append(ctx.getText());
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterExpressioninparentheses(fParser.ExpressioninparenthesesContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitExpressioninparentheses(fParser.ExpressioninparenthesesContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterOrexpression(fParser.OrexpressionContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitOrexpression(fParser.OrexpressionContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterNeqexpression(fParser.NeqexpressionContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitNeqexpression(fParser.NeqexpressionContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterAndexpression(fParser.AndexpressionContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitAndexpression(fParser.AndexpressionContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterMapaccessexpression(fParser.MapaccessexpressionContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitMapaccessexpression(fParser.MapaccessexpressionContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterArrayliteralexpression(fParser.ArrayliteralexpressionContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitArrayliteralexpression(fParser.ArrayliteralexpressionContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterMulexpression(fParser.MulexpressionContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitMulexpression(fParser.MulexpressionContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterLtexpression(fParser.LtexpressionContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitLtexpression(fParser.LtexpressionContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterMemberaccessexpression(fParser.MemberaccessexpressionContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitMemberaccessexpression(fParser.MemberaccessexpressionContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterIntegerexpression(fParser.IntegerexpressionContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitIntegerexpression(fParser.IntegerexpressionContext ctx) {
		builder.append(ctx.getText());
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterClassicfunctioninvocationexpression(fParser.ClassicfunctioninvocationexpressionContext ctx) {
		//IDENTIFIER LPAREN (expressionstatement (',' expressionstatement)*)? RPAREN
		builder.append(ctx.IDENTIFIER().getText());
		builder.append("(");

	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitClassicfunctioninvocationexpression(fParser.ClassicfunctioninvocationexpressionContext ctx) {
		builder.append(")");
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterBoolexpression(fParser.BoolexpressionContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitBoolexpression(fParser.BoolexpressionContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterPipefunctioninvocationexpression(fParser.PipefunctioninvocationexpressionContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitPipefunctioninvocationexpression(fParser.PipefunctioninvocationexpressionContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterModexpression(fParser.ModexpressionContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitModexpression(fParser.ModexpressionContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterVariableexpression(fParser.VariableexpressionContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitVariableexpression(fParser.VariableexpressionContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterMapliteralexpression(fParser.MapliteralexpressionContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitMapliteralexpression(fParser.MapliteralexpressionContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterDefinitionstatement(fParser.DefinitionstatementContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitDefinitionstatement(fParser.DefinitionstatementContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterFunctiondefinition(fParser.FunctiondefinitionContext ctx) {
		// (DEF|PRIVDEF|PRIVOVERRIDENDEF|OVERRIDENDEF) IDENTIFIER LPAREN (type
		// IDENTIFIER (COMMA type IDENTIFIER)*)? RPAREN RETURNTYPESIGN type block;

		String name = ctx.IDENTIFIER(0).getText();

		String visibility = ctx.getChild(0).getText();
		if (visibility.equals(ctx.DEF().getText())) {
			visibility = "public";
		} else if (visibility.equals(ctx.PRIVDEF().getText())) {
			visibility = "private";
		} else if (visibility.equals(ctx.PRIVOVERRIDENDEF().getText())) {
			visibility = "@Override private";
		} else if (visibility.equals(ctx.OVERRIDENDEF().getText())) {
			visibility = "@Override public";
		}

		List<String> parametersWithTypes = new ArrayList<String>();

		for (int i = 1; i < ctx.type().size(); i++) {
			parametersWithTypes.add(decideType(ctx.type(i).getText())  + " " + ctx.IDENTIFIER(i).getText());
		}

		String returnType = ctx.type(0).getText();
		returnType= decideType(returnType);

		builder.append(visibility + " " + returnType + " " + name + "("
			+ String.join(", ", parametersWithTypes) + ")");
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitFunctiondefinition(fParser.FunctiondefinitionContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterClassdefinition(fParser.ClassdefinitionContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitClassdefinition(fParser.ClassdefinitionContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterInterfacedefinition(fParser.InterfacedefinitionContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitInterfacedefinition(fParser.InterfacedefinitionContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterControlflowstatement(fParser.ControlflowstatementContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitControlflowstatement(fParser.ControlflowstatementContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterIfstatement(fParser.IfstatementContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitIfstatement(fParser.IfstatementContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterElifstatement(fParser.ElifstatementContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitElifstatement(fParser.ElifstatementContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterElsestatement(fParser.ElsestatementContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitElsestatement(fParser.ElsestatementContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterWhilestatement(fParser.WhilestatementContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitWhilestatement(fParser.WhilestatementContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterType(fParser.TypeContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitType(fParser.TypeContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterEveryRule(ParserRuleContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitEveryRule(ParserRuleContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void visitTerminal(TerminalNode node) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void visitErrorNode(ErrorNode node) {
	}
}