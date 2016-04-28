/**
 */
package org.eclipse.xtext.botlib.dsl.botDuino.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.eclipse.xtext.botlib.dsl.botDuino.BotDuinoPackage;
import org.eclipse.xtext.botlib.dsl.botDuino.CTRL;
import org.eclipse.xtext.botlib.dsl.botDuino.CTRLRule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CTRL Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.botlib.dsl.botDuino.impl.CTRLRuleImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.eclipse.xtext.botlib.dsl.botDuino.impl.CTRLRuleImpl#getCtrlActions <em>Ctrl Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CTRLRuleImpl extends RulesImpl implements CTRLRule
{
  /**
   * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperType()
   * @generated
   * @ordered
   */
  protected CTRL superType;

  /**
   * The cached value of the '{@link #getCtrlActions() <em>Ctrl Actions</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCtrlActions()
   * @generated
   * @ordered
   */
  protected EList<String> ctrlActions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CTRLRuleImpl()
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
    return BotDuinoPackage.Literals.CTRL_RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CTRL getSuperType()
  {
    if (superType != null && superType.eIsProxy())
    {
      InternalEObject oldSuperType = (InternalEObject)superType;
      superType = (CTRL)eResolveProxy(oldSuperType);
      if (superType != oldSuperType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BotDuinoPackage.CTRL_RULE__SUPER_TYPE, oldSuperType, superType));
      }
    }
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CTRL basicGetSuperType()
  {
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuperType(CTRL newSuperType)
  {
    CTRL oldSuperType = superType;
    superType = newSuperType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BotDuinoPackage.CTRL_RULE__SUPER_TYPE, oldSuperType, superType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getCtrlActions()
  {
    if (ctrlActions == null)
    {
      ctrlActions = new EDataTypeEList<String>(String.class, this, BotDuinoPackage.CTRL_RULE__CTRL_ACTIONS);
    }
    return ctrlActions;
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
      case BotDuinoPackage.CTRL_RULE__SUPER_TYPE:
        if (resolve) return getSuperType();
        return basicGetSuperType();
      case BotDuinoPackage.CTRL_RULE__CTRL_ACTIONS:
        return getCtrlActions();
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
      case BotDuinoPackage.CTRL_RULE__SUPER_TYPE:
        setSuperType((CTRL)newValue);
        return;
      case BotDuinoPackage.CTRL_RULE__CTRL_ACTIONS:
        getCtrlActions().clear();
        getCtrlActions().addAll((Collection<? extends String>)newValue);
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
      case BotDuinoPackage.CTRL_RULE__SUPER_TYPE:
        setSuperType((CTRL)null);
        return;
      case BotDuinoPackage.CTRL_RULE__CTRL_ACTIONS:
        getCtrlActions().clear();
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
      case BotDuinoPackage.CTRL_RULE__SUPER_TYPE:
        return superType != null;
      case BotDuinoPackage.CTRL_RULE__CTRL_ACTIONS:
        return ctrlActions != null && !ctrlActions.isEmpty();
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
    result.append(" (ctrlActions: ");
    result.append(ctrlActions);
    result.append(')');
    return result.toString();
  }

} //CTRLRuleImpl
