/**
 */
package org.eclipse.xtext.botlib.dsl.botDuino;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.botlib.dsl.botDuino.SensorRule#getSuperType <em>Super Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.botlib.dsl.botDuino.BotDuinoPackage#getSensorRule()
 * @model
 * @generated
 */
public interface SensorRule extends Rules
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
   * @see #setSuperType(Sensor)
   * @see org.eclipse.xtext.botlib.dsl.botDuino.BotDuinoPackage#getSensorRule_SuperType()
   * @model
   * @generated
   */
  Sensor getSuperType();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.botlib.dsl.botDuino.SensorRule#getSuperType <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(Sensor value);

} // SensorRule
