/*
 * generated by Xtext 2.25.0
 */
package br.unb.cic.obron.ide.ide.contentassist.antlr;

import br.unb.cic.obron.ide.ide.contentassist.antlr.internal.InternalOberonParser;
import br.unb.cic.obron.ide.services.OberonGrammarAccess;
import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class OberonParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(OberonGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, OberonGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getUserTypeDeclarationAccess().getAlternatives(), "rule__UserTypeDeclaration__Alternatives");
			builder.put(grammarAccess.getOperationAccess().getAlternatives(), "rule__Operation__Alternatives");
			builder.put(grammarAccess.getOperationAccess().getOperationRelacionalAlternatives_0_0(), "rule__Operation__OperationRelacionalAlternatives_0_0");
			builder.put(grammarAccess.getOperationAccess().getOperationAritmeticAlternatives_1_0(), "rule__Operation__OperationAritmeticAlternatives_1_0");
			builder.put(grammarAccess.getOperationAccess().getOperationLogicAlternatives_2_0(), "rule__Operation__OperationLogicAlternatives_2_0");
			builder.put(grammarAccess.getTExpressionAccess().getAlternatives(), "rule__TExpression__Alternatives");
			builder.put(grammarAccess.getTStatementAccess().getAlternatives(), "rule__TStatement__Alternatives");
			builder.put(grammarAccess.getDesignatorAccess().getAlternatives_1(), "rule__Designator__Alternatives_1");
			builder.put(grammarAccess.getOberonTypeAccess().getAlternatives(), "rule__OberonType__Alternatives");
			builder.put(grammarAccess.getBoolValueAccess().getAlternatives(), "rule__BoolValue__Alternatives");
			builder.put(grammarAccess.getOberonAccess().getGroup(), "rule__Oberon__Group__0");
			builder.put(grammarAccess.getBlockAccess().getGroup(), "rule__Block__Group__0");
			builder.put(grammarAccess.getDeclarationsAccess().getGroup(), "rule__Declarations__Group__0");
			builder.put(grammarAccess.getDeclarationsAccess().getGroup_1(), "rule__Declarations__Group_1__0");
			builder.put(grammarAccess.getDeclarationsAccess().getGroup_2(), "rule__Declarations__Group_2__0");
			builder.put(grammarAccess.getDeclarationsAccess().getGroup_3(), "rule__Declarations__Group_3__0");
			builder.put(grammarAccess.getUserTypeDeclarationAccess().getGroup_0(), "rule__UserTypeDeclaration__Group_0__0");
			builder.put(grammarAccess.getUserTypeDeclarationAccess().getGroup_0_2(), "rule__UserTypeDeclaration__Group_0_2__0");
			builder.put(grammarAccess.getUserTypeDeclarationAccess().getGroup_1(), "rule__UserTypeDeclaration__Group_1__0");
			builder.put(grammarAccess.getUserTypeDeclarationAccess().getGroup_1_2(), "rule__UserTypeDeclaration__Group_1_2__0");
			builder.put(grammarAccess.getConstantAccess().getGroup(), "rule__Constant__Group__0");
			builder.put(grammarAccess.getVarDeclarationAccess().getGroup(), "rule__VarDeclaration__Group__0");
			builder.put(grammarAccess.getVarDeclarationAccess().getGroup_0(), "rule__VarDeclaration__Group_0__0");
			builder.put(grammarAccess.getVarDeclarationAccess().getGroup_0_1(), "rule__VarDeclaration__Group_0_1__0");
			builder.put(grammarAccess.getProcedureAccess().getGroup(), "rule__Procedure__Group__0");
			builder.put(grammarAccess.getProcedureAccess().getGroup_5(), "rule__Procedure__Group_5__0");
			builder.put(grammarAccess.getFormalsAccess().getGroup(), "rule__Formals__Group__0");
			builder.put(grammarAccess.getFormalsAccess().getGroup_1(), "rule__Formals__Group_1__0");
			builder.put(grammarAccess.getFormalArgAccess().getGroup(), "rule__FormalArg__Group__0");
			builder.put(grammarAccess.getFormalArgAccess().getGroup_0(), "rule__FormalArg__Group_0__0");
			builder.put(grammarAccess.getFormalArgAccess().getGroup_0_1(), "rule__FormalArg__Group_0_1__0");
			builder.put(grammarAccess.getArgumentsAccess().getGroup(), "rule__Arguments__Group__0");
			builder.put(grammarAccess.getArgumentsAccess().getGroup_1(), "rule__Arguments__Group_1__0");
			builder.put(grammarAccess.getExpressionAccess().getGroup(), "rule__Expression__Group__0");
			builder.put(grammarAccess.getExpressionAccess().getGroup_1(), "rule__Expression__Group_1__0");
			builder.put(grammarAccess.getTExpressionAccess().getGroup_0(), "rule__TExpression__Group_0__0");
			builder.put(grammarAccess.getTExpressionAccess().getGroup_3(), "rule__TExpression__Group_3__0");
			builder.put(grammarAccess.getTExpressionAccess().getGroup_3_1(), "rule__TExpression__Group_3_1__0");
			builder.put(grammarAccess.getTExpressionAccess().getGroup_3_2(), "rule__TExpression__Group_3_2__0");
			builder.put(grammarAccess.getTExpressionAccess().getGroup_3_3(), "rule__TExpression__Group_3_3__0");
			builder.put(grammarAccess.getStatementAccess().getGroup(), "rule__Statement__Group__0");
			builder.put(grammarAccess.getStatementAccess().getGroup_1(), "rule__Statement__Group_1__0");
			builder.put(grammarAccess.getTStatementAccess().getGroup_0(), "rule__TStatement__Group_0__0");
			builder.put(grammarAccess.getTStatementAccess().getGroup_0_1(), "rule__TStatement__Group_0_1__0");
			builder.put(grammarAccess.getTStatementAccess().getGroup_1(), "rule__TStatement__Group_1__0");
			builder.put(grammarAccess.getTStatementAccess().getGroup_2(), "rule__TStatement__Group_2__0");
			builder.put(grammarAccess.getTStatementAccess().getGroup_3(), "rule__TStatement__Group_3__0");
			builder.put(grammarAccess.getTStatementAccess().getGroup_3_4(), "rule__TStatement__Group_3_4__0");
			builder.put(grammarAccess.getTStatementAccess().getGroup_3_5(), "rule__TStatement__Group_3_5__0");
			builder.put(grammarAccess.getTStatementAccess().getGroup_4(), "rule__TStatement__Group_4__0");
			builder.put(grammarAccess.getTStatementAccess().getGroup_5(), "rule__TStatement__Group_5__0");
			builder.put(grammarAccess.getTStatementAccess().getGroup_6(), "rule__TStatement__Group_6__0");
			builder.put(grammarAccess.getTStatementAccess().getGroup_7(), "rule__TStatement__Group_7__0");
			builder.put(grammarAccess.getTStatementAccess().getGroup_8(), "rule__TStatement__Group_8__0");
			builder.put(grammarAccess.getTStatementAccess().getGroup_9(), "rule__TStatement__Group_9__0");
			builder.put(grammarAccess.getTStatementAccess().getGroup_10(), "rule__TStatement__Group_10__0");
			builder.put(grammarAccess.getTStatementAccess().getGroup_10_4(), "rule__TStatement__Group_10_4__0");
			builder.put(grammarAccess.getTStatementAccess().getGroup_10_5(), "rule__TStatement__Group_10_5__0");
			builder.put(grammarAccess.getDesignatorAccess().getGroup(), "rule__Designator__Group__0");
			builder.put(grammarAccess.getDesignatorAccess().getGroup_1_0(), "rule__Designator__Group_1_0__0");
			builder.put(grammarAccess.getDesignatorAccess().getGroup_1_1(), "rule__Designator__Group_1_1__0");
			builder.put(grammarAccess.getTDesignatorAccess().getGroup(), "rule__TDesignator__Group__0");
			builder.put(grammarAccess.getTDesignatorAccess().getGroup_1(), "rule__TDesignator__Group_1__0");
			builder.put(grammarAccess.getCaseAlternativeAccess().getGroup(), "rule__CaseAlternative__Group__0");
			builder.put(grammarAccess.getCaseAlternativeAccess().getGroup_1(), "rule__CaseAlternative__Group_1__0");
			builder.put(grammarAccess.getElseIfStmtAccess().getGroup(), "rule__ElseIfStmt__Group__0");
			builder.put(grammarAccess.getOberonTypeAccess().getGroup_0(), "rule__OberonType__Group_0__0");
			builder.put(grammarAccess.getOberonTypeAccess().getGroup_1(), "rule__OberonType__Group_1__0");
			builder.put(grammarAccess.getOberonTypeAccess().getGroup_3(), "rule__OberonType__Group_3__0");
			builder.put(grammarAccess.getOberonAccess().getNameAssignment_1(), "rule__Oberon__NameAssignment_1");
			builder.put(grammarAccess.getOberonAccess().getDeclarationAssignment_3(), "rule__Oberon__DeclarationAssignment_3");
			builder.put(grammarAccess.getOberonAccess().getBlockAssignment_4(), "rule__Oberon__BlockAssignment_4");
			builder.put(grammarAccess.getBlockAccess().getStmtAssignment_2(), "rule__Block__StmtAssignment_2");
			builder.put(grammarAccess.getDeclarationsAccess().getTypesAssignment_1_1(), "rule__Declarations__TypesAssignment_1_1");
			builder.put(grammarAccess.getDeclarationsAccess().getConstsAssignment_2_1(), "rule__Declarations__ConstsAssignment_2_1");
			builder.put(grammarAccess.getDeclarationsAccess().getVarsAssignment_3_1(), "rule__Declarations__VarsAssignment_3_1");
			builder.put(grammarAccess.getDeclarationsAccess().getProcAssignment_4(), "rule__Declarations__ProcAssignment_4");
			builder.put(grammarAccess.getUserTypeDeclarationAccess().getNameTypeAssignment_0_0(), "rule__UserTypeDeclaration__NameTypeAssignment_0_0");
			builder.put(grammarAccess.getUserTypeDeclarationAccess().getLengthAssignment_0_2_1(), "rule__UserTypeDeclaration__LengthAssignment_0_2_1");
			builder.put(grammarAccess.getUserTypeDeclarationAccess().getVartypeAssignment_0_2_3(), "rule__UserTypeDeclaration__VartypeAssignment_0_2_3");
			builder.put(grammarAccess.getUserTypeDeclarationAccess().getNameTypeAssignment_1_0(), "rule__UserTypeDeclaration__NameTypeAssignment_1_0");
			builder.put(grammarAccess.getUserTypeDeclarationAccess().getVarsAssignment_1_2_1(), "rule__UserTypeDeclaration__VarsAssignment_1_2_1");
			builder.put(grammarAccess.getConstantAccess().getConstNameAssignment_0(), "rule__Constant__ConstNameAssignment_0");
			builder.put(grammarAccess.getConstantAccess().getExpAssignment_2(), "rule__Constant__ExpAssignment_2");
			builder.put(grammarAccess.getVarDeclarationAccess().getVarsAssignment_0_0(), "rule__VarDeclaration__VarsAssignment_0_0");
			builder.put(grammarAccess.getVarDeclarationAccess().getVarsAssignment_0_1_1(), "rule__VarDeclaration__VarsAssignment_0_1_1");
			builder.put(grammarAccess.getVarDeclarationAccess().getVarTypeAssignment_2(), "rule__VarDeclaration__VarTypeAssignment_2");
			builder.put(grammarAccess.getProcedureAccess().getNameAssignment_1(), "rule__Procedure__NameAssignment_1");
			builder.put(grammarAccess.getProcedureAccess().getFormalsAssignment_3(), "rule__Procedure__FormalsAssignment_3");
			builder.put(grammarAccess.getProcedureAccess().getProcedureTypeAssignment_5_1(), "rule__Procedure__ProcedureTypeAssignment_5_1");
			builder.put(grammarAccess.getProcedureAccess().getDeclAssignment_7(), "rule__Procedure__DeclAssignment_7");
			builder.put(grammarAccess.getProcedureAccess().getBlockAssignment_8(), "rule__Procedure__BlockAssignment_8");
			builder.put(grammarAccess.getFormalsAccess().getArgAssignment_0(), "rule__Formals__ArgAssignment_0");
			builder.put(grammarAccess.getFormalsAccess().getArgsAssignment_1_1(), "rule__Formals__ArgsAssignment_1_1");
			builder.put(grammarAccess.getFormalArgAccess().getArgsAssignment_0_0(), "rule__FormalArg__ArgsAssignment_0_0");
			builder.put(grammarAccess.getFormalArgAccess().getArgsAssignment_0_1_1(), "rule__FormalArg__ArgsAssignment_0_1_1");
			builder.put(grammarAccess.getFormalArgAccess().getArgTypeAssignment_2(), "rule__FormalArg__ArgTypeAssignment_2");
			builder.put(grammarAccess.getArgumentsAccess().getExpAssignment_0(), "rule__Arguments__ExpAssignment_0");
			builder.put(grammarAccess.getArgumentsAccess().getExpsAssignment_1_1(), "rule__Arguments__ExpsAssignment_1_1");
			builder.put(grammarAccess.getExpressionAccess().getLeftAssignment_0(), "rule__Expression__LeftAssignment_0");
			builder.put(grammarAccess.getExpressionAccess().getOprAssignment_1_0(), "rule__Expression__OprAssignment_1_0");
			builder.put(grammarAccess.getExpressionAccess().getRightAssignment_1_1(), "rule__Expression__RightAssignment_1_1");
			builder.put(grammarAccess.getOperationAccess().getOperationRelacionalAssignment_0(), "rule__Operation__OperationRelacionalAssignment_0");
			builder.put(grammarAccess.getOperationAccess().getOperationAritmeticAssignment_1(), "rule__Operation__OperationAritmeticAssignment_1");
			builder.put(grammarAccess.getOperationAccess().getOperationLogicAssignment_2(), "rule__Operation__OperationLogicAssignment_2");
			builder.put(grammarAccess.getTExpressionAccess().getExpAssignment_0_1(), "rule__TExpression__ExpAssignment_0_1");
			builder.put(grammarAccess.getTExpressionAccess().getIntvalueAssignment_1(), "rule__TExpression__IntvalueAssignment_1");
			builder.put(grammarAccess.getTExpressionAccess().getBoolvalueAssignment_2(), "rule__TExpression__BoolvalueAssignment_2");
			builder.put(grammarAccess.getTExpressionAccess().getNameAssignment_3_0(), "rule__TExpression__NameAssignment_3_0");
			builder.put(grammarAccess.getTExpressionAccess().getArgsAssignment_3_1_1(), "rule__TExpression__ArgsAssignment_3_1_1");
			builder.put(grammarAccess.getTExpressionAccess().getAtribsAssignment_3_2_1(), "rule__TExpression__AtribsAssignment_3_2_1");
			builder.put(grammarAccess.getTExpressionAccess().getIndexAssignment_3_3_1(), "rule__TExpression__IndexAssignment_3_3_1");
			builder.put(grammarAccess.getStatementAccess().getStmtAssignment_0(), "rule__Statement__StmtAssignment_0");
			builder.put(grammarAccess.getStatementAccess().getStmtsAssignment_1_1(), "rule__Statement__StmtsAssignment_1_1");
			builder.put(grammarAccess.getTStatementAccess().getDesAssignment_0_0(), "rule__TStatement__DesAssignment_0_0");
			builder.put(grammarAccess.getTStatementAccess().getExpAssignment_0_1_1(), "rule__TStatement__ExpAssignment_0_1_1");
			builder.put(grammarAccess.getTStatementAccess().getVarAssignment_1_2(), "rule__TStatement__VarAssignment_1_2");
			builder.put(grammarAccess.getTStatementAccess().getExpAssignment_2_2(), "rule__TStatement__ExpAssignment_2_2");
			builder.put(grammarAccess.getTStatementAccess().getCondAssignment_3_1(), "rule__TStatement__CondAssignment_3_1");
			builder.put(grammarAccess.getTStatementAccess().getThenStmtAssignment_3_3(), "rule__TStatement__ThenStmtAssignment_3_3");
			builder.put(grammarAccess.getTStatementAccess().getElsifsAssignment_3_4_1(), "rule__TStatement__ElsifsAssignment_3_4_1");
			builder.put(grammarAccess.getTStatementAccess().getElseStmtAssignment_3_5_1(), "rule__TStatement__ElseStmtAssignment_3_5_1");
			builder.put(grammarAccess.getTStatementAccess().getCondAssignment_4_1(), "rule__TStatement__CondAssignment_4_1");
			builder.put(grammarAccess.getTStatementAccess().getStmtAssignment_4_3(), "rule__TStatement__StmtAssignment_4_3");
			builder.put(grammarAccess.getTStatementAccess().getStmtAssignment_5_1(), "rule__TStatement__StmtAssignment_5_1");
			builder.put(grammarAccess.getTStatementAccess().getCondAssignment_5_3(), "rule__TStatement__CondAssignment_5_3");
			builder.put(grammarAccess.getTStatementAccess().getInitAssignment_6_1(), "rule__TStatement__InitAssignment_6_1");
			builder.put(grammarAccess.getTStatementAccess().getConditionAssignment_6_3(), "rule__TStatement__ConditionAssignment_6_3");
			builder.put(grammarAccess.getTStatementAccess().getStmtAssignment_6_5(), "rule__TStatement__StmtAssignment_6_5");
			builder.put(grammarAccess.getTStatementAccess().getVarAssignment_7_1(), "rule__TStatement__VarAssignment_7_1");
			builder.put(grammarAccess.getTStatementAccess().getMinAssignment_7_3(), "rule__TStatement__MinAssignment_7_3");
			builder.put(grammarAccess.getTStatementAccess().getMaxAssignment_7_5(), "rule__TStatement__MaxAssignment_7_5");
			builder.put(grammarAccess.getTStatementAccess().getStmtAssignment_7_7(), "rule__TStatement__StmtAssignment_7_7");
			builder.put(grammarAccess.getTStatementAccess().getStmtAssignment_8_1(), "rule__TStatement__StmtAssignment_8_1");
			builder.put(grammarAccess.getTStatementAccess().getExpAssignment_9_1(), "rule__TStatement__ExpAssignment_9_1");
			builder.put(grammarAccess.getTStatementAccess().getExpAssignment_10_1(), "rule__TStatement__ExpAssignment_10_1");
			builder.put(grammarAccess.getTStatementAccess().getCaseAssignment_10_3(), "rule__TStatement__CaseAssignment_10_3");
			builder.put(grammarAccess.getTStatementAccess().getCasesAssignment_10_4_1(), "rule__TStatement__CasesAssignment_10_4_1");
			builder.put(grammarAccess.getTStatementAccess().getElseStmtAssignment_10_5_1(), "rule__TStatement__ElseStmtAssignment_10_5_1");
			builder.put(grammarAccess.getTStatementAccess().getExitAssignment_11(), "rule__TStatement__ExitAssignment_11");
			builder.put(grammarAccess.getDesignatorAccess().getDesignatorAssignment_0(), "rule__Designator__DesignatorAssignment_0");
			builder.put(grammarAccess.getDesignatorAccess().getIndexesAssignment_1_0_1(), "rule__Designator__IndexesAssignment_1_0_1");
			builder.put(grammarAccess.getDesignatorAccess().getAtribsAssignment_1_1_1(), "rule__Designator__AtribsAssignment_1_1_1");
			builder.put(grammarAccess.getTDesignatorAccess().getNameAssignment_0(), "rule__TDesignator__NameAssignment_0");
			builder.put(grammarAccess.getTDesignatorAccess().getArgsAssignment_1_1(), "rule__TDesignator__ArgsAssignment_1_1");
			builder.put(grammarAccess.getCaseAlternativeAccess().getExpAssignment_0(), "rule__CaseAlternative__ExpAssignment_0");
			builder.put(grammarAccess.getCaseAlternativeAccess().getMaxAssignment_1_1(), "rule__CaseAlternative__MaxAssignment_1_1");
			builder.put(grammarAccess.getCaseAlternativeAccess().getStmtAssignment_3(), "rule__CaseAlternative__StmtAssignment_3");
			builder.put(grammarAccess.getElseIfStmtAccess().getCondAssignment_0(), "rule__ElseIfStmt__CondAssignment_0");
			builder.put(grammarAccess.getElseIfStmtAccess().getStmtAssignment_2(), "rule__ElseIfStmt__StmtAssignment_2");
			builder.put(grammarAccess.getOberonTypeAccess().getNameAssignment_2(), "rule__OberonType__NameAssignment_2");
			builder.put(grammarAccess.getOberonTypeAccess().getNumElementAssignment_3_1(), "rule__OberonType__NumElementAssignment_3_1");
			builder.put(grammarAccess.getOberonTypeAccess().getNameTypeAssignment_3_3(), "rule__OberonType__NameTypeAssignment_3_3");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private OberonGrammarAccess grammarAccess;

	@Override
	protected InternalOberonParser createParser() {
		InternalOberonParser result = new InternalOberonParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public OberonGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(OberonGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}