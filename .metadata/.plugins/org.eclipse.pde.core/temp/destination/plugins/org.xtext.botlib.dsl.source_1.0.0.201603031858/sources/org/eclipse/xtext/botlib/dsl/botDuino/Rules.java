/**
 */
package org.eclipse.xtext.botlib.dsl.botDuino;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rules</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.botlib.dsl.botDuino.Rules#getThenPart <em>Then Part</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.botlib.dsl.botDuino.BotDuinoPackage#getRules()
 * @model
 * @generated
 */
public interface Rules extends Entity
{
  /**
   * Returns the value of the '<em><b>Then Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then Part</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then Part</em>' containment reference.
   * @see #setThenPart(XExpression)
   * @see org.eclipse.xtext.botlib.dsl.botDuino.BotDuinoPackage#getRules_ThenPart()
   * @model containment="true"
   * @generated
   */
  XExpression getThenPart();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.botlib.dsl.botDuino.Rules#getThenPart <em>Then Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then Part</em>' containment reference.
   * @see #getThenPart()
   * @generated
   */
  void setThenPart(XExpression value);

} // Rules
