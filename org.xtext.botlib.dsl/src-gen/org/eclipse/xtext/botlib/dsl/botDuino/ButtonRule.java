/**
 */
package org.eclipse.xtext.botlib.dsl.botDuino;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.botlib.dsl.botDuino.ButtonRule#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.eclipse.xtext.botlib.dsl.botDuino.ButtonRule#getBtnActions <em>Btn Actions</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.botlib.dsl.botDuino.BotDuinoPackage#getButtonRule()
 * @model
 * @generated
 */
public interface ButtonRule extends Rules
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
   * @see #setSuperType(Button)
   * @see org.eclipse.xtext.botlib.dsl.botDuino.BotDuinoPackage#getButtonRule_SuperType()
   * @model
   * @generated
   */
  Button getSuperType();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.botlib.dsl.botDuino.ButtonRule#getSuperType <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(Button value);

  /**
   * Returns the value of the '<em><b>Btn Actions</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Btn Actions</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Btn Actions</em>' attribute list.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.BotDuinoPackage#getButtonRule_BtnActions()
   * @model unique="false"
   * @generated
   */
  EList<String> getBtnActions();

} // ButtonRule
