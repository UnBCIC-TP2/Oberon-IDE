/*
 * generated by Xtext 2.25.0
 */
package br.unb.cic.obron.ide.parser.antlr;

import br.unb.cic.obron.ide.parser.antlr.internal.InternalOberonParser;
import br.unb.cic.obron.ide.services.OberonGrammarAccess;
import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class OberonParser extends AbstractAntlrParser {

	@Inject
	private OberonGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalOberonParser createParser(XtextTokenStream stream) {
		return new InternalOberonParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Oberon";
	}

	public OberonGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(OberonGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
