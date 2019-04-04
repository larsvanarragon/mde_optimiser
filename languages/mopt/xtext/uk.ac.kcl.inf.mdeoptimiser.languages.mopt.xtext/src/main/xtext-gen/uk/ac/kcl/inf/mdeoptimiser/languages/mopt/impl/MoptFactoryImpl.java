/**
 * generated by Xtext 2.17.0
 */
package uk.ac.kcl.inf.mdeoptimiser.languages.mopt.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.kcl.inf.mdeoptimiser.languages.mopt.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MoptFactoryImpl extends EFactoryImpl implements MoptFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MoptFactory init()
  {
    try
    {
      MoptFactory theMoptFactory = (MoptFactory)EPackage.Registry.INSTANCE.getEFactory(MoptPackage.eNS_URI);
      if (theMoptFactory != null)
      {
        return theMoptFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MoptFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MoptFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MoptPackage.OPTIMISATION: return createOptimisation();
      case MoptPackage.PROBLEM_SPEC: return createProblemSpec();
      case MoptPackage.GOAL_SPEC: return createGoalSpec();
      case MoptPackage.SEARCH_SPEC: return createSearchSpec();
      case MoptPackage.SOLVER_SPEC: return createSolverSpec();
      case MoptPackage.BASE_PATH_SPEC: return createBasePathSpec();
      case MoptPackage.META_MODEL_SPEC: return createMetaModelSpec();
      case MoptPackage.MODEL_PATH_SPEC: return createModelPathSpec();
      case MoptPackage.OBJECTIVE_INTERPRETER_SPEC: return createObjectiveInterpreterSpec();
      case MoptPackage.CONSTRAINT_INTERPRETER_SPEC: return createConstraintInterpreterSpec();
      case MoptPackage.MODEL_INITIALISER_SPEC: return createModelInitialiserSpec();
      case MoptPackage.RULEGEN_SPEC: return createRulegenSpec();
      case MoptPackage.RULEGEN_NODE: return createRulegenNode();
      case MoptPackage.RULEGEN_EDGE: return createRulegenEdge();
      case MoptPackage.REPORT_INTERPRETER_SPEC: return createReportInterpreterSpec();
      case MoptPackage.EVOLVER_SPEC: return createEvolverSpec();
      case MoptPackage.MULTIPLICITY_REFINEMENT_SPEC: return createMultiplicityRefinementSpec();
      case MoptPackage.EVOLVER_PARAMETER: return createEvolverParameter();
      case MoptPackage.PARAMETER_FUNCTION: return createParameterFunction();
      case MoptPackage.ALGORITHM_SPEC: return createAlgorithmSpec();
      case MoptPackage.TERMINATION_CONDITION_SPEC: return createTerminationConditionSpec();
      case MoptPackage.PARAMETER: return createParameter();
      case MoptPackage.PARAMETER_VALUE: return createParameterValue();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case MoptPackage.EVOLVER_TYPE:
        return createEvolverTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case MoptPackage.EVOLVER_TYPE:
        return convertEvolverTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Optimisation createOptimisation()
  {
    OptimisationImpl optimisation = new OptimisationImpl();
    return optimisation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProblemSpec createProblemSpec()
  {
    ProblemSpecImpl problemSpec = new ProblemSpecImpl();
    return problemSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GoalSpec createGoalSpec()
  {
    GoalSpecImpl goalSpec = new GoalSpecImpl();
    return goalSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SearchSpec createSearchSpec()
  {
    SearchSpecImpl searchSpec = new SearchSpecImpl();
    return searchSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SolverSpec createSolverSpec()
  {
    SolverSpecImpl solverSpec = new SolverSpecImpl();
    return solverSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasePathSpec createBasePathSpec()
  {
    BasePathSpecImpl basePathSpec = new BasePathSpecImpl();
    return basePathSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetaModelSpec createMetaModelSpec()
  {
    MetaModelSpecImpl metaModelSpec = new MetaModelSpecImpl();
    return metaModelSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelPathSpec createModelPathSpec()
  {
    ModelPathSpecImpl modelPathSpec = new ModelPathSpecImpl();
    return modelPathSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectiveInterpreterSpec createObjectiveInterpreterSpec()
  {
    ObjectiveInterpreterSpecImpl objectiveInterpreterSpec = new ObjectiveInterpreterSpecImpl();
    return objectiveInterpreterSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstraintInterpreterSpec createConstraintInterpreterSpec()
  {
    ConstraintInterpreterSpecImpl constraintInterpreterSpec = new ConstraintInterpreterSpecImpl();
    return constraintInterpreterSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelInitialiserSpec createModelInitialiserSpec()
  {
    ModelInitialiserSpecImpl modelInitialiserSpec = new ModelInitialiserSpecImpl();
    return modelInitialiserSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RulegenSpec createRulegenSpec()
  {
    RulegenSpecImpl rulegenSpec = new RulegenSpecImpl();
    return rulegenSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RulegenNode createRulegenNode()
  {
    RulegenNodeImpl rulegenNode = new RulegenNodeImpl();
    return rulegenNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RulegenEdge createRulegenEdge()
  {
    RulegenEdgeImpl rulegenEdge = new RulegenEdgeImpl();
    return rulegenEdge;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReportInterpreterSpec createReportInterpreterSpec()
  {
    ReportInterpreterSpecImpl reportInterpreterSpec = new ReportInterpreterSpecImpl();
    return reportInterpreterSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EvolverSpec createEvolverSpec()
  {
    EvolverSpecImpl evolverSpec = new EvolverSpecImpl();
    return evolverSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiplicityRefinementSpec createMultiplicityRefinementSpec()
  {
    MultiplicityRefinementSpecImpl multiplicityRefinementSpec = new MultiplicityRefinementSpecImpl();
    return multiplicityRefinementSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EvolverParameter createEvolverParameter()
  {
    EvolverParameterImpl evolverParameter = new EvolverParameterImpl();
    return evolverParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterFunction createParameterFunction()
  {
    ParameterFunctionImpl parameterFunction = new ParameterFunctionImpl();
    return parameterFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlgorithmSpec createAlgorithmSpec()
  {
    AlgorithmSpecImpl algorithmSpec = new AlgorithmSpecImpl();
    return algorithmSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TerminationConditionSpec createTerminationConditionSpec()
  {
    TerminationConditionSpecImpl terminationConditionSpec = new TerminationConditionSpecImpl();
    return terminationConditionSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterValue createParameterValue()
  {
    ParameterValueImpl parameterValue = new ParameterValueImpl();
    return parameterValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EvolverType createEvolverTypeFromString(EDataType eDataType, String initialValue)
  {
    EvolverType result = EvolverType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertEvolverTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MoptPackage getMoptPackage()
  {
    return (MoptPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MoptPackage getPackage()
  {
    return MoptPackage.eINSTANCE;
  }

} //MoptFactoryImpl
