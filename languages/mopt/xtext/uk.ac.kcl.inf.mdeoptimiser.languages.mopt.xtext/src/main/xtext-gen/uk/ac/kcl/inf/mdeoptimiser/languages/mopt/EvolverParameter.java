/**
 * generated by Xtext 2.17.0
 */
package uk.ac.kcl.inf.mdeoptimiser.languages.mopt;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evolver Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.mdeoptimiser.languages.mopt.EvolverParameter#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdeoptimiser.languages.mopt.EvolverParameter#getFunction <em>Function</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdeoptimiser.languages.mopt.EvolverParameter#getCustomFunction <em>Custom Function</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.mdeoptimiser.languages.mopt.MoptPackage#getEvolverParameter()
 * @model
 * @generated
 */
public interface EvolverParameter extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see uk.ac.kcl.inf.mdeoptimiser.languages.mopt.MoptPackage#getEvolverParameter_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.mdeoptimiser.languages.mopt.EvolverParameter#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Function</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function</em>' containment reference.
   * @see #setFunction(ParameterFunction)
   * @see uk.ac.kcl.inf.mdeoptimiser.languages.mopt.MoptPackage#getEvolverParameter_Function()
   * @model containment="true"
   * @generated
   */
  ParameterFunction getFunction();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.mdeoptimiser.languages.mopt.EvolverParameter#getFunction <em>Function</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function</em>' containment reference.
   * @see #getFunction()
   * @generated
   */
  void setFunction(ParameterFunction value);

  /**
   * Returns the value of the '<em><b>Custom Function</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Custom Function</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Custom Function</em>' attribute.
   * @see #setCustomFunction(String)
   * @see uk.ac.kcl.inf.mdeoptimiser.languages.mopt.MoptPackage#getEvolverParameter_CustomFunction()
   * @model
   * @generated
   */
  String getCustomFunction();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.mdeoptimiser.languages.mopt.EvolverParameter#getCustomFunction <em>Custom Function</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Custom Function</em>' attribute.
   * @see #getCustomFunction()
   * @generated
   */
  void setCustomFunction(String value);

} // EvolverParameter
