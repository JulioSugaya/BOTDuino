package org.eclipse.xtext.botlib.dsl;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
 
public class AboutHandler {
 

	public static void main(String[] args) {
	   Display display = new Display();
	   Shell shell = new Shell(display);
	   shell.open();
	   AboutHandler.execute(shell);
	   while( !shell.isDisposed() ) {
	      if( ! display.readAndDispatch() ) {
	         display.sleep();
	      }
	   }
	}
	
	  @Execute
	  public static void execute(Shell shell) {
	    MessageDialog.openInformation(shell, "First", "Hello, e4 API world");
	  }
}
