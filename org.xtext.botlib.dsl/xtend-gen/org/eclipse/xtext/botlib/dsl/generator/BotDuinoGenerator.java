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
import org.eclipse.xtext.botlib.dsl.botDuino.Registers;
import org.eclipse.xtext.botlib.dsl.botDuino.Rules;
import org.eclipse.xtext.botlib.dsl.botDuino.Type;
import org.eclipse.xtext.botlib.dsl.botDuino.impl.BTRuleImpl;
import org.eclipse.xtext.botlib.dsl.botDuino.impl.BlueToothImpl;
import org.eclipse.xtext.botlib.dsl.botDuino.impl.ButtonRuleImpl;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XMemberFeatureCall;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class BotDuinoGenerator implements IGenerator {
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  private String ql = System.getProperty("line.separator");
  
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
    this.context = (((((((this.c_includes + "\n\t\t") + this.c_vars) + "\n\t\t") + this.c_setup) + "}\n\t\t") + this.c_loop) + "}");
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
          String _plus = ("  if(" + _name_1);
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
        String _plus_8 = ("if(" + _name_4);
        String _plus_9 = (_plus_8 + "Response ==\'");
        QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(e);
        String _plus_10 = (_plus_9 + _fullyQualifiedName);
        String _plus_11 = (_plus_10 + "\'){");
        String _plus_12 = (_plus_11 + this.ql);
        this.bt_block = (_bt_block + _plus_12);
        String _bt_block_1 = this.bt_block;
        XExpression _thenPart = e.getThenPart();
        String _splitExp = this.splitExp(((XBlockExpression) _thenPart));
        String _plus_13 = (_splitExp + this.ql);
        this.bt_block = (_bt_block_1 + _plus_13);
        String _bt_block_2 = this.bt_block;
        this.bt_block = (_bt_block_2 + ("}" + this.ql));
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
          QualifiedName _fullyQualifiedName_1 = this._iQualifiedNameProvider.getFullyQualifiedName(e);
          boolean _equals_2 = Objects.equal(_fullyQualifiedName_1, "FREE");
          if (_equals_2) {
            state = "LOW";
          }
          String _c_loop = this.c_loop;
          Button _superType_4 = ruleClass.getSuperType();
          String _name_6 = _superType_4.getName();
          String _plus_14 = ("  if(" + _name_6);
          String _plus_15 = (_plus_14 + ".getState() == ");
          String _plus_16 = (_plus_15 + state);
          String _plus_17 = (_plus_16 + "){ ");
          String _plus_18 = (_plus_17 + this.ql);
          this.c_loop = (_c_loop + _plus_18);
          String _c_loop_1 = this.c_loop;
          XExpression _thenPart_1 = e.getThenPart();
          String _splitExp_1 = this.splitExp(((XBlockExpression) _thenPart_1));
          String _plus_19 = (_splitExp_1 + this.ql);
          this.c_loop = (_c_loop_1 + _plus_19);
          String _c_loop_2 = this.c_loop;
          _xblockexpression_1 = this.c_loop = (_c_loop_2 + ("}" + this.ql));
        }
        _xifexpression = _xblockexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public String splitExp(final XBlockExpression exp) {
    String s = "";
    EList<XExpression> _expressions = exp.getExpressions();
    for (final XExpression c : _expressions) {
      String _s = s;
      String _buildExp = this.buildExp(c);
      s = (_s + _buildExp);
    }
    return s;
  }
  
  public String buildExp(final XExpression exp) {
    final XMemberFeatureCall x = ((XMemberFeatureCall) exp);
    String _string = x.toString();
    String _string_1 = x.toString();
    int _indexOf = _string_1.indexOf(".");
    _string.substring(_indexOf);
    XExpression _memberCallTarget = x.getMemberCallTarget();
    String _string_2 = _memberCallTarget.toString();
    String _string_3 = x.toString();
    String _string_4 = x.toString();
    int _indexOf_1 = _string_4.indexOf(".");
    String _substring = _string_3.substring(_indexOf_1);
    String _plus = (_string_2 + _substring);
    String _plus_1 = (_plus + ";");
    return (_plus_1 + this.ql);
  }
}
