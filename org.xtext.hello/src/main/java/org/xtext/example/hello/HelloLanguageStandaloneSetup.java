/*
 * generated by Xtext 2.20.0
 */
package org.xtext.example.hello;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class HelloLanguageStandaloneSetup extends HelloLanguageStandaloneSetupGenerated {

	public static void doSetup() {
		new HelloLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
