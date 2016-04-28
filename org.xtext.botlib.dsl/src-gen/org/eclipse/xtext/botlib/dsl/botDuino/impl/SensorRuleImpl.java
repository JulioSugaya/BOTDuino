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
import org.eclipse.xtext.botlib.dsl.botDuino.Sensor;
import org.eclipse.xtext.botlib.dsl.botDuino.SensorRule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.botlib.dsl.botDuino.impl.SensorRuleImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.eclipse.xtext.botlib.dsl.botDuino.impl.SensorRuleImpl#getSensorActions <em>Sensor Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SensorRuleImpl extends RulesImpl implements SensorRule
{
  /**
   * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperType()
   * @generated
   * @ordered
   */
  protected Sensor superType;

  /**
   * The cached value of the '{@link #getSensorActions() <em>Sensor Actions</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSensorActions()
   * @generated
   * @ordered
   */
  protected EList<String> sensorActions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SensorRuleImpl()
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
    return BotDuinoPackage.Literals.SENSOR_RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sensor getSuperType()
  {
    if (superType != null && superType.eIsProxy())
    {
      InternalEObject oldSuperType = (InternalEObject)superType;
      superType = (Sensor)eResolveProxy(oldSuperType);
      if (superType != oldSuperType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BotDuinoPackage.SENSOR_RULE__SUPER_TYPE, oldSuperType, superType));
      }
    }
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sensor basicGetSuperType()
  {
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuperType(Sensor newSuperType)
  {
    Sensor oldSuperType = superType;
    superType = newSuperType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BotDuinoPackage.SENSOR_RULE__SUPER_TYPE, oldSuperType, superType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getSensorActions()
  {
    if (sensorActions == null)
    {
      sensorActions = new EDataTypeEList<String>(String.class, this, BotDuinoPackage.SENSOR_RULE__SENSOR_ACTIONS);
    }
    return sensorActions;
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
      case BotDuinoPackage.SENSOR_RULE__SUPER_TYPE:
        if (resolve) return getSuperType();
        return basicGetSuperType();
      case BotDuinoPackage.SENSOR_RULE__SENSOR_ACTIONS:
        return getSensorActions();
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
      case BotDuinoPackage.SENSOR_RULE__SUPER_TYPE:
        setSuperType((Sensor)newValue);
        return;
      case BotDuinoPackage.SENSOR_RULE__SENSOR_ACTIONS:
        getSensorActions().clear();
        getSensorActions().addAll((Collection<? extends String>)newValue);
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
      case BotDuinoPackage.SENSOR_RULE__SUPER_TYPE:
        setSuperType((Sensor)null);
        return;
      case BotDuinoPackage.SENSOR_RULE__SENSOR_ACTIONS:
        getSensorActions().clear();
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
      case BotDuinoPackage.SENSOR_RULE__SUPER_TYPE:
        return superType != null;
      case BotDuinoPackage.SENSOR_RULE__SENSOR_ACTIONS:
        return sensorActions != null && !sensorActions.isEmpty();
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
    result.append(" (sensorActions: ");
    result.append(sensorActions);
    result.append(')');
    return result.toString();
  }

} //SensorRuleImpl
