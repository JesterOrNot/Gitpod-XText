/*
 * generated by Xtext 2.20.0
 */
package org.xtext.example.hello.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class HelloLanguageAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/example/hello/parser/antlr/internal/InternalHelloLanguage.tokens");
	}
}
