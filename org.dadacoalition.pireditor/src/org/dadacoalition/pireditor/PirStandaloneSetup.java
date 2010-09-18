
package org.dadacoalition.pireditor;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class PirStandaloneSetup extends PirStandaloneSetupGenerated{

	public static void doSetup() {
		new PirStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

