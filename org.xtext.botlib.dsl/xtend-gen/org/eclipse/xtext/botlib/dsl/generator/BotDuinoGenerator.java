package org.eclipse.xtext.botlib.dsl.generator;

import com.google.common.base.Objects;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.botlib.dsl.botDuino.BTRule;
import org.eclipse.xtext.botlib.dsl.botDuino.BlueTooth;
import org.eclipse.xtext.botlib.dsl.botDuino.Button;
import org.eclipse.xtext.botlib.dsl.botDuino.ButtonRule;
import org.eclipse.xtext.botlib.dsl.botDuino.LEDMethods;
import org.eclipse.xtext.botlib.dsl.botDuino.Methods;
import org.eclipse.xtext.botlib.dsl.botDuino.MotorMethods;
import org.eclipse.xtext.botlib.dsl.botDuino.Registers;
import org.eclipse.xtext.botlib.dsl.botDuino.Rules;
import org.eclipse.xtext.botlib.dsl.botDuino.Type;
import org.eclipse.xtext.botlib.dsl.botDuino.impl.BTRuleImpl;
import org.eclipse.xtext.botlib.dsl.botDuino.impl.BlueToothImpl;
import org.eclipse.xtext.botlib.dsl.botDuino.impl.ButtonRuleImpl;
import org.eclipse.xtext.botlib.dsl.botDuino.impl.LEDMethodsImpl;
import org.eclipse.xtext.botlib.dsl.botDuino.impl.MotorMethodsImpl;
import org.eclipse.xtext.botlib.dsl.botDuino.impl.ObjectLiteralImpl;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class BotDuinoGenerator implements IGenerator {
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  private String ql = System.getProperty("line.separator");
  
  private String ind1 = "\t";
  
  private String ind2 = "\t\t";
  
  private String ind3 = "\t\t\t";
  
  private String c_includes = ("#include <BOTLib.h>" + this.ql);
  
  private String c_vars = "";
  
  private String c_setup = ("void setup() {" + this.ql);
  
  private String c_loop = ("void loop() {" + this.ql);
  
  private String bt_block = "";
  
  private String context = "";
  
  private boolean bt_test = false;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<EObject> _filterNull = IterableExtensions.<EObject>filterNull(_iterable);
    for (final EObject e : _filterNull) {
      this.process(e);
    }
    if (this.bt_test) {
      String _c_loop = this.c_loop;
      this.c_loop = (_c_loop + ((this.bt_block + "}") + this.ql));
    }
    this.context = ((((((((this.c_includes + this.ql) + this.c_vars) + this.ql) + this.c_setup) + "}") + this.ql) + this.c_loop) + "}");
    URI _uRI = resource.getURI();
    String _lastSegment = _uRI.lastSegment();
    String _plus = (_lastSegment + ".cpp");
    fsa.generateFile(_plus, this.context);
  }
  
  public String process(final EObject e) {
    String _xblockexpression = null;
    {
      if ((e instanceof Type)) {
        this.compile(((Type)e));
      }
      if ((e instanceof Rules)) {
        this.compile(((Rules)e));
      }
      String _xifexpression = null;
      if ((e instanceof Registers)) {
        _xifexpression = this.compile(((Registers)e));
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public String compile(final Type e) {
    String _xblockexpression = null;
    {
      String _c_vars = this.c_vars;
      StringConcatenation _builder = new StringConcatenation();
      EClass _eClass = e.eClass();
      String _name = _eClass.getName();
      _builder.append(_name, "");
      _builder.append(" ");
      String _name_1 = e.getName();
      _builder.append(_name_1, "");
      _builder.append("(");
      EList<Integer> _values = e.getValues();
      String _join = IterableExtensions.join(_values, ",");
      _builder.append(_join, "");
      _builder.append(");");
      String _plus = (_builder.toString() + this.ql);
      this.c_vars = (_c_vars + _plus);
      String _xifexpression = null;
      if ((e instanceof BlueToothImpl)) {
        String _c_vars_1 = this.c_vars;
        String _name_2 = ((BlueToothImpl)e).getName();
        String _plus_1 = ("int " + _name_2);
        String _plus_2 = (_plus_1 + "Response;");
        String _plus_3 = (_plus_2 + this.ql);
        _xifexpression = this.c_vars = (_c_vars_1 + _plus_3);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public String compile(final Registers e) {
    String _c_vars = this.c_vars;
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("byte ");
    String _name = e.getName();
    _builder.append(_name, "");
    _builder.append(" = ");
    EList<Integer> _values = e.getValues();
    Integer _last = IterableExtensions.<Integer>last(_values);
    _builder.append(_last, "");
    _builder.append(";");
    String _plus = (_builder.toString() + this.ql);
    return this.c_vars = (_c_vars + _plus);
  }
  
  public String compile(final Rules e) {
    String _xblockexpression = null;
    {
      EClass _eClass = e.eClass();
      String _name = _eClass.getName();
      String _simpleName = BTRule.class.getSimpleName();
      boolean _equals = Objects.equal(_name, _simpleName);
      if (_equals) {
        BTRuleImpl btClass = ((BTRuleImpl) e);
        if ((!this.bt_test)) {
          BlueTooth _superType = btClass.getSuperType();
          String _name_1 = _superType.getName();
          String _plus = ((this.ind1 + "if(") + _name_1);
          String _plus_1 = (_plus + ".available()){ ");
          String _plus_2 = (_plus_1 + this.ql);
          BlueTooth _superType_1 = btClass.getSuperType();
          String _name_2 = _superType_1.getName();
          String _plus_3 = (_plus_2 + _name_2);
          String _plus_4 = (_plus_3 + "Response = ");
          BlueTooth _superType_2 = btClass.getSuperType();
          String _name_3 = _superType_2.getName();
          String _plus_5 = (_plus_4 + _name_3);
          String _plus_6 = (_plus_5 + ".read();");
          String _plus_7 = (_plus_6 + this.ql);
          this.bt_block = _plus_7;
          this.bt_test = true;
        }
        String _bt_block = this.bt_block;
        BlueTooth _superType_3 = btClass.getSuperType();
        String _name_4 = _superType_3.getName();
        String _plus_8 = ((this.ind1 + "if(") + _name_4);
        String _plus_9 = (_plus_8 + "Response ==\'");
        QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(e);
        String _plus_10 = (_plus_9 + _fullyQualifiedName);
        String _plus_11 = (_plus_10 + "\'){");
        String _plus_12 = (_plus_11 + this.ql);
        this.bt_block = (_bt_block + _plus_12);
        String _bt_block_1 = this.bt_block;
        XExpression _thenPart = e.getThenPart();
        String _splitExp = this.splitExp(((ObjectLiteralImpl) _thenPart));
        String _plus_13 = (_splitExp + this.ql);
        this.bt_block = (_bt_block_1 + _plus_13);
        String _bt_block_2 = this.bt_block;
        this.bt_block = (_bt_block_2 + ((this.ind1 + "}") + this.ql));
      }
      String _xifexpression = null;
      EClass _eClass_1 = e.eClass();
      String _name_5 = _eClass_1.getName();
      String _simpleName_1 = ButtonRule.class.getSimpleName();
      boolean _equals_1 = Objects.equal(_name_5, _simpleName_1);
      if (_equals_1) {
        String _xblockexpression_1 = null;
        {
          ButtonRuleImpl ruleClass = ((ButtonRuleImpl) e);
          String state = "HIGH";
          EList<String> _btnActions = ruleClass.getBtnActions();
          String _get = _btnActions.get(0);
          boolean _equals_2 = Objects.equal(_get, "FREE");
          if (_equals_2) {
            state = "LOW";
          }
          String _c_loop = this.c_loop;
          Button _superType_4 = ruleClass.getSuperType();
          String _name_6 = _superType_4.getName();
          String _plus_14 = ((this.ind1 + "if(") + _name_6);
          String _plus_15 = (_plus_14 + ".getState() == ");
          String _plus_16 = (_plus_15 + state);
          String _plus_17 = (_plus_16 + "){ ");
          String _plus_18 = (_plus_17 + this.ql);
          this.c_loop = (_c_loop + _plus_18);
          String _c_loop_1 = this.c_loop;
          XExpression _thenPart_1 = e.getThenPart();
          String _splitExp_1 = this.splitExp(((ObjectLiteralImpl) _thenPart_1));
          String _plus_19 = (_splitExp_1 + this.ql);
          this.c_loop = (_c_loop_1 + _plus_19);
          String _c_loop_2 = this.c_loop;
          _xblockexpression_1 = this.c_loop = (_c_loop_2 + ((this.ind1 + "}") + this.ql));
        }
        _xifexpression = _xblockexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public String splitExp(final ObjectLiteralImpl exp) {
    String s = "";
    EList<Methods> _expressions = exp.getExpressions();
    for (final Methods c : _expressions) {
      {
        if ((c instanceof LEDMethods)) {
          String _s = s;
          String _buildExp = this.buildExp(((LEDMethods)c));
          s = (_s + _buildExp);
        }
        if ((c instanceof MotorMethods)) {
          String _s_1 = s;
          String _buildExp_1 = this.buildExp(((MotorMethods)c));
          s = (_s_1 + _buildExp_1);
        }
      }
    }
    return s;
  }
  
  public String buildExp(final MotorMethods exp) {
    final MotorMethodsImpl x = ((MotorMethodsImpl) exp);
    Type _superType = x.getSuperType();
    String _name = _superType.getName();
    String _plus = (this.ind2 + _name);
    String _plus_1 = (_plus + ".");
    EList<String> _motorFunctions = x.getMotorFunctions();
    String _get = _motorFunctions.get(0);
    String _plus_2 = (_plus_1 + _get);
    String _plus_3 = (_plus_2 + "();");
    return (_plus_3 + this.ql);
  }
  
  public String buildExp(final LEDMethods exp) {
    final LEDMethodsImpl x = ((LEDMethodsImpl) exp);
    Type _superType = x.getSuperType();
    String _name = _superType.getName();
    String _plus = (this.ind2 + _name);
    String _plus_1 = (_plus + ".");
    EList<String> _ledFunctions = x.getLedFunctions();
    String _get = _ledFunctions.get(0);
    String _plus_2 = (_plus_1 + _get);
    String _plus_3 = (_plus_2 + "();");
    return (_plus_3 + this.ql);
  }
}
