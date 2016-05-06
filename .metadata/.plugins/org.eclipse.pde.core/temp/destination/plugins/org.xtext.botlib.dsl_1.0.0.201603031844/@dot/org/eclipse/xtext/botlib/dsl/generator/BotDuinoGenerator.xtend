package org.eclipse.xtext.botlib.dsl.generator

import javax.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.botlib.dsl.botDuino.BTRule
import org.eclipse.xtext.botlib.dsl.botDuino.Registers
import org.eclipse.xtext.botlib.dsl.botDuino.Rules
import org.eclipse.xtext.botlib.dsl.botDuino.Type
import org.eclipse.xtext.botlib.dsl.botDuino.impl.BTRuleImpl
import org.eclipse.xtext.botlib.dsl.botDuino.impl.BlueToothImpl
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.xbase.XBlockExpression
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.XMemberFeatureCall

class BotDuinoGenerator implements IGenerator {
	
	  @Inject extension IQualifiedNameProvider
	  
	  var String ql = System.getProperty("line.separator")
	  var String c_includes = "#include <BOTLib.h>" + ql
	  var String c_vars = ""
	  var String c_setup = "void setup() {" + ql
	  var String c_loop = "void loop() {" + ql
	  var String bt_block = ""
	  var String context = ""
	  var boolean bt_test = false
	  	  
	  override void doGenerate(Resource resource, IFileSystemAccess fsa) {

	    for(e: resource.allContents.toIterable.filterNull) {
			e.process
	    }
	    //
	    if(bt_test){
	    	c_loop += bt_block + "}" + ql
	    }
		context = c_includes + "
		" + c_vars + "
		" + c_setup + "}
		" + c_loop + "}"
		//fsa.generateFile("BOTLib.h",resource.toString(Main.getResource("/XcD_PACKAGE.h"), Charsets.UTF_8));
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
	  	if(e instanceof Registers){
	  		e.compile	
	  	}
	  }

	  // Includes  
	  // Instance & Vars
	  def compile(Type e) {
	  	c_vars += '''«e.eClass.name» «e.name»(«e.values.join(",")»);''' + ql
	  	if(e instanceof BlueToothImpl){
	  		c_vars += "int " + e.name + "Response;" + ql
	  	}
	  }

	  def compile(Registers e) {
	  	c_vars += '''byte «e.name» = «e.values.last»;''' + ql

	  }

	  // Setup
	  
	  // Loop
	  
	  // Methods
	  def compile(Rules e) {
	  	if(e.eClass.name == BTRule.simpleName){
			var btClass = e as BTRuleImpl
	  		if(!bt_test){
		  	    bt_block = "  if(" + btClass.superType.name + ".available()){ "+ ql
    					 + btClass.superType.name + "Response = " + btClass.superType.name + ".read();" + ql
		  		bt_test = true
			}
	  		bt_block += "if(" + btClass.superType.name + "Response =='" + e.fullyQualifiedName + "'){" + ql
	  		bt_block += splitExp(e.thenPart as XBlockExpression) + ql
	  		bt_block += "}" + ql
	  	}
	  } 
	  
//	  def compile(Rules e) ''' 
//	    «IF e.eClass.name == BTRule.simpleName»
//	    	// bt_msg
//	    	«e.fullyQualifiedName»«ql»  
//	    	// cmd
//	    	«splitExp(e.thenPart as XBlockExpression)»«ql»
//	    «ENDIF»	    
//	  '''
	  
	  def String splitExp(XBlockExpression exp){
	  	var String s = ""
	  	for ( c : exp.expressions) {
	  		s += c.buildExp()
	  	}
	  	return s
	  }
	  
	  def String buildExp(XExpression exp){
	  	val x = exp as XMemberFeatureCall
	  	x.toString.substring(x.toString.indexOf("."))
	  	return x.memberCallTarget.toString + x.toString.substring(x.toString.indexOf(".")) + ";" + ql
	  }
	
}