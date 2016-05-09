/**
 */
package org.eclipse.xtext.botlib.dsl.botDuino;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Motor Methods</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.botlib.dsl.botDuino.MotorMethods#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.eclipse.xtext.botlib.dsl.botDuino.MotorMethods#getMotorFunctions <em>Motor Functions</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.botlib.dsl.botDuino.BotDuinoPackage#getMotorMethods()
 * @model
 * @generated
 */
public interface MotorMethods extends Methods
{
  /**
   * Returns the value of the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Type</em>' reference.
   * @see #setSuperType(Type)
   * @see org.eclipse.xtext.botlib.dsl.botDuino.BotDuinoPackage#getMotorMethods_SuperType()
   * @model
   * @generated
   */
  Type getSuperType();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.botlib.dsl.botDuino.MotorMethods#getSuperType <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(Type value);

  /**
   * Returns the value of the '<em><b>Motor Functions</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Motor Functions</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Motor Functions</em>' attribute list.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.BotDuinoPackage#getMotorMethods_MotorFunctions()
   * @model unique="false"
   * @generated
   */
  EList<String> getMotorFunctions();

} // MotorMethods
