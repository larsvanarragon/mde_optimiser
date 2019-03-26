/**
 * generated by Xtext 2.16.0
 */
package uk.ac.kcl.inf.mdeoptimiser.languages.mopt;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solver Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.mdeoptimiser.languages.mopt.SolverSpec#getSolverEngine <em>Solver Engine</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdeoptimiser.languages.mopt.SolverSpec#getAlgorithmFactory <em>Algorithm Factory</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdeoptimiser.languages.mopt.SolverSpec#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdeoptimiser.languages.mopt.SolverSpec#getTerminationCondition <em>Termination Condition</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdeoptimiser.languages.mopt.SolverSpec#getAlgorithmBatches <em>Algorithm Batches</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.mdeoptimiser.languages.mopt.MoptPackage#getSolverSpec()
 * @model
 * @generated
 */
public interface SolverSpec extends EObject
{
  /**
   * Returns the value of the '<em><b>Solver Engine</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Solver Engine</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Solver Engine</em>' attribute.
   * @see #setSolverEngine(String)
   * @see uk.ac.kcl.inf.mdeoptimiser.languages.mopt.MoptPackage#getSolverSpec_SolverEngine()
   * @model
   * @generated
   */
  String getSolverEngine();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.mdeoptimiser.languages.mopt.SolverSpec#getSolverEngine <em>Solver Engine</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Solver Engine</em>' attribute.
   * @see #getSolverEngine()
   * @generated
   */
  void setSolverEngine(String value);

  /**
   * Returns the value of the '<em><b>Algorithm Factory</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Algorithm Factory</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Algorithm Factory</em>' attribute.
   * @see #setAlgorithmFactory(String)
   * @see uk.ac.kcl.inf.mdeoptimiser.languages.mopt.MoptPackage#getSolverSpec_AlgorithmFactory()
   * @model
   * @generated
   */
  String getAlgorithmFactory();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.mdeoptimiser.languages.mopt.SolverSpec#getAlgorithmFactory <em>Algorithm Factory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Algorithm Factory</em>' attribute.
   * @see #getAlgorithmFactory()
   * @generated
   */
  void setAlgorithmFactory(String value);

  /**
   * Returns the value of the '<em><b>Algorithm</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Algorithm</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Algorithm</em>' containment reference.
   * @see #setAlgorithm(AlgorithmSpec)
   * @see uk.ac.kcl.inf.mdeoptimiser.languages.mopt.MoptPackage#getSolverSpec_Algorithm()
   * @model containment="true"
   * @generated
   */
  AlgorithmSpec getAlgorithm();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.mdeoptimiser.languages.mopt.SolverSpec#getAlgorithm <em>Algorithm</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Algorithm</em>' containment reference.
   * @see #getAlgorithm()
   * @generated
   */
  void setAlgorithm(AlgorithmSpec value);

  /**
   * Returns the value of the '<em><b>Termination Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Termination Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Termination Condition</em>' containment reference.
   * @see #setTerminationCondition(TerminationConditionSpec)
   * @see uk.ac.kcl.inf.mdeoptimiser.languages.mopt.MoptPackage#getSolverSpec_TerminationCondition()
   * @model containment="true"
   * @generated
   */
  TerminationConditionSpec getTerminationCondition();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.mdeoptimiser.languages.mopt.SolverSpec#getTerminationCondition <em>Termination Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Termination Condition</em>' containment reference.
   * @see #getTerminationCondition()
   * @generated
   */
  void setTerminationCondition(TerminationConditionSpec value);

  /**
   * Returns the value of the '<em><b>Algorithm Batches</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Algorithm Batches</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Algorithm Batches</em>' attribute.
   * @see #setAlgorithmBatches(int)
   * @see uk.ac.kcl.inf.mdeoptimiser.languages.mopt.MoptPackage#getSolverSpec_AlgorithmBatches()
   * @model
   * @generated
   */
  int getAlgorithmBatches();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.mdeoptimiser.languages.mopt.SolverSpec#getAlgorithmBatches <em>Algorithm Batches</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Algorithm Batches</em>' attribute.
   * @see #getAlgorithmBatches()
   * @generated
   */
  void setAlgorithmBatches(int value);

} // SolverSpec
