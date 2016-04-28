/**
 */
package org.eclipse.xtext.botlib.dsl.botDuino.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.xtext.botlib.dsl.botDuino.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BotDuinoFactoryImpl extends EFactoryImpl implements BotDuinoFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BotDuinoFactory init()
  {
    try
    {
      BotDuinoFactory theBotDuinoFactory = (BotDuinoFactory)EPackage.Registry.INSTANCE.getEFactory(BotDuinoPackage.eNS_URI);
      if (theBotDuinoFactory != null)
      {
        return theBotDuinoFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new BotDuinoFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BotDuinoFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case BotDuinoPackage.DOMAIN_MODEL: return createDomainModel();
      case BotDuinoPackage.ENTITY: return createEntity();
      case BotDuinoPackage.REGISTERS: return createRegisters();
      case BotDuinoPackage.TYPE: return createType();
      case BotDuinoPackage.RULES: return createRules();
      case BotDuinoPackage.METHODS: return createMethods();
      case BotDuinoPackage.BT_RULE: return createBTRule();
      case BotDuinoPackage.SENSOR_RULE: return createSensorRule();
      case BotDuinoPackage.CTRL_RULE: return createCTRLRule();
      case BotDuinoPackage.BUTTON_RULE: return createButtonRule();
      case BotDuinoPackage.LED: return createLED();
      case BotDuinoPackage.BUTTON: return createButton();
      case BotDuinoPackage.MOTOR: return createMotor();
      case BotDuinoPackage.SENSOR: return createSensor();
      case BotDuinoPackage.BLUE_TOOTH: return createBlueTooth();
      case BotDuinoPackage.CTRL: return createCTRL();
      case BotDuinoPackage.SERVO: return createServo();
      case BotDuinoPackage.LED_METHODS: return createLEDMethods();
      case BotDuinoPackage.MOTOR_METHODS: return createMotorMethods();
      case BotDuinoPackage.OBJECT_LITERAL: return createObjectLiteral();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainModel createDomainModel()
  {
    DomainModelImpl domainModel = new DomainModelImpl();
    return domainModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Registers createRegisters()
  {
    RegistersImpl registers = new RegistersImpl();
    return registers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rules createRules()
  {
    RulesImpl rules = new RulesImpl();
    return rules;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Methods createMethods()
  {
    MethodsImpl methods = new MethodsImpl();
    return methods;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BTRule createBTRule()
  {
    BTRuleImpl btRule = new BTRuleImpl();
    return btRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SensorRule createSensorRule()
  {
    SensorRuleImpl sensorRule = new SensorRuleImpl();
    return sensorRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CTRLRule createCTRLRule()
  {
    CTRLRuleImpl ctrlRule = new CTRLRuleImpl();
    return ctrlRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ButtonRule createButtonRule()
  {
    ButtonRuleImpl buttonRule = new ButtonRuleImpl();
    return buttonRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LED createLED()
  {
    LEDImpl led = new LEDImpl();
    return led;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Button createButton()
  {
    ButtonImpl button = new ButtonImpl();
    return button;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Motor createMotor()
  {
    MotorImpl motor = new MotorImpl();
    return motor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sensor createSensor()
  {
    SensorImpl sensor = new SensorImpl();
    return sensor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BlueTooth createBlueTooth()
  {
    BlueToothImpl blueTooth = new BlueToothImpl();
    return blueTooth;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CTRL createCTRL()
  {
    CTRLImpl ctrl = new CTRLImpl();
    return ctrl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Servo createServo()
  {
    ServoImpl servo = new ServoImpl();
    return servo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LEDMethods createLEDMethods()
  {
    LEDMethodsImpl ledMethods = new LEDMethodsImpl();
    return ledMethods;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MotorMethods createMotorMethods()
  {
    MotorMethodsImpl motorMethods = new MotorMethodsImpl();
    return motorMethods;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectLiteral createObjectLiteral()
  {
    ObjectLiteralImpl objectLiteral = new ObjectLiteralImpl();
    return objectLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BotDuinoPackage getBotDuinoPackage()
  {
    return (BotDuinoPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static BotDuinoPackage getPackage()
  {
    return BotDuinoPackage.eINSTANCE;
  }

} //BotDuinoFactoryImpl
