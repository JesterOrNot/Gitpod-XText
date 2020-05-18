/*
 * generated by Xtext 2.20.0
 */
package org.xtext.example.hello.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.hello.parser.antlr.internal.InternalHelloLanguageParser;
import org.xtext.example.hello.services.HelloLanguageGrammarAccess;

public class HelloLanguageParser extends AbstractAntlrParser {

	@Inject
	private HelloLanguageGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalHelloLanguageParser createParser(XtextTokenStream stream) {
		return new InternalHelloLanguageParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public HelloLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(HelloLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
