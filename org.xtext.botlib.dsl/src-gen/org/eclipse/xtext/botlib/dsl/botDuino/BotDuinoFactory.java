/**
 */
package org.eclipse.xtext.botlib.dsl.botDuino;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.xtext.botlib.dsl.botDuino.BotDuinoPackage
 * @generated
 */
public interface BotDuinoFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BotDuinoFactory eINSTANCE = org.eclipse.xtext.botlib.dsl.botDuino.impl.BotDuinoFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Domain Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Domain Model</em>'.
   * @generated
   */
  DomainModel createDomainModel();

  /**
   * Returns a new object of class '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entity</em>'.
   * @generated
   */
  Entity createEntity();

  /**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
  Type createType();

  /**
   * Returns a new object of class '<em>Rules</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rules</em>'.
   * @generated
   */
  Rules createRules();

  /**
   * Returns a new object of class '<em>Methods</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Methods</em>'.
   * @generated
   */
  Methods createMethods();

  /**
   * Returns a new object of class '<em>BT Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BT Rule</em>'.
   * @generated
   */
  BTRule createBTRule();

  /**
   * Returns a new object of class '<em>Sensor Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sensor Rule</em>'.
   * @generated
   */
  SensorRule createSensorRule();

  /**
   * Returns a new object of class '<em>CTRL Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CTRL Rule</em>'.
   * @generated
   */
  CTRLRule createCTRLRule();

  /**
   * Returns a new object of class '<em>Button Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Button Rule</em>'.
   * @generated
   */
  ButtonRule createButtonRule();

  /**
   * Returns a new object of class '<em>Variables</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variables</em>'.
   * @generated
   */
  Variables createVariables();

  /**
   * Returns a new object of class '<em>LED</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>LED</em>'.
   * @generated
   */
  LED createLED();

  /**
   * Returns a new object of class '<em>Button</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Button</em>'.
   * @generated
   */
  Button createButton();

  /**
   * Returns a new object of class '<em>Motor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Motor</em>'.
   * @generated
   */
  Motor createMotor();

  /**
   * Returns a new object of class '<em>Sensor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sensor</em>'.
   * @generated
   */
  Sensor createSensor();

  /**
   * Returns a new object of class '<em>Blue Tooth</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Blue Tooth</em>'.
   * @generated
   */
  BlueTooth createBlueTooth();

  /**
   * Returns a new object of class '<em>CTRL</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CTRL</em>'.
   * @generated
   */
  CTRL createCTRL();

  /**
   * Returns a new object of class '<em>Servo</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Servo</em>'.
   * @generated
   */
  Servo createServo();

  /**
   * Returns a new object of class '<em>Proc</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Proc</em>'.
   * @generated
   */
  Proc createProc();

  /**
   * Returns a new object of class '<em>LED Methods</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>LED Methods</em>'.
   * @generated
   */
  LEDMethods createLEDMethods();

  /**
   * Returns a new object of class '<em>Motor Methods</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Motor Methods</em>'.
   * @generated
   */
  MotorMethods createMotorMethods();

  /**
   * Returns a new object of class '<em>Call Proc</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Call Proc</em>'.
   * @generated
   */
  CallProc createCallProc();

  /**
   * Returns a new object of class '<em>Object Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Literal</em>'.
   * @generated
   */
  ObjectLiteral createObjectLiteral();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  BotDuinoPackage getBotDuinoPackage();

} //BotDuinoFactory
