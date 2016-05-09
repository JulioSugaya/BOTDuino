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
import org.eclipse.xtext.botlib.dsl.botDuino.MotorMethods;
import org.eclipse.xtext.botlib.dsl.botDuino.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Motor Methods</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.botlib.dsl.botDuino.impl.MotorMethodsImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.eclipse.xtext.botlib.dsl.botDuino.impl.MotorMethodsImpl#getMotorFunctions <em>Motor Functions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MotorMethodsImpl extends MethodsImpl implements MotorMethods
{
  /**
   * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperType()
   * @generated
   * @ordered
   */
  protected Type superType;

  /**
   * The cached value of the '{@link #getMotorFunctions() <em>Motor Functions</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMotorFunctions()
   * @generated
   * @ordered
   */
  protected EList<String> motorFunctions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MotorMethodsImpl()
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
    return BotDuinoPackage.Literals.MOTOR_METHODS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getSuperType()
  {
    if (superType != null && superType.eIsProxy())
    {
      InternalEObject oldSuperType = (InternalEObject)superType;
      superType = (Type)eResolveProxy(oldSuperType);
      if (superType != oldSuperType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BotDuinoPackage.MOTOR_METHODS__SUPER_TYPE, oldSuperType, superType));
      }
    }
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type basicGetSuperType()
  {
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuperType(Type newSuperType)
  {
    Type oldSuperType = superType;
    superType = newSuperType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BotDuinoPackage.MOTOR_METHODS__SUPER_TYPE, oldSuperType, superType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getMotorFunctions()
  {
    if (motorFunctions == null)
    {
      motorFunctions = new EDataTypeEList<String>(String.class, this, BotDuinoPackage.MOTOR_METHODS__MOTOR_FUNCTIONS);
    }
    return motorFunctions;
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
      case BotDuinoPackage.MOTOR_METHODS__SUPER_TYPE:
        if (resolve) return getSuperType();
        return basicGetSuperType();
      case BotDuinoPackage.MOTOR_METHODS__MOTOR_FUNCTIONS:
        return getMotorFunctions();
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
      case BotDuinoPackage.MOTOR_METHODS__SUPER_TYPE:
        setSuperType((Type)newValue);
        return;
      case BotDuinoPackage.MOTOR_METHODS__MOTOR_FUNCTIONS:
        getMotorFunctions().clear();
        getMotorFunctions().addAll((Collection<? extends String>)newValue);
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
      case BotDuinoPackage.MOTOR_METHODS__SUPER_TYPE:
        setSuperType((Type)null);
        return;
      case BotDuinoPackage.MOTOR_METHODS__MOTOR_FUNCTIONS:
        getMotorFunctions().clear();
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
      case BotDuinoPackage.MOTOR_METHODS__SUPER_TYPE:
        return superType != null;
      case BotDuinoPackage.MOTOR_METHODS__MOTOR_FUNCTIONS:
        return motorFunctions != null && !motorFunctions.isEmpty();
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
    result.append(" (motorFunctions: ");
    result.append(motorFunctions);
    result.append(')');
    return result.toString();
  }

} //MotorMethodsImpl
