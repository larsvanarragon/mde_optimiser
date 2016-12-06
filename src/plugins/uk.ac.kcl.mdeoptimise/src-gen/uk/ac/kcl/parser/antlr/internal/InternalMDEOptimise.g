/*
 * generated by Xtext 2.10.0
 */
grammar InternalMDEOptimise;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package uk.ac.kcl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package uk.ac.kcl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uk.ac.kcl.services.MDEOptimiseGrammarAccess;

}

@parser::members {

 	private MDEOptimiseGrammarAccess grammarAccess;

    public InternalMDEOptimiseParser(TokenStream input, MDEOptimiseGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Optimisation";
   	}

   	@Override
   	protected MDEOptimiseGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleOptimisation
entryRuleOptimisation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOptimisationRule()); }
	iv_ruleOptimisation=ruleOptimisation
	{ $current=$iv_ruleOptimisation.current; }
	EOF;

// Rule Optimisation
ruleOptimisation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getOptimisationAccess().getBasepathBasepathSpecParserRuleCall_0_0());
				}
				lv_basepath_0_0=ruleBasepathSpec
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getOptimisationRule());
					}
					set(
						$current,
						"basepath",
						lv_basepath_0_0,
						"uk.ac.kcl.MDEOptimise.BasepathSpec");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getOptimisationAccess().getMetamodelMetaModelSpecParserRuleCall_1_0());
				}
				lv_metamodel_1_0=ruleMetaModelSpec
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getOptimisationRule());
					}
					set(
						$current,
						"metamodel",
						lv_metamodel_1_0,
						"uk.ac.kcl.MDEOptimise.MetaModelSpec");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getOptimisationAccess().getObjectivesObjectiveInterpreterSpecParserRuleCall_2_0());
				}
				lv_objectives_2_0=ruleObjectiveInterpreterSpec
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getOptimisationRule());
					}
					add(
						$current,
						"objectives",
						lv_objectives_2_0,
						"uk.ac.kcl.MDEOptimise.ObjectiveInterpreterSpec");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		(
			(
				{
					newCompositeNode(grammarAccess.getOptimisationAccess().getConstraintsConstraintInterpreterSpecParserRuleCall_3_0());
				}
				lv_constraints_3_0=ruleConstraintInterpreterSpec
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getOptimisationRule());
					}
					add(
						$current,
						"constraints",
						lv_constraints_3_0,
						"uk.ac.kcl.MDEOptimise.ConstraintInterpreterSpec");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getOptimisationAccess().getEvolversEvolverSpecParserRuleCall_4_0());
				}
				lv_evolvers_4_0=ruleEvolverSpec
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getOptimisationRule());
					}
					add(
						$current,
						"evolvers",
						lv_evolvers_4_0,
						"uk.ac.kcl.MDEOptimise.EvolverSpec");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		(
			(
				{
					newCompositeNode(grammarAccess.getOptimisationAccess().getOptimisationOptimisationSpecParserRuleCall_5_0());
				}
				lv_optimisation_5_0=ruleOptimisationSpec
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getOptimisationRule());
					}
					set(
						$current,
						"optimisation",
						lv_optimisation_5_0,
						"uk.ac.kcl.MDEOptimise.OptimisationSpec");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleBasepathSpec
entryRuleBasepathSpec returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBasepathSpecRule()); }
	iv_ruleBasepathSpec=ruleBasepathSpec
	{ $current=$iv_ruleBasepathSpec.current; }
	EOF;

// Rule BasepathSpec
ruleBasepathSpec returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='basepath'
		{
			newLeafNode(otherlv_0, grammarAccess.getBasepathSpecAccess().getBasepathKeyword_0());
		}
		(
			(
				lv_location_1_0=RULE_URL
				{
					newLeafNode(lv_location_1_0, grammarAccess.getBasepathSpecAccess().getLocationURLTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBasepathSpecRule());
					}
					setWithLastConsumed(
						$current,
						"location",
						lv_location_1_0,
						"uk.ac.kcl.MDEOptimise.URL");
				}
			)
		)
	)
;

// Entry rule entryRuleMetaModelSpec
entryRuleMetaModelSpec returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMetaModelSpecRule()); }
	iv_ruleMetaModelSpec=ruleMetaModelSpec
	{ $current=$iv_ruleMetaModelSpec.current; }
	EOF;

// Rule MetaModelSpec
ruleMetaModelSpec returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='metamodel'
		{
			newLeafNode(otherlv_0, grammarAccess.getMetaModelSpecAccess().getMetamodelKeyword_0());
		}
		(
			(
				lv_location_1_0=RULE_URL
				{
					newLeafNode(lv_location_1_0, grammarAccess.getMetaModelSpecAccess().getLocationURLTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMetaModelSpecRule());
					}
					setWithLastConsumed(
						$current,
						"location",
						lv_location_1_0,
						"uk.ac.kcl.MDEOptimise.URL");
				}
			)
		)
	)
;

// Entry rule entryRuleObjectiveInterpreterSpec
entryRuleObjectiveInterpreterSpec returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getObjectiveInterpreterSpecRule()); }
	iv_ruleObjectiveInterpreterSpec=ruleObjectiveInterpreterSpec
	{ $current=$iv_ruleObjectiveInterpreterSpec.current; }
	EOF;

// Rule ObjectiveInterpreterSpec
ruleObjectiveInterpreterSpec returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='objective'
		{
			newLeafNode(otherlv_0, grammarAccess.getObjectiveInterpreterSpecAccess().getObjectiveKeyword_0());
		}
		(
			(
				lv_objectiveName_1_0=RULE_ENTITY_NAME
				{
					newLeafNode(lv_objectiveName_1_0, grammarAccess.getObjectiveInterpreterSpecAccess().getObjectiveNameENTITY_NAMETerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getObjectiveInterpreterSpecRule());
					}
					setWithLastConsumed(
						$current,
						"objectiveName",
						lv_objectiveName_1_0,
						"uk.ac.kcl.MDEOptimise.ENTITY_NAME");
				}
			)
		)
		(
			(
				lv_objectiveTendency_2_0=RULE_OBJECTIVE_TENDENCY
				{
					newLeafNode(lv_objectiveTendency_2_0, grammarAccess.getObjectiveInterpreterSpecAccess().getObjectiveTendencyOBJECTIVE_TENDENCYTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getObjectiveInterpreterSpecRule());
					}
					setWithLastConsumed(
						$current,
						"objectiveTendency",
						lv_objectiveTendency_2_0,
						"uk.ac.kcl.MDEOptimise.OBJECTIVE_TENDENCY");
				}
			)
		)
		(
			(
				lv_objectiveType_3_0=RULE_ENTITY_TYPE
				{
					newLeafNode(lv_objectiveType_3_0, grammarAccess.getObjectiveInterpreterSpecAccess().getObjectiveTypeENTITY_TYPETerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getObjectiveInterpreterSpecRule());
					}
					setWithLastConsumed(
						$current,
						"objectiveType",
						lv_objectiveType_3_0,
						"uk.ac.kcl.MDEOptimise.ENTITY_TYPE");
				}
			)
		)
		otherlv_4='{'
		{
			newLeafNode(otherlv_4, grammarAccess.getObjectiveInterpreterSpecAccess().getLeftCurlyBracketKeyword_4());
		}
		(
			(
				lv_objectiveSpec_5_0=RULE_STRING
				{
					newLeafNode(lv_objectiveSpec_5_0, grammarAccess.getObjectiveInterpreterSpecAccess().getObjectiveSpecSTRINGTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getObjectiveInterpreterSpecRule());
					}
					setWithLastConsumed(
						$current,
						"objectiveSpec",
						lv_objectiveSpec_5_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getObjectiveInterpreterSpecAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleConstraintInterpreterSpec
entryRuleConstraintInterpreterSpec returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConstraintInterpreterSpecRule()); }
	iv_ruleConstraintInterpreterSpec=ruleConstraintInterpreterSpec
	{ $current=$iv_ruleConstraintInterpreterSpec.current; }
	EOF;

// Rule ConstraintInterpreterSpec
ruleConstraintInterpreterSpec returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='constraint'
		{
			newLeafNode(otherlv_0, grammarAccess.getConstraintInterpreterSpecAccess().getConstraintKeyword_0());
		}
		(
			(
				lv_constraintName_1_0=RULE_ENTITY_NAME
				{
					newLeafNode(lv_constraintName_1_0, grammarAccess.getConstraintInterpreterSpecAccess().getConstraintNameENTITY_NAMETerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConstraintInterpreterSpecRule());
					}
					setWithLastConsumed(
						$current,
						"constraintName",
						lv_constraintName_1_0,
						"uk.ac.kcl.MDEOptimise.ENTITY_NAME");
				}
			)
		)
		(
			(
				lv_constraintType_2_0=RULE_ENTITY_TYPE
				{
					newLeafNode(lv_constraintType_2_0, grammarAccess.getConstraintInterpreterSpecAccess().getConstraintTypeENTITY_TYPETerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConstraintInterpreterSpecRule());
					}
					setWithLastConsumed(
						$current,
						"constraintType",
						lv_constraintType_2_0,
						"uk.ac.kcl.MDEOptimise.ENTITY_TYPE");
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getConstraintInterpreterSpecAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				lv_constraintSpec_4_0=RULE_STRING
				{
					newLeafNode(lv_constraintSpec_4_0, grammarAccess.getConstraintInterpreterSpecAccess().getConstraintSpecSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConstraintInterpreterSpecRule());
					}
					setWithLastConsumed(
						$current,
						"constraintSpec",
						lv_constraintSpec_4_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getConstraintInterpreterSpecAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleEvolverSpec
entryRuleEvolverSpec returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEvolverSpecRule()); }
	iv_ruleEvolverSpec=ruleEvolverSpec
	{ $current=$iv_ruleEvolverSpec.current; }
	EOF;

// Rule EvolverSpec
ruleEvolverSpec returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='evolve'
		{
			newLeafNode(otherlv_0, grammarAccess.getEvolverSpecAccess().getEvolveKeyword_0());
		}
		otherlv_1='using'
		{
			newLeafNode(otherlv_1, grammarAccess.getEvolverSpecAccess().getUsingKeyword_1());
		}
		(
			(
				lv_rule_location_2_0=RULE_URL
				{
					newLeafNode(lv_rule_location_2_0, grammarAccess.getEvolverSpecAccess().getRule_locationURLTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEvolverSpecRule());
					}
					setWithLastConsumed(
						$current,
						"rule_location",
						lv_rule_location_2_0,
						"uk.ac.kcl.MDEOptimise.URL");
				}
			)
		)
		otherlv_3='unit'
		{
			newLeafNode(otherlv_3, grammarAccess.getEvolverSpecAccess().getUnitKeyword_3());
		}
		(
			(
				lv_unit_4_0=RULE_STRING
				{
					newLeafNode(lv_unit_4_0, grammarAccess.getEvolverSpecAccess().getUnitSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEvolverSpecRule());
					}
					setWithLastConsumed(
						$current,
						"unit",
						lv_unit_4_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleOptimisationSpec
entryRuleOptimisationSpec returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOptimisationSpecRule()); }
	iv_ruleOptimisationSpec=ruleOptimisationSpec
	{ $current=$iv_ruleOptimisationSpec.current; }
	EOF;

// Rule OptimisationSpec
ruleOptimisationSpec returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='optimisation'
		{
			newLeafNode(otherlv_0, grammarAccess.getOptimisationSpecAccess().getOptimisationKeyword_0());
		}
		otherlv_1='provider'
		{
			newLeafNode(otherlv_1, grammarAccess.getOptimisationSpecAccess().getProviderKeyword_1());
		}
		(
			(
				lv_algorithmFactory_2_0=RULE_ALGORITHM_FACTORY
				{
					newLeafNode(lv_algorithmFactory_2_0, grammarAccess.getOptimisationSpecAccess().getAlgorithmFactoryALGORITHM_FACTORYTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOptimisationSpecRule());
					}
					setWithLastConsumed(
						$current,
						"algorithmFactory",
						lv_algorithmFactory_2_0,
						"uk.ac.kcl.MDEOptimise.ALGORITHM_FACTORY");
				}
			)
		)
		otherlv_3='algorithm'
		{
			newLeafNode(otherlv_3, grammarAccess.getOptimisationSpecAccess().getAlgorithmKeyword_3());
		}
		(
			(
				lv_algorithmName_4_0=RULE_ALGORITHM_NAME
				{
					newLeafNode(lv_algorithmName_4_0, grammarAccess.getOptimisationSpecAccess().getAlgorithmNameALGORITHM_NAMETerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOptimisationSpecRule());
					}
					setWithLastConsumed(
						$current,
						"algorithmName",
						lv_algorithmName_4_0,
						"uk.ac.kcl.MDEOptimise.ALGORITHM_NAME");
				}
			)
		)
		otherlv_5='evolutions'
		{
			newLeafNode(otherlv_5, grammarAccess.getOptimisationSpecAccess().getEvolutionsKeyword_5());
		}
		(
			(
				lv_algorithmEvolutions_6_0=RULE_INT
				{
					newLeafNode(lv_algorithmEvolutions_6_0, grammarAccess.getOptimisationSpecAccess().getAlgorithmEvolutionsINTTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOptimisationSpecRule());
					}
					setWithLastConsumed(
						$current,
						"algorithmEvolutions",
						lv_algorithmEvolutions_6_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_7='population'
		{
			newLeafNode(otherlv_7, grammarAccess.getOptimisationSpecAccess().getPopulationKeyword_7());
		}
		(
			(
				lv_algorithmPopulation_8_0=RULE_INT
				{
					newLeafNode(lv_algorithmPopulation_8_0, grammarAccess.getOptimisationSpecAccess().getAlgorithmPopulationINTTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOptimisationSpecRule());
					}
					setWithLastConsumed(
						$current,
						"algorithmPopulation",
						lv_algorithmPopulation_8_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

RULE_ALGORITHM_FACTORY : ('moea'|'ecj');

RULE_ALGORITHM_NAME : ('eMOEA'|'eNSGAII'|'NSGAII'|'NSGAIII'|'SPEA2');

RULE_URL : '<' ( options {greedy=false;} : . )*'>';

RULE_OBJECTIVE_TENDENCY : ('minimise'|'maximise');

RULE_ENTITY_TYPE : ('java'|'ocl');

RULE_ENTITY_NAME : ('a'..'z'|'A'..'Z')+;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
