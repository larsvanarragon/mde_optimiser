/**
 * generated by Xtext 2.16.0
 */
package uk.ac.kcl.inf.mdeoptimiser.languages.mopt.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uk.ac.kcl.inf.mdeoptimiser.languages.mopt.EvolverParameter;
import uk.ac.kcl.inf.mdeoptimiser.languages.mopt.MoptPackage;
import uk.ac.kcl.inf.mdeoptimiser.languages.mopt.ParameterFunction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evolver Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.mdeoptimiser.languages.mopt.impl.EvolverParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdeoptimiser.languages.mopt.impl.EvolverParameterImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdeoptimiser.languages.mopt.impl.EvolverParameterImpl#getCustomFunction <em>Custom Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvolverParameterImpl extends MinimalEObjectImpl.Container implements EvolverParameter
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getFunction() <em>Function</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunction()
   * @generated
   * @ordered
   */
  protected ParameterFunction function;

  /**
   * The default value of the '{@link #getCustomFunction() <em>Custom Function</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCustomFunction()
   * @generated
   * @ordered
   */
  protected static final String CUSTOM_FUNCTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCustomFunction() <em>Custom Function</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCustomFunction()
   * @generated
   * @ordered
   */
  protected String customFunction = CUSTOM_FUNCTION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EvolverParameterImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MoptPackage.Literals.EVOLVER_PARAMETER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MoptPackage.EVOLVER_PARAMETER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterFunction getFunction()
  {
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFunction(ParameterFunction newFunction, NotificationChain msgs)
  {
    ParameterFunction oldFunction = function;
    function = newFunction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MoptPackage.EVOLVER_PARAMETER__FUNCTION, oldFunction, newFunction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunction(ParameterFunction newFunction)
  {
    if (newFunction != function)
    {
      NotificationChain msgs = null;
      if (function != null)
        msgs = ((InternalEObject)function).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MoptPackage.EVOLVER_PARAMETER__FUNCTION, null, msgs);
      if (newFunction != null)
        msgs = ((InternalEObject)newFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MoptPackage.EVOLVER_PARAMETER__FUNCTION, null, msgs);
      msgs = basicSetFunction(newFunction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MoptPackage.EVOLVER_PARAMETER__FUNCTION, newFunction, newFunction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCustomFunction()
  {
    return customFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCustomFunction(String newCustomFunction)
  {
    String oldCustomFunction = customFunction;
    customFunction = newCustomFunction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MoptPackage.EVOLVER_PARAMETER__CUSTOM_FUNCTION, oldCustomFunction, customFunction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MoptPackage.EVOLVER_PARAMETER__FUNCTION:
        return basicSetFunction(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MoptPackage.EVOLVER_PARAMETER__NAME:
        return getName();
      case MoptPackage.EVOLVER_PARAMETER__FUNCTION:
        return getFunction();
      case MoptPackage.EVOLVER_PARAMETER__CUSTOM_FUNCTION:
        return getCustomFunction();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MoptPackage.EVOLVER_PARAMETER__NAME:
        setName((String)newValue);
        return;
      case MoptPackage.EVOLVER_PARAMETER__FUNCTION:
        setFunction((ParameterFunction)newValue);
        return;
      case MoptPackage.EVOLVER_PARAMETER__CUSTOM_FUNCTION:
        setCustomFunction((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MoptPackage.EVOLVER_PARAMETER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MoptPackage.EVOLVER_PARAMETER__FUNCTION:
        setFunction((ParameterFunction)null);
        return;
      case MoptPackage.EVOLVER_PARAMETER__CUSTOM_FUNCTION:
        setCustomFunction(CUSTOM_FUNCTION_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MoptPackage.EVOLVER_PARAMETER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MoptPackage.EVOLVER_PARAMETER__FUNCTION:
        return function != null;
      case MoptPackage.EVOLVER_PARAMETER__CUSTOM_FUNCTION:
        return CUSTOM_FUNCTION_EDEFAULT == null ? customFunction != null : !CUSTOM_FUNCTION_EDEFAULT.equals(customFunction);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", customFunction: ");
    result.append(customFunction);
    result.append(')');
    return result.toString();
  }

} //EvolverParameterImpl
