/**
 */
package org.eclipse.xtext.botlib.dsl.botDuino.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.botlib.dsl.botDuino.*;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.xtext.botlib.dsl.botDuino.BotDuinoPackage
 * @generated
 */
public class BotDuinoAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static BotDuinoPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BotDuinoAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = BotDuinoPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BotDuinoSwitch<Adapter> modelSwitch =
    new BotDuinoSwitch<Adapter>()
    {
      @Override
      public Adapter caseDomainModel(DomainModel object)
      {
        return createDomainModelAdapter();
      }
      @Override
      public Adapter caseEntity(Entity object)
      {
        return createEntityAdapter();
      }
      @Override
      public Adapter caseRegisters(Registers object)
      {
        return createRegistersAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseRules(Rules object)
      {
        return createRulesAdapter();
      }
      @Override
      public Adapter caseMethods(Methods object)
      {
        return createMethodsAdapter();
      }
      @Override
      public Adapter caseBTRule(BTRule object)
      {
        return createBTRuleAdapter();
      }
      @Override
      public Adapter caseSensorRule(SensorRule object)
      {
        return createSensorRuleAdapter();
      }
      @Override
      public Adapter caseCTRLRule(CTRLRule object)
      {
        return createCTRLRuleAdapter();
      }
      @Override
      public Adapter caseButtonRule(ButtonRule object)
      {
        return createButtonRuleAdapter();
      }
      @Override
      public Adapter caseLED(LED object)
      {
        return createLEDAdapter();
      }
      @Override
      public Adapter caseButton(Button object)
      {
        return createButtonAdapter();
      }
      @Override
      public Adapter caseMotor(Motor object)
      {
        return createMotorAdapter();
      }
      @Override
      public Adapter caseSensor(Sensor object)
      {
        return createSensorAdapter();
      }
      @Override
      public Adapter caseBlueTooth(BlueTooth object)
      {
        return createBlueToothAdapter();
      }
      @Override
      public Adapter caseCTRL(CTRL object)
      {
        return createCTRLAdapter();
      }
      @Override
      public Adapter caseServo(Servo object)
      {
        return createServoAdapter();
      }
      @Override
      public Adapter caseLEDMethods(LEDMethods object)
      {
        return createLEDMethodsAdapter();
      }
      @Override
      public Adapter caseMotorMethods(MotorMethods object)
      {
        return createMotorMethodsAdapter();
      }
      @Override
      public Adapter caseObjectLiteral(ObjectLiteral object)
      {
        return createObjectLiteralAdapter();
      }
      @Override
      public Adapter caseXExpression(XExpression object)
      {
        return createXExpressionAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.xtext.botlib.dsl.botDuino.DomainModel <em>Domain Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.DomainModel
   * @generated
   */
  public Adapter createDomainModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.xtext.botlib.dsl.botDuino.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.Entity
   * @generated
   */
  public Adapter createEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.xtext.botlib.dsl.botDuino.Registers <em>Registers</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.Registers
   * @generated
   */
  public Adapter createRegistersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.xtext.botlib.dsl.botDuino.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.xtext.botlib.dsl.botDuino.Rules <em>Rules</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.Rules
   * @generated
   */
  public Adapter createRulesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.xtext.botlib.dsl.botDuino.Methods <em>Methods</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.Methods
   * @generated
   */
  public Adapter createMethodsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.xtext.botlib.dsl.botDuino.BTRule <em>BT Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.BTRule
   * @generated
   */
  public Adapter createBTRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.xtext.botlib.dsl.botDuino.SensorRule <em>Sensor Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.SensorRule
   * @generated
   */
  public Adapter createSensorRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.xtext.botlib.dsl.botDuino.CTRLRule <em>CTRL Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.CTRLRule
   * @generated
   */
  public Adapter createCTRLRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.xtext.botlib.dsl.botDuino.ButtonRule <em>Button Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.ButtonRule
   * @generated
   */
  public Adapter createButtonRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.xtext.botlib.dsl.botDuino.LED <em>LED</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.LED
   * @generated
   */
  public Adapter createLEDAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.xtext.botlib.dsl.botDuino.Button <em>Button</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.Button
   * @generated
   */
  public Adapter createButtonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.xtext.botlib.dsl.botDuino.Motor <em>Motor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.Motor
   * @generated
   */
  public Adapter createMotorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.xtext.botlib.dsl.botDuino.Sensor <em>Sensor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.Sensor
   * @generated
   */
  public Adapter createSensorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.xtext.botlib.dsl.botDuino.BlueTooth <em>Blue Tooth</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.BlueTooth
   * @generated
   */
  public Adapter createBlueToothAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.xtext.botlib.dsl.botDuino.CTRL <em>CTRL</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.CTRL
   * @generated
   */
  public Adapter createCTRLAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.xtext.botlib.dsl.botDuino.Servo <em>Servo</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.Servo
   * @generated
   */
  public Adapter createServoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.xtext.botlib.dsl.botDuino.LEDMethods <em>LED Methods</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.LEDMethods
   * @generated
   */
  public Adapter createLEDMethodsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.xtext.botlib.dsl.botDuino.MotorMethods <em>Motor Methods</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.MotorMethods
   * @generated
   */
  public Adapter createMotorMethodsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.xtext.botlib.dsl.botDuino.ObjectLiteral <em>Object Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.xtext.botlib.dsl.botDuino.ObjectLiteral
   * @generated
   */
  public Adapter createObjectLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xbase.XExpression <em>XExpression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.xtext.xbase.XExpression
   * @generated
   */
  public Adapter createXExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //BotDuinoAdapterFactory
