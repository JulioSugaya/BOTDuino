/**
 */
package org.eclipse.xtext.botlib.dsl.botDuino.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.xtext.botlib.dsl.botDuino.*;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.xtext.botlib.dsl.botDuino.BotDuinoPackage
 * @generated
 */
public class BotDuinoSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static BotDuinoPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BotDuinoSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = BotDuinoPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case BotDuinoPackage.DOMAIN_MODEL:
      {
        DomainModel domainModel = (DomainModel)theEObject;
        T result = caseDomainModel(domainModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BotDuinoPackage.ENTITY:
      {
        Entity entity = (Entity)theEObject;
        T result = caseEntity(entity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BotDuinoPackage.TYPE:
      {
        Type type = (Type)theEObject;
        T result = caseType(type);
        if (result == null) result = caseEntity(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BotDuinoPackage.RULES:
      {
        Rules rules = (Rules)theEObject;
        T result = caseRules(rules);
        if (result == null) result = caseEntity(rules);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BotDuinoPackage.METHODS:
      {
        Methods methods = (Methods)theEObject;
        T result = caseMethods(methods);
        if (result == null) result = caseEntity(methods);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BotDuinoPackage.BT_RULE:
      {
        BTRule btRule = (BTRule)theEObject;
        T result = caseBTRule(btRule);
        if (result == null) result = caseRules(btRule);
        if (result == null) result = caseEntity(btRule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BotDuinoPackage.SENSOR_RULE:
      {
        SensorRule sensorRule = (SensorRule)theEObject;
        T result = caseSensorRule(sensorRule);
        if (result == null) result = caseRules(sensorRule);
        if (result == null) result = caseEntity(sensorRule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BotDuinoPackage.CTRL_RULE:
      {
        CTRLRule ctrlRule = (CTRLRule)theEObject;
        T result = caseCTRLRule(ctrlRule);
        if (result == null) result = caseRules(ctrlRule);
        if (result == null) result = caseEntity(ctrlRule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BotDuinoPackage.BUTTON_RULE:
      {
        ButtonRule buttonRule = (ButtonRule)theEObject;
        T result = caseButtonRule(buttonRule);
        if (result == null) result = caseRules(buttonRule);
        if (result == null) result = caseEntity(buttonRule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BotDuinoPackage.VARIABLES:
      {
        Variables variables = (Variables)theEObject;
        T result = caseVariables(variables);
        if (result == null) result = caseEntity(variables);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BotDuinoPackage.LED:
      {
        LED led = (LED)theEObject;
        T result = caseLED(led);
        if (result == null) result = caseType(led);
        if (result == null) result = caseEntity(led);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BotDuinoPackage.BUTTON:
      {
        Button button = (Button)theEObject;
        T result = caseButton(button);
        if (result == null) result = caseType(button);
        if (result == null) result = caseEntity(button);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BotDuinoPackage.MOTOR:
      {
        Motor motor = (Motor)theEObject;
        T result = caseMotor(motor);
        if (result == null) result = caseType(motor);
        if (result == null) result = caseEntity(motor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BotDuinoPackage.SENSOR:
      {
        Sensor sensor = (Sensor)theEObject;
        T result = caseSensor(sensor);
        if (result == null) result = caseType(sensor);
        if (result == null) result = caseEntity(sensor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BotDuinoPackage.BLUE_TOOTH:
      {
        BlueTooth blueTooth = (BlueTooth)theEObject;
        T result = caseBlueTooth(blueTooth);
        if (result == null) result = caseType(blueTooth);
        if (result == null) result = caseEntity(blueTooth);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BotDuinoPackage.CTRL:
      {
        CTRL ctrl = (CTRL)theEObject;
        T result = caseCTRL(ctrl);
        if (result == null) result = caseType(ctrl);
        if (result == null) result = caseEntity(ctrl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BotDuinoPackage.SERVO:
      {
        Servo servo = (Servo)theEObject;
        T result = caseServo(servo);
        if (result == null) result = caseType(servo);
        if (result == null) result = caseEntity(servo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BotDuinoPackage.PROC:
      {
        Proc proc = (Proc)theEObject;
        T result = caseProc(proc);
        if (result == null) result = caseRules(proc);
        if (result == null) result = caseEntity(proc);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BotDuinoPackage.LED_METHODS:
      {
        LEDMethods ledMethods = (LEDMethods)theEObject;
        T result = caseLEDMethods(ledMethods);
        if (result == null) result = caseMethods(ledMethods);
        if (result == null) result = caseEntity(ledMethods);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BotDuinoPackage.MOTOR_METHODS:
      {
        MotorMethods motorMethods = (MotorMethods)theEObject;
        T result = caseMotorMethods(motorMethods);
        if (result == null) result = caseMethods(motorMethods);
        if (result == null) result = caseEntity(motorMethods);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BotDuinoPackage.CALL_PROC:
      {
        CallProc callProc = (CallProc)theEObject;
        T result = caseCallProc(callProc);
        if (result == null) result = caseMethods(callProc);
        if (result == null) result = caseEntity(callProc);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BotDuinoPackage.OBJECT_LITERAL:
      {
        ObjectLiteral objectLiteral = (ObjectLiteral)theEObject;
        T result = caseObjectLiteral(objectLiteral);
        if (result == null) result = caseXExpression(objectLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Domain Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Domain Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDomainModel(DomainModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntity(Entity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType(Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rules</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rules</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRules(Rules object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Methods</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Methods</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMethods(Methods object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BT Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BT Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBTRule(BTRule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sensor Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sensor Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSensorRule(SensorRule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CTRL Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CTRL Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCTRLRule(CTRLRule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Button Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Button Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseButtonRule(ButtonRule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variables</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variables</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariables(Variables object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>LED</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>LED</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLED(LED object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Button</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Button</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseButton(Button object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Motor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Motor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMotor(Motor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sensor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sensor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSensor(Sensor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Blue Tooth</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Blue Tooth</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBlueTooth(BlueTooth object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CTRL</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CTRL</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCTRL(CTRL object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Servo</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Servo</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseServo(Servo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Proc</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Proc</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProc(Proc object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>LED Methods</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>LED Methods</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLEDMethods(LEDMethods object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Motor Methods</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Motor Methods</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMotorMethods(MotorMethods object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Call Proc</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Call Proc</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCallProc(CallProc object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectLiteral(ObjectLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XExpression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XExpression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXExpression(XExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //BotDuinoSwitch
