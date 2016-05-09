/**
 */
package org.eclipse.xtext.botlib.dsl.botDuino.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.botlib.dsl.botDuino.BotDuinoPackage;
import org.eclipse.xtext.botlib.dsl.botDuino.Proc;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Proc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.botlib.dsl.botDuino.impl.ProcImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtext.botlib.dsl.botDuino.impl.ProcImpl#getSuperType <em>Super Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcImpl extends RulesImpl implements Proc
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
   * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperType()
   * @generated
   * @ordered
   */
  protected Proc superType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProcImpl()
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
    return BotDuinoPackage.Literals.PROC;
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
      eNotify(new ENotificationImpl(this, Notification.SET, BotDuinoPackage.PROC__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Proc getSuperType()
  {
    if (superType != null && superType.eIsProxy())
    {
      InternalEObject oldSuperType = (InternalEObject)superType;
      superType = (Proc)eResolveProxy(oldSuperType);
      if (superType != oldSuperType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BotDuinoPackage.PROC__SUPER_TYPE, oldSuperType, superType));
      }
    }
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Proc basicGetSuperType()
  {
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuperType(Proc newSuperType)
  {
    Proc oldSuperType = superType;
    superType = newSuperType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BotDuinoPackage.PROC__SUPER_TYPE, oldSuperType, superType));
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
      case BotDuinoPackage.PROC__NAME:
        return getName();
      case BotDuinoPackage.PROC__SUPER_TYPE:
        if (resolve) return getSuperType();
        return basicGetSuperType();
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
      case BotDuinoPackage.PROC__NAME:
        setName((String)newValue);
        return;
      case BotDuinoPackage.PROC__SUPER_TYPE:
        setSuperType((Proc)newValue);
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
      case BotDuinoPackage.PROC__NAME:
        setName(NAME_EDEFAULT);
        return;
      case BotDuinoPackage.PROC__SUPER_TYPE:
        setSuperType((Proc)null);
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
      case BotDuinoPackage.PROC__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case BotDuinoPackage.PROC__SUPER_TYPE:
        return superType != null;
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
    result.append(')');
    return result.toString();
  }

} //ProcImpl
