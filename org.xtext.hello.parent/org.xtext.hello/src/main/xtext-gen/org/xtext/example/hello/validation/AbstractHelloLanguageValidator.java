/*
 * generated by Xtext 2.20.0
 */
package org.xtext.example.hello.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractHelloLanguageValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(org.xtext.example.hello.helloLanguage.HelloLanguagePackage.eINSTANCE);
		return result;
	}
}