/**
 */
package org.eclipse.xtext.botlib.dsl.botDuino;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.xtext.xbase.XbasePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.xtext.botlib.dsl.botDuino.BotDuinoFactory
 * @model kind="package"
 * @generated
 */
public interface BotDuinoPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "botDuino";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/Xtext/botlib/dsl/BotDuino";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "botDuino";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BotDuinoPackage eINSTANCE = org.eclipse.xtext.botlib.dsl.botDuino.impl.BotDuinoPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.xtext.botlib.dsl.botDuino.impl.DomainModelImpl <em>Domain Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.DomainModelImpl
   * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.BotDuinoPackageImpl#getDomainModel()
   * @generated
   */
  int DOMAIN_MODEL = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_MODEL__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Domain Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.botlib.dsl.botDuino.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.EntityImpl
   * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.BotDuinoPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 1;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.botlib.dsl.botDuino.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.TypeImpl
   * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.BotDuinoPackageImpl#getType()
   * @generated
   */
  int TYPE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NAME = ENTITY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Values</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__VALUES = ENTITY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.botlib.dsl.botDuino.impl.RulesImpl <em>Rules</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.RulesImpl
   * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.BotDuinoPackageImpl#getRules()
   * @generated
   */
  int RULES = 3;

  /**
   * The feature id for the '<em><b>Then Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULES__THEN_PART = ENTITY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Rules</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULES_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.botlib.dsl.botDuino.impl.MethodsImpl <em>Methods</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.MethodsImpl
   * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.BotDuinoPackageImpl#getMethods()
   * @generated
   */
  int METHODS = 4;

  /**
   * The number of structural features of the '<em>Methods</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHODS_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.botlib.dsl.botDuino.impl.BTRuleImpl <em>BT Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.BTRuleImpl
   * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.BotDuinoPackageImpl#getBTRule()
   * @generated
   */
  int BT_RULE = 5;

  /**
   * The feature id for the '<em><b>Then Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BT_RULE__THEN_PART = RULES__THEN_PART;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BT_RULE__SUPER_TYPE = RULES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BT_RULE__NAME = RULES_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>BT Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BT_RULE_FEATURE_COUNT = RULES_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.botlib.dsl.botDuino.impl.SensorRuleImpl <em>Sensor Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.SensorRuleImpl
   * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.BotDuinoPackageImpl#getSensorRule()
   * @generated
   */
  int SENSOR_RULE = 6;

  /**
   * The feature id for the '<em><b>Then Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENSOR_RULE__THEN_PART = RULES__THEN_PART;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENSOR_RULE__SUPER_TYPE = RULES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Sensor Actions</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENSOR_RULE__SENSOR_ACTIONS = RULES_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Sensor Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENSOR_RULE_FEATURE_COUNT = RULES_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.botlib.dsl.botDuino.impl.CTRLRuleImpl <em>CTRL Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.CTRLRuleImpl
   * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.BotDuinoPackageImpl#getCTRLRule()
   * @generated
   */
  int CTRL_RULE = 7;

  /**
   * The feature id for the '<em><b>Then Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CTRL_RULE__THEN_PART = RULES__THEN_PART;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CTRL_RULE__SUPER_TYPE = RULES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ctrl Actions</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CTRL_RULE__CTRL_ACTIONS = RULES_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>CTRL Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CTRL_RULE_FEATURE_COUNT = RULES_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.botlib.dsl.botDuino.impl.ButtonRuleImpl <em>Button Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.ButtonRuleImpl
   * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.BotDuinoPackageImpl#getButtonRule()
   * @generated
   */
  int BUTTON_RULE = 8;

  /**
   * The feature id for the '<em><b>Then Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_RULE__THEN_PART = RULES__THEN_PART;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_RULE__SUPER_TYPE = RULES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Btn Actions</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_RULE__BTN_ACTIONS = RULES_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Button Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_RULE_FEATURE_COUNT = RULES_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.botlib.dsl.botDuino.impl.VariablesImpl <em>Variables</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.VariablesImpl
   * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.BotDuinoPackageImpl#getVariables()
   * @generated
   */
  int VARIABLES = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLES__NAME = ENTITY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Values</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLES__VALUES = ENTITY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Variables</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLES_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.botlib.dsl.botDuino.impl.LEDImpl <em>LED</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.LEDImpl
   * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.BotDuinoPackageImpl#getLED()
   * @generated
   */
  int LED = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LED__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Values</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LED__VALUES = TYPE__VALUES;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LED__SUPER_TYPE = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>LED</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LED_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.botlib.dsl.botDuino.impl.ButtonImpl <em>Button</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.ButtonImpl
   * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.BotDuinoPackageImpl#getButton()
   * @generated
   */
  int BUTTON = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Values</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__VALUES = TYPE__VALUES;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__SUPER_TYPE = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Button</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.botlib.dsl.botDuino.impl.MotorImpl <em>Motor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.MotorImpl
   * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.BotDuinoPackageImpl#getMotor()
   * @generated
   */
  int MOTOR = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOTOR__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Values</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOTOR__VALUES = TYPE__VALUES;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOTOR__SUPER_TYPE = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Motor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOTOR_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.botlib.dsl.botDuino.impl.SensorImpl <em>Sensor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.SensorImpl
   * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.BotDuinoPackageImpl#getSensor()
   * @generated
   */
  int SENSOR = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENSOR__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Values</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENSOR__VALUES = TYPE__VALUES;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENSOR__SUPER_TYPE = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Sensor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENSOR_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.botlib.dsl.botDuino.impl.BlueToothImpl <em>Blue Tooth</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.BlueToothImpl
   * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.BotDuinoPackageImpl#getBlueTooth()
   * @generated
   */
  int BLUE_TOOTH = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLUE_TOOTH__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Values</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLUE_TOOTH__VALUES = TYPE__VALUES;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLUE_TOOTH__SUPER_TYPE = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Blue Tooth</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLUE_TOOTH_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.botlib.dsl.botDuino.impl.CTRLImpl <em>CTRL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.CTRLImpl
   * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.BotDuinoPackageImpl#getCTRL()
   * @generated
   */
  int CTRL = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CTRL__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Values</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CTRL__VALUES = TYPE__VALUES;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CTRL__SUPER_TYPE = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>CTRL</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CTRL_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.botlib.dsl.botDuino.impl.ServoImpl <em>Servo</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.ServoImpl
   * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.BotDuinoPackageImpl#getServo()
   * @generated
   */
  int SERVO = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVO__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Values</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVO__VALUES = TYPE__VALUES;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVO__SUPER_TYPE = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Servo</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVO_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.botlib.dsl.botDuino.impl.ProcImpl <em>Proc</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.ProcImpl
   * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.BotDuinoPackageImpl#getProc()
   * @generated
   */
  int PROC = 17;

  /**
   * The feature id for the '<em><b>Then Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROC__THEN_PART = RULES__THEN_PART;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROC__NAME = RULES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROC__SUPER_TYPE = RULES_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Proc</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROC_FEATURE_COUNT = RULES_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.botlib.dsl.botDuino.impl.LEDMethodsImpl <em>LED Methods</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.LEDMethodsImpl
   * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.BotDuinoPackageImpl#getLEDMethods()
   * @generated
   */
  int LED_METHODS = 18;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LED_METHODS__SUPER_TYPE = METHODS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Led Functions</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LED_METHODS__LED_FUNCTIONS = METHODS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>LED Methods</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LED_METHODS_FEATURE_COUNT = METHODS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.botlib.dsl.botDuino.impl.MotorMethodsImpl <em>Motor Methods</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.MotorMethodsImpl
   * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.BotDuinoPackageImpl#getMotorMethods()
   * @generated
   */
  int MOTOR_METHODS = 19;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOTOR_METHODS__SUPER_TYPE = METHODS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Motor Functions</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOTOR_METHODS__MOTOR_FUNCTIONS = METHODS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Motor Methods</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOTOR_METHODS_FEATURE_COUNT = METHODS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.botlib.dsl.botDuino.impl.CallProcImpl <em>Call Proc</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.CallProcImpl
   * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.BotDuinoPackageImpl#getCallProc()
   * @generated
   */
  int CALL_PROC = 20;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_PROC__SUPER_TYPE = METHODS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Call Proc</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_PROC_FEATURE_COUNT = METHODS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.botlib.dsl.botDuino.impl.ObjectLiteralImpl <em>Object Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.ObjectLiteralImpl
   * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.BotDuinoPackageImpl#getObjectLiteral()
   * @generated
   */
  int OBJECT_LITERAL = 21;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_LITERAL__EXPRESSIONS = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Object Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_LITERAL_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.botlib.dsl.botDuino.DomainModel <em>Domain Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domain Model</em>'.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.DomainModel
   * @generated
   */
  EClass getDomainModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.botlib.dsl.botDuino.DomainModel#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.DomainModel#getElements()
   * @see #getDomainModel()
   * @generated
   */
  EReference getDomainModel_Elements();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.botlib.dsl.botDuino.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.botlib.dsl.botDuino.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.botlib.dsl.botDuino.Type#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.Type#getName()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Name();

  /**
   * Returns the meta object for the attribute list '{@link org.eclipse.xtext.botlib.dsl.botDuino.Type#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Values</em>'.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.Type#getValues()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Values();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.botlib.dsl.botDuino.Rules <em>Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rules</em>'.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.Rules
   * @generated
   */
  EClass getRules();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.botlib.dsl.botDuino.Rules#getThenPart <em>Then Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then Part</em>'.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.Rules#getThenPart()
   * @see #getRules()
   * @generated
   */
  EReference getRules_ThenPart();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.botlib.dsl.botDuino.Methods <em>Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Methods</em>'.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.Methods
   * @generated
   */
  EClass getMethods();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.botlib.dsl.botDuino.BTRule <em>BT Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BT Rule</em>'.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.BTRule
   * @generated
   */
  EClass getBTRule();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.xtext.botlib.dsl.botDuino.BTRule#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Type</em>'.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.BTRule#getSuperType()
   * @see #getBTRule()
   * @generated
   */
  EReference getBTRule_SuperType();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.botlib.dsl.botDuino.BTRule#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.BTRule#getName()
   * @see #getBTRule()
   * @generated
   */
  EAttribute getBTRule_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.botlib.dsl.botDuino.SensorRule <em>Sensor Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sensor Rule</em>'.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.SensorRule
   * @generated
   */
  EClass getSensorRule();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.xtext.botlib.dsl.botDuino.SensorRule#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Type</em>'.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.SensorRule#getSuperType()
   * @see #getSensorRule()
   * @generated
   */
  EReference getSensorRule_SuperType();

  /**
   * Returns the meta object for the attribute list '{@link org.eclipse.xtext.botlib.dsl.botDuino.SensorRule#getSensorActions <em>Sensor Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Sensor Actions</em>'.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.SensorRule#getSensorActions()
   * @see #getSensorRule()
   * @generated
   */
  EAttribute getSensorRule_SensorActions();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.botlib.dsl.botDuino.CTRLRule <em>CTRL Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CTRL Rule</em>'.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.CTRLRule
   * @generated
   */
  EClass getCTRLRule();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.xtext.botlib.dsl.botDuino.CTRLRule#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Type</em>'.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.CTRLRule#getSuperType()
   * @see #getCTRLRule()
   * @generated
   */
  EReference getCTRLRule_SuperType();

  /**
   * Returns the meta object for the attribute list '{@link org.eclipse.xtext.botlib.dsl.botDuino.CTRLRule#getCtrlActions <em>Ctrl Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Ctrl Actions</em>'.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.CTRLRule#getCtrlActions()
   * @see #getCTRLRule()
   * @generated
   */
  EAttribute getCTRLRule_CtrlActions();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.botlib.dsl.botDuino.ButtonRule <em>Button Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Button Rule</em>'.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.ButtonRule
   * @generated
   */
  EClass getButtonRule();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.xtext.botlib.dsl.botDuino.ButtonRule#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Type</em>'.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.ButtonRule#getSuperType()
   * @see #getButtonRule()
   * @generated
   */
  EReference getButtonRule_SuperType();

  /**
   * Returns the meta object for the attribute list '{@link org.eclipse.xtext.botlib.dsl.botDuino.ButtonRule#getBtnActions <em>Btn Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Btn Actions</em>'.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.ButtonRule#getBtnActions()
   * @see #getButtonRule()
   * @generated
   */
  EAttribute getButtonRule_BtnActions();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.botlib.dsl.botDuino.Variables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variables</em>'.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.Variables
   * @generated
   */
  EClass getVariables();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.botlib.dsl.botDuino.Variables#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.Variables#getName()
   * @see #getVariables()
   * @generated
   */
  EAttribute getVariables_Name();

  /**
   * Returns the meta object for the attribute list '{@link org.eclipse.xtext.botlib.dsl.botDuino.Variables#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Values</em>'.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.Variables#getValues()
   * @see #getVariables()
   * @generated
   */
  EAttribute getVariables_Values();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.botlib.dsl.botDuino.LED <em>LED</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LED</em>'.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.LED
   * @generated
   */
  EClass getLED();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.xtext.botlib.dsl.botDuino.LED#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Type</em>'.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.LED#getSuperType()
   * @see #getLED()
   * @generated
   */
  EReference getLED_SuperType();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.botlib.dsl.botDuino.Button <em>Button</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Button</em>'.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.Button
   * @generated
   */
  EClass getButton();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.xtext.botlib.dsl.botDuino.Button#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Type</em>'.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.Button#getSuperType()
   * @see #getButton()
   * @generated
   */
  EReference getButton_SuperType();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.botlib.dsl.botDuino.Motor <em>Motor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Motor</em>'.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.Motor
   * @generated
   */
  EClass getMotor();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.xtext.botlib.dsl.botDuino.Motor#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Type</em>'.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.Motor#getSuperType()
   * @see #getMotor()
   * @generated
   */
  EReference getMotor_SuperType();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.botlib.dsl.botDuino.Sensor <em>Sensor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sensor</em>'.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.Sensor
   * @generated
   */
  EClass getSensor();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.xtext.botlib.dsl.botDuino.Sensor#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Type</em>'.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.Sensor#getSuperType()
   * @see #getSensor()
   * @generated
   */
  EReference getSensor_SuperType();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.botlib.dsl.botDuino.BlueTooth <em>Blue Tooth</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Blue Tooth</em>'.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.BlueTooth
   * @generated
   */
  EClass getBlueTooth();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.xtext.botlib.dsl.botDuino.BlueTooth#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Type</em>'.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.BlueTooth#getSuperType()
   * @see #getBlueTooth()
   * @generated
   */
  EReference getBlueTooth_SuperType();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.botlib.dsl.botDuino.CTRL <em>CTRL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CTRL</em>'.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.CTRL
   * @generated
   */
  EClass getCTRL();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.xtext.botlib.dsl.botDuino.CTRL#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Type</em>'.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.CTRL#getSuperType()
   * @see #getCTRL()
   * @generated
   */
  EReference getCTRL_SuperType();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.botlib.dsl.botDuino.Servo <em>Servo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Servo</em>'.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.Servo
   * @generated
   */
  EClass getServo();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.xtext.botlib.dsl.botDuino.Servo#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Type</em>'.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.Servo#getSuperType()
   * @see #getServo()
   * @generated
   */
  EReference getServo_SuperType();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.botlib.dsl.botDuino.Proc <em>Proc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Proc</em>'.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.Proc
   * @generated
   */
  EClass getProc();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.botlib.dsl.botDuino.Proc#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.Proc#getName()
   * @see #getProc()
   * @generated
   */
  EAttribute getProc_Name();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.xtext.botlib.dsl.botDuino.Proc#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Type</em>'.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.Proc#getSuperType()
   * @see #getProc()
   * @generated
   */
  EReference getProc_SuperType();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.botlib.dsl.botDuino.LEDMethods <em>LED Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LED Methods</em>'.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.LEDMethods
   * @generated
   */
  EClass getLEDMethods();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.xtext.botlib.dsl.botDuino.LEDMethods#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Type</em>'.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.LEDMethods#getSuperType()
   * @see #getLEDMethods()
   * @generated
   */
  EReference getLEDMethods_SuperType();

  /**
   * Returns the meta object for the attribute list '{@link org.eclipse.xtext.botlib.dsl.botDuino.LEDMethods#getLedFunctions <em>Led Functions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Led Functions</em>'.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.LEDMethods#getLedFunctions()
   * @see #getLEDMethods()
   * @generated
   */
  EAttribute getLEDMethods_LedFunctions();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.botlib.dsl.botDuino.MotorMethods <em>Motor Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Motor Methods</em>'.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.MotorMethods
   * @generated
   */
  EClass getMotorMethods();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.xtext.botlib.dsl.botDuino.MotorMethods#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Type</em>'.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.MotorMethods#getSuperType()
   * @see #getMotorMethods()
   * @generated
   */
  EReference getMotorMethods_SuperType();

  /**
   * Returns the meta object for the attribute list '{@link org.eclipse.xtext.botlib.dsl.botDuino.MotorMethods#getMotorFunctions <em>Motor Functions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Motor Functions</em>'.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.MotorMethods#getMotorFunctions()
   * @see #getMotorMethods()
   * @generated
   */
  EAttribute getMotorMethods_MotorFunctions();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.botlib.dsl.botDuino.CallProc <em>Call Proc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Call Proc</em>'.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.CallProc
   * @generated
   */
  EClass getCallProc();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.xtext.botlib.dsl.botDuino.CallProc#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Type</em>'.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.CallProc#getSuperType()
   * @see #getCallProc()
   * @generated
   */
  EReference getCallProc_SuperType();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.botlib.dsl.botDuino.ObjectLiteral <em>Object Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Literal</em>'.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.ObjectLiteral
   * @generated
   */
  EClass getObjectLiteral();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.botlib.dsl.botDuino.ObjectLiteral#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.ObjectLiteral#getExpressions()
   * @see #getObjectLiteral()
   * @generated
   */
  EReference getObjectLiteral_Expressions();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  BotDuinoFactory getBotDuinoFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.eclipse.xtext.botlib.dsl.botDuino.impl.DomainModelImpl <em>Domain Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.DomainModelImpl
     * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.BotDuinoPackageImpl#getDomainModel()
     * @generated
     */
    EClass DOMAIN_MODEL = eINSTANCE.getDomainModel();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_MODEL__ELEMENTS = eINSTANCE.getDomainModel_Elements();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.botlib.dsl.botDuino.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.EntityImpl
     * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.BotDuinoPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.botlib.dsl.botDuino.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.TypeImpl
     * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.BotDuinoPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__NAME = eINSTANCE.getType_Name();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__VALUES = eINSTANCE.getType_Values();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.botlib.dsl.botDuino.impl.RulesImpl <em>Rules</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.RulesImpl
     * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.BotDuinoPackageImpl#getRules()
     * @generated
     */
    EClass RULES = eINSTANCE.getRules();

    /**
     * The meta object literal for the '<em><b>Then Part</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULES__THEN_PART = eINSTANCE.getRules_ThenPart();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.botlib.dsl.botDuino.impl.MethodsImpl <em>Methods</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.MethodsImpl
     * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.BotDuinoPackageImpl#getMethods()
     * @generated
     */
    EClass METHODS = eINSTANCE.getMethods();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.botlib.dsl.botDuino.impl.BTRuleImpl <em>BT Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.BTRuleImpl
     * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.BotDuinoPackageImpl#getBTRule()
     * @generated
     */
    EClass BT_RULE = eINSTANCE.getBTRule();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BT_RULE__SUPER_TYPE = eINSTANCE.getBTRule_SuperType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BT_RULE__NAME = eINSTANCE.getBTRule_Name();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.botlib.dsl.botDuino.impl.SensorRuleImpl <em>Sensor Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.SensorRuleImpl
     * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.BotDuinoPackageImpl#getSensorRule()
     * @generated
     */
    EClass SENSOR_RULE = eINSTANCE.getSensorRule();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SENSOR_RULE__SUPER_TYPE = eINSTANCE.getSensorRule_SuperType();

    /**
     * The meta object literal for the '<em><b>Sensor Actions</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SENSOR_RULE__SENSOR_ACTIONS = eINSTANCE.getSensorRule_SensorActions();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.botlib.dsl.botDuino.impl.CTRLRuleImpl <em>CTRL Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.CTRLRuleImpl
     * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.BotDuinoPackageImpl#getCTRLRule()
     * @generated
     */
    EClass CTRL_RULE = eINSTANCE.getCTRLRule();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CTRL_RULE__SUPER_TYPE = eINSTANCE.getCTRLRule_SuperType();

    /**
     * The meta object literal for the '<em><b>Ctrl Actions</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CTRL_RULE__CTRL_ACTIONS = eINSTANCE.getCTRLRule_CtrlActions();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.botlib.dsl.botDuino.impl.ButtonRuleImpl <em>Button Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.ButtonRuleImpl
     * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.BotDuinoPackageImpl#getButtonRule()
     * @generated
     */
    EClass BUTTON_RULE = eINSTANCE.getButtonRule();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUTTON_RULE__SUPER_TYPE = eINSTANCE.getButtonRule_SuperType();

    /**
     * The meta object literal for the '<em><b>Btn Actions</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUTTON_RULE__BTN_ACTIONS = eINSTANCE.getButtonRule_BtnActions();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.botlib.dsl.botDuino.impl.VariablesImpl <em>Variables</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.VariablesImpl
     * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.BotDuinoPackageImpl#getVariables()
     * @generated
     */
    EClass VARIABLES = eINSTANCE.getVariables();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLES__NAME = eINSTANCE.getVariables_Name();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLES__VALUES = eINSTANCE.getVariables_Values();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.botlib.dsl.botDuino.impl.LEDImpl <em>LED</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.LEDImpl
     * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.BotDuinoPackageImpl#getLED()
     * @generated
     */
    EClass LED = eINSTANCE.getLED();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LED__SUPER_TYPE = eINSTANCE.getLED_SuperType();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.botlib.dsl.botDuino.impl.ButtonImpl <em>Button</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.ButtonImpl
     * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.BotDuinoPackageImpl#getButton()
     * @generated
     */
    EClass BUTTON = eINSTANCE.getButton();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUTTON__SUPER_TYPE = eINSTANCE.getButton_SuperType();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.botlib.dsl.botDuino.impl.MotorImpl <em>Motor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.MotorImpl
     * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.BotDuinoPackageImpl#getMotor()
     * @generated
     */
    EClass MOTOR = eINSTANCE.getMotor();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOTOR__SUPER_TYPE = eINSTANCE.getMotor_SuperType();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.botlib.dsl.botDuino.impl.SensorImpl <em>Sensor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.SensorImpl
     * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.BotDuinoPackageImpl#getSensor()
     * @generated
     */
    EClass SENSOR = eINSTANCE.getSensor();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SENSOR__SUPER_TYPE = eINSTANCE.getSensor_SuperType();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.botlib.dsl.botDuino.impl.BlueToothImpl <em>Blue Tooth</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.BlueToothImpl
     * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.BotDuinoPackageImpl#getBlueTooth()
     * @generated
     */
    EClass BLUE_TOOTH = eINSTANCE.getBlueTooth();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLUE_TOOTH__SUPER_TYPE = eINSTANCE.getBlueTooth_SuperType();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.botlib.dsl.botDuino.impl.CTRLImpl <em>CTRL</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.CTRLImpl
     * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.BotDuinoPackageImpl#getCTRL()
     * @generated
     */
    EClass CTRL = eINSTANCE.getCTRL();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CTRL__SUPER_TYPE = eINSTANCE.getCTRL_SuperType();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.botlib.dsl.botDuino.impl.ServoImpl <em>Servo</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.ServoImpl
     * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.BotDuinoPackageImpl#getServo()
     * @generated
     */
    EClass SERVO = eINSTANCE.getServo();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVO__SUPER_TYPE = eINSTANCE.getServo_SuperType();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.botlib.dsl.botDuino.impl.ProcImpl <em>Proc</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.ProcImpl
     * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.BotDuinoPackageImpl#getProc()
     * @generated
     */
    EClass PROC = eINSTANCE.getProc();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROC__NAME = eINSTANCE.getProc_Name();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROC__SUPER_TYPE = eINSTANCE.getProc_SuperType();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.botlib.dsl.botDuino.impl.LEDMethodsImpl <em>LED Methods</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.LEDMethodsImpl
     * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.BotDuinoPackageImpl#getLEDMethods()
     * @generated
     */
    EClass LED_METHODS = eINSTANCE.getLEDMethods();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LED_METHODS__SUPER_TYPE = eINSTANCE.getLEDMethods_SuperType();

    /**
     * The meta object literal for the '<em><b>Led Functions</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LED_METHODS__LED_FUNCTIONS = eINSTANCE.getLEDMethods_LedFunctions();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.botlib.dsl.botDuino.impl.MotorMethodsImpl <em>Motor Methods</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.MotorMethodsImpl
     * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.BotDuinoPackageImpl#getMotorMethods()
     * @generated
     */
    EClass MOTOR_METHODS = eINSTANCE.getMotorMethods();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOTOR_METHODS__SUPER_TYPE = eINSTANCE.getMotorMethods_SuperType();

    /**
     * The meta object literal for the '<em><b>Motor Functions</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOTOR_METHODS__MOTOR_FUNCTIONS = eINSTANCE.getMotorMethods_MotorFunctions();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.botlib.dsl.botDuino.impl.CallProcImpl <em>Call Proc</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.CallProcImpl
     * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.BotDuinoPackageImpl#getCallProc()
     * @generated
     */
    EClass CALL_PROC = eINSTANCE.getCallProc();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CALL_PROC__SUPER_TYPE = eINSTANCE.getCallProc_SuperType();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.botlib.dsl.botDuino.impl.ObjectLiteralImpl <em>Object Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.ObjectLiteralImpl
     * @see org.eclipse.xtext.botlib.dsl.botDuino.impl.BotDuinoPackageImpl#getObjectLiteral()
     * @generated
     */
    EClass OBJECT_LITERAL = eINSTANCE.getObjectLiteral();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_LITERAL__EXPRESSIONS = eINSTANCE.getObjectLiteral_Expressions();

  }

} //BotDuinoPackage
