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
import org.eclipse.xtext.botlib.dsl.botDuino.CallProc;
import org.eclipse.xtext.botlib.dsl.botDuino.LED;
import org.eclipse.xtext.botlib.dsl.botDuino.LEDMethods;
import org.eclipse.xtext.botlib.dsl.botDuino.Methods;
import org.eclipse.xtext.botlib.dsl.botDuino.MotorMethods;
import org.eclipse.xtext.botlib.dsl.botDuino.Proc;
import org.eclipse.xtext.botlib.dsl.botDuino.Rules;
import org.eclipse.xtext.botlib.dsl.botDuino.Type;
import org.eclipse.xtext.botlib.dsl.botDuino.Variables;
import org.eclipse.xtext.botlib.dsl.botDuino.impl.BTRuleImpl;
import org.eclipse.xtext.botlib.dsl.botDuino.impl.BlueToothImpl;
import org.eclipse.xtext.botlib.dsl.botDuino.impl.ButtonRuleImpl;
import org.eclipse.xtext.botlib.dsl.botDuino.impl.LEDMethodsImpl;
import org.eclipse.xtext.botlib.dsl.botDuino.impl.MotorMethodsImpl;
import org.eclipse.xtext.botlib.dsl.botDuino.impl.ObjectLiteralImpl;
import org.eclipse.xtext.botlib.dsl.botDuino.impl.ProcImpl;
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
  
  private String proc_block = "";
  
  private String bt_block = "";
  
  private String context = "";
  
  private String bt_test = "";
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    this.c_vars = "";
    this.bt_block = "";
    this.proc_block = "";
    this.c_setup = ("void setup() {" + this.ql);
    this.c_loop = ("void loop() {" + this.ql);
    this.context = "";
    this.bt_test = "";
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<EObject> _filterNull = IterableExtensions.<EObject>filterNull(_iterable);
    for (final EObject e : _filterNull) {
      this.process(e);
    }
    String _c_loop = this.c_loop;
    this.c_loop = (_c_loop + (this.bt_block + this.ql));
    this.context = ((((((((((this.c_includes + this.ql) + this.c_vars) + this.ql) + this.c_setup) + "}") + this.ql) + this.c_loop) + "}") + this.ql) + this.proc_block);
    URI _uRI = resource.getURI();
    String _lastSegment = _uRI.lastSegment();
    String _plus = (_lastSegment + ".cpp");
    fsa.deleteFile(_plus);
    URI _uRI_1 = resource.getURI();
    String _lastSegment_1 = _uRI_1.lastSegment();
    String _plus_1 = (_lastSegment_1 + ".cpp");
    fsa.generateFile(_plus_1, this.context);
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
      if ((e instanceof Variables)) {
        _xifexpression = this.compile(((Variables)e));
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
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("String ");
        String _name_2 = ((BlueToothImpl)e).getName();
        _builder_1.append(_name_2, "");
        _builder_1.append("Response = \"\";");
        String _plus_1 = (_builder_1.toString() + this.ql);
        _xifexpression = this.c_vars = (_c_vars_1 + _plus_1);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public String compile(final Variables e) {
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
        BlueTooth _superType = btClass.getSuperType();
        String _name_1 = _superType.getName();
        boolean _notEquals = (!Objects.equal(this.bt_test, _name_1));
        if (_notEquals) {
          String _bt_block = this.bt_block;
          StringConcatenation _builder = new StringConcatenation();
          BlueTooth _superType_1 = btClass.getSuperType();
          String _name_2 = _superType_1.getName();
          _builder.append(_name_2, "");
          _builder.append("Response = \"\";");
          String _plus = (this.ind1 + _builder);
          String _plus_1 = (_plus + this.ql);
          this.bt_block = (_bt_block + _plus_1);
          String _bt_block_1 = this.bt_block;
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("if(");
          BlueTooth _superType_2 = btClass.getSuperType();
          String _name_3 = _superType_2.getName();
          _builder_1.append(_name_3, "");
          _builder_1.append(".received()){ ");
          String _plus_2 = (this.ind1 + _builder_1);
          String _plus_3 = (_plus_2 + this.ql);
          this.bt_block = (_bt_block_1 + _plus_3);
          String _bt_block_2 = this.bt_block;
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("while( ");
          BlueTooth _superType_3 = btClass.getSuperType();
          String _name_4 = _superType_3.getName();
          _builder_2.append(_name_4, "");
          _builder_2.append(".received()){");
          String _plus_4 = (this.ind2 + _builder_2);
          String _plus_5 = (_plus_4 + this.ql);
          this.bt_block = (_bt_block_2 + _plus_5);
          String _bt_block_3 = this.bt_block;
          StringConcatenation _builder_3 = new StringConcatenation();
          BlueTooth _superType_4 = btClass.getSuperType();
          String _name_5 = _superType_4.getName();
          _builder_3.append(_name_5, "");
          _builder_3.append("Response += (char)");
          BlueTooth _superType_5 = btClass.getSuperType();
          String _name_6 = _superType_5.getName();
          _builder_3.append(_name_6, "");
          _builder_3.append(".read();");
          String _plus_6 = (this.ind3 + _builder_3);
          String _plus_7 = (_plus_6 + this.ql);
          this.bt_block = (_bt_block_3 + _plus_7);
          String _bt_block_4 = this.bt_block;
          this.bt_block = (_bt_block_4 + ((this.ind2 + "}") + this.ql));
          String _bt_block_5 = this.bt_block;
          this.bt_block = (_bt_block_5 + ((this.ind1 + "}") + this.ql));
          BlueTooth _superType_6 = btClass.getSuperType();
          String _name_7 = _superType_6.getName();
          this.bt_test = _name_7;
        }
        String _bt_block_6 = this.bt_block;
        StringConcatenation _builder_4 = new StringConcatenation();
        _builder_4.append("if( ");
        BlueTooth _superType_7 = btClass.getSuperType();
        String _name_8 = _superType_7.getName();
        _builder_4.append(_name_8, "");
        _builder_4.append("Response == \"");
        QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(e);
        _builder_4.append(_fullyQualifiedName, "");
        _builder_4.append("\" ){");
        String _plus_8 = (this.ind1 + _builder_4);
        String _plus_9 = (_plus_8 + this.ql);
        this.bt_block = (_bt_block_6 + _plus_9);
        String _bt_block_7 = this.bt_block;
        XExpression _thenPart = e.getThenPart();
        String _splitExp = this.splitExp(((ObjectLiteralImpl) _thenPart));
        String _plus_10 = (_splitExp + this.ql);
        this.bt_block = (_bt_block_7 + _plus_10);
        String _bt_block_8 = this.bt_block;
        this.bt_block = (_bt_block_8 + ((this.ind1 + "}") + this.ql));
      }
      EClass _eClass_1 = e.eClass();
      String _name_9 = _eClass_1.getName();
      String _simpleName_1 = ButtonRule.class.getSimpleName();
      boolean _equals_1 = Objects.equal(_name_9, _simpleName_1);
      if (_equals_1) {
        ButtonRuleImpl ruleClass = ((ButtonRuleImpl) e);
        String state = "HIGH";
        EList<String> _btnActions = ruleClass.getBtnActions();
        String _get = _btnActions.get(0);
        boolean _equals_2 = Objects.equal(_get, "FREE");
        if (_equals_2) {
          state = "LOW";
        }
        String _c_loop = this.c_loop;
        Button _superType_8 = ruleClass.getSuperType();
        String _name_10 = _superType_8.getName();
        String _plus_11 = ((this.ind1 + "if(") + _name_10);
        String _plus_12 = (_plus_11 + ".getState() == ");
        String _plus_13 = (_plus_12 + state);
        String _plus_14 = (_plus_13 + "){ ");
        String _plus_15 = (_plus_14 + this.ql);
        this.c_loop = (_c_loop + _plus_15);
        String _c_loop_1 = this.c_loop;
        XExpression _thenPart_1 = e.getThenPart();
        String _splitExp_1 = this.splitExp(((ObjectLiteralImpl) _thenPart_1));
        String _plus_16 = (_splitExp_1 + this.ql);
        this.c_loop = (_c_loop_1 + _plus_16);
        String _c_loop_2 = this.c_loop;
        this.c_loop = (_c_loop_2 + ((this.ind1 + "}") + this.ql));
      }
      String _xifexpression = null;
      EClass _eClass_2 = e.eClass();
      String _name_11 = _eClass_2.getName();
      String _simpleName_2 = Proc.class.getSimpleName();
      boolean _equals_3 = Objects.equal(_name_11, _simpleName_2);
      if (_equals_3) {
        String _xblockexpression_1 = null;
        {
          ProcImpl proc = ((ProcImpl) e);
          String _proc_block = this.proc_block;
          StringConcatenation _builder_5 = new StringConcatenation();
          _builder_5.append("void ");
          String _name_12 = proc.getName();
          _builder_5.append(_name_12, "");
          _builder_5.append("(){ ");
          String _plus_17 = (_builder_5.toString() + this.ql);
          this.proc_block = (_proc_block + _plus_17);
          String _proc_block_1 = this.proc_block;
          XExpression _thenPart_2 = e.getThenPart();
          String _splitExp_2 = this.splitExp(((ObjectLiteralImpl) _thenPart_2));
          String _plus_18 = (_splitExp_2 + this.ql);
          this.proc_block = (_proc_block_1 + _plus_18);
          String _proc_block_2 = this.proc_block;
          _xblockexpression_1 = this.proc_block = (_proc_block_2 + ("}" + this.ql));
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
          String _plus = (this.ind2 + _buildExp);
          s = (_s + _plus);
        }
        if ((c instanceof MotorMethods)) {
          String _s_1 = s;
          String _buildExp_1 = this.buildExp(((MotorMethods)c));
          String _plus_1 = (this.ind2 + _buildExp_1);
          s = (_s_1 + _plus_1);
        }
        if ((c instanceof CallProc)) {
          String _s_2 = s;
          Proc _superType = ((CallProc)c).getSuperType();
          String _name = _superType.getName();
          String _plus_2 = (this.ind2 + _name);
          String _plus_3 = (_plus_2 + "();");
          String _plus_4 = (_plus_3 + this.ql);
          s = (_s_2 + _plus_4);
        }
      }
    }
    return s;
  }
  
  public String buildExp(final MotorMethods exp) {
    final MotorMethodsImpl x = ((MotorMethodsImpl) exp);
    Type _superType = x.getSuperType();
    String _name = _superType.getName();
    String _plus = (_name + ".");
    EList<String> _motorFunctions = x.getMotorFunctions();
    String _get = _motorFunctions.get(0);
    String _plus_1 = (_plus + _get);
    String _plus_2 = (_plus_1 + "();");
    return (_plus_2 + this.ql);
  }
  
  public String buildExp(final LEDMethods exp) {
    final LEDMethodsImpl x = ((LEDMethodsImpl) exp);
    LED _superType = x.getSuperType();
    String _name = _superType.getName();
    String _plus = (_name + ".");
    EList<String> _ledFunctions = x.getLedFunctions();
    String _get = _ledFunctions.get(0);
    String _plus_1 = (_plus + _get);
    String _plus_2 = (_plus_1 + "();");
    return (_plus_2 + this.ql);
  }
}
