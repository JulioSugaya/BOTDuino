package org.eclipse.xtext.botlib.dsl.generator

import javax.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.botlib.dsl.botDuino.BTRule
import org.eclipse.xtext.botlib.dsl.botDuino.ButtonRule
import org.eclipse.xtext.botlib.dsl.botDuino.LEDMethods
import org.eclipse.xtext.botlib.dsl.botDuino.MotorMethods
import org.eclipse.xtext.botlib.dsl.botDuino.Rules
import org.eclipse.xtext.botlib.dsl.botDuino.Type
import org.eclipse.xtext.botlib.dsl.botDuino.impl.BTRuleImpl
import org.eclipse.xtext.botlib.dsl.botDuino.impl.BlueToothImpl
import org.eclipse.xtext.botlib.dsl.botDuino.impl.ButtonRuleImpl
import org.eclipse.xtext.botlib.dsl.botDuino.impl.LEDMethodsImpl
import org.eclipse.xtext.botlib.dsl.botDuino.impl.MotorMethodsImpl
import org.eclipse.xtext.botlib.dsl.botDuino.impl.ObjectLiteralImpl
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.botlib.dsl.botDuino.Variables
import org.eclipse.xtext.botlib.dsl.botDuino.Proc
import org.eclipse.xtext.botlib.dsl.botDuino.impl.ProcImpl
import org.eclipse.xtext.botlib.dsl.botDuino.CallProc
import org.eclipse.xtext.botlib.dsl.botDuino.Loop
import org.eclipse.xtext.botlib.dsl.botDuino.VarRule
import org.eclipse.xtext.botlib.dsl.botDuino.impl.VarRuleImpl
import org.eclipse.xtext.botlib.dsl.botDuino.AttrVar
import org.eclipse.xtext.botlib.dsl.botDuino.impl.AttrVarImpl
import org.eclipse.xtext.botlib.dsl.botDuino.SensorIRRule
import org.eclipse.xtext.botlib.dsl.botDuino.impl.SensorIRRuleImpl
import org.eclipse.xtext.botlib.dsl.botDuino.SensorSR04Rule
import org.eclipse.xtext.botlib.dsl.botDuino.impl.SensorSR04RuleImpl
import org.eclipse.xtext.botlib.dsl.botDuino.WaitMethod

class BotDuinoGenerator implements IGenerator {
	
	  @Inject extension IQualifiedNameProvider
	  
	var String ql = System.getProperty("line.separator")
	var String ind1 = "	"
	var String ind2 = "		"
	var String ind3 = "			"
	var String c_includes = "#include <BOTLib.h>" + ql
	var String c_vars = ""
	var String c_setup = "void setup() {" + ql
	var String c_loop = "void loop() {" + ql
	var String proc_block = ""
	var String bt_block = ""
	var String context = ""
	var String bt_test = ""
	  	  
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
	  	
	  	c_vars = ""
	  	bt_block = ""
	  	proc_block = ""
	  	c_setup = "void setup() {" + ql + ql
	  	c_loop = "void loop() {" + ql + ql
	  	context = ""
	  	bt_test = ""
	  	
	    for(e: resource.allContents.toIterable.filterNull) {
			e.process
	    }

     	c_loop += bt_block + ql
		context = c_includes + ql + c_vars + ql + c_setup + "}" + ql + proc_block + ql + c_loop + "}"
		fsa.deleteFile(resource.URI.lastSegment + ".cpp")
    	fsa.generateFile( resource.URI.lastSegment + ".cpp", context)
	}
	  
	// process whole grammar
	def process(EObject e){
	  	if(e instanceof Type){
	  		e.compile	
	  	}
	  	if(e instanceof Rules){
	  		e.compile	
	  	}
	  	if(e instanceof Variables){
	  		e.compile	
	  	}
	  	if(e instanceof Loop){
	  		e.compile	
	  	}
	}

	// Includes  
	// Instance & Vars
	def compile(Type e) {
		if(!(e instanceof Variables)){
		  	c_vars += '''«e.eClass.name» «e.name»(«e.values.join(",")»);''' + ql
		  	if(e instanceof BlueToothImpl){
		  		c_vars += '''String «e.name»Response = "";''' + ql
		  	}
	  	}
	}

	def compile(Variables e) {
	  	c_vars += '''byte «e.name» = «e.values.last»;''' + ql
	}

	def compile(Loop e) {
	  	
	  	c_loop += splitExp(e.thenPart as ObjectLiteralImpl) + ql

	}

	// Setup
	  
	// Loop
	  
	// Methods
	def compile(Rules e) {

		if(e.eClass.name == BTRule.simpleName){
			var btClass = e as BTRuleImpl
		  	if(bt_test != btClass.superType.name){
	    		bt_block += ind1 + '''«btClass.superType.name»Response = "";''' + ql
			  	bt_block += ind1 + '''if(«btClass.superType.name».received()){ '''+ ql
		  		bt_block += ind2 + '''while( «btClass.superType.name».received()){''' + ql
		  		bt_block += ind3 + '''«btClass.superType.name»Response += (char)«btClass.superType.name».read();''' + ql
		  		bt_block += ind2 + "}" + ql
		  		bt_block += ind1 + "}" + ql
		  		bt_test = btClass.superType.name
			}
		  	bt_block += ind1 + '''if( «btClass.superType.name»Response «btClass.op.get(0)» "«e.fullyQualifiedName»" ){''' + ql
		  	bt_block += splitExp(e.thenPart as ObjectLiteralImpl) + ql
		  	bt_block += ind1 + "}" + ql
		}
		if(e.eClass.name == ButtonRule.simpleName){
		  	var ruleClass = e as ButtonRuleImpl
		  	var state = "HIGH"
		  	if(ruleClass.actions.get(0) == "FREE"){
		  		 state = "LOW";
		  	}
			c_loop += ind1 + '''if( «ruleClass.superType.name».getState() «ruleClass.op.get(0)» «state» ){'''+ ql
			c_loop += splitExp(e.thenPart as ObjectLiteralImpl) + ql
			c_loop += ind1 + "}" + ql
		  		
		}
		if(e.eClass.name == SensorIRRule.simpleName){
		  	var ruleClass = e as SensorIRRuleImpl
		  	var state = "HIGH"
		  	if(ruleClass.actions.get(0) == "FOUND"){
		  		 state = "LOW";
		  	}
			c_loop += ind1 + '''if( «ruleClass.superType.name».getState() «ruleClass.op.get(0)» «state» ){'''+ ql
			c_loop += splitExp(e.thenPart as ObjectLiteralImpl) + ql
			c_loop += ind1 + "}" + ql
		  		
		}	  	
		if(e.eClass.name == SensorSR04Rule.simpleName){
		  	var ruleClass = e as SensorSR04RuleImpl
			c_loop += ind1 + '''if( «ruleClass.superType.name».getDistanceCM() «ruleClass.op.get(0)» «ruleClass.value.get(0)» ){'''+ ql
			c_loop += splitExp(e.thenPart as ObjectLiteralImpl) + ql
			c_loop += ind1 + "}" + ql
		  		
		}	  	
		if(e.eClass.name == Proc.simpleName){
			var proc = e as ProcImpl
			proc_block += '''void «proc.name»(){ '''+ ql
		  	proc_block += splitExp(e.thenPart as ObjectLiteralImpl) + ql
			proc_block += "}" + ql
		}
		if(e.eClass.name == VarRule.simpleName){
		  	var ruleClass = e as VarRuleImpl
			c_loop += ind1 + '''if( «ruleClass.superType.name» «ruleClass.op.get(0)» «ruleClass.values.get(0)» ){'''+ ql
			c_loop += splitExp(e.thenPart as ObjectLiteralImpl) + ql
			c_loop += ind1 + "}" + ql
		  		
		}	  	
	} 
	  
	def String splitExp(ObjectLiteralImpl exp){
	    var String s = ""
	  	for ( c : exp.expressions) {
	  		if(c instanceof LEDMethods){
	  			s += ind2 + c.buildExp()
	  		}
	  		if(c instanceof MotorMethods){
	  			s += ind2 + c.buildExp()
	  		}
	  		if(c instanceof CallProc){
	  			s += ind2 + c.superType.name + "();" + ql
	  		}
	  		if(c instanceof WaitMethod){
	  			s += ind2 + "delay(" + c.value.get(0).intValue * 1000 + ");" + ql
	  		}
	  		if(c instanceof AttrVar){
	  			s += ind2 + c.buildExp()
	  		}
	  	}
	  	return s
	}
	  
	def String buildExp(MotorMethods exp){
	  	val x = exp as MotorMethodsImpl
	  	var param = "()"
	  	if(x.value.size > 0){
	  		param = x.value.get(0) + ")"
	  	}
	  	return x.superType.name + "." + x.motorFunctions.get(0) + param + ";" + ql
	}
	  	  
    def String buildExp(LEDMethods exp){
	  	val x = exp as LEDMethodsImpl
	  	var param = "()"
	  	if(x.value.size > 0){
	  		param = x.value.get(0) + ")"
	  	}	  	
	  	return x.superType.name + "." + x.ledFunctions.get(0) + param + ";" + ql
	}
	  	  
    def String buildExp(AttrVar exp){
	  	val x = exp as AttrVarImpl
	  	return x.superType.name + " = " + x.values.get(0) + ";" + ql
	}
	
}