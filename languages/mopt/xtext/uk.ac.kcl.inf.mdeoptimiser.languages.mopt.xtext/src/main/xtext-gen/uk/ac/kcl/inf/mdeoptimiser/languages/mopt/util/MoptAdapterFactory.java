/**
 * generated by Xtext 2.16.0
 */
package uk.ac.kcl.inf.mdeoptimiser.languages.mopt.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import uk.ac.kcl.inf.mdeoptimiser.languages.mopt.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.inf.mdeoptimiser.languages.mopt.MoptPackage
 * @generated
 */
public class MoptAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MoptPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MoptAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = MoptPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MoptSwitch<Adapter> modelSwitch =
    new MoptSwitch<Adapter>()
    {
      @Override
      public Adapter caseOptimisation(Optimisation object)
      {
        return createOptimisationAdapter();
      }
      @Override
      public Adapter caseProblemSpec(ProblemSpec object)
      {
        return createProblemSpecAdapter();
      }
      @Override
      public Adapter caseGoalSpec(GoalSpec object)
      {
        return createGoalSpecAdapter();
      }
      @Override
      public Adapter caseSearchSpec(SearchSpec object)
      {
        return createSearchSpecAdapter();
      }
      @Override
      public Adapter caseSolverSpec(SolverSpec object)
      {
        return createSolverSpecAdapter();
      }
      @Override
      public Adapter caseBasePathSpec(BasePathSpec object)
      {
        return createBasePathSpecAdapter();
      }
      @Override
      public Adapter caseMetaModelSpec(MetaModelSpec object)
      {
        return createMetaModelSpecAdapter();
      }
      @Override
      public Adapter caseModelPathSpec(ModelPathSpec object)
      {
        return createModelPathSpecAdapter();
      }
      @Override
      public Adapter caseObjectiveInterpreterSpec(ObjectiveInterpreterSpec object)
      {
        return createObjectiveInterpreterSpecAdapter();
      }
      @Override
      public Adapter caseConstraintInterpreterSpec(ConstraintInterpreterSpec object)
      {
        return createConstraintInterpreterSpecAdapter();
      }
      @Override
      public Adapter caseModelInitialiserSpec(ModelInitialiserSpec object)
      {
        return createModelInitialiserSpecAdapter();
      }
      @Override
      public Adapter caseRulegenSpec(RulegenSpec object)
      {
        return createRulegenSpecAdapter();
      }
      @Override
      public Adapter caseRulegenNode(RulegenNode object)
      {
        return createRulegenNodeAdapter();
      }
      @Override
      public Adapter caseRulegenEdge(RulegenEdge object)
      {
        return createRulegenEdgeAdapter();
      }
      @Override
      public Adapter caseReportInterpreterSpec(ReportInterpreterSpec object)
      {
        return createReportInterpreterSpecAdapter();
      }
      @Override
      public Adapter caseEvolverSpec(EvolverSpec object)
      {
        return createEvolverSpecAdapter();
      }
      @Override
      public Adapter caseMultiplicityRefinementSpec(MultiplicityRefinementSpec object)
      {
        return createMultiplicityRefinementSpecAdapter();
      }
      @Override
      public Adapter caseEvolverParameter(EvolverParameter object)
      {
        return createEvolverParameterAdapter();
      }
      @Override
      public Adapter caseParameterFunction(ParameterFunction object)
      {
        return createParameterFunctionAdapter();
      }
      @Override
      public Adapter caseAlgorithmSpec(AlgorithmSpec object)
      {
        return createAlgorithmSpecAdapter();
      }
      @Override
      public Adapter caseTerminationConditionSpec(TerminationConditionSpec object)
      {
        return createTerminationConditionSpecAdapter();
      }
      @Override
      public Adapter caseParameter(Parameter object)
      {
        return createParameterAdapter();
      }
      @Override
      public Adapter caseParameterValue(ParameterValue object)
      {
        return createParameterValueAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.mdeoptimiser.languages.mopt.Optimisation <em>Optimisation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.mdeoptimiser.languages.mopt.Optimisation
   * @generated
   */
  public Adapter createOptimisationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.mdeoptimiser.languages.mopt.ProblemSpec <em>Problem Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.mdeoptimiser.languages.mopt.ProblemSpec
   * @generated
   */
  public Adapter createProblemSpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.mdeoptimiser.languages.mopt.GoalSpec <em>Goal Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.mdeoptimiser.languages.mopt.GoalSpec
   * @generated
   */
  public Adapter createGoalSpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.mdeoptimiser.languages.mopt.SearchSpec <em>Search Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.mdeoptimiser.languages.mopt.SearchSpec
   * @generated
   */
  public Adapter createSearchSpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.mdeoptimiser.languages.mopt.SolverSpec <em>Solver Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.mdeoptimiser.languages.mopt.SolverSpec
   * @generated
   */
  public Adapter createSolverSpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.mdeoptimiser.languages.mopt.BasePathSpec <em>Base Path Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.mdeoptimiser.languages.mopt.BasePathSpec
   * @generated
   */
  public Adapter createBasePathSpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.mdeoptimiser.languages.mopt.MetaModelSpec <em>Meta Model Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.mdeoptimiser.languages.mopt.MetaModelSpec
   * @generated
   */
  public Adapter createMetaModelSpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.mdeoptimiser.languages.mopt.ModelPathSpec <em>Model Path Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.mdeoptimiser.languages.mopt.ModelPathSpec
   * @generated
   */
  public Adapter createModelPathSpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.mdeoptimiser.languages.mopt.ObjectiveInterpreterSpec <em>Objective Interpreter Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.mdeoptimiser.languages.mopt.ObjectiveInterpreterSpec
   * @generated
   */
  public Adapter createObjectiveInterpreterSpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.mdeoptimiser.languages.mopt.ConstraintInterpreterSpec <em>Constraint Interpreter Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.mdeoptimiser.languages.mopt.ConstraintInterpreterSpec
   * @generated
   */
  public Adapter createConstraintInterpreterSpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.mdeoptimiser.languages.mopt.ModelInitialiserSpec <em>Model Initialiser Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.mdeoptimiser.languages.mopt.ModelInitialiserSpec
   * @generated
   */
  public Adapter createModelInitialiserSpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.mdeoptimiser.languages.mopt.RulegenSpec <em>Rulegen Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.mdeoptimiser.languages.mopt.RulegenSpec
   * @generated
   */
  public Adapter createRulegenSpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.mdeoptimiser.languages.mopt.RulegenNode <em>Rulegen Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.mdeoptimiser.languages.mopt.RulegenNode
   * @generated
   */
  public Adapter createRulegenNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.mdeoptimiser.languages.mopt.RulegenEdge <em>Rulegen Edge</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.mdeoptimiser.languages.mopt.RulegenEdge
   * @generated
   */
  public Adapter createRulegenEdgeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.mdeoptimiser.languages.mopt.ReportInterpreterSpec <em>Report Interpreter Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.mdeoptimiser.languages.mopt.ReportInterpreterSpec
   * @generated
   */
  public Adapter createReportInterpreterSpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.mdeoptimiser.languages.mopt.EvolverSpec <em>Evolver Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.mdeoptimiser.languages.mopt.EvolverSpec
   * @generated
   */
  public Adapter createEvolverSpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.mdeoptimiser.languages.mopt.MultiplicityRefinementSpec <em>Multiplicity Refinement Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.mdeoptimiser.languages.mopt.MultiplicityRefinementSpec
   * @generated
   */
  public Adapter createMultiplicityRefinementSpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.mdeoptimiser.languages.mopt.EvolverParameter <em>Evolver Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.mdeoptimiser.languages.mopt.EvolverParameter
   * @generated
   */
  public Adapter createEvolverParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.mdeoptimiser.languages.mopt.ParameterFunction <em>Parameter Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.mdeoptimiser.languages.mopt.ParameterFunction
   * @generated
   */
  public Adapter createParameterFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.mdeoptimiser.languages.mopt.AlgorithmSpec <em>Algorithm Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.mdeoptimiser.languages.mopt.AlgorithmSpec
   * @generated
   */
  public Adapter createAlgorithmSpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.mdeoptimiser.languages.mopt.TerminationConditionSpec <em>Termination Condition Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.mdeoptimiser.languages.mopt.TerminationConditionSpec
   * @generated
   */
  public Adapter createTerminationConditionSpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.mdeoptimiser.languages.mopt.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.mdeoptimiser.languages.mopt.Parameter
   * @generated
   */
  public Adapter createParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.mdeoptimiser.languages.mopt.ParameterValue <em>Parameter Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.mdeoptimiser.languages.mopt.ParameterValue
   * @generated
   */
  public Adapter createParameterValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //MoptAdapterFactory
