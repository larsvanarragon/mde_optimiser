/**
 * generated by Xtext 2.17.0
 */
package uk.ac.kcl.inf.mdeoptimiser.languages.mopt.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.kcl.inf.mdeoptimiser.languages.mopt.EvolverSpec;
import uk.ac.kcl.inf.mdeoptimiser.languages.mopt.MoptPackage;
import uk.ac.kcl.inf.mdeoptimiser.languages.mopt.ReportInterpreterSpec;
import uk.ac.kcl.inf.mdeoptimiser.languages.mopt.RulegenSpec;
import uk.ac.kcl.inf.mdeoptimiser.languages.mopt.SearchSpec;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Search Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.mdeoptimiser.languages.mopt.impl.SearchSpecImpl#getReports <em>Reports</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdeoptimiser.languages.mopt.impl.SearchSpecImpl#getEvolvers <em>Evolvers</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdeoptimiser.languages.mopt.impl.SearchSpecImpl#getRulegen <em>Rulegen</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SearchSpecImpl extends MinimalEObjectImpl.Container implements SearchSpec
{
  /**
   * The cached value of the '{@link #getReports() <em>Reports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReports()
   * @generated
   * @ordered
   */
  protected EList<ReportInterpreterSpec> reports;

  /**
   * The cached value of the '{@link #getEvolvers() <em>Evolvers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvolvers()
   * @generated
   * @ordered
   */
  protected EList<EvolverSpec> evolvers;

  /**
   * The cached value of the '{@link #getRulegen() <em>Rulegen</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRulegen()
   * @generated
   * @ordered
   */
  protected EList<RulegenSpec> rulegen;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SearchSpecImpl()
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
    return MoptPackage.Literals.SEARCH_SPEC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ReportInterpreterSpec> getReports()
  {
    if (reports == null)
    {
      reports = new EObjectContainmentEList<ReportInterpreterSpec>(ReportInterpreterSpec.class, this, MoptPackage.SEARCH_SPEC__REPORTS);
    }
    return reports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EvolverSpec> getEvolvers()
  {
    if (evolvers == null)
    {
      evolvers = new EObjectContainmentEList<EvolverSpec>(EvolverSpec.class, this, MoptPackage.SEARCH_SPEC__EVOLVERS);
    }
    return evolvers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RulegenSpec> getRulegen()
  {
    if (rulegen == null)
    {
      rulegen = new EObjectContainmentEList<RulegenSpec>(RulegenSpec.class, this, MoptPackage.SEARCH_SPEC__RULEGEN);
    }
    return rulegen;
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
      case MoptPackage.SEARCH_SPEC__REPORTS:
        return ((InternalEList<?>)getReports()).basicRemove(otherEnd, msgs);
      case MoptPackage.SEARCH_SPEC__EVOLVERS:
        return ((InternalEList<?>)getEvolvers()).basicRemove(otherEnd, msgs);
      case MoptPackage.SEARCH_SPEC__RULEGEN:
        return ((InternalEList<?>)getRulegen()).basicRemove(otherEnd, msgs);
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
      case MoptPackage.SEARCH_SPEC__REPORTS:
        return getReports();
      case MoptPackage.SEARCH_SPEC__EVOLVERS:
        return getEvolvers();
      case MoptPackage.SEARCH_SPEC__RULEGEN:
        return getRulegen();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MoptPackage.SEARCH_SPEC__REPORTS:
        getReports().clear();
        getReports().addAll((Collection<? extends ReportInterpreterSpec>)newValue);
        return;
      case MoptPackage.SEARCH_SPEC__EVOLVERS:
        getEvolvers().clear();
        getEvolvers().addAll((Collection<? extends EvolverSpec>)newValue);
        return;
      case MoptPackage.SEARCH_SPEC__RULEGEN:
        getRulegen().clear();
        getRulegen().addAll((Collection<? extends RulegenSpec>)newValue);
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
      case MoptPackage.SEARCH_SPEC__REPORTS:
        getReports().clear();
        return;
      case MoptPackage.SEARCH_SPEC__EVOLVERS:
        getEvolvers().clear();
        return;
      case MoptPackage.SEARCH_SPEC__RULEGEN:
        getRulegen().clear();
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
      case MoptPackage.SEARCH_SPEC__REPORTS:
        return reports != null && !reports.isEmpty();
      case MoptPackage.SEARCH_SPEC__EVOLVERS:
        return evolvers != null && !evolvers.isEmpty();
      case MoptPackage.SEARCH_SPEC__RULEGEN:
        return rulegen != null && !rulegen.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SearchSpecImpl
