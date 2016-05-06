/**
 */
package org.eclipse.xtext.botlib.dsl.botDuino.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.botlib.dsl.botDuino.BTRule;
import org.eclipse.xtext.botlib.dsl.botDuino.BlueTooth;
import org.eclipse.xtext.botlib.dsl.botDuino.BotDuinoFactory;
import org.eclipse.xtext.botlib.dsl.botDuino.BotDuinoPackage;
import org.eclipse.xtext.botlib.dsl.botDuino.Button;
import org.eclipse.xtext.botlib.dsl.botDuino.ButtonRule;
import org.eclipse.xtext.botlib.dsl.botDuino.CTRLRule;
import org.eclipse.xtext.botlib.dsl.botDuino.DomainModel;
import org.eclipse.xtext.botlib.dsl.botDuino.Entity;
import org.eclipse.xtext.botlib.dsl.botDuino.LEDMethods;
import org.eclipse.xtext.botlib.dsl.botDuino.Methods;
import org.eclipse.xtext.botlib.dsl.botDuino.Motor;
import org.eclipse.xtext.botlib.dsl.botDuino.MotorMethods;
import org.eclipse.xtext.botlib.dsl.botDuino.ObjectLiteral;
import org.eclipse.xtext.botlib.dsl.botDuino.Rules;
import org.eclipse.xtext.botlib.dsl.botDuino.Sensor;
import org.eclipse.xtext.botlib.dsl.botDuino.SensorRule;
import org.eclipse.xtext.botlib.dsl.botDuino.Servo;
import org.eclipse.xtext.botlib.dsl.botDuino.Type;
import org.eclipse.xtext.botlib.dsl.botDuino.Variables;

import org.eclipse.xtext.xbase.XbasePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BotDuinoPackageImpl extends EPackageImpl implements BotDuinoPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass domainModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rulesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass methodsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass btRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sensorRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ctrlRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass buttonRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variablesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ledEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass buttonEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass motorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sensorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass blueToothEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ctrlEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass servoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ledMethodsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass motorMethodsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectLiteralEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.eclipse.xtext.botlib.dsl.botDuino.BotDuinoPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private BotDuinoPackageImpl()
  {
    super(eNS_URI, BotDuinoFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link BotDuinoPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static BotDuinoPackage init()
  {
    if (isInited) return (BotDuinoPackage)EPackage.Registry.INSTANCE.getEPackage(BotDuinoPackage.eNS_URI);

    // Obtain or create and register package
    BotDuinoPackageImpl theBotDuinoPackage = (BotDuinoPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BotDuinoPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BotDuinoPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    XbasePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theBotDuinoPackage.createPackageContents();

    // Initialize created meta-data
    theBotDuinoPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theBotDuinoPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(BotDuinoPackage.eNS_URI, theBotDuinoPackage);
    return theBotDuinoPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDomainModel()
  {
    return domainModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDomainModel_Elements()
  {
    return (EReference)domainModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntity()
  {
    return entityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getType()
  {
    return typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getType_Name()
  {
    return (EAttribute)typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getType_Values()
  {
    return (EAttribute)typeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRules()
  {
    return rulesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRules_ThenPart()
  {
    return (EReference)rulesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMethods()
  {
    return methodsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethods_SuperType()
  {
    return (EReference)methodsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBTRule()
  {
    return btRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBTRule_SuperType()
  {
    return (EReference)btRuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBTRule_Name()
  {
    return (EAttribute)btRuleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSensorRule()
  {
    return sensorRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSensorRule_SuperType()
  {
    return (EReference)sensorRuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSensorRule_SensorActions()
  {
    return (EAttribute)sensorRuleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCTRLRule()
  {
    return ctrlRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCTRLRule_SuperType()
  {
    return (EReference)ctrlRuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCTRLRule_CtrlActions()
  {
    return (EAttribute)ctrlRuleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getButtonRule()
  {
    return buttonRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getButtonRule_SuperType()
  {
    return (EReference)buttonRuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getButtonRule_BtnActions()
  {
    return (EAttribute)buttonRuleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariables()
  {
    return variablesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariables_Name()
  {
    return (EAttribute)variablesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariables_Values()
  {
    return (EAttribute)variablesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLED()
  {
    return ledEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLED_SuperType()
  {
    return (EReference)ledEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getButton()
  {
    return buttonEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getButton_SuperType()
  {
    return (EReference)buttonEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMotor()
  {
    return motorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMotor_SuperType()
  {
    return (EReference)motorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSensor()
  {
    return sensorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSensor_SuperType()
  {
    return (EReference)sensorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBlueTooth()
  {
    return blueToothEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBlueTooth_SuperType()
  {
    return (EReference)blueToothEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCTRL()
  {
    return ctrlEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCTRL_SuperType()
  {
    return (EReference)ctrlEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getServo()
  {
    return servoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getServo_SuperType()
  {
    return (EReference)servoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLEDMethods()
  {
    return ledMethodsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLEDMethods_LedFunctions()
  {
    return (EAttribute)ledMethodsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMotorMethods()
  {
    return motorMethodsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMotorMethods_MotorFunctions()
  {
    return (EAttribute)motorMethodsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectLiteral()
  {
    return objectLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectLiteral_Expressions()
  {
    return (EReference)objectLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BotDuinoFactory getBotDuinoFactory()
  {
    return (BotDuinoFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    domainModelEClass = createEClass(DOMAIN_MODEL);
    createEReference(domainModelEClass, DOMAIN_MODEL__ELEMENTS);

    entityEClass = createEClass(ENTITY);

    typeEClass = createEClass(TYPE);
    createEAttribute(typeEClass, TYPE__NAME);
    createEAttribute(typeEClass, TYPE__VALUES);

    rulesEClass = createEClass(RULES);
    createEReference(rulesEClass, RULES__THEN_PART);

    methodsEClass = createEClass(METHODS);
    createEReference(methodsEClass, METHODS__SUPER_TYPE);

    btRuleEClass = createEClass(BT_RULE);
    createEReference(btRuleEClass, BT_RULE__SUPER_TYPE);
    createEAttribute(btRuleEClass, BT_RULE__NAME);

    sensorRuleEClass = createEClass(SENSOR_RULE);
    createEReference(sensorRuleEClass, SENSOR_RULE__SUPER_TYPE);
    createEAttribute(sensorRuleEClass, SENSOR_RULE__SENSOR_ACTIONS);

    ctrlRuleEClass = createEClass(CTRL_RULE);
    createEReference(ctrlRuleEClass, CTRL_RULE__SUPER_TYPE);
    createEAttribute(ctrlRuleEClass, CTRL_RULE__CTRL_ACTIONS);

    buttonRuleEClass = createEClass(BUTTON_RULE);
    createEReference(buttonRuleEClass, BUTTON_RULE__SUPER_TYPE);
    createEAttribute(buttonRuleEClass, BUTTON_RULE__BTN_ACTIONS);

    variablesEClass = createEClass(VARIABLES);
    createEAttribute(variablesEClass, VARIABLES__NAME);
    createEAttribute(variablesEClass, VARIABLES__VALUES);

    ledEClass = createEClass(LED);
    createEReference(ledEClass, LED__SUPER_TYPE);

    buttonEClass = createEClass(BUTTON);
    createEReference(buttonEClass, BUTTON__SUPER_TYPE);

    motorEClass = createEClass(MOTOR);
    createEReference(motorEClass, MOTOR__SUPER_TYPE);

    sensorEClass = createEClass(SENSOR);
    createEReference(sensorEClass, SENSOR__SUPER_TYPE);

    blueToothEClass = createEClass(BLUE_TOOTH);
    createEReference(blueToothEClass, BLUE_TOOTH__SUPER_TYPE);

    ctrlEClass = createEClass(CTRL);
    createEReference(ctrlEClass, CTRL__SUPER_TYPE);

    servoEClass = createEClass(SERVO);
    createEReference(servoEClass, SERVO__SUPER_TYPE);

    ledMethodsEClass = createEClass(LED_METHODS);
    createEAttribute(ledMethodsEClass, LED_METHODS__LED_FUNCTIONS);

    motorMethodsEClass = createEClass(MOTOR_METHODS);
    createEAttribute(motorMethodsEClass, MOTOR_METHODS__MOTOR_FUNCTIONS);

    objectLiteralEClass = createEClass(OBJECT_LITERAL);
    createEReference(objectLiteralEClass, OBJECT_LITERAL__EXPRESSIONS);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    XbasePackage theXbasePackage = (XbasePackage)EPackage.Registry.INSTANCE.getEPackage(XbasePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    typeEClass.getESuperTypes().add(this.getEntity());
    rulesEClass.getESuperTypes().add(this.getEntity());
    methodsEClass.getESuperTypes().add(this.getEntity());
    btRuleEClass.getESuperTypes().add(this.getRules());
    sensorRuleEClass.getESuperTypes().add(this.getRules());
    ctrlRuleEClass.getESuperTypes().add(this.getRules());
    buttonRuleEClass.getESuperTypes().add(this.getRules());
    variablesEClass.getESuperTypes().add(this.getEntity());
    ledEClass.getESuperTypes().add(this.getType());
    buttonEClass.getESuperTypes().add(this.getType());
    motorEClass.getESuperTypes().add(this.getType());
    sensorEClass.getESuperTypes().add(this.getType());
    blueToothEClass.getESuperTypes().add(this.getType());
    ctrlEClass.getESuperTypes().add(this.getType());
    servoEClass.getESuperTypes().add(this.getType());
    ledMethodsEClass.getESuperTypes().add(this.getMethods());
    motorMethodsEClass.getESuperTypes().add(this.getMethods());
    objectLiteralEClass.getESuperTypes().add(theXbasePackage.getXExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(domainModelEClass, DomainModel.class, "DomainModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDomainModel_Elements(), this.getEntity(), null, "elements", null, 0, -1, DomainModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getType_Name(), ecorePackage.getEString(), "name", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getType_Values(), ecorePackage.getEInt(), "values", null, 0, -1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rulesEClass, Rules.class, "Rules", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRules_ThenPart(), theXbasePackage.getXExpression(), null, "thenPart", null, 0, 1, Rules.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(methodsEClass, Methods.class, "Methods", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMethods_SuperType(), this.getType(), null, "superType", null, 0, 1, Methods.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(btRuleEClass, BTRule.class, "BTRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBTRule_SuperType(), this.getBlueTooth(), null, "superType", null, 0, 1, BTRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBTRule_Name(), ecorePackage.getEString(), "name", null, 0, 1, BTRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sensorRuleEClass, SensorRule.class, "SensorRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSensorRule_SuperType(), this.getSensor(), null, "superType", null, 0, 1, SensorRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSensorRule_SensorActions(), ecorePackage.getEString(), "sensorActions", null, 0, -1, SensorRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ctrlRuleEClass, CTRLRule.class, "CTRLRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCTRLRule_SuperType(), this.getCTRL(), null, "superType", null, 0, 1, CTRLRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCTRLRule_CtrlActions(), ecorePackage.getEString(), "ctrlActions", null, 0, -1, CTRLRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(buttonRuleEClass, ButtonRule.class, "ButtonRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getButtonRule_SuperType(), this.getButton(), null, "superType", null, 0, 1, ButtonRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getButtonRule_BtnActions(), ecorePackage.getEString(), "btnActions", null, 0, -1, ButtonRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variablesEClass, Variables.class, "Variables", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariables_Name(), ecorePackage.getEString(), "name", null, 0, 1, Variables.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariables_Values(), ecorePackage.getEInt(), "values", null, 0, -1, Variables.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ledEClass, org.eclipse.xtext.botlib.dsl.botDuino.LED.class, "LED", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLED_SuperType(), this.getLED(), null, "superType", null, 0, 1, org.eclipse.xtext.botlib.dsl.botDuino.LED.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(buttonEClass, Button.class, "Button", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getButton_SuperType(), this.getButton(), null, "superType", null, 0, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(motorEClass, Motor.class, "Motor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMotor_SuperType(), this.getMotor(), null, "superType", null, 0, 1, Motor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sensorEClass, Sensor.class, "Sensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSensor_SuperType(), this.getSensor(), null, "superType", null, 0, 1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(blueToothEClass, BlueTooth.class, "BlueTooth", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBlueTooth_SuperType(), this.getBlueTooth(), null, "superType", null, 0, 1, BlueTooth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ctrlEClass, org.eclipse.xtext.botlib.dsl.botDuino.CTRL.class, "CTRL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCTRL_SuperType(), this.getCTRL(), null, "superType", null, 0, 1, org.eclipse.xtext.botlib.dsl.botDuino.CTRL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(servoEClass, Servo.class, "Servo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getServo_SuperType(), this.getServo(), null, "superType", null, 0, 1, Servo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ledMethodsEClass, LEDMethods.class, "LEDMethods", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLEDMethods_LedFunctions(), ecorePackage.getEString(), "ledFunctions", null, 0, -1, LEDMethods.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(motorMethodsEClass, MotorMethods.class, "MotorMethods", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMotorMethods_MotorFunctions(), ecorePackage.getEString(), "motorFunctions", null, 0, -1, MotorMethods.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(objectLiteralEClass, ObjectLiteral.class, "ObjectLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObjectLiteral_Expressions(), this.getMethods(), null, "expressions", null, 0, -1, ObjectLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //BotDuinoPackageImpl
