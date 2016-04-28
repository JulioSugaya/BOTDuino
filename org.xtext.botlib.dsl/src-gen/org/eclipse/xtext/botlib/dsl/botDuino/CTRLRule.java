/**
 */
package org.eclipse.xtext.botlib.dsl.botDuino;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CTRL Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.botlib.dsl.botDuino.CTRLRule#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.eclipse.xtext.botlib.dsl.botDuino.CTRLRule#getCtrlActions <em>Ctrl Actions</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.botlib.dsl.botDuino.BotDuinoPackage#getCTRLRule()
 * @model
 * @generated
 */
public interface CTRLRule extends Rules
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
   * @see #setSuperType(CTRL)
   * @see org.eclipse.xtext.botlib.dsl.botDuino.BotDuinoPackage#getCTRLRule_SuperType()
   * @model
   * @generated
   */
  CTRL getSuperType();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.botlib.dsl.botDuino.CTRLRule#getSuperType <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(CTRL value);

  /**
   * Returns the value of the '<em><b>Ctrl Actions</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ctrl Actions</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ctrl Actions</em>' attribute list.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.BotDuinoPackage#getCTRLRule_CtrlActions()
   * @model unique="false"
   * @generated
   */
  EList<String> getCtrlActions();

} // CTRLRule
