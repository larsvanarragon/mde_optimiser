/**
 * generated by Xtext 2.10.0
 */
package uk.ac.kcl.mdeoptimise.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import uk.ac.kcl.mdeoptimise.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.mdeoptimise.MdeoptimisePackage
 * @generated
 */
public class MdeoptimiseAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MdeoptimisePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MdeoptimiseAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = MdeoptimisePackage.eINSTANCE;
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
  protected MdeoptimiseSwitch<Adapter> modelSwitch =
    new MdeoptimiseSwitch<Adapter>()
    {
      @Override
      public Adapter caseOptimisation(Optimisation object)
      {
        return createOptimisationAdapter();
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
      public Adapter caseOptimisationSpec(OptimisationSpec object)
      {
        return createOptimisationSpecAdapter();
      }
      @Override
      public Adapter caseAlgorithmVariation(AlgorithmVariation object)
      {
        return createAlgorithmVariationAdapter();
      }
      @Override
      public Adapter caseProbabilityVariation(ProbabilityVariation object)
      {
        return createProbabilityVariationAdapter();
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
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.mdeoptimise.Optimisation <em>Optimisation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.mdeoptimise.Optimisation
   * @generated
   */
  public Adapter createOptimisationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.mdeoptimise.BasePathSpec <em>Base Path Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.mdeoptimise.BasePathSpec
   * @generated
   */
  public Adapter createBasePathSpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.mdeoptimise.MetaModelSpec <em>Meta Model Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.mdeoptimise.MetaModelSpec
   * @generated
   */
  public Adapter createMetaModelSpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.mdeoptimise.ModelPathSpec <em>Model Path Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.mdeoptimise.ModelPathSpec
   * @generated
   */
  public Adapter createModelPathSpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.mdeoptimise.ObjectiveInterpreterSpec <em>Objective Interpreter Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.mdeoptimise.ObjectiveInterpreterSpec
   * @generated
   */
  public Adapter createObjectiveInterpreterSpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.mdeoptimise.ConstraintInterpreterSpec <em>Constraint Interpreter Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.mdeoptimise.ConstraintInterpreterSpec
   * @generated
   */
  public Adapter createConstraintInterpreterSpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.mdeoptimise.RulegenSpec <em>Rulegen Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.mdeoptimise.RulegenSpec
   * @generated
   */
  public Adapter createRulegenSpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.mdeoptimise.RulegenNode <em>Rulegen Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.mdeoptimise.RulegenNode
   * @generated
   */
  public Adapter createRulegenNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.mdeoptimise.RulegenEdge <em>Rulegen Edge</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.mdeoptimise.RulegenEdge
   * @generated
   */
  public Adapter createRulegenEdgeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.mdeoptimise.ReportInterpreterSpec <em>Report Interpreter Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.mdeoptimise.ReportInterpreterSpec
   * @generated
   */
  public Adapter createReportInterpreterSpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.mdeoptimise.EvolverSpec <em>Evolver Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.mdeoptimise.EvolverSpec
   * @generated
   */
  public Adapter createEvolverSpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.mdeoptimise.MultiplicityRefinementSpec <em>Multiplicity Refinement Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.mdeoptimise.MultiplicityRefinementSpec
   * @generated
   */
  public Adapter createMultiplicityRefinementSpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.mdeoptimise.EvolverParameter <em>Evolver Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.mdeoptimise.EvolverParameter
   * @generated
   */
  public Adapter createEvolverParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.mdeoptimise.ParameterFunction <em>Parameter Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.mdeoptimise.ParameterFunction
   * @generated
   */
  public Adapter createParameterFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.mdeoptimise.OptimisationSpec <em>Optimisation Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.mdeoptimise.OptimisationSpec
   * @generated
   */
  public Adapter createOptimisationSpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.mdeoptimise.AlgorithmVariation <em>Algorithm Variation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.mdeoptimise.AlgorithmVariation
   * @generated
   */
  public Adapter createAlgorithmVariationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.mdeoptimise.ProbabilityVariation <em>Probability Variation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.mdeoptimise.ProbabilityVariation
   * @generated
   */
  public Adapter createProbabilityVariationAdapter()
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

} //MdeoptimiseAdapterFactory
