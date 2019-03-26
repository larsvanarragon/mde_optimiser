/**
 * generated by Xtext 2.16.0
 */
package uk.ac.kcl.inf.mdeoptimiser.languages.mopt;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rulegen Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.mdeoptimiser.languages.mopt.RulegenEdge#getNode <em>Node</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdeoptimiser.languages.mopt.RulegenEdge#getEdge <em>Edge</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdeoptimiser.languages.mopt.RulegenEdge#getGenerationRestriction <em>Generation Restriction</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.mdeoptimiser.languages.mopt.MoptPackage#getRulegenEdge()
 * @model
 * @generated
 */
public interface RulegenEdge extends EObject
{
  /**
   * Returns the value of the '<em><b>Node</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Node</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Node</em>' attribute.
   * @see #setNode(String)
   * @see uk.ac.kcl.inf.mdeoptimiser.languages.mopt.MoptPackage#getRulegenEdge_Node()
   * @model
   * @generated
   */
  String getNode();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.mdeoptimiser.languages.mopt.RulegenEdge#getNode <em>Node</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Node</em>' attribute.
   * @see #getNode()
   * @generated
   */
  void setNode(String value);

  /**
   * Returns the value of the '<em><b>Edge</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Edge</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Edge</em>' attribute.
   * @see #setEdge(String)
   * @see uk.ac.kcl.inf.mdeoptimiser.languages.mopt.MoptPackage#getRulegenEdge_Edge()
   * @model
   * @generated
   */
  String getEdge();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.mdeoptimiser.languages.mopt.RulegenEdge#getEdge <em>Edge</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Edge</em>' attribute.
   * @see #getEdge()
   * @generated
   */
  void setEdge(String value);

  /**
   * Returns the value of the '<em><b>Generation Restriction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Generation Restriction</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Generation Restriction</em>' attribute.
   * @see #setGenerationRestriction(String)
   * @see uk.ac.kcl.inf.mdeoptimiser.languages.mopt.MoptPackage#getRulegenEdge_GenerationRestriction()
   * @model
   * @generated
   */
  String getGenerationRestriction();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.mdeoptimiser.languages.mopt.RulegenEdge#getGenerationRestriction <em>Generation Restriction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Generation Restriction</em>' attribute.
   * @see #getGenerationRestriction()
   * @generated
   */
  void setGenerationRestriction(String value);

} // RulegenEdge
