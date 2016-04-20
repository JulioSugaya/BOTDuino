package org.xtext.botlib.dsl.handlers;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.regex.Pattern;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

import jssc.SerialPort;
import jssc.SerialPortException;
import jssc.SerialPortList;

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
    	    //File temp = File.createTempFile("i-am-a-temp-file", ".tmp" );
        	
//    	    String absolutePath = temp.getAbsolutePath();
//    	    System.out.println(absolutePath);
			//
			System.out.println(cmd);
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
//		execCmd("./avr/bin/avr-g++ -c -g -Os -w -fno-exceptions -ffunction-sections -fdata-sections -fno-threadsafe-statics -MMD -mmcu=atmega1280 -DF_CPU=16000000L -DARDUINO=10605 -DARDUINO_AVR_MEGA -DARDUINO_ARCH_AVR -I./lib/arduino -I./lib/arduino/variants/mega test.cpp -o ./temp/test.cpp.o");
//
//      	execCmd("./avr/bin/avr-gcc -g -O -mmcu=atmega1280 -c test.ino");
//        	
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
		
		String avrPath = "/Users/juliosugaya/_projects_ccp/org.xtext.botlib.dsl";
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);

//		String[] portNames = SerialPortList.getPortNames();
//		System.out.println(portNames[0]);
//		SerialPort serialPort = new SerialPort(portNames[0]);
//		try {
//			serialPort.openPort();
//			serialPort.closePort();
//		} catch (SerialPortException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		// cpp file
		String cppPath = this.getFileProject();
		if(cppPath != ""){
			//System.out.println("meu cpp : " + cppPath);
			// /avr/bin/avr-g++ -c -g -Os -w -fno-exceptions -ffunction-sections -fdata-sections -fno-threadsafe-statics -MMD -mmcu=atmega1280 -DF_CPU=16000000L -DARDUINO=10605 -DARDUINO_AVR_MEGA -DARDUINO_ARCH_AVR -I./lib/arduino -I./lib/arduino/variants/mega -I./lib/arduino/Release -I./lib/SoftwareSerial ./teste.bot.cpp -o ./test.cpp.o
			execCmd( avrPath + "/hardware/tools/avr/bin/avr-g++ -c -g -Os -Wall -Wextra -fno-exceptions -ffunction-sections -fdata-sections -fno-threadsafe-statics -MMD -mmcu=atmega328p -DF_CPU=16000000L -DARDUINO=10605 -DARDUINO_AVR_NANO -DARDUINO_ARCH_AVR -I " + avrPath + "/Release -I " + avrPath + "/hardware/arduino/avr/cores/arduino -I " + avrPath + "/hardware/arduino/avr/variants/eightanaloginputs -I " + avrPath + "/hardware/arduino/avr/libraries/SoftwareSerial " + cppPath + " -o " + avrPath + "/test.cpp.o");
			// /avr/bin/avr-ar rcs ./arduino.ar ./lib/arduino/Release/BOTLib.cpp.o
			execCmd( avrPath + "/hardware/tools/avr/bin/avr-ar rcs " + avrPath + "/arduino.ar " + avrPath + "/Release/BOTLib.cpp.o");
			// /avr/bin/avr-ar rcs ./arduino.ar ./lib/arduino/Release/BlueTooth.cpp.o
			execCmd( avrPath + "/hardware/tools/avr/bin/avr-ar rcs " + avrPath + "/arduino.ar " + avrPath + "/Release/BlueTooth.cpp.o");
			// /avr/bin/avr-ar rcs ./arduino.ar ./lib/arduino/Release/LED.cpp.o
			execCmd( avrPath + "/hardware/tools/avr/bin/avr-ar rcs " + avrPath + "/arduino.ar " + avrPath + "/Release/LED.cpp.o");
			// /avr/bin/avr-ar rcs ./arduino.ar ./lib/arduino/Release/Motor.cpp.o
			execCmd( avrPath + "/hardware/tools/avr/bin/avr-ar rcs " + avrPath + "/arduino.ar " + avrPath + "/Release/Motor.cpp.o");
			// /avr/bin/avr-ar rcs ./arduino.ar ./lib/arduino/Release/Button.cpp.o
			execCmd( avrPath + "/hardware/tools/avr/bin/avr-ar rcs " + avrPath + "/arduino.ar " + avrPath + "/Release/Button.cpp.o");
			// /avr/bin/avr-ar rcs ./arduino.ar ./lib/arduino/Release/Debug.cpp.o
			execCmd( avrPath + "/hardware/tools/avr/bin/avr-ar rcs " + avrPath + "/arduino.ar " + avrPath + "/Release/Debug.cpp.o");
			// /avr/bin/avr-ar rcs ./arduino.ar ./lib/arduino/Release/Libraries/SoftwareSerial/SoftwareSerial.cpp.o
			execCmd( avrPath + "/hardware/tools/avr/bin/avr-ar rcs " + avrPath + "/arduino.ar " + avrPath + "/Release/Libraries/SoftwareSerial/SoftwareSerial.cpp.o");
			// /avr/bin/avr-gcc -w -Os -Wl,--gc-sections -mmcu=atmega1280 -o test.cpp.elf test.cpp.o arduino.ar -L -lm
			execCmd( avrPath + "/hardware/tools/avr/bin/avr-gcc -Wall -Wextra -Os -Wl,--gc-sections -mmcu=atmega328p -o " + avrPath + "/test.cpp.elf " + avrPath + "/test.cpp.o " + avrPath + "/arduino.ar -L -lm");
			// /avr/bin/avr-objcopy -O ihex -j .eeprom --set-section-flags=.eeprom=alloc,load --no-change-warnings --change-section-lma .eeprom=0 test.cpp.elf test.cpp.eep
			execCmd( avrPath + "/hardware/tools/avr/bin/avr-objcopy -O ihex -j .eeprom --set-section-flags=.eeprom=alloc,load --no-change-warnings --change-section-lma .eeprom=0 " + avrPath + "/test.cpp.elf " + avrPath + "/test.cpp.eep");
			// /avr/bin/avr-objcopy -O ihex -R .eeprom test.cpp.elf test.cpp.hex
			execCmd( avrPath + "/hardware/tools/avr/bin/avr-objcopy -O ihex -R .eeprom " + avrPath + "/test.cpp.elf " + avrPath + "/test.cpp.hex");
			// /avr/bin/avr-objcopy -O ihex -j .eeprom --set-section-flags=.eeprom=alloc,load --no-change-warnings --change-section-lma .eeprom=0 test.cpp.elf test.cpp.eep
			execCmd( avrPath + "/hardware/tools/avr/bin/avr-objcopy -O ihex -j .eeprom --set-section-flags=.eeprom=alloc,load --no-change-warnings --change-section-lma .eeprom=0 " + avrPath + "/test.cpp.elf " + avrPath + "/test.cpp.eep");
			// /avr/bin/avr-objcopy -O ihex -R .eeprom test.cpp.elf test.cpp.hex
			execCmd( avrPath + "/hardware/tools/avr/bin/avr-objcopy -O ihex -R .eeprom " + avrPath + "/test.cpp.elf " + avrPath + "/test.cpp.hex");
			// /avr/bin/avrdude -C./avr/etc/avrdude.conf -v -patmega1280 -carduino -P/dev/cu.usbserial-AH00PD34 -b57600 -D -Uflash:w:test.cpp.hex:i
			execCmd( avrPath + "/hardware/tools/avr/bin/avrdude -C" + avrPath + "/hardware/tools/avr/etc/avrdude.conf -v -patmega328p -carduino -P/dev/tty.usbserial-A9MP9FFZ -b57600 -D -Uflash:w:" + avrPath + "/test.cpp.hex:i");		
//			execCmd( avrPath + "/avr/bin/avrdude -C" + avrPath + "/avr/etc/avrdude.conf -v -patmega1280 -carduino -P" + portNames[0] + " -b57600 -D -Uflash:w:" + avrPath + "/test.cpp.hex:i");		
			
			MessageDialog.openInformation(
					window.getShell(),
					"BotDuino",
					"Uploded! Unplug the device.");
		}else{
			MessageDialog.openInformation(
					window.getShell(),
					"BotDuino",
					"No project selected!");
			
		}
		return null;
	}
	
	private String getFileProject(){
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		String fileName = "";
	    if (window != null)
	    {
	        IStructuredSelection selection = (IStructuredSelection) window.getSelectionService().getSelection();
	        if (!selection.isEmpty()){
		        Object firstElement = selection.getFirstElement();
		        if (firstElement instanceof IAdaptable)
		        {
		            IProject project = (IProject)((IAdaptable)firstElement).getAdapter(IProject.class);
		            IPath path = project.getLocation();
		            fileName = path.toString();
		        	final File folder = new File(fileName + "/src-gen/");
		        	fileName = listFilesForFolder(folder, ".cpp");
		        }
	        }
	    }
        return fileName;
	}
	
	public String listFilesForFolder(final File folder, String ext) {
		String file = "";
	    for (final File fileEntry : folder.listFiles()) {
	        if (fileEntry.isDirectory()) {
	            listFilesForFolder(fileEntry, ext);
	        } else {
	        	if(fileEntry.getName().endsWith(ext)){
	        		file = fileEntry.getName();
	        		break;
	        	}
	            //System.out.println(fileEntry.getName());
	        }
	    }
	    return folder + "/" + file;
	}

}