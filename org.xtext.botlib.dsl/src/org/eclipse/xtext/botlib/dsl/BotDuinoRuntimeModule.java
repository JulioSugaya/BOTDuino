/*
 * generated by Xtext
 */
package org.eclipse.xtext.botlib.dsl;

import org.eclipse.xtext.botlib.dsl.generator.BotDuinoGenerator;
import org.eclipse.xtext.generator.IGenerator;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class BotDuinoRuntimeModule extends org.eclipse.xtext.botlib.dsl.AbstractBotDuinoRuntimeModule {
	
	@Override
	public Class<? extends IGenerator> bindIGenerator() {
		return BotDuinoGenerator.class;
	}
	
}
