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
import org.eclipse.xtext.botlib.dsl.botDuino.LED;
import org.eclipse.xtext.botlib.dsl.botDuino.LEDMethods;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LED Methods</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.botlib.dsl.botDuino.impl.LEDMethodsImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.eclipse.xtext.botlib.dsl.botDuino.impl.LEDMethodsImpl#getLedFunctions <em>Led Functions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LEDMethodsImpl extends MethodsImpl implements LEDMethods
{
  /**
   * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperType()
   * @generated
   * @ordered
   */
  protected LED superType;

  /**
   * The cached value of the '{@link #getLedFunctions() <em>Led Functions</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLedFunctions()
   * @generated
   * @ordered
   */
  protected EList<String> ledFunctions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LEDMethodsImpl()
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
    return BotDuinoPackage.Literals.LED_METHODS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LED getSuperType()
  {
    if (superType != null && superType.eIsProxy())
    {
      InternalEObject oldSuperType = (InternalEObject)superType;
      superType = (LED)eResolveProxy(oldSuperType);
      if (superType != oldSuperType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BotDuinoPackage.LED_METHODS__SUPER_TYPE, oldSuperType, superType));
      }
    }
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LED basicGetSuperType()
  {
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuperType(LED newSuperType)
  {
    LED oldSuperType = superType;
    superType = newSuperType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BotDuinoPackage.LED_METHODS__SUPER_TYPE, oldSuperType, superType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getLedFunctions()
  {
    if (ledFunctions == null)
    {
      ledFunctions = new EDataTypeEList<String>(String.class, this, BotDuinoPackage.LED_METHODS__LED_FUNCTIONS);
    }
    return ledFunctions;
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
      case BotDuinoPackage.LED_METHODS__SUPER_TYPE:
        if (resolve) return getSuperType();
        return basicGetSuperType();
      case BotDuinoPackage.LED_METHODS__LED_FUNCTIONS:
        return getLedFunctions();
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
      case BotDuinoPackage.LED_METHODS__SUPER_TYPE:
        setSuperType((LED)newValue);
        return;
      case BotDuinoPackage.LED_METHODS__LED_FUNCTIONS:
        getLedFunctions().clear();
        getLedFunctions().addAll((Collection<? extends String>)newValue);
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
      case BotDuinoPackage.LED_METHODS__SUPER_TYPE:
        setSuperType((LED)null);
        return;
      case BotDuinoPackage.LED_METHODS__LED_FUNCTIONS:
        getLedFunctions().clear();
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
      case BotDuinoPackage.LED_METHODS__SUPER_TYPE:
        return superType != null;
      case BotDuinoPackage.LED_METHODS__LED_FUNCTIONS:
        return ledFunctions != null && !ledFunctions.isEmpty();
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
    result.append(" (ledFunctions: ");
    result.append(ledFunctions);
    result.append(')');
    return result.toString();
  }

} //LEDMethodsImpl
