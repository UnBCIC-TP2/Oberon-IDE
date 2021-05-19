package br.unb.cic.obron.ide.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import br.unb.cic.obron.ide.services.OberonGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOberonParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'True'", "'False'", "'='", "'#'", "'<'", "'<='", "'>'", "'>='", "'*'", "'/'", "'+'", "'-'", "'&&'", "'||'", "'MODULE'", "';'", "'END'", "'.'", "'BEGIN'", "'TYPE'", "'CONST'", "'VAR'", "'ARRAY'", "'OF'", "'RECORD'", "':'", "','", "'PROCEDURE'", "'('", "')'", "'['", "']'", "':='", "'readInt'", "'write'", "'IF'", "'THEN'", "'ELSIF'", "'ELSE'", "'WHILE'", "'DO'", "'REPEAT'", "'UNTIL'", "'FOR'", "'TO'", "'IN'", "'..'", "'LOOP'", "'RETURN'", "'CASE'", "'|'", "'INTEGER'", "'BOOLEAN'", "'EXIT'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalOberonParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalOberonParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalOberonParser.tokenNames; }
    public String getGrammarFileName() { return "InternalOberon.g"; }


    	private OberonGrammarAccess grammarAccess;

    	public void setGrammarAccess(OberonGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleOberon"
    // InternalOberon.g:53:1: entryRuleOberon : ruleOberon EOF ;
    public final void entryRuleOberon() throws RecognitionException {
        try {
            // InternalOberon.g:54:1: ( ruleOberon EOF )
            // InternalOberon.g:55:1: ruleOberon EOF
            {
             before(grammarAccess.getOberonRule()); 
            pushFollow(FOLLOW_1);
            ruleOberon();

            state._fsp--;

             after(grammarAccess.getOberonRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOberon"


    // $ANTLR start "ruleOberon"
    // InternalOberon.g:62:1: ruleOberon : ( ( rule__Oberon__Group__0 ) ) ;
    public final void ruleOberon() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:66:2: ( ( ( rule__Oberon__Group__0 ) ) )
            // InternalOberon.g:67:2: ( ( rule__Oberon__Group__0 ) )
            {
            // InternalOberon.g:67:2: ( ( rule__Oberon__Group__0 ) )
            // InternalOberon.g:68:3: ( rule__Oberon__Group__0 )
            {
             before(grammarAccess.getOberonAccess().getGroup()); 
            // InternalOberon.g:69:3: ( rule__Oberon__Group__0 )
            // InternalOberon.g:69:4: rule__Oberon__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Oberon__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOberonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOberon"


    // $ANTLR start "entryRuleBlock"
    // InternalOberon.g:78:1: entryRuleBlock : ruleBlock EOF ;
    public final void entryRuleBlock() throws RecognitionException {
        try {
            // InternalOberon.g:79:1: ( ruleBlock EOF )
            // InternalOberon.g:80:1: ruleBlock EOF
            {
             before(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getBlockRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalOberon.g:87:1: ruleBlock : ( ( rule__Block__Group__0 ) ) ;
    public final void ruleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:91:2: ( ( ( rule__Block__Group__0 ) ) )
            // InternalOberon.g:92:2: ( ( rule__Block__Group__0 ) )
            {
            // InternalOberon.g:92:2: ( ( rule__Block__Group__0 ) )
            // InternalOberon.g:93:3: ( rule__Block__Group__0 )
            {
             before(grammarAccess.getBlockAccess().getGroup()); 
            // InternalOberon.g:94:3: ( rule__Block__Group__0 )
            // InternalOberon.g:94:4: rule__Block__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleDeclarations"
    // InternalOberon.g:103:1: entryRuleDeclarations : ruleDeclarations EOF ;
    public final void entryRuleDeclarations() throws RecognitionException {
        try {
            // InternalOberon.g:104:1: ( ruleDeclarations EOF )
            // InternalOberon.g:105:1: ruleDeclarations EOF
            {
             before(grammarAccess.getDeclarationsRule()); 
            pushFollow(FOLLOW_1);
            ruleDeclarations();

            state._fsp--;

             after(grammarAccess.getDeclarationsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeclarations"


    // $ANTLR start "ruleDeclarations"
    // InternalOberon.g:112:1: ruleDeclarations : ( ( rule__Declarations__Group__0 ) ) ;
    public final void ruleDeclarations() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:116:2: ( ( ( rule__Declarations__Group__0 ) ) )
            // InternalOberon.g:117:2: ( ( rule__Declarations__Group__0 ) )
            {
            // InternalOberon.g:117:2: ( ( rule__Declarations__Group__0 ) )
            // InternalOberon.g:118:3: ( rule__Declarations__Group__0 )
            {
             before(grammarAccess.getDeclarationsAccess().getGroup()); 
            // InternalOberon.g:119:3: ( rule__Declarations__Group__0 )
            // InternalOberon.g:119:4: rule__Declarations__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Declarations__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclarations"


    // $ANTLR start "entryRuleUserTypeDeclaration"
    // InternalOberon.g:128:1: entryRuleUserTypeDeclaration : ruleUserTypeDeclaration EOF ;
    public final void entryRuleUserTypeDeclaration() throws RecognitionException {
        try {
            // InternalOberon.g:129:1: ( ruleUserTypeDeclaration EOF )
            // InternalOberon.g:130:1: ruleUserTypeDeclaration EOF
            {
             before(grammarAccess.getUserTypeDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleUserTypeDeclaration();

            state._fsp--;

             after(grammarAccess.getUserTypeDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUserTypeDeclaration"


    // $ANTLR start "ruleUserTypeDeclaration"
    // InternalOberon.g:137:1: ruleUserTypeDeclaration : ( ( rule__UserTypeDeclaration__Alternatives ) ) ;
    public final void ruleUserTypeDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:141:2: ( ( ( rule__UserTypeDeclaration__Alternatives ) ) )
            // InternalOberon.g:142:2: ( ( rule__UserTypeDeclaration__Alternatives ) )
            {
            // InternalOberon.g:142:2: ( ( rule__UserTypeDeclaration__Alternatives ) )
            // InternalOberon.g:143:3: ( rule__UserTypeDeclaration__Alternatives )
            {
             before(grammarAccess.getUserTypeDeclarationAccess().getAlternatives()); 
            // InternalOberon.g:144:3: ( rule__UserTypeDeclaration__Alternatives )
            // InternalOberon.g:144:4: rule__UserTypeDeclaration__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__UserTypeDeclaration__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUserTypeDeclarationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUserTypeDeclaration"


    // $ANTLR start "entryRuleConstant"
    // InternalOberon.g:153:1: entryRuleConstant : ruleConstant EOF ;
    public final void entryRuleConstant() throws RecognitionException {
        try {
            // InternalOberon.g:154:1: ( ruleConstant EOF )
            // InternalOberon.g:155:1: ruleConstant EOF
            {
             before(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_1);
            ruleConstant();

            state._fsp--;

             after(grammarAccess.getConstantRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalOberon.g:162:1: ruleConstant : ( ( rule__Constant__Group__0 ) ) ;
    public final void ruleConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:166:2: ( ( ( rule__Constant__Group__0 ) ) )
            // InternalOberon.g:167:2: ( ( rule__Constant__Group__0 ) )
            {
            // InternalOberon.g:167:2: ( ( rule__Constant__Group__0 ) )
            // InternalOberon.g:168:3: ( rule__Constant__Group__0 )
            {
             before(grammarAccess.getConstantAccess().getGroup()); 
            // InternalOberon.g:169:3: ( rule__Constant__Group__0 )
            // InternalOberon.g:169:4: rule__Constant__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Constant__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleVarDeclaration"
    // InternalOberon.g:178:1: entryRuleVarDeclaration : ruleVarDeclaration EOF ;
    public final void entryRuleVarDeclaration() throws RecognitionException {
        try {
            // InternalOberon.g:179:1: ( ruleVarDeclaration EOF )
            // InternalOberon.g:180:1: ruleVarDeclaration EOF
            {
             before(grammarAccess.getVarDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleVarDeclaration();

            state._fsp--;

             after(grammarAccess.getVarDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVarDeclaration"


    // $ANTLR start "ruleVarDeclaration"
    // InternalOberon.g:187:1: ruleVarDeclaration : ( ( rule__VarDeclaration__Group__0 ) ) ;
    public final void ruleVarDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:191:2: ( ( ( rule__VarDeclaration__Group__0 ) ) )
            // InternalOberon.g:192:2: ( ( rule__VarDeclaration__Group__0 ) )
            {
            // InternalOberon.g:192:2: ( ( rule__VarDeclaration__Group__0 ) )
            // InternalOberon.g:193:3: ( rule__VarDeclaration__Group__0 )
            {
             before(grammarAccess.getVarDeclarationAccess().getGroup()); 
            // InternalOberon.g:194:3: ( rule__VarDeclaration__Group__0 )
            // InternalOberon.g:194:4: rule__VarDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVarDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVarDeclaration"


    // $ANTLR start "entryRuleProcedure"
    // InternalOberon.g:203:1: entryRuleProcedure : ruleProcedure EOF ;
    public final void entryRuleProcedure() throws RecognitionException {
        try {
            // InternalOberon.g:204:1: ( ruleProcedure EOF )
            // InternalOberon.g:205:1: ruleProcedure EOF
            {
             before(grammarAccess.getProcedureRule()); 
            pushFollow(FOLLOW_1);
            ruleProcedure();

            state._fsp--;

             after(grammarAccess.getProcedureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProcedure"


    // $ANTLR start "ruleProcedure"
    // InternalOberon.g:212:1: ruleProcedure : ( ( rule__Procedure__Group__0 ) ) ;
    public final void ruleProcedure() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:216:2: ( ( ( rule__Procedure__Group__0 ) ) )
            // InternalOberon.g:217:2: ( ( rule__Procedure__Group__0 ) )
            {
            // InternalOberon.g:217:2: ( ( rule__Procedure__Group__0 ) )
            // InternalOberon.g:218:3: ( rule__Procedure__Group__0 )
            {
             before(grammarAccess.getProcedureAccess().getGroup()); 
            // InternalOberon.g:219:3: ( rule__Procedure__Group__0 )
            // InternalOberon.g:219:4: rule__Procedure__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Procedure__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcedureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProcedure"


    // $ANTLR start "entryRuleFormals"
    // InternalOberon.g:228:1: entryRuleFormals : ruleFormals EOF ;
    public final void entryRuleFormals() throws RecognitionException {
        try {
            // InternalOberon.g:229:1: ( ruleFormals EOF )
            // InternalOberon.g:230:1: ruleFormals EOF
            {
             before(grammarAccess.getFormalsRule()); 
            pushFollow(FOLLOW_1);
            ruleFormals();

            state._fsp--;

             after(grammarAccess.getFormalsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFormals"


    // $ANTLR start "ruleFormals"
    // InternalOberon.g:237:1: ruleFormals : ( ( rule__Formals__Group__0 ) ) ;
    public final void ruleFormals() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:241:2: ( ( ( rule__Formals__Group__0 ) ) )
            // InternalOberon.g:242:2: ( ( rule__Formals__Group__0 ) )
            {
            // InternalOberon.g:242:2: ( ( rule__Formals__Group__0 ) )
            // InternalOberon.g:243:3: ( rule__Formals__Group__0 )
            {
             before(grammarAccess.getFormalsAccess().getGroup()); 
            // InternalOberon.g:244:3: ( rule__Formals__Group__0 )
            // InternalOberon.g:244:4: rule__Formals__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Formals__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFormalsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFormals"


    // $ANTLR start "entryRuleFormalArg"
    // InternalOberon.g:253:1: entryRuleFormalArg : ruleFormalArg EOF ;
    public final void entryRuleFormalArg() throws RecognitionException {
        try {
            // InternalOberon.g:254:1: ( ruleFormalArg EOF )
            // InternalOberon.g:255:1: ruleFormalArg EOF
            {
             before(grammarAccess.getFormalArgRule()); 
            pushFollow(FOLLOW_1);
            ruleFormalArg();

            state._fsp--;

             after(grammarAccess.getFormalArgRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFormalArg"


    // $ANTLR start "ruleFormalArg"
    // InternalOberon.g:262:1: ruleFormalArg : ( ( rule__FormalArg__Group__0 ) ) ;
    public final void ruleFormalArg() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:266:2: ( ( ( rule__FormalArg__Group__0 ) ) )
            // InternalOberon.g:267:2: ( ( rule__FormalArg__Group__0 ) )
            {
            // InternalOberon.g:267:2: ( ( rule__FormalArg__Group__0 ) )
            // InternalOberon.g:268:3: ( rule__FormalArg__Group__0 )
            {
             before(grammarAccess.getFormalArgAccess().getGroup()); 
            // InternalOberon.g:269:3: ( rule__FormalArg__Group__0 )
            // InternalOberon.g:269:4: rule__FormalArg__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FormalArg__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFormalArgAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFormalArg"


    // $ANTLR start "entryRuleArguments"
    // InternalOberon.g:278:1: entryRuleArguments : ruleArguments EOF ;
    public final void entryRuleArguments() throws RecognitionException {
        try {
            // InternalOberon.g:279:1: ( ruleArguments EOF )
            // InternalOberon.g:280:1: ruleArguments EOF
            {
             before(grammarAccess.getArgumentsRule()); 
            pushFollow(FOLLOW_1);
            ruleArguments();

            state._fsp--;

             after(grammarAccess.getArgumentsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArguments"


    // $ANTLR start "ruleArguments"
    // InternalOberon.g:287:1: ruleArguments : ( ( rule__Arguments__Group__0 ) ) ;
    public final void ruleArguments() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:291:2: ( ( ( rule__Arguments__Group__0 ) ) )
            // InternalOberon.g:292:2: ( ( rule__Arguments__Group__0 ) )
            {
            // InternalOberon.g:292:2: ( ( rule__Arguments__Group__0 ) )
            // InternalOberon.g:293:3: ( rule__Arguments__Group__0 )
            {
             before(grammarAccess.getArgumentsAccess().getGroup()); 
            // InternalOberon.g:294:3: ( rule__Arguments__Group__0 )
            // InternalOberon.g:294:4: rule__Arguments__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Arguments__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArgumentsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArguments"


    // $ANTLR start "entryRuleExpression"
    // InternalOberon.g:303:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalOberon.g:304:1: ( ruleExpression EOF )
            // InternalOberon.g:305:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalOberon.g:312:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:316:2: ( ( ( rule__Expression__Group__0 ) ) )
            // InternalOberon.g:317:2: ( ( rule__Expression__Group__0 ) )
            {
            // InternalOberon.g:317:2: ( ( rule__Expression__Group__0 ) )
            // InternalOberon.g:318:3: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // InternalOberon.g:319:3: ( rule__Expression__Group__0 )
            // InternalOberon.g:319:4: rule__Expression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOperation"
    // InternalOberon.g:328:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // InternalOberon.g:329:1: ( ruleOperation EOF )
            // InternalOberon.g:330:1: ruleOperation EOF
            {
             before(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getOperationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalOberon.g:337:1: ruleOperation : ( ( rule__Operation__Alternatives ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:341:2: ( ( ( rule__Operation__Alternatives ) ) )
            // InternalOberon.g:342:2: ( ( rule__Operation__Alternatives ) )
            {
            // InternalOberon.g:342:2: ( ( rule__Operation__Alternatives ) )
            // InternalOberon.g:343:3: ( rule__Operation__Alternatives )
            {
             before(grammarAccess.getOperationAccess().getAlternatives()); 
            // InternalOberon.g:344:3: ( rule__Operation__Alternatives )
            // InternalOberon.g:344:4: rule__Operation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleTExpression"
    // InternalOberon.g:353:1: entryRuleTExpression : ruleTExpression EOF ;
    public final void entryRuleTExpression() throws RecognitionException {
        try {
            // InternalOberon.g:354:1: ( ruleTExpression EOF )
            // InternalOberon.g:355:1: ruleTExpression EOF
            {
             before(grammarAccess.getTExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleTExpression();

            state._fsp--;

             after(grammarAccess.getTExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTExpression"


    // $ANTLR start "ruleTExpression"
    // InternalOberon.g:362:1: ruleTExpression : ( ( rule__TExpression__Alternatives ) ) ;
    public final void ruleTExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:366:2: ( ( ( rule__TExpression__Alternatives ) ) )
            // InternalOberon.g:367:2: ( ( rule__TExpression__Alternatives ) )
            {
            // InternalOberon.g:367:2: ( ( rule__TExpression__Alternatives ) )
            // InternalOberon.g:368:3: ( rule__TExpression__Alternatives )
            {
             before(grammarAccess.getTExpressionAccess().getAlternatives()); 
            // InternalOberon.g:369:3: ( rule__TExpression__Alternatives )
            // InternalOberon.g:369:4: rule__TExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTExpression"


    // $ANTLR start "entryRuleStatement"
    // InternalOberon.g:378:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalOberon.g:379:1: ( ruleStatement EOF )
            // InternalOberon.g:380:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalOberon.g:387:1: ruleStatement : ( ( rule__Statement__Group__0 ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:391:2: ( ( ( rule__Statement__Group__0 ) ) )
            // InternalOberon.g:392:2: ( ( rule__Statement__Group__0 ) )
            {
            // InternalOberon.g:392:2: ( ( rule__Statement__Group__0 ) )
            // InternalOberon.g:393:3: ( rule__Statement__Group__0 )
            {
             before(grammarAccess.getStatementAccess().getGroup()); 
            // InternalOberon.g:394:3: ( rule__Statement__Group__0 )
            // InternalOberon.g:394:4: rule__Statement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleTStatement"
    // InternalOberon.g:403:1: entryRuleTStatement : ruleTStatement EOF ;
    public final void entryRuleTStatement() throws RecognitionException {
        try {
            // InternalOberon.g:404:1: ( ruleTStatement EOF )
            // InternalOberon.g:405:1: ruleTStatement EOF
            {
             before(grammarAccess.getTStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleTStatement();

            state._fsp--;

             after(grammarAccess.getTStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTStatement"


    // $ANTLR start "ruleTStatement"
    // InternalOberon.g:412:1: ruleTStatement : ( ( rule__TStatement__Alternatives ) ) ;
    public final void ruleTStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:416:2: ( ( ( rule__TStatement__Alternatives ) ) )
            // InternalOberon.g:417:2: ( ( rule__TStatement__Alternatives ) )
            {
            // InternalOberon.g:417:2: ( ( rule__TStatement__Alternatives ) )
            // InternalOberon.g:418:3: ( rule__TStatement__Alternatives )
            {
             before(grammarAccess.getTStatementAccess().getAlternatives()); 
            // InternalOberon.g:419:3: ( rule__TStatement__Alternatives )
            // InternalOberon.g:419:4: rule__TStatement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TStatement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTStatement"


    // $ANTLR start "entryRuleDesignator"
    // InternalOberon.g:428:1: entryRuleDesignator : ruleDesignator EOF ;
    public final void entryRuleDesignator() throws RecognitionException {
        try {
            // InternalOberon.g:429:1: ( ruleDesignator EOF )
            // InternalOberon.g:430:1: ruleDesignator EOF
            {
             before(grammarAccess.getDesignatorRule()); 
            pushFollow(FOLLOW_1);
            ruleDesignator();

            state._fsp--;

             after(grammarAccess.getDesignatorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDesignator"


    // $ANTLR start "ruleDesignator"
    // InternalOberon.g:437:1: ruleDesignator : ( ( rule__Designator__Group__0 ) ) ;
    public final void ruleDesignator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:441:2: ( ( ( rule__Designator__Group__0 ) ) )
            // InternalOberon.g:442:2: ( ( rule__Designator__Group__0 ) )
            {
            // InternalOberon.g:442:2: ( ( rule__Designator__Group__0 ) )
            // InternalOberon.g:443:3: ( rule__Designator__Group__0 )
            {
             before(grammarAccess.getDesignatorAccess().getGroup()); 
            // InternalOberon.g:444:3: ( rule__Designator__Group__0 )
            // InternalOberon.g:444:4: rule__Designator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Designator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDesignatorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDesignator"


    // $ANTLR start "entryRuleTDesignator"
    // InternalOberon.g:453:1: entryRuleTDesignator : ruleTDesignator EOF ;
    public final void entryRuleTDesignator() throws RecognitionException {
        try {
            // InternalOberon.g:454:1: ( ruleTDesignator EOF )
            // InternalOberon.g:455:1: ruleTDesignator EOF
            {
             before(grammarAccess.getTDesignatorRule()); 
            pushFollow(FOLLOW_1);
            ruleTDesignator();

            state._fsp--;

             after(grammarAccess.getTDesignatorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTDesignator"


    // $ANTLR start "ruleTDesignator"
    // InternalOberon.g:462:1: ruleTDesignator : ( ( rule__TDesignator__Group__0 ) ) ;
    public final void ruleTDesignator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:466:2: ( ( ( rule__TDesignator__Group__0 ) ) )
            // InternalOberon.g:467:2: ( ( rule__TDesignator__Group__0 ) )
            {
            // InternalOberon.g:467:2: ( ( rule__TDesignator__Group__0 ) )
            // InternalOberon.g:468:3: ( rule__TDesignator__Group__0 )
            {
             before(grammarAccess.getTDesignatorAccess().getGroup()); 
            // InternalOberon.g:469:3: ( rule__TDesignator__Group__0 )
            // InternalOberon.g:469:4: rule__TDesignator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TDesignator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTDesignatorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTDesignator"


    // $ANTLR start "entryRulecaseAlternative"
    // InternalOberon.g:478:1: entryRulecaseAlternative : rulecaseAlternative EOF ;
    public final void entryRulecaseAlternative() throws RecognitionException {
        try {
            // InternalOberon.g:479:1: ( rulecaseAlternative EOF )
            // InternalOberon.g:480:1: rulecaseAlternative EOF
            {
             before(grammarAccess.getCaseAlternativeRule()); 
            pushFollow(FOLLOW_1);
            rulecaseAlternative();

            state._fsp--;

             after(grammarAccess.getCaseAlternativeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulecaseAlternative"


    // $ANTLR start "rulecaseAlternative"
    // InternalOberon.g:487:1: rulecaseAlternative : ( ( rule__CaseAlternative__Group__0 ) ) ;
    public final void rulecaseAlternative() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:491:2: ( ( ( rule__CaseAlternative__Group__0 ) ) )
            // InternalOberon.g:492:2: ( ( rule__CaseAlternative__Group__0 ) )
            {
            // InternalOberon.g:492:2: ( ( rule__CaseAlternative__Group__0 ) )
            // InternalOberon.g:493:3: ( rule__CaseAlternative__Group__0 )
            {
             before(grammarAccess.getCaseAlternativeAccess().getGroup()); 
            // InternalOberon.g:494:3: ( rule__CaseAlternative__Group__0 )
            // InternalOberon.g:494:4: rule__CaseAlternative__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CaseAlternative__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCaseAlternativeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulecaseAlternative"


    // $ANTLR start "entryRuleelseIfStmt"
    // InternalOberon.g:503:1: entryRuleelseIfStmt : ruleelseIfStmt EOF ;
    public final void entryRuleelseIfStmt() throws RecognitionException {
        try {
            // InternalOberon.g:504:1: ( ruleelseIfStmt EOF )
            // InternalOberon.g:505:1: ruleelseIfStmt EOF
            {
             before(grammarAccess.getElseIfStmtRule()); 
            pushFollow(FOLLOW_1);
            ruleelseIfStmt();

            state._fsp--;

             after(grammarAccess.getElseIfStmtRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleelseIfStmt"


    // $ANTLR start "ruleelseIfStmt"
    // InternalOberon.g:512:1: ruleelseIfStmt : ( ( rule__ElseIfStmt__Group__0 ) ) ;
    public final void ruleelseIfStmt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:516:2: ( ( ( rule__ElseIfStmt__Group__0 ) ) )
            // InternalOberon.g:517:2: ( ( rule__ElseIfStmt__Group__0 ) )
            {
            // InternalOberon.g:517:2: ( ( rule__ElseIfStmt__Group__0 ) )
            // InternalOberon.g:518:3: ( rule__ElseIfStmt__Group__0 )
            {
             before(grammarAccess.getElseIfStmtAccess().getGroup()); 
            // InternalOberon.g:519:3: ( rule__ElseIfStmt__Group__0 )
            // InternalOberon.g:519:4: rule__ElseIfStmt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ElseIfStmt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElseIfStmtAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleelseIfStmt"


    // $ANTLR start "entryRuleOberonType"
    // InternalOberon.g:528:1: entryRuleOberonType : ruleOberonType EOF ;
    public final void entryRuleOberonType() throws RecognitionException {
        try {
            // InternalOberon.g:529:1: ( ruleOberonType EOF )
            // InternalOberon.g:530:1: ruleOberonType EOF
            {
             before(grammarAccess.getOberonTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleOberonType();

            state._fsp--;

             after(grammarAccess.getOberonTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOberonType"


    // $ANTLR start "ruleOberonType"
    // InternalOberon.g:537:1: ruleOberonType : ( ( rule__OberonType__Alternatives ) ) ;
    public final void ruleOberonType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:541:2: ( ( ( rule__OberonType__Alternatives ) ) )
            // InternalOberon.g:542:2: ( ( rule__OberonType__Alternatives ) )
            {
            // InternalOberon.g:542:2: ( ( rule__OberonType__Alternatives ) )
            // InternalOberon.g:543:3: ( rule__OberonType__Alternatives )
            {
             before(grammarAccess.getOberonTypeAccess().getAlternatives()); 
            // InternalOberon.g:544:3: ( rule__OberonType__Alternatives )
            // InternalOberon.g:544:4: rule__OberonType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OberonType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOberonTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOberonType"


    // $ANTLR start "entryRuleIntValue"
    // InternalOberon.g:553:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // InternalOberon.g:554:1: ( ruleIntValue EOF )
            // InternalOberon.g:555:1: ruleIntValue EOF
            {
             before(grammarAccess.getIntValueRule()); 
            pushFollow(FOLLOW_1);
            ruleIntValue();

            state._fsp--;

             after(grammarAccess.getIntValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // InternalOberon.g:562:1: ruleIntValue : ( RULE_INT ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:566:2: ( ( RULE_INT ) )
            // InternalOberon.g:567:2: ( RULE_INT )
            {
            // InternalOberon.g:567:2: ( RULE_INT )
            // InternalOberon.g:568:3: RULE_INT
            {
             before(grammarAccess.getIntValueAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntValueAccess().getINTTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleBoolValue"
    // InternalOberon.g:578:1: entryRuleBoolValue : ruleBoolValue EOF ;
    public final void entryRuleBoolValue() throws RecognitionException {
        try {
            // InternalOberon.g:579:1: ( ruleBoolValue EOF )
            // InternalOberon.g:580:1: ruleBoolValue EOF
            {
             before(grammarAccess.getBoolValueRule()); 
            pushFollow(FOLLOW_1);
            ruleBoolValue();

            state._fsp--;

             after(grammarAccess.getBoolValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBoolValue"


    // $ANTLR start "ruleBoolValue"
    // InternalOberon.g:587:1: ruleBoolValue : ( ( rule__BoolValue__Alternatives ) ) ;
    public final void ruleBoolValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:591:2: ( ( ( rule__BoolValue__Alternatives ) ) )
            // InternalOberon.g:592:2: ( ( rule__BoolValue__Alternatives ) )
            {
            // InternalOberon.g:592:2: ( ( rule__BoolValue__Alternatives ) )
            // InternalOberon.g:593:3: ( rule__BoolValue__Alternatives )
            {
             before(grammarAccess.getBoolValueAccess().getAlternatives()); 
            // InternalOberon.g:594:3: ( rule__BoolValue__Alternatives )
            // InternalOberon.g:594:4: rule__BoolValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BoolValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBoolValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoolValue"


    // $ANTLR start "entryRuleTRUE"
    // InternalOberon.g:603:1: entryRuleTRUE : ruleTRUE EOF ;
    public final void entryRuleTRUE() throws RecognitionException {
        try {
            // InternalOberon.g:604:1: ( ruleTRUE EOF )
            // InternalOberon.g:605:1: ruleTRUE EOF
            {
             before(grammarAccess.getTRUERule()); 
            pushFollow(FOLLOW_1);
            ruleTRUE();

            state._fsp--;

             after(grammarAccess.getTRUERule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTRUE"


    // $ANTLR start "ruleTRUE"
    // InternalOberon.g:612:1: ruleTRUE : ( 'True' ) ;
    public final void ruleTRUE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:616:2: ( ( 'True' ) )
            // InternalOberon.g:617:2: ( 'True' )
            {
            // InternalOberon.g:617:2: ( 'True' )
            // InternalOberon.g:618:3: 'True'
            {
             before(grammarAccess.getTRUEAccess().getTrueKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getTRUEAccess().getTrueKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTRUE"


    // $ANTLR start "entryRuleFALSE"
    // InternalOberon.g:628:1: entryRuleFALSE : ruleFALSE EOF ;
    public final void entryRuleFALSE() throws RecognitionException {
        try {
            // InternalOberon.g:629:1: ( ruleFALSE EOF )
            // InternalOberon.g:630:1: ruleFALSE EOF
            {
             before(grammarAccess.getFALSERule()); 
            pushFollow(FOLLOW_1);
            ruleFALSE();

            state._fsp--;

             after(grammarAccess.getFALSERule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFALSE"


    // $ANTLR start "ruleFALSE"
    // InternalOberon.g:637:1: ruleFALSE : ( 'False' ) ;
    public final void ruleFALSE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:641:2: ( ( 'False' ) )
            // InternalOberon.g:642:2: ( 'False' )
            {
            // InternalOberon.g:642:2: ( 'False' )
            // InternalOberon.g:643:3: 'False'
            {
             before(grammarAccess.getFALSEAccess().getFalseKeyword()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getFALSEAccess().getFalseKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFALSE"


    // $ANTLR start "rule__UserTypeDeclaration__Alternatives"
    // InternalOberon.g:652:1: rule__UserTypeDeclaration__Alternatives : ( ( ( rule__UserTypeDeclaration__Group_0__0 ) ) | ( ( rule__UserTypeDeclaration__Group_1__0 ) ) );
    public final void rule__UserTypeDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:656:1: ( ( ( rule__UserTypeDeclaration__Group_0__0 ) ) | ( ( rule__UserTypeDeclaration__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==13) ) {
                    int LA1_2 = input.LA(3);

                    if ( (LA1_2==35) ) {
                        alt1=2;
                    }
                    else if ( (LA1_2==33) ) {
                        alt1=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalOberon.g:657:2: ( ( rule__UserTypeDeclaration__Group_0__0 ) )
                    {
                    // InternalOberon.g:657:2: ( ( rule__UserTypeDeclaration__Group_0__0 ) )
                    // InternalOberon.g:658:3: ( rule__UserTypeDeclaration__Group_0__0 )
                    {
                     before(grammarAccess.getUserTypeDeclarationAccess().getGroup_0()); 
                    // InternalOberon.g:659:3: ( rule__UserTypeDeclaration__Group_0__0 )
                    // InternalOberon.g:659:4: rule__UserTypeDeclaration__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UserTypeDeclaration__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUserTypeDeclarationAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOberon.g:663:2: ( ( rule__UserTypeDeclaration__Group_1__0 ) )
                    {
                    // InternalOberon.g:663:2: ( ( rule__UserTypeDeclaration__Group_1__0 ) )
                    // InternalOberon.g:664:3: ( rule__UserTypeDeclaration__Group_1__0 )
                    {
                     before(grammarAccess.getUserTypeDeclarationAccess().getGroup_1()); 
                    // InternalOberon.g:665:3: ( rule__UserTypeDeclaration__Group_1__0 )
                    // InternalOberon.g:665:4: rule__UserTypeDeclaration__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UserTypeDeclaration__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUserTypeDeclarationAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserTypeDeclaration__Alternatives"


    // $ANTLR start "rule__Operation__Alternatives"
    // InternalOberon.g:673:1: rule__Operation__Alternatives : ( ( ( rule__Operation__OperationRelacionalAssignment_0 ) ) | ( ( rule__Operation__OperationAritmeticAssignment_1 ) ) | ( ( rule__Operation__OperationLogicAssignment_2 ) ) );
    public final void rule__Operation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:677:1: ( ( ( rule__Operation__OperationRelacionalAssignment_0 ) ) | ( ( rule__Operation__OperationAritmeticAssignment_1 ) ) | ( ( rule__Operation__OperationLogicAssignment_2 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                {
                alt2=1;
                }
                break;
            case 19:
            case 20:
            case 21:
            case 22:
                {
                alt2=2;
                }
                break;
            case 23:
            case 24:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalOberon.g:678:2: ( ( rule__Operation__OperationRelacionalAssignment_0 ) )
                    {
                    // InternalOberon.g:678:2: ( ( rule__Operation__OperationRelacionalAssignment_0 ) )
                    // InternalOberon.g:679:3: ( rule__Operation__OperationRelacionalAssignment_0 )
                    {
                     before(grammarAccess.getOperationAccess().getOperationRelacionalAssignment_0()); 
                    // InternalOberon.g:680:3: ( rule__Operation__OperationRelacionalAssignment_0 )
                    // InternalOberon.g:680:4: rule__Operation__OperationRelacionalAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operation__OperationRelacionalAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOperationAccess().getOperationRelacionalAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOberon.g:684:2: ( ( rule__Operation__OperationAritmeticAssignment_1 ) )
                    {
                    // InternalOberon.g:684:2: ( ( rule__Operation__OperationAritmeticAssignment_1 ) )
                    // InternalOberon.g:685:3: ( rule__Operation__OperationAritmeticAssignment_1 )
                    {
                     before(grammarAccess.getOperationAccess().getOperationAritmeticAssignment_1()); 
                    // InternalOberon.g:686:3: ( rule__Operation__OperationAritmeticAssignment_1 )
                    // InternalOberon.g:686:4: rule__Operation__OperationAritmeticAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operation__OperationAritmeticAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getOperationAccess().getOperationAritmeticAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOberon.g:690:2: ( ( rule__Operation__OperationLogicAssignment_2 ) )
                    {
                    // InternalOberon.g:690:2: ( ( rule__Operation__OperationLogicAssignment_2 ) )
                    // InternalOberon.g:691:3: ( rule__Operation__OperationLogicAssignment_2 )
                    {
                     before(grammarAccess.getOperationAccess().getOperationLogicAssignment_2()); 
                    // InternalOberon.g:692:3: ( rule__Operation__OperationLogicAssignment_2 )
                    // InternalOberon.g:692:4: rule__Operation__OperationLogicAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operation__OperationLogicAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getOperationAccess().getOperationLogicAssignment_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Alternatives"


    // $ANTLR start "rule__Operation__OperationRelacionalAlternatives_0_0"
    // InternalOberon.g:700:1: rule__Operation__OperationRelacionalAlternatives_0_0 : ( ( '=' ) | ( '#' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) );
    public final void rule__Operation__OperationRelacionalAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:704:1: ( ( '=' ) | ( '#' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case 14:
                {
                alt3=2;
                }
                break;
            case 15:
                {
                alt3=3;
                }
                break;
            case 16:
                {
                alt3=4;
                }
                break;
            case 17:
                {
                alt3=5;
                }
                break;
            case 18:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalOberon.g:705:2: ( '=' )
                    {
                    // InternalOberon.g:705:2: ( '=' )
                    // InternalOberon.g:706:3: '='
                    {
                     before(grammarAccess.getOperationAccess().getOperationRelacionalEqualsSignKeyword_0_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getOperationAccess().getOperationRelacionalEqualsSignKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOberon.g:711:2: ( '#' )
                    {
                    // InternalOberon.g:711:2: ( '#' )
                    // InternalOberon.g:712:3: '#'
                    {
                     before(grammarAccess.getOperationAccess().getOperationRelacionalNumberSignKeyword_0_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getOperationAccess().getOperationRelacionalNumberSignKeyword_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOberon.g:717:2: ( '<' )
                    {
                    // InternalOberon.g:717:2: ( '<' )
                    // InternalOberon.g:718:3: '<'
                    {
                     before(grammarAccess.getOperationAccess().getOperationRelacionalLessThanSignKeyword_0_0_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getOperationAccess().getOperationRelacionalLessThanSignKeyword_0_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalOberon.g:723:2: ( '<=' )
                    {
                    // InternalOberon.g:723:2: ( '<=' )
                    // InternalOberon.g:724:3: '<='
                    {
                     before(grammarAccess.getOperationAccess().getOperationRelacionalLessThanSignEqualsSignKeyword_0_0_3()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getOperationAccess().getOperationRelacionalLessThanSignEqualsSignKeyword_0_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalOberon.g:729:2: ( '>' )
                    {
                    // InternalOberon.g:729:2: ( '>' )
                    // InternalOberon.g:730:3: '>'
                    {
                     before(grammarAccess.getOperationAccess().getOperationRelacionalGreaterThanSignKeyword_0_0_4()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getOperationAccess().getOperationRelacionalGreaterThanSignKeyword_0_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalOberon.g:735:2: ( '>=' )
                    {
                    // InternalOberon.g:735:2: ( '>=' )
                    // InternalOberon.g:736:3: '>='
                    {
                     before(grammarAccess.getOperationAccess().getOperationRelacionalGreaterThanSignEqualsSignKeyword_0_0_5()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getOperationAccess().getOperationRelacionalGreaterThanSignEqualsSignKeyword_0_0_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__OperationRelacionalAlternatives_0_0"


    // $ANTLR start "rule__Operation__OperationAritmeticAlternatives_1_0"
    // InternalOberon.g:745:1: rule__Operation__OperationAritmeticAlternatives_1_0 : ( ( '*' ) | ( '/' ) | ( '+' ) | ( '-' ) );
    public final void rule__Operation__OperationAritmeticAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:749:1: ( ( '*' ) | ( '/' ) | ( '+' ) | ( '-' ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt4=1;
                }
                break;
            case 20:
                {
                alt4=2;
                }
                break;
            case 21:
                {
                alt4=3;
                }
                break;
            case 22:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalOberon.g:750:2: ( '*' )
                    {
                    // InternalOberon.g:750:2: ( '*' )
                    // InternalOberon.g:751:3: '*'
                    {
                     before(grammarAccess.getOperationAccess().getOperationAritmeticAsteriskKeyword_1_0_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getOperationAccess().getOperationAritmeticAsteriskKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOberon.g:756:2: ( '/' )
                    {
                    // InternalOberon.g:756:2: ( '/' )
                    // InternalOberon.g:757:3: '/'
                    {
                     before(grammarAccess.getOperationAccess().getOperationAritmeticSolidusKeyword_1_0_1()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getOperationAccess().getOperationAritmeticSolidusKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOberon.g:762:2: ( '+' )
                    {
                    // InternalOberon.g:762:2: ( '+' )
                    // InternalOberon.g:763:3: '+'
                    {
                     before(grammarAccess.getOperationAccess().getOperationAritmeticPlusSignKeyword_1_0_2()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getOperationAccess().getOperationAritmeticPlusSignKeyword_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalOberon.g:768:2: ( '-' )
                    {
                    // InternalOberon.g:768:2: ( '-' )
                    // InternalOberon.g:769:3: '-'
                    {
                     before(grammarAccess.getOperationAccess().getOperationAritmeticHyphenMinusKeyword_1_0_3()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getOperationAccess().getOperationAritmeticHyphenMinusKeyword_1_0_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__OperationAritmeticAlternatives_1_0"


    // $ANTLR start "rule__Operation__OperationLogicAlternatives_2_0"
    // InternalOberon.g:778:1: rule__Operation__OperationLogicAlternatives_2_0 : ( ( '&&' ) | ( '||' ) );
    public final void rule__Operation__OperationLogicAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:782:1: ( ( '&&' ) | ( '||' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            else if ( (LA5_0==24) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalOberon.g:783:2: ( '&&' )
                    {
                    // InternalOberon.g:783:2: ( '&&' )
                    // InternalOberon.g:784:3: '&&'
                    {
                     before(grammarAccess.getOperationAccess().getOperationLogicAmpersandAmpersandKeyword_2_0_0()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getOperationAccess().getOperationLogicAmpersandAmpersandKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOberon.g:789:2: ( '||' )
                    {
                    // InternalOberon.g:789:2: ( '||' )
                    // InternalOberon.g:790:3: '||'
                    {
                     before(grammarAccess.getOperationAccess().getOperationLogicVerticalLineVerticalLineKeyword_2_0_1()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getOperationAccess().getOperationLogicVerticalLineVerticalLineKeyword_2_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__OperationLogicAlternatives_2_0"


    // $ANTLR start "rule__TExpression__Alternatives"
    // InternalOberon.g:799:1: rule__TExpression__Alternatives : ( ( ( rule__TExpression__Group_0__0 ) ) | ( ( rule__TExpression__IntvalueAssignment_1 ) ) | ( ( rule__TExpression__BoolvalueAssignment_2 ) ) | ( ( rule__TExpression__Group_3__0 ) ) );
    public final void rule__TExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:803:1: ( ( ( rule__TExpression__Group_0__0 ) ) | ( ( rule__TExpression__IntvalueAssignment_1 ) ) | ( ( rule__TExpression__BoolvalueAssignment_2 ) ) | ( ( rule__TExpression__Group_3__0 ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt6=1;
                }
                break;
            case RULE_INT:
                {
                alt6=2;
                }
                break;
            case 11:
            case 12:
                {
                alt6=3;
                }
                break;
            case RULE_ID:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalOberon.g:804:2: ( ( rule__TExpression__Group_0__0 ) )
                    {
                    // InternalOberon.g:804:2: ( ( rule__TExpression__Group_0__0 ) )
                    // InternalOberon.g:805:3: ( rule__TExpression__Group_0__0 )
                    {
                     before(grammarAccess.getTExpressionAccess().getGroup_0()); 
                    // InternalOberon.g:806:3: ( rule__TExpression__Group_0__0 )
                    // InternalOberon.g:806:4: rule__TExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TExpression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOberon.g:810:2: ( ( rule__TExpression__IntvalueAssignment_1 ) )
                    {
                    // InternalOberon.g:810:2: ( ( rule__TExpression__IntvalueAssignment_1 ) )
                    // InternalOberon.g:811:3: ( rule__TExpression__IntvalueAssignment_1 )
                    {
                     before(grammarAccess.getTExpressionAccess().getIntvalueAssignment_1()); 
                    // InternalOberon.g:812:3: ( rule__TExpression__IntvalueAssignment_1 )
                    // InternalOberon.g:812:4: rule__TExpression__IntvalueAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__TExpression__IntvalueAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTExpressionAccess().getIntvalueAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOberon.g:816:2: ( ( rule__TExpression__BoolvalueAssignment_2 ) )
                    {
                    // InternalOberon.g:816:2: ( ( rule__TExpression__BoolvalueAssignment_2 ) )
                    // InternalOberon.g:817:3: ( rule__TExpression__BoolvalueAssignment_2 )
                    {
                     before(grammarAccess.getTExpressionAccess().getBoolvalueAssignment_2()); 
                    // InternalOberon.g:818:3: ( rule__TExpression__BoolvalueAssignment_2 )
                    // InternalOberon.g:818:4: rule__TExpression__BoolvalueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__TExpression__BoolvalueAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getTExpressionAccess().getBoolvalueAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalOberon.g:822:2: ( ( rule__TExpression__Group_3__0 ) )
                    {
                    // InternalOberon.g:822:2: ( ( rule__TExpression__Group_3__0 ) )
                    // InternalOberon.g:823:3: ( rule__TExpression__Group_3__0 )
                    {
                     before(grammarAccess.getTExpressionAccess().getGroup_3()); 
                    // InternalOberon.g:824:3: ( rule__TExpression__Group_3__0 )
                    // InternalOberon.g:824:4: rule__TExpression__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TExpression__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTExpressionAccess().getGroup_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TExpression__Alternatives"


    // $ANTLR start "rule__TStatement__Alternatives"
    // InternalOberon.g:832:1: rule__TStatement__Alternatives : ( ( ( rule__TStatement__Group_0__0 ) ) | ( ( rule__TStatement__Group_1__0 ) ) | ( ( rule__TStatement__Group_2__0 ) ) | ( ( rule__TStatement__Group_3__0 ) ) | ( ( rule__TStatement__Group_4__0 ) ) | ( ( rule__TStatement__Group_5__0 ) ) | ( ( rule__TStatement__Group_6__0 ) ) | ( ( rule__TStatement__Group_7__0 ) ) | ( ( rule__TStatement__Group_8__0 ) ) | ( ( rule__TStatement__Group_9__0 ) ) | ( ( rule__TStatement__Group_10__0 ) ) | ( ( rule__TStatement__ExitAssignment_11 ) ) );
    public final void rule__TStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:836:1: ( ( ( rule__TStatement__Group_0__0 ) ) | ( ( rule__TStatement__Group_1__0 ) ) | ( ( rule__TStatement__Group_2__0 ) ) | ( ( rule__TStatement__Group_3__0 ) ) | ( ( rule__TStatement__Group_4__0 ) ) | ( ( rule__TStatement__Group_5__0 ) ) | ( ( rule__TStatement__Group_6__0 ) ) | ( ( rule__TStatement__Group_7__0 ) ) | ( ( rule__TStatement__Group_8__0 ) ) | ( ( rule__TStatement__Group_9__0 ) ) | ( ( rule__TStatement__Group_10__0 ) ) | ( ( rule__TStatement__ExitAssignment_11 ) ) )
            int alt7=12;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalOberon.g:837:2: ( ( rule__TStatement__Group_0__0 ) )
                    {
                    // InternalOberon.g:837:2: ( ( rule__TStatement__Group_0__0 ) )
                    // InternalOberon.g:838:3: ( rule__TStatement__Group_0__0 )
                    {
                     before(grammarAccess.getTStatementAccess().getGroup_0()); 
                    // InternalOberon.g:839:3: ( rule__TStatement__Group_0__0 )
                    // InternalOberon.g:839:4: rule__TStatement__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TStatement__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTStatementAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOberon.g:843:2: ( ( rule__TStatement__Group_1__0 ) )
                    {
                    // InternalOberon.g:843:2: ( ( rule__TStatement__Group_1__0 ) )
                    // InternalOberon.g:844:3: ( rule__TStatement__Group_1__0 )
                    {
                     before(grammarAccess.getTStatementAccess().getGroup_1()); 
                    // InternalOberon.g:845:3: ( rule__TStatement__Group_1__0 )
                    // InternalOberon.g:845:4: rule__TStatement__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TStatement__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTStatementAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOberon.g:849:2: ( ( rule__TStatement__Group_2__0 ) )
                    {
                    // InternalOberon.g:849:2: ( ( rule__TStatement__Group_2__0 ) )
                    // InternalOberon.g:850:3: ( rule__TStatement__Group_2__0 )
                    {
                     before(grammarAccess.getTStatementAccess().getGroup_2()); 
                    // InternalOberon.g:851:3: ( rule__TStatement__Group_2__0 )
                    // InternalOberon.g:851:4: rule__TStatement__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TStatement__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTStatementAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalOberon.g:855:2: ( ( rule__TStatement__Group_3__0 ) )
                    {
                    // InternalOberon.g:855:2: ( ( rule__TStatement__Group_3__0 ) )
                    // InternalOberon.g:856:3: ( rule__TStatement__Group_3__0 )
                    {
                     before(grammarAccess.getTStatementAccess().getGroup_3()); 
                    // InternalOberon.g:857:3: ( rule__TStatement__Group_3__0 )
                    // InternalOberon.g:857:4: rule__TStatement__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TStatement__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTStatementAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalOberon.g:861:2: ( ( rule__TStatement__Group_4__0 ) )
                    {
                    // InternalOberon.g:861:2: ( ( rule__TStatement__Group_4__0 ) )
                    // InternalOberon.g:862:3: ( rule__TStatement__Group_4__0 )
                    {
                     before(grammarAccess.getTStatementAccess().getGroup_4()); 
                    // InternalOberon.g:863:3: ( rule__TStatement__Group_4__0 )
                    // InternalOberon.g:863:4: rule__TStatement__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TStatement__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTStatementAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalOberon.g:867:2: ( ( rule__TStatement__Group_5__0 ) )
                    {
                    // InternalOberon.g:867:2: ( ( rule__TStatement__Group_5__0 ) )
                    // InternalOberon.g:868:3: ( rule__TStatement__Group_5__0 )
                    {
                     before(grammarAccess.getTStatementAccess().getGroup_5()); 
                    // InternalOberon.g:869:3: ( rule__TStatement__Group_5__0 )
                    // InternalOberon.g:869:4: rule__TStatement__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TStatement__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTStatementAccess().getGroup_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalOberon.g:873:2: ( ( rule__TStatement__Group_6__0 ) )
                    {
                    // InternalOberon.g:873:2: ( ( rule__TStatement__Group_6__0 ) )
                    // InternalOberon.g:874:3: ( rule__TStatement__Group_6__0 )
                    {
                     before(grammarAccess.getTStatementAccess().getGroup_6()); 
                    // InternalOberon.g:875:3: ( rule__TStatement__Group_6__0 )
                    // InternalOberon.g:875:4: rule__TStatement__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TStatement__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTStatementAccess().getGroup_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalOberon.g:879:2: ( ( rule__TStatement__Group_7__0 ) )
                    {
                    // InternalOberon.g:879:2: ( ( rule__TStatement__Group_7__0 ) )
                    // InternalOberon.g:880:3: ( rule__TStatement__Group_7__0 )
                    {
                     before(grammarAccess.getTStatementAccess().getGroup_7()); 
                    // InternalOberon.g:881:3: ( rule__TStatement__Group_7__0 )
                    // InternalOberon.g:881:4: rule__TStatement__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TStatement__Group_7__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTStatementAccess().getGroup_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalOberon.g:885:2: ( ( rule__TStatement__Group_8__0 ) )
                    {
                    // InternalOberon.g:885:2: ( ( rule__TStatement__Group_8__0 ) )
                    // InternalOberon.g:886:3: ( rule__TStatement__Group_8__0 )
                    {
                     before(grammarAccess.getTStatementAccess().getGroup_8()); 
                    // InternalOberon.g:887:3: ( rule__TStatement__Group_8__0 )
                    // InternalOberon.g:887:4: rule__TStatement__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TStatement__Group_8__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTStatementAccess().getGroup_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalOberon.g:891:2: ( ( rule__TStatement__Group_9__0 ) )
                    {
                    // InternalOberon.g:891:2: ( ( rule__TStatement__Group_9__0 ) )
                    // InternalOberon.g:892:3: ( rule__TStatement__Group_9__0 )
                    {
                     before(grammarAccess.getTStatementAccess().getGroup_9()); 
                    // InternalOberon.g:893:3: ( rule__TStatement__Group_9__0 )
                    // InternalOberon.g:893:4: rule__TStatement__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TStatement__Group_9__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTStatementAccess().getGroup_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalOberon.g:897:2: ( ( rule__TStatement__Group_10__0 ) )
                    {
                    // InternalOberon.g:897:2: ( ( rule__TStatement__Group_10__0 ) )
                    // InternalOberon.g:898:3: ( rule__TStatement__Group_10__0 )
                    {
                     before(grammarAccess.getTStatementAccess().getGroup_10()); 
                    // InternalOberon.g:899:3: ( rule__TStatement__Group_10__0 )
                    // InternalOberon.g:899:4: rule__TStatement__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TStatement__Group_10__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTStatementAccess().getGroup_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalOberon.g:903:2: ( ( rule__TStatement__ExitAssignment_11 ) )
                    {
                    // InternalOberon.g:903:2: ( ( rule__TStatement__ExitAssignment_11 ) )
                    // InternalOberon.g:904:3: ( rule__TStatement__ExitAssignment_11 )
                    {
                     before(grammarAccess.getTStatementAccess().getExitAssignment_11()); 
                    // InternalOberon.g:905:3: ( rule__TStatement__ExitAssignment_11 )
                    // InternalOberon.g:905:4: rule__TStatement__ExitAssignment_11
                    {
                    pushFollow(FOLLOW_2);
                    rule__TStatement__ExitAssignment_11();

                    state._fsp--;


                    }

                     after(grammarAccess.getTStatementAccess().getExitAssignment_11()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Alternatives"


    // $ANTLR start "rule__Designator__Alternatives_1"
    // InternalOberon.g:913:1: rule__Designator__Alternatives_1 : ( ( ( rule__Designator__Group_1_0__0 ) ) | ( ( rule__Designator__Group_1_1__0 ) ) );
    public final void rule__Designator__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:917:1: ( ( ( rule__Designator__Group_1_0__0 ) ) | ( ( rule__Designator__Group_1_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==41) ) {
                alt8=1;
            }
            else if ( (LA8_0==28) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalOberon.g:918:2: ( ( rule__Designator__Group_1_0__0 ) )
                    {
                    // InternalOberon.g:918:2: ( ( rule__Designator__Group_1_0__0 ) )
                    // InternalOberon.g:919:3: ( rule__Designator__Group_1_0__0 )
                    {
                     before(grammarAccess.getDesignatorAccess().getGroup_1_0()); 
                    // InternalOberon.g:920:3: ( rule__Designator__Group_1_0__0 )
                    // InternalOberon.g:920:4: rule__Designator__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Designator__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDesignatorAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOberon.g:924:2: ( ( rule__Designator__Group_1_1__0 ) )
                    {
                    // InternalOberon.g:924:2: ( ( rule__Designator__Group_1_1__0 ) )
                    // InternalOberon.g:925:3: ( rule__Designator__Group_1_1__0 )
                    {
                     before(grammarAccess.getDesignatorAccess().getGroup_1_1()); 
                    // InternalOberon.g:926:3: ( rule__Designator__Group_1_1__0 )
                    // InternalOberon.g:926:4: rule__Designator__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Designator__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDesignatorAccess().getGroup_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Designator__Alternatives_1"


    // $ANTLR start "rule__OberonType__Alternatives"
    // InternalOberon.g:934:1: rule__OberonType__Alternatives : ( ( ( rule__OberonType__Group_0__0 ) ) | ( ( rule__OberonType__Group_1__0 ) ) | ( ( rule__OberonType__NameAssignment_2 ) ) | ( ( rule__OberonType__Group_3__0 ) ) );
    public final void rule__OberonType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:938:1: ( ( ( rule__OberonType__Group_0__0 ) ) | ( ( rule__OberonType__Group_1__0 ) ) | ( ( rule__OberonType__NameAssignment_2 ) ) | ( ( rule__OberonType__Group_3__0 ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt9=1;
                }
                break;
            case 63:
                {
                alt9=2;
                }
                break;
            case RULE_ID:
                {
                alt9=3;
                }
                break;
            case 33:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalOberon.g:939:2: ( ( rule__OberonType__Group_0__0 ) )
                    {
                    // InternalOberon.g:939:2: ( ( rule__OberonType__Group_0__0 ) )
                    // InternalOberon.g:940:3: ( rule__OberonType__Group_0__0 )
                    {
                     before(grammarAccess.getOberonTypeAccess().getGroup_0()); 
                    // InternalOberon.g:941:3: ( rule__OberonType__Group_0__0 )
                    // InternalOberon.g:941:4: rule__OberonType__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OberonType__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOberonTypeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOberon.g:945:2: ( ( rule__OberonType__Group_1__0 ) )
                    {
                    // InternalOberon.g:945:2: ( ( rule__OberonType__Group_1__0 ) )
                    // InternalOberon.g:946:3: ( rule__OberonType__Group_1__0 )
                    {
                     before(grammarAccess.getOberonTypeAccess().getGroup_1()); 
                    // InternalOberon.g:947:3: ( rule__OberonType__Group_1__0 )
                    // InternalOberon.g:947:4: rule__OberonType__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OberonType__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOberonTypeAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOberon.g:951:2: ( ( rule__OberonType__NameAssignment_2 ) )
                    {
                    // InternalOberon.g:951:2: ( ( rule__OberonType__NameAssignment_2 ) )
                    // InternalOberon.g:952:3: ( rule__OberonType__NameAssignment_2 )
                    {
                     before(grammarAccess.getOberonTypeAccess().getNameAssignment_2()); 
                    // InternalOberon.g:953:3: ( rule__OberonType__NameAssignment_2 )
                    // InternalOberon.g:953:4: rule__OberonType__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__OberonType__NameAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getOberonTypeAccess().getNameAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalOberon.g:957:2: ( ( rule__OberonType__Group_3__0 ) )
                    {
                    // InternalOberon.g:957:2: ( ( rule__OberonType__Group_3__0 ) )
                    // InternalOberon.g:958:3: ( rule__OberonType__Group_3__0 )
                    {
                     before(grammarAccess.getOberonTypeAccess().getGroup_3()); 
                    // InternalOberon.g:959:3: ( rule__OberonType__Group_3__0 )
                    // InternalOberon.g:959:4: rule__OberonType__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OberonType__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOberonTypeAccess().getGroup_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OberonType__Alternatives"


    // $ANTLR start "rule__BoolValue__Alternatives"
    // InternalOberon.g:967:1: rule__BoolValue__Alternatives : ( ( ruleTRUE ) | ( ruleFALSE ) );
    public final void rule__BoolValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:971:1: ( ( ruleTRUE ) | ( ruleFALSE ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==11) ) {
                alt10=1;
            }
            else if ( (LA10_0==12) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalOberon.g:972:2: ( ruleTRUE )
                    {
                    // InternalOberon.g:972:2: ( ruleTRUE )
                    // InternalOberon.g:973:3: ruleTRUE
                    {
                     before(grammarAccess.getBoolValueAccess().getTRUEParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTRUE();

                    state._fsp--;

                     after(grammarAccess.getBoolValueAccess().getTRUEParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOberon.g:978:2: ( ruleFALSE )
                    {
                    // InternalOberon.g:978:2: ( ruleFALSE )
                    // InternalOberon.g:979:3: ruleFALSE
                    {
                     before(grammarAccess.getBoolValueAccess().getFALSEParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFALSE();

                    state._fsp--;

                     after(grammarAccess.getBoolValueAccess().getFALSEParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolValue__Alternatives"


    // $ANTLR start "rule__Oberon__Group__0"
    // InternalOberon.g:988:1: rule__Oberon__Group__0 : rule__Oberon__Group__0__Impl rule__Oberon__Group__1 ;
    public final void rule__Oberon__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:992:1: ( rule__Oberon__Group__0__Impl rule__Oberon__Group__1 )
            // InternalOberon.g:993:2: rule__Oberon__Group__0__Impl rule__Oberon__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Oberon__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Oberon__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oberon__Group__0"


    // $ANTLR start "rule__Oberon__Group__0__Impl"
    // InternalOberon.g:1000:1: rule__Oberon__Group__0__Impl : ( 'MODULE' ) ;
    public final void rule__Oberon__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1004:1: ( ( 'MODULE' ) )
            // InternalOberon.g:1005:1: ( 'MODULE' )
            {
            // InternalOberon.g:1005:1: ( 'MODULE' )
            // InternalOberon.g:1006:2: 'MODULE'
            {
             before(grammarAccess.getOberonAccess().getMODULEKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getOberonAccess().getMODULEKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oberon__Group__0__Impl"


    // $ANTLR start "rule__Oberon__Group__1"
    // InternalOberon.g:1015:1: rule__Oberon__Group__1 : rule__Oberon__Group__1__Impl rule__Oberon__Group__2 ;
    public final void rule__Oberon__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1019:1: ( rule__Oberon__Group__1__Impl rule__Oberon__Group__2 )
            // InternalOberon.g:1020:2: rule__Oberon__Group__1__Impl rule__Oberon__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Oberon__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Oberon__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oberon__Group__1"


    // $ANTLR start "rule__Oberon__Group__1__Impl"
    // InternalOberon.g:1027:1: rule__Oberon__Group__1__Impl : ( ( rule__Oberon__NameAssignment_1 ) ) ;
    public final void rule__Oberon__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1031:1: ( ( ( rule__Oberon__NameAssignment_1 ) ) )
            // InternalOberon.g:1032:1: ( ( rule__Oberon__NameAssignment_1 ) )
            {
            // InternalOberon.g:1032:1: ( ( rule__Oberon__NameAssignment_1 ) )
            // InternalOberon.g:1033:2: ( rule__Oberon__NameAssignment_1 )
            {
             before(grammarAccess.getOberonAccess().getNameAssignment_1()); 
            // InternalOberon.g:1034:2: ( rule__Oberon__NameAssignment_1 )
            // InternalOberon.g:1034:3: rule__Oberon__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Oberon__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOberonAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oberon__Group__1__Impl"


    // $ANTLR start "rule__Oberon__Group__2"
    // InternalOberon.g:1042:1: rule__Oberon__Group__2 : rule__Oberon__Group__2__Impl rule__Oberon__Group__3 ;
    public final void rule__Oberon__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1046:1: ( rule__Oberon__Group__2__Impl rule__Oberon__Group__3 )
            // InternalOberon.g:1047:2: rule__Oberon__Group__2__Impl rule__Oberon__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Oberon__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Oberon__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oberon__Group__2"


    // $ANTLR start "rule__Oberon__Group__2__Impl"
    // InternalOberon.g:1054:1: rule__Oberon__Group__2__Impl : ( ';' ) ;
    public final void rule__Oberon__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1058:1: ( ( ';' ) )
            // InternalOberon.g:1059:1: ( ';' )
            {
            // InternalOberon.g:1059:1: ( ';' )
            // InternalOberon.g:1060:2: ';'
            {
             before(grammarAccess.getOberonAccess().getSemicolonKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getOberonAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oberon__Group__2__Impl"


    // $ANTLR start "rule__Oberon__Group__3"
    // InternalOberon.g:1069:1: rule__Oberon__Group__3 : rule__Oberon__Group__3__Impl rule__Oberon__Group__4 ;
    public final void rule__Oberon__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1073:1: ( rule__Oberon__Group__3__Impl rule__Oberon__Group__4 )
            // InternalOberon.g:1074:2: rule__Oberon__Group__3__Impl rule__Oberon__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Oberon__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Oberon__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oberon__Group__3"


    // $ANTLR start "rule__Oberon__Group__3__Impl"
    // InternalOberon.g:1081:1: rule__Oberon__Group__3__Impl : ( ( rule__Oberon__DeclarationAssignment_3 ) ) ;
    public final void rule__Oberon__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1085:1: ( ( ( rule__Oberon__DeclarationAssignment_3 ) ) )
            // InternalOberon.g:1086:1: ( ( rule__Oberon__DeclarationAssignment_3 ) )
            {
            // InternalOberon.g:1086:1: ( ( rule__Oberon__DeclarationAssignment_3 ) )
            // InternalOberon.g:1087:2: ( rule__Oberon__DeclarationAssignment_3 )
            {
             before(grammarAccess.getOberonAccess().getDeclarationAssignment_3()); 
            // InternalOberon.g:1088:2: ( rule__Oberon__DeclarationAssignment_3 )
            // InternalOberon.g:1088:3: rule__Oberon__DeclarationAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Oberon__DeclarationAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOberonAccess().getDeclarationAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oberon__Group__3__Impl"


    // $ANTLR start "rule__Oberon__Group__4"
    // InternalOberon.g:1096:1: rule__Oberon__Group__4 : rule__Oberon__Group__4__Impl rule__Oberon__Group__5 ;
    public final void rule__Oberon__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1100:1: ( rule__Oberon__Group__4__Impl rule__Oberon__Group__5 )
            // InternalOberon.g:1101:2: rule__Oberon__Group__4__Impl rule__Oberon__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Oberon__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Oberon__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oberon__Group__4"


    // $ANTLR start "rule__Oberon__Group__4__Impl"
    // InternalOberon.g:1108:1: rule__Oberon__Group__4__Impl : ( ( rule__Oberon__BlockAssignment_4 )? ) ;
    public final void rule__Oberon__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1112:1: ( ( ( rule__Oberon__BlockAssignment_4 )? ) )
            // InternalOberon.g:1113:1: ( ( rule__Oberon__BlockAssignment_4 )? )
            {
            // InternalOberon.g:1113:1: ( ( rule__Oberon__BlockAssignment_4 )? )
            // InternalOberon.g:1114:2: ( rule__Oberon__BlockAssignment_4 )?
            {
             before(grammarAccess.getOberonAccess().getBlockAssignment_4()); 
            // InternalOberon.g:1115:2: ( rule__Oberon__BlockAssignment_4 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalOberon.g:1115:3: rule__Oberon__BlockAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Oberon__BlockAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOberonAccess().getBlockAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oberon__Group__4__Impl"


    // $ANTLR start "rule__Oberon__Group__5"
    // InternalOberon.g:1123:1: rule__Oberon__Group__5 : rule__Oberon__Group__5__Impl rule__Oberon__Group__6 ;
    public final void rule__Oberon__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1127:1: ( rule__Oberon__Group__5__Impl rule__Oberon__Group__6 )
            // InternalOberon.g:1128:2: rule__Oberon__Group__5__Impl rule__Oberon__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__Oberon__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Oberon__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oberon__Group__5"


    // $ANTLR start "rule__Oberon__Group__5__Impl"
    // InternalOberon.g:1135:1: rule__Oberon__Group__5__Impl : ( 'END' ) ;
    public final void rule__Oberon__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1139:1: ( ( 'END' ) )
            // InternalOberon.g:1140:1: ( 'END' )
            {
            // InternalOberon.g:1140:1: ( 'END' )
            // InternalOberon.g:1141:2: 'END'
            {
             before(grammarAccess.getOberonAccess().getENDKeyword_5()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getOberonAccess().getENDKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oberon__Group__5__Impl"


    // $ANTLR start "rule__Oberon__Group__6"
    // InternalOberon.g:1150:1: rule__Oberon__Group__6 : rule__Oberon__Group__6__Impl rule__Oberon__Group__7 ;
    public final void rule__Oberon__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1154:1: ( rule__Oberon__Group__6__Impl rule__Oberon__Group__7 )
            // InternalOberon.g:1155:2: rule__Oberon__Group__6__Impl rule__Oberon__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Oberon__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Oberon__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oberon__Group__6"


    // $ANTLR start "rule__Oberon__Group__6__Impl"
    // InternalOberon.g:1162:1: rule__Oberon__Group__6__Impl : ( RULE_ID ) ;
    public final void rule__Oberon__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1166:1: ( ( RULE_ID ) )
            // InternalOberon.g:1167:1: ( RULE_ID )
            {
            // InternalOberon.g:1167:1: ( RULE_ID )
            // InternalOberon.g:1168:2: RULE_ID
            {
             before(grammarAccess.getOberonAccess().getIDTerminalRuleCall_6()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOberonAccess().getIDTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oberon__Group__6__Impl"


    // $ANTLR start "rule__Oberon__Group__7"
    // InternalOberon.g:1177:1: rule__Oberon__Group__7 : rule__Oberon__Group__7__Impl ;
    public final void rule__Oberon__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1181:1: ( rule__Oberon__Group__7__Impl )
            // InternalOberon.g:1182:2: rule__Oberon__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Oberon__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oberon__Group__7"


    // $ANTLR start "rule__Oberon__Group__7__Impl"
    // InternalOberon.g:1188:1: rule__Oberon__Group__7__Impl : ( '.' ) ;
    public final void rule__Oberon__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1192:1: ( ( '.' ) )
            // InternalOberon.g:1193:1: ( '.' )
            {
            // InternalOberon.g:1193:1: ( '.' )
            // InternalOberon.g:1194:2: '.'
            {
             before(grammarAccess.getOberonAccess().getFullStopKeyword_7()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getOberonAccess().getFullStopKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oberon__Group__7__Impl"


    // $ANTLR start "rule__Block__Group__0"
    // InternalOberon.g:1204:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1208:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalOberon.g:1209:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Block__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0"


    // $ANTLR start "rule__Block__Group__0__Impl"
    // InternalOberon.g:1216:1: rule__Block__Group__0__Impl : ( () ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1220:1: ( ( () ) )
            // InternalOberon.g:1221:1: ( () )
            {
            // InternalOberon.g:1221:1: ( () )
            // InternalOberon.g:1222:2: ()
            {
             before(grammarAccess.getBlockAccess().getBlockAction_0()); 
            // InternalOberon.g:1223:2: ()
            // InternalOberon.g:1223:3: 
            {
            }

             after(grammarAccess.getBlockAccess().getBlockAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0__Impl"


    // $ANTLR start "rule__Block__Group__1"
    // InternalOberon.g:1231:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1235:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // InternalOberon.g:1236:2: rule__Block__Group__1__Impl rule__Block__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Block__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__1"


    // $ANTLR start "rule__Block__Group__1__Impl"
    // InternalOberon.g:1243:1: rule__Block__Group__1__Impl : ( 'BEGIN' ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1247:1: ( ( 'BEGIN' ) )
            // InternalOberon.g:1248:1: ( 'BEGIN' )
            {
            // InternalOberon.g:1248:1: ( 'BEGIN' )
            // InternalOberon.g:1249:2: 'BEGIN'
            {
             before(grammarAccess.getBlockAccess().getBEGINKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getBlockAccess().getBEGINKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__1__Impl"


    // $ANTLR start "rule__Block__Group__2"
    // InternalOberon.g:1258:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1262:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // InternalOberon.g:1263:2: rule__Block__Group__2__Impl rule__Block__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Block__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__2"


    // $ANTLR start "rule__Block__Group__2__Impl"
    // InternalOberon.g:1270:1: rule__Block__Group__2__Impl : ( ( rule__Block__StmtAssignment_2 )* ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1274:1: ( ( ( rule__Block__StmtAssignment_2 )* ) )
            // InternalOberon.g:1275:1: ( ( rule__Block__StmtAssignment_2 )* )
            {
            // InternalOberon.g:1275:1: ( ( rule__Block__StmtAssignment_2 )* )
            // InternalOberon.g:1276:2: ( rule__Block__StmtAssignment_2 )*
            {
             before(grammarAccess.getBlockAccess().getStmtAssignment_2()); 
            // InternalOberon.g:1277:2: ( rule__Block__StmtAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||(LA12_0>=44 && LA12_0<=46)||LA12_0==50||LA12_0==52||LA12_0==54||(LA12_0>=58 && LA12_0<=60)||LA12_0==64) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalOberon.g:1277:3: rule__Block__StmtAssignment_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Block__StmtAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getBlockAccess().getStmtAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__2__Impl"


    // $ANTLR start "rule__Block__Group__3"
    // InternalOberon.g:1285:1: rule__Block__Group__3 : rule__Block__Group__3__Impl ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1289:1: ( rule__Block__Group__3__Impl )
            // InternalOberon.g:1290:2: rule__Block__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__3"


    // $ANTLR start "rule__Block__Group__3__Impl"
    // InternalOberon.g:1296:1: rule__Block__Group__3__Impl : ( 'END' ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1300:1: ( ( 'END' ) )
            // InternalOberon.g:1301:1: ( 'END' )
            {
            // InternalOberon.g:1301:1: ( 'END' )
            // InternalOberon.g:1302:2: 'END'
            {
             before(grammarAccess.getBlockAccess().getENDKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getBlockAccess().getENDKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__3__Impl"


    // $ANTLR start "rule__Declarations__Group__0"
    // InternalOberon.g:1312:1: rule__Declarations__Group__0 : rule__Declarations__Group__0__Impl rule__Declarations__Group__1 ;
    public final void rule__Declarations__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1316:1: ( rule__Declarations__Group__0__Impl rule__Declarations__Group__1 )
            // InternalOberon.g:1317:2: rule__Declarations__Group__0__Impl rule__Declarations__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Declarations__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declarations__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarations__Group__0"


    // $ANTLR start "rule__Declarations__Group__0__Impl"
    // InternalOberon.g:1324:1: rule__Declarations__Group__0__Impl : ( () ) ;
    public final void rule__Declarations__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1328:1: ( ( () ) )
            // InternalOberon.g:1329:1: ( () )
            {
            // InternalOberon.g:1329:1: ( () )
            // InternalOberon.g:1330:2: ()
            {
             before(grammarAccess.getDeclarationsAccess().getDeclararionAction_0()); 
            // InternalOberon.g:1331:2: ()
            // InternalOberon.g:1331:3: 
            {
            }

             after(grammarAccess.getDeclarationsAccess().getDeclararionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarations__Group__0__Impl"


    // $ANTLR start "rule__Declarations__Group__1"
    // InternalOberon.g:1339:1: rule__Declarations__Group__1 : rule__Declarations__Group__1__Impl rule__Declarations__Group__2 ;
    public final void rule__Declarations__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1343:1: ( rule__Declarations__Group__1__Impl rule__Declarations__Group__2 )
            // InternalOberon.g:1344:2: rule__Declarations__Group__1__Impl rule__Declarations__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Declarations__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declarations__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarations__Group__1"


    // $ANTLR start "rule__Declarations__Group__1__Impl"
    // InternalOberon.g:1351:1: rule__Declarations__Group__1__Impl : ( ( rule__Declarations__Group_1__0 )? ) ;
    public final void rule__Declarations__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1355:1: ( ( ( rule__Declarations__Group_1__0 )? ) )
            // InternalOberon.g:1356:1: ( ( rule__Declarations__Group_1__0 )? )
            {
            // InternalOberon.g:1356:1: ( ( rule__Declarations__Group_1__0 )? )
            // InternalOberon.g:1357:2: ( rule__Declarations__Group_1__0 )?
            {
             before(grammarAccess.getDeclarationsAccess().getGroup_1()); 
            // InternalOberon.g:1358:2: ( rule__Declarations__Group_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==30) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalOberon.g:1358:3: rule__Declarations__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Declarations__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeclarationsAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarations__Group__1__Impl"


    // $ANTLR start "rule__Declarations__Group__2"
    // InternalOberon.g:1366:1: rule__Declarations__Group__2 : rule__Declarations__Group__2__Impl rule__Declarations__Group__3 ;
    public final void rule__Declarations__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1370:1: ( rule__Declarations__Group__2__Impl rule__Declarations__Group__3 )
            // InternalOberon.g:1371:2: rule__Declarations__Group__2__Impl rule__Declarations__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Declarations__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declarations__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarations__Group__2"


    // $ANTLR start "rule__Declarations__Group__2__Impl"
    // InternalOberon.g:1378:1: rule__Declarations__Group__2__Impl : ( ( rule__Declarations__Group_2__0 )? ) ;
    public final void rule__Declarations__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1382:1: ( ( ( rule__Declarations__Group_2__0 )? ) )
            // InternalOberon.g:1383:1: ( ( rule__Declarations__Group_2__0 )? )
            {
            // InternalOberon.g:1383:1: ( ( rule__Declarations__Group_2__0 )? )
            // InternalOberon.g:1384:2: ( rule__Declarations__Group_2__0 )?
            {
             before(grammarAccess.getDeclarationsAccess().getGroup_2()); 
            // InternalOberon.g:1385:2: ( rule__Declarations__Group_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalOberon.g:1385:3: rule__Declarations__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Declarations__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeclarationsAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarations__Group__2__Impl"


    // $ANTLR start "rule__Declarations__Group__3"
    // InternalOberon.g:1393:1: rule__Declarations__Group__3 : rule__Declarations__Group__3__Impl rule__Declarations__Group__4 ;
    public final void rule__Declarations__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1397:1: ( rule__Declarations__Group__3__Impl rule__Declarations__Group__4 )
            // InternalOberon.g:1398:2: rule__Declarations__Group__3__Impl rule__Declarations__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Declarations__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declarations__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarations__Group__3"


    // $ANTLR start "rule__Declarations__Group__3__Impl"
    // InternalOberon.g:1405:1: rule__Declarations__Group__3__Impl : ( ( rule__Declarations__Group_3__0 )? ) ;
    public final void rule__Declarations__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1409:1: ( ( ( rule__Declarations__Group_3__0 )? ) )
            // InternalOberon.g:1410:1: ( ( rule__Declarations__Group_3__0 )? )
            {
            // InternalOberon.g:1410:1: ( ( rule__Declarations__Group_3__0 )? )
            // InternalOberon.g:1411:2: ( rule__Declarations__Group_3__0 )?
            {
             before(grammarAccess.getDeclarationsAccess().getGroup_3()); 
            // InternalOberon.g:1412:2: ( rule__Declarations__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalOberon.g:1412:3: rule__Declarations__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Declarations__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeclarationsAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarations__Group__3__Impl"


    // $ANTLR start "rule__Declarations__Group__4"
    // InternalOberon.g:1420:1: rule__Declarations__Group__4 : rule__Declarations__Group__4__Impl ;
    public final void rule__Declarations__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1424:1: ( rule__Declarations__Group__4__Impl )
            // InternalOberon.g:1425:2: rule__Declarations__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Declarations__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarations__Group__4"


    // $ANTLR start "rule__Declarations__Group__4__Impl"
    // InternalOberon.g:1431:1: rule__Declarations__Group__4__Impl : ( ( rule__Declarations__ProcAssignment_4 )* ) ;
    public final void rule__Declarations__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1435:1: ( ( ( rule__Declarations__ProcAssignment_4 )* ) )
            // InternalOberon.g:1436:1: ( ( rule__Declarations__ProcAssignment_4 )* )
            {
            // InternalOberon.g:1436:1: ( ( rule__Declarations__ProcAssignment_4 )* )
            // InternalOberon.g:1437:2: ( rule__Declarations__ProcAssignment_4 )*
            {
             before(grammarAccess.getDeclarationsAccess().getProcAssignment_4()); 
            // InternalOberon.g:1438:2: ( rule__Declarations__ProcAssignment_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==38) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalOberon.g:1438:3: rule__Declarations__ProcAssignment_4
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Declarations__ProcAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getDeclarationsAccess().getProcAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarations__Group__4__Impl"


    // $ANTLR start "rule__Declarations__Group_1__0"
    // InternalOberon.g:1447:1: rule__Declarations__Group_1__0 : rule__Declarations__Group_1__0__Impl rule__Declarations__Group_1__1 ;
    public final void rule__Declarations__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1451:1: ( rule__Declarations__Group_1__0__Impl rule__Declarations__Group_1__1 )
            // InternalOberon.g:1452:2: rule__Declarations__Group_1__0__Impl rule__Declarations__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Declarations__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declarations__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarations__Group_1__0"


    // $ANTLR start "rule__Declarations__Group_1__0__Impl"
    // InternalOberon.g:1459:1: rule__Declarations__Group_1__0__Impl : ( 'TYPE' ) ;
    public final void rule__Declarations__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1463:1: ( ( 'TYPE' ) )
            // InternalOberon.g:1464:1: ( 'TYPE' )
            {
            // InternalOberon.g:1464:1: ( 'TYPE' )
            // InternalOberon.g:1465:2: 'TYPE'
            {
             before(grammarAccess.getDeclarationsAccess().getTYPEKeyword_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDeclarationsAccess().getTYPEKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarations__Group_1__0__Impl"


    // $ANTLR start "rule__Declarations__Group_1__1"
    // InternalOberon.g:1474:1: rule__Declarations__Group_1__1 : rule__Declarations__Group_1__1__Impl ;
    public final void rule__Declarations__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1478:1: ( rule__Declarations__Group_1__1__Impl )
            // InternalOberon.g:1479:2: rule__Declarations__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Declarations__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarations__Group_1__1"


    // $ANTLR start "rule__Declarations__Group_1__1__Impl"
    // InternalOberon.g:1485:1: rule__Declarations__Group_1__1__Impl : ( ( ( rule__Declarations__TypesAssignment_1_1 ) ) ( ( rule__Declarations__TypesAssignment_1_1 )* ) ) ;
    public final void rule__Declarations__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1489:1: ( ( ( ( rule__Declarations__TypesAssignment_1_1 ) ) ( ( rule__Declarations__TypesAssignment_1_1 )* ) ) )
            // InternalOberon.g:1490:1: ( ( ( rule__Declarations__TypesAssignment_1_1 ) ) ( ( rule__Declarations__TypesAssignment_1_1 )* ) )
            {
            // InternalOberon.g:1490:1: ( ( ( rule__Declarations__TypesAssignment_1_1 ) ) ( ( rule__Declarations__TypesAssignment_1_1 )* ) )
            // InternalOberon.g:1491:2: ( ( rule__Declarations__TypesAssignment_1_1 ) ) ( ( rule__Declarations__TypesAssignment_1_1 )* )
            {
            // InternalOberon.g:1491:2: ( ( rule__Declarations__TypesAssignment_1_1 ) )
            // InternalOberon.g:1492:3: ( rule__Declarations__TypesAssignment_1_1 )
            {
             before(grammarAccess.getDeclarationsAccess().getTypesAssignment_1_1()); 
            // InternalOberon.g:1493:3: ( rule__Declarations__TypesAssignment_1_1 )
            // InternalOberon.g:1493:4: rule__Declarations__TypesAssignment_1_1
            {
            pushFollow(FOLLOW_12);
            rule__Declarations__TypesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationsAccess().getTypesAssignment_1_1()); 

            }

            // InternalOberon.g:1496:2: ( ( rule__Declarations__TypesAssignment_1_1 )* )
            // InternalOberon.g:1497:3: ( rule__Declarations__TypesAssignment_1_1 )*
            {
             before(grammarAccess.getDeclarationsAccess().getTypesAssignment_1_1()); 
            // InternalOberon.g:1498:3: ( rule__Declarations__TypesAssignment_1_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalOberon.g:1498:4: rule__Declarations__TypesAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Declarations__TypesAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getDeclarationsAccess().getTypesAssignment_1_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarations__Group_1__1__Impl"


    // $ANTLR start "rule__Declarations__Group_2__0"
    // InternalOberon.g:1508:1: rule__Declarations__Group_2__0 : rule__Declarations__Group_2__0__Impl rule__Declarations__Group_2__1 ;
    public final void rule__Declarations__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1512:1: ( rule__Declarations__Group_2__0__Impl rule__Declarations__Group_2__1 )
            // InternalOberon.g:1513:2: rule__Declarations__Group_2__0__Impl rule__Declarations__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Declarations__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declarations__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarations__Group_2__0"


    // $ANTLR start "rule__Declarations__Group_2__0__Impl"
    // InternalOberon.g:1520:1: rule__Declarations__Group_2__0__Impl : ( 'CONST' ) ;
    public final void rule__Declarations__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1524:1: ( ( 'CONST' ) )
            // InternalOberon.g:1525:1: ( 'CONST' )
            {
            // InternalOberon.g:1525:1: ( 'CONST' )
            // InternalOberon.g:1526:2: 'CONST'
            {
             before(grammarAccess.getDeclarationsAccess().getCONSTKeyword_2_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getDeclarationsAccess().getCONSTKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarations__Group_2__0__Impl"


    // $ANTLR start "rule__Declarations__Group_2__1"
    // InternalOberon.g:1535:1: rule__Declarations__Group_2__1 : rule__Declarations__Group_2__1__Impl ;
    public final void rule__Declarations__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1539:1: ( rule__Declarations__Group_2__1__Impl )
            // InternalOberon.g:1540:2: rule__Declarations__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Declarations__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarations__Group_2__1"


    // $ANTLR start "rule__Declarations__Group_2__1__Impl"
    // InternalOberon.g:1546:1: rule__Declarations__Group_2__1__Impl : ( ( ( rule__Declarations__ConstsAssignment_2_1 ) ) ( ( rule__Declarations__ConstsAssignment_2_1 )* ) ) ;
    public final void rule__Declarations__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1550:1: ( ( ( ( rule__Declarations__ConstsAssignment_2_1 ) ) ( ( rule__Declarations__ConstsAssignment_2_1 )* ) ) )
            // InternalOberon.g:1551:1: ( ( ( rule__Declarations__ConstsAssignment_2_1 ) ) ( ( rule__Declarations__ConstsAssignment_2_1 )* ) )
            {
            // InternalOberon.g:1551:1: ( ( ( rule__Declarations__ConstsAssignment_2_1 ) ) ( ( rule__Declarations__ConstsAssignment_2_1 )* ) )
            // InternalOberon.g:1552:2: ( ( rule__Declarations__ConstsAssignment_2_1 ) ) ( ( rule__Declarations__ConstsAssignment_2_1 )* )
            {
            // InternalOberon.g:1552:2: ( ( rule__Declarations__ConstsAssignment_2_1 ) )
            // InternalOberon.g:1553:3: ( rule__Declarations__ConstsAssignment_2_1 )
            {
             before(grammarAccess.getDeclarationsAccess().getConstsAssignment_2_1()); 
            // InternalOberon.g:1554:3: ( rule__Declarations__ConstsAssignment_2_1 )
            // InternalOberon.g:1554:4: rule__Declarations__ConstsAssignment_2_1
            {
            pushFollow(FOLLOW_12);
            rule__Declarations__ConstsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationsAccess().getConstsAssignment_2_1()); 

            }

            // InternalOberon.g:1557:2: ( ( rule__Declarations__ConstsAssignment_2_1 )* )
            // InternalOberon.g:1558:3: ( rule__Declarations__ConstsAssignment_2_1 )*
            {
             before(grammarAccess.getDeclarationsAccess().getConstsAssignment_2_1()); 
            // InternalOberon.g:1559:3: ( rule__Declarations__ConstsAssignment_2_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalOberon.g:1559:4: rule__Declarations__ConstsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Declarations__ConstsAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getDeclarationsAccess().getConstsAssignment_2_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarations__Group_2__1__Impl"


    // $ANTLR start "rule__Declarations__Group_3__0"
    // InternalOberon.g:1569:1: rule__Declarations__Group_3__0 : rule__Declarations__Group_3__0__Impl rule__Declarations__Group_3__1 ;
    public final void rule__Declarations__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1573:1: ( rule__Declarations__Group_3__0__Impl rule__Declarations__Group_3__1 )
            // InternalOberon.g:1574:2: rule__Declarations__Group_3__0__Impl rule__Declarations__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Declarations__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declarations__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarations__Group_3__0"


    // $ANTLR start "rule__Declarations__Group_3__0__Impl"
    // InternalOberon.g:1581:1: rule__Declarations__Group_3__0__Impl : ( 'VAR' ) ;
    public final void rule__Declarations__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1585:1: ( ( 'VAR' ) )
            // InternalOberon.g:1586:1: ( 'VAR' )
            {
            // InternalOberon.g:1586:1: ( 'VAR' )
            // InternalOberon.g:1587:2: 'VAR'
            {
             before(grammarAccess.getDeclarationsAccess().getVARKeyword_3_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDeclarationsAccess().getVARKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarations__Group_3__0__Impl"


    // $ANTLR start "rule__Declarations__Group_3__1"
    // InternalOberon.g:1596:1: rule__Declarations__Group_3__1 : rule__Declarations__Group_3__1__Impl ;
    public final void rule__Declarations__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1600:1: ( rule__Declarations__Group_3__1__Impl )
            // InternalOberon.g:1601:2: rule__Declarations__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Declarations__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarations__Group_3__1"


    // $ANTLR start "rule__Declarations__Group_3__1__Impl"
    // InternalOberon.g:1607:1: rule__Declarations__Group_3__1__Impl : ( ( ( rule__Declarations__VarsAssignment_3_1 ) ) ( ( rule__Declarations__VarsAssignment_3_1 )* ) ) ;
    public final void rule__Declarations__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1611:1: ( ( ( ( rule__Declarations__VarsAssignment_3_1 ) ) ( ( rule__Declarations__VarsAssignment_3_1 )* ) ) )
            // InternalOberon.g:1612:1: ( ( ( rule__Declarations__VarsAssignment_3_1 ) ) ( ( rule__Declarations__VarsAssignment_3_1 )* ) )
            {
            // InternalOberon.g:1612:1: ( ( ( rule__Declarations__VarsAssignment_3_1 ) ) ( ( rule__Declarations__VarsAssignment_3_1 )* ) )
            // InternalOberon.g:1613:2: ( ( rule__Declarations__VarsAssignment_3_1 ) ) ( ( rule__Declarations__VarsAssignment_3_1 )* )
            {
            // InternalOberon.g:1613:2: ( ( rule__Declarations__VarsAssignment_3_1 ) )
            // InternalOberon.g:1614:3: ( rule__Declarations__VarsAssignment_3_1 )
            {
             before(grammarAccess.getDeclarationsAccess().getVarsAssignment_3_1()); 
            // InternalOberon.g:1615:3: ( rule__Declarations__VarsAssignment_3_1 )
            // InternalOberon.g:1615:4: rule__Declarations__VarsAssignment_3_1
            {
            pushFollow(FOLLOW_12);
            rule__Declarations__VarsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationsAccess().getVarsAssignment_3_1()); 

            }

            // InternalOberon.g:1618:2: ( ( rule__Declarations__VarsAssignment_3_1 )* )
            // InternalOberon.g:1619:3: ( rule__Declarations__VarsAssignment_3_1 )*
            {
             before(grammarAccess.getDeclarationsAccess().getVarsAssignment_3_1()); 
            // InternalOberon.g:1620:3: ( rule__Declarations__VarsAssignment_3_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalOberon.g:1620:4: rule__Declarations__VarsAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Declarations__VarsAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getDeclarationsAccess().getVarsAssignment_3_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarations__Group_3__1__Impl"


    // $ANTLR start "rule__UserTypeDeclaration__Group_0__0"
    // InternalOberon.g:1630:1: rule__UserTypeDeclaration__Group_0__0 : rule__UserTypeDeclaration__Group_0__0__Impl rule__UserTypeDeclaration__Group_0__1 ;
    public final void rule__UserTypeDeclaration__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1634:1: ( rule__UserTypeDeclaration__Group_0__0__Impl rule__UserTypeDeclaration__Group_0__1 )
            // InternalOberon.g:1635:2: rule__UserTypeDeclaration__Group_0__0__Impl rule__UserTypeDeclaration__Group_0__1
            {
            pushFollow(FOLLOW_13);
            rule__UserTypeDeclaration__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UserTypeDeclaration__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserTypeDeclaration__Group_0__0"


    // $ANTLR start "rule__UserTypeDeclaration__Group_0__0__Impl"
    // InternalOberon.g:1642:1: rule__UserTypeDeclaration__Group_0__0__Impl : ( ( rule__UserTypeDeclaration__NameTypeAssignment_0_0 ) ) ;
    public final void rule__UserTypeDeclaration__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1646:1: ( ( ( rule__UserTypeDeclaration__NameTypeAssignment_0_0 ) ) )
            // InternalOberon.g:1647:1: ( ( rule__UserTypeDeclaration__NameTypeAssignment_0_0 ) )
            {
            // InternalOberon.g:1647:1: ( ( rule__UserTypeDeclaration__NameTypeAssignment_0_0 ) )
            // InternalOberon.g:1648:2: ( rule__UserTypeDeclaration__NameTypeAssignment_0_0 )
            {
             before(grammarAccess.getUserTypeDeclarationAccess().getNameTypeAssignment_0_0()); 
            // InternalOberon.g:1649:2: ( rule__UserTypeDeclaration__NameTypeAssignment_0_0 )
            // InternalOberon.g:1649:3: rule__UserTypeDeclaration__NameTypeAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__UserTypeDeclaration__NameTypeAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getUserTypeDeclarationAccess().getNameTypeAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserTypeDeclaration__Group_0__0__Impl"


    // $ANTLR start "rule__UserTypeDeclaration__Group_0__1"
    // InternalOberon.g:1657:1: rule__UserTypeDeclaration__Group_0__1 : rule__UserTypeDeclaration__Group_0__1__Impl rule__UserTypeDeclaration__Group_0__2 ;
    public final void rule__UserTypeDeclaration__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1661:1: ( rule__UserTypeDeclaration__Group_0__1__Impl rule__UserTypeDeclaration__Group_0__2 )
            // InternalOberon.g:1662:2: rule__UserTypeDeclaration__Group_0__1__Impl rule__UserTypeDeclaration__Group_0__2
            {
            pushFollow(FOLLOW_14);
            rule__UserTypeDeclaration__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UserTypeDeclaration__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserTypeDeclaration__Group_0__1"


    // $ANTLR start "rule__UserTypeDeclaration__Group_0__1__Impl"
    // InternalOberon.g:1669:1: rule__UserTypeDeclaration__Group_0__1__Impl : ( '=' ) ;
    public final void rule__UserTypeDeclaration__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1673:1: ( ( '=' ) )
            // InternalOberon.g:1674:1: ( '=' )
            {
            // InternalOberon.g:1674:1: ( '=' )
            // InternalOberon.g:1675:2: '='
            {
             before(grammarAccess.getUserTypeDeclarationAccess().getEqualsSignKeyword_0_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getUserTypeDeclarationAccess().getEqualsSignKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserTypeDeclaration__Group_0__1__Impl"


    // $ANTLR start "rule__UserTypeDeclaration__Group_0__2"
    // InternalOberon.g:1684:1: rule__UserTypeDeclaration__Group_0__2 : rule__UserTypeDeclaration__Group_0__2__Impl ;
    public final void rule__UserTypeDeclaration__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1688:1: ( rule__UserTypeDeclaration__Group_0__2__Impl )
            // InternalOberon.g:1689:2: rule__UserTypeDeclaration__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UserTypeDeclaration__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserTypeDeclaration__Group_0__2"


    // $ANTLR start "rule__UserTypeDeclaration__Group_0__2__Impl"
    // InternalOberon.g:1695:1: rule__UserTypeDeclaration__Group_0__2__Impl : ( ( rule__UserTypeDeclaration__Group_0_2__0 ) ) ;
    public final void rule__UserTypeDeclaration__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1699:1: ( ( ( rule__UserTypeDeclaration__Group_0_2__0 ) ) )
            // InternalOberon.g:1700:1: ( ( rule__UserTypeDeclaration__Group_0_2__0 ) )
            {
            // InternalOberon.g:1700:1: ( ( rule__UserTypeDeclaration__Group_0_2__0 ) )
            // InternalOberon.g:1701:2: ( rule__UserTypeDeclaration__Group_0_2__0 )
            {
             before(grammarAccess.getUserTypeDeclarationAccess().getGroup_0_2()); 
            // InternalOberon.g:1702:2: ( rule__UserTypeDeclaration__Group_0_2__0 )
            // InternalOberon.g:1702:3: rule__UserTypeDeclaration__Group_0_2__0
            {
            pushFollow(FOLLOW_2);
            rule__UserTypeDeclaration__Group_0_2__0();

            state._fsp--;


            }

             after(grammarAccess.getUserTypeDeclarationAccess().getGroup_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserTypeDeclaration__Group_0__2__Impl"


    // $ANTLR start "rule__UserTypeDeclaration__Group_0_2__0"
    // InternalOberon.g:1711:1: rule__UserTypeDeclaration__Group_0_2__0 : rule__UserTypeDeclaration__Group_0_2__0__Impl rule__UserTypeDeclaration__Group_0_2__1 ;
    public final void rule__UserTypeDeclaration__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1715:1: ( rule__UserTypeDeclaration__Group_0_2__0__Impl rule__UserTypeDeclaration__Group_0_2__1 )
            // InternalOberon.g:1716:2: rule__UserTypeDeclaration__Group_0_2__0__Impl rule__UserTypeDeclaration__Group_0_2__1
            {
            pushFollow(FOLLOW_15);
            rule__UserTypeDeclaration__Group_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UserTypeDeclaration__Group_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserTypeDeclaration__Group_0_2__0"


    // $ANTLR start "rule__UserTypeDeclaration__Group_0_2__0__Impl"
    // InternalOberon.g:1723:1: rule__UserTypeDeclaration__Group_0_2__0__Impl : ( 'ARRAY' ) ;
    public final void rule__UserTypeDeclaration__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1727:1: ( ( 'ARRAY' ) )
            // InternalOberon.g:1728:1: ( 'ARRAY' )
            {
            // InternalOberon.g:1728:1: ( 'ARRAY' )
            // InternalOberon.g:1729:2: 'ARRAY'
            {
             before(grammarAccess.getUserTypeDeclarationAccess().getARRAYKeyword_0_2_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getUserTypeDeclarationAccess().getARRAYKeyword_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserTypeDeclaration__Group_0_2__0__Impl"


    // $ANTLR start "rule__UserTypeDeclaration__Group_0_2__1"
    // InternalOberon.g:1738:1: rule__UserTypeDeclaration__Group_0_2__1 : rule__UserTypeDeclaration__Group_0_2__1__Impl rule__UserTypeDeclaration__Group_0_2__2 ;
    public final void rule__UserTypeDeclaration__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1742:1: ( rule__UserTypeDeclaration__Group_0_2__1__Impl rule__UserTypeDeclaration__Group_0_2__2 )
            // InternalOberon.g:1743:2: rule__UserTypeDeclaration__Group_0_2__1__Impl rule__UserTypeDeclaration__Group_0_2__2
            {
            pushFollow(FOLLOW_16);
            rule__UserTypeDeclaration__Group_0_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UserTypeDeclaration__Group_0_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserTypeDeclaration__Group_0_2__1"


    // $ANTLR start "rule__UserTypeDeclaration__Group_0_2__1__Impl"
    // InternalOberon.g:1750:1: rule__UserTypeDeclaration__Group_0_2__1__Impl : ( ( rule__UserTypeDeclaration__LengthAssignment_0_2_1 ) ) ;
    public final void rule__UserTypeDeclaration__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1754:1: ( ( ( rule__UserTypeDeclaration__LengthAssignment_0_2_1 ) ) )
            // InternalOberon.g:1755:1: ( ( rule__UserTypeDeclaration__LengthAssignment_0_2_1 ) )
            {
            // InternalOberon.g:1755:1: ( ( rule__UserTypeDeclaration__LengthAssignment_0_2_1 ) )
            // InternalOberon.g:1756:2: ( rule__UserTypeDeclaration__LengthAssignment_0_2_1 )
            {
             before(grammarAccess.getUserTypeDeclarationAccess().getLengthAssignment_0_2_1()); 
            // InternalOberon.g:1757:2: ( rule__UserTypeDeclaration__LengthAssignment_0_2_1 )
            // InternalOberon.g:1757:3: rule__UserTypeDeclaration__LengthAssignment_0_2_1
            {
            pushFollow(FOLLOW_2);
            rule__UserTypeDeclaration__LengthAssignment_0_2_1();

            state._fsp--;


            }

             after(grammarAccess.getUserTypeDeclarationAccess().getLengthAssignment_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserTypeDeclaration__Group_0_2__1__Impl"


    // $ANTLR start "rule__UserTypeDeclaration__Group_0_2__2"
    // InternalOberon.g:1765:1: rule__UserTypeDeclaration__Group_0_2__2 : rule__UserTypeDeclaration__Group_0_2__2__Impl rule__UserTypeDeclaration__Group_0_2__3 ;
    public final void rule__UserTypeDeclaration__Group_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1769:1: ( rule__UserTypeDeclaration__Group_0_2__2__Impl rule__UserTypeDeclaration__Group_0_2__3 )
            // InternalOberon.g:1770:2: rule__UserTypeDeclaration__Group_0_2__2__Impl rule__UserTypeDeclaration__Group_0_2__3
            {
            pushFollow(FOLLOW_17);
            rule__UserTypeDeclaration__Group_0_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UserTypeDeclaration__Group_0_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserTypeDeclaration__Group_0_2__2"


    // $ANTLR start "rule__UserTypeDeclaration__Group_0_2__2__Impl"
    // InternalOberon.g:1777:1: rule__UserTypeDeclaration__Group_0_2__2__Impl : ( 'OF' ) ;
    public final void rule__UserTypeDeclaration__Group_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1781:1: ( ( 'OF' ) )
            // InternalOberon.g:1782:1: ( 'OF' )
            {
            // InternalOberon.g:1782:1: ( 'OF' )
            // InternalOberon.g:1783:2: 'OF'
            {
             before(grammarAccess.getUserTypeDeclarationAccess().getOFKeyword_0_2_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getUserTypeDeclarationAccess().getOFKeyword_0_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserTypeDeclaration__Group_0_2__2__Impl"


    // $ANTLR start "rule__UserTypeDeclaration__Group_0_2__3"
    // InternalOberon.g:1792:1: rule__UserTypeDeclaration__Group_0_2__3 : rule__UserTypeDeclaration__Group_0_2__3__Impl ;
    public final void rule__UserTypeDeclaration__Group_0_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1796:1: ( rule__UserTypeDeclaration__Group_0_2__3__Impl )
            // InternalOberon.g:1797:2: rule__UserTypeDeclaration__Group_0_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UserTypeDeclaration__Group_0_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserTypeDeclaration__Group_0_2__3"


    // $ANTLR start "rule__UserTypeDeclaration__Group_0_2__3__Impl"
    // InternalOberon.g:1803:1: rule__UserTypeDeclaration__Group_0_2__3__Impl : ( ( rule__UserTypeDeclaration__VartypeAssignment_0_2_3 ) ) ;
    public final void rule__UserTypeDeclaration__Group_0_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1807:1: ( ( ( rule__UserTypeDeclaration__VartypeAssignment_0_2_3 ) ) )
            // InternalOberon.g:1808:1: ( ( rule__UserTypeDeclaration__VartypeAssignment_0_2_3 ) )
            {
            // InternalOberon.g:1808:1: ( ( rule__UserTypeDeclaration__VartypeAssignment_0_2_3 ) )
            // InternalOberon.g:1809:2: ( rule__UserTypeDeclaration__VartypeAssignment_0_2_3 )
            {
             before(grammarAccess.getUserTypeDeclarationAccess().getVartypeAssignment_0_2_3()); 
            // InternalOberon.g:1810:2: ( rule__UserTypeDeclaration__VartypeAssignment_0_2_3 )
            // InternalOberon.g:1810:3: rule__UserTypeDeclaration__VartypeAssignment_0_2_3
            {
            pushFollow(FOLLOW_2);
            rule__UserTypeDeclaration__VartypeAssignment_0_2_3();

            state._fsp--;


            }

             after(grammarAccess.getUserTypeDeclarationAccess().getVartypeAssignment_0_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserTypeDeclaration__Group_0_2__3__Impl"


    // $ANTLR start "rule__UserTypeDeclaration__Group_1__0"
    // InternalOberon.g:1819:1: rule__UserTypeDeclaration__Group_1__0 : rule__UserTypeDeclaration__Group_1__0__Impl rule__UserTypeDeclaration__Group_1__1 ;
    public final void rule__UserTypeDeclaration__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1823:1: ( rule__UserTypeDeclaration__Group_1__0__Impl rule__UserTypeDeclaration__Group_1__1 )
            // InternalOberon.g:1824:2: rule__UserTypeDeclaration__Group_1__0__Impl rule__UserTypeDeclaration__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__UserTypeDeclaration__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UserTypeDeclaration__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserTypeDeclaration__Group_1__0"


    // $ANTLR start "rule__UserTypeDeclaration__Group_1__0__Impl"
    // InternalOberon.g:1831:1: rule__UserTypeDeclaration__Group_1__0__Impl : ( ( rule__UserTypeDeclaration__NameTypeAssignment_1_0 ) ) ;
    public final void rule__UserTypeDeclaration__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1835:1: ( ( ( rule__UserTypeDeclaration__NameTypeAssignment_1_0 ) ) )
            // InternalOberon.g:1836:1: ( ( rule__UserTypeDeclaration__NameTypeAssignment_1_0 ) )
            {
            // InternalOberon.g:1836:1: ( ( rule__UserTypeDeclaration__NameTypeAssignment_1_0 ) )
            // InternalOberon.g:1837:2: ( rule__UserTypeDeclaration__NameTypeAssignment_1_0 )
            {
             before(grammarAccess.getUserTypeDeclarationAccess().getNameTypeAssignment_1_0()); 
            // InternalOberon.g:1838:2: ( rule__UserTypeDeclaration__NameTypeAssignment_1_0 )
            // InternalOberon.g:1838:3: rule__UserTypeDeclaration__NameTypeAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__UserTypeDeclaration__NameTypeAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getUserTypeDeclarationAccess().getNameTypeAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserTypeDeclaration__Group_1__0__Impl"


    // $ANTLR start "rule__UserTypeDeclaration__Group_1__1"
    // InternalOberon.g:1846:1: rule__UserTypeDeclaration__Group_1__1 : rule__UserTypeDeclaration__Group_1__1__Impl rule__UserTypeDeclaration__Group_1__2 ;
    public final void rule__UserTypeDeclaration__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1850:1: ( rule__UserTypeDeclaration__Group_1__1__Impl rule__UserTypeDeclaration__Group_1__2 )
            // InternalOberon.g:1851:2: rule__UserTypeDeclaration__Group_1__1__Impl rule__UserTypeDeclaration__Group_1__2
            {
            pushFollow(FOLLOW_18);
            rule__UserTypeDeclaration__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UserTypeDeclaration__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserTypeDeclaration__Group_1__1"


    // $ANTLR start "rule__UserTypeDeclaration__Group_1__1__Impl"
    // InternalOberon.g:1858:1: rule__UserTypeDeclaration__Group_1__1__Impl : ( '=' ) ;
    public final void rule__UserTypeDeclaration__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1862:1: ( ( '=' ) )
            // InternalOberon.g:1863:1: ( '=' )
            {
            // InternalOberon.g:1863:1: ( '=' )
            // InternalOberon.g:1864:2: '='
            {
             before(grammarAccess.getUserTypeDeclarationAccess().getEqualsSignKeyword_1_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getUserTypeDeclarationAccess().getEqualsSignKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserTypeDeclaration__Group_1__1__Impl"


    // $ANTLR start "rule__UserTypeDeclaration__Group_1__2"
    // InternalOberon.g:1873:1: rule__UserTypeDeclaration__Group_1__2 : rule__UserTypeDeclaration__Group_1__2__Impl ;
    public final void rule__UserTypeDeclaration__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1877:1: ( rule__UserTypeDeclaration__Group_1__2__Impl )
            // InternalOberon.g:1878:2: rule__UserTypeDeclaration__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UserTypeDeclaration__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserTypeDeclaration__Group_1__2"


    // $ANTLR start "rule__UserTypeDeclaration__Group_1__2__Impl"
    // InternalOberon.g:1884:1: rule__UserTypeDeclaration__Group_1__2__Impl : ( ( rule__UserTypeDeclaration__Group_1_2__0 ) ) ;
    public final void rule__UserTypeDeclaration__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1888:1: ( ( ( rule__UserTypeDeclaration__Group_1_2__0 ) ) )
            // InternalOberon.g:1889:1: ( ( rule__UserTypeDeclaration__Group_1_2__0 ) )
            {
            // InternalOberon.g:1889:1: ( ( rule__UserTypeDeclaration__Group_1_2__0 ) )
            // InternalOberon.g:1890:2: ( rule__UserTypeDeclaration__Group_1_2__0 )
            {
             before(grammarAccess.getUserTypeDeclarationAccess().getGroup_1_2()); 
            // InternalOberon.g:1891:2: ( rule__UserTypeDeclaration__Group_1_2__0 )
            // InternalOberon.g:1891:3: rule__UserTypeDeclaration__Group_1_2__0
            {
            pushFollow(FOLLOW_2);
            rule__UserTypeDeclaration__Group_1_2__0();

            state._fsp--;


            }

             after(grammarAccess.getUserTypeDeclarationAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserTypeDeclaration__Group_1__2__Impl"


    // $ANTLR start "rule__UserTypeDeclaration__Group_1_2__0"
    // InternalOberon.g:1900:1: rule__UserTypeDeclaration__Group_1_2__0 : rule__UserTypeDeclaration__Group_1_2__0__Impl rule__UserTypeDeclaration__Group_1_2__1 ;
    public final void rule__UserTypeDeclaration__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1904:1: ( rule__UserTypeDeclaration__Group_1_2__0__Impl rule__UserTypeDeclaration__Group_1_2__1 )
            // InternalOberon.g:1905:2: rule__UserTypeDeclaration__Group_1_2__0__Impl rule__UserTypeDeclaration__Group_1_2__1
            {
            pushFollow(FOLLOW_3);
            rule__UserTypeDeclaration__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UserTypeDeclaration__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserTypeDeclaration__Group_1_2__0"


    // $ANTLR start "rule__UserTypeDeclaration__Group_1_2__0__Impl"
    // InternalOberon.g:1912:1: rule__UserTypeDeclaration__Group_1_2__0__Impl : ( 'RECORD' ) ;
    public final void rule__UserTypeDeclaration__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1916:1: ( ( 'RECORD' ) )
            // InternalOberon.g:1917:1: ( 'RECORD' )
            {
            // InternalOberon.g:1917:1: ( 'RECORD' )
            // InternalOberon.g:1918:2: 'RECORD'
            {
             before(grammarAccess.getUserTypeDeclarationAccess().getRECORDKeyword_1_2_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getUserTypeDeclarationAccess().getRECORDKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserTypeDeclaration__Group_1_2__0__Impl"


    // $ANTLR start "rule__UserTypeDeclaration__Group_1_2__1"
    // InternalOberon.g:1927:1: rule__UserTypeDeclaration__Group_1_2__1 : rule__UserTypeDeclaration__Group_1_2__1__Impl rule__UserTypeDeclaration__Group_1_2__2 ;
    public final void rule__UserTypeDeclaration__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1931:1: ( rule__UserTypeDeclaration__Group_1_2__1__Impl rule__UserTypeDeclaration__Group_1_2__2 )
            // InternalOberon.g:1932:2: rule__UserTypeDeclaration__Group_1_2__1__Impl rule__UserTypeDeclaration__Group_1_2__2
            {
            pushFollow(FOLLOW_19);
            rule__UserTypeDeclaration__Group_1_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UserTypeDeclaration__Group_1_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserTypeDeclaration__Group_1_2__1"


    // $ANTLR start "rule__UserTypeDeclaration__Group_1_2__1__Impl"
    // InternalOberon.g:1939:1: rule__UserTypeDeclaration__Group_1_2__1__Impl : ( ( ( rule__UserTypeDeclaration__VarsAssignment_1_2_1 ) ) ( ( rule__UserTypeDeclaration__VarsAssignment_1_2_1 )* ) ) ;
    public final void rule__UserTypeDeclaration__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1943:1: ( ( ( ( rule__UserTypeDeclaration__VarsAssignment_1_2_1 ) ) ( ( rule__UserTypeDeclaration__VarsAssignment_1_2_1 )* ) ) )
            // InternalOberon.g:1944:1: ( ( ( rule__UserTypeDeclaration__VarsAssignment_1_2_1 ) ) ( ( rule__UserTypeDeclaration__VarsAssignment_1_2_1 )* ) )
            {
            // InternalOberon.g:1944:1: ( ( ( rule__UserTypeDeclaration__VarsAssignment_1_2_1 ) ) ( ( rule__UserTypeDeclaration__VarsAssignment_1_2_1 )* ) )
            // InternalOberon.g:1945:2: ( ( rule__UserTypeDeclaration__VarsAssignment_1_2_1 ) ) ( ( rule__UserTypeDeclaration__VarsAssignment_1_2_1 )* )
            {
            // InternalOberon.g:1945:2: ( ( rule__UserTypeDeclaration__VarsAssignment_1_2_1 ) )
            // InternalOberon.g:1946:3: ( rule__UserTypeDeclaration__VarsAssignment_1_2_1 )
            {
             before(grammarAccess.getUserTypeDeclarationAccess().getVarsAssignment_1_2_1()); 
            // InternalOberon.g:1947:3: ( rule__UserTypeDeclaration__VarsAssignment_1_2_1 )
            // InternalOberon.g:1947:4: rule__UserTypeDeclaration__VarsAssignment_1_2_1
            {
            pushFollow(FOLLOW_12);
            rule__UserTypeDeclaration__VarsAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getUserTypeDeclarationAccess().getVarsAssignment_1_2_1()); 

            }

            // InternalOberon.g:1950:2: ( ( rule__UserTypeDeclaration__VarsAssignment_1_2_1 )* )
            // InternalOberon.g:1951:3: ( rule__UserTypeDeclaration__VarsAssignment_1_2_1 )*
            {
             before(grammarAccess.getUserTypeDeclarationAccess().getVarsAssignment_1_2_1()); 
            // InternalOberon.g:1952:3: ( rule__UserTypeDeclaration__VarsAssignment_1_2_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalOberon.g:1952:4: rule__UserTypeDeclaration__VarsAssignment_1_2_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__UserTypeDeclaration__VarsAssignment_1_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getUserTypeDeclarationAccess().getVarsAssignment_1_2_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserTypeDeclaration__Group_1_2__1__Impl"


    // $ANTLR start "rule__UserTypeDeclaration__Group_1_2__2"
    // InternalOberon.g:1961:1: rule__UserTypeDeclaration__Group_1_2__2 : rule__UserTypeDeclaration__Group_1_2__2__Impl ;
    public final void rule__UserTypeDeclaration__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1965:1: ( rule__UserTypeDeclaration__Group_1_2__2__Impl )
            // InternalOberon.g:1966:2: rule__UserTypeDeclaration__Group_1_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UserTypeDeclaration__Group_1_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserTypeDeclaration__Group_1_2__2"


    // $ANTLR start "rule__UserTypeDeclaration__Group_1_2__2__Impl"
    // InternalOberon.g:1972:1: rule__UserTypeDeclaration__Group_1_2__2__Impl : ( 'END' ) ;
    public final void rule__UserTypeDeclaration__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1976:1: ( ( 'END' ) )
            // InternalOberon.g:1977:1: ( 'END' )
            {
            // InternalOberon.g:1977:1: ( 'END' )
            // InternalOberon.g:1978:2: 'END'
            {
             before(grammarAccess.getUserTypeDeclarationAccess().getENDKeyword_1_2_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getUserTypeDeclarationAccess().getENDKeyword_1_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserTypeDeclaration__Group_1_2__2__Impl"


    // $ANTLR start "rule__Constant__Group__0"
    // InternalOberon.g:1988:1: rule__Constant__Group__0 : rule__Constant__Group__0__Impl rule__Constant__Group__1 ;
    public final void rule__Constant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:1992:1: ( rule__Constant__Group__0__Impl rule__Constant__Group__1 )
            // InternalOberon.g:1993:2: rule__Constant__Group__0__Impl rule__Constant__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Constant__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constant__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__0"


    // $ANTLR start "rule__Constant__Group__0__Impl"
    // InternalOberon.g:2000:1: rule__Constant__Group__0__Impl : ( ( rule__Constant__ConstNameAssignment_0 ) ) ;
    public final void rule__Constant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2004:1: ( ( ( rule__Constant__ConstNameAssignment_0 ) ) )
            // InternalOberon.g:2005:1: ( ( rule__Constant__ConstNameAssignment_0 ) )
            {
            // InternalOberon.g:2005:1: ( ( rule__Constant__ConstNameAssignment_0 ) )
            // InternalOberon.g:2006:2: ( rule__Constant__ConstNameAssignment_0 )
            {
             before(grammarAccess.getConstantAccess().getConstNameAssignment_0()); 
            // InternalOberon.g:2007:2: ( rule__Constant__ConstNameAssignment_0 )
            // InternalOberon.g:2007:3: rule__Constant__ConstNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Constant__ConstNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getConstNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__0__Impl"


    // $ANTLR start "rule__Constant__Group__1"
    // InternalOberon.g:2015:1: rule__Constant__Group__1 : rule__Constant__Group__1__Impl rule__Constant__Group__2 ;
    public final void rule__Constant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2019:1: ( rule__Constant__Group__1__Impl rule__Constant__Group__2 )
            // InternalOberon.g:2020:2: rule__Constant__Group__1__Impl rule__Constant__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Constant__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constant__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__1"


    // $ANTLR start "rule__Constant__Group__1__Impl"
    // InternalOberon.g:2027:1: rule__Constant__Group__1__Impl : ( '=' ) ;
    public final void rule__Constant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2031:1: ( ( '=' ) )
            // InternalOberon.g:2032:1: ( '=' )
            {
            // InternalOberon.g:2032:1: ( '=' )
            // InternalOberon.g:2033:2: '='
            {
             before(grammarAccess.getConstantAccess().getEqualsSignKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getConstantAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__1__Impl"


    // $ANTLR start "rule__Constant__Group__2"
    // InternalOberon.g:2042:1: rule__Constant__Group__2 : rule__Constant__Group__2__Impl rule__Constant__Group__3 ;
    public final void rule__Constant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2046:1: ( rule__Constant__Group__2__Impl rule__Constant__Group__3 )
            // InternalOberon.g:2047:2: rule__Constant__Group__2__Impl rule__Constant__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Constant__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constant__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__2"


    // $ANTLR start "rule__Constant__Group__2__Impl"
    // InternalOberon.g:2054:1: rule__Constant__Group__2__Impl : ( ( rule__Constant__ExpAssignment_2 ) ) ;
    public final void rule__Constant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2058:1: ( ( ( rule__Constant__ExpAssignment_2 ) ) )
            // InternalOberon.g:2059:1: ( ( rule__Constant__ExpAssignment_2 ) )
            {
            // InternalOberon.g:2059:1: ( ( rule__Constant__ExpAssignment_2 ) )
            // InternalOberon.g:2060:2: ( rule__Constant__ExpAssignment_2 )
            {
             before(grammarAccess.getConstantAccess().getExpAssignment_2()); 
            // InternalOberon.g:2061:2: ( rule__Constant__ExpAssignment_2 )
            // InternalOberon.g:2061:3: rule__Constant__ExpAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Constant__ExpAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getExpAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__2__Impl"


    // $ANTLR start "rule__Constant__Group__3"
    // InternalOberon.g:2069:1: rule__Constant__Group__3 : rule__Constant__Group__3__Impl ;
    public final void rule__Constant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2073:1: ( rule__Constant__Group__3__Impl )
            // InternalOberon.g:2074:2: rule__Constant__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constant__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__3"


    // $ANTLR start "rule__Constant__Group__3__Impl"
    // InternalOberon.g:2080:1: rule__Constant__Group__3__Impl : ( ';' ) ;
    public final void rule__Constant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2084:1: ( ( ';' ) )
            // InternalOberon.g:2085:1: ( ';' )
            {
            // InternalOberon.g:2085:1: ( ';' )
            // InternalOberon.g:2086:2: ';'
            {
             before(grammarAccess.getConstantAccess().getSemicolonKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getConstantAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__3__Impl"


    // $ANTLR start "rule__VarDeclaration__Group__0"
    // InternalOberon.g:2096:1: rule__VarDeclaration__Group__0 : rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1 ;
    public final void rule__VarDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2100:1: ( rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1 )
            // InternalOberon.g:2101:2: rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__VarDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group__0"


    // $ANTLR start "rule__VarDeclaration__Group__0__Impl"
    // InternalOberon.g:2108:1: rule__VarDeclaration__Group__0__Impl : ( ( rule__VarDeclaration__Group_0__0 ) ) ;
    public final void rule__VarDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2112:1: ( ( ( rule__VarDeclaration__Group_0__0 ) ) )
            // InternalOberon.g:2113:1: ( ( rule__VarDeclaration__Group_0__0 ) )
            {
            // InternalOberon.g:2113:1: ( ( rule__VarDeclaration__Group_0__0 ) )
            // InternalOberon.g:2114:2: ( rule__VarDeclaration__Group_0__0 )
            {
             before(grammarAccess.getVarDeclarationAccess().getGroup_0()); 
            // InternalOberon.g:2115:2: ( rule__VarDeclaration__Group_0__0 )
            // InternalOberon.g:2115:3: rule__VarDeclaration__Group_0__0
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group_0__0();

            state._fsp--;


            }

             after(grammarAccess.getVarDeclarationAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group__0__Impl"


    // $ANTLR start "rule__VarDeclaration__Group__1"
    // InternalOberon.g:2123:1: rule__VarDeclaration__Group__1 : rule__VarDeclaration__Group__1__Impl rule__VarDeclaration__Group__2 ;
    public final void rule__VarDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2127:1: ( rule__VarDeclaration__Group__1__Impl rule__VarDeclaration__Group__2 )
            // InternalOberon.g:2128:2: rule__VarDeclaration__Group__1__Impl rule__VarDeclaration__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__VarDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group__1"


    // $ANTLR start "rule__VarDeclaration__Group__1__Impl"
    // InternalOberon.g:2135:1: rule__VarDeclaration__Group__1__Impl : ( ':' ) ;
    public final void rule__VarDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2139:1: ( ( ':' ) )
            // InternalOberon.g:2140:1: ( ':' )
            {
            // InternalOberon.g:2140:1: ( ':' )
            // InternalOberon.g:2141:2: ':'
            {
             before(grammarAccess.getVarDeclarationAccess().getColonKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getVarDeclarationAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group__1__Impl"


    // $ANTLR start "rule__VarDeclaration__Group__2"
    // InternalOberon.g:2150:1: rule__VarDeclaration__Group__2 : rule__VarDeclaration__Group__2__Impl rule__VarDeclaration__Group__3 ;
    public final void rule__VarDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2154:1: ( rule__VarDeclaration__Group__2__Impl rule__VarDeclaration__Group__3 )
            // InternalOberon.g:2155:2: rule__VarDeclaration__Group__2__Impl rule__VarDeclaration__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__VarDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group__2"


    // $ANTLR start "rule__VarDeclaration__Group__2__Impl"
    // InternalOberon.g:2162:1: rule__VarDeclaration__Group__2__Impl : ( ( rule__VarDeclaration__VarTypeAssignment_2 ) ) ;
    public final void rule__VarDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2166:1: ( ( ( rule__VarDeclaration__VarTypeAssignment_2 ) ) )
            // InternalOberon.g:2167:1: ( ( rule__VarDeclaration__VarTypeAssignment_2 ) )
            {
            // InternalOberon.g:2167:1: ( ( rule__VarDeclaration__VarTypeAssignment_2 ) )
            // InternalOberon.g:2168:2: ( rule__VarDeclaration__VarTypeAssignment_2 )
            {
             before(grammarAccess.getVarDeclarationAccess().getVarTypeAssignment_2()); 
            // InternalOberon.g:2169:2: ( rule__VarDeclaration__VarTypeAssignment_2 )
            // InternalOberon.g:2169:3: rule__VarDeclaration__VarTypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__VarTypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVarDeclarationAccess().getVarTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group__2__Impl"


    // $ANTLR start "rule__VarDeclaration__Group__3"
    // InternalOberon.g:2177:1: rule__VarDeclaration__Group__3 : rule__VarDeclaration__Group__3__Impl ;
    public final void rule__VarDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2181:1: ( rule__VarDeclaration__Group__3__Impl )
            // InternalOberon.g:2182:2: rule__VarDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group__3"


    // $ANTLR start "rule__VarDeclaration__Group__3__Impl"
    // InternalOberon.g:2188:1: rule__VarDeclaration__Group__3__Impl : ( ';' ) ;
    public final void rule__VarDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2192:1: ( ( ';' ) )
            // InternalOberon.g:2193:1: ( ';' )
            {
            // InternalOberon.g:2193:1: ( ';' )
            // InternalOberon.g:2194:2: ';'
            {
             before(grammarAccess.getVarDeclarationAccess().getSemicolonKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getVarDeclarationAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group__3__Impl"


    // $ANTLR start "rule__VarDeclaration__Group_0__0"
    // InternalOberon.g:2204:1: rule__VarDeclaration__Group_0__0 : rule__VarDeclaration__Group_0__0__Impl rule__VarDeclaration__Group_0__1 ;
    public final void rule__VarDeclaration__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2208:1: ( rule__VarDeclaration__Group_0__0__Impl rule__VarDeclaration__Group_0__1 )
            // InternalOberon.g:2209:2: rule__VarDeclaration__Group_0__0__Impl rule__VarDeclaration__Group_0__1
            {
            pushFollow(FOLLOW_22);
            rule__VarDeclaration__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group_0__0"


    // $ANTLR start "rule__VarDeclaration__Group_0__0__Impl"
    // InternalOberon.g:2216:1: rule__VarDeclaration__Group_0__0__Impl : ( ( rule__VarDeclaration__VarsAssignment_0_0 ) ) ;
    public final void rule__VarDeclaration__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2220:1: ( ( ( rule__VarDeclaration__VarsAssignment_0_0 ) ) )
            // InternalOberon.g:2221:1: ( ( rule__VarDeclaration__VarsAssignment_0_0 ) )
            {
            // InternalOberon.g:2221:1: ( ( rule__VarDeclaration__VarsAssignment_0_0 ) )
            // InternalOberon.g:2222:2: ( rule__VarDeclaration__VarsAssignment_0_0 )
            {
             before(grammarAccess.getVarDeclarationAccess().getVarsAssignment_0_0()); 
            // InternalOberon.g:2223:2: ( rule__VarDeclaration__VarsAssignment_0_0 )
            // InternalOberon.g:2223:3: rule__VarDeclaration__VarsAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__VarsAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getVarDeclarationAccess().getVarsAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group_0__0__Impl"


    // $ANTLR start "rule__VarDeclaration__Group_0__1"
    // InternalOberon.g:2231:1: rule__VarDeclaration__Group_0__1 : rule__VarDeclaration__Group_0__1__Impl ;
    public final void rule__VarDeclaration__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2235:1: ( rule__VarDeclaration__Group_0__1__Impl )
            // InternalOberon.g:2236:2: rule__VarDeclaration__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group_0__1"


    // $ANTLR start "rule__VarDeclaration__Group_0__1__Impl"
    // InternalOberon.g:2242:1: rule__VarDeclaration__Group_0__1__Impl : ( ( rule__VarDeclaration__Group_0_1__0 )* ) ;
    public final void rule__VarDeclaration__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2246:1: ( ( ( rule__VarDeclaration__Group_0_1__0 )* ) )
            // InternalOberon.g:2247:1: ( ( rule__VarDeclaration__Group_0_1__0 )* )
            {
            // InternalOberon.g:2247:1: ( ( rule__VarDeclaration__Group_0_1__0 )* )
            // InternalOberon.g:2248:2: ( rule__VarDeclaration__Group_0_1__0 )*
            {
             before(grammarAccess.getVarDeclarationAccess().getGroup_0_1()); 
            // InternalOberon.g:2249:2: ( rule__VarDeclaration__Group_0_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==37) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalOberon.g:2249:3: rule__VarDeclaration__Group_0_1__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__VarDeclaration__Group_0_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getVarDeclarationAccess().getGroup_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group_0__1__Impl"


    // $ANTLR start "rule__VarDeclaration__Group_0_1__0"
    // InternalOberon.g:2258:1: rule__VarDeclaration__Group_0_1__0 : rule__VarDeclaration__Group_0_1__0__Impl rule__VarDeclaration__Group_0_1__1 ;
    public final void rule__VarDeclaration__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2262:1: ( rule__VarDeclaration__Group_0_1__0__Impl rule__VarDeclaration__Group_0_1__1 )
            // InternalOberon.g:2263:2: rule__VarDeclaration__Group_0_1__0__Impl rule__VarDeclaration__Group_0_1__1
            {
            pushFollow(FOLLOW_3);
            rule__VarDeclaration__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group_0_1__0"


    // $ANTLR start "rule__VarDeclaration__Group_0_1__0__Impl"
    // InternalOberon.g:2270:1: rule__VarDeclaration__Group_0_1__0__Impl : ( ',' ) ;
    public final void rule__VarDeclaration__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2274:1: ( ( ',' ) )
            // InternalOberon.g:2275:1: ( ',' )
            {
            // InternalOberon.g:2275:1: ( ',' )
            // InternalOberon.g:2276:2: ','
            {
             before(grammarAccess.getVarDeclarationAccess().getCommaKeyword_0_1_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getVarDeclarationAccess().getCommaKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group_0_1__0__Impl"


    // $ANTLR start "rule__VarDeclaration__Group_0_1__1"
    // InternalOberon.g:2285:1: rule__VarDeclaration__Group_0_1__1 : rule__VarDeclaration__Group_0_1__1__Impl ;
    public final void rule__VarDeclaration__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2289:1: ( rule__VarDeclaration__Group_0_1__1__Impl )
            // InternalOberon.g:2290:2: rule__VarDeclaration__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group_0_1__1"


    // $ANTLR start "rule__VarDeclaration__Group_0_1__1__Impl"
    // InternalOberon.g:2296:1: rule__VarDeclaration__Group_0_1__1__Impl : ( ( rule__VarDeclaration__VarsAssignment_0_1_1 ) ) ;
    public final void rule__VarDeclaration__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2300:1: ( ( ( rule__VarDeclaration__VarsAssignment_0_1_1 ) ) )
            // InternalOberon.g:2301:1: ( ( rule__VarDeclaration__VarsAssignment_0_1_1 ) )
            {
            // InternalOberon.g:2301:1: ( ( rule__VarDeclaration__VarsAssignment_0_1_1 ) )
            // InternalOberon.g:2302:2: ( rule__VarDeclaration__VarsAssignment_0_1_1 )
            {
             before(grammarAccess.getVarDeclarationAccess().getVarsAssignment_0_1_1()); 
            // InternalOberon.g:2303:2: ( rule__VarDeclaration__VarsAssignment_0_1_1 )
            // InternalOberon.g:2303:3: rule__VarDeclaration__VarsAssignment_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__VarsAssignment_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getVarDeclarationAccess().getVarsAssignment_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group_0_1__1__Impl"


    // $ANTLR start "rule__Procedure__Group__0"
    // InternalOberon.g:2312:1: rule__Procedure__Group__0 : rule__Procedure__Group__0__Impl rule__Procedure__Group__1 ;
    public final void rule__Procedure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2316:1: ( rule__Procedure__Group__0__Impl rule__Procedure__Group__1 )
            // InternalOberon.g:2317:2: rule__Procedure__Group__0__Impl rule__Procedure__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Procedure__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__0"


    // $ANTLR start "rule__Procedure__Group__0__Impl"
    // InternalOberon.g:2324:1: rule__Procedure__Group__0__Impl : ( 'PROCEDURE' ) ;
    public final void rule__Procedure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2328:1: ( ( 'PROCEDURE' ) )
            // InternalOberon.g:2329:1: ( 'PROCEDURE' )
            {
            // InternalOberon.g:2329:1: ( 'PROCEDURE' )
            // InternalOberon.g:2330:2: 'PROCEDURE'
            {
             before(grammarAccess.getProcedureAccess().getPROCEDUREKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getProcedureAccess().getPROCEDUREKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__0__Impl"


    // $ANTLR start "rule__Procedure__Group__1"
    // InternalOberon.g:2339:1: rule__Procedure__Group__1 : rule__Procedure__Group__1__Impl rule__Procedure__Group__2 ;
    public final void rule__Procedure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2343:1: ( rule__Procedure__Group__1__Impl rule__Procedure__Group__2 )
            // InternalOberon.g:2344:2: rule__Procedure__Group__1__Impl rule__Procedure__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__Procedure__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__1"


    // $ANTLR start "rule__Procedure__Group__1__Impl"
    // InternalOberon.g:2351:1: rule__Procedure__Group__1__Impl : ( ( rule__Procedure__NameAssignment_1 ) ) ;
    public final void rule__Procedure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2355:1: ( ( ( rule__Procedure__NameAssignment_1 ) ) )
            // InternalOberon.g:2356:1: ( ( rule__Procedure__NameAssignment_1 ) )
            {
            // InternalOberon.g:2356:1: ( ( rule__Procedure__NameAssignment_1 ) )
            // InternalOberon.g:2357:2: ( rule__Procedure__NameAssignment_1 )
            {
             before(grammarAccess.getProcedureAccess().getNameAssignment_1()); 
            // InternalOberon.g:2358:2: ( rule__Procedure__NameAssignment_1 )
            // InternalOberon.g:2358:3: rule__Procedure__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Procedure__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProcedureAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__1__Impl"


    // $ANTLR start "rule__Procedure__Group__2"
    // InternalOberon.g:2366:1: rule__Procedure__Group__2 : rule__Procedure__Group__2__Impl rule__Procedure__Group__3 ;
    public final void rule__Procedure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2370:1: ( rule__Procedure__Group__2__Impl rule__Procedure__Group__3 )
            // InternalOberon.g:2371:2: rule__Procedure__Group__2__Impl rule__Procedure__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__Procedure__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__2"


    // $ANTLR start "rule__Procedure__Group__2__Impl"
    // InternalOberon.g:2378:1: rule__Procedure__Group__2__Impl : ( '(' ) ;
    public final void rule__Procedure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2382:1: ( ( '(' ) )
            // InternalOberon.g:2383:1: ( '(' )
            {
            // InternalOberon.g:2383:1: ( '(' )
            // InternalOberon.g:2384:2: '('
            {
             before(grammarAccess.getProcedureAccess().getLeftParenthesisKeyword_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getProcedureAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__2__Impl"


    // $ANTLR start "rule__Procedure__Group__3"
    // InternalOberon.g:2393:1: rule__Procedure__Group__3 : rule__Procedure__Group__3__Impl rule__Procedure__Group__4 ;
    public final void rule__Procedure__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2397:1: ( rule__Procedure__Group__3__Impl rule__Procedure__Group__4 )
            // InternalOberon.g:2398:2: rule__Procedure__Group__3__Impl rule__Procedure__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__Procedure__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__3"


    // $ANTLR start "rule__Procedure__Group__3__Impl"
    // InternalOberon.g:2405:1: rule__Procedure__Group__3__Impl : ( ( rule__Procedure__FormalsAssignment_3 )? ) ;
    public final void rule__Procedure__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2409:1: ( ( ( rule__Procedure__FormalsAssignment_3 )? ) )
            // InternalOberon.g:2410:1: ( ( rule__Procedure__FormalsAssignment_3 )? )
            {
            // InternalOberon.g:2410:1: ( ( rule__Procedure__FormalsAssignment_3 )? )
            // InternalOberon.g:2411:2: ( rule__Procedure__FormalsAssignment_3 )?
            {
             before(grammarAccess.getProcedureAccess().getFormalsAssignment_3()); 
            // InternalOberon.g:2412:2: ( rule__Procedure__FormalsAssignment_3 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalOberon.g:2412:3: rule__Procedure__FormalsAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Procedure__FormalsAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcedureAccess().getFormalsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__3__Impl"


    // $ANTLR start "rule__Procedure__Group__4"
    // InternalOberon.g:2420:1: rule__Procedure__Group__4 : rule__Procedure__Group__4__Impl rule__Procedure__Group__5 ;
    public final void rule__Procedure__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2424:1: ( rule__Procedure__Group__4__Impl rule__Procedure__Group__5 )
            // InternalOberon.g:2425:2: rule__Procedure__Group__4__Impl rule__Procedure__Group__5
            {
            pushFollow(FOLLOW_26);
            rule__Procedure__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__4"


    // $ANTLR start "rule__Procedure__Group__4__Impl"
    // InternalOberon.g:2432:1: rule__Procedure__Group__4__Impl : ( ')' ) ;
    public final void rule__Procedure__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2436:1: ( ( ')' ) )
            // InternalOberon.g:2437:1: ( ')' )
            {
            // InternalOberon.g:2437:1: ( ')' )
            // InternalOberon.g:2438:2: ')'
            {
             before(grammarAccess.getProcedureAccess().getRightParenthesisKeyword_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getProcedureAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__4__Impl"


    // $ANTLR start "rule__Procedure__Group__5"
    // InternalOberon.g:2447:1: rule__Procedure__Group__5 : rule__Procedure__Group__5__Impl rule__Procedure__Group__6 ;
    public final void rule__Procedure__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2451:1: ( rule__Procedure__Group__5__Impl rule__Procedure__Group__6 )
            // InternalOberon.g:2452:2: rule__Procedure__Group__5__Impl rule__Procedure__Group__6
            {
            pushFollow(FOLLOW_26);
            rule__Procedure__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__5"


    // $ANTLR start "rule__Procedure__Group__5__Impl"
    // InternalOberon.g:2459:1: rule__Procedure__Group__5__Impl : ( ( rule__Procedure__Group_5__0 )? ) ;
    public final void rule__Procedure__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2463:1: ( ( ( rule__Procedure__Group_5__0 )? ) )
            // InternalOberon.g:2464:1: ( ( rule__Procedure__Group_5__0 )? )
            {
            // InternalOberon.g:2464:1: ( ( rule__Procedure__Group_5__0 )? )
            // InternalOberon.g:2465:2: ( rule__Procedure__Group_5__0 )?
            {
             before(grammarAccess.getProcedureAccess().getGroup_5()); 
            // InternalOberon.g:2466:2: ( rule__Procedure__Group_5__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==36) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalOberon.g:2466:3: rule__Procedure__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Procedure__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcedureAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__5__Impl"


    // $ANTLR start "rule__Procedure__Group__6"
    // InternalOberon.g:2474:1: rule__Procedure__Group__6 : rule__Procedure__Group__6__Impl rule__Procedure__Group__7 ;
    public final void rule__Procedure__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2478:1: ( rule__Procedure__Group__6__Impl rule__Procedure__Group__7 )
            // InternalOberon.g:2479:2: rule__Procedure__Group__6__Impl rule__Procedure__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__Procedure__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__6"


    // $ANTLR start "rule__Procedure__Group__6__Impl"
    // InternalOberon.g:2486:1: rule__Procedure__Group__6__Impl : ( ';' ) ;
    public final void rule__Procedure__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2490:1: ( ( ';' ) )
            // InternalOberon.g:2491:1: ( ';' )
            {
            // InternalOberon.g:2491:1: ( ';' )
            // InternalOberon.g:2492:2: ';'
            {
             before(grammarAccess.getProcedureAccess().getSemicolonKeyword_6()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getProcedureAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__6__Impl"


    // $ANTLR start "rule__Procedure__Group__7"
    // InternalOberon.g:2501:1: rule__Procedure__Group__7 : rule__Procedure__Group__7__Impl rule__Procedure__Group__8 ;
    public final void rule__Procedure__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2505:1: ( rule__Procedure__Group__7__Impl rule__Procedure__Group__8 )
            // InternalOberon.g:2506:2: rule__Procedure__Group__7__Impl rule__Procedure__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__Procedure__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__7"


    // $ANTLR start "rule__Procedure__Group__7__Impl"
    // InternalOberon.g:2513:1: rule__Procedure__Group__7__Impl : ( ( rule__Procedure__DeclAssignment_7 ) ) ;
    public final void rule__Procedure__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2517:1: ( ( ( rule__Procedure__DeclAssignment_7 ) ) )
            // InternalOberon.g:2518:1: ( ( rule__Procedure__DeclAssignment_7 ) )
            {
            // InternalOberon.g:2518:1: ( ( rule__Procedure__DeclAssignment_7 ) )
            // InternalOberon.g:2519:2: ( rule__Procedure__DeclAssignment_7 )
            {
             before(grammarAccess.getProcedureAccess().getDeclAssignment_7()); 
            // InternalOberon.g:2520:2: ( rule__Procedure__DeclAssignment_7 )
            // InternalOberon.g:2520:3: rule__Procedure__DeclAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Procedure__DeclAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getProcedureAccess().getDeclAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__7__Impl"


    // $ANTLR start "rule__Procedure__Group__8"
    // InternalOberon.g:2528:1: rule__Procedure__Group__8 : rule__Procedure__Group__8__Impl rule__Procedure__Group__9 ;
    public final void rule__Procedure__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2532:1: ( rule__Procedure__Group__8__Impl rule__Procedure__Group__9 )
            // InternalOberon.g:2533:2: rule__Procedure__Group__8__Impl rule__Procedure__Group__9
            {
            pushFollow(FOLLOW_3);
            rule__Procedure__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__8"


    // $ANTLR start "rule__Procedure__Group__8__Impl"
    // InternalOberon.g:2540:1: rule__Procedure__Group__8__Impl : ( ( rule__Procedure__BlockAssignment_8 ) ) ;
    public final void rule__Procedure__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2544:1: ( ( ( rule__Procedure__BlockAssignment_8 ) ) )
            // InternalOberon.g:2545:1: ( ( rule__Procedure__BlockAssignment_8 ) )
            {
            // InternalOberon.g:2545:1: ( ( rule__Procedure__BlockAssignment_8 ) )
            // InternalOberon.g:2546:2: ( rule__Procedure__BlockAssignment_8 )
            {
             before(grammarAccess.getProcedureAccess().getBlockAssignment_8()); 
            // InternalOberon.g:2547:2: ( rule__Procedure__BlockAssignment_8 )
            // InternalOberon.g:2547:3: rule__Procedure__BlockAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Procedure__BlockAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getProcedureAccess().getBlockAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__8__Impl"


    // $ANTLR start "rule__Procedure__Group__9"
    // InternalOberon.g:2555:1: rule__Procedure__Group__9 : rule__Procedure__Group__9__Impl ;
    public final void rule__Procedure__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2559:1: ( rule__Procedure__Group__9__Impl )
            // InternalOberon.g:2560:2: rule__Procedure__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Procedure__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__9"


    // $ANTLR start "rule__Procedure__Group__9__Impl"
    // InternalOberon.g:2566:1: rule__Procedure__Group__9__Impl : ( RULE_ID ) ;
    public final void rule__Procedure__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2570:1: ( ( RULE_ID ) )
            // InternalOberon.g:2571:1: ( RULE_ID )
            {
            // InternalOberon.g:2571:1: ( RULE_ID )
            // InternalOberon.g:2572:2: RULE_ID
            {
             before(grammarAccess.getProcedureAccess().getIDTerminalRuleCall_9()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProcedureAccess().getIDTerminalRuleCall_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__9__Impl"


    // $ANTLR start "rule__Procedure__Group_5__0"
    // InternalOberon.g:2582:1: rule__Procedure__Group_5__0 : rule__Procedure__Group_5__0__Impl rule__Procedure__Group_5__1 ;
    public final void rule__Procedure__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2586:1: ( rule__Procedure__Group_5__0__Impl rule__Procedure__Group_5__1 )
            // InternalOberon.g:2587:2: rule__Procedure__Group_5__0__Impl rule__Procedure__Group_5__1
            {
            pushFollow(FOLLOW_17);
            rule__Procedure__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group_5__0"


    // $ANTLR start "rule__Procedure__Group_5__0__Impl"
    // InternalOberon.g:2594:1: rule__Procedure__Group_5__0__Impl : ( ':' ) ;
    public final void rule__Procedure__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2598:1: ( ( ':' ) )
            // InternalOberon.g:2599:1: ( ':' )
            {
            // InternalOberon.g:2599:1: ( ':' )
            // InternalOberon.g:2600:2: ':'
            {
             before(grammarAccess.getProcedureAccess().getColonKeyword_5_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getProcedureAccess().getColonKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group_5__0__Impl"


    // $ANTLR start "rule__Procedure__Group_5__1"
    // InternalOberon.g:2609:1: rule__Procedure__Group_5__1 : rule__Procedure__Group_5__1__Impl ;
    public final void rule__Procedure__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2613:1: ( rule__Procedure__Group_5__1__Impl )
            // InternalOberon.g:2614:2: rule__Procedure__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Procedure__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group_5__1"


    // $ANTLR start "rule__Procedure__Group_5__1__Impl"
    // InternalOberon.g:2620:1: rule__Procedure__Group_5__1__Impl : ( ( rule__Procedure__ProcedureTypeAssignment_5_1 ) ) ;
    public final void rule__Procedure__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2624:1: ( ( ( rule__Procedure__ProcedureTypeAssignment_5_1 ) ) )
            // InternalOberon.g:2625:1: ( ( rule__Procedure__ProcedureTypeAssignment_5_1 ) )
            {
            // InternalOberon.g:2625:1: ( ( rule__Procedure__ProcedureTypeAssignment_5_1 ) )
            // InternalOberon.g:2626:2: ( rule__Procedure__ProcedureTypeAssignment_5_1 )
            {
             before(grammarAccess.getProcedureAccess().getProcedureTypeAssignment_5_1()); 
            // InternalOberon.g:2627:2: ( rule__Procedure__ProcedureTypeAssignment_5_1 )
            // InternalOberon.g:2627:3: rule__Procedure__ProcedureTypeAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Procedure__ProcedureTypeAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getProcedureAccess().getProcedureTypeAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group_5__1__Impl"


    // $ANTLR start "rule__Formals__Group__0"
    // InternalOberon.g:2636:1: rule__Formals__Group__0 : rule__Formals__Group__0__Impl rule__Formals__Group__1 ;
    public final void rule__Formals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2640:1: ( rule__Formals__Group__0__Impl rule__Formals__Group__1 )
            // InternalOberon.g:2641:2: rule__Formals__Group__0__Impl rule__Formals__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Formals__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formals__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formals__Group__0"


    // $ANTLR start "rule__Formals__Group__0__Impl"
    // InternalOberon.g:2648:1: rule__Formals__Group__0__Impl : ( ( rule__Formals__ArgAssignment_0 ) ) ;
    public final void rule__Formals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2652:1: ( ( ( rule__Formals__ArgAssignment_0 ) ) )
            // InternalOberon.g:2653:1: ( ( rule__Formals__ArgAssignment_0 ) )
            {
            // InternalOberon.g:2653:1: ( ( rule__Formals__ArgAssignment_0 ) )
            // InternalOberon.g:2654:2: ( rule__Formals__ArgAssignment_0 )
            {
             before(grammarAccess.getFormalsAccess().getArgAssignment_0()); 
            // InternalOberon.g:2655:2: ( rule__Formals__ArgAssignment_0 )
            // InternalOberon.g:2655:3: rule__Formals__ArgAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Formals__ArgAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFormalsAccess().getArgAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formals__Group__0__Impl"


    // $ANTLR start "rule__Formals__Group__1"
    // InternalOberon.g:2663:1: rule__Formals__Group__1 : rule__Formals__Group__1__Impl ;
    public final void rule__Formals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2667:1: ( rule__Formals__Group__1__Impl )
            // InternalOberon.g:2668:2: rule__Formals__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Formals__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formals__Group__1"


    // $ANTLR start "rule__Formals__Group__1__Impl"
    // InternalOberon.g:2674:1: rule__Formals__Group__1__Impl : ( ( rule__Formals__Group_1__0 )* ) ;
    public final void rule__Formals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2678:1: ( ( ( rule__Formals__Group_1__0 )* ) )
            // InternalOberon.g:2679:1: ( ( rule__Formals__Group_1__0 )* )
            {
            // InternalOberon.g:2679:1: ( ( rule__Formals__Group_1__0 )* )
            // InternalOberon.g:2680:2: ( rule__Formals__Group_1__0 )*
            {
             before(grammarAccess.getFormalsAccess().getGroup_1()); 
            // InternalOberon.g:2681:2: ( rule__Formals__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==37) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalOberon.g:2681:3: rule__Formals__Group_1__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Formals__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getFormalsAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formals__Group__1__Impl"


    // $ANTLR start "rule__Formals__Group_1__0"
    // InternalOberon.g:2690:1: rule__Formals__Group_1__0 : rule__Formals__Group_1__0__Impl rule__Formals__Group_1__1 ;
    public final void rule__Formals__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2694:1: ( rule__Formals__Group_1__0__Impl rule__Formals__Group_1__1 )
            // InternalOberon.g:2695:2: rule__Formals__Group_1__0__Impl rule__Formals__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Formals__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formals__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formals__Group_1__0"


    // $ANTLR start "rule__Formals__Group_1__0__Impl"
    // InternalOberon.g:2702:1: rule__Formals__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Formals__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2706:1: ( ( ',' ) )
            // InternalOberon.g:2707:1: ( ',' )
            {
            // InternalOberon.g:2707:1: ( ',' )
            // InternalOberon.g:2708:2: ','
            {
             before(grammarAccess.getFormalsAccess().getCommaKeyword_1_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getFormalsAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formals__Group_1__0__Impl"


    // $ANTLR start "rule__Formals__Group_1__1"
    // InternalOberon.g:2717:1: rule__Formals__Group_1__1 : rule__Formals__Group_1__1__Impl ;
    public final void rule__Formals__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2721:1: ( rule__Formals__Group_1__1__Impl )
            // InternalOberon.g:2722:2: rule__Formals__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Formals__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formals__Group_1__1"


    // $ANTLR start "rule__Formals__Group_1__1__Impl"
    // InternalOberon.g:2728:1: rule__Formals__Group_1__1__Impl : ( ( rule__Formals__ArgsAssignment_1_1 ) ) ;
    public final void rule__Formals__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2732:1: ( ( ( rule__Formals__ArgsAssignment_1_1 ) ) )
            // InternalOberon.g:2733:1: ( ( rule__Formals__ArgsAssignment_1_1 ) )
            {
            // InternalOberon.g:2733:1: ( ( rule__Formals__ArgsAssignment_1_1 ) )
            // InternalOberon.g:2734:2: ( rule__Formals__ArgsAssignment_1_1 )
            {
             before(grammarAccess.getFormalsAccess().getArgsAssignment_1_1()); 
            // InternalOberon.g:2735:2: ( rule__Formals__ArgsAssignment_1_1 )
            // InternalOberon.g:2735:3: rule__Formals__ArgsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Formals__ArgsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFormalsAccess().getArgsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formals__Group_1__1__Impl"


    // $ANTLR start "rule__FormalArg__Group__0"
    // InternalOberon.g:2744:1: rule__FormalArg__Group__0 : rule__FormalArg__Group__0__Impl rule__FormalArg__Group__1 ;
    public final void rule__FormalArg__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2748:1: ( rule__FormalArg__Group__0__Impl rule__FormalArg__Group__1 )
            // InternalOberon.g:2749:2: rule__FormalArg__Group__0__Impl rule__FormalArg__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__FormalArg__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormalArg__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalArg__Group__0"


    // $ANTLR start "rule__FormalArg__Group__0__Impl"
    // InternalOberon.g:2756:1: rule__FormalArg__Group__0__Impl : ( ( rule__FormalArg__Group_0__0 ) ) ;
    public final void rule__FormalArg__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2760:1: ( ( ( rule__FormalArg__Group_0__0 ) ) )
            // InternalOberon.g:2761:1: ( ( rule__FormalArg__Group_0__0 ) )
            {
            // InternalOberon.g:2761:1: ( ( rule__FormalArg__Group_0__0 ) )
            // InternalOberon.g:2762:2: ( rule__FormalArg__Group_0__0 )
            {
             before(grammarAccess.getFormalArgAccess().getGroup_0()); 
            // InternalOberon.g:2763:2: ( rule__FormalArg__Group_0__0 )
            // InternalOberon.g:2763:3: rule__FormalArg__Group_0__0
            {
            pushFollow(FOLLOW_2);
            rule__FormalArg__Group_0__0();

            state._fsp--;


            }

             after(grammarAccess.getFormalArgAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalArg__Group__0__Impl"


    // $ANTLR start "rule__FormalArg__Group__1"
    // InternalOberon.g:2771:1: rule__FormalArg__Group__1 : rule__FormalArg__Group__1__Impl rule__FormalArg__Group__2 ;
    public final void rule__FormalArg__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2775:1: ( rule__FormalArg__Group__1__Impl rule__FormalArg__Group__2 )
            // InternalOberon.g:2776:2: rule__FormalArg__Group__1__Impl rule__FormalArg__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__FormalArg__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormalArg__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalArg__Group__1"


    // $ANTLR start "rule__FormalArg__Group__1__Impl"
    // InternalOberon.g:2783:1: rule__FormalArg__Group__1__Impl : ( ':' ) ;
    public final void rule__FormalArg__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2787:1: ( ( ':' ) )
            // InternalOberon.g:2788:1: ( ':' )
            {
            // InternalOberon.g:2788:1: ( ':' )
            // InternalOberon.g:2789:2: ':'
            {
             before(grammarAccess.getFormalArgAccess().getColonKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getFormalArgAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalArg__Group__1__Impl"


    // $ANTLR start "rule__FormalArg__Group__2"
    // InternalOberon.g:2798:1: rule__FormalArg__Group__2 : rule__FormalArg__Group__2__Impl ;
    public final void rule__FormalArg__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2802:1: ( rule__FormalArg__Group__2__Impl )
            // InternalOberon.g:2803:2: rule__FormalArg__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FormalArg__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalArg__Group__2"


    // $ANTLR start "rule__FormalArg__Group__2__Impl"
    // InternalOberon.g:2809:1: rule__FormalArg__Group__2__Impl : ( ( rule__FormalArg__ArgTypeAssignment_2 ) ) ;
    public final void rule__FormalArg__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2813:1: ( ( ( rule__FormalArg__ArgTypeAssignment_2 ) ) )
            // InternalOberon.g:2814:1: ( ( rule__FormalArg__ArgTypeAssignment_2 ) )
            {
            // InternalOberon.g:2814:1: ( ( rule__FormalArg__ArgTypeAssignment_2 ) )
            // InternalOberon.g:2815:2: ( rule__FormalArg__ArgTypeAssignment_2 )
            {
             before(grammarAccess.getFormalArgAccess().getArgTypeAssignment_2()); 
            // InternalOberon.g:2816:2: ( rule__FormalArg__ArgTypeAssignment_2 )
            // InternalOberon.g:2816:3: rule__FormalArg__ArgTypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FormalArg__ArgTypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFormalArgAccess().getArgTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalArg__Group__2__Impl"


    // $ANTLR start "rule__FormalArg__Group_0__0"
    // InternalOberon.g:2825:1: rule__FormalArg__Group_0__0 : rule__FormalArg__Group_0__0__Impl rule__FormalArg__Group_0__1 ;
    public final void rule__FormalArg__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2829:1: ( rule__FormalArg__Group_0__0__Impl rule__FormalArg__Group_0__1 )
            // InternalOberon.g:2830:2: rule__FormalArg__Group_0__0__Impl rule__FormalArg__Group_0__1
            {
            pushFollow(FOLLOW_22);
            rule__FormalArg__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormalArg__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalArg__Group_0__0"


    // $ANTLR start "rule__FormalArg__Group_0__0__Impl"
    // InternalOberon.g:2837:1: rule__FormalArg__Group_0__0__Impl : ( ( rule__FormalArg__ArgsAssignment_0_0 ) ) ;
    public final void rule__FormalArg__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2841:1: ( ( ( rule__FormalArg__ArgsAssignment_0_0 ) ) )
            // InternalOberon.g:2842:1: ( ( rule__FormalArg__ArgsAssignment_0_0 ) )
            {
            // InternalOberon.g:2842:1: ( ( rule__FormalArg__ArgsAssignment_0_0 ) )
            // InternalOberon.g:2843:2: ( rule__FormalArg__ArgsAssignment_0_0 )
            {
             before(grammarAccess.getFormalArgAccess().getArgsAssignment_0_0()); 
            // InternalOberon.g:2844:2: ( rule__FormalArg__ArgsAssignment_0_0 )
            // InternalOberon.g:2844:3: rule__FormalArg__ArgsAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__FormalArg__ArgsAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getFormalArgAccess().getArgsAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalArg__Group_0__0__Impl"


    // $ANTLR start "rule__FormalArg__Group_0__1"
    // InternalOberon.g:2852:1: rule__FormalArg__Group_0__1 : rule__FormalArg__Group_0__1__Impl ;
    public final void rule__FormalArg__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2856:1: ( rule__FormalArg__Group_0__1__Impl )
            // InternalOberon.g:2857:2: rule__FormalArg__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FormalArg__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalArg__Group_0__1"


    // $ANTLR start "rule__FormalArg__Group_0__1__Impl"
    // InternalOberon.g:2863:1: rule__FormalArg__Group_0__1__Impl : ( ( rule__FormalArg__Group_0_1__0 )* ) ;
    public final void rule__FormalArg__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2867:1: ( ( ( rule__FormalArg__Group_0_1__0 )* ) )
            // InternalOberon.g:2868:1: ( ( rule__FormalArg__Group_0_1__0 )* )
            {
            // InternalOberon.g:2868:1: ( ( rule__FormalArg__Group_0_1__0 )* )
            // InternalOberon.g:2869:2: ( rule__FormalArg__Group_0_1__0 )*
            {
             before(grammarAccess.getFormalArgAccess().getGroup_0_1()); 
            // InternalOberon.g:2870:2: ( rule__FormalArg__Group_0_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==37) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalOberon.g:2870:3: rule__FormalArg__Group_0_1__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__FormalArg__Group_0_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getFormalArgAccess().getGroup_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalArg__Group_0__1__Impl"


    // $ANTLR start "rule__FormalArg__Group_0_1__0"
    // InternalOberon.g:2879:1: rule__FormalArg__Group_0_1__0 : rule__FormalArg__Group_0_1__0__Impl rule__FormalArg__Group_0_1__1 ;
    public final void rule__FormalArg__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2883:1: ( rule__FormalArg__Group_0_1__0__Impl rule__FormalArg__Group_0_1__1 )
            // InternalOberon.g:2884:2: rule__FormalArg__Group_0_1__0__Impl rule__FormalArg__Group_0_1__1
            {
            pushFollow(FOLLOW_3);
            rule__FormalArg__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormalArg__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalArg__Group_0_1__0"


    // $ANTLR start "rule__FormalArg__Group_0_1__0__Impl"
    // InternalOberon.g:2891:1: rule__FormalArg__Group_0_1__0__Impl : ( ',' ) ;
    public final void rule__FormalArg__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2895:1: ( ( ',' ) )
            // InternalOberon.g:2896:1: ( ',' )
            {
            // InternalOberon.g:2896:1: ( ',' )
            // InternalOberon.g:2897:2: ','
            {
             before(grammarAccess.getFormalArgAccess().getCommaKeyword_0_1_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getFormalArgAccess().getCommaKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalArg__Group_0_1__0__Impl"


    // $ANTLR start "rule__FormalArg__Group_0_1__1"
    // InternalOberon.g:2906:1: rule__FormalArg__Group_0_1__1 : rule__FormalArg__Group_0_1__1__Impl ;
    public final void rule__FormalArg__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2910:1: ( rule__FormalArg__Group_0_1__1__Impl )
            // InternalOberon.g:2911:2: rule__FormalArg__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FormalArg__Group_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalArg__Group_0_1__1"


    // $ANTLR start "rule__FormalArg__Group_0_1__1__Impl"
    // InternalOberon.g:2917:1: rule__FormalArg__Group_0_1__1__Impl : ( ( rule__FormalArg__ArgsAssignment_0_1_1 ) ) ;
    public final void rule__FormalArg__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2921:1: ( ( ( rule__FormalArg__ArgsAssignment_0_1_1 ) ) )
            // InternalOberon.g:2922:1: ( ( rule__FormalArg__ArgsAssignment_0_1_1 ) )
            {
            // InternalOberon.g:2922:1: ( ( rule__FormalArg__ArgsAssignment_0_1_1 ) )
            // InternalOberon.g:2923:2: ( rule__FormalArg__ArgsAssignment_0_1_1 )
            {
             before(grammarAccess.getFormalArgAccess().getArgsAssignment_0_1_1()); 
            // InternalOberon.g:2924:2: ( rule__FormalArg__ArgsAssignment_0_1_1 )
            // InternalOberon.g:2924:3: rule__FormalArg__ArgsAssignment_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__FormalArg__ArgsAssignment_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFormalArgAccess().getArgsAssignment_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalArg__Group_0_1__1__Impl"


    // $ANTLR start "rule__Arguments__Group__0"
    // InternalOberon.g:2933:1: rule__Arguments__Group__0 : rule__Arguments__Group__0__Impl rule__Arguments__Group__1 ;
    public final void rule__Arguments__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2937:1: ( rule__Arguments__Group__0__Impl rule__Arguments__Group__1 )
            // InternalOberon.g:2938:2: rule__Arguments__Group__0__Impl rule__Arguments__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Arguments__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arguments__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arguments__Group__0"


    // $ANTLR start "rule__Arguments__Group__0__Impl"
    // InternalOberon.g:2945:1: rule__Arguments__Group__0__Impl : ( ( rule__Arguments__ExpAssignment_0 ) ) ;
    public final void rule__Arguments__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2949:1: ( ( ( rule__Arguments__ExpAssignment_0 ) ) )
            // InternalOberon.g:2950:1: ( ( rule__Arguments__ExpAssignment_0 ) )
            {
            // InternalOberon.g:2950:1: ( ( rule__Arguments__ExpAssignment_0 ) )
            // InternalOberon.g:2951:2: ( rule__Arguments__ExpAssignment_0 )
            {
             before(grammarAccess.getArgumentsAccess().getExpAssignment_0()); 
            // InternalOberon.g:2952:2: ( rule__Arguments__ExpAssignment_0 )
            // InternalOberon.g:2952:3: rule__Arguments__ExpAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Arguments__ExpAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getArgumentsAccess().getExpAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arguments__Group__0__Impl"


    // $ANTLR start "rule__Arguments__Group__1"
    // InternalOberon.g:2960:1: rule__Arguments__Group__1 : rule__Arguments__Group__1__Impl ;
    public final void rule__Arguments__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2964:1: ( rule__Arguments__Group__1__Impl )
            // InternalOberon.g:2965:2: rule__Arguments__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Arguments__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arguments__Group__1"


    // $ANTLR start "rule__Arguments__Group__1__Impl"
    // InternalOberon.g:2971:1: rule__Arguments__Group__1__Impl : ( ( rule__Arguments__Group_1__0 )* ) ;
    public final void rule__Arguments__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2975:1: ( ( ( rule__Arguments__Group_1__0 )* ) )
            // InternalOberon.g:2976:1: ( ( rule__Arguments__Group_1__0 )* )
            {
            // InternalOberon.g:2976:1: ( ( rule__Arguments__Group_1__0 )* )
            // InternalOberon.g:2977:2: ( rule__Arguments__Group_1__0 )*
            {
             before(grammarAccess.getArgumentsAccess().getGroup_1()); 
            // InternalOberon.g:2978:2: ( rule__Arguments__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==37) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalOberon.g:2978:3: rule__Arguments__Group_1__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Arguments__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getArgumentsAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arguments__Group__1__Impl"


    // $ANTLR start "rule__Arguments__Group_1__0"
    // InternalOberon.g:2987:1: rule__Arguments__Group_1__0 : rule__Arguments__Group_1__0__Impl rule__Arguments__Group_1__1 ;
    public final void rule__Arguments__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:2991:1: ( rule__Arguments__Group_1__0__Impl rule__Arguments__Group_1__1 )
            // InternalOberon.g:2992:2: rule__Arguments__Group_1__0__Impl rule__Arguments__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__Arguments__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arguments__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arguments__Group_1__0"


    // $ANTLR start "rule__Arguments__Group_1__0__Impl"
    // InternalOberon.g:2999:1: rule__Arguments__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Arguments__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3003:1: ( ( ',' ) )
            // InternalOberon.g:3004:1: ( ',' )
            {
            // InternalOberon.g:3004:1: ( ',' )
            // InternalOberon.g:3005:2: ','
            {
             before(grammarAccess.getArgumentsAccess().getCommaKeyword_1_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getArgumentsAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arguments__Group_1__0__Impl"


    // $ANTLR start "rule__Arguments__Group_1__1"
    // InternalOberon.g:3014:1: rule__Arguments__Group_1__1 : rule__Arguments__Group_1__1__Impl ;
    public final void rule__Arguments__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3018:1: ( rule__Arguments__Group_1__1__Impl )
            // InternalOberon.g:3019:2: rule__Arguments__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Arguments__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arguments__Group_1__1"


    // $ANTLR start "rule__Arguments__Group_1__1__Impl"
    // InternalOberon.g:3025:1: rule__Arguments__Group_1__1__Impl : ( ( rule__Arguments__ExpsAssignment_1_1 ) ) ;
    public final void rule__Arguments__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3029:1: ( ( ( rule__Arguments__ExpsAssignment_1_1 ) ) )
            // InternalOberon.g:3030:1: ( ( rule__Arguments__ExpsAssignment_1_1 ) )
            {
            // InternalOberon.g:3030:1: ( ( rule__Arguments__ExpsAssignment_1_1 ) )
            // InternalOberon.g:3031:2: ( rule__Arguments__ExpsAssignment_1_1 )
            {
             before(grammarAccess.getArgumentsAccess().getExpsAssignment_1_1()); 
            // InternalOberon.g:3032:2: ( rule__Arguments__ExpsAssignment_1_1 )
            // InternalOberon.g:3032:3: rule__Arguments__ExpsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Arguments__ExpsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getArgumentsAccess().getExpsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arguments__Group_1__1__Impl"


    // $ANTLR start "rule__Expression__Group__0"
    // InternalOberon.g:3041:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3045:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalOberon.g:3046:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__Expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0"


    // $ANTLR start "rule__Expression__Group__0__Impl"
    // InternalOberon.g:3053:1: rule__Expression__Group__0__Impl : ( ( rule__Expression__LeftAssignment_0 ) ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3057:1: ( ( ( rule__Expression__LeftAssignment_0 ) ) )
            // InternalOberon.g:3058:1: ( ( rule__Expression__LeftAssignment_0 ) )
            {
            // InternalOberon.g:3058:1: ( ( rule__Expression__LeftAssignment_0 ) )
            // InternalOberon.g:3059:2: ( rule__Expression__LeftAssignment_0 )
            {
             before(grammarAccess.getExpressionAccess().getLeftAssignment_0()); 
            // InternalOberon.g:3060:2: ( rule__Expression__LeftAssignment_0 )
            // InternalOberon.g:3060:3: rule__Expression__LeftAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getLeftAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0__Impl"


    // $ANTLR start "rule__Expression__Group__1"
    // InternalOberon.g:3068:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3072:1: ( rule__Expression__Group__1__Impl )
            // InternalOberon.g:3073:2: rule__Expression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1"


    // $ANTLR start "rule__Expression__Group__1__Impl"
    // InternalOberon.g:3079:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )* ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3083:1: ( ( ( rule__Expression__Group_1__0 )* ) )
            // InternalOberon.g:3084:1: ( ( rule__Expression__Group_1__0 )* )
            {
            // InternalOberon.g:3084:1: ( ( rule__Expression__Group_1__0 )* )
            // InternalOberon.g:3085:2: ( rule__Expression__Group_1__0 )*
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // InternalOberon.g:3086:2: ( rule__Expression__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                alt27 = dfa27.predict(input);
                switch (alt27) {
            	case 1 :
            	    // InternalOberon.g:3086:3: rule__Expression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__Expression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1__Impl"


    // $ANTLR start "rule__Expression__Group_1__0"
    // InternalOberon.g:3095:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3099:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalOberon.g:3100:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__Expression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0"


    // $ANTLR start "rule__Expression__Group_1__0__Impl"
    // InternalOberon.g:3107:1: rule__Expression__Group_1__0__Impl : ( ( rule__Expression__OprAssignment_1_0 ) ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3111:1: ( ( ( rule__Expression__OprAssignment_1_0 ) ) )
            // InternalOberon.g:3112:1: ( ( rule__Expression__OprAssignment_1_0 ) )
            {
            // InternalOberon.g:3112:1: ( ( rule__Expression__OprAssignment_1_0 ) )
            // InternalOberon.g:3113:2: ( rule__Expression__OprAssignment_1_0 )
            {
             before(grammarAccess.getExpressionAccess().getOprAssignment_1_0()); 
            // InternalOberon.g:3114:2: ( rule__Expression__OprAssignment_1_0 )
            // InternalOberon.g:3114:3: rule__Expression__OprAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__OprAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getOprAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0__Impl"


    // $ANTLR start "rule__Expression__Group_1__1"
    // InternalOberon.g:3122:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3126:1: ( rule__Expression__Group_1__1__Impl )
            // InternalOberon.g:3127:2: rule__Expression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__1"


    // $ANTLR start "rule__Expression__Group_1__1__Impl"
    // InternalOberon.g:3133:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__RightAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3137:1: ( ( ( rule__Expression__RightAssignment_1_1 ) ) )
            // InternalOberon.g:3138:1: ( ( rule__Expression__RightAssignment_1_1 ) )
            {
            // InternalOberon.g:3138:1: ( ( rule__Expression__RightAssignment_1_1 ) )
            // InternalOberon.g:3139:2: ( rule__Expression__RightAssignment_1_1 )
            {
             before(grammarAccess.getExpressionAccess().getRightAssignment_1_1()); 
            // InternalOberon.g:3140:2: ( rule__Expression__RightAssignment_1_1 )
            // InternalOberon.g:3140:3: rule__Expression__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__1__Impl"


    // $ANTLR start "rule__TExpression__Group_0__0"
    // InternalOberon.g:3149:1: rule__TExpression__Group_0__0 : rule__TExpression__Group_0__0__Impl rule__TExpression__Group_0__1 ;
    public final void rule__TExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3153:1: ( rule__TExpression__Group_0__0__Impl rule__TExpression__Group_0__1 )
            // InternalOberon.g:3154:2: rule__TExpression__Group_0__0__Impl rule__TExpression__Group_0__1
            {
            pushFollow(FOLLOW_20);
            rule__TExpression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TExpression__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TExpression__Group_0__0"


    // $ANTLR start "rule__TExpression__Group_0__0__Impl"
    // InternalOberon.g:3161:1: rule__TExpression__Group_0__0__Impl : ( '(' ) ;
    public final void rule__TExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3165:1: ( ( '(' ) )
            // InternalOberon.g:3166:1: ( '(' )
            {
            // InternalOberon.g:3166:1: ( '(' )
            // InternalOberon.g:3167:2: '('
            {
             before(grammarAccess.getTExpressionAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getTExpressionAccess().getLeftParenthesisKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TExpression__Group_0__0__Impl"


    // $ANTLR start "rule__TExpression__Group_0__1"
    // InternalOberon.g:3176:1: rule__TExpression__Group_0__1 : rule__TExpression__Group_0__1__Impl rule__TExpression__Group_0__2 ;
    public final void rule__TExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3180:1: ( rule__TExpression__Group_0__1__Impl rule__TExpression__Group_0__2 )
            // InternalOberon.g:3181:2: rule__TExpression__Group_0__1__Impl rule__TExpression__Group_0__2
            {
            pushFollow(FOLLOW_29);
            rule__TExpression__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TExpression__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TExpression__Group_0__1"


    // $ANTLR start "rule__TExpression__Group_0__1__Impl"
    // InternalOberon.g:3188:1: rule__TExpression__Group_0__1__Impl : ( ( rule__TExpression__ExpAssignment_0_1 ) ) ;
    public final void rule__TExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3192:1: ( ( ( rule__TExpression__ExpAssignment_0_1 ) ) )
            // InternalOberon.g:3193:1: ( ( rule__TExpression__ExpAssignment_0_1 ) )
            {
            // InternalOberon.g:3193:1: ( ( rule__TExpression__ExpAssignment_0_1 ) )
            // InternalOberon.g:3194:2: ( rule__TExpression__ExpAssignment_0_1 )
            {
             before(grammarAccess.getTExpressionAccess().getExpAssignment_0_1()); 
            // InternalOberon.g:3195:2: ( rule__TExpression__ExpAssignment_0_1 )
            // InternalOberon.g:3195:3: rule__TExpression__ExpAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__TExpression__ExpAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getTExpressionAccess().getExpAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TExpression__Group_0__1__Impl"


    // $ANTLR start "rule__TExpression__Group_0__2"
    // InternalOberon.g:3203:1: rule__TExpression__Group_0__2 : rule__TExpression__Group_0__2__Impl ;
    public final void rule__TExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3207:1: ( rule__TExpression__Group_0__2__Impl )
            // InternalOberon.g:3208:2: rule__TExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TExpression__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TExpression__Group_0__2"


    // $ANTLR start "rule__TExpression__Group_0__2__Impl"
    // InternalOberon.g:3214:1: rule__TExpression__Group_0__2__Impl : ( ')' ) ;
    public final void rule__TExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3218:1: ( ( ')' ) )
            // InternalOberon.g:3219:1: ( ')' )
            {
            // InternalOberon.g:3219:1: ( ')' )
            // InternalOberon.g:3220:2: ')'
            {
             before(grammarAccess.getTExpressionAccess().getRightParenthesisKeyword_0_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getTExpressionAccess().getRightParenthesisKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TExpression__Group_0__2__Impl"


    // $ANTLR start "rule__TExpression__Group_3__0"
    // InternalOberon.g:3230:1: rule__TExpression__Group_3__0 : rule__TExpression__Group_3__0__Impl rule__TExpression__Group_3__1 ;
    public final void rule__TExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3234:1: ( rule__TExpression__Group_3__0__Impl rule__TExpression__Group_3__1 )
            // InternalOberon.g:3235:2: rule__TExpression__Group_3__0__Impl rule__TExpression__Group_3__1
            {
            pushFollow(FOLLOW_30);
            rule__TExpression__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TExpression__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TExpression__Group_3__0"


    // $ANTLR start "rule__TExpression__Group_3__0__Impl"
    // InternalOberon.g:3242:1: rule__TExpression__Group_3__0__Impl : ( ( rule__TExpression__NameAssignment_3_0 ) ) ;
    public final void rule__TExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3246:1: ( ( ( rule__TExpression__NameAssignment_3_0 ) ) )
            // InternalOberon.g:3247:1: ( ( rule__TExpression__NameAssignment_3_0 ) )
            {
            // InternalOberon.g:3247:1: ( ( rule__TExpression__NameAssignment_3_0 ) )
            // InternalOberon.g:3248:2: ( rule__TExpression__NameAssignment_3_0 )
            {
             before(grammarAccess.getTExpressionAccess().getNameAssignment_3_0()); 
            // InternalOberon.g:3249:2: ( rule__TExpression__NameAssignment_3_0 )
            // InternalOberon.g:3249:3: rule__TExpression__NameAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__TExpression__NameAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getTExpressionAccess().getNameAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TExpression__Group_3__0__Impl"


    // $ANTLR start "rule__TExpression__Group_3__1"
    // InternalOberon.g:3257:1: rule__TExpression__Group_3__1 : rule__TExpression__Group_3__1__Impl rule__TExpression__Group_3__2 ;
    public final void rule__TExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3261:1: ( rule__TExpression__Group_3__1__Impl rule__TExpression__Group_3__2 )
            // InternalOberon.g:3262:2: rule__TExpression__Group_3__1__Impl rule__TExpression__Group_3__2
            {
            pushFollow(FOLLOW_30);
            rule__TExpression__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TExpression__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TExpression__Group_3__1"


    // $ANTLR start "rule__TExpression__Group_3__1__Impl"
    // InternalOberon.g:3269:1: rule__TExpression__Group_3__1__Impl : ( ( rule__TExpression__Group_3_1__0 )? ) ;
    public final void rule__TExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3273:1: ( ( ( rule__TExpression__Group_3_1__0 )? ) )
            // InternalOberon.g:3274:1: ( ( rule__TExpression__Group_3_1__0 )? )
            {
            // InternalOberon.g:3274:1: ( ( rule__TExpression__Group_3_1__0 )? )
            // InternalOberon.g:3275:2: ( rule__TExpression__Group_3_1__0 )?
            {
             before(grammarAccess.getTExpressionAccess().getGroup_3_1()); 
            // InternalOberon.g:3276:2: ( rule__TExpression__Group_3_1__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==39) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalOberon.g:3276:3: rule__TExpression__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TExpression__Group_3_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTExpressionAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TExpression__Group_3__1__Impl"


    // $ANTLR start "rule__TExpression__Group_3__2"
    // InternalOberon.g:3284:1: rule__TExpression__Group_3__2 : rule__TExpression__Group_3__2__Impl rule__TExpression__Group_3__3 ;
    public final void rule__TExpression__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3288:1: ( rule__TExpression__Group_3__2__Impl rule__TExpression__Group_3__3 )
            // InternalOberon.g:3289:2: rule__TExpression__Group_3__2__Impl rule__TExpression__Group_3__3
            {
            pushFollow(FOLLOW_30);
            rule__TExpression__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TExpression__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TExpression__Group_3__2"


    // $ANTLR start "rule__TExpression__Group_3__2__Impl"
    // InternalOberon.g:3296:1: rule__TExpression__Group_3__2__Impl : ( ( rule__TExpression__Group_3_2__0 )* ) ;
    public final void rule__TExpression__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3300:1: ( ( ( rule__TExpression__Group_3_2__0 )* ) )
            // InternalOberon.g:3301:1: ( ( rule__TExpression__Group_3_2__0 )* )
            {
            // InternalOberon.g:3301:1: ( ( rule__TExpression__Group_3_2__0 )* )
            // InternalOberon.g:3302:2: ( rule__TExpression__Group_3_2__0 )*
            {
             before(grammarAccess.getTExpressionAccess().getGroup_3_2()); 
            // InternalOberon.g:3303:2: ( rule__TExpression__Group_3_2__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==28) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalOberon.g:3303:3: rule__TExpression__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__TExpression__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getTExpressionAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TExpression__Group_3__2__Impl"


    // $ANTLR start "rule__TExpression__Group_3__3"
    // InternalOberon.g:3311:1: rule__TExpression__Group_3__3 : rule__TExpression__Group_3__3__Impl ;
    public final void rule__TExpression__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3315:1: ( rule__TExpression__Group_3__3__Impl )
            // InternalOberon.g:3316:2: rule__TExpression__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TExpression__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TExpression__Group_3__3"


    // $ANTLR start "rule__TExpression__Group_3__3__Impl"
    // InternalOberon.g:3322:1: rule__TExpression__Group_3__3__Impl : ( ( rule__TExpression__Group_3_3__0 )* ) ;
    public final void rule__TExpression__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3326:1: ( ( ( rule__TExpression__Group_3_3__0 )* ) )
            // InternalOberon.g:3327:1: ( ( rule__TExpression__Group_3_3__0 )* )
            {
            // InternalOberon.g:3327:1: ( ( rule__TExpression__Group_3_3__0 )* )
            // InternalOberon.g:3328:2: ( rule__TExpression__Group_3_3__0 )*
            {
             before(grammarAccess.getTExpressionAccess().getGroup_3_3()); 
            // InternalOberon.g:3329:2: ( rule__TExpression__Group_3_3__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==41) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalOberon.g:3329:3: rule__TExpression__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__TExpression__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getTExpressionAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TExpression__Group_3__3__Impl"


    // $ANTLR start "rule__TExpression__Group_3_1__0"
    // InternalOberon.g:3338:1: rule__TExpression__Group_3_1__0 : rule__TExpression__Group_3_1__0__Impl rule__TExpression__Group_3_1__1 ;
    public final void rule__TExpression__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3342:1: ( rule__TExpression__Group_3_1__0__Impl rule__TExpression__Group_3_1__1 )
            // InternalOberon.g:3343:2: rule__TExpression__Group_3_1__0__Impl rule__TExpression__Group_3_1__1
            {
            pushFollow(FOLLOW_33);
            rule__TExpression__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TExpression__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TExpression__Group_3_1__0"


    // $ANTLR start "rule__TExpression__Group_3_1__0__Impl"
    // InternalOberon.g:3350:1: rule__TExpression__Group_3_1__0__Impl : ( '(' ) ;
    public final void rule__TExpression__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3354:1: ( ( '(' ) )
            // InternalOberon.g:3355:1: ( '(' )
            {
            // InternalOberon.g:3355:1: ( '(' )
            // InternalOberon.g:3356:2: '('
            {
             before(grammarAccess.getTExpressionAccess().getLeftParenthesisKeyword_3_1_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getTExpressionAccess().getLeftParenthesisKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TExpression__Group_3_1__0__Impl"


    // $ANTLR start "rule__TExpression__Group_3_1__1"
    // InternalOberon.g:3365:1: rule__TExpression__Group_3_1__1 : rule__TExpression__Group_3_1__1__Impl rule__TExpression__Group_3_1__2 ;
    public final void rule__TExpression__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3369:1: ( rule__TExpression__Group_3_1__1__Impl rule__TExpression__Group_3_1__2 )
            // InternalOberon.g:3370:2: rule__TExpression__Group_3_1__1__Impl rule__TExpression__Group_3_1__2
            {
            pushFollow(FOLLOW_33);
            rule__TExpression__Group_3_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TExpression__Group_3_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TExpression__Group_3_1__1"


    // $ANTLR start "rule__TExpression__Group_3_1__1__Impl"
    // InternalOberon.g:3377:1: rule__TExpression__Group_3_1__1__Impl : ( ( rule__TExpression__ArgsAssignment_3_1_1 )? ) ;
    public final void rule__TExpression__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3381:1: ( ( ( rule__TExpression__ArgsAssignment_3_1_1 )? ) )
            // InternalOberon.g:3382:1: ( ( rule__TExpression__ArgsAssignment_3_1_1 )? )
            {
            // InternalOberon.g:3382:1: ( ( rule__TExpression__ArgsAssignment_3_1_1 )? )
            // InternalOberon.g:3383:2: ( rule__TExpression__ArgsAssignment_3_1_1 )?
            {
             before(grammarAccess.getTExpressionAccess().getArgsAssignment_3_1_1()); 
            // InternalOberon.g:3384:2: ( rule__TExpression__ArgsAssignment_3_1_1 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=RULE_INT && LA31_0<=RULE_ID)||(LA31_0>=11 && LA31_0<=12)||LA31_0==39) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalOberon.g:3384:3: rule__TExpression__ArgsAssignment_3_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__TExpression__ArgsAssignment_3_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTExpressionAccess().getArgsAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TExpression__Group_3_1__1__Impl"


    // $ANTLR start "rule__TExpression__Group_3_1__2"
    // InternalOberon.g:3392:1: rule__TExpression__Group_3_1__2 : rule__TExpression__Group_3_1__2__Impl ;
    public final void rule__TExpression__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3396:1: ( rule__TExpression__Group_3_1__2__Impl )
            // InternalOberon.g:3397:2: rule__TExpression__Group_3_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TExpression__Group_3_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TExpression__Group_3_1__2"


    // $ANTLR start "rule__TExpression__Group_3_1__2__Impl"
    // InternalOberon.g:3403:1: rule__TExpression__Group_3_1__2__Impl : ( ')' ) ;
    public final void rule__TExpression__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3407:1: ( ( ')' ) )
            // InternalOberon.g:3408:1: ( ')' )
            {
            // InternalOberon.g:3408:1: ( ')' )
            // InternalOberon.g:3409:2: ')'
            {
             before(grammarAccess.getTExpressionAccess().getRightParenthesisKeyword_3_1_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getTExpressionAccess().getRightParenthesisKeyword_3_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TExpression__Group_3_1__2__Impl"


    // $ANTLR start "rule__TExpression__Group_3_2__0"
    // InternalOberon.g:3419:1: rule__TExpression__Group_3_2__0 : rule__TExpression__Group_3_2__0__Impl rule__TExpression__Group_3_2__1 ;
    public final void rule__TExpression__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3423:1: ( rule__TExpression__Group_3_2__0__Impl rule__TExpression__Group_3_2__1 )
            // InternalOberon.g:3424:2: rule__TExpression__Group_3_2__0__Impl rule__TExpression__Group_3_2__1
            {
            pushFollow(FOLLOW_3);
            rule__TExpression__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TExpression__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TExpression__Group_3_2__0"


    // $ANTLR start "rule__TExpression__Group_3_2__0__Impl"
    // InternalOberon.g:3431:1: rule__TExpression__Group_3_2__0__Impl : ( '.' ) ;
    public final void rule__TExpression__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3435:1: ( ( '.' ) )
            // InternalOberon.g:3436:1: ( '.' )
            {
            // InternalOberon.g:3436:1: ( '.' )
            // InternalOberon.g:3437:2: '.'
            {
             before(grammarAccess.getTExpressionAccess().getFullStopKeyword_3_2_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getTExpressionAccess().getFullStopKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TExpression__Group_3_2__0__Impl"


    // $ANTLR start "rule__TExpression__Group_3_2__1"
    // InternalOberon.g:3446:1: rule__TExpression__Group_3_2__1 : rule__TExpression__Group_3_2__1__Impl ;
    public final void rule__TExpression__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3450:1: ( rule__TExpression__Group_3_2__1__Impl )
            // InternalOberon.g:3451:2: rule__TExpression__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TExpression__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TExpression__Group_3_2__1"


    // $ANTLR start "rule__TExpression__Group_3_2__1__Impl"
    // InternalOberon.g:3457:1: rule__TExpression__Group_3_2__1__Impl : ( ( rule__TExpression__AtribsAssignment_3_2_1 ) ) ;
    public final void rule__TExpression__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3461:1: ( ( ( rule__TExpression__AtribsAssignment_3_2_1 ) ) )
            // InternalOberon.g:3462:1: ( ( rule__TExpression__AtribsAssignment_3_2_1 ) )
            {
            // InternalOberon.g:3462:1: ( ( rule__TExpression__AtribsAssignment_3_2_1 ) )
            // InternalOberon.g:3463:2: ( rule__TExpression__AtribsAssignment_3_2_1 )
            {
             before(grammarAccess.getTExpressionAccess().getAtribsAssignment_3_2_1()); 
            // InternalOberon.g:3464:2: ( rule__TExpression__AtribsAssignment_3_2_1 )
            // InternalOberon.g:3464:3: rule__TExpression__AtribsAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__TExpression__AtribsAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTExpressionAccess().getAtribsAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TExpression__Group_3_2__1__Impl"


    // $ANTLR start "rule__TExpression__Group_3_3__0"
    // InternalOberon.g:3473:1: rule__TExpression__Group_3_3__0 : rule__TExpression__Group_3_3__0__Impl rule__TExpression__Group_3_3__1 ;
    public final void rule__TExpression__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3477:1: ( rule__TExpression__Group_3_3__0__Impl rule__TExpression__Group_3_3__1 )
            // InternalOberon.g:3478:2: rule__TExpression__Group_3_3__0__Impl rule__TExpression__Group_3_3__1
            {
            pushFollow(FOLLOW_20);
            rule__TExpression__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TExpression__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TExpression__Group_3_3__0"


    // $ANTLR start "rule__TExpression__Group_3_3__0__Impl"
    // InternalOberon.g:3485:1: rule__TExpression__Group_3_3__0__Impl : ( '[' ) ;
    public final void rule__TExpression__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3489:1: ( ( '[' ) )
            // InternalOberon.g:3490:1: ( '[' )
            {
            // InternalOberon.g:3490:1: ( '[' )
            // InternalOberon.g:3491:2: '['
            {
             before(grammarAccess.getTExpressionAccess().getLeftSquareBracketKeyword_3_3_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getTExpressionAccess().getLeftSquareBracketKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TExpression__Group_3_3__0__Impl"


    // $ANTLR start "rule__TExpression__Group_3_3__1"
    // InternalOberon.g:3500:1: rule__TExpression__Group_3_3__1 : rule__TExpression__Group_3_3__1__Impl rule__TExpression__Group_3_3__2 ;
    public final void rule__TExpression__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3504:1: ( rule__TExpression__Group_3_3__1__Impl rule__TExpression__Group_3_3__2 )
            // InternalOberon.g:3505:2: rule__TExpression__Group_3_3__1__Impl rule__TExpression__Group_3_3__2
            {
            pushFollow(FOLLOW_34);
            rule__TExpression__Group_3_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TExpression__Group_3_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TExpression__Group_3_3__1"


    // $ANTLR start "rule__TExpression__Group_3_3__1__Impl"
    // InternalOberon.g:3512:1: rule__TExpression__Group_3_3__1__Impl : ( ( rule__TExpression__IndexAssignment_3_3_1 ) ) ;
    public final void rule__TExpression__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3516:1: ( ( ( rule__TExpression__IndexAssignment_3_3_1 ) ) )
            // InternalOberon.g:3517:1: ( ( rule__TExpression__IndexAssignment_3_3_1 ) )
            {
            // InternalOberon.g:3517:1: ( ( rule__TExpression__IndexAssignment_3_3_1 ) )
            // InternalOberon.g:3518:2: ( rule__TExpression__IndexAssignment_3_3_1 )
            {
             before(grammarAccess.getTExpressionAccess().getIndexAssignment_3_3_1()); 
            // InternalOberon.g:3519:2: ( rule__TExpression__IndexAssignment_3_3_1 )
            // InternalOberon.g:3519:3: rule__TExpression__IndexAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__TExpression__IndexAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTExpressionAccess().getIndexAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TExpression__Group_3_3__1__Impl"


    // $ANTLR start "rule__TExpression__Group_3_3__2"
    // InternalOberon.g:3527:1: rule__TExpression__Group_3_3__2 : rule__TExpression__Group_3_3__2__Impl ;
    public final void rule__TExpression__Group_3_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3531:1: ( rule__TExpression__Group_3_3__2__Impl )
            // InternalOberon.g:3532:2: rule__TExpression__Group_3_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TExpression__Group_3_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TExpression__Group_3_3__2"


    // $ANTLR start "rule__TExpression__Group_3_3__2__Impl"
    // InternalOberon.g:3538:1: rule__TExpression__Group_3_3__2__Impl : ( ']' ) ;
    public final void rule__TExpression__Group_3_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3542:1: ( ( ']' ) )
            // InternalOberon.g:3543:1: ( ']' )
            {
            // InternalOberon.g:3543:1: ( ']' )
            // InternalOberon.g:3544:2: ']'
            {
             before(grammarAccess.getTExpressionAccess().getRightSquareBracketKeyword_3_3_2()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getTExpressionAccess().getRightSquareBracketKeyword_3_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TExpression__Group_3_3__2__Impl"


    // $ANTLR start "rule__Statement__Group__0"
    // InternalOberon.g:3554:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3558:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // InternalOberon.g:3559:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__0"


    // $ANTLR start "rule__Statement__Group__0__Impl"
    // InternalOberon.g:3566:1: rule__Statement__Group__0__Impl : ( ( rule__Statement__StmtAssignment_0 ) ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3570:1: ( ( ( rule__Statement__StmtAssignment_0 ) ) )
            // InternalOberon.g:3571:1: ( ( rule__Statement__StmtAssignment_0 ) )
            {
            // InternalOberon.g:3571:1: ( ( rule__Statement__StmtAssignment_0 ) )
            // InternalOberon.g:3572:2: ( rule__Statement__StmtAssignment_0 )
            {
             before(grammarAccess.getStatementAccess().getStmtAssignment_0()); 
            // InternalOberon.g:3573:2: ( rule__Statement__StmtAssignment_0 )
            // InternalOberon.g:3573:3: rule__Statement__StmtAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Statement__StmtAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getStmtAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__0__Impl"


    // $ANTLR start "rule__Statement__Group__1"
    // InternalOberon.g:3581:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3585:1: ( rule__Statement__Group__1__Impl )
            // InternalOberon.g:3586:2: rule__Statement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__1"


    // $ANTLR start "rule__Statement__Group__1__Impl"
    // InternalOberon.g:3592:1: rule__Statement__Group__1__Impl : ( ( rule__Statement__Group_1__0 )* ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3596:1: ( ( ( rule__Statement__Group_1__0 )* ) )
            // InternalOberon.g:3597:1: ( ( rule__Statement__Group_1__0 )* )
            {
            // InternalOberon.g:3597:1: ( ( rule__Statement__Group_1__0 )* )
            // InternalOberon.g:3598:2: ( rule__Statement__Group_1__0 )*
            {
             before(grammarAccess.getStatementAccess().getGroup_1()); 
            // InternalOberon.g:3599:2: ( rule__Statement__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==26) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalOberon.g:3599:3: rule__Statement__Group_1__0
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__Statement__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getStatementAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__1__Impl"


    // $ANTLR start "rule__Statement__Group_1__0"
    // InternalOberon.g:3608:1: rule__Statement__Group_1__0 : rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 ;
    public final void rule__Statement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3612:1: ( rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 )
            // InternalOberon.g:3613:2: rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1
            {
            pushFollow(FOLLOW_36);
            rule__Statement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__0"


    // $ANTLR start "rule__Statement__Group_1__0__Impl"
    // InternalOberon.g:3620:1: rule__Statement__Group_1__0__Impl : ( ';' ) ;
    public final void rule__Statement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3624:1: ( ( ';' ) )
            // InternalOberon.g:3625:1: ( ';' )
            {
            // InternalOberon.g:3625:1: ( ';' )
            // InternalOberon.g:3626:2: ';'
            {
             before(grammarAccess.getStatementAccess().getSemicolonKeyword_1_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getSemicolonKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__0__Impl"


    // $ANTLR start "rule__Statement__Group_1__1"
    // InternalOberon.g:3635:1: rule__Statement__Group_1__1 : rule__Statement__Group_1__1__Impl ;
    public final void rule__Statement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3639:1: ( rule__Statement__Group_1__1__Impl )
            // InternalOberon.g:3640:2: rule__Statement__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__1"


    // $ANTLR start "rule__Statement__Group_1__1__Impl"
    // InternalOberon.g:3646:1: rule__Statement__Group_1__1__Impl : ( ( rule__Statement__StmtsAssignment_1_1 ) ) ;
    public final void rule__Statement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3650:1: ( ( ( rule__Statement__StmtsAssignment_1_1 ) ) )
            // InternalOberon.g:3651:1: ( ( rule__Statement__StmtsAssignment_1_1 ) )
            {
            // InternalOberon.g:3651:1: ( ( rule__Statement__StmtsAssignment_1_1 ) )
            // InternalOberon.g:3652:2: ( rule__Statement__StmtsAssignment_1_1 )
            {
             before(grammarAccess.getStatementAccess().getStmtsAssignment_1_1()); 
            // InternalOberon.g:3653:2: ( rule__Statement__StmtsAssignment_1_1 )
            // InternalOberon.g:3653:3: rule__Statement__StmtsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Statement__StmtsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getStmtsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__1__Impl"


    // $ANTLR start "rule__TStatement__Group_0__0"
    // InternalOberon.g:3662:1: rule__TStatement__Group_0__0 : rule__TStatement__Group_0__0__Impl rule__TStatement__Group_0__1 ;
    public final void rule__TStatement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3666:1: ( rule__TStatement__Group_0__0__Impl rule__TStatement__Group_0__1 )
            // InternalOberon.g:3667:2: rule__TStatement__Group_0__0__Impl rule__TStatement__Group_0__1
            {
            pushFollow(FOLLOW_37);
            rule__TStatement__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TStatement__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_0__0"


    // $ANTLR start "rule__TStatement__Group_0__0__Impl"
    // InternalOberon.g:3674:1: rule__TStatement__Group_0__0__Impl : ( ( rule__TStatement__DesAssignment_0_0 ) ) ;
    public final void rule__TStatement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3678:1: ( ( ( rule__TStatement__DesAssignment_0_0 ) ) )
            // InternalOberon.g:3679:1: ( ( rule__TStatement__DesAssignment_0_0 ) )
            {
            // InternalOberon.g:3679:1: ( ( rule__TStatement__DesAssignment_0_0 ) )
            // InternalOberon.g:3680:2: ( rule__TStatement__DesAssignment_0_0 )
            {
             before(grammarAccess.getTStatementAccess().getDesAssignment_0_0()); 
            // InternalOberon.g:3681:2: ( rule__TStatement__DesAssignment_0_0 )
            // InternalOberon.g:3681:3: rule__TStatement__DesAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__TStatement__DesAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getTStatementAccess().getDesAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_0__0__Impl"


    // $ANTLR start "rule__TStatement__Group_0__1"
    // InternalOberon.g:3689:1: rule__TStatement__Group_0__1 : rule__TStatement__Group_0__1__Impl ;
    public final void rule__TStatement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3693:1: ( rule__TStatement__Group_0__1__Impl )
            // InternalOberon.g:3694:2: rule__TStatement__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TStatement__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_0__1"


    // $ANTLR start "rule__TStatement__Group_0__1__Impl"
    // InternalOberon.g:3700:1: rule__TStatement__Group_0__1__Impl : ( ( rule__TStatement__Group_0_1__0 )? ) ;
    public final void rule__TStatement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3704:1: ( ( ( rule__TStatement__Group_0_1__0 )? ) )
            // InternalOberon.g:3705:1: ( ( rule__TStatement__Group_0_1__0 )? )
            {
            // InternalOberon.g:3705:1: ( ( rule__TStatement__Group_0_1__0 )? )
            // InternalOberon.g:3706:2: ( rule__TStatement__Group_0_1__0 )?
            {
             before(grammarAccess.getTStatementAccess().getGroup_0_1()); 
            // InternalOberon.g:3707:2: ( rule__TStatement__Group_0_1__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==43) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalOberon.g:3707:3: rule__TStatement__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TStatement__Group_0_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTStatementAccess().getGroup_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_0__1__Impl"


    // $ANTLR start "rule__TStatement__Group_0_1__0"
    // InternalOberon.g:3716:1: rule__TStatement__Group_0_1__0 : rule__TStatement__Group_0_1__0__Impl rule__TStatement__Group_0_1__1 ;
    public final void rule__TStatement__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3720:1: ( rule__TStatement__Group_0_1__0__Impl rule__TStatement__Group_0_1__1 )
            // InternalOberon.g:3721:2: rule__TStatement__Group_0_1__0__Impl rule__TStatement__Group_0_1__1
            {
            pushFollow(FOLLOW_20);
            rule__TStatement__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TStatement__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_0_1__0"


    // $ANTLR start "rule__TStatement__Group_0_1__0__Impl"
    // InternalOberon.g:3728:1: rule__TStatement__Group_0_1__0__Impl : ( ':=' ) ;
    public final void rule__TStatement__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3732:1: ( ( ':=' ) )
            // InternalOberon.g:3733:1: ( ':=' )
            {
            // InternalOberon.g:3733:1: ( ':=' )
            // InternalOberon.g:3734:2: ':='
            {
             before(grammarAccess.getTStatementAccess().getColonEqualsSignKeyword_0_1_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getTStatementAccess().getColonEqualsSignKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_0_1__0__Impl"


    // $ANTLR start "rule__TStatement__Group_0_1__1"
    // InternalOberon.g:3743:1: rule__TStatement__Group_0_1__1 : rule__TStatement__Group_0_1__1__Impl ;
    public final void rule__TStatement__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3747:1: ( rule__TStatement__Group_0_1__1__Impl )
            // InternalOberon.g:3748:2: rule__TStatement__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TStatement__Group_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_0_1__1"


    // $ANTLR start "rule__TStatement__Group_0_1__1__Impl"
    // InternalOberon.g:3754:1: rule__TStatement__Group_0_1__1__Impl : ( ( rule__TStatement__ExpAssignment_0_1_1 ) ) ;
    public final void rule__TStatement__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3758:1: ( ( ( rule__TStatement__ExpAssignment_0_1_1 ) ) )
            // InternalOberon.g:3759:1: ( ( rule__TStatement__ExpAssignment_0_1_1 ) )
            {
            // InternalOberon.g:3759:1: ( ( rule__TStatement__ExpAssignment_0_1_1 ) )
            // InternalOberon.g:3760:2: ( rule__TStatement__ExpAssignment_0_1_1 )
            {
             before(grammarAccess.getTStatementAccess().getExpAssignment_0_1_1()); 
            // InternalOberon.g:3761:2: ( rule__TStatement__ExpAssignment_0_1_1 )
            // InternalOberon.g:3761:3: rule__TStatement__ExpAssignment_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__TStatement__ExpAssignment_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTStatementAccess().getExpAssignment_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_0_1__1__Impl"


    // $ANTLR start "rule__TStatement__Group_1__0"
    // InternalOberon.g:3770:1: rule__TStatement__Group_1__0 : rule__TStatement__Group_1__0__Impl rule__TStatement__Group_1__1 ;
    public final void rule__TStatement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3774:1: ( rule__TStatement__Group_1__0__Impl rule__TStatement__Group_1__1 )
            // InternalOberon.g:3775:2: rule__TStatement__Group_1__0__Impl rule__TStatement__Group_1__1
            {
            pushFollow(FOLLOW_24);
            rule__TStatement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TStatement__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_1__0"


    // $ANTLR start "rule__TStatement__Group_1__0__Impl"
    // InternalOberon.g:3782:1: rule__TStatement__Group_1__0__Impl : ( 'readInt' ) ;
    public final void rule__TStatement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3786:1: ( ( 'readInt' ) )
            // InternalOberon.g:3787:1: ( 'readInt' )
            {
            // InternalOberon.g:3787:1: ( 'readInt' )
            // InternalOberon.g:3788:2: 'readInt'
            {
             before(grammarAccess.getTStatementAccess().getReadIntKeyword_1_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getTStatementAccess().getReadIntKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_1__0__Impl"


    // $ANTLR start "rule__TStatement__Group_1__1"
    // InternalOberon.g:3797:1: rule__TStatement__Group_1__1 : rule__TStatement__Group_1__1__Impl rule__TStatement__Group_1__2 ;
    public final void rule__TStatement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3801:1: ( rule__TStatement__Group_1__1__Impl rule__TStatement__Group_1__2 )
            // InternalOberon.g:3802:2: rule__TStatement__Group_1__1__Impl rule__TStatement__Group_1__2
            {
            pushFollow(FOLLOW_3);
            rule__TStatement__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TStatement__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_1__1"


    // $ANTLR start "rule__TStatement__Group_1__1__Impl"
    // InternalOberon.g:3809:1: rule__TStatement__Group_1__1__Impl : ( '(' ) ;
    public final void rule__TStatement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3813:1: ( ( '(' ) )
            // InternalOberon.g:3814:1: ( '(' )
            {
            // InternalOberon.g:3814:1: ( '(' )
            // InternalOberon.g:3815:2: '('
            {
             before(grammarAccess.getTStatementAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getTStatementAccess().getLeftParenthesisKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_1__1__Impl"


    // $ANTLR start "rule__TStatement__Group_1__2"
    // InternalOberon.g:3824:1: rule__TStatement__Group_1__2 : rule__TStatement__Group_1__2__Impl rule__TStatement__Group_1__3 ;
    public final void rule__TStatement__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3828:1: ( rule__TStatement__Group_1__2__Impl rule__TStatement__Group_1__3 )
            // InternalOberon.g:3829:2: rule__TStatement__Group_1__2__Impl rule__TStatement__Group_1__3
            {
            pushFollow(FOLLOW_29);
            rule__TStatement__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TStatement__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_1__2"


    // $ANTLR start "rule__TStatement__Group_1__2__Impl"
    // InternalOberon.g:3836:1: rule__TStatement__Group_1__2__Impl : ( ( rule__TStatement__VarAssignment_1_2 ) ) ;
    public final void rule__TStatement__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3840:1: ( ( ( rule__TStatement__VarAssignment_1_2 ) ) )
            // InternalOberon.g:3841:1: ( ( rule__TStatement__VarAssignment_1_2 ) )
            {
            // InternalOberon.g:3841:1: ( ( rule__TStatement__VarAssignment_1_2 ) )
            // InternalOberon.g:3842:2: ( rule__TStatement__VarAssignment_1_2 )
            {
             before(grammarAccess.getTStatementAccess().getVarAssignment_1_2()); 
            // InternalOberon.g:3843:2: ( rule__TStatement__VarAssignment_1_2 )
            // InternalOberon.g:3843:3: rule__TStatement__VarAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__TStatement__VarAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getTStatementAccess().getVarAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_1__2__Impl"


    // $ANTLR start "rule__TStatement__Group_1__3"
    // InternalOberon.g:3851:1: rule__TStatement__Group_1__3 : rule__TStatement__Group_1__3__Impl ;
    public final void rule__TStatement__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3855:1: ( rule__TStatement__Group_1__3__Impl )
            // InternalOberon.g:3856:2: rule__TStatement__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TStatement__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_1__3"


    // $ANTLR start "rule__TStatement__Group_1__3__Impl"
    // InternalOberon.g:3862:1: rule__TStatement__Group_1__3__Impl : ( ')' ) ;
    public final void rule__TStatement__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3866:1: ( ( ')' ) )
            // InternalOberon.g:3867:1: ( ')' )
            {
            // InternalOberon.g:3867:1: ( ')' )
            // InternalOberon.g:3868:2: ')'
            {
             before(grammarAccess.getTStatementAccess().getRightParenthesisKeyword_1_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getTStatementAccess().getRightParenthesisKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_1__3__Impl"


    // $ANTLR start "rule__TStatement__Group_2__0"
    // InternalOberon.g:3878:1: rule__TStatement__Group_2__0 : rule__TStatement__Group_2__0__Impl rule__TStatement__Group_2__1 ;
    public final void rule__TStatement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3882:1: ( rule__TStatement__Group_2__0__Impl rule__TStatement__Group_2__1 )
            // InternalOberon.g:3883:2: rule__TStatement__Group_2__0__Impl rule__TStatement__Group_2__1
            {
            pushFollow(FOLLOW_24);
            rule__TStatement__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TStatement__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_2__0"


    // $ANTLR start "rule__TStatement__Group_2__0__Impl"
    // InternalOberon.g:3890:1: rule__TStatement__Group_2__0__Impl : ( 'write' ) ;
    public final void rule__TStatement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3894:1: ( ( 'write' ) )
            // InternalOberon.g:3895:1: ( 'write' )
            {
            // InternalOberon.g:3895:1: ( 'write' )
            // InternalOberon.g:3896:2: 'write'
            {
             before(grammarAccess.getTStatementAccess().getWriteKeyword_2_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getTStatementAccess().getWriteKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_2__0__Impl"


    // $ANTLR start "rule__TStatement__Group_2__1"
    // InternalOberon.g:3905:1: rule__TStatement__Group_2__1 : rule__TStatement__Group_2__1__Impl rule__TStatement__Group_2__2 ;
    public final void rule__TStatement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3909:1: ( rule__TStatement__Group_2__1__Impl rule__TStatement__Group_2__2 )
            // InternalOberon.g:3910:2: rule__TStatement__Group_2__1__Impl rule__TStatement__Group_2__2
            {
            pushFollow(FOLLOW_20);
            rule__TStatement__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TStatement__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_2__1"


    // $ANTLR start "rule__TStatement__Group_2__1__Impl"
    // InternalOberon.g:3917:1: rule__TStatement__Group_2__1__Impl : ( '(' ) ;
    public final void rule__TStatement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3921:1: ( ( '(' ) )
            // InternalOberon.g:3922:1: ( '(' )
            {
            // InternalOberon.g:3922:1: ( '(' )
            // InternalOberon.g:3923:2: '('
            {
             before(grammarAccess.getTStatementAccess().getLeftParenthesisKeyword_2_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getTStatementAccess().getLeftParenthesisKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_2__1__Impl"


    // $ANTLR start "rule__TStatement__Group_2__2"
    // InternalOberon.g:3932:1: rule__TStatement__Group_2__2 : rule__TStatement__Group_2__2__Impl rule__TStatement__Group_2__3 ;
    public final void rule__TStatement__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3936:1: ( rule__TStatement__Group_2__2__Impl rule__TStatement__Group_2__3 )
            // InternalOberon.g:3937:2: rule__TStatement__Group_2__2__Impl rule__TStatement__Group_2__3
            {
            pushFollow(FOLLOW_29);
            rule__TStatement__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TStatement__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_2__2"


    // $ANTLR start "rule__TStatement__Group_2__2__Impl"
    // InternalOberon.g:3944:1: rule__TStatement__Group_2__2__Impl : ( ( rule__TStatement__ExpAssignment_2_2 ) ) ;
    public final void rule__TStatement__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3948:1: ( ( ( rule__TStatement__ExpAssignment_2_2 ) ) )
            // InternalOberon.g:3949:1: ( ( rule__TStatement__ExpAssignment_2_2 ) )
            {
            // InternalOberon.g:3949:1: ( ( rule__TStatement__ExpAssignment_2_2 ) )
            // InternalOberon.g:3950:2: ( rule__TStatement__ExpAssignment_2_2 )
            {
             before(grammarAccess.getTStatementAccess().getExpAssignment_2_2()); 
            // InternalOberon.g:3951:2: ( rule__TStatement__ExpAssignment_2_2 )
            // InternalOberon.g:3951:3: rule__TStatement__ExpAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__TStatement__ExpAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getTStatementAccess().getExpAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_2__2__Impl"


    // $ANTLR start "rule__TStatement__Group_2__3"
    // InternalOberon.g:3959:1: rule__TStatement__Group_2__3 : rule__TStatement__Group_2__3__Impl ;
    public final void rule__TStatement__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3963:1: ( rule__TStatement__Group_2__3__Impl )
            // InternalOberon.g:3964:2: rule__TStatement__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TStatement__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_2__3"


    // $ANTLR start "rule__TStatement__Group_2__3__Impl"
    // InternalOberon.g:3970:1: rule__TStatement__Group_2__3__Impl : ( ')' ) ;
    public final void rule__TStatement__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3974:1: ( ( ')' ) )
            // InternalOberon.g:3975:1: ( ')' )
            {
            // InternalOberon.g:3975:1: ( ')' )
            // InternalOberon.g:3976:2: ')'
            {
             before(grammarAccess.getTStatementAccess().getRightParenthesisKeyword_2_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getTStatementAccess().getRightParenthesisKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_2__3__Impl"


    // $ANTLR start "rule__TStatement__Group_3__0"
    // InternalOberon.g:3986:1: rule__TStatement__Group_3__0 : rule__TStatement__Group_3__0__Impl rule__TStatement__Group_3__1 ;
    public final void rule__TStatement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:3990:1: ( rule__TStatement__Group_3__0__Impl rule__TStatement__Group_3__1 )
            // InternalOberon.g:3991:2: rule__TStatement__Group_3__0__Impl rule__TStatement__Group_3__1
            {
            pushFollow(FOLLOW_20);
            rule__TStatement__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TStatement__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_3__0"


    // $ANTLR start "rule__TStatement__Group_3__0__Impl"
    // InternalOberon.g:3998:1: rule__TStatement__Group_3__0__Impl : ( 'IF' ) ;
    public final void rule__TStatement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4002:1: ( ( 'IF' ) )
            // InternalOberon.g:4003:1: ( 'IF' )
            {
            // InternalOberon.g:4003:1: ( 'IF' )
            // InternalOberon.g:4004:2: 'IF'
            {
             before(grammarAccess.getTStatementAccess().getIFKeyword_3_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getTStatementAccess().getIFKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_3__0__Impl"


    // $ANTLR start "rule__TStatement__Group_3__1"
    // InternalOberon.g:4013:1: rule__TStatement__Group_3__1 : rule__TStatement__Group_3__1__Impl rule__TStatement__Group_3__2 ;
    public final void rule__TStatement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4017:1: ( rule__TStatement__Group_3__1__Impl rule__TStatement__Group_3__2 )
            // InternalOberon.g:4018:2: rule__TStatement__Group_3__1__Impl rule__TStatement__Group_3__2
            {
            pushFollow(FOLLOW_38);
            rule__TStatement__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TStatement__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_3__1"


    // $ANTLR start "rule__TStatement__Group_3__1__Impl"
    // InternalOberon.g:4025:1: rule__TStatement__Group_3__1__Impl : ( ( rule__TStatement__CondAssignment_3_1 ) ) ;
    public final void rule__TStatement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4029:1: ( ( ( rule__TStatement__CondAssignment_3_1 ) ) )
            // InternalOberon.g:4030:1: ( ( rule__TStatement__CondAssignment_3_1 ) )
            {
            // InternalOberon.g:4030:1: ( ( rule__TStatement__CondAssignment_3_1 ) )
            // InternalOberon.g:4031:2: ( rule__TStatement__CondAssignment_3_1 )
            {
             before(grammarAccess.getTStatementAccess().getCondAssignment_3_1()); 
            // InternalOberon.g:4032:2: ( rule__TStatement__CondAssignment_3_1 )
            // InternalOberon.g:4032:3: rule__TStatement__CondAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__TStatement__CondAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTStatementAccess().getCondAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_3__1__Impl"


    // $ANTLR start "rule__TStatement__Group_3__2"
    // InternalOberon.g:4040:1: rule__TStatement__Group_3__2 : rule__TStatement__Group_3__2__Impl rule__TStatement__Group_3__3 ;
    public final void rule__TStatement__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4044:1: ( rule__TStatement__Group_3__2__Impl rule__TStatement__Group_3__3 )
            // InternalOberon.g:4045:2: rule__TStatement__Group_3__2__Impl rule__TStatement__Group_3__3
            {
            pushFollow(FOLLOW_36);
            rule__TStatement__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TStatement__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_3__2"


    // $ANTLR start "rule__TStatement__Group_3__2__Impl"
    // InternalOberon.g:4052:1: rule__TStatement__Group_3__2__Impl : ( 'THEN' ) ;
    public final void rule__TStatement__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4056:1: ( ( 'THEN' ) )
            // InternalOberon.g:4057:1: ( 'THEN' )
            {
            // InternalOberon.g:4057:1: ( 'THEN' )
            // InternalOberon.g:4058:2: 'THEN'
            {
             before(grammarAccess.getTStatementAccess().getTHENKeyword_3_2()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getTStatementAccess().getTHENKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_3__2__Impl"


    // $ANTLR start "rule__TStatement__Group_3__3"
    // InternalOberon.g:4067:1: rule__TStatement__Group_3__3 : rule__TStatement__Group_3__3__Impl rule__TStatement__Group_3__4 ;
    public final void rule__TStatement__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4071:1: ( rule__TStatement__Group_3__3__Impl rule__TStatement__Group_3__4 )
            // InternalOberon.g:4072:2: rule__TStatement__Group_3__3__Impl rule__TStatement__Group_3__4
            {
            pushFollow(FOLLOW_39);
            rule__TStatement__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TStatement__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_3__3"


    // $ANTLR start "rule__TStatement__Group_3__3__Impl"
    // InternalOberon.g:4079:1: rule__TStatement__Group_3__3__Impl : ( ( rule__TStatement__ThenStmtAssignment_3_3 ) ) ;
    public final void rule__TStatement__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4083:1: ( ( ( rule__TStatement__ThenStmtAssignment_3_3 ) ) )
            // InternalOberon.g:4084:1: ( ( rule__TStatement__ThenStmtAssignment_3_3 ) )
            {
            // InternalOberon.g:4084:1: ( ( rule__TStatement__ThenStmtAssignment_3_3 ) )
            // InternalOberon.g:4085:2: ( rule__TStatement__ThenStmtAssignment_3_3 )
            {
             before(grammarAccess.getTStatementAccess().getThenStmtAssignment_3_3()); 
            // InternalOberon.g:4086:2: ( rule__TStatement__ThenStmtAssignment_3_3 )
            // InternalOberon.g:4086:3: rule__TStatement__ThenStmtAssignment_3_3
            {
            pushFollow(FOLLOW_2);
            rule__TStatement__ThenStmtAssignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getTStatementAccess().getThenStmtAssignment_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_3__3__Impl"


    // $ANTLR start "rule__TStatement__Group_3__4"
    // InternalOberon.g:4094:1: rule__TStatement__Group_3__4 : rule__TStatement__Group_3__4__Impl rule__TStatement__Group_3__5 ;
    public final void rule__TStatement__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4098:1: ( rule__TStatement__Group_3__4__Impl rule__TStatement__Group_3__5 )
            // InternalOberon.g:4099:2: rule__TStatement__Group_3__4__Impl rule__TStatement__Group_3__5
            {
            pushFollow(FOLLOW_39);
            rule__TStatement__Group_3__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TStatement__Group_3__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_3__4"


    // $ANTLR start "rule__TStatement__Group_3__4__Impl"
    // InternalOberon.g:4106:1: rule__TStatement__Group_3__4__Impl : ( ( rule__TStatement__Group_3_4__0 )* ) ;
    public final void rule__TStatement__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4110:1: ( ( ( rule__TStatement__Group_3_4__0 )* ) )
            // InternalOberon.g:4111:1: ( ( rule__TStatement__Group_3_4__0 )* )
            {
            // InternalOberon.g:4111:1: ( ( rule__TStatement__Group_3_4__0 )* )
            // InternalOberon.g:4112:2: ( rule__TStatement__Group_3_4__0 )*
            {
             before(grammarAccess.getTStatementAccess().getGroup_3_4()); 
            // InternalOberon.g:4113:2: ( rule__TStatement__Group_3_4__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==48) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalOberon.g:4113:3: rule__TStatement__Group_3_4__0
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__TStatement__Group_3_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getTStatementAccess().getGroup_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_3__4__Impl"


    // $ANTLR start "rule__TStatement__Group_3__5"
    // InternalOberon.g:4121:1: rule__TStatement__Group_3__5 : rule__TStatement__Group_3__5__Impl rule__TStatement__Group_3__6 ;
    public final void rule__TStatement__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4125:1: ( rule__TStatement__Group_3__5__Impl rule__TStatement__Group_3__6 )
            // InternalOberon.g:4126:2: rule__TStatement__Group_3__5__Impl rule__TStatement__Group_3__6
            {
            pushFollow(FOLLOW_39);
            rule__TStatement__Group_3__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TStatement__Group_3__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_3__5"


    // $ANTLR start "rule__TStatement__Group_3__5__Impl"
    // InternalOberon.g:4133:1: rule__TStatement__Group_3__5__Impl : ( ( rule__TStatement__Group_3_5__0 )? ) ;
    public final void rule__TStatement__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4137:1: ( ( ( rule__TStatement__Group_3_5__0 )? ) )
            // InternalOberon.g:4138:1: ( ( rule__TStatement__Group_3_5__0 )? )
            {
            // InternalOberon.g:4138:1: ( ( rule__TStatement__Group_3_5__0 )? )
            // InternalOberon.g:4139:2: ( rule__TStatement__Group_3_5__0 )?
            {
             before(grammarAccess.getTStatementAccess().getGroup_3_5()); 
            // InternalOberon.g:4140:2: ( rule__TStatement__Group_3_5__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==49) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalOberon.g:4140:3: rule__TStatement__Group_3_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TStatement__Group_3_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTStatementAccess().getGroup_3_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_3__5__Impl"


    // $ANTLR start "rule__TStatement__Group_3__6"
    // InternalOberon.g:4148:1: rule__TStatement__Group_3__6 : rule__TStatement__Group_3__6__Impl ;
    public final void rule__TStatement__Group_3__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4152:1: ( rule__TStatement__Group_3__6__Impl )
            // InternalOberon.g:4153:2: rule__TStatement__Group_3__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TStatement__Group_3__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_3__6"


    // $ANTLR start "rule__TStatement__Group_3__6__Impl"
    // InternalOberon.g:4159:1: rule__TStatement__Group_3__6__Impl : ( 'END' ) ;
    public final void rule__TStatement__Group_3__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4163:1: ( ( 'END' ) )
            // InternalOberon.g:4164:1: ( 'END' )
            {
            // InternalOberon.g:4164:1: ( 'END' )
            // InternalOberon.g:4165:2: 'END'
            {
             before(grammarAccess.getTStatementAccess().getENDKeyword_3_6()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTStatementAccess().getENDKeyword_3_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_3__6__Impl"


    // $ANTLR start "rule__TStatement__Group_3_4__0"
    // InternalOberon.g:4175:1: rule__TStatement__Group_3_4__0 : rule__TStatement__Group_3_4__0__Impl rule__TStatement__Group_3_4__1 ;
    public final void rule__TStatement__Group_3_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4179:1: ( rule__TStatement__Group_3_4__0__Impl rule__TStatement__Group_3_4__1 )
            // InternalOberon.g:4180:2: rule__TStatement__Group_3_4__0__Impl rule__TStatement__Group_3_4__1
            {
            pushFollow(FOLLOW_20);
            rule__TStatement__Group_3_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TStatement__Group_3_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_3_4__0"


    // $ANTLR start "rule__TStatement__Group_3_4__0__Impl"
    // InternalOberon.g:4187:1: rule__TStatement__Group_3_4__0__Impl : ( 'ELSIF' ) ;
    public final void rule__TStatement__Group_3_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4191:1: ( ( 'ELSIF' ) )
            // InternalOberon.g:4192:1: ( 'ELSIF' )
            {
            // InternalOberon.g:4192:1: ( 'ELSIF' )
            // InternalOberon.g:4193:2: 'ELSIF'
            {
             before(grammarAccess.getTStatementAccess().getELSIFKeyword_3_4_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getTStatementAccess().getELSIFKeyword_3_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_3_4__0__Impl"


    // $ANTLR start "rule__TStatement__Group_3_4__1"
    // InternalOberon.g:4202:1: rule__TStatement__Group_3_4__1 : rule__TStatement__Group_3_4__1__Impl ;
    public final void rule__TStatement__Group_3_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4206:1: ( rule__TStatement__Group_3_4__1__Impl )
            // InternalOberon.g:4207:2: rule__TStatement__Group_3_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TStatement__Group_3_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_3_4__1"


    // $ANTLR start "rule__TStatement__Group_3_4__1__Impl"
    // InternalOberon.g:4213:1: rule__TStatement__Group_3_4__1__Impl : ( ( rule__TStatement__ElsifsAssignment_3_4_1 ) ) ;
    public final void rule__TStatement__Group_3_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4217:1: ( ( ( rule__TStatement__ElsifsAssignment_3_4_1 ) ) )
            // InternalOberon.g:4218:1: ( ( rule__TStatement__ElsifsAssignment_3_4_1 ) )
            {
            // InternalOberon.g:4218:1: ( ( rule__TStatement__ElsifsAssignment_3_4_1 ) )
            // InternalOberon.g:4219:2: ( rule__TStatement__ElsifsAssignment_3_4_1 )
            {
             before(grammarAccess.getTStatementAccess().getElsifsAssignment_3_4_1()); 
            // InternalOberon.g:4220:2: ( rule__TStatement__ElsifsAssignment_3_4_1 )
            // InternalOberon.g:4220:3: rule__TStatement__ElsifsAssignment_3_4_1
            {
            pushFollow(FOLLOW_2);
            rule__TStatement__ElsifsAssignment_3_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTStatementAccess().getElsifsAssignment_3_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_3_4__1__Impl"


    // $ANTLR start "rule__TStatement__Group_3_5__0"
    // InternalOberon.g:4229:1: rule__TStatement__Group_3_5__0 : rule__TStatement__Group_3_5__0__Impl rule__TStatement__Group_3_5__1 ;
    public final void rule__TStatement__Group_3_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4233:1: ( rule__TStatement__Group_3_5__0__Impl rule__TStatement__Group_3_5__1 )
            // InternalOberon.g:4234:2: rule__TStatement__Group_3_5__0__Impl rule__TStatement__Group_3_5__1
            {
            pushFollow(FOLLOW_36);
            rule__TStatement__Group_3_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TStatement__Group_3_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_3_5__0"


    // $ANTLR start "rule__TStatement__Group_3_5__0__Impl"
    // InternalOberon.g:4241:1: rule__TStatement__Group_3_5__0__Impl : ( 'ELSE' ) ;
    public final void rule__TStatement__Group_3_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4245:1: ( ( 'ELSE' ) )
            // InternalOberon.g:4246:1: ( 'ELSE' )
            {
            // InternalOberon.g:4246:1: ( 'ELSE' )
            // InternalOberon.g:4247:2: 'ELSE'
            {
             before(grammarAccess.getTStatementAccess().getELSEKeyword_3_5_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getTStatementAccess().getELSEKeyword_3_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_3_5__0__Impl"


    // $ANTLR start "rule__TStatement__Group_3_5__1"
    // InternalOberon.g:4256:1: rule__TStatement__Group_3_5__1 : rule__TStatement__Group_3_5__1__Impl ;
    public final void rule__TStatement__Group_3_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4260:1: ( rule__TStatement__Group_3_5__1__Impl )
            // InternalOberon.g:4261:2: rule__TStatement__Group_3_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TStatement__Group_3_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_3_5__1"


    // $ANTLR start "rule__TStatement__Group_3_5__1__Impl"
    // InternalOberon.g:4267:1: rule__TStatement__Group_3_5__1__Impl : ( ( rule__TStatement__ElseStmtAssignment_3_5_1 ) ) ;
    public final void rule__TStatement__Group_3_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4271:1: ( ( ( rule__TStatement__ElseStmtAssignment_3_5_1 ) ) )
            // InternalOberon.g:4272:1: ( ( rule__TStatement__ElseStmtAssignment_3_5_1 ) )
            {
            // InternalOberon.g:4272:1: ( ( rule__TStatement__ElseStmtAssignment_3_5_1 ) )
            // InternalOberon.g:4273:2: ( rule__TStatement__ElseStmtAssignment_3_5_1 )
            {
             before(grammarAccess.getTStatementAccess().getElseStmtAssignment_3_5_1()); 
            // InternalOberon.g:4274:2: ( rule__TStatement__ElseStmtAssignment_3_5_1 )
            // InternalOberon.g:4274:3: rule__TStatement__ElseStmtAssignment_3_5_1
            {
            pushFollow(FOLLOW_2);
            rule__TStatement__ElseStmtAssignment_3_5_1();

            state._fsp--;


            }

             after(grammarAccess.getTStatementAccess().getElseStmtAssignment_3_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_3_5__1__Impl"


    // $ANTLR start "rule__TStatement__Group_4__0"
    // InternalOberon.g:4283:1: rule__TStatement__Group_4__0 : rule__TStatement__Group_4__0__Impl rule__TStatement__Group_4__1 ;
    public final void rule__TStatement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4287:1: ( rule__TStatement__Group_4__0__Impl rule__TStatement__Group_4__1 )
            // InternalOberon.g:4288:2: rule__TStatement__Group_4__0__Impl rule__TStatement__Group_4__1
            {
            pushFollow(FOLLOW_20);
            rule__TStatement__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TStatement__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_4__0"


    // $ANTLR start "rule__TStatement__Group_4__0__Impl"
    // InternalOberon.g:4295:1: rule__TStatement__Group_4__0__Impl : ( 'WHILE' ) ;
    public final void rule__TStatement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4299:1: ( ( 'WHILE' ) )
            // InternalOberon.g:4300:1: ( 'WHILE' )
            {
            // InternalOberon.g:4300:1: ( 'WHILE' )
            // InternalOberon.g:4301:2: 'WHILE'
            {
             before(grammarAccess.getTStatementAccess().getWHILEKeyword_4_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getTStatementAccess().getWHILEKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_4__0__Impl"


    // $ANTLR start "rule__TStatement__Group_4__1"
    // InternalOberon.g:4310:1: rule__TStatement__Group_4__1 : rule__TStatement__Group_4__1__Impl rule__TStatement__Group_4__2 ;
    public final void rule__TStatement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4314:1: ( rule__TStatement__Group_4__1__Impl rule__TStatement__Group_4__2 )
            // InternalOberon.g:4315:2: rule__TStatement__Group_4__1__Impl rule__TStatement__Group_4__2
            {
            pushFollow(FOLLOW_41);
            rule__TStatement__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TStatement__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_4__1"


    // $ANTLR start "rule__TStatement__Group_4__1__Impl"
    // InternalOberon.g:4322:1: rule__TStatement__Group_4__1__Impl : ( ( rule__TStatement__CondAssignment_4_1 ) ) ;
    public final void rule__TStatement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4326:1: ( ( ( rule__TStatement__CondAssignment_4_1 ) ) )
            // InternalOberon.g:4327:1: ( ( rule__TStatement__CondAssignment_4_1 ) )
            {
            // InternalOberon.g:4327:1: ( ( rule__TStatement__CondAssignment_4_1 ) )
            // InternalOberon.g:4328:2: ( rule__TStatement__CondAssignment_4_1 )
            {
             before(grammarAccess.getTStatementAccess().getCondAssignment_4_1()); 
            // InternalOberon.g:4329:2: ( rule__TStatement__CondAssignment_4_1 )
            // InternalOberon.g:4329:3: rule__TStatement__CondAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__TStatement__CondAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTStatementAccess().getCondAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_4__1__Impl"


    // $ANTLR start "rule__TStatement__Group_4__2"
    // InternalOberon.g:4337:1: rule__TStatement__Group_4__2 : rule__TStatement__Group_4__2__Impl rule__TStatement__Group_4__3 ;
    public final void rule__TStatement__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4341:1: ( rule__TStatement__Group_4__2__Impl rule__TStatement__Group_4__3 )
            // InternalOberon.g:4342:2: rule__TStatement__Group_4__2__Impl rule__TStatement__Group_4__3
            {
            pushFollow(FOLLOW_36);
            rule__TStatement__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TStatement__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_4__2"


    // $ANTLR start "rule__TStatement__Group_4__2__Impl"
    // InternalOberon.g:4349:1: rule__TStatement__Group_4__2__Impl : ( 'DO' ) ;
    public final void rule__TStatement__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4353:1: ( ( 'DO' ) )
            // InternalOberon.g:4354:1: ( 'DO' )
            {
            // InternalOberon.g:4354:1: ( 'DO' )
            // InternalOberon.g:4355:2: 'DO'
            {
             before(grammarAccess.getTStatementAccess().getDOKeyword_4_2()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getTStatementAccess().getDOKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_4__2__Impl"


    // $ANTLR start "rule__TStatement__Group_4__3"
    // InternalOberon.g:4364:1: rule__TStatement__Group_4__3 : rule__TStatement__Group_4__3__Impl rule__TStatement__Group_4__4 ;
    public final void rule__TStatement__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4368:1: ( rule__TStatement__Group_4__3__Impl rule__TStatement__Group_4__4 )
            // InternalOberon.g:4369:2: rule__TStatement__Group_4__3__Impl rule__TStatement__Group_4__4
            {
            pushFollow(FOLLOW_19);
            rule__TStatement__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TStatement__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_4__3"


    // $ANTLR start "rule__TStatement__Group_4__3__Impl"
    // InternalOberon.g:4376:1: rule__TStatement__Group_4__3__Impl : ( ( rule__TStatement__StmtAssignment_4_3 ) ) ;
    public final void rule__TStatement__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4380:1: ( ( ( rule__TStatement__StmtAssignment_4_3 ) ) )
            // InternalOberon.g:4381:1: ( ( rule__TStatement__StmtAssignment_4_3 ) )
            {
            // InternalOberon.g:4381:1: ( ( rule__TStatement__StmtAssignment_4_3 ) )
            // InternalOberon.g:4382:2: ( rule__TStatement__StmtAssignment_4_3 )
            {
             before(grammarAccess.getTStatementAccess().getStmtAssignment_4_3()); 
            // InternalOberon.g:4383:2: ( rule__TStatement__StmtAssignment_4_3 )
            // InternalOberon.g:4383:3: rule__TStatement__StmtAssignment_4_3
            {
            pushFollow(FOLLOW_2);
            rule__TStatement__StmtAssignment_4_3();

            state._fsp--;


            }

             after(grammarAccess.getTStatementAccess().getStmtAssignment_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_4__3__Impl"


    // $ANTLR start "rule__TStatement__Group_4__4"
    // InternalOberon.g:4391:1: rule__TStatement__Group_4__4 : rule__TStatement__Group_4__4__Impl ;
    public final void rule__TStatement__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4395:1: ( rule__TStatement__Group_4__4__Impl )
            // InternalOberon.g:4396:2: rule__TStatement__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TStatement__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_4__4"


    // $ANTLR start "rule__TStatement__Group_4__4__Impl"
    // InternalOberon.g:4402:1: rule__TStatement__Group_4__4__Impl : ( 'END' ) ;
    public final void rule__TStatement__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4406:1: ( ( 'END' ) )
            // InternalOberon.g:4407:1: ( 'END' )
            {
            // InternalOberon.g:4407:1: ( 'END' )
            // InternalOberon.g:4408:2: 'END'
            {
             before(grammarAccess.getTStatementAccess().getENDKeyword_4_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTStatementAccess().getENDKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_4__4__Impl"


    // $ANTLR start "rule__TStatement__Group_5__0"
    // InternalOberon.g:4418:1: rule__TStatement__Group_5__0 : rule__TStatement__Group_5__0__Impl rule__TStatement__Group_5__1 ;
    public final void rule__TStatement__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4422:1: ( rule__TStatement__Group_5__0__Impl rule__TStatement__Group_5__1 )
            // InternalOberon.g:4423:2: rule__TStatement__Group_5__0__Impl rule__TStatement__Group_5__1
            {
            pushFollow(FOLLOW_36);
            rule__TStatement__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TStatement__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_5__0"


    // $ANTLR start "rule__TStatement__Group_5__0__Impl"
    // InternalOberon.g:4430:1: rule__TStatement__Group_5__0__Impl : ( 'REPEAT' ) ;
    public final void rule__TStatement__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4434:1: ( ( 'REPEAT' ) )
            // InternalOberon.g:4435:1: ( 'REPEAT' )
            {
            // InternalOberon.g:4435:1: ( 'REPEAT' )
            // InternalOberon.g:4436:2: 'REPEAT'
            {
             before(grammarAccess.getTStatementAccess().getREPEATKeyword_5_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getTStatementAccess().getREPEATKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_5__0__Impl"


    // $ANTLR start "rule__TStatement__Group_5__1"
    // InternalOberon.g:4445:1: rule__TStatement__Group_5__1 : rule__TStatement__Group_5__1__Impl rule__TStatement__Group_5__2 ;
    public final void rule__TStatement__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4449:1: ( rule__TStatement__Group_5__1__Impl rule__TStatement__Group_5__2 )
            // InternalOberon.g:4450:2: rule__TStatement__Group_5__1__Impl rule__TStatement__Group_5__2
            {
            pushFollow(FOLLOW_42);
            rule__TStatement__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TStatement__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_5__1"


    // $ANTLR start "rule__TStatement__Group_5__1__Impl"
    // InternalOberon.g:4457:1: rule__TStatement__Group_5__1__Impl : ( ( rule__TStatement__StmtAssignment_5_1 ) ) ;
    public final void rule__TStatement__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4461:1: ( ( ( rule__TStatement__StmtAssignment_5_1 ) ) )
            // InternalOberon.g:4462:1: ( ( rule__TStatement__StmtAssignment_5_1 ) )
            {
            // InternalOberon.g:4462:1: ( ( rule__TStatement__StmtAssignment_5_1 ) )
            // InternalOberon.g:4463:2: ( rule__TStatement__StmtAssignment_5_1 )
            {
             before(grammarAccess.getTStatementAccess().getStmtAssignment_5_1()); 
            // InternalOberon.g:4464:2: ( rule__TStatement__StmtAssignment_5_1 )
            // InternalOberon.g:4464:3: rule__TStatement__StmtAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__TStatement__StmtAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getTStatementAccess().getStmtAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_5__1__Impl"


    // $ANTLR start "rule__TStatement__Group_5__2"
    // InternalOberon.g:4472:1: rule__TStatement__Group_5__2 : rule__TStatement__Group_5__2__Impl rule__TStatement__Group_5__3 ;
    public final void rule__TStatement__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4476:1: ( rule__TStatement__Group_5__2__Impl rule__TStatement__Group_5__3 )
            // InternalOberon.g:4477:2: rule__TStatement__Group_5__2__Impl rule__TStatement__Group_5__3
            {
            pushFollow(FOLLOW_20);
            rule__TStatement__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TStatement__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_5__2"


    // $ANTLR start "rule__TStatement__Group_5__2__Impl"
    // InternalOberon.g:4484:1: rule__TStatement__Group_5__2__Impl : ( 'UNTIL' ) ;
    public final void rule__TStatement__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4488:1: ( ( 'UNTIL' ) )
            // InternalOberon.g:4489:1: ( 'UNTIL' )
            {
            // InternalOberon.g:4489:1: ( 'UNTIL' )
            // InternalOberon.g:4490:2: 'UNTIL'
            {
             before(grammarAccess.getTStatementAccess().getUNTILKeyword_5_2()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getTStatementAccess().getUNTILKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_5__2__Impl"


    // $ANTLR start "rule__TStatement__Group_5__3"
    // InternalOberon.g:4499:1: rule__TStatement__Group_5__3 : rule__TStatement__Group_5__3__Impl ;
    public final void rule__TStatement__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4503:1: ( rule__TStatement__Group_5__3__Impl )
            // InternalOberon.g:4504:2: rule__TStatement__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TStatement__Group_5__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_5__3"


    // $ANTLR start "rule__TStatement__Group_5__3__Impl"
    // InternalOberon.g:4510:1: rule__TStatement__Group_5__3__Impl : ( ( rule__TStatement__CondAssignment_5_3 ) ) ;
    public final void rule__TStatement__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4514:1: ( ( ( rule__TStatement__CondAssignment_5_3 ) ) )
            // InternalOberon.g:4515:1: ( ( rule__TStatement__CondAssignment_5_3 ) )
            {
            // InternalOberon.g:4515:1: ( ( rule__TStatement__CondAssignment_5_3 ) )
            // InternalOberon.g:4516:2: ( rule__TStatement__CondAssignment_5_3 )
            {
             before(grammarAccess.getTStatementAccess().getCondAssignment_5_3()); 
            // InternalOberon.g:4517:2: ( rule__TStatement__CondAssignment_5_3 )
            // InternalOberon.g:4517:3: rule__TStatement__CondAssignment_5_3
            {
            pushFollow(FOLLOW_2);
            rule__TStatement__CondAssignment_5_3();

            state._fsp--;


            }

             after(grammarAccess.getTStatementAccess().getCondAssignment_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_5__3__Impl"


    // $ANTLR start "rule__TStatement__Group_6__0"
    // InternalOberon.g:4526:1: rule__TStatement__Group_6__0 : rule__TStatement__Group_6__0__Impl rule__TStatement__Group_6__1 ;
    public final void rule__TStatement__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4530:1: ( rule__TStatement__Group_6__0__Impl rule__TStatement__Group_6__1 )
            // InternalOberon.g:4531:2: rule__TStatement__Group_6__0__Impl rule__TStatement__Group_6__1
            {
            pushFollow(FOLLOW_36);
            rule__TStatement__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TStatement__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_6__0"


    // $ANTLR start "rule__TStatement__Group_6__0__Impl"
    // InternalOberon.g:4538:1: rule__TStatement__Group_6__0__Impl : ( 'FOR' ) ;
    public final void rule__TStatement__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4542:1: ( ( 'FOR' ) )
            // InternalOberon.g:4543:1: ( 'FOR' )
            {
            // InternalOberon.g:4543:1: ( 'FOR' )
            // InternalOberon.g:4544:2: 'FOR'
            {
             before(grammarAccess.getTStatementAccess().getFORKeyword_6_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getTStatementAccess().getFORKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_6__0__Impl"


    // $ANTLR start "rule__TStatement__Group_6__1"
    // InternalOberon.g:4553:1: rule__TStatement__Group_6__1 : rule__TStatement__Group_6__1__Impl rule__TStatement__Group_6__2 ;
    public final void rule__TStatement__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4557:1: ( rule__TStatement__Group_6__1__Impl rule__TStatement__Group_6__2 )
            // InternalOberon.g:4558:2: rule__TStatement__Group_6__1__Impl rule__TStatement__Group_6__2
            {
            pushFollow(FOLLOW_43);
            rule__TStatement__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TStatement__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_6__1"


    // $ANTLR start "rule__TStatement__Group_6__1__Impl"
    // InternalOberon.g:4565:1: rule__TStatement__Group_6__1__Impl : ( ( rule__TStatement__InitAssignment_6_1 ) ) ;
    public final void rule__TStatement__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4569:1: ( ( ( rule__TStatement__InitAssignment_6_1 ) ) )
            // InternalOberon.g:4570:1: ( ( rule__TStatement__InitAssignment_6_1 ) )
            {
            // InternalOberon.g:4570:1: ( ( rule__TStatement__InitAssignment_6_1 ) )
            // InternalOberon.g:4571:2: ( rule__TStatement__InitAssignment_6_1 )
            {
             before(grammarAccess.getTStatementAccess().getInitAssignment_6_1()); 
            // InternalOberon.g:4572:2: ( rule__TStatement__InitAssignment_6_1 )
            // InternalOberon.g:4572:3: rule__TStatement__InitAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__TStatement__InitAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getTStatementAccess().getInitAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_6__1__Impl"


    // $ANTLR start "rule__TStatement__Group_6__2"
    // InternalOberon.g:4580:1: rule__TStatement__Group_6__2 : rule__TStatement__Group_6__2__Impl rule__TStatement__Group_6__3 ;
    public final void rule__TStatement__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4584:1: ( rule__TStatement__Group_6__2__Impl rule__TStatement__Group_6__3 )
            // InternalOberon.g:4585:2: rule__TStatement__Group_6__2__Impl rule__TStatement__Group_6__3
            {
            pushFollow(FOLLOW_20);
            rule__TStatement__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TStatement__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_6__2"


    // $ANTLR start "rule__TStatement__Group_6__2__Impl"
    // InternalOberon.g:4592:1: rule__TStatement__Group_6__2__Impl : ( 'TO' ) ;
    public final void rule__TStatement__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4596:1: ( ( 'TO' ) )
            // InternalOberon.g:4597:1: ( 'TO' )
            {
            // InternalOberon.g:4597:1: ( 'TO' )
            // InternalOberon.g:4598:2: 'TO'
            {
             before(grammarAccess.getTStatementAccess().getTOKeyword_6_2()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getTStatementAccess().getTOKeyword_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_6__2__Impl"


    // $ANTLR start "rule__TStatement__Group_6__3"
    // InternalOberon.g:4607:1: rule__TStatement__Group_6__3 : rule__TStatement__Group_6__3__Impl rule__TStatement__Group_6__4 ;
    public final void rule__TStatement__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4611:1: ( rule__TStatement__Group_6__3__Impl rule__TStatement__Group_6__4 )
            // InternalOberon.g:4612:2: rule__TStatement__Group_6__3__Impl rule__TStatement__Group_6__4
            {
            pushFollow(FOLLOW_41);
            rule__TStatement__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TStatement__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_6__3"


    // $ANTLR start "rule__TStatement__Group_6__3__Impl"
    // InternalOberon.g:4619:1: rule__TStatement__Group_6__3__Impl : ( ( rule__TStatement__ConditionAssignment_6_3 ) ) ;
    public final void rule__TStatement__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4623:1: ( ( ( rule__TStatement__ConditionAssignment_6_3 ) ) )
            // InternalOberon.g:4624:1: ( ( rule__TStatement__ConditionAssignment_6_3 ) )
            {
            // InternalOberon.g:4624:1: ( ( rule__TStatement__ConditionAssignment_6_3 ) )
            // InternalOberon.g:4625:2: ( rule__TStatement__ConditionAssignment_6_3 )
            {
             before(grammarAccess.getTStatementAccess().getConditionAssignment_6_3()); 
            // InternalOberon.g:4626:2: ( rule__TStatement__ConditionAssignment_6_3 )
            // InternalOberon.g:4626:3: rule__TStatement__ConditionAssignment_6_3
            {
            pushFollow(FOLLOW_2);
            rule__TStatement__ConditionAssignment_6_3();

            state._fsp--;


            }

             after(grammarAccess.getTStatementAccess().getConditionAssignment_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_6__3__Impl"


    // $ANTLR start "rule__TStatement__Group_6__4"
    // InternalOberon.g:4634:1: rule__TStatement__Group_6__4 : rule__TStatement__Group_6__4__Impl rule__TStatement__Group_6__5 ;
    public final void rule__TStatement__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4638:1: ( rule__TStatement__Group_6__4__Impl rule__TStatement__Group_6__5 )
            // InternalOberon.g:4639:2: rule__TStatement__Group_6__4__Impl rule__TStatement__Group_6__5
            {
            pushFollow(FOLLOW_36);
            rule__TStatement__Group_6__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TStatement__Group_6__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_6__4"


    // $ANTLR start "rule__TStatement__Group_6__4__Impl"
    // InternalOberon.g:4646:1: rule__TStatement__Group_6__4__Impl : ( 'DO' ) ;
    public final void rule__TStatement__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4650:1: ( ( 'DO' ) )
            // InternalOberon.g:4651:1: ( 'DO' )
            {
            // InternalOberon.g:4651:1: ( 'DO' )
            // InternalOberon.g:4652:2: 'DO'
            {
             before(grammarAccess.getTStatementAccess().getDOKeyword_6_4()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getTStatementAccess().getDOKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_6__4__Impl"


    // $ANTLR start "rule__TStatement__Group_6__5"
    // InternalOberon.g:4661:1: rule__TStatement__Group_6__5 : rule__TStatement__Group_6__5__Impl rule__TStatement__Group_6__6 ;
    public final void rule__TStatement__Group_6__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4665:1: ( rule__TStatement__Group_6__5__Impl rule__TStatement__Group_6__6 )
            // InternalOberon.g:4666:2: rule__TStatement__Group_6__5__Impl rule__TStatement__Group_6__6
            {
            pushFollow(FOLLOW_19);
            rule__TStatement__Group_6__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TStatement__Group_6__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_6__5"


    // $ANTLR start "rule__TStatement__Group_6__5__Impl"
    // InternalOberon.g:4673:1: rule__TStatement__Group_6__5__Impl : ( ( rule__TStatement__StmtAssignment_6_5 ) ) ;
    public final void rule__TStatement__Group_6__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4677:1: ( ( ( rule__TStatement__StmtAssignment_6_5 ) ) )
            // InternalOberon.g:4678:1: ( ( rule__TStatement__StmtAssignment_6_5 ) )
            {
            // InternalOberon.g:4678:1: ( ( rule__TStatement__StmtAssignment_6_5 ) )
            // InternalOberon.g:4679:2: ( rule__TStatement__StmtAssignment_6_5 )
            {
             before(grammarAccess.getTStatementAccess().getStmtAssignment_6_5()); 
            // InternalOberon.g:4680:2: ( rule__TStatement__StmtAssignment_6_5 )
            // InternalOberon.g:4680:3: rule__TStatement__StmtAssignment_6_5
            {
            pushFollow(FOLLOW_2);
            rule__TStatement__StmtAssignment_6_5();

            state._fsp--;


            }

             after(grammarAccess.getTStatementAccess().getStmtAssignment_6_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_6__5__Impl"


    // $ANTLR start "rule__TStatement__Group_6__6"
    // InternalOberon.g:4688:1: rule__TStatement__Group_6__6 : rule__TStatement__Group_6__6__Impl ;
    public final void rule__TStatement__Group_6__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4692:1: ( rule__TStatement__Group_6__6__Impl )
            // InternalOberon.g:4693:2: rule__TStatement__Group_6__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TStatement__Group_6__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_6__6"


    // $ANTLR start "rule__TStatement__Group_6__6__Impl"
    // InternalOberon.g:4699:1: rule__TStatement__Group_6__6__Impl : ( 'END' ) ;
    public final void rule__TStatement__Group_6__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4703:1: ( ( 'END' ) )
            // InternalOberon.g:4704:1: ( 'END' )
            {
            // InternalOberon.g:4704:1: ( 'END' )
            // InternalOberon.g:4705:2: 'END'
            {
             before(grammarAccess.getTStatementAccess().getENDKeyword_6_6()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTStatementAccess().getENDKeyword_6_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_6__6__Impl"


    // $ANTLR start "rule__TStatement__Group_7__0"
    // InternalOberon.g:4715:1: rule__TStatement__Group_7__0 : rule__TStatement__Group_7__0__Impl rule__TStatement__Group_7__1 ;
    public final void rule__TStatement__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4719:1: ( rule__TStatement__Group_7__0__Impl rule__TStatement__Group_7__1 )
            // InternalOberon.g:4720:2: rule__TStatement__Group_7__0__Impl rule__TStatement__Group_7__1
            {
            pushFollow(FOLLOW_3);
            rule__TStatement__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TStatement__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_7__0"


    // $ANTLR start "rule__TStatement__Group_7__0__Impl"
    // InternalOberon.g:4727:1: rule__TStatement__Group_7__0__Impl : ( 'FOR' ) ;
    public final void rule__TStatement__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4731:1: ( ( 'FOR' ) )
            // InternalOberon.g:4732:1: ( 'FOR' )
            {
            // InternalOberon.g:4732:1: ( 'FOR' )
            // InternalOberon.g:4733:2: 'FOR'
            {
             before(grammarAccess.getTStatementAccess().getFORKeyword_7_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getTStatementAccess().getFORKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_7__0__Impl"


    // $ANTLR start "rule__TStatement__Group_7__1"
    // InternalOberon.g:4742:1: rule__TStatement__Group_7__1 : rule__TStatement__Group_7__1__Impl rule__TStatement__Group_7__2 ;
    public final void rule__TStatement__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4746:1: ( rule__TStatement__Group_7__1__Impl rule__TStatement__Group_7__2 )
            // InternalOberon.g:4747:2: rule__TStatement__Group_7__1__Impl rule__TStatement__Group_7__2
            {
            pushFollow(FOLLOW_44);
            rule__TStatement__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TStatement__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_7__1"


    // $ANTLR start "rule__TStatement__Group_7__1__Impl"
    // InternalOberon.g:4754:1: rule__TStatement__Group_7__1__Impl : ( ( rule__TStatement__VarAssignment_7_1 ) ) ;
    public final void rule__TStatement__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4758:1: ( ( ( rule__TStatement__VarAssignment_7_1 ) ) )
            // InternalOberon.g:4759:1: ( ( rule__TStatement__VarAssignment_7_1 ) )
            {
            // InternalOberon.g:4759:1: ( ( rule__TStatement__VarAssignment_7_1 ) )
            // InternalOberon.g:4760:2: ( rule__TStatement__VarAssignment_7_1 )
            {
             before(grammarAccess.getTStatementAccess().getVarAssignment_7_1()); 
            // InternalOberon.g:4761:2: ( rule__TStatement__VarAssignment_7_1 )
            // InternalOberon.g:4761:3: rule__TStatement__VarAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__TStatement__VarAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getTStatementAccess().getVarAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_7__1__Impl"


    // $ANTLR start "rule__TStatement__Group_7__2"
    // InternalOberon.g:4769:1: rule__TStatement__Group_7__2 : rule__TStatement__Group_7__2__Impl rule__TStatement__Group_7__3 ;
    public final void rule__TStatement__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4773:1: ( rule__TStatement__Group_7__2__Impl rule__TStatement__Group_7__3 )
            // InternalOberon.g:4774:2: rule__TStatement__Group_7__2__Impl rule__TStatement__Group_7__3
            {
            pushFollow(FOLLOW_20);
            rule__TStatement__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TStatement__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_7__2"


    // $ANTLR start "rule__TStatement__Group_7__2__Impl"
    // InternalOberon.g:4781:1: rule__TStatement__Group_7__2__Impl : ( 'IN' ) ;
    public final void rule__TStatement__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4785:1: ( ( 'IN' ) )
            // InternalOberon.g:4786:1: ( 'IN' )
            {
            // InternalOberon.g:4786:1: ( 'IN' )
            // InternalOberon.g:4787:2: 'IN'
            {
             before(grammarAccess.getTStatementAccess().getINKeyword_7_2()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getTStatementAccess().getINKeyword_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_7__2__Impl"


    // $ANTLR start "rule__TStatement__Group_7__3"
    // InternalOberon.g:4796:1: rule__TStatement__Group_7__3 : rule__TStatement__Group_7__3__Impl rule__TStatement__Group_7__4 ;
    public final void rule__TStatement__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4800:1: ( rule__TStatement__Group_7__3__Impl rule__TStatement__Group_7__4 )
            // InternalOberon.g:4801:2: rule__TStatement__Group_7__3__Impl rule__TStatement__Group_7__4
            {
            pushFollow(FOLLOW_45);
            rule__TStatement__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TStatement__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_7__3"


    // $ANTLR start "rule__TStatement__Group_7__3__Impl"
    // InternalOberon.g:4808:1: rule__TStatement__Group_7__3__Impl : ( ( rule__TStatement__MinAssignment_7_3 ) ) ;
    public final void rule__TStatement__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4812:1: ( ( ( rule__TStatement__MinAssignment_7_3 ) ) )
            // InternalOberon.g:4813:1: ( ( rule__TStatement__MinAssignment_7_3 ) )
            {
            // InternalOberon.g:4813:1: ( ( rule__TStatement__MinAssignment_7_3 ) )
            // InternalOberon.g:4814:2: ( rule__TStatement__MinAssignment_7_3 )
            {
             before(grammarAccess.getTStatementAccess().getMinAssignment_7_3()); 
            // InternalOberon.g:4815:2: ( rule__TStatement__MinAssignment_7_3 )
            // InternalOberon.g:4815:3: rule__TStatement__MinAssignment_7_3
            {
            pushFollow(FOLLOW_2);
            rule__TStatement__MinAssignment_7_3();

            state._fsp--;


            }

             after(grammarAccess.getTStatementAccess().getMinAssignment_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_7__3__Impl"


    // $ANTLR start "rule__TStatement__Group_7__4"
    // InternalOberon.g:4823:1: rule__TStatement__Group_7__4 : rule__TStatement__Group_7__4__Impl rule__TStatement__Group_7__5 ;
    public final void rule__TStatement__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4827:1: ( rule__TStatement__Group_7__4__Impl rule__TStatement__Group_7__5 )
            // InternalOberon.g:4828:2: rule__TStatement__Group_7__4__Impl rule__TStatement__Group_7__5
            {
            pushFollow(FOLLOW_20);
            rule__TStatement__Group_7__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TStatement__Group_7__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_7__4"


    // $ANTLR start "rule__TStatement__Group_7__4__Impl"
    // InternalOberon.g:4835:1: rule__TStatement__Group_7__4__Impl : ( '..' ) ;
    public final void rule__TStatement__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4839:1: ( ( '..' ) )
            // InternalOberon.g:4840:1: ( '..' )
            {
            // InternalOberon.g:4840:1: ( '..' )
            // InternalOberon.g:4841:2: '..'
            {
             before(grammarAccess.getTStatementAccess().getFullStopFullStopKeyword_7_4()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getTStatementAccess().getFullStopFullStopKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_7__4__Impl"


    // $ANTLR start "rule__TStatement__Group_7__5"
    // InternalOberon.g:4850:1: rule__TStatement__Group_7__5 : rule__TStatement__Group_7__5__Impl rule__TStatement__Group_7__6 ;
    public final void rule__TStatement__Group_7__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4854:1: ( rule__TStatement__Group_7__5__Impl rule__TStatement__Group_7__6 )
            // InternalOberon.g:4855:2: rule__TStatement__Group_7__5__Impl rule__TStatement__Group_7__6
            {
            pushFollow(FOLLOW_41);
            rule__TStatement__Group_7__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TStatement__Group_7__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_7__5"


    // $ANTLR start "rule__TStatement__Group_7__5__Impl"
    // InternalOberon.g:4862:1: rule__TStatement__Group_7__5__Impl : ( ( rule__TStatement__MaxAssignment_7_5 ) ) ;
    public final void rule__TStatement__Group_7__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4866:1: ( ( ( rule__TStatement__MaxAssignment_7_5 ) ) )
            // InternalOberon.g:4867:1: ( ( rule__TStatement__MaxAssignment_7_5 ) )
            {
            // InternalOberon.g:4867:1: ( ( rule__TStatement__MaxAssignment_7_5 ) )
            // InternalOberon.g:4868:2: ( rule__TStatement__MaxAssignment_7_5 )
            {
             before(grammarAccess.getTStatementAccess().getMaxAssignment_7_5()); 
            // InternalOberon.g:4869:2: ( rule__TStatement__MaxAssignment_7_5 )
            // InternalOberon.g:4869:3: rule__TStatement__MaxAssignment_7_5
            {
            pushFollow(FOLLOW_2);
            rule__TStatement__MaxAssignment_7_5();

            state._fsp--;


            }

             after(grammarAccess.getTStatementAccess().getMaxAssignment_7_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_7__5__Impl"


    // $ANTLR start "rule__TStatement__Group_7__6"
    // InternalOberon.g:4877:1: rule__TStatement__Group_7__6 : rule__TStatement__Group_7__6__Impl rule__TStatement__Group_7__7 ;
    public final void rule__TStatement__Group_7__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4881:1: ( rule__TStatement__Group_7__6__Impl rule__TStatement__Group_7__7 )
            // InternalOberon.g:4882:2: rule__TStatement__Group_7__6__Impl rule__TStatement__Group_7__7
            {
            pushFollow(FOLLOW_36);
            rule__TStatement__Group_7__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TStatement__Group_7__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_7__6"


    // $ANTLR start "rule__TStatement__Group_7__6__Impl"
    // InternalOberon.g:4889:1: rule__TStatement__Group_7__6__Impl : ( 'DO' ) ;
    public final void rule__TStatement__Group_7__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4893:1: ( ( 'DO' ) )
            // InternalOberon.g:4894:1: ( 'DO' )
            {
            // InternalOberon.g:4894:1: ( 'DO' )
            // InternalOberon.g:4895:2: 'DO'
            {
             before(grammarAccess.getTStatementAccess().getDOKeyword_7_6()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getTStatementAccess().getDOKeyword_7_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_7__6__Impl"


    // $ANTLR start "rule__TStatement__Group_7__7"
    // InternalOberon.g:4904:1: rule__TStatement__Group_7__7 : rule__TStatement__Group_7__7__Impl rule__TStatement__Group_7__8 ;
    public final void rule__TStatement__Group_7__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4908:1: ( rule__TStatement__Group_7__7__Impl rule__TStatement__Group_7__8 )
            // InternalOberon.g:4909:2: rule__TStatement__Group_7__7__Impl rule__TStatement__Group_7__8
            {
            pushFollow(FOLLOW_19);
            rule__TStatement__Group_7__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TStatement__Group_7__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_7__7"


    // $ANTLR start "rule__TStatement__Group_7__7__Impl"
    // InternalOberon.g:4916:1: rule__TStatement__Group_7__7__Impl : ( ( rule__TStatement__StmtAssignment_7_7 ) ) ;
    public final void rule__TStatement__Group_7__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4920:1: ( ( ( rule__TStatement__StmtAssignment_7_7 ) ) )
            // InternalOberon.g:4921:1: ( ( rule__TStatement__StmtAssignment_7_7 ) )
            {
            // InternalOberon.g:4921:1: ( ( rule__TStatement__StmtAssignment_7_7 ) )
            // InternalOberon.g:4922:2: ( rule__TStatement__StmtAssignment_7_7 )
            {
             before(grammarAccess.getTStatementAccess().getStmtAssignment_7_7()); 
            // InternalOberon.g:4923:2: ( rule__TStatement__StmtAssignment_7_7 )
            // InternalOberon.g:4923:3: rule__TStatement__StmtAssignment_7_7
            {
            pushFollow(FOLLOW_2);
            rule__TStatement__StmtAssignment_7_7();

            state._fsp--;


            }

             after(grammarAccess.getTStatementAccess().getStmtAssignment_7_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_7__7__Impl"


    // $ANTLR start "rule__TStatement__Group_7__8"
    // InternalOberon.g:4931:1: rule__TStatement__Group_7__8 : rule__TStatement__Group_7__8__Impl ;
    public final void rule__TStatement__Group_7__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4935:1: ( rule__TStatement__Group_7__8__Impl )
            // InternalOberon.g:4936:2: rule__TStatement__Group_7__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TStatement__Group_7__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_7__8"


    // $ANTLR start "rule__TStatement__Group_7__8__Impl"
    // InternalOberon.g:4942:1: rule__TStatement__Group_7__8__Impl : ( 'END' ) ;
    public final void rule__TStatement__Group_7__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4946:1: ( ( 'END' ) )
            // InternalOberon.g:4947:1: ( 'END' )
            {
            // InternalOberon.g:4947:1: ( 'END' )
            // InternalOberon.g:4948:2: 'END'
            {
             before(grammarAccess.getTStatementAccess().getENDKeyword_7_8()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTStatementAccess().getENDKeyword_7_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_7__8__Impl"


    // $ANTLR start "rule__TStatement__Group_8__0"
    // InternalOberon.g:4958:1: rule__TStatement__Group_8__0 : rule__TStatement__Group_8__0__Impl rule__TStatement__Group_8__1 ;
    public final void rule__TStatement__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4962:1: ( rule__TStatement__Group_8__0__Impl rule__TStatement__Group_8__1 )
            // InternalOberon.g:4963:2: rule__TStatement__Group_8__0__Impl rule__TStatement__Group_8__1
            {
            pushFollow(FOLLOW_36);
            rule__TStatement__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TStatement__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_8__0"


    // $ANTLR start "rule__TStatement__Group_8__0__Impl"
    // InternalOberon.g:4970:1: rule__TStatement__Group_8__0__Impl : ( 'LOOP' ) ;
    public final void rule__TStatement__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4974:1: ( ( 'LOOP' ) )
            // InternalOberon.g:4975:1: ( 'LOOP' )
            {
            // InternalOberon.g:4975:1: ( 'LOOP' )
            // InternalOberon.g:4976:2: 'LOOP'
            {
             before(grammarAccess.getTStatementAccess().getLOOPKeyword_8_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getTStatementAccess().getLOOPKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_8__0__Impl"


    // $ANTLR start "rule__TStatement__Group_8__1"
    // InternalOberon.g:4985:1: rule__TStatement__Group_8__1 : rule__TStatement__Group_8__1__Impl rule__TStatement__Group_8__2 ;
    public final void rule__TStatement__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:4989:1: ( rule__TStatement__Group_8__1__Impl rule__TStatement__Group_8__2 )
            // InternalOberon.g:4990:2: rule__TStatement__Group_8__1__Impl rule__TStatement__Group_8__2
            {
            pushFollow(FOLLOW_19);
            rule__TStatement__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TStatement__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_8__1"


    // $ANTLR start "rule__TStatement__Group_8__1__Impl"
    // InternalOberon.g:4997:1: rule__TStatement__Group_8__1__Impl : ( ( rule__TStatement__StmtAssignment_8_1 ) ) ;
    public final void rule__TStatement__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5001:1: ( ( ( rule__TStatement__StmtAssignment_8_1 ) ) )
            // InternalOberon.g:5002:1: ( ( rule__TStatement__StmtAssignment_8_1 ) )
            {
            // InternalOberon.g:5002:1: ( ( rule__TStatement__StmtAssignment_8_1 ) )
            // InternalOberon.g:5003:2: ( rule__TStatement__StmtAssignment_8_1 )
            {
             before(grammarAccess.getTStatementAccess().getStmtAssignment_8_1()); 
            // InternalOberon.g:5004:2: ( rule__TStatement__StmtAssignment_8_1 )
            // InternalOberon.g:5004:3: rule__TStatement__StmtAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__TStatement__StmtAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getTStatementAccess().getStmtAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_8__1__Impl"


    // $ANTLR start "rule__TStatement__Group_8__2"
    // InternalOberon.g:5012:1: rule__TStatement__Group_8__2 : rule__TStatement__Group_8__2__Impl ;
    public final void rule__TStatement__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5016:1: ( rule__TStatement__Group_8__2__Impl )
            // InternalOberon.g:5017:2: rule__TStatement__Group_8__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TStatement__Group_8__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_8__2"


    // $ANTLR start "rule__TStatement__Group_8__2__Impl"
    // InternalOberon.g:5023:1: rule__TStatement__Group_8__2__Impl : ( 'END' ) ;
    public final void rule__TStatement__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5027:1: ( ( 'END' ) )
            // InternalOberon.g:5028:1: ( 'END' )
            {
            // InternalOberon.g:5028:1: ( 'END' )
            // InternalOberon.g:5029:2: 'END'
            {
             before(grammarAccess.getTStatementAccess().getENDKeyword_8_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTStatementAccess().getENDKeyword_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_8__2__Impl"


    // $ANTLR start "rule__TStatement__Group_9__0"
    // InternalOberon.g:5039:1: rule__TStatement__Group_9__0 : rule__TStatement__Group_9__0__Impl rule__TStatement__Group_9__1 ;
    public final void rule__TStatement__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5043:1: ( rule__TStatement__Group_9__0__Impl rule__TStatement__Group_9__1 )
            // InternalOberon.g:5044:2: rule__TStatement__Group_9__0__Impl rule__TStatement__Group_9__1
            {
            pushFollow(FOLLOW_20);
            rule__TStatement__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TStatement__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_9__0"


    // $ANTLR start "rule__TStatement__Group_9__0__Impl"
    // InternalOberon.g:5051:1: rule__TStatement__Group_9__0__Impl : ( 'RETURN' ) ;
    public final void rule__TStatement__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5055:1: ( ( 'RETURN' ) )
            // InternalOberon.g:5056:1: ( 'RETURN' )
            {
            // InternalOberon.g:5056:1: ( 'RETURN' )
            // InternalOberon.g:5057:2: 'RETURN'
            {
             before(grammarAccess.getTStatementAccess().getRETURNKeyword_9_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getTStatementAccess().getRETURNKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_9__0__Impl"


    // $ANTLR start "rule__TStatement__Group_9__1"
    // InternalOberon.g:5066:1: rule__TStatement__Group_9__1 : rule__TStatement__Group_9__1__Impl ;
    public final void rule__TStatement__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5070:1: ( rule__TStatement__Group_9__1__Impl )
            // InternalOberon.g:5071:2: rule__TStatement__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TStatement__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_9__1"


    // $ANTLR start "rule__TStatement__Group_9__1__Impl"
    // InternalOberon.g:5077:1: rule__TStatement__Group_9__1__Impl : ( ( rule__TStatement__ExpAssignment_9_1 ) ) ;
    public final void rule__TStatement__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5081:1: ( ( ( rule__TStatement__ExpAssignment_9_1 ) ) )
            // InternalOberon.g:5082:1: ( ( rule__TStatement__ExpAssignment_9_1 ) )
            {
            // InternalOberon.g:5082:1: ( ( rule__TStatement__ExpAssignment_9_1 ) )
            // InternalOberon.g:5083:2: ( rule__TStatement__ExpAssignment_9_1 )
            {
             before(grammarAccess.getTStatementAccess().getExpAssignment_9_1()); 
            // InternalOberon.g:5084:2: ( rule__TStatement__ExpAssignment_9_1 )
            // InternalOberon.g:5084:3: rule__TStatement__ExpAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__TStatement__ExpAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getTStatementAccess().getExpAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_9__1__Impl"


    // $ANTLR start "rule__TStatement__Group_10__0"
    // InternalOberon.g:5093:1: rule__TStatement__Group_10__0 : rule__TStatement__Group_10__0__Impl rule__TStatement__Group_10__1 ;
    public final void rule__TStatement__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5097:1: ( rule__TStatement__Group_10__0__Impl rule__TStatement__Group_10__1 )
            // InternalOberon.g:5098:2: rule__TStatement__Group_10__0__Impl rule__TStatement__Group_10__1
            {
            pushFollow(FOLLOW_20);
            rule__TStatement__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TStatement__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_10__0"


    // $ANTLR start "rule__TStatement__Group_10__0__Impl"
    // InternalOberon.g:5105:1: rule__TStatement__Group_10__0__Impl : ( 'CASE' ) ;
    public final void rule__TStatement__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5109:1: ( ( 'CASE' ) )
            // InternalOberon.g:5110:1: ( 'CASE' )
            {
            // InternalOberon.g:5110:1: ( 'CASE' )
            // InternalOberon.g:5111:2: 'CASE'
            {
             before(grammarAccess.getTStatementAccess().getCASEKeyword_10_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getTStatementAccess().getCASEKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_10__0__Impl"


    // $ANTLR start "rule__TStatement__Group_10__1"
    // InternalOberon.g:5120:1: rule__TStatement__Group_10__1 : rule__TStatement__Group_10__1__Impl rule__TStatement__Group_10__2 ;
    public final void rule__TStatement__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5124:1: ( rule__TStatement__Group_10__1__Impl rule__TStatement__Group_10__2 )
            // InternalOberon.g:5125:2: rule__TStatement__Group_10__1__Impl rule__TStatement__Group_10__2
            {
            pushFollow(FOLLOW_16);
            rule__TStatement__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TStatement__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_10__1"


    // $ANTLR start "rule__TStatement__Group_10__1__Impl"
    // InternalOberon.g:5132:1: rule__TStatement__Group_10__1__Impl : ( ( rule__TStatement__ExpAssignment_10_1 ) ) ;
    public final void rule__TStatement__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5136:1: ( ( ( rule__TStatement__ExpAssignment_10_1 ) ) )
            // InternalOberon.g:5137:1: ( ( rule__TStatement__ExpAssignment_10_1 ) )
            {
            // InternalOberon.g:5137:1: ( ( rule__TStatement__ExpAssignment_10_1 ) )
            // InternalOberon.g:5138:2: ( rule__TStatement__ExpAssignment_10_1 )
            {
             before(grammarAccess.getTStatementAccess().getExpAssignment_10_1()); 
            // InternalOberon.g:5139:2: ( rule__TStatement__ExpAssignment_10_1 )
            // InternalOberon.g:5139:3: rule__TStatement__ExpAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__TStatement__ExpAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getTStatementAccess().getExpAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_10__1__Impl"


    // $ANTLR start "rule__TStatement__Group_10__2"
    // InternalOberon.g:5147:1: rule__TStatement__Group_10__2 : rule__TStatement__Group_10__2__Impl rule__TStatement__Group_10__3 ;
    public final void rule__TStatement__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5151:1: ( rule__TStatement__Group_10__2__Impl rule__TStatement__Group_10__3 )
            // InternalOberon.g:5152:2: rule__TStatement__Group_10__2__Impl rule__TStatement__Group_10__3
            {
            pushFollow(FOLLOW_20);
            rule__TStatement__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TStatement__Group_10__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_10__2"


    // $ANTLR start "rule__TStatement__Group_10__2__Impl"
    // InternalOberon.g:5159:1: rule__TStatement__Group_10__2__Impl : ( 'OF' ) ;
    public final void rule__TStatement__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5163:1: ( ( 'OF' ) )
            // InternalOberon.g:5164:1: ( 'OF' )
            {
            // InternalOberon.g:5164:1: ( 'OF' )
            // InternalOberon.g:5165:2: 'OF'
            {
             before(grammarAccess.getTStatementAccess().getOFKeyword_10_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getTStatementAccess().getOFKeyword_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_10__2__Impl"


    // $ANTLR start "rule__TStatement__Group_10__3"
    // InternalOberon.g:5174:1: rule__TStatement__Group_10__3 : rule__TStatement__Group_10__3__Impl rule__TStatement__Group_10__4 ;
    public final void rule__TStatement__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5178:1: ( rule__TStatement__Group_10__3__Impl rule__TStatement__Group_10__4 )
            // InternalOberon.g:5179:2: rule__TStatement__Group_10__3__Impl rule__TStatement__Group_10__4
            {
            pushFollow(FOLLOW_46);
            rule__TStatement__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TStatement__Group_10__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_10__3"


    // $ANTLR start "rule__TStatement__Group_10__3__Impl"
    // InternalOberon.g:5186:1: rule__TStatement__Group_10__3__Impl : ( ( rule__TStatement__CaseAssignment_10_3 ) ) ;
    public final void rule__TStatement__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5190:1: ( ( ( rule__TStatement__CaseAssignment_10_3 ) ) )
            // InternalOberon.g:5191:1: ( ( rule__TStatement__CaseAssignment_10_3 ) )
            {
            // InternalOberon.g:5191:1: ( ( rule__TStatement__CaseAssignment_10_3 ) )
            // InternalOberon.g:5192:2: ( rule__TStatement__CaseAssignment_10_3 )
            {
             before(grammarAccess.getTStatementAccess().getCaseAssignment_10_3()); 
            // InternalOberon.g:5193:2: ( rule__TStatement__CaseAssignment_10_3 )
            // InternalOberon.g:5193:3: rule__TStatement__CaseAssignment_10_3
            {
            pushFollow(FOLLOW_2);
            rule__TStatement__CaseAssignment_10_3();

            state._fsp--;


            }

             after(grammarAccess.getTStatementAccess().getCaseAssignment_10_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_10__3__Impl"


    // $ANTLR start "rule__TStatement__Group_10__4"
    // InternalOberon.g:5201:1: rule__TStatement__Group_10__4 : rule__TStatement__Group_10__4__Impl rule__TStatement__Group_10__5 ;
    public final void rule__TStatement__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5205:1: ( rule__TStatement__Group_10__4__Impl rule__TStatement__Group_10__5 )
            // InternalOberon.g:5206:2: rule__TStatement__Group_10__4__Impl rule__TStatement__Group_10__5
            {
            pushFollow(FOLLOW_46);
            rule__TStatement__Group_10__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TStatement__Group_10__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_10__4"


    // $ANTLR start "rule__TStatement__Group_10__4__Impl"
    // InternalOberon.g:5213:1: rule__TStatement__Group_10__4__Impl : ( ( rule__TStatement__Group_10_4__0 )* ) ;
    public final void rule__TStatement__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5217:1: ( ( ( rule__TStatement__Group_10_4__0 )* ) )
            // InternalOberon.g:5218:1: ( ( rule__TStatement__Group_10_4__0 )* )
            {
            // InternalOberon.g:5218:1: ( ( rule__TStatement__Group_10_4__0 )* )
            // InternalOberon.g:5219:2: ( rule__TStatement__Group_10_4__0 )*
            {
             before(grammarAccess.getTStatementAccess().getGroup_10_4()); 
            // InternalOberon.g:5220:2: ( rule__TStatement__Group_10_4__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==61) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalOberon.g:5220:3: rule__TStatement__Group_10_4__0
            	    {
            	    pushFollow(FOLLOW_47);
            	    rule__TStatement__Group_10_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getTStatementAccess().getGroup_10_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_10__4__Impl"


    // $ANTLR start "rule__TStatement__Group_10__5"
    // InternalOberon.g:5228:1: rule__TStatement__Group_10__5 : rule__TStatement__Group_10__5__Impl rule__TStatement__Group_10__6 ;
    public final void rule__TStatement__Group_10__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5232:1: ( rule__TStatement__Group_10__5__Impl rule__TStatement__Group_10__6 )
            // InternalOberon.g:5233:2: rule__TStatement__Group_10__5__Impl rule__TStatement__Group_10__6
            {
            pushFollow(FOLLOW_46);
            rule__TStatement__Group_10__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TStatement__Group_10__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_10__5"


    // $ANTLR start "rule__TStatement__Group_10__5__Impl"
    // InternalOberon.g:5240:1: rule__TStatement__Group_10__5__Impl : ( ( rule__TStatement__Group_10_5__0 )? ) ;
    public final void rule__TStatement__Group_10__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5244:1: ( ( ( rule__TStatement__Group_10_5__0 )? ) )
            // InternalOberon.g:5245:1: ( ( rule__TStatement__Group_10_5__0 )? )
            {
            // InternalOberon.g:5245:1: ( ( rule__TStatement__Group_10_5__0 )? )
            // InternalOberon.g:5246:2: ( rule__TStatement__Group_10_5__0 )?
            {
             before(grammarAccess.getTStatementAccess().getGroup_10_5()); 
            // InternalOberon.g:5247:2: ( rule__TStatement__Group_10_5__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==49) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalOberon.g:5247:3: rule__TStatement__Group_10_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TStatement__Group_10_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTStatementAccess().getGroup_10_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_10__5__Impl"


    // $ANTLR start "rule__TStatement__Group_10__6"
    // InternalOberon.g:5255:1: rule__TStatement__Group_10__6 : rule__TStatement__Group_10__6__Impl ;
    public final void rule__TStatement__Group_10__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5259:1: ( rule__TStatement__Group_10__6__Impl )
            // InternalOberon.g:5260:2: rule__TStatement__Group_10__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TStatement__Group_10__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_10__6"


    // $ANTLR start "rule__TStatement__Group_10__6__Impl"
    // InternalOberon.g:5266:1: rule__TStatement__Group_10__6__Impl : ( 'END' ) ;
    public final void rule__TStatement__Group_10__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5270:1: ( ( 'END' ) )
            // InternalOberon.g:5271:1: ( 'END' )
            {
            // InternalOberon.g:5271:1: ( 'END' )
            // InternalOberon.g:5272:2: 'END'
            {
             before(grammarAccess.getTStatementAccess().getENDKeyword_10_6()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTStatementAccess().getENDKeyword_10_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_10__6__Impl"


    // $ANTLR start "rule__TStatement__Group_10_4__0"
    // InternalOberon.g:5282:1: rule__TStatement__Group_10_4__0 : rule__TStatement__Group_10_4__0__Impl rule__TStatement__Group_10_4__1 ;
    public final void rule__TStatement__Group_10_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5286:1: ( rule__TStatement__Group_10_4__0__Impl rule__TStatement__Group_10_4__1 )
            // InternalOberon.g:5287:2: rule__TStatement__Group_10_4__0__Impl rule__TStatement__Group_10_4__1
            {
            pushFollow(FOLLOW_20);
            rule__TStatement__Group_10_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TStatement__Group_10_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_10_4__0"


    // $ANTLR start "rule__TStatement__Group_10_4__0__Impl"
    // InternalOberon.g:5294:1: rule__TStatement__Group_10_4__0__Impl : ( '|' ) ;
    public final void rule__TStatement__Group_10_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5298:1: ( ( '|' ) )
            // InternalOberon.g:5299:1: ( '|' )
            {
            // InternalOberon.g:5299:1: ( '|' )
            // InternalOberon.g:5300:2: '|'
            {
             before(grammarAccess.getTStatementAccess().getVerticalLineKeyword_10_4_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getTStatementAccess().getVerticalLineKeyword_10_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_10_4__0__Impl"


    // $ANTLR start "rule__TStatement__Group_10_4__1"
    // InternalOberon.g:5309:1: rule__TStatement__Group_10_4__1 : rule__TStatement__Group_10_4__1__Impl ;
    public final void rule__TStatement__Group_10_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5313:1: ( rule__TStatement__Group_10_4__1__Impl )
            // InternalOberon.g:5314:2: rule__TStatement__Group_10_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TStatement__Group_10_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_10_4__1"


    // $ANTLR start "rule__TStatement__Group_10_4__1__Impl"
    // InternalOberon.g:5320:1: rule__TStatement__Group_10_4__1__Impl : ( ( rule__TStatement__CasesAssignment_10_4_1 ) ) ;
    public final void rule__TStatement__Group_10_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5324:1: ( ( ( rule__TStatement__CasesAssignment_10_4_1 ) ) )
            // InternalOberon.g:5325:1: ( ( rule__TStatement__CasesAssignment_10_4_1 ) )
            {
            // InternalOberon.g:5325:1: ( ( rule__TStatement__CasesAssignment_10_4_1 ) )
            // InternalOberon.g:5326:2: ( rule__TStatement__CasesAssignment_10_4_1 )
            {
             before(grammarAccess.getTStatementAccess().getCasesAssignment_10_4_1()); 
            // InternalOberon.g:5327:2: ( rule__TStatement__CasesAssignment_10_4_1 )
            // InternalOberon.g:5327:3: rule__TStatement__CasesAssignment_10_4_1
            {
            pushFollow(FOLLOW_2);
            rule__TStatement__CasesAssignment_10_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTStatementAccess().getCasesAssignment_10_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_10_4__1__Impl"


    // $ANTLR start "rule__TStatement__Group_10_5__0"
    // InternalOberon.g:5336:1: rule__TStatement__Group_10_5__0 : rule__TStatement__Group_10_5__0__Impl rule__TStatement__Group_10_5__1 ;
    public final void rule__TStatement__Group_10_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5340:1: ( rule__TStatement__Group_10_5__0__Impl rule__TStatement__Group_10_5__1 )
            // InternalOberon.g:5341:2: rule__TStatement__Group_10_5__0__Impl rule__TStatement__Group_10_5__1
            {
            pushFollow(FOLLOW_36);
            rule__TStatement__Group_10_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TStatement__Group_10_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_10_5__0"


    // $ANTLR start "rule__TStatement__Group_10_5__0__Impl"
    // InternalOberon.g:5348:1: rule__TStatement__Group_10_5__0__Impl : ( 'ELSE' ) ;
    public final void rule__TStatement__Group_10_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5352:1: ( ( 'ELSE' ) )
            // InternalOberon.g:5353:1: ( 'ELSE' )
            {
            // InternalOberon.g:5353:1: ( 'ELSE' )
            // InternalOberon.g:5354:2: 'ELSE'
            {
             before(grammarAccess.getTStatementAccess().getELSEKeyword_10_5_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getTStatementAccess().getELSEKeyword_10_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_10_5__0__Impl"


    // $ANTLR start "rule__TStatement__Group_10_5__1"
    // InternalOberon.g:5363:1: rule__TStatement__Group_10_5__1 : rule__TStatement__Group_10_5__1__Impl ;
    public final void rule__TStatement__Group_10_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5367:1: ( rule__TStatement__Group_10_5__1__Impl )
            // InternalOberon.g:5368:2: rule__TStatement__Group_10_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TStatement__Group_10_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_10_5__1"


    // $ANTLR start "rule__TStatement__Group_10_5__1__Impl"
    // InternalOberon.g:5374:1: rule__TStatement__Group_10_5__1__Impl : ( ( rule__TStatement__ElseStmtAssignment_10_5_1 ) ) ;
    public final void rule__TStatement__Group_10_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5378:1: ( ( ( rule__TStatement__ElseStmtAssignment_10_5_1 ) ) )
            // InternalOberon.g:5379:1: ( ( rule__TStatement__ElseStmtAssignment_10_5_1 ) )
            {
            // InternalOberon.g:5379:1: ( ( rule__TStatement__ElseStmtAssignment_10_5_1 ) )
            // InternalOberon.g:5380:2: ( rule__TStatement__ElseStmtAssignment_10_5_1 )
            {
             before(grammarAccess.getTStatementAccess().getElseStmtAssignment_10_5_1()); 
            // InternalOberon.g:5381:2: ( rule__TStatement__ElseStmtAssignment_10_5_1 )
            // InternalOberon.g:5381:3: rule__TStatement__ElseStmtAssignment_10_5_1
            {
            pushFollow(FOLLOW_2);
            rule__TStatement__ElseStmtAssignment_10_5_1();

            state._fsp--;


            }

             after(grammarAccess.getTStatementAccess().getElseStmtAssignment_10_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__Group_10_5__1__Impl"


    // $ANTLR start "rule__Designator__Group__0"
    // InternalOberon.g:5390:1: rule__Designator__Group__0 : rule__Designator__Group__0__Impl rule__Designator__Group__1 ;
    public final void rule__Designator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5394:1: ( rule__Designator__Group__0__Impl rule__Designator__Group__1 )
            // InternalOberon.g:5395:2: rule__Designator__Group__0__Impl rule__Designator__Group__1
            {
            pushFollow(FOLLOW_48);
            rule__Designator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Designator__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Designator__Group__0"


    // $ANTLR start "rule__Designator__Group__0__Impl"
    // InternalOberon.g:5402:1: rule__Designator__Group__0__Impl : ( ( rule__Designator__DesignatorAssignment_0 ) ) ;
    public final void rule__Designator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5406:1: ( ( ( rule__Designator__DesignatorAssignment_0 ) ) )
            // InternalOberon.g:5407:1: ( ( rule__Designator__DesignatorAssignment_0 ) )
            {
            // InternalOberon.g:5407:1: ( ( rule__Designator__DesignatorAssignment_0 ) )
            // InternalOberon.g:5408:2: ( rule__Designator__DesignatorAssignment_0 )
            {
             before(grammarAccess.getDesignatorAccess().getDesignatorAssignment_0()); 
            // InternalOberon.g:5409:2: ( rule__Designator__DesignatorAssignment_0 )
            // InternalOberon.g:5409:3: rule__Designator__DesignatorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Designator__DesignatorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDesignatorAccess().getDesignatorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Designator__Group__0__Impl"


    // $ANTLR start "rule__Designator__Group__1"
    // InternalOberon.g:5417:1: rule__Designator__Group__1 : rule__Designator__Group__1__Impl ;
    public final void rule__Designator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5421:1: ( rule__Designator__Group__1__Impl )
            // InternalOberon.g:5422:2: rule__Designator__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Designator__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Designator__Group__1"


    // $ANTLR start "rule__Designator__Group__1__Impl"
    // InternalOberon.g:5428:1: rule__Designator__Group__1__Impl : ( ( rule__Designator__Alternatives_1 )* ) ;
    public final void rule__Designator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5432:1: ( ( ( rule__Designator__Alternatives_1 )* ) )
            // InternalOberon.g:5433:1: ( ( rule__Designator__Alternatives_1 )* )
            {
            // InternalOberon.g:5433:1: ( ( rule__Designator__Alternatives_1 )* )
            // InternalOberon.g:5434:2: ( rule__Designator__Alternatives_1 )*
            {
             before(grammarAccess.getDesignatorAccess().getAlternatives_1()); 
            // InternalOberon.g:5435:2: ( rule__Designator__Alternatives_1 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==28||LA38_0==41) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalOberon.g:5435:3: rule__Designator__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_49);
            	    rule__Designator__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getDesignatorAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Designator__Group__1__Impl"


    // $ANTLR start "rule__Designator__Group_1_0__0"
    // InternalOberon.g:5444:1: rule__Designator__Group_1_0__0 : rule__Designator__Group_1_0__0__Impl rule__Designator__Group_1_0__1 ;
    public final void rule__Designator__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5448:1: ( rule__Designator__Group_1_0__0__Impl rule__Designator__Group_1_0__1 )
            // InternalOberon.g:5449:2: rule__Designator__Group_1_0__0__Impl rule__Designator__Group_1_0__1
            {
            pushFollow(FOLLOW_20);
            rule__Designator__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Designator__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Designator__Group_1_0__0"


    // $ANTLR start "rule__Designator__Group_1_0__0__Impl"
    // InternalOberon.g:5456:1: rule__Designator__Group_1_0__0__Impl : ( '[' ) ;
    public final void rule__Designator__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5460:1: ( ( '[' ) )
            // InternalOberon.g:5461:1: ( '[' )
            {
            // InternalOberon.g:5461:1: ( '[' )
            // InternalOberon.g:5462:2: '['
            {
             before(grammarAccess.getDesignatorAccess().getLeftSquareBracketKeyword_1_0_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getDesignatorAccess().getLeftSquareBracketKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Designator__Group_1_0__0__Impl"


    // $ANTLR start "rule__Designator__Group_1_0__1"
    // InternalOberon.g:5471:1: rule__Designator__Group_1_0__1 : rule__Designator__Group_1_0__1__Impl rule__Designator__Group_1_0__2 ;
    public final void rule__Designator__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5475:1: ( rule__Designator__Group_1_0__1__Impl rule__Designator__Group_1_0__2 )
            // InternalOberon.g:5476:2: rule__Designator__Group_1_0__1__Impl rule__Designator__Group_1_0__2
            {
            pushFollow(FOLLOW_34);
            rule__Designator__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Designator__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Designator__Group_1_0__1"


    // $ANTLR start "rule__Designator__Group_1_0__1__Impl"
    // InternalOberon.g:5483:1: rule__Designator__Group_1_0__1__Impl : ( ( rule__Designator__IndexesAssignment_1_0_1 ) ) ;
    public final void rule__Designator__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5487:1: ( ( ( rule__Designator__IndexesAssignment_1_0_1 ) ) )
            // InternalOberon.g:5488:1: ( ( rule__Designator__IndexesAssignment_1_0_1 ) )
            {
            // InternalOberon.g:5488:1: ( ( rule__Designator__IndexesAssignment_1_0_1 ) )
            // InternalOberon.g:5489:2: ( rule__Designator__IndexesAssignment_1_0_1 )
            {
             before(grammarAccess.getDesignatorAccess().getIndexesAssignment_1_0_1()); 
            // InternalOberon.g:5490:2: ( rule__Designator__IndexesAssignment_1_0_1 )
            // InternalOberon.g:5490:3: rule__Designator__IndexesAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Designator__IndexesAssignment_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getDesignatorAccess().getIndexesAssignment_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Designator__Group_1_0__1__Impl"


    // $ANTLR start "rule__Designator__Group_1_0__2"
    // InternalOberon.g:5498:1: rule__Designator__Group_1_0__2 : rule__Designator__Group_1_0__2__Impl ;
    public final void rule__Designator__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5502:1: ( rule__Designator__Group_1_0__2__Impl )
            // InternalOberon.g:5503:2: rule__Designator__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Designator__Group_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Designator__Group_1_0__2"


    // $ANTLR start "rule__Designator__Group_1_0__2__Impl"
    // InternalOberon.g:5509:1: rule__Designator__Group_1_0__2__Impl : ( ']' ) ;
    public final void rule__Designator__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5513:1: ( ( ']' ) )
            // InternalOberon.g:5514:1: ( ']' )
            {
            // InternalOberon.g:5514:1: ( ']' )
            // InternalOberon.g:5515:2: ']'
            {
             before(grammarAccess.getDesignatorAccess().getRightSquareBracketKeyword_1_0_2()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getDesignatorAccess().getRightSquareBracketKeyword_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Designator__Group_1_0__2__Impl"


    // $ANTLR start "rule__Designator__Group_1_1__0"
    // InternalOberon.g:5525:1: rule__Designator__Group_1_1__0 : rule__Designator__Group_1_1__0__Impl rule__Designator__Group_1_1__1 ;
    public final void rule__Designator__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5529:1: ( rule__Designator__Group_1_1__0__Impl rule__Designator__Group_1_1__1 )
            // InternalOberon.g:5530:2: rule__Designator__Group_1_1__0__Impl rule__Designator__Group_1_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Designator__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Designator__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Designator__Group_1_1__0"


    // $ANTLR start "rule__Designator__Group_1_1__0__Impl"
    // InternalOberon.g:5537:1: rule__Designator__Group_1_1__0__Impl : ( '.' ) ;
    public final void rule__Designator__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5541:1: ( ( '.' ) )
            // InternalOberon.g:5542:1: ( '.' )
            {
            // InternalOberon.g:5542:1: ( '.' )
            // InternalOberon.g:5543:2: '.'
            {
             before(grammarAccess.getDesignatorAccess().getFullStopKeyword_1_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getDesignatorAccess().getFullStopKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Designator__Group_1_1__0__Impl"


    // $ANTLR start "rule__Designator__Group_1_1__1"
    // InternalOberon.g:5552:1: rule__Designator__Group_1_1__1 : rule__Designator__Group_1_1__1__Impl ;
    public final void rule__Designator__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5556:1: ( rule__Designator__Group_1_1__1__Impl )
            // InternalOberon.g:5557:2: rule__Designator__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Designator__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Designator__Group_1_1__1"


    // $ANTLR start "rule__Designator__Group_1_1__1__Impl"
    // InternalOberon.g:5563:1: rule__Designator__Group_1_1__1__Impl : ( ( rule__Designator__AtribsAssignment_1_1_1 ) ) ;
    public final void rule__Designator__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5567:1: ( ( ( rule__Designator__AtribsAssignment_1_1_1 ) ) )
            // InternalOberon.g:5568:1: ( ( rule__Designator__AtribsAssignment_1_1_1 ) )
            {
            // InternalOberon.g:5568:1: ( ( rule__Designator__AtribsAssignment_1_1_1 ) )
            // InternalOberon.g:5569:2: ( rule__Designator__AtribsAssignment_1_1_1 )
            {
             before(grammarAccess.getDesignatorAccess().getAtribsAssignment_1_1_1()); 
            // InternalOberon.g:5570:2: ( rule__Designator__AtribsAssignment_1_1_1 )
            // InternalOberon.g:5570:3: rule__Designator__AtribsAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Designator__AtribsAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDesignatorAccess().getAtribsAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Designator__Group_1_1__1__Impl"


    // $ANTLR start "rule__TDesignator__Group__0"
    // InternalOberon.g:5579:1: rule__TDesignator__Group__0 : rule__TDesignator__Group__0__Impl rule__TDesignator__Group__1 ;
    public final void rule__TDesignator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5583:1: ( rule__TDesignator__Group__0__Impl rule__TDesignator__Group__1 )
            // InternalOberon.g:5584:2: rule__TDesignator__Group__0__Impl rule__TDesignator__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__TDesignator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TDesignator__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TDesignator__Group__0"


    // $ANTLR start "rule__TDesignator__Group__0__Impl"
    // InternalOberon.g:5591:1: rule__TDesignator__Group__0__Impl : ( ( rule__TDesignator__NameAssignment_0 ) ) ;
    public final void rule__TDesignator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5595:1: ( ( ( rule__TDesignator__NameAssignment_0 ) ) )
            // InternalOberon.g:5596:1: ( ( rule__TDesignator__NameAssignment_0 ) )
            {
            // InternalOberon.g:5596:1: ( ( rule__TDesignator__NameAssignment_0 ) )
            // InternalOberon.g:5597:2: ( rule__TDesignator__NameAssignment_0 )
            {
             before(grammarAccess.getTDesignatorAccess().getNameAssignment_0()); 
            // InternalOberon.g:5598:2: ( rule__TDesignator__NameAssignment_0 )
            // InternalOberon.g:5598:3: rule__TDesignator__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TDesignator__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTDesignatorAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TDesignator__Group__0__Impl"


    // $ANTLR start "rule__TDesignator__Group__1"
    // InternalOberon.g:5606:1: rule__TDesignator__Group__1 : rule__TDesignator__Group__1__Impl ;
    public final void rule__TDesignator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5610:1: ( rule__TDesignator__Group__1__Impl )
            // InternalOberon.g:5611:2: rule__TDesignator__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TDesignator__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TDesignator__Group__1"


    // $ANTLR start "rule__TDesignator__Group__1__Impl"
    // InternalOberon.g:5617:1: rule__TDesignator__Group__1__Impl : ( ( rule__TDesignator__Group_1__0 )? ) ;
    public final void rule__TDesignator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5621:1: ( ( ( rule__TDesignator__Group_1__0 )? ) )
            // InternalOberon.g:5622:1: ( ( rule__TDesignator__Group_1__0 )? )
            {
            // InternalOberon.g:5622:1: ( ( rule__TDesignator__Group_1__0 )? )
            // InternalOberon.g:5623:2: ( rule__TDesignator__Group_1__0 )?
            {
             before(grammarAccess.getTDesignatorAccess().getGroup_1()); 
            // InternalOberon.g:5624:2: ( rule__TDesignator__Group_1__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==39) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalOberon.g:5624:3: rule__TDesignator__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TDesignator__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTDesignatorAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TDesignator__Group__1__Impl"


    // $ANTLR start "rule__TDesignator__Group_1__0"
    // InternalOberon.g:5633:1: rule__TDesignator__Group_1__0 : rule__TDesignator__Group_1__0__Impl rule__TDesignator__Group_1__1 ;
    public final void rule__TDesignator__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5637:1: ( rule__TDesignator__Group_1__0__Impl rule__TDesignator__Group_1__1 )
            // InternalOberon.g:5638:2: rule__TDesignator__Group_1__0__Impl rule__TDesignator__Group_1__1
            {
            pushFollow(FOLLOW_33);
            rule__TDesignator__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TDesignator__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TDesignator__Group_1__0"


    // $ANTLR start "rule__TDesignator__Group_1__0__Impl"
    // InternalOberon.g:5645:1: rule__TDesignator__Group_1__0__Impl : ( '(' ) ;
    public final void rule__TDesignator__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5649:1: ( ( '(' ) )
            // InternalOberon.g:5650:1: ( '(' )
            {
            // InternalOberon.g:5650:1: ( '(' )
            // InternalOberon.g:5651:2: '('
            {
             before(grammarAccess.getTDesignatorAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getTDesignatorAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TDesignator__Group_1__0__Impl"


    // $ANTLR start "rule__TDesignator__Group_1__1"
    // InternalOberon.g:5660:1: rule__TDesignator__Group_1__1 : rule__TDesignator__Group_1__1__Impl rule__TDesignator__Group_1__2 ;
    public final void rule__TDesignator__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5664:1: ( rule__TDesignator__Group_1__1__Impl rule__TDesignator__Group_1__2 )
            // InternalOberon.g:5665:2: rule__TDesignator__Group_1__1__Impl rule__TDesignator__Group_1__2
            {
            pushFollow(FOLLOW_33);
            rule__TDesignator__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TDesignator__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TDesignator__Group_1__1"


    // $ANTLR start "rule__TDesignator__Group_1__1__Impl"
    // InternalOberon.g:5672:1: rule__TDesignator__Group_1__1__Impl : ( ( rule__TDesignator__ArgsAssignment_1_1 )? ) ;
    public final void rule__TDesignator__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5676:1: ( ( ( rule__TDesignator__ArgsAssignment_1_1 )? ) )
            // InternalOberon.g:5677:1: ( ( rule__TDesignator__ArgsAssignment_1_1 )? )
            {
            // InternalOberon.g:5677:1: ( ( rule__TDesignator__ArgsAssignment_1_1 )? )
            // InternalOberon.g:5678:2: ( rule__TDesignator__ArgsAssignment_1_1 )?
            {
             before(grammarAccess.getTDesignatorAccess().getArgsAssignment_1_1()); 
            // InternalOberon.g:5679:2: ( rule__TDesignator__ArgsAssignment_1_1 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=RULE_INT && LA40_0<=RULE_ID)||(LA40_0>=11 && LA40_0<=12)||LA40_0==39) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalOberon.g:5679:3: rule__TDesignator__ArgsAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__TDesignator__ArgsAssignment_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTDesignatorAccess().getArgsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TDesignator__Group_1__1__Impl"


    // $ANTLR start "rule__TDesignator__Group_1__2"
    // InternalOberon.g:5687:1: rule__TDesignator__Group_1__2 : rule__TDesignator__Group_1__2__Impl ;
    public final void rule__TDesignator__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5691:1: ( rule__TDesignator__Group_1__2__Impl )
            // InternalOberon.g:5692:2: rule__TDesignator__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TDesignator__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TDesignator__Group_1__2"


    // $ANTLR start "rule__TDesignator__Group_1__2__Impl"
    // InternalOberon.g:5698:1: rule__TDesignator__Group_1__2__Impl : ( ')' ) ;
    public final void rule__TDesignator__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5702:1: ( ( ')' ) )
            // InternalOberon.g:5703:1: ( ')' )
            {
            // InternalOberon.g:5703:1: ( ')' )
            // InternalOberon.g:5704:2: ')'
            {
             before(grammarAccess.getTDesignatorAccess().getRightParenthesisKeyword_1_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getTDesignatorAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TDesignator__Group_1__2__Impl"


    // $ANTLR start "rule__CaseAlternative__Group__0"
    // InternalOberon.g:5714:1: rule__CaseAlternative__Group__0 : rule__CaseAlternative__Group__0__Impl rule__CaseAlternative__Group__1 ;
    public final void rule__CaseAlternative__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5718:1: ( rule__CaseAlternative__Group__0__Impl rule__CaseAlternative__Group__1 )
            // InternalOberon.g:5719:2: rule__CaseAlternative__Group__0__Impl rule__CaseAlternative__Group__1
            {
            pushFollow(FOLLOW_50);
            rule__CaseAlternative__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CaseAlternative__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseAlternative__Group__0"


    // $ANTLR start "rule__CaseAlternative__Group__0__Impl"
    // InternalOberon.g:5726:1: rule__CaseAlternative__Group__0__Impl : ( ( rule__CaseAlternative__ExpAssignment_0 ) ) ;
    public final void rule__CaseAlternative__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5730:1: ( ( ( rule__CaseAlternative__ExpAssignment_0 ) ) )
            // InternalOberon.g:5731:1: ( ( rule__CaseAlternative__ExpAssignment_0 ) )
            {
            // InternalOberon.g:5731:1: ( ( rule__CaseAlternative__ExpAssignment_0 ) )
            // InternalOberon.g:5732:2: ( rule__CaseAlternative__ExpAssignment_0 )
            {
             before(grammarAccess.getCaseAlternativeAccess().getExpAssignment_0()); 
            // InternalOberon.g:5733:2: ( rule__CaseAlternative__ExpAssignment_0 )
            // InternalOberon.g:5733:3: rule__CaseAlternative__ExpAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CaseAlternative__ExpAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCaseAlternativeAccess().getExpAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseAlternative__Group__0__Impl"


    // $ANTLR start "rule__CaseAlternative__Group__1"
    // InternalOberon.g:5741:1: rule__CaseAlternative__Group__1 : rule__CaseAlternative__Group__1__Impl rule__CaseAlternative__Group__2 ;
    public final void rule__CaseAlternative__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5745:1: ( rule__CaseAlternative__Group__1__Impl rule__CaseAlternative__Group__2 )
            // InternalOberon.g:5746:2: rule__CaseAlternative__Group__1__Impl rule__CaseAlternative__Group__2
            {
            pushFollow(FOLLOW_50);
            rule__CaseAlternative__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CaseAlternative__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseAlternative__Group__1"


    // $ANTLR start "rule__CaseAlternative__Group__1__Impl"
    // InternalOberon.g:5753:1: rule__CaseAlternative__Group__1__Impl : ( ( rule__CaseAlternative__Group_1__0 )? ) ;
    public final void rule__CaseAlternative__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5757:1: ( ( ( rule__CaseAlternative__Group_1__0 )? ) )
            // InternalOberon.g:5758:1: ( ( rule__CaseAlternative__Group_1__0 )? )
            {
            // InternalOberon.g:5758:1: ( ( rule__CaseAlternative__Group_1__0 )? )
            // InternalOberon.g:5759:2: ( rule__CaseAlternative__Group_1__0 )?
            {
             before(grammarAccess.getCaseAlternativeAccess().getGroup_1()); 
            // InternalOberon.g:5760:2: ( rule__CaseAlternative__Group_1__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==57) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalOberon.g:5760:3: rule__CaseAlternative__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CaseAlternative__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCaseAlternativeAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseAlternative__Group__1__Impl"


    // $ANTLR start "rule__CaseAlternative__Group__2"
    // InternalOberon.g:5768:1: rule__CaseAlternative__Group__2 : rule__CaseAlternative__Group__2__Impl rule__CaseAlternative__Group__3 ;
    public final void rule__CaseAlternative__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5772:1: ( rule__CaseAlternative__Group__2__Impl rule__CaseAlternative__Group__3 )
            // InternalOberon.g:5773:2: rule__CaseAlternative__Group__2__Impl rule__CaseAlternative__Group__3
            {
            pushFollow(FOLLOW_36);
            rule__CaseAlternative__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CaseAlternative__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseAlternative__Group__2"


    // $ANTLR start "rule__CaseAlternative__Group__2__Impl"
    // InternalOberon.g:5780:1: rule__CaseAlternative__Group__2__Impl : ( ':' ) ;
    public final void rule__CaseAlternative__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5784:1: ( ( ':' ) )
            // InternalOberon.g:5785:1: ( ':' )
            {
            // InternalOberon.g:5785:1: ( ':' )
            // InternalOberon.g:5786:2: ':'
            {
             before(grammarAccess.getCaseAlternativeAccess().getColonKeyword_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getCaseAlternativeAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseAlternative__Group__2__Impl"


    // $ANTLR start "rule__CaseAlternative__Group__3"
    // InternalOberon.g:5795:1: rule__CaseAlternative__Group__3 : rule__CaseAlternative__Group__3__Impl ;
    public final void rule__CaseAlternative__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5799:1: ( rule__CaseAlternative__Group__3__Impl )
            // InternalOberon.g:5800:2: rule__CaseAlternative__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CaseAlternative__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseAlternative__Group__3"


    // $ANTLR start "rule__CaseAlternative__Group__3__Impl"
    // InternalOberon.g:5806:1: rule__CaseAlternative__Group__3__Impl : ( ( rule__CaseAlternative__StmtAssignment_3 ) ) ;
    public final void rule__CaseAlternative__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5810:1: ( ( ( rule__CaseAlternative__StmtAssignment_3 ) ) )
            // InternalOberon.g:5811:1: ( ( rule__CaseAlternative__StmtAssignment_3 ) )
            {
            // InternalOberon.g:5811:1: ( ( rule__CaseAlternative__StmtAssignment_3 ) )
            // InternalOberon.g:5812:2: ( rule__CaseAlternative__StmtAssignment_3 )
            {
             before(grammarAccess.getCaseAlternativeAccess().getStmtAssignment_3()); 
            // InternalOberon.g:5813:2: ( rule__CaseAlternative__StmtAssignment_3 )
            // InternalOberon.g:5813:3: rule__CaseAlternative__StmtAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CaseAlternative__StmtAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCaseAlternativeAccess().getStmtAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseAlternative__Group__3__Impl"


    // $ANTLR start "rule__CaseAlternative__Group_1__0"
    // InternalOberon.g:5822:1: rule__CaseAlternative__Group_1__0 : rule__CaseAlternative__Group_1__0__Impl rule__CaseAlternative__Group_1__1 ;
    public final void rule__CaseAlternative__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5826:1: ( rule__CaseAlternative__Group_1__0__Impl rule__CaseAlternative__Group_1__1 )
            // InternalOberon.g:5827:2: rule__CaseAlternative__Group_1__0__Impl rule__CaseAlternative__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__CaseAlternative__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CaseAlternative__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseAlternative__Group_1__0"


    // $ANTLR start "rule__CaseAlternative__Group_1__0__Impl"
    // InternalOberon.g:5834:1: rule__CaseAlternative__Group_1__0__Impl : ( '..' ) ;
    public final void rule__CaseAlternative__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5838:1: ( ( '..' ) )
            // InternalOberon.g:5839:1: ( '..' )
            {
            // InternalOberon.g:5839:1: ( '..' )
            // InternalOberon.g:5840:2: '..'
            {
             before(grammarAccess.getCaseAlternativeAccess().getFullStopFullStopKeyword_1_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getCaseAlternativeAccess().getFullStopFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseAlternative__Group_1__0__Impl"


    // $ANTLR start "rule__CaseAlternative__Group_1__1"
    // InternalOberon.g:5849:1: rule__CaseAlternative__Group_1__1 : rule__CaseAlternative__Group_1__1__Impl ;
    public final void rule__CaseAlternative__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5853:1: ( rule__CaseAlternative__Group_1__1__Impl )
            // InternalOberon.g:5854:2: rule__CaseAlternative__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CaseAlternative__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseAlternative__Group_1__1"


    // $ANTLR start "rule__CaseAlternative__Group_1__1__Impl"
    // InternalOberon.g:5860:1: rule__CaseAlternative__Group_1__1__Impl : ( ( rule__CaseAlternative__MaxAssignment_1_1 ) ) ;
    public final void rule__CaseAlternative__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5864:1: ( ( ( rule__CaseAlternative__MaxAssignment_1_1 ) ) )
            // InternalOberon.g:5865:1: ( ( rule__CaseAlternative__MaxAssignment_1_1 ) )
            {
            // InternalOberon.g:5865:1: ( ( rule__CaseAlternative__MaxAssignment_1_1 ) )
            // InternalOberon.g:5866:2: ( rule__CaseAlternative__MaxAssignment_1_1 )
            {
             before(grammarAccess.getCaseAlternativeAccess().getMaxAssignment_1_1()); 
            // InternalOberon.g:5867:2: ( rule__CaseAlternative__MaxAssignment_1_1 )
            // InternalOberon.g:5867:3: rule__CaseAlternative__MaxAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CaseAlternative__MaxAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCaseAlternativeAccess().getMaxAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseAlternative__Group_1__1__Impl"


    // $ANTLR start "rule__ElseIfStmt__Group__0"
    // InternalOberon.g:5876:1: rule__ElseIfStmt__Group__0 : rule__ElseIfStmt__Group__0__Impl rule__ElseIfStmt__Group__1 ;
    public final void rule__ElseIfStmt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5880:1: ( rule__ElseIfStmt__Group__0__Impl rule__ElseIfStmt__Group__1 )
            // InternalOberon.g:5881:2: rule__ElseIfStmt__Group__0__Impl rule__ElseIfStmt__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__ElseIfStmt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElseIfStmt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfStmt__Group__0"


    // $ANTLR start "rule__ElseIfStmt__Group__0__Impl"
    // InternalOberon.g:5888:1: rule__ElseIfStmt__Group__0__Impl : ( ( rule__ElseIfStmt__CondAssignment_0 ) ) ;
    public final void rule__ElseIfStmt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5892:1: ( ( ( rule__ElseIfStmt__CondAssignment_0 ) ) )
            // InternalOberon.g:5893:1: ( ( rule__ElseIfStmt__CondAssignment_0 ) )
            {
            // InternalOberon.g:5893:1: ( ( rule__ElseIfStmt__CondAssignment_0 ) )
            // InternalOberon.g:5894:2: ( rule__ElseIfStmt__CondAssignment_0 )
            {
             before(grammarAccess.getElseIfStmtAccess().getCondAssignment_0()); 
            // InternalOberon.g:5895:2: ( rule__ElseIfStmt__CondAssignment_0 )
            // InternalOberon.g:5895:3: rule__ElseIfStmt__CondAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ElseIfStmt__CondAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getElseIfStmtAccess().getCondAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfStmt__Group__0__Impl"


    // $ANTLR start "rule__ElseIfStmt__Group__1"
    // InternalOberon.g:5903:1: rule__ElseIfStmt__Group__1 : rule__ElseIfStmt__Group__1__Impl rule__ElseIfStmt__Group__2 ;
    public final void rule__ElseIfStmt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5907:1: ( rule__ElseIfStmt__Group__1__Impl rule__ElseIfStmt__Group__2 )
            // InternalOberon.g:5908:2: rule__ElseIfStmt__Group__1__Impl rule__ElseIfStmt__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__ElseIfStmt__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElseIfStmt__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfStmt__Group__1"


    // $ANTLR start "rule__ElseIfStmt__Group__1__Impl"
    // InternalOberon.g:5915:1: rule__ElseIfStmt__Group__1__Impl : ( 'THEN' ) ;
    public final void rule__ElseIfStmt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5919:1: ( ( 'THEN' ) )
            // InternalOberon.g:5920:1: ( 'THEN' )
            {
            // InternalOberon.g:5920:1: ( 'THEN' )
            // InternalOberon.g:5921:2: 'THEN'
            {
             before(grammarAccess.getElseIfStmtAccess().getTHENKeyword_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getElseIfStmtAccess().getTHENKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfStmt__Group__1__Impl"


    // $ANTLR start "rule__ElseIfStmt__Group__2"
    // InternalOberon.g:5930:1: rule__ElseIfStmt__Group__2 : rule__ElseIfStmt__Group__2__Impl ;
    public final void rule__ElseIfStmt__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5934:1: ( rule__ElseIfStmt__Group__2__Impl )
            // InternalOberon.g:5935:2: rule__ElseIfStmt__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElseIfStmt__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfStmt__Group__2"


    // $ANTLR start "rule__ElseIfStmt__Group__2__Impl"
    // InternalOberon.g:5941:1: rule__ElseIfStmt__Group__2__Impl : ( ( rule__ElseIfStmt__StmtAssignment_2 ) ) ;
    public final void rule__ElseIfStmt__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5945:1: ( ( ( rule__ElseIfStmt__StmtAssignment_2 ) ) )
            // InternalOberon.g:5946:1: ( ( rule__ElseIfStmt__StmtAssignment_2 ) )
            {
            // InternalOberon.g:5946:1: ( ( rule__ElseIfStmt__StmtAssignment_2 ) )
            // InternalOberon.g:5947:2: ( rule__ElseIfStmt__StmtAssignment_2 )
            {
             before(grammarAccess.getElseIfStmtAccess().getStmtAssignment_2()); 
            // InternalOberon.g:5948:2: ( rule__ElseIfStmt__StmtAssignment_2 )
            // InternalOberon.g:5948:3: rule__ElseIfStmt__StmtAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ElseIfStmt__StmtAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getElseIfStmtAccess().getStmtAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfStmt__Group__2__Impl"


    // $ANTLR start "rule__OberonType__Group_0__0"
    // InternalOberon.g:5957:1: rule__OberonType__Group_0__0 : rule__OberonType__Group_0__0__Impl rule__OberonType__Group_0__1 ;
    public final void rule__OberonType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5961:1: ( rule__OberonType__Group_0__0__Impl rule__OberonType__Group_0__1 )
            // InternalOberon.g:5962:2: rule__OberonType__Group_0__0__Impl rule__OberonType__Group_0__1
            {
            pushFollow(FOLLOW_51);
            rule__OberonType__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OberonType__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OberonType__Group_0__0"


    // $ANTLR start "rule__OberonType__Group_0__0__Impl"
    // InternalOberon.g:5969:1: rule__OberonType__Group_0__0__Impl : ( () ) ;
    public final void rule__OberonType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5973:1: ( ( () ) )
            // InternalOberon.g:5974:1: ( () )
            {
            // InternalOberon.g:5974:1: ( () )
            // InternalOberon.g:5975:2: ()
            {
             before(grammarAccess.getOberonTypeAccess().getIntegerAction_0_0()); 
            // InternalOberon.g:5976:2: ()
            // InternalOberon.g:5976:3: 
            {
            }

             after(grammarAccess.getOberonTypeAccess().getIntegerAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OberonType__Group_0__0__Impl"


    // $ANTLR start "rule__OberonType__Group_0__1"
    // InternalOberon.g:5984:1: rule__OberonType__Group_0__1 : rule__OberonType__Group_0__1__Impl ;
    public final void rule__OberonType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5988:1: ( rule__OberonType__Group_0__1__Impl )
            // InternalOberon.g:5989:2: rule__OberonType__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OberonType__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OberonType__Group_0__1"


    // $ANTLR start "rule__OberonType__Group_0__1__Impl"
    // InternalOberon.g:5995:1: rule__OberonType__Group_0__1__Impl : ( 'INTEGER' ) ;
    public final void rule__OberonType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:5999:1: ( ( 'INTEGER' ) )
            // InternalOberon.g:6000:1: ( 'INTEGER' )
            {
            // InternalOberon.g:6000:1: ( 'INTEGER' )
            // InternalOberon.g:6001:2: 'INTEGER'
            {
             before(grammarAccess.getOberonTypeAccess().getINTEGERKeyword_0_1()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getOberonTypeAccess().getINTEGERKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OberonType__Group_0__1__Impl"


    // $ANTLR start "rule__OberonType__Group_1__0"
    // InternalOberon.g:6011:1: rule__OberonType__Group_1__0 : rule__OberonType__Group_1__0__Impl rule__OberonType__Group_1__1 ;
    public final void rule__OberonType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6015:1: ( rule__OberonType__Group_1__0__Impl rule__OberonType__Group_1__1 )
            // InternalOberon.g:6016:2: rule__OberonType__Group_1__0__Impl rule__OberonType__Group_1__1
            {
            pushFollow(FOLLOW_52);
            rule__OberonType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OberonType__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OberonType__Group_1__0"


    // $ANTLR start "rule__OberonType__Group_1__0__Impl"
    // InternalOberon.g:6023:1: rule__OberonType__Group_1__0__Impl : ( () ) ;
    public final void rule__OberonType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6027:1: ( ( () ) )
            // InternalOberon.g:6028:1: ( () )
            {
            // InternalOberon.g:6028:1: ( () )
            // InternalOberon.g:6029:2: ()
            {
             before(grammarAccess.getOberonTypeAccess().getBooleanAction_1_0()); 
            // InternalOberon.g:6030:2: ()
            // InternalOberon.g:6030:3: 
            {
            }

             after(grammarAccess.getOberonTypeAccess().getBooleanAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OberonType__Group_1__0__Impl"


    // $ANTLR start "rule__OberonType__Group_1__1"
    // InternalOberon.g:6038:1: rule__OberonType__Group_1__1 : rule__OberonType__Group_1__1__Impl ;
    public final void rule__OberonType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6042:1: ( rule__OberonType__Group_1__1__Impl )
            // InternalOberon.g:6043:2: rule__OberonType__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OberonType__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OberonType__Group_1__1"


    // $ANTLR start "rule__OberonType__Group_1__1__Impl"
    // InternalOberon.g:6049:1: rule__OberonType__Group_1__1__Impl : ( 'BOOLEAN' ) ;
    public final void rule__OberonType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6053:1: ( ( 'BOOLEAN' ) )
            // InternalOberon.g:6054:1: ( 'BOOLEAN' )
            {
            // InternalOberon.g:6054:1: ( 'BOOLEAN' )
            // InternalOberon.g:6055:2: 'BOOLEAN'
            {
             before(grammarAccess.getOberonTypeAccess().getBOOLEANKeyword_1_1()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getOberonTypeAccess().getBOOLEANKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OberonType__Group_1__1__Impl"


    // $ANTLR start "rule__OberonType__Group_3__0"
    // InternalOberon.g:6065:1: rule__OberonType__Group_3__0 : rule__OberonType__Group_3__0__Impl rule__OberonType__Group_3__1 ;
    public final void rule__OberonType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6069:1: ( rule__OberonType__Group_3__0__Impl rule__OberonType__Group_3__1 )
            // InternalOberon.g:6070:2: rule__OberonType__Group_3__0__Impl rule__OberonType__Group_3__1
            {
            pushFollow(FOLLOW_15);
            rule__OberonType__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OberonType__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OberonType__Group_3__0"


    // $ANTLR start "rule__OberonType__Group_3__0__Impl"
    // InternalOberon.g:6077:1: rule__OberonType__Group_3__0__Impl : ( 'ARRAY' ) ;
    public final void rule__OberonType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6081:1: ( ( 'ARRAY' ) )
            // InternalOberon.g:6082:1: ( 'ARRAY' )
            {
            // InternalOberon.g:6082:1: ( 'ARRAY' )
            // InternalOberon.g:6083:2: 'ARRAY'
            {
             before(grammarAccess.getOberonTypeAccess().getARRAYKeyword_3_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getOberonTypeAccess().getARRAYKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OberonType__Group_3__0__Impl"


    // $ANTLR start "rule__OberonType__Group_3__1"
    // InternalOberon.g:6092:1: rule__OberonType__Group_3__1 : rule__OberonType__Group_3__1__Impl rule__OberonType__Group_3__2 ;
    public final void rule__OberonType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6096:1: ( rule__OberonType__Group_3__1__Impl rule__OberonType__Group_3__2 )
            // InternalOberon.g:6097:2: rule__OberonType__Group_3__1__Impl rule__OberonType__Group_3__2
            {
            pushFollow(FOLLOW_16);
            rule__OberonType__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OberonType__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OberonType__Group_3__1"


    // $ANTLR start "rule__OberonType__Group_3__1__Impl"
    // InternalOberon.g:6104:1: rule__OberonType__Group_3__1__Impl : ( ( rule__OberonType__NumElementAssignment_3_1 ) ) ;
    public final void rule__OberonType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6108:1: ( ( ( rule__OberonType__NumElementAssignment_3_1 ) ) )
            // InternalOberon.g:6109:1: ( ( rule__OberonType__NumElementAssignment_3_1 ) )
            {
            // InternalOberon.g:6109:1: ( ( rule__OberonType__NumElementAssignment_3_1 ) )
            // InternalOberon.g:6110:2: ( rule__OberonType__NumElementAssignment_3_1 )
            {
             before(grammarAccess.getOberonTypeAccess().getNumElementAssignment_3_1()); 
            // InternalOberon.g:6111:2: ( rule__OberonType__NumElementAssignment_3_1 )
            // InternalOberon.g:6111:3: rule__OberonType__NumElementAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__OberonType__NumElementAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOberonTypeAccess().getNumElementAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OberonType__Group_3__1__Impl"


    // $ANTLR start "rule__OberonType__Group_3__2"
    // InternalOberon.g:6119:1: rule__OberonType__Group_3__2 : rule__OberonType__Group_3__2__Impl rule__OberonType__Group_3__3 ;
    public final void rule__OberonType__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6123:1: ( rule__OberonType__Group_3__2__Impl rule__OberonType__Group_3__3 )
            // InternalOberon.g:6124:2: rule__OberonType__Group_3__2__Impl rule__OberonType__Group_3__3
            {
            pushFollow(FOLLOW_17);
            rule__OberonType__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OberonType__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OberonType__Group_3__2"


    // $ANTLR start "rule__OberonType__Group_3__2__Impl"
    // InternalOberon.g:6131:1: rule__OberonType__Group_3__2__Impl : ( 'OF' ) ;
    public final void rule__OberonType__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6135:1: ( ( 'OF' ) )
            // InternalOberon.g:6136:1: ( 'OF' )
            {
            // InternalOberon.g:6136:1: ( 'OF' )
            // InternalOberon.g:6137:2: 'OF'
            {
             before(grammarAccess.getOberonTypeAccess().getOFKeyword_3_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getOberonTypeAccess().getOFKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OberonType__Group_3__2__Impl"


    // $ANTLR start "rule__OberonType__Group_3__3"
    // InternalOberon.g:6146:1: rule__OberonType__Group_3__3 : rule__OberonType__Group_3__3__Impl ;
    public final void rule__OberonType__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6150:1: ( rule__OberonType__Group_3__3__Impl )
            // InternalOberon.g:6151:2: rule__OberonType__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OberonType__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OberonType__Group_3__3"


    // $ANTLR start "rule__OberonType__Group_3__3__Impl"
    // InternalOberon.g:6157:1: rule__OberonType__Group_3__3__Impl : ( ( rule__OberonType__NameTypeAssignment_3_3 ) ) ;
    public final void rule__OberonType__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6161:1: ( ( ( rule__OberonType__NameTypeAssignment_3_3 ) ) )
            // InternalOberon.g:6162:1: ( ( rule__OberonType__NameTypeAssignment_3_3 ) )
            {
            // InternalOberon.g:6162:1: ( ( rule__OberonType__NameTypeAssignment_3_3 ) )
            // InternalOberon.g:6163:2: ( rule__OberonType__NameTypeAssignment_3_3 )
            {
             before(grammarAccess.getOberonTypeAccess().getNameTypeAssignment_3_3()); 
            // InternalOberon.g:6164:2: ( rule__OberonType__NameTypeAssignment_3_3 )
            // InternalOberon.g:6164:3: rule__OberonType__NameTypeAssignment_3_3
            {
            pushFollow(FOLLOW_2);
            rule__OberonType__NameTypeAssignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getOberonTypeAccess().getNameTypeAssignment_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OberonType__Group_3__3__Impl"


    // $ANTLR start "rule__Oberon__NameAssignment_1"
    // InternalOberon.g:6173:1: rule__Oberon__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Oberon__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6177:1: ( ( RULE_ID ) )
            // InternalOberon.g:6178:2: ( RULE_ID )
            {
            // InternalOberon.g:6178:2: ( RULE_ID )
            // InternalOberon.g:6179:3: RULE_ID
            {
             before(grammarAccess.getOberonAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOberonAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oberon__NameAssignment_1"


    // $ANTLR start "rule__Oberon__DeclarationAssignment_3"
    // InternalOberon.g:6188:1: rule__Oberon__DeclarationAssignment_3 : ( ruleDeclarations ) ;
    public final void rule__Oberon__DeclarationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6192:1: ( ( ruleDeclarations ) )
            // InternalOberon.g:6193:2: ( ruleDeclarations )
            {
            // InternalOberon.g:6193:2: ( ruleDeclarations )
            // InternalOberon.g:6194:3: ruleDeclarations
            {
             before(grammarAccess.getOberonAccess().getDeclarationDeclarationsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDeclarations();

            state._fsp--;

             after(grammarAccess.getOberonAccess().getDeclarationDeclarationsParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oberon__DeclarationAssignment_3"


    // $ANTLR start "rule__Oberon__BlockAssignment_4"
    // InternalOberon.g:6203:1: rule__Oberon__BlockAssignment_4 : ( ruleBlock ) ;
    public final void rule__Oberon__BlockAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6207:1: ( ( ruleBlock ) )
            // InternalOberon.g:6208:2: ( ruleBlock )
            {
            // InternalOberon.g:6208:2: ( ruleBlock )
            // InternalOberon.g:6209:3: ruleBlock
            {
             before(grammarAccess.getOberonAccess().getBlockBlockParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getOberonAccess().getBlockBlockParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oberon__BlockAssignment_4"


    // $ANTLR start "rule__Block__StmtAssignment_2"
    // InternalOberon.g:6218:1: rule__Block__StmtAssignment_2 : ( ruleStatement ) ;
    public final void rule__Block__StmtAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6222:1: ( ( ruleStatement ) )
            // InternalOberon.g:6223:2: ( ruleStatement )
            {
            // InternalOberon.g:6223:2: ( ruleStatement )
            // InternalOberon.g:6224:3: ruleStatement
            {
             before(grammarAccess.getBlockAccess().getStmtStatementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getStmtStatementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__StmtAssignment_2"


    // $ANTLR start "rule__Declarations__TypesAssignment_1_1"
    // InternalOberon.g:6233:1: rule__Declarations__TypesAssignment_1_1 : ( ruleUserTypeDeclaration ) ;
    public final void rule__Declarations__TypesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6237:1: ( ( ruleUserTypeDeclaration ) )
            // InternalOberon.g:6238:2: ( ruleUserTypeDeclaration )
            {
            // InternalOberon.g:6238:2: ( ruleUserTypeDeclaration )
            // InternalOberon.g:6239:3: ruleUserTypeDeclaration
            {
             before(grammarAccess.getDeclarationsAccess().getTypesUserTypeDeclarationParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUserTypeDeclaration();

            state._fsp--;

             after(grammarAccess.getDeclarationsAccess().getTypesUserTypeDeclarationParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarations__TypesAssignment_1_1"


    // $ANTLR start "rule__Declarations__ConstsAssignment_2_1"
    // InternalOberon.g:6248:1: rule__Declarations__ConstsAssignment_2_1 : ( ruleConstant ) ;
    public final void rule__Declarations__ConstsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6252:1: ( ( ruleConstant ) )
            // InternalOberon.g:6253:2: ( ruleConstant )
            {
            // InternalOberon.g:6253:2: ( ruleConstant )
            // InternalOberon.g:6254:3: ruleConstant
            {
             before(grammarAccess.getDeclarationsAccess().getConstsConstantParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConstant();

            state._fsp--;

             after(grammarAccess.getDeclarationsAccess().getConstsConstantParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarations__ConstsAssignment_2_1"


    // $ANTLR start "rule__Declarations__VarsAssignment_3_1"
    // InternalOberon.g:6263:1: rule__Declarations__VarsAssignment_3_1 : ( ruleVarDeclaration ) ;
    public final void rule__Declarations__VarsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6267:1: ( ( ruleVarDeclaration ) )
            // InternalOberon.g:6268:2: ( ruleVarDeclaration )
            {
            // InternalOberon.g:6268:2: ( ruleVarDeclaration )
            // InternalOberon.g:6269:3: ruleVarDeclaration
            {
             before(grammarAccess.getDeclarationsAccess().getVarsVarDeclarationParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVarDeclaration();

            state._fsp--;

             after(grammarAccess.getDeclarationsAccess().getVarsVarDeclarationParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarations__VarsAssignment_3_1"


    // $ANTLR start "rule__Declarations__ProcAssignment_4"
    // InternalOberon.g:6278:1: rule__Declarations__ProcAssignment_4 : ( ruleProcedure ) ;
    public final void rule__Declarations__ProcAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6282:1: ( ( ruleProcedure ) )
            // InternalOberon.g:6283:2: ( ruleProcedure )
            {
            // InternalOberon.g:6283:2: ( ruleProcedure )
            // InternalOberon.g:6284:3: ruleProcedure
            {
             before(grammarAccess.getDeclarationsAccess().getProcProcedureParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleProcedure();

            state._fsp--;

             after(grammarAccess.getDeclarationsAccess().getProcProcedureParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarations__ProcAssignment_4"


    // $ANTLR start "rule__UserTypeDeclaration__NameTypeAssignment_0_0"
    // InternalOberon.g:6293:1: rule__UserTypeDeclaration__NameTypeAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__UserTypeDeclaration__NameTypeAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6297:1: ( ( RULE_ID ) )
            // InternalOberon.g:6298:2: ( RULE_ID )
            {
            // InternalOberon.g:6298:2: ( RULE_ID )
            // InternalOberon.g:6299:3: RULE_ID
            {
             before(grammarAccess.getUserTypeDeclarationAccess().getNameTypeIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUserTypeDeclarationAccess().getNameTypeIDTerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserTypeDeclaration__NameTypeAssignment_0_0"


    // $ANTLR start "rule__UserTypeDeclaration__LengthAssignment_0_2_1"
    // InternalOberon.g:6308:1: rule__UserTypeDeclaration__LengthAssignment_0_2_1 : ( RULE_INT ) ;
    public final void rule__UserTypeDeclaration__LengthAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6312:1: ( ( RULE_INT ) )
            // InternalOberon.g:6313:2: ( RULE_INT )
            {
            // InternalOberon.g:6313:2: ( RULE_INT )
            // InternalOberon.g:6314:3: RULE_INT
            {
             before(grammarAccess.getUserTypeDeclarationAccess().getLengthINTTerminalRuleCall_0_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getUserTypeDeclarationAccess().getLengthINTTerminalRuleCall_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserTypeDeclaration__LengthAssignment_0_2_1"


    // $ANTLR start "rule__UserTypeDeclaration__VartypeAssignment_0_2_3"
    // InternalOberon.g:6323:1: rule__UserTypeDeclaration__VartypeAssignment_0_2_3 : ( ruleOberonType ) ;
    public final void rule__UserTypeDeclaration__VartypeAssignment_0_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6327:1: ( ( ruleOberonType ) )
            // InternalOberon.g:6328:2: ( ruleOberonType )
            {
            // InternalOberon.g:6328:2: ( ruleOberonType )
            // InternalOberon.g:6329:3: ruleOberonType
            {
             before(grammarAccess.getUserTypeDeclarationAccess().getVartypeOberonTypeParserRuleCall_0_2_3_0()); 
            pushFollow(FOLLOW_2);
            ruleOberonType();

            state._fsp--;

             after(grammarAccess.getUserTypeDeclarationAccess().getVartypeOberonTypeParserRuleCall_0_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserTypeDeclaration__VartypeAssignment_0_2_3"


    // $ANTLR start "rule__UserTypeDeclaration__NameTypeAssignment_1_0"
    // InternalOberon.g:6338:1: rule__UserTypeDeclaration__NameTypeAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__UserTypeDeclaration__NameTypeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6342:1: ( ( RULE_ID ) )
            // InternalOberon.g:6343:2: ( RULE_ID )
            {
            // InternalOberon.g:6343:2: ( RULE_ID )
            // InternalOberon.g:6344:3: RULE_ID
            {
             before(grammarAccess.getUserTypeDeclarationAccess().getNameTypeIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUserTypeDeclarationAccess().getNameTypeIDTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserTypeDeclaration__NameTypeAssignment_1_0"


    // $ANTLR start "rule__UserTypeDeclaration__VarsAssignment_1_2_1"
    // InternalOberon.g:6353:1: rule__UserTypeDeclaration__VarsAssignment_1_2_1 : ( ruleVarDeclaration ) ;
    public final void rule__UserTypeDeclaration__VarsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6357:1: ( ( ruleVarDeclaration ) )
            // InternalOberon.g:6358:2: ( ruleVarDeclaration )
            {
            // InternalOberon.g:6358:2: ( ruleVarDeclaration )
            // InternalOberon.g:6359:3: ruleVarDeclaration
            {
             before(grammarAccess.getUserTypeDeclarationAccess().getVarsVarDeclarationParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVarDeclaration();

            state._fsp--;

             after(grammarAccess.getUserTypeDeclarationAccess().getVarsVarDeclarationParserRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserTypeDeclaration__VarsAssignment_1_2_1"


    // $ANTLR start "rule__Constant__ConstNameAssignment_0"
    // InternalOberon.g:6368:1: rule__Constant__ConstNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Constant__ConstNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6372:1: ( ( RULE_ID ) )
            // InternalOberon.g:6373:2: ( RULE_ID )
            {
            // InternalOberon.g:6373:2: ( RULE_ID )
            // InternalOberon.g:6374:3: RULE_ID
            {
             before(grammarAccess.getConstantAccess().getConstNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConstantAccess().getConstNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__ConstNameAssignment_0"


    // $ANTLR start "rule__Constant__ExpAssignment_2"
    // InternalOberon.g:6383:1: rule__Constant__ExpAssignment_2 : ( ruleExpression ) ;
    public final void rule__Constant__ExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6387:1: ( ( ruleExpression ) )
            // InternalOberon.g:6388:2: ( ruleExpression )
            {
            // InternalOberon.g:6388:2: ( ruleExpression )
            // InternalOberon.g:6389:3: ruleExpression
            {
             before(grammarAccess.getConstantAccess().getExpExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getConstantAccess().getExpExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__ExpAssignment_2"


    // $ANTLR start "rule__VarDeclaration__VarsAssignment_0_0"
    // InternalOberon.g:6398:1: rule__VarDeclaration__VarsAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__VarDeclaration__VarsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6402:1: ( ( RULE_ID ) )
            // InternalOberon.g:6403:2: ( RULE_ID )
            {
            // InternalOberon.g:6403:2: ( RULE_ID )
            // InternalOberon.g:6404:3: RULE_ID
            {
             before(grammarAccess.getVarDeclarationAccess().getVarsIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVarDeclarationAccess().getVarsIDTerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__VarsAssignment_0_0"


    // $ANTLR start "rule__VarDeclaration__VarsAssignment_0_1_1"
    // InternalOberon.g:6413:1: rule__VarDeclaration__VarsAssignment_0_1_1 : ( RULE_ID ) ;
    public final void rule__VarDeclaration__VarsAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6417:1: ( ( RULE_ID ) )
            // InternalOberon.g:6418:2: ( RULE_ID )
            {
            // InternalOberon.g:6418:2: ( RULE_ID )
            // InternalOberon.g:6419:3: RULE_ID
            {
             before(grammarAccess.getVarDeclarationAccess().getVarsIDTerminalRuleCall_0_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVarDeclarationAccess().getVarsIDTerminalRuleCall_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__VarsAssignment_0_1_1"


    // $ANTLR start "rule__VarDeclaration__VarTypeAssignment_2"
    // InternalOberon.g:6428:1: rule__VarDeclaration__VarTypeAssignment_2 : ( ruleOberonType ) ;
    public final void rule__VarDeclaration__VarTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6432:1: ( ( ruleOberonType ) )
            // InternalOberon.g:6433:2: ( ruleOberonType )
            {
            // InternalOberon.g:6433:2: ( ruleOberonType )
            // InternalOberon.g:6434:3: ruleOberonType
            {
             before(grammarAccess.getVarDeclarationAccess().getVarTypeOberonTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOberonType();

            state._fsp--;

             after(grammarAccess.getVarDeclarationAccess().getVarTypeOberonTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__VarTypeAssignment_2"


    // $ANTLR start "rule__Procedure__NameAssignment_1"
    // InternalOberon.g:6443:1: rule__Procedure__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Procedure__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6447:1: ( ( RULE_ID ) )
            // InternalOberon.g:6448:2: ( RULE_ID )
            {
            // InternalOberon.g:6448:2: ( RULE_ID )
            // InternalOberon.g:6449:3: RULE_ID
            {
             before(grammarAccess.getProcedureAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProcedureAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__NameAssignment_1"


    // $ANTLR start "rule__Procedure__FormalsAssignment_3"
    // InternalOberon.g:6458:1: rule__Procedure__FormalsAssignment_3 : ( ruleFormals ) ;
    public final void rule__Procedure__FormalsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6462:1: ( ( ruleFormals ) )
            // InternalOberon.g:6463:2: ( ruleFormals )
            {
            // InternalOberon.g:6463:2: ( ruleFormals )
            // InternalOberon.g:6464:3: ruleFormals
            {
             before(grammarAccess.getProcedureAccess().getFormalsFormalsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFormals();

            state._fsp--;

             after(grammarAccess.getProcedureAccess().getFormalsFormalsParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__FormalsAssignment_3"


    // $ANTLR start "rule__Procedure__ProcedureTypeAssignment_5_1"
    // InternalOberon.g:6473:1: rule__Procedure__ProcedureTypeAssignment_5_1 : ( ruleOberonType ) ;
    public final void rule__Procedure__ProcedureTypeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6477:1: ( ( ruleOberonType ) )
            // InternalOberon.g:6478:2: ( ruleOberonType )
            {
            // InternalOberon.g:6478:2: ( ruleOberonType )
            // InternalOberon.g:6479:3: ruleOberonType
            {
             before(grammarAccess.getProcedureAccess().getProcedureTypeOberonTypeParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOberonType();

            state._fsp--;

             after(grammarAccess.getProcedureAccess().getProcedureTypeOberonTypeParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__ProcedureTypeAssignment_5_1"


    // $ANTLR start "rule__Procedure__DeclAssignment_7"
    // InternalOberon.g:6488:1: rule__Procedure__DeclAssignment_7 : ( ruleDeclarations ) ;
    public final void rule__Procedure__DeclAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6492:1: ( ( ruleDeclarations ) )
            // InternalOberon.g:6493:2: ( ruleDeclarations )
            {
            // InternalOberon.g:6493:2: ( ruleDeclarations )
            // InternalOberon.g:6494:3: ruleDeclarations
            {
             before(grammarAccess.getProcedureAccess().getDeclDeclarationsParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleDeclarations();

            state._fsp--;

             after(grammarAccess.getProcedureAccess().getDeclDeclarationsParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__DeclAssignment_7"


    // $ANTLR start "rule__Procedure__BlockAssignment_8"
    // InternalOberon.g:6503:1: rule__Procedure__BlockAssignment_8 : ( ruleBlock ) ;
    public final void rule__Procedure__BlockAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6507:1: ( ( ruleBlock ) )
            // InternalOberon.g:6508:2: ( ruleBlock )
            {
            // InternalOberon.g:6508:2: ( ruleBlock )
            // InternalOberon.g:6509:3: ruleBlock
            {
             before(grammarAccess.getProcedureAccess().getBlockBlockParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getProcedureAccess().getBlockBlockParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__BlockAssignment_8"


    // $ANTLR start "rule__Formals__ArgAssignment_0"
    // InternalOberon.g:6518:1: rule__Formals__ArgAssignment_0 : ( ruleFormalArg ) ;
    public final void rule__Formals__ArgAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6522:1: ( ( ruleFormalArg ) )
            // InternalOberon.g:6523:2: ( ruleFormalArg )
            {
            // InternalOberon.g:6523:2: ( ruleFormalArg )
            // InternalOberon.g:6524:3: ruleFormalArg
            {
             before(grammarAccess.getFormalsAccess().getArgFormalArgParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFormalArg();

            state._fsp--;

             after(grammarAccess.getFormalsAccess().getArgFormalArgParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formals__ArgAssignment_0"


    // $ANTLR start "rule__Formals__ArgsAssignment_1_1"
    // InternalOberon.g:6533:1: rule__Formals__ArgsAssignment_1_1 : ( ruleFormalArg ) ;
    public final void rule__Formals__ArgsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6537:1: ( ( ruleFormalArg ) )
            // InternalOberon.g:6538:2: ( ruleFormalArg )
            {
            // InternalOberon.g:6538:2: ( ruleFormalArg )
            // InternalOberon.g:6539:3: ruleFormalArg
            {
             before(grammarAccess.getFormalsAccess().getArgsFormalArgParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFormalArg();

            state._fsp--;

             after(grammarAccess.getFormalsAccess().getArgsFormalArgParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formals__ArgsAssignment_1_1"


    // $ANTLR start "rule__FormalArg__ArgsAssignment_0_0"
    // InternalOberon.g:6548:1: rule__FormalArg__ArgsAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__FormalArg__ArgsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6552:1: ( ( RULE_ID ) )
            // InternalOberon.g:6553:2: ( RULE_ID )
            {
            // InternalOberon.g:6553:2: ( RULE_ID )
            // InternalOberon.g:6554:3: RULE_ID
            {
             before(grammarAccess.getFormalArgAccess().getArgsIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFormalArgAccess().getArgsIDTerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalArg__ArgsAssignment_0_0"


    // $ANTLR start "rule__FormalArg__ArgsAssignment_0_1_1"
    // InternalOberon.g:6563:1: rule__FormalArg__ArgsAssignment_0_1_1 : ( RULE_ID ) ;
    public final void rule__FormalArg__ArgsAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6567:1: ( ( RULE_ID ) )
            // InternalOberon.g:6568:2: ( RULE_ID )
            {
            // InternalOberon.g:6568:2: ( RULE_ID )
            // InternalOberon.g:6569:3: RULE_ID
            {
             before(grammarAccess.getFormalArgAccess().getArgsIDTerminalRuleCall_0_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFormalArgAccess().getArgsIDTerminalRuleCall_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalArg__ArgsAssignment_0_1_1"


    // $ANTLR start "rule__FormalArg__ArgTypeAssignment_2"
    // InternalOberon.g:6578:1: rule__FormalArg__ArgTypeAssignment_2 : ( ruleOberonType ) ;
    public final void rule__FormalArg__ArgTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6582:1: ( ( ruleOberonType ) )
            // InternalOberon.g:6583:2: ( ruleOberonType )
            {
            // InternalOberon.g:6583:2: ( ruleOberonType )
            // InternalOberon.g:6584:3: ruleOberonType
            {
             before(grammarAccess.getFormalArgAccess().getArgTypeOberonTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOberonType();

            state._fsp--;

             after(grammarAccess.getFormalArgAccess().getArgTypeOberonTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalArg__ArgTypeAssignment_2"


    // $ANTLR start "rule__Arguments__ExpAssignment_0"
    // InternalOberon.g:6593:1: rule__Arguments__ExpAssignment_0 : ( ruleExpression ) ;
    public final void rule__Arguments__ExpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6597:1: ( ( ruleExpression ) )
            // InternalOberon.g:6598:2: ( ruleExpression )
            {
            // InternalOberon.g:6598:2: ( ruleExpression )
            // InternalOberon.g:6599:3: ruleExpression
            {
             before(grammarAccess.getArgumentsAccess().getExpExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getArgumentsAccess().getExpExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arguments__ExpAssignment_0"


    // $ANTLR start "rule__Arguments__ExpsAssignment_1_1"
    // InternalOberon.g:6608:1: rule__Arguments__ExpsAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__Arguments__ExpsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6612:1: ( ( ruleExpression ) )
            // InternalOberon.g:6613:2: ( ruleExpression )
            {
            // InternalOberon.g:6613:2: ( ruleExpression )
            // InternalOberon.g:6614:3: ruleExpression
            {
             before(grammarAccess.getArgumentsAccess().getExpsExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getArgumentsAccess().getExpsExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arguments__ExpsAssignment_1_1"


    // $ANTLR start "rule__Expression__LeftAssignment_0"
    // InternalOberon.g:6623:1: rule__Expression__LeftAssignment_0 : ( ruleTExpression ) ;
    public final void rule__Expression__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6627:1: ( ( ruleTExpression ) )
            // InternalOberon.g:6628:2: ( ruleTExpression )
            {
            // InternalOberon.g:6628:2: ( ruleTExpression )
            // InternalOberon.g:6629:3: ruleTExpression
            {
             before(grammarAccess.getExpressionAccess().getLeftTExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getLeftTExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__LeftAssignment_0"


    // $ANTLR start "rule__Expression__OprAssignment_1_0"
    // InternalOberon.g:6638:1: rule__Expression__OprAssignment_1_0 : ( ruleOperation ) ;
    public final void rule__Expression__OprAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6642:1: ( ( ruleOperation ) )
            // InternalOberon.g:6643:2: ( ruleOperation )
            {
            // InternalOberon.g:6643:2: ( ruleOperation )
            // InternalOberon.g:6644:3: ruleOperation
            {
             before(grammarAccess.getExpressionAccess().getOprOperationParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getOprOperationParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__OprAssignment_1_0"


    // $ANTLR start "rule__Expression__RightAssignment_1_1"
    // InternalOberon.g:6653:1: rule__Expression__RightAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__Expression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6657:1: ( ( ruleExpression ) )
            // InternalOberon.g:6658:2: ( ruleExpression )
            {
            // InternalOberon.g:6658:2: ( ruleExpression )
            // InternalOberon.g:6659:3: ruleExpression
            {
             before(grammarAccess.getExpressionAccess().getRightExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getRightExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__RightAssignment_1_1"


    // $ANTLR start "rule__Operation__OperationRelacionalAssignment_0"
    // InternalOberon.g:6668:1: rule__Operation__OperationRelacionalAssignment_0 : ( ( rule__Operation__OperationRelacionalAlternatives_0_0 ) ) ;
    public final void rule__Operation__OperationRelacionalAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6672:1: ( ( ( rule__Operation__OperationRelacionalAlternatives_0_0 ) ) )
            // InternalOberon.g:6673:2: ( ( rule__Operation__OperationRelacionalAlternatives_0_0 ) )
            {
            // InternalOberon.g:6673:2: ( ( rule__Operation__OperationRelacionalAlternatives_0_0 ) )
            // InternalOberon.g:6674:3: ( rule__Operation__OperationRelacionalAlternatives_0_0 )
            {
             before(grammarAccess.getOperationAccess().getOperationRelacionalAlternatives_0_0()); 
            // InternalOberon.g:6675:3: ( rule__Operation__OperationRelacionalAlternatives_0_0 )
            // InternalOberon.g:6675:4: rule__Operation__OperationRelacionalAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Operation__OperationRelacionalAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getOperationRelacionalAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__OperationRelacionalAssignment_0"


    // $ANTLR start "rule__Operation__OperationAritmeticAssignment_1"
    // InternalOberon.g:6683:1: rule__Operation__OperationAritmeticAssignment_1 : ( ( rule__Operation__OperationAritmeticAlternatives_1_0 ) ) ;
    public final void rule__Operation__OperationAritmeticAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6687:1: ( ( ( rule__Operation__OperationAritmeticAlternatives_1_0 ) ) )
            // InternalOberon.g:6688:2: ( ( rule__Operation__OperationAritmeticAlternatives_1_0 ) )
            {
            // InternalOberon.g:6688:2: ( ( rule__Operation__OperationAritmeticAlternatives_1_0 ) )
            // InternalOberon.g:6689:3: ( rule__Operation__OperationAritmeticAlternatives_1_0 )
            {
             before(grammarAccess.getOperationAccess().getOperationAritmeticAlternatives_1_0()); 
            // InternalOberon.g:6690:3: ( rule__Operation__OperationAritmeticAlternatives_1_0 )
            // InternalOberon.g:6690:4: rule__Operation__OperationAritmeticAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Operation__OperationAritmeticAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getOperationAritmeticAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__OperationAritmeticAssignment_1"


    // $ANTLR start "rule__Operation__OperationLogicAssignment_2"
    // InternalOberon.g:6698:1: rule__Operation__OperationLogicAssignment_2 : ( ( rule__Operation__OperationLogicAlternatives_2_0 ) ) ;
    public final void rule__Operation__OperationLogicAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6702:1: ( ( ( rule__Operation__OperationLogicAlternatives_2_0 ) ) )
            // InternalOberon.g:6703:2: ( ( rule__Operation__OperationLogicAlternatives_2_0 ) )
            {
            // InternalOberon.g:6703:2: ( ( rule__Operation__OperationLogicAlternatives_2_0 ) )
            // InternalOberon.g:6704:3: ( rule__Operation__OperationLogicAlternatives_2_0 )
            {
             before(grammarAccess.getOperationAccess().getOperationLogicAlternatives_2_0()); 
            // InternalOberon.g:6705:3: ( rule__Operation__OperationLogicAlternatives_2_0 )
            // InternalOberon.g:6705:4: rule__Operation__OperationLogicAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Operation__OperationLogicAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getOperationLogicAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__OperationLogicAssignment_2"


    // $ANTLR start "rule__TExpression__ExpAssignment_0_1"
    // InternalOberon.g:6713:1: rule__TExpression__ExpAssignment_0_1 : ( ruleExpression ) ;
    public final void rule__TExpression__ExpAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6717:1: ( ( ruleExpression ) )
            // InternalOberon.g:6718:2: ( ruleExpression )
            {
            // InternalOberon.g:6718:2: ( ruleExpression )
            // InternalOberon.g:6719:3: ruleExpression
            {
             before(grammarAccess.getTExpressionAccess().getExpExpressionParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getTExpressionAccess().getExpExpressionParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TExpression__ExpAssignment_0_1"


    // $ANTLR start "rule__TExpression__IntvalueAssignment_1"
    // InternalOberon.g:6728:1: rule__TExpression__IntvalueAssignment_1 : ( ruleIntValue ) ;
    public final void rule__TExpression__IntvalueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6732:1: ( ( ruleIntValue ) )
            // InternalOberon.g:6733:2: ( ruleIntValue )
            {
            // InternalOberon.g:6733:2: ( ruleIntValue )
            // InternalOberon.g:6734:3: ruleIntValue
            {
             before(grammarAccess.getTExpressionAccess().getIntvalueIntValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIntValue();

            state._fsp--;

             after(grammarAccess.getTExpressionAccess().getIntvalueIntValueParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TExpression__IntvalueAssignment_1"


    // $ANTLR start "rule__TExpression__BoolvalueAssignment_2"
    // InternalOberon.g:6743:1: rule__TExpression__BoolvalueAssignment_2 : ( ruleBoolValue ) ;
    public final void rule__TExpression__BoolvalueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6747:1: ( ( ruleBoolValue ) )
            // InternalOberon.g:6748:2: ( ruleBoolValue )
            {
            // InternalOberon.g:6748:2: ( ruleBoolValue )
            // InternalOberon.g:6749:3: ruleBoolValue
            {
             before(grammarAccess.getTExpressionAccess().getBoolvalueBoolValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBoolValue();

            state._fsp--;

             after(grammarAccess.getTExpressionAccess().getBoolvalueBoolValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TExpression__BoolvalueAssignment_2"


    // $ANTLR start "rule__TExpression__NameAssignment_3_0"
    // InternalOberon.g:6758:1: rule__TExpression__NameAssignment_3_0 : ( RULE_ID ) ;
    public final void rule__TExpression__NameAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6762:1: ( ( RULE_ID ) )
            // InternalOberon.g:6763:2: ( RULE_ID )
            {
            // InternalOberon.g:6763:2: ( RULE_ID )
            // InternalOberon.g:6764:3: RULE_ID
            {
             before(grammarAccess.getTExpressionAccess().getNameIDTerminalRuleCall_3_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTExpressionAccess().getNameIDTerminalRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TExpression__NameAssignment_3_0"


    // $ANTLR start "rule__TExpression__ArgsAssignment_3_1_1"
    // InternalOberon.g:6773:1: rule__TExpression__ArgsAssignment_3_1_1 : ( ruleArguments ) ;
    public final void rule__TExpression__ArgsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6777:1: ( ( ruleArguments ) )
            // InternalOberon.g:6778:2: ( ruleArguments )
            {
            // InternalOberon.g:6778:2: ( ruleArguments )
            // InternalOberon.g:6779:3: ruleArguments
            {
             before(grammarAccess.getTExpressionAccess().getArgsArgumentsParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArguments();

            state._fsp--;

             after(grammarAccess.getTExpressionAccess().getArgsArgumentsParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TExpression__ArgsAssignment_3_1_1"


    // $ANTLR start "rule__TExpression__AtribsAssignment_3_2_1"
    // InternalOberon.g:6788:1: rule__TExpression__AtribsAssignment_3_2_1 : ( RULE_ID ) ;
    public final void rule__TExpression__AtribsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6792:1: ( ( RULE_ID ) )
            // InternalOberon.g:6793:2: ( RULE_ID )
            {
            // InternalOberon.g:6793:2: ( RULE_ID )
            // InternalOberon.g:6794:3: RULE_ID
            {
             before(grammarAccess.getTExpressionAccess().getAtribsIDTerminalRuleCall_3_2_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTExpressionAccess().getAtribsIDTerminalRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TExpression__AtribsAssignment_3_2_1"


    // $ANTLR start "rule__TExpression__IndexAssignment_3_3_1"
    // InternalOberon.g:6803:1: rule__TExpression__IndexAssignment_3_3_1 : ( ruleExpression ) ;
    public final void rule__TExpression__IndexAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6807:1: ( ( ruleExpression ) )
            // InternalOberon.g:6808:2: ( ruleExpression )
            {
            // InternalOberon.g:6808:2: ( ruleExpression )
            // InternalOberon.g:6809:3: ruleExpression
            {
             before(grammarAccess.getTExpressionAccess().getIndexExpressionParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getTExpressionAccess().getIndexExpressionParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TExpression__IndexAssignment_3_3_1"


    // $ANTLR start "rule__Statement__StmtAssignment_0"
    // InternalOberon.g:6818:1: rule__Statement__StmtAssignment_0 : ( ruleTStatement ) ;
    public final void rule__Statement__StmtAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6822:1: ( ( ruleTStatement ) )
            // InternalOberon.g:6823:2: ( ruleTStatement )
            {
            // InternalOberon.g:6823:2: ( ruleTStatement )
            // InternalOberon.g:6824:3: ruleTStatement
            {
             before(grammarAccess.getStatementAccess().getStmtTStatementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTStatement();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getStmtTStatementParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__StmtAssignment_0"


    // $ANTLR start "rule__Statement__StmtsAssignment_1_1"
    // InternalOberon.g:6833:1: rule__Statement__StmtsAssignment_1_1 : ( ruleStatement ) ;
    public final void rule__Statement__StmtsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6837:1: ( ( ruleStatement ) )
            // InternalOberon.g:6838:2: ( ruleStatement )
            {
            // InternalOberon.g:6838:2: ( ruleStatement )
            // InternalOberon.g:6839:3: ruleStatement
            {
             before(grammarAccess.getStatementAccess().getStmtsStatementParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getStmtsStatementParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__StmtsAssignment_1_1"


    // $ANTLR start "rule__TStatement__DesAssignment_0_0"
    // InternalOberon.g:6848:1: rule__TStatement__DesAssignment_0_0 : ( ruleDesignator ) ;
    public final void rule__TStatement__DesAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6852:1: ( ( ruleDesignator ) )
            // InternalOberon.g:6853:2: ( ruleDesignator )
            {
            // InternalOberon.g:6853:2: ( ruleDesignator )
            // InternalOberon.g:6854:3: ruleDesignator
            {
             before(grammarAccess.getTStatementAccess().getDesDesignatorParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDesignator();

            state._fsp--;

             after(grammarAccess.getTStatementAccess().getDesDesignatorParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__DesAssignment_0_0"


    // $ANTLR start "rule__TStatement__ExpAssignment_0_1_1"
    // InternalOberon.g:6863:1: rule__TStatement__ExpAssignment_0_1_1 : ( ruleExpression ) ;
    public final void rule__TStatement__ExpAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6867:1: ( ( ruleExpression ) )
            // InternalOberon.g:6868:2: ( ruleExpression )
            {
            // InternalOberon.g:6868:2: ( ruleExpression )
            // InternalOberon.g:6869:3: ruleExpression
            {
             before(grammarAccess.getTStatementAccess().getExpExpressionParserRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getTStatementAccess().getExpExpressionParserRuleCall_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__ExpAssignment_0_1_1"


    // $ANTLR start "rule__TStatement__VarAssignment_1_2"
    // InternalOberon.g:6878:1: rule__TStatement__VarAssignment_1_2 : ( RULE_ID ) ;
    public final void rule__TStatement__VarAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6882:1: ( ( RULE_ID ) )
            // InternalOberon.g:6883:2: ( RULE_ID )
            {
            // InternalOberon.g:6883:2: ( RULE_ID )
            // InternalOberon.g:6884:3: RULE_ID
            {
             before(grammarAccess.getTStatementAccess().getVarIDTerminalRuleCall_1_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTStatementAccess().getVarIDTerminalRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__VarAssignment_1_2"


    // $ANTLR start "rule__TStatement__ExpAssignment_2_2"
    // InternalOberon.g:6893:1: rule__TStatement__ExpAssignment_2_2 : ( ruleExpression ) ;
    public final void rule__TStatement__ExpAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6897:1: ( ( ruleExpression ) )
            // InternalOberon.g:6898:2: ( ruleExpression )
            {
            // InternalOberon.g:6898:2: ( ruleExpression )
            // InternalOberon.g:6899:3: ruleExpression
            {
             before(grammarAccess.getTStatementAccess().getExpExpressionParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getTStatementAccess().getExpExpressionParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__ExpAssignment_2_2"


    // $ANTLR start "rule__TStatement__CondAssignment_3_1"
    // InternalOberon.g:6908:1: rule__TStatement__CondAssignment_3_1 : ( ruleExpression ) ;
    public final void rule__TStatement__CondAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6912:1: ( ( ruleExpression ) )
            // InternalOberon.g:6913:2: ( ruleExpression )
            {
            // InternalOberon.g:6913:2: ( ruleExpression )
            // InternalOberon.g:6914:3: ruleExpression
            {
             before(grammarAccess.getTStatementAccess().getCondExpressionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getTStatementAccess().getCondExpressionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__CondAssignment_3_1"


    // $ANTLR start "rule__TStatement__ThenStmtAssignment_3_3"
    // InternalOberon.g:6923:1: rule__TStatement__ThenStmtAssignment_3_3 : ( ruleStatement ) ;
    public final void rule__TStatement__ThenStmtAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6927:1: ( ( ruleStatement ) )
            // InternalOberon.g:6928:2: ( ruleStatement )
            {
            // InternalOberon.g:6928:2: ( ruleStatement )
            // InternalOberon.g:6929:3: ruleStatement
            {
             before(grammarAccess.getTStatementAccess().getThenStmtStatementParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getTStatementAccess().getThenStmtStatementParserRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__ThenStmtAssignment_3_3"


    // $ANTLR start "rule__TStatement__ElsifsAssignment_3_4_1"
    // InternalOberon.g:6938:1: rule__TStatement__ElsifsAssignment_3_4_1 : ( ruleelseIfStmt ) ;
    public final void rule__TStatement__ElsifsAssignment_3_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6942:1: ( ( ruleelseIfStmt ) )
            // InternalOberon.g:6943:2: ( ruleelseIfStmt )
            {
            // InternalOberon.g:6943:2: ( ruleelseIfStmt )
            // InternalOberon.g:6944:3: ruleelseIfStmt
            {
             before(grammarAccess.getTStatementAccess().getElsifsElseIfStmtParserRuleCall_3_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleelseIfStmt();

            state._fsp--;

             after(grammarAccess.getTStatementAccess().getElsifsElseIfStmtParserRuleCall_3_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__ElsifsAssignment_3_4_1"


    // $ANTLR start "rule__TStatement__ElseStmtAssignment_3_5_1"
    // InternalOberon.g:6953:1: rule__TStatement__ElseStmtAssignment_3_5_1 : ( ruleStatement ) ;
    public final void rule__TStatement__ElseStmtAssignment_3_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6957:1: ( ( ruleStatement ) )
            // InternalOberon.g:6958:2: ( ruleStatement )
            {
            // InternalOberon.g:6958:2: ( ruleStatement )
            // InternalOberon.g:6959:3: ruleStatement
            {
             before(grammarAccess.getTStatementAccess().getElseStmtStatementParserRuleCall_3_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getTStatementAccess().getElseStmtStatementParserRuleCall_3_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__ElseStmtAssignment_3_5_1"


    // $ANTLR start "rule__TStatement__CondAssignment_4_1"
    // InternalOberon.g:6968:1: rule__TStatement__CondAssignment_4_1 : ( ruleExpression ) ;
    public final void rule__TStatement__CondAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6972:1: ( ( ruleExpression ) )
            // InternalOberon.g:6973:2: ( ruleExpression )
            {
            // InternalOberon.g:6973:2: ( ruleExpression )
            // InternalOberon.g:6974:3: ruleExpression
            {
             before(grammarAccess.getTStatementAccess().getCondExpressionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getTStatementAccess().getCondExpressionParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__CondAssignment_4_1"


    // $ANTLR start "rule__TStatement__StmtAssignment_4_3"
    // InternalOberon.g:6983:1: rule__TStatement__StmtAssignment_4_3 : ( ruleStatement ) ;
    public final void rule__TStatement__StmtAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:6987:1: ( ( ruleStatement ) )
            // InternalOberon.g:6988:2: ( ruleStatement )
            {
            // InternalOberon.g:6988:2: ( ruleStatement )
            // InternalOberon.g:6989:3: ruleStatement
            {
             before(grammarAccess.getTStatementAccess().getStmtStatementParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getTStatementAccess().getStmtStatementParserRuleCall_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__StmtAssignment_4_3"


    // $ANTLR start "rule__TStatement__StmtAssignment_5_1"
    // InternalOberon.g:6998:1: rule__TStatement__StmtAssignment_5_1 : ( ruleStatement ) ;
    public final void rule__TStatement__StmtAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:7002:1: ( ( ruleStatement ) )
            // InternalOberon.g:7003:2: ( ruleStatement )
            {
            // InternalOberon.g:7003:2: ( ruleStatement )
            // InternalOberon.g:7004:3: ruleStatement
            {
             before(grammarAccess.getTStatementAccess().getStmtStatementParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getTStatementAccess().getStmtStatementParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__StmtAssignment_5_1"


    // $ANTLR start "rule__TStatement__CondAssignment_5_3"
    // InternalOberon.g:7013:1: rule__TStatement__CondAssignment_5_3 : ( ruleExpression ) ;
    public final void rule__TStatement__CondAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:7017:1: ( ( ruleExpression ) )
            // InternalOberon.g:7018:2: ( ruleExpression )
            {
            // InternalOberon.g:7018:2: ( ruleExpression )
            // InternalOberon.g:7019:3: ruleExpression
            {
             before(grammarAccess.getTStatementAccess().getCondExpressionParserRuleCall_5_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getTStatementAccess().getCondExpressionParserRuleCall_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__CondAssignment_5_3"


    // $ANTLR start "rule__TStatement__InitAssignment_6_1"
    // InternalOberon.g:7028:1: rule__TStatement__InitAssignment_6_1 : ( ruleStatement ) ;
    public final void rule__TStatement__InitAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:7032:1: ( ( ruleStatement ) )
            // InternalOberon.g:7033:2: ( ruleStatement )
            {
            // InternalOberon.g:7033:2: ( ruleStatement )
            // InternalOberon.g:7034:3: ruleStatement
            {
             before(grammarAccess.getTStatementAccess().getInitStatementParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getTStatementAccess().getInitStatementParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__InitAssignment_6_1"


    // $ANTLR start "rule__TStatement__ConditionAssignment_6_3"
    // InternalOberon.g:7043:1: rule__TStatement__ConditionAssignment_6_3 : ( ruleExpression ) ;
    public final void rule__TStatement__ConditionAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:7047:1: ( ( ruleExpression ) )
            // InternalOberon.g:7048:2: ( ruleExpression )
            {
            // InternalOberon.g:7048:2: ( ruleExpression )
            // InternalOberon.g:7049:3: ruleExpression
            {
             before(grammarAccess.getTStatementAccess().getConditionExpressionParserRuleCall_6_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getTStatementAccess().getConditionExpressionParserRuleCall_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__ConditionAssignment_6_3"


    // $ANTLR start "rule__TStatement__StmtAssignment_6_5"
    // InternalOberon.g:7058:1: rule__TStatement__StmtAssignment_6_5 : ( ruleStatement ) ;
    public final void rule__TStatement__StmtAssignment_6_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:7062:1: ( ( ruleStatement ) )
            // InternalOberon.g:7063:2: ( ruleStatement )
            {
            // InternalOberon.g:7063:2: ( ruleStatement )
            // InternalOberon.g:7064:3: ruleStatement
            {
             before(grammarAccess.getTStatementAccess().getStmtStatementParserRuleCall_6_5_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getTStatementAccess().getStmtStatementParserRuleCall_6_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__StmtAssignment_6_5"


    // $ANTLR start "rule__TStatement__VarAssignment_7_1"
    // InternalOberon.g:7073:1: rule__TStatement__VarAssignment_7_1 : ( RULE_ID ) ;
    public final void rule__TStatement__VarAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:7077:1: ( ( RULE_ID ) )
            // InternalOberon.g:7078:2: ( RULE_ID )
            {
            // InternalOberon.g:7078:2: ( RULE_ID )
            // InternalOberon.g:7079:3: RULE_ID
            {
             before(grammarAccess.getTStatementAccess().getVarIDTerminalRuleCall_7_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTStatementAccess().getVarIDTerminalRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__VarAssignment_7_1"


    // $ANTLR start "rule__TStatement__MinAssignment_7_3"
    // InternalOberon.g:7088:1: rule__TStatement__MinAssignment_7_3 : ( ruleExpression ) ;
    public final void rule__TStatement__MinAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:7092:1: ( ( ruleExpression ) )
            // InternalOberon.g:7093:2: ( ruleExpression )
            {
            // InternalOberon.g:7093:2: ( ruleExpression )
            // InternalOberon.g:7094:3: ruleExpression
            {
             before(grammarAccess.getTStatementAccess().getMinExpressionParserRuleCall_7_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getTStatementAccess().getMinExpressionParserRuleCall_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__MinAssignment_7_3"


    // $ANTLR start "rule__TStatement__MaxAssignment_7_5"
    // InternalOberon.g:7103:1: rule__TStatement__MaxAssignment_7_5 : ( ruleExpression ) ;
    public final void rule__TStatement__MaxAssignment_7_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:7107:1: ( ( ruleExpression ) )
            // InternalOberon.g:7108:2: ( ruleExpression )
            {
            // InternalOberon.g:7108:2: ( ruleExpression )
            // InternalOberon.g:7109:3: ruleExpression
            {
             before(grammarAccess.getTStatementAccess().getMaxExpressionParserRuleCall_7_5_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getTStatementAccess().getMaxExpressionParserRuleCall_7_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__MaxAssignment_7_5"


    // $ANTLR start "rule__TStatement__StmtAssignment_7_7"
    // InternalOberon.g:7118:1: rule__TStatement__StmtAssignment_7_7 : ( ruleStatement ) ;
    public final void rule__TStatement__StmtAssignment_7_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:7122:1: ( ( ruleStatement ) )
            // InternalOberon.g:7123:2: ( ruleStatement )
            {
            // InternalOberon.g:7123:2: ( ruleStatement )
            // InternalOberon.g:7124:3: ruleStatement
            {
             before(grammarAccess.getTStatementAccess().getStmtStatementParserRuleCall_7_7_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getTStatementAccess().getStmtStatementParserRuleCall_7_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__StmtAssignment_7_7"


    // $ANTLR start "rule__TStatement__StmtAssignment_8_1"
    // InternalOberon.g:7133:1: rule__TStatement__StmtAssignment_8_1 : ( ruleStatement ) ;
    public final void rule__TStatement__StmtAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:7137:1: ( ( ruleStatement ) )
            // InternalOberon.g:7138:2: ( ruleStatement )
            {
            // InternalOberon.g:7138:2: ( ruleStatement )
            // InternalOberon.g:7139:3: ruleStatement
            {
             before(grammarAccess.getTStatementAccess().getStmtStatementParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getTStatementAccess().getStmtStatementParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__StmtAssignment_8_1"


    // $ANTLR start "rule__TStatement__ExpAssignment_9_1"
    // InternalOberon.g:7148:1: rule__TStatement__ExpAssignment_9_1 : ( ruleExpression ) ;
    public final void rule__TStatement__ExpAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:7152:1: ( ( ruleExpression ) )
            // InternalOberon.g:7153:2: ( ruleExpression )
            {
            // InternalOberon.g:7153:2: ( ruleExpression )
            // InternalOberon.g:7154:3: ruleExpression
            {
             before(grammarAccess.getTStatementAccess().getExpExpressionParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getTStatementAccess().getExpExpressionParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__ExpAssignment_9_1"


    // $ANTLR start "rule__TStatement__ExpAssignment_10_1"
    // InternalOberon.g:7163:1: rule__TStatement__ExpAssignment_10_1 : ( ruleExpression ) ;
    public final void rule__TStatement__ExpAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:7167:1: ( ( ruleExpression ) )
            // InternalOberon.g:7168:2: ( ruleExpression )
            {
            // InternalOberon.g:7168:2: ( ruleExpression )
            // InternalOberon.g:7169:3: ruleExpression
            {
             before(grammarAccess.getTStatementAccess().getExpExpressionParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getTStatementAccess().getExpExpressionParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__ExpAssignment_10_1"


    // $ANTLR start "rule__TStatement__CaseAssignment_10_3"
    // InternalOberon.g:7178:1: rule__TStatement__CaseAssignment_10_3 : ( rulecaseAlternative ) ;
    public final void rule__TStatement__CaseAssignment_10_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:7182:1: ( ( rulecaseAlternative ) )
            // InternalOberon.g:7183:2: ( rulecaseAlternative )
            {
            // InternalOberon.g:7183:2: ( rulecaseAlternative )
            // InternalOberon.g:7184:3: rulecaseAlternative
            {
             before(grammarAccess.getTStatementAccess().getCaseCaseAlternativeParserRuleCall_10_3_0()); 
            pushFollow(FOLLOW_2);
            rulecaseAlternative();

            state._fsp--;

             after(grammarAccess.getTStatementAccess().getCaseCaseAlternativeParserRuleCall_10_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__CaseAssignment_10_3"


    // $ANTLR start "rule__TStatement__CasesAssignment_10_4_1"
    // InternalOberon.g:7193:1: rule__TStatement__CasesAssignment_10_4_1 : ( rulecaseAlternative ) ;
    public final void rule__TStatement__CasesAssignment_10_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:7197:1: ( ( rulecaseAlternative ) )
            // InternalOberon.g:7198:2: ( rulecaseAlternative )
            {
            // InternalOberon.g:7198:2: ( rulecaseAlternative )
            // InternalOberon.g:7199:3: rulecaseAlternative
            {
             before(grammarAccess.getTStatementAccess().getCasesCaseAlternativeParserRuleCall_10_4_1_0()); 
            pushFollow(FOLLOW_2);
            rulecaseAlternative();

            state._fsp--;

             after(grammarAccess.getTStatementAccess().getCasesCaseAlternativeParserRuleCall_10_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__CasesAssignment_10_4_1"


    // $ANTLR start "rule__TStatement__ElseStmtAssignment_10_5_1"
    // InternalOberon.g:7208:1: rule__TStatement__ElseStmtAssignment_10_5_1 : ( ruleStatement ) ;
    public final void rule__TStatement__ElseStmtAssignment_10_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:7212:1: ( ( ruleStatement ) )
            // InternalOberon.g:7213:2: ( ruleStatement )
            {
            // InternalOberon.g:7213:2: ( ruleStatement )
            // InternalOberon.g:7214:3: ruleStatement
            {
             before(grammarAccess.getTStatementAccess().getElseStmtStatementParserRuleCall_10_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getTStatementAccess().getElseStmtStatementParserRuleCall_10_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__ElseStmtAssignment_10_5_1"


    // $ANTLR start "rule__TStatement__ExitAssignment_11"
    // InternalOberon.g:7223:1: rule__TStatement__ExitAssignment_11 : ( ( 'EXIT' ) ) ;
    public final void rule__TStatement__ExitAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:7227:1: ( ( ( 'EXIT' ) ) )
            // InternalOberon.g:7228:2: ( ( 'EXIT' ) )
            {
            // InternalOberon.g:7228:2: ( ( 'EXIT' ) )
            // InternalOberon.g:7229:3: ( 'EXIT' )
            {
             before(grammarAccess.getTStatementAccess().getExitEXITKeyword_11_0()); 
            // InternalOberon.g:7230:3: ( 'EXIT' )
            // InternalOberon.g:7231:4: 'EXIT'
            {
             before(grammarAccess.getTStatementAccess().getExitEXITKeyword_11_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getTStatementAccess().getExitEXITKeyword_11_0()); 

            }

             after(grammarAccess.getTStatementAccess().getExitEXITKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TStatement__ExitAssignment_11"


    // $ANTLR start "rule__Designator__DesignatorAssignment_0"
    // InternalOberon.g:7242:1: rule__Designator__DesignatorAssignment_0 : ( ruleTDesignator ) ;
    public final void rule__Designator__DesignatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:7246:1: ( ( ruleTDesignator ) )
            // InternalOberon.g:7247:2: ( ruleTDesignator )
            {
            // InternalOberon.g:7247:2: ( ruleTDesignator )
            // InternalOberon.g:7248:3: ruleTDesignator
            {
             before(grammarAccess.getDesignatorAccess().getDesignatorTDesignatorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTDesignator();

            state._fsp--;

             after(grammarAccess.getDesignatorAccess().getDesignatorTDesignatorParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Designator__DesignatorAssignment_0"


    // $ANTLR start "rule__Designator__IndexesAssignment_1_0_1"
    // InternalOberon.g:7257:1: rule__Designator__IndexesAssignment_1_0_1 : ( ruleExpression ) ;
    public final void rule__Designator__IndexesAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:7261:1: ( ( ruleExpression ) )
            // InternalOberon.g:7262:2: ( ruleExpression )
            {
            // InternalOberon.g:7262:2: ( ruleExpression )
            // InternalOberon.g:7263:3: ruleExpression
            {
             before(grammarAccess.getDesignatorAccess().getIndexesExpressionParserRuleCall_1_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getDesignatorAccess().getIndexesExpressionParserRuleCall_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Designator__IndexesAssignment_1_0_1"


    // $ANTLR start "rule__Designator__AtribsAssignment_1_1_1"
    // InternalOberon.g:7272:1: rule__Designator__AtribsAssignment_1_1_1 : ( RULE_ID ) ;
    public final void rule__Designator__AtribsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:7276:1: ( ( RULE_ID ) )
            // InternalOberon.g:7277:2: ( RULE_ID )
            {
            // InternalOberon.g:7277:2: ( RULE_ID )
            // InternalOberon.g:7278:3: RULE_ID
            {
             before(grammarAccess.getDesignatorAccess().getAtribsIDTerminalRuleCall_1_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDesignatorAccess().getAtribsIDTerminalRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Designator__AtribsAssignment_1_1_1"


    // $ANTLR start "rule__TDesignator__NameAssignment_0"
    // InternalOberon.g:7287:1: rule__TDesignator__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__TDesignator__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:7291:1: ( ( RULE_ID ) )
            // InternalOberon.g:7292:2: ( RULE_ID )
            {
            // InternalOberon.g:7292:2: ( RULE_ID )
            // InternalOberon.g:7293:3: RULE_ID
            {
             before(grammarAccess.getTDesignatorAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTDesignatorAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TDesignator__NameAssignment_0"


    // $ANTLR start "rule__TDesignator__ArgsAssignment_1_1"
    // InternalOberon.g:7302:1: rule__TDesignator__ArgsAssignment_1_1 : ( ruleArguments ) ;
    public final void rule__TDesignator__ArgsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:7306:1: ( ( ruleArguments ) )
            // InternalOberon.g:7307:2: ( ruleArguments )
            {
            // InternalOberon.g:7307:2: ( ruleArguments )
            // InternalOberon.g:7308:3: ruleArguments
            {
             before(grammarAccess.getTDesignatorAccess().getArgsArgumentsParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArguments();

            state._fsp--;

             after(grammarAccess.getTDesignatorAccess().getArgsArgumentsParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TDesignator__ArgsAssignment_1_1"


    // $ANTLR start "rule__CaseAlternative__ExpAssignment_0"
    // InternalOberon.g:7317:1: rule__CaseAlternative__ExpAssignment_0 : ( ruleExpression ) ;
    public final void rule__CaseAlternative__ExpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:7321:1: ( ( ruleExpression ) )
            // InternalOberon.g:7322:2: ( ruleExpression )
            {
            // InternalOberon.g:7322:2: ( ruleExpression )
            // InternalOberon.g:7323:3: ruleExpression
            {
             before(grammarAccess.getCaseAlternativeAccess().getExpExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getCaseAlternativeAccess().getExpExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseAlternative__ExpAssignment_0"


    // $ANTLR start "rule__CaseAlternative__MaxAssignment_1_1"
    // InternalOberon.g:7332:1: rule__CaseAlternative__MaxAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__CaseAlternative__MaxAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:7336:1: ( ( ruleExpression ) )
            // InternalOberon.g:7337:2: ( ruleExpression )
            {
            // InternalOberon.g:7337:2: ( ruleExpression )
            // InternalOberon.g:7338:3: ruleExpression
            {
             before(grammarAccess.getCaseAlternativeAccess().getMaxExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getCaseAlternativeAccess().getMaxExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseAlternative__MaxAssignment_1_1"


    // $ANTLR start "rule__CaseAlternative__StmtAssignment_3"
    // InternalOberon.g:7347:1: rule__CaseAlternative__StmtAssignment_3 : ( ruleStatement ) ;
    public final void rule__CaseAlternative__StmtAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:7351:1: ( ( ruleStatement ) )
            // InternalOberon.g:7352:2: ( ruleStatement )
            {
            // InternalOberon.g:7352:2: ( ruleStatement )
            // InternalOberon.g:7353:3: ruleStatement
            {
             before(grammarAccess.getCaseAlternativeAccess().getStmtStatementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getCaseAlternativeAccess().getStmtStatementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseAlternative__StmtAssignment_3"


    // $ANTLR start "rule__ElseIfStmt__CondAssignment_0"
    // InternalOberon.g:7362:1: rule__ElseIfStmt__CondAssignment_0 : ( ruleExpression ) ;
    public final void rule__ElseIfStmt__CondAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:7366:1: ( ( ruleExpression ) )
            // InternalOberon.g:7367:2: ( ruleExpression )
            {
            // InternalOberon.g:7367:2: ( ruleExpression )
            // InternalOberon.g:7368:3: ruleExpression
            {
             before(grammarAccess.getElseIfStmtAccess().getCondExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getElseIfStmtAccess().getCondExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfStmt__CondAssignment_0"


    // $ANTLR start "rule__ElseIfStmt__StmtAssignment_2"
    // InternalOberon.g:7377:1: rule__ElseIfStmt__StmtAssignment_2 : ( ruleStatement ) ;
    public final void rule__ElseIfStmt__StmtAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:7381:1: ( ( ruleStatement ) )
            // InternalOberon.g:7382:2: ( ruleStatement )
            {
            // InternalOberon.g:7382:2: ( ruleStatement )
            // InternalOberon.g:7383:3: ruleStatement
            {
             before(grammarAccess.getElseIfStmtAccess().getStmtStatementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getElseIfStmtAccess().getStmtStatementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfStmt__StmtAssignment_2"


    // $ANTLR start "rule__OberonType__NameAssignment_2"
    // InternalOberon.g:7392:1: rule__OberonType__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__OberonType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:7396:1: ( ( RULE_ID ) )
            // InternalOberon.g:7397:2: ( RULE_ID )
            {
            // InternalOberon.g:7397:2: ( RULE_ID )
            // InternalOberon.g:7398:3: RULE_ID
            {
             before(grammarAccess.getOberonTypeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOberonTypeAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OberonType__NameAssignment_2"


    // $ANTLR start "rule__OberonType__NumElementAssignment_3_1"
    // InternalOberon.g:7407:1: rule__OberonType__NumElementAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__OberonType__NumElementAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:7411:1: ( ( RULE_INT ) )
            // InternalOberon.g:7412:2: ( RULE_INT )
            {
            // InternalOberon.g:7412:2: ( RULE_INT )
            // InternalOberon.g:7413:3: RULE_INT
            {
             before(grammarAccess.getOberonTypeAccess().getNumElementINTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getOberonTypeAccess().getNumElementINTTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OberonType__NumElementAssignment_3_1"


    // $ANTLR start "rule__OberonType__NameTypeAssignment_3_3"
    // InternalOberon.g:7422:1: rule__OberonType__NameTypeAssignment_3_3 : ( ruleOberonType ) ;
    public final void rule__OberonType__NameTypeAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOberon.g:7426:1: ( ( ruleOberonType ) )
            // InternalOberon.g:7427:2: ( ruleOberonType )
            {
            // InternalOberon.g:7427:2: ( ruleOberonType )
            // InternalOberon.g:7428:3: ruleOberonType
            {
             before(grammarAccess.getOberonTypeAccess().getNameTypeOberonTypeParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_2);
            ruleOberonType();

            state._fsp--;

             after(grammarAccess.getOberonTypeAccess().getNameTypeOberonTypeParserRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OberonType__NameTypeAssignment_3_3"

    // Delegated rules


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA27 dfa27 = new DFA27(this);
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\1\5\6\uffff\1\5\4\uffff\1\32\2\uffff";
    static final String dfa_3s = "\1\100\6\uffff\1\100\4\uffff\1\70\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\11\1\12\1\13\1\14\1\uffff\1\7\1\10";
    static final String dfa_5s = "\17\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\46\uffff\1\2\1\3\1\4\3\uffff\1\5\1\uffff\1\6\1\uffff\1\7\3\uffff\1\10\1\11\1\12\3\uffff\1\13",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\14\46\uffff\3\15\3\uffff\1\15\1\uffff\1\15\1\uffff\1\15\3\uffff\3\15\3\uffff\1\15",
            "",
            "",
            "",
            "",
            "\1\15\1\uffff\1\15\12\uffff\1\15\1\uffff\1\15\1\uffff\1\15\13\uffff\1\15\1\16",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "832:1: rule__TStatement__Alternatives : ( ( ( rule__TStatement__Group_0__0 ) ) | ( ( rule__TStatement__Group_1__0 ) ) | ( ( rule__TStatement__Group_2__0 ) ) | ( ( rule__TStatement__Group_3__0 ) ) | ( ( rule__TStatement__Group_4__0 ) ) | ( ( rule__TStatement__Group_5__0 ) ) | ( ( rule__TStatement__Group_6__0 ) ) | ( ( rule__TStatement__Group_7__0 ) ) | ( ( rule__TStatement__Group_8__0 ) ) | ( ( rule__TStatement__Group_9__0 ) ) | ( ( rule__TStatement__Group_10__0 ) ) | ( ( rule__TStatement__ExitAssignment_11 ) ) );";
        }
    }
    static final String dfa_7s = "\16\uffff";
    static final String dfa_8s = "\1\1\15\uffff";
    static final String dfa_9s = "\1\5\15\uffff";
    static final String dfa_10s = "\1\100\15\uffff";
    static final String dfa_11s = "\1\uffff\1\2\14\1";
    static final String dfa_12s = "\16\uffff}>";
    static final String[] dfa_13s = {
            "\1\1\7\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\uffff\2\1\6\uffff\1\1\1\uffff\2\1\2\uffff\1\1\1\uffff\1\1\1\uffff\14\1\1\uffff\5\1\2\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "()* loopback of 3086:2: ( rule__Expression__Group_1__0 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000041C0000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x1C54700008000020L,0x0000000000000001L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x1C54700000000022L,0x0000000000000001L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0xC000000200000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000008000001830L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000010000000020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001004000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000001FFE000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000001FFE002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000028010000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000018000001830L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x1C54700000000020L,0x0000000000000001L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0003000008000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x2002000008000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000020010000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000020010000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0200001000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x8000000000000000L});

}