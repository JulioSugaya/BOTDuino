/**
 */
package org.eclipse.xtext.botlib.dsl.botDuino;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link org.eclipse.xtext.botlib.dsl.botDuino.SensorRule#getSensorActions <em>Sensor Actions</em>}</li>
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

  /**
   * Returns the value of the '<em><b>Sensor Actions</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sensor Actions</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sensor Actions</em>' attribute list.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.BotDuinoPackage#getSensorRule_SensorActions()
   * @model unique="false"
   * @generated
   */
  EList<String> getSensorActions();

} // SensorRule
