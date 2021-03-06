/**
 */
package org.eclipse.xtext.botlib.dsl.botDuino;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BT Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.botlib.dsl.botDuino.BTRule#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.eclipse.xtext.botlib.dsl.botDuino.BTRule#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.botlib.dsl.botDuino.BotDuinoPackage#getBTRule()
 * @model
 * @generated
 */
public interface BTRule extends Rules
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
   * @see #setSuperType(BlueTooth)
   * @see org.eclipse.xtext.botlib.dsl.botDuino.BotDuinoPackage#getBTRule_SuperType()
   * @model
   * @generated
   */
  BlueTooth getSuperType();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.botlib.dsl.botDuino.BTRule#getSuperType <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(BlueTooth value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.xtext.botlib.dsl.botDuino.BotDuinoPackage#getBTRule_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.botlib.dsl.botDuino.BTRule#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // BTRule
