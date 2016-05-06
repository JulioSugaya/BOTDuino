package org.xtext.botlib.dsl.handlers;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class generatorHandler extends AbstractHandler {
	
	protected static void execCmd(String cmd) {
		
		Process p;
		try {
			//teste
    	    File temp = File.createTempFile("i-am-a-temp-file", ".tmp" );
        	
    	    String absolutePath = temp.getAbsolutePath();
    	    System.out.println(absolutePath);
			//
			p = Runtime.getRuntime().exec(cmd);
			p.waitFor();
	
			String line;
	
			BufferedReader error = new BufferedReader(new InputStreamReader(p.getErrorStream()));
			while((line = error.readLine()) != null){
			    System.out.println(line);
			}
			error.close();
	
			BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
			while((line=input.readLine()) != null){
			    System.out.println(line);
			}
	
			input.close();
	
			OutputStream outputStream = p.getOutputStream();
			PrintStream printStream = new PrintStream(outputStream);
			printStream.println();
			printStream.flush();
			printStream.close();  
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		//./avr/bin/avrdude -C ./avr/etc/avrdude.conf -v -v -v -v -p atmega1280 -c arduino -P\\.\/dev/cu.usbserial-AH00PD34 -b 115200 -D -U flash:w: <path> test.cpp.hex:i
		execCmd("./avr/bin/avr-g++ -c -g -Os -w -fno-exceptions -ffunction-sections -fdata-sections -fno-threadsafe-statics -MMD -mmcu=atmega1280 -DF_CPU=16000000L -DARDUINO=10605 -DARDUINO_AVR_MEGA -DARDUINO_ARCH_AVR -I./lib/arduino -I./lib/arduino/variants/mega test.cpp -o ./temp/test.cpp.o");

      	execCmd("./avr/bin/avr-gcc -g -O -mmcu=atmega1280 -c test.ino");
        	
     	//execCmd("java -version");
        	
	}
	/**
	 * The constructor.
	 */
	public generatorHandler() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
//		String platformString = resource.getURI().toPlatformString(true);
//		IFile myFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(platformString));
		execCmd("./avr/bin/avr-g++ -c -g -Os -w -fno-exceptions -ffunction-sections -fdata-sections -fno-threadsafe-statics -MMD -mmcu=atmega1280 -DF_CPU=16000000L -DARDUINO=10605 -DARDUINO_AVR_MEGA -DARDUINO_ARCH_AVR -I./lib/arduino -I./lib/arduino/variants/mega test.cpp -o ./temp/test.cpp.o");
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		MessageDialog.openInformation(
				window.getShell(),
				"BotDuino",
				"Gravando no Arduino....");
		return null;
	}
}
