/*
 * generated by Xtext
 */
package org.eclipse.xtext.botlib.dsl;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class BotDuinoUiInjectorProvider implements IInjectorProvider {
	
	@Override
	public Injector getInjector() {
		return org.eclipse.xtext.botlib.dsl.ui.internal.BotDuinoActivator.getInstance().getInjector("org.eclipse.xtext.botlib.dsl.BotDuino");
	}
	
}