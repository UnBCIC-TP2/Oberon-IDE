package br.unb.cic.obron.ide.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import br.unb.cic.obron.ide.services.OberonGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOberonParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'MODULE'", "';'", "'END'", "'.'", "'BEGIN'", "'TYPE'", "'CONST'", "'VAR'", "'='", "'ARRAY'", "'OF'", "'RECORD'", "','", "':'", "'PROCEDURE'", "'('", "')'", "'#'", "'<'", "'<='", "'>'", "'>='", "'*'", "'/'", "'+'", "'-'", "'&&'", "'||'", "'['", "']'", "':='", "'readInt'", "'write'", "'IF'", "'THEN'", "'ELSIF'", "'ELSE'", "'WHILE'", "'DO'", "'REPEAT'", "'UNTIL'", "'FOR'", "'TO'", "'IN'", "'..'", "'LOOP'", "'RETURN'", "'CASE'", "'|'", "'EXIT'", "'INTEGER'", "'BOOLEAN'", "'True'", "'False'"
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
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
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

        public InternalOberonParser(TokenStream input, OberonGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Oberon";
       	}

       	@Override
       	protected OberonGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleOberon"
    // InternalOberon.g:64:1: entryRuleOberon returns [EObject current=null] : iv_ruleOberon= ruleOberon EOF ;
    public final EObject entryRuleOberon() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOberon = null;


        try {
            // InternalOberon.g:64:47: (iv_ruleOberon= ruleOberon EOF )
            // InternalOberon.g:65:2: iv_ruleOberon= ruleOberon EOF
            {
             newCompositeNode(grammarAccess.getOberonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOberon=ruleOberon();

            state._fsp--;

             current =iv_ruleOberon; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOberon"


    // $ANTLR start "ruleOberon"
    // InternalOberon.g:71:1: ruleOberon returns [EObject current=null] : (otherlv_0= 'MODULE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_declaration_3_0= ruleDeclarations ) ) ( (lv_block_4_0= ruleBlock ) )? otherlv_5= 'END' this_ID_6= RULE_ID otherlv_7= '.' ) ;
    public final EObject ruleOberon() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token this_ID_6=null;
        Token otherlv_7=null;
        EObject lv_declaration_3_0 = null;

        EObject lv_block_4_0 = null;



        	enterRule();

        try {
            // InternalOberon.g:77:2: ( (otherlv_0= 'MODULE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_declaration_3_0= ruleDeclarations ) ) ( (lv_block_4_0= ruleBlock ) )? otherlv_5= 'END' this_ID_6= RULE_ID otherlv_7= '.' ) )
            // InternalOberon.g:78:2: (otherlv_0= 'MODULE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_declaration_3_0= ruleDeclarations ) ) ( (lv_block_4_0= ruleBlock ) )? otherlv_5= 'END' this_ID_6= RULE_ID otherlv_7= '.' )
            {
            // InternalOberon.g:78:2: (otherlv_0= 'MODULE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_declaration_3_0= ruleDeclarations ) ) ( (lv_block_4_0= ruleBlock ) )? otherlv_5= 'END' this_ID_6= RULE_ID otherlv_7= '.' )
            // InternalOberon.g:79:3: otherlv_0= 'MODULE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_declaration_3_0= ruleDeclarations ) ) ( (lv_block_4_0= ruleBlock ) )? otherlv_5= 'END' this_ID_6= RULE_ID otherlv_7= '.'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOberonAccess().getMODULEKeyword_0());
            		
            // InternalOberon.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOberon.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOberon.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalOberon.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getOberonAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOberonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getOberonAccess().getSemicolonKeyword_2());
            		
            // InternalOberon.g:105:3: ( (lv_declaration_3_0= ruleDeclarations ) )
            // InternalOberon.g:106:4: (lv_declaration_3_0= ruleDeclarations )
            {
            // InternalOberon.g:106:4: (lv_declaration_3_0= ruleDeclarations )
            // InternalOberon.g:107:5: lv_declaration_3_0= ruleDeclarations
            {

            					newCompositeNode(grammarAccess.getOberonAccess().getDeclarationDeclarationsParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_declaration_3_0=ruleDeclarations();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOberonRule());
            					}
            					set(
            						current,
            						"declaration",
            						lv_declaration_3_0,
            						"br.unb.cic.obron.ide.Oberon.Declarations");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOberon.g:124:3: ( (lv_block_4_0= ruleBlock ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalOberon.g:125:4: (lv_block_4_0= ruleBlock )
                    {
                    // InternalOberon.g:125:4: (lv_block_4_0= ruleBlock )
                    // InternalOberon.g:126:5: lv_block_4_0= ruleBlock
                    {

                    					newCompositeNode(grammarAccess.getOberonAccess().getBlockBlockParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_block_4_0=ruleBlock();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getOberonRule());
                    					}
                    					set(
                    						current,
                    						"block",
                    						lv_block_4_0,
                    						"br.unb.cic.obron.ide.Oberon.Block");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getOberonAccess().getENDKeyword_5());
            		
            this_ID_6=(Token)match(input,RULE_ID,FOLLOW_8); 

            			newLeafNode(this_ID_6, grammarAccess.getOberonAccess().getIDTerminalRuleCall_6());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getOberonAccess().getFullStopKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOberon"


    // $ANTLR start "entryRuleBlock"
    // InternalOberon.g:159:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalOberon.g:159:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalOberon.g:160:2: iv_ruleBlock= ruleBlock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBlock=ruleBlock();

            state._fsp--;

             current =iv_ruleBlock; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalOberon.g:166:1: ruleBlock returns [EObject current=null] : ( () otherlv_1= 'BEGIN' ( (lv_stmt_2_0= ruleStatement ) )* otherlv_3= 'END' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_stmt_2_0 = null;



        	enterRule();

        try {
            // InternalOberon.g:172:2: ( ( () otherlv_1= 'BEGIN' ( (lv_stmt_2_0= ruleStatement ) )* otherlv_3= 'END' ) )
            // InternalOberon.g:173:2: ( () otherlv_1= 'BEGIN' ( (lv_stmt_2_0= ruleStatement ) )* otherlv_3= 'END' )
            {
            // InternalOberon.g:173:2: ( () otherlv_1= 'BEGIN' ( (lv_stmt_2_0= ruleStatement ) )* otherlv_3= 'END' )
            // InternalOberon.g:174:3: () otherlv_1= 'BEGIN' ( (lv_stmt_2_0= ruleStatement ) )* otherlv_3= 'END'
            {
            // InternalOberon.g:174:3: ()
            // InternalOberon.g:175:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBlockAccess().getBlockAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getBlockAccess().getBEGINKeyword_1());
            		
            // InternalOberon.g:185:3: ( (lv_stmt_2_0= ruleStatement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||(LA2_0>=42 && LA2_0<=44)||LA2_0==48||LA2_0==50||LA2_0==52||(LA2_0>=56 && LA2_0<=58)||LA2_0==60) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalOberon.g:186:4: (lv_stmt_2_0= ruleStatement )
            	    {
            	    // InternalOberon.g:186:4: (lv_stmt_2_0= ruleStatement )
            	    // InternalOberon.g:187:5: lv_stmt_2_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getBlockAccess().getStmtStatementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_stmt_2_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBlockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"stmt",
            	    						lv_stmt_2_0,
            	    						"br.unb.cic.obron.ide.Oberon.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getBlockAccess().getENDKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleDeclarations"
    // InternalOberon.g:212:1: entryRuleDeclarations returns [EObject current=null] : iv_ruleDeclarations= ruleDeclarations EOF ;
    public final EObject entryRuleDeclarations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarations = null;


        try {
            // InternalOberon.g:212:53: (iv_ruleDeclarations= ruleDeclarations EOF )
            // InternalOberon.g:213:2: iv_ruleDeclarations= ruleDeclarations EOF
            {
             newCompositeNode(grammarAccess.getDeclarationsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclarations=ruleDeclarations();

            state._fsp--;

             current =iv_ruleDeclarations; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclarations"


    // $ANTLR start "ruleDeclarations"
    // InternalOberon.g:219:1: ruleDeclarations returns [EObject current=null] : ( () (otherlv_1= 'TYPE' ( (lv_types_2_0= ruleUserTypeDeclaration ) )+ )? (otherlv_3= 'CONST' ( (lv_consts_4_0= ruleConstant ) )+ )? (otherlv_5= 'VAR' ( (lv_vars_6_0= ruleVarDeclaration ) )+ )? ( (lv_proc_7_0= ruleProcedure ) )* ) ;
    public final EObject ruleDeclarations() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_types_2_0 = null;

        EObject lv_consts_4_0 = null;

        EObject lv_vars_6_0 = null;

        EObject lv_proc_7_0 = null;



        	enterRule();

        try {
            // InternalOberon.g:225:2: ( ( () (otherlv_1= 'TYPE' ( (lv_types_2_0= ruleUserTypeDeclaration ) )+ )? (otherlv_3= 'CONST' ( (lv_consts_4_0= ruleConstant ) )+ )? (otherlv_5= 'VAR' ( (lv_vars_6_0= ruleVarDeclaration ) )+ )? ( (lv_proc_7_0= ruleProcedure ) )* ) )
            // InternalOberon.g:226:2: ( () (otherlv_1= 'TYPE' ( (lv_types_2_0= ruleUserTypeDeclaration ) )+ )? (otherlv_3= 'CONST' ( (lv_consts_4_0= ruleConstant ) )+ )? (otherlv_5= 'VAR' ( (lv_vars_6_0= ruleVarDeclaration ) )+ )? ( (lv_proc_7_0= ruleProcedure ) )* )
            {
            // InternalOberon.g:226:2: ( () (otherlv_1= 'TYPE' ( (lv_types_2_0= ruleUserTypeDeclaration ) )+ )? (otherlv_3= 'CONST' ( (lv_consts_4_0= ruleConstant ) )+ )? (otherlv_5= 'VAR' ( (lv_vars_6_0= ruleVarDeclaration ) )+ )? ( (lv_proc_7_0= ruleProcedure ) )* )
            // InternalOberon.g:227:3: () (otherlv_1= 'TYPE' ( (lv_types_2_0= ruleUserTypeDeclaration ) )+ )? (otherlv_3= 'CONST' ( (lv_consts_4_0= ruleConstant ) )+ )? (otherlv_5= 'VAR' ( (lv_vars_6_0= ruleVarDeclaration ) )+ )? ( (lv_proc_7_0= ruleProcedure ) )*
            {
            // InternalOberon.g:227:3: ()
            // InternalOberon.g:228:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDeclarationsAccess().getDeclararionAction_0(),
            					current);
            			

            }

            // InternalOberon.g:234:3: (otherlv_1= 'TYPE' ( (lv_types_2_0= ruleUserTypeDeclaration ) )+ )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalOberon.g:235:4: otherlv_1= 'TYPE' ( (lv_types_2_0= ruleUserTypeDeclaration ) )+
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getDeclarationsAccess().getTYPEKeyword_1_0());
                    			
                    // InternalOberon.g:239:4: ( (lv_types_2_0= ruleUserTypeDeclaration ) )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_ID) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalOberon.g:240:5: (lv_types_2_0= ruleUserTypeDeclaration )
                    	    {
                    	    // InternalOberon.g:240:5: (lv_types_2_0= ruleUserTypeDeclaration )
                    	    // InternalOberon.g:241:6: lv_types_2_0= ruleUserTypeDeclaration
                    	    {

                    	    						newCompositeNode(grammarAccess.getDeclarationsAccess().getTypesUserTypeDeclarationParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_10);
                    	    lv_types_2_0=ruleUserTypeDeclaration();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getDeclarationsRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"types",
                    	    							lv_types_2_0,
                    	    							"br.unb.cic.obron.ide.Oberon.UserTypeDeclaration");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);


                    }
                    break;

            }

            // InternalOberon.g:259:3: (otherlv_3= 'CONST' ( (lv_consts_4_0= ruleConstant ) )+ )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalOberon.g:260:4: otherlv_3= 'CONST' ( (lv_consts_4_0= ruleConstant ) )+
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getDeclarationsAccess().getCONSTKeyword_2_0());
                    			
                    // InternalOberon.g:264:4: ( (lv_consts_4_0= ruleConstant ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_ID) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalOberon.g:265:5: (lv_consts_4_0= ruleConstant )
                    	    {
                    	    // InternalOberon.g:265:5: (lv_consts_4_0= ruleConstant )
                    	    // InternalOberon.g:266:6: lv_consts_4_0= ruleConstant
                    	    {

                    	    						newCompositeNode(grammarAccess.getDeclarationsAccess().getConstsConstantParserRuleCall_2_1_0());
                    	    					
                    	    pushFollow(FOLLOW_11);
                    	    lv_consts_4_0=ruleConstant();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getDeclarationsRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"consts",
                    	    							lv_consts_4_0,
                    	    							"br.unb.cic.obron.ide.Oberon.Constant");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    }
                    break;

            }

            // InternalOberon.g:284:3: (otherlv_5= 'VAR' ( (lv_vars_6_0= ruleVarDeclaration ) )+ )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalOberon.g:285:4: otherlv_5= 'VAR' ( (lv_vars_6_0= ruleVarDeclaration ) )+
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getDeclarationsAccess().getVARKeyword_3_0());
                    			
                    // InternalOberon.g:289:4: ( (lv_vars_6_0= ruleVarDeclaration ) )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==RULE_ID) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalOberon.g:290:5: (lv_vars_6_0= ruleVarDeclaration )
                    	    {
                    	    // InternalOberon.g:290:5: (lv_vars_6_0= ruleVarDeclaration )
                    	    // InternalOberon.g:291:6: lv_vars_6_0= ruleVarDeclaration
                    	    {

                    	    						newCompositeNode(grammarAccess.getDeclarationsAccess().getVarsVarDeclarationParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_12);
                    	    lv_vars_6_0=ruleVarDeclaration();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getDeclarationsRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"vars",
                    	    							lv_vars_6_0,
                    	    							"br.unb.cic.obron.ide.Oberon.VarDeclaration");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);


                    }
                    break;

            }

            // InternalOberon.g:309:3: ( (lv_proc_7_0= ruleProcedure ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==25) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalOberon.g:310:4: (lv_proc_7_0= ruleProcedure )
            	    {
            	    // InternalOberon.g:310:4: (lv_proc_7_0= ruleProcedure )
            	    // InternalOberon.g:311:5: lv_proc_7_0= ruleProcedure
            	    {

            	    					newCompositeNode(grammarAccess.getDeclarationsAccess().getProcProcedureParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_proc_7_0=ruleProcedure();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDeclarationsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"proc",
            	    						lv_proc_7_0,
            	    						"br.unb.cic.obron.ide.Oberon.Procedure");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclarations"


    // $ANTLR start "entryRuleUserTypeDeclaration"
    // InternalOberon.g:332:1: entryRuleUserTypeDeclaration returns [EObject current=null] : iv_ruleUserTypeDeclaration= ruleUserTypeDeclaration EOF ;
    public final EObject entryRuleUserTypeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserTypeDeclaration = null;


        try {
            // InternalOberon.g:332:60: (iv_ruleUserTypeDeclaration= ruleUserTypeDeclaration EOF )
            // InternalOberon.g:333:2: iv_ruleUserTypeDeclaration= ruleUserTypeDeclaration EOF
            {
             newCompositeNode(grammarAccess.getUserTypeDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUserTypeDeclaration=ruleUserTypeDeclaration();

            state._fsp--;

             current =iv_ruleUserTypeDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUserTypeDeclaration"


    // $ANTLR start "ruleUserTypeDeclaration"
    // InternalOberon.g:339:1: ruleUserTypeDeclaration returns [EObject current=null] : ( ( ( (lv_nameType_0_0= RULE_ID ) ) otherlv_1= '=' (otherlv_2= 'ARRAY' ( (lv_length_3_0= RULE_INT ) ) otherlv_4= 'OF' ( (lv_vartype_5_0= ruleOberonType ) ) ) ) | ( ( (lv_nameType_6_0= RULE_ID ) ) otherlv_7= '=' (otherlv_8= 'RECORD' ( (lv_vars_9_0= ruleVarDeclaration ) )+ otherlv_10= 'END' ) ) ) ;
    public final EObject ruleUserTypeDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_nameType_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_length_3_0=null;
        Token otherlv_4=null;
        Token lv_nameType_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_vartype_5_0 = null;

        EObject lv_vars_9_0 = null;



        	enterRule();

        try {
            // InternalOberon.g:345:2: ( ( ( ( (lv_nameType_0_0= RULE_ID ) ) otherlv_1= '=' (otherlv_2= 'ARRAY' ( (lv_length_3_0= RULE_INT ) ) otherlv_4= 'OF' ( (lv_vartype_5_0= ruleOberonType ) ) ) ) | ( ( (lv_nameType_6_0= RULE_ID ) ) otherlv_7= '=' (otherlv_8= 'RECORD' ( (lv_vars_9_0= ruleVarDeclaration ) )+ otherlv_10= 'END' ) ) ) )
            // InternalOberon.g:346:2: ( ( ( (lv_nameType_0_0= RULE_ID ) ) otherlv_1= '=' (otherlv_2= 'ARRAY' ( (lv_length_3_0= RULE_INT ) ) otherlv_4= 'OF' ( (lv_vartype_5_0= ruleOberonType ) ) ) ) | ( ( (lv_nameType_6_0= RULE_ID ) ) otherlv_7= '=' (otherlv_8= 'RECORD' ( (lv_vars_9_0= ruleVarDeclaration ) )+ otherlv_10= 'END' ) ) )
            {
            // InternalOberon.g:346:2: ( ( ( (lv_nameType_0_0= RULE_ID ) ) otherlv_1= '=' (otherlv_2= 'ARRAY' ( (lv_length_3_0= RULE_INT ) ) otherlv_4= 'OF' ( (lv_vartype_5_0= ruleOberonType ) ) ) ) | ( ( (lv_nameType_6_0= RULE_ID ) ) otherlv_7= '=' (otherlv_8= 'RECORD' ( (lv_vars_9_0= ruleVarDeclaration ) )+ otherlv_10= 'END' ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==19) ) {
                    int LA11_2 = input.LA(3);

                    if ( (LA11_2==22) ) {
                        alt11=2;
                    }
                    else if ( (LA11_2==20) ) {
                        alt11=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalOberon.g:347:3: ( ( (lv_nameType_0_0= RULE_ID ) ) otherlv_1= '=' (otherlv_2= 'ARRAY' ( (lv_length_3_0= RULE_INT ) ) otherlv_4= 'OF' ( (lv_vartype_5_0= ruleOberonType ) ) ) )
                    {
                    // InternalOberon.g:347:3: ( ( (lv_nameType_0_0= RULE_ID ) ) otherlv_1= '=' (otherlv_2= 'ARRAY' ( (lv_length_3_0= RULE_INT ) ) otherlv_4= 'OF' ( (lv_vartype_5_0= ruleOberonType ) ) ) )
                    // InternalOberon.g:348:4: ( (lv_nameType_0_0= RULE_ID ) ) otherlv_1= '=' (otherlv_2= 'ARRAY' ( (lv_length_3_0= RULE_INT ) ) otherlv_4= 'OF' ( (lv_vartype_5_0= ruleOberonType ) ) )
                    {
                    // InternalOberon.g:348:4: ( (lv_nameType_0_0= RULE_ID ) )
                    // InternalOberon.g:349:5: (lv_nameType_0_0= RULE_ID )
                    {
                    // InternalOberon.g:349:5: (lv_nameType_0_0= RULE_ID )
                    // InternalOberon.g:350:6: lv_nameType_0_0= RULE_ID
                    {
                    lv_nameType_0_0=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(lv_nameType_0_0, grammarAccess.getUserTypeDeclarationAccess().getNameTypeIDTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUserTypeDeclarationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"nameType",
                    							lv_nameType_0_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,19,FOLLOW_15); 

                    				newLeafNode(otherlv_1, grammarAccess.getUserTypeDeclarationAccess().getEqualsSignKeyword_0_1());
                    			
                    // InternalOberon.g:370:4: (otherlv_2= 'ARRAY' ( (lv_length_3_0= RULE_INT ) ) otherlv_4= 'OF' ( (lv_vartype_5_0= ruleOberonType ) ) )
                    // InternalOberon.g:371:5: otherlv_2= 'ARRAY' ( (lv_length_3_0= RULE_INT ) ) otherlv_4= 'OF' ( (lv_vartype_5_0= ruleOberonType ) )
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_16); 

                    					newLeafNode(otherlv_2, grammarAccess.getUserTypeDeclarationAccess().getARRAYKeyword_0_2_0());
                    				
                    // InternalOberon.g:375:5: ( (lv_length_3_0= RULE_INT ) )
                    // InternalOberon.g:376:6: (lv_length_3_0= RULE_INT )
                    {
                    // InternalOberon.g:376:6: (lv_length_3_0= RULE_INT )
                    // InternalOberon.g:377:7: lv_length_3_0= RULE_INT
                    {
                    lv_length_3_0=(Token)match(input,RULE_INT,FOLLOW_17); 

                    							newLeafNode(lv_length_3_0, grammarAccess.getUserTypeDeclarationAccess().getLengthINTTerminalRuleCall_0_2_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getUserTypeDeclarationRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"length",
                    								lv_length_3_0,
                    								"org.eclipse.xtext.common.Terminals.INT");
                    						

                    }


                    }

                    otherlv_4=(Token)match(input,21,FOLLOW_18); 

                    					newLeafNode(otherlv_4, grammarAccess.getUserTypeDeclarationAccess().getOFKeyword_0_2_2());
                    				
                    // InternalOberon.g:397:5: ( (lv_vartype_5_0= ruleOberonType ) )
                    // InternalOberon.g:398:6: (lv_vartype_5_0= ruleOberonType )
                    {
                    // InternalOberon.g:398:6: (lv_vartype_5_0= ruleOberonType )
                    // InternalOberon.g:399:7: lv_vartype_5_0= ruleOberonType
                    {

                    							newCompositeNode(grammarAccess.getUserTypeDeclarationAccess().getVartypeOberonTypeParserRuleCall_0_2_3_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_vartype_5_0=ruleOberonType();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getUserTypeDeclarationRule());
                    							}
                    							set(
                    								current,
                    								"vartype",
                    								lv_vartype_5_0,
                    								"br.unb.cic.obron.ide.Oberon.OberonType");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOberon.g:419:3: ( ( (lv_nameType_6_0= RULE_ID ) ) otherlv_7= '=' (otherlv_8= 'RECORD' ( (lv_vars_9_0= ruleVarDeclaration ) )+ otherlv_10= 'END' ) )
                    {
                    // InternalOberon.g:419:3: ( ( (lv_nameType_6_0= RULE_ID ) ) otherlv_7= '=' (otherlv_8= 'RECORD' ( (lv_vars_9_0= ruleVarDeclaration ) )+ otherlv_10= 'END' ) )
                    // InternalOberon.g:420:4: ( (lv_nameType_6_0= RULE_ID ) ) otherlv_7= '=' (otherlv_8= 'RECORD' ( (lv_vars_9_0= ruleVarDeclaration ) )+ otherlv_10= 'END' )
                    {
                    // InternalOberon.g:420:4: ( (lv_nameType_6_0= RULE_ID ) )
                    // InternalOberon.g:421:5: (lv_nameType_6_0= RULE_ID )
                    {
                    // InternalOberon.g:421:5: (lv_nameType_6_0= RULE_ID )
                    // InternalOberon.g:422:6: lv_nameType_6_0= RULE_ID
                    {
                    lv_nameType_6_0=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(lv_nameType_6_0, grammarAccess.getUserTypeDeclarationAccess().getNameTypeIDTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUserTypeDeclarationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"nameType",
                    							lv_nameType_6_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,19,FOLLOW_19); 

                    				newLeafNode(otherlv_7, grammarAccess.getUserTypeDeclarationAccess().getEqualsSignKeyword_1_1());
                    			
                    // InternalOberon.g:442:4: (otherlv_8= 'RECORD' ( (lv_vars_9_0= ruleVarDeclaration ) )+ otherlv_10= 'END' )
                    // InternalOberon.g:443:5: otherlv_8= 'RECORD' ( (lv_vars_9_0= ruleVarDeclaration ) )+ otherlv_10= 'END'
                    {
                    otherlv_8=(Token)match(input,22,FOLLOW_3); 

                    					newLeafNode(otherlv_8, grammarAccess.getUserTypeDeclarationAccess().getRECORDKeyword_1_2_0());
                    				
                    // InternalOberon.g:447:5: ( (lv_vars_9_0= ruleVarDeclaration ) )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==RULE_ID) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalOberon.g:448:6: (lv_vars_9_0= ruleVarDeclaration )
                    	    {
                    	    // InternalOberon.g:448:6: (lv_vars_9_0= ruleVarDeclaration )
                    	    // InternalOberon.g:449:7: lv_vars_9_0= ruleVarDeclaration
                    	    {

                    	    							newCompositeNode(grammarAccess.getUserTypeDeclarationAccess().getVarsVarDeclarationParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    lv_vars_9_0=ruleVarDeclaration();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getUserTypeDeclarationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"vars",
                    	    								lv_vars_9_0,
                    	    								"br.unb.cic.obron.ide.Oberon.VarDeclaration");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);

                    otherlv_10=(Token)match(input,13,FOLLOW_2); 

                    					newLeafNode(otherlv_10, grammarAccess.getUserTypeDeclarationAccess().getENDKeyword_1_2_2());
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUserTypeDeclaration"


    // $ANTLR start "entryRuleConstant"
    // InternalOberon.g:476:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // InternalOberon.g:476:49: (iv_ruleConstant= ruleConstant EOF )
            // InternalOberon.g:477:2: iv_ruleConstant= ruleConstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstant=ruleConstant();

            state._fsp--;

             current =iv_ruleConstant; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalOberon.g:483:1: ruleConstant returns [EObject current=null] : ( ( (lv_constName_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleExpression ) ) otherlv_3= ';' ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token lv_constName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalOberon.g:489:2: ( ( ( (lv_constName_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleExpression ) ) otherlv_3= ';' ) )
            // InternalOberon.g:490:2: ( ( (lv_constName_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleExpression ) ) otherlv_3= ';' )
            {
            // InternalOberon.g:490:2: ( ( (lv_constName_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleExpression ) ) otherlv_3= ';' )
            // InternalOberon.g:491:3: ( (lv_constName_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleExpression ) ) otherlv_3= ';'
            {
            // InternalOberon.g:491:3: ( (lv_constName_0_0= RULE_ID ) )
            // InternalOberon.g:492:4: (lv_constName_0_0= RULE_ID )
            {
            // InternalOberon.g:492:4: (lv_constName_0_0= RULE_ID )
            // InternalOberon.g:493:5: lv_constName_0_0= RULE_ID
            {
            lv_constName_0_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_constName_0_0, grammarAccess.getConstantAccess().getConstNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"constName",
            						lv_constName_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getConstantAccess().getEqualsSignKeyword_1());
            		
            // InternalOberon.g:513:3: ( (lv_exp_2_0= ruleExpression ) )
            // InternalOberon.g:514:4: (lv_exp_2_0= ruleExpression )
            {
            // InternalOberon.g:514:4: (lv_exp_2_0= ruleExpression )
            // InternalOberon.g:515:5: lv_exp_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getConstantAccess().getExpExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_exp_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstantRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_2_0,
            						"br.unb.cic.obron.ide.Oberon.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getConstantAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleVarDeclaration"
    // InternalOberon.g:540:1: entryRuleVarDeclaration returns [EObject current=null] : iv_ruleVarDeclaration= ruleVarDeclaration EOF ;
    public final EObject entryRuleVarDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDeclaration = null;


        try {
            // InternalOberon.g:540:55: (iv_ruleVarDeclaration= ruleVarDeclaration EOF )
            // InternalOberon.g:541:2: iv_ruleVarDeclaration= ruleVarDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVarDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarDeclaration=ruleVarDeclaration();

            state._fsp--;

             current =iv_ruleVarDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarDeclaration"


    // $ANTLR start "ruleVarDeclaration"
    // InternalOberon.g:547:1: ruleVarDeclaration returns [EObject current=null] : ( ( ( (lv_vars_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_ID ) ) )* ) otherlv_3= ':' ( (lv_varType_4_0= ruleOberonType ) ) otherlv_5= ';' ) ;
    public final EObject ruleVarDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_vars_0_0=null;
        Token otherlv_1=null;
        Token lv_vars_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_varType_4_0 = null;



        	enterRule();

        try {
            // InternalOberon.g:553:2: ( ( ( ( (lv_vars_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_ID ) ) )* ) otherlv_3= ':' ( (lv_varType_4_0= ruleOberonType ) ) otherlv_5= ';' ) )
            // InternalOberon.g:554:2: ( ( ( (lv_vars_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_ID ) ) )* ) otherlv_3= ':' ( (lv_varType_4_0= ruleOberonType ) ) otherlv_5= ';' )
            {
            // InternalOberon.g:554:2: ( ( ( (lv_vars_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_ID ) ) )* ) otherlv_3= ':' ( (lv_varType_4_0= ruleOberonType ) ) otherlv_5= ';' )
            // InternalOberon.g:555:3: ( ( (lv_vars_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_ID ) ) )* ) otherlv_3= ':' ( (lv_varType_4_0= ruleOberonType ) ) otherlv_5= ';'
            {
            // InternalOberon.g:555:3: ( ( (lv_vars_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_ID ) ) )* )
            // InternalOberon.g:556:4: ( (lv_vars_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_ID ) ) )*
            {
            // InternalOberon.g:556:4: ( (lv_vars_0_0= RULE_ID ) )
            // InternalOberon.g:557:5: (lv_vars_0_0= RULE_ID )
            {
            // InternalOberon.g:557:5: (lv_vars_0_0= RULE_ID )
            // InternalOberon.g:558:6: lv_vars_0_0= RULE_ID
            {
            lv_vars_0_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            						newLeafNode(lv_vars_0_0, grammarAccess.getVarDeclarationAccess().getVarsIDTerminalRuleCall_0_0_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getVarDeclarationRule());
            						}
            						addWithLastConsumed(
            							current,
            							"vars",
            							lv_vars_0_0,
            							"org.eclipse.xtext.common.Terminals.ID");
            					

            }


            }

            // InternalOberon.g:574:4: (otherlv_1= ',' ( (lv_vars_2_0= RULE_ID ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==23) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalOberon.g:575:5: otherlv_1= ',' ( (lv_vars_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,23,FOLLOW_3); 

            	    					newLeafNode(otherlv_1, grammarAccess.getVarDeclarationAccess().getCommaKeyword_0_1_0());
            	    				
            	    // InternalOberon.g:579:5: ( (lv_vars_2_0= RULE_ID ) )
            	    // InternalOberon.g:580:6: (lv_vars_2_0= RULE_ID )
            	    {
            	    // InternalOberon.g:580:6: (lv_vars_2_0= RULE_ID )
            	    // InternalOberon.g:581:7: lv_vars_2_0= RULE_ID
            	    {
            	    lv_vars_2_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            	    							newLeafNode(lv_vars_2_0, grammarAccess.getVarDeclarationAccess().getVarsIDTerminalRuleCall_0_1_1_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getVarDeclarationRule());
            	    							}
            	    							addWithLastConsumed(
            	    								current,
            	    								"vars",
            	    								lv_vars_2_0,
            	    								"org.eclipse.xtext.common.Terminals.ID");
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            otherlv_3=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getVarDeclarationAccess().getColonKeyword_1());
            		
            // InternalOberon.g:603:3: ( (lv_varType_4_0= ruleOberonType ) )
            // InternalOberon.g:604:4: (lv_varType_4_0= ruleOberonType )
            {
            // InternalOberon.g:604:4: (lv_varType_4_0= ruleOberonType )
            // InternalOberon.g:605:5: lv_varType_4_0= ruleOberonType
            {

            					newCompositeNode(grammarAccess.getVarDeclarationAccess().getVarTypeOberonTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_varType_4_0=ruleOberonType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarDeclarationRule());
            					}
            					set(
            						current,
            						"varType",
            						lv_varType_4_0,
            						"br.unb.cic.obron.ide.Oberon.OberonType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getVarDeclarationAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarDeclaration"


    // $ANTLR start "entryRuleProcedure"
    // InternalOberon.g:630:1: entryRuleProcedure returns [EObject current=null] : iv_ruleProcedure= ruleProcedure EOF ;
    public final EObject entryRuleProcedure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcedure = null;


        try {
            // InternalOberon.g:630:50: (iv_ruleProcedure= ruleProcedure EOF )
            // InternalOberon.g:631:2: iv_ruleProcedure= ruleProcedure EOF
            {
             newCompositeNode(grammarAccess.getProcedureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcedure=ruleProcedure();

            state._fsp--;

             current =iv_ruleProcedure; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProcedure"


    // $ANTLR start "ruleProcedure"
    // InternalOberon.g:637:1: ruleProcedure returns [EObject current=null] : (otherlv_0= 'PROCEDURE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_formals_3_0= ruleFormals ) )? otherlv_4= ')' (otherlv_5= ':' ( (lv_procedureType_6_0= ruleOberonType ) ) )? otherlv_7= ';' ( (lv_decl_8_0= ruleDeclarations ) ) ( (lv_block_9_0= ruleBlock ) ) this_ID_10= RULE_ID ) ;
    public final EObject ruleProcedure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token this_ID_10=null;
        EObject lv_formals_3_0 = null;

        EObject lv_procedureType_6_0 = null;

        EObject lv_decl_8_0 = null;

        EObject lv_block_9_0 = null;



        	enterRule();

        try {
            // InternalOberon.g:643:2: ( (otherlv_0= 'PROCEDURE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_formals_3_0= ruleFormals ) )? otherlv_4= ')' (otherlv_5= ':' ( (lv_procedureType_6_0= ruleOberonType ) ) )? otherlv_7= ';' ( (lv_decl_8_0= ruleDeclarations ) ) ( (lv_block_9_0= ruleBlock ) ) this_ID_10= RULE_ID ) )
            // InternalOberon.g:644:2: (otherlv_0= 'PROCEDURE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_formals_3_0= ruleFormals ) )? otherlv_4= ')' (otherlv_5= ':' ( (lv_procedureType_6_0= ruleOberonType ) ) )? otherlv_7= ';' ( (lv_decl_8_0= ruleDeclarations ) ) ( (lv_block_9_0= ruleBlock ) ) this_ID_10= RULE_ID )
            {
            // InternalOberon.g:644:2: (otherlv_0= 'PROCEDURE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_formals_3_0= ruleFormals ) )? otherlv_4= ')' (otherlv_5= ':' ( (lv_procedureType_6_0= ruleOberonType ) ) )? otherlv_7= ';' ( (lv_decl_8_0= ruleDeclarations ) ) ( (lv_block_9_0= ruleBlock ) ) this_ID_10= RULE_ID )
            // InternalOberon.g:645:3: otherlv_0= 'PROCEDURE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_formals_3_0= ruleFormals ) )? otherlv_4= ')' (otherlv_5= ':' ( (lv_procedureType_6_0= ruleOberonType ) ) )? otherlv_7= ';' ( (lv_decl_8_0= ruleDeclarations ) ) ( (lv_block_9_0= ruleBlock ) ) this_ID_10= RULE_ID
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProcedureAccess().getPROCEDUREKeyword_0());
            		
            // InternalOberon.g:649:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOberon.g:650:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOberon.g:650:4: (lv_name_1_0= RULE_ID )
            // InternalOberon.g:651:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProcedureAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProcedureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getProcedureAccess().getLeftParenthesisKeyword_2());
            		
            // InternalOberon.g:671:3: ( (lv_formals_3_0= ruleFormals ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalOberon.g:672:4: (lv_formals_3_0= ruleFormals )
                    {
                    // InternalOberon.g:672:4: (lv_formals_3_0= ruleFormals )
                    // InternalOberon.g:673:5: lv_formals_3_0= ruleFormals
                    {

                    					newCompositeNode(grammarAccess.getProcedureAccess().getFormalsFormalsParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_25);
                    lv_formals_3_0=ruleFormals();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getProcedureRule());
                    					}
                    					set(
                    						current,
                    						"formals",
                    						lv_formals_3_0,
                    						"br.unb.cic.obron.ide.Oberon.Formals");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,27,FOLLOW_26); 

            			newLeafNode(otherlv_4, grammarAccess.getProcedureAccess().getRightParenthesisKeyword_4());
            		
            // InternalOberon.g:694:3: (otherlv_5= ':' ( (lv_procedureType_6_0= ruleOberonType ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalOberon.g:695:4: otherlv_5= ':' ( (lv_procedureType_6_0= ruleOberonType ) )
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_18); 

                    				newLeafNode(otherlv_5, grammarAccess.getProcedureAccess().getColonKeyword_5_0());
                    			
                    // InternalOberon.g:699:4: ( (lv_procedureType_6_0= ruleOberonType ) )
                    // InternalOberon.g:700:5: (lv_procedureType_6_0= ruleOberonType )
                    {
                    // InternalOberon.g:700:5: (lv_procedureType_6_0= ruleOberonType )
                    // InternalOberon.g:701:6: lv_procedureType_6_0= ruleOberonType
                    {

                    						newCompositeNode(grammarAccess.getProcedureAccess().getProcedureTypeOberonTypeParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_procedureType_6_0=ruleOberonType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProcedureRule());
                    						}
                    						set(
                    							current,
                    							"procedureType",
                    							lv_procedureType_6_0,
                    							"br.unb.cic.obron.ide.Oberon.OberonType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_7, grammarAccess.getProcedureAccess().getSemicolonKeyword_6());
            		
            // InternalOberon.g:723:3: ( (lv_decl_8_0= ruleDeclarations ) )
            // InternalOberon.g:724:4: (lv_decl_8_0= ruleDeclarations )
            {
            // InternalOberon.g:724:4: (lv_decl_8_0= ruleDeclarations )
            // InternalOberon.g:725:5: lv_decl_8_0= ruleDeclarations
            {

            					newCompositeNode(grammarAccess.getProcedureAccess().getDeclDeclarationsParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_28);
            lv_decl_8_0=ruleDeclarations();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcedureRule());
            					}
            					set(
            						current,
            						"decl",
            						lv_decl_8_0,
            						"br.unb.cic.obron.ide.Oberon.Declarations");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOberon.g:742:3: ( (lv_block_9_0= ruleBlock ) )
            // InternalOberon.g:743:4: (lv_block_9_0= ruleBlock )
            {
            // InternalOberon.g:743:4: (lv_block_9_0= ruleBlock )
            // InternalOberon.g:744:5: lv_block_9_0= ruleBlock
            {

            					newCompositeNode(grammarAccess.getProcedureAccess().getBlockBlockParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_3);
            lv_block_9_0=ruleBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcedureRule());
            					}
            					set(
            						current,
            						"block",
            						lv_block_9_0,
            						"br.unb.cic.obron.ide.Oberon.Block");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_ID_10=(Token)match(input,RULE_ID,FOLLOW_2); 

            			newLeafNode(this_ID_10, grammarAccess.getProcedureAccess().getIDTerminalRuleCall_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcedure"


    // $ANTLR start "entryRuleFormals"
    // InternalOberon.g:769:1: entryRuleFormals returns [EObject current=null] : iv_ruleFormals= ruleFormals EOF ;
    public final EObject entryRuleFormals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormals = null;


        try {
            // InternalOberon.g:769:48: (iv_ruleFormals= ruleFormals EOF )
            // InternalOberon.g:770:2: iv_ruleFormals= ruleFormals EOF
            {
             newCompositeNode(grammarAccess.getFormalsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFormals=ruleFormals();

            state._fsp--;

             current =iv_ruleFormals; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFormals"


    // $ANTLR start "ruleFormals"
    // InternalOberon.g:776:1: ruleFormals returns [EObject current=null] : ( ( (lv_arg_0_0= ruleFormalArg ) ) (otherlv_1= ',' ( (lv_args_2_0= ruleFormalArg ) ) )* ) ;
    public final EObject ruleFormals() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_arg_0_0 = null;

        EObject lv_args_2_0 = null;



        	enterRule();

        try {
            // InternalOberon.g:782:2: ( ( ( (lv_arg_0_0= ruleFormalArg ) ) (otherlv_1= ',' ( (lv_args_2_0= ruleFormalArg ) ) )* ) )
            // InternalOberon.g:783:2: ( ( (lv_arg_0_0= ruleFormalArg ) ) (otherlv_1= ',' ( (lv_args_2_0= ruleFormalArg ) ) )* )
            {
            // InternalOberon.g:783:2: ( ( (lv_arg_0_0= ruleFormalArg ) ) (otherlv_1= ',' ( (lv_args_2_0= ruleFormalArg ) ) )* )
            // InternalOberon.g:784:3: ( (lv_arg_0_0= ruleFormalArg ) ) (otherlv_1= ',' ( (lv_args_2_0= ruleFormalArg ) ) )*
            {
            // InternalOberon.g:784:3: ( (lv_arg_0_0= ruleFormalArg ) )
            // InternalOberon.g:785:4: (lv_arg_0_0= ruleFormalArg )
            {
            // InternalOberon.g:785:4: (lv_arg_0_0= ruleFormalArg )
            // InternalOberon.g:786:5: lv_arg_0_0= ruleFormalArg
            {

            					newCompositeNode(grammarAccess.getFormalsAccess().getArgFormalArgParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_29);
            lv_arg_0_0=ruleFormalArg();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFormalsRule());
            					}
            					set(
            						current,
            						"arg",
            						lv_arg_0_0,
            						"br.unb.cic.obron.ide.Oberon.FormalArg");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOberon.g:803:3: (otherlv_1= ',' ( (lv_args_2_0= ruleFormalArg ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==23) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalOberon.g:804:4: otherlv_1= ',' ( (lv_args_2_0= ruleFormalArg ) )
            	    {
            	    otherlv_1=(Token)match(input,23,FOLLOW_3); 

            	    				newLeafNode(otherlv_1, grammarAccess.getFormalsAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalOberon.g:808:4: ( (lv_args_2_0= ruleFormalArg ) )
            	    // InternalOberon.g:809:5: (lv_args_2_0= ruleFormalArg )
            	    {
            	    // InternalOberon.g:809:5: (lv_args_2_0= ruleFormalArg )
            	    // InternalOberon.g:810:6: lv_args_2_0= ruleFormalArg
            	    {

            	    						newCompositeNode(grammarAccess.getFormalsAccess().getArgsFormalArgParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_29);
            	    lv_args_2_0=ruleFormalArg();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFormalsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"args",
            	    							lv_args_2_0,
            	    							"br.unb.cic.obron.ide.Oberon.FormalArg");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFormals"


    // $ANTLR start "entryRuleFormalArg"
    // InternalOberon.g:832:1: entryRuleFormalArg returns [EObject current=null] : iv_ruleFormalArg= ruleFormalArg EOF ;
    public final EObject entryRuleFormalArg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormalArg = null;


        try {
            // InternalOberon.g:832:50: (iv_ruleFormalArg= ruleFormalArg EOF )
            // InternalOberon.g:833:2: iv_ruleFormalArg= ruleFormalArg EOF
            {
             newCompositeNode(grammarAccess.getFormalArgRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFormalArg=ruleFormalArg();

            state._fsp--;

             current =iv_ruleFormalArg; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFormalArg"


    // $ANTLR start "ruleFormalArg"
    // InternalOberon.g:839:1: ruleFormalArg returns [EObject current=null] : ( ( ( (lv_args_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_args_2_0= RULE_ID ) ) )* ) otherlv_3= ':' ( (lv_argType_4_0= ruleOberonType ) ) ) ;
    public final EObject ruleFormalArg() throws RecognitionException {
        EObject current = null;

        Token lv_args_0_0=null;
        Token otherlv_1=null;
        Token lv_args_2_0=null;
        Token otherlv_3=null;
        EObject lv_argType_4_0 = null;



        	enterRule();

        try {
            // InternalOberon.g:845:2: ( ( ( ( (lv_args_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_args_2_0= RULE_ID ) ) )* ) otherlv_3= ':' ( (lv_argType_4_0= ruleOberonType ) ) ) )
            // InternalOberon.g:846:2: ( ( ( (lv_args_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_args_2_0= RULE_ID ) ) )* ) otherlv_3= ':' ( (lv_argType_4_0= ruleOberonType ) ) )
            {
            // InternalOberon.g:846:2: ( ( ( (lv_args_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_args_2_0= RULE_ID ) ) )* ) otherlv_3= ':' ( (lv_argType_4_0= ruleOberonType ) ) )
            // InternalOberon.g:847:3: ( ( (lv_args_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_args_2_0= RULE_ID ) ) )* ) otherlv_3= ':' ( (lv_argType_4_0= ruleOberonType ) )
            {
            // InternalOberon.g:847:3: ( ( (lv_args_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_args_2_0= RULE_ID ) ) )* )
            // InternalOberon.g:848:4: ( (lv_args_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_args_2_0= RULE_ID ) ) )*
            {
            // InternalOberon.g:848:4: ( (lv_args_0_0= RULE_ID ) )
            // InternalOberon.g:849:5: (lv_args_0_0= RULE_ID )
            {
            // InternalOberon.g:849:5: (lv_args_0_0= RULE_ID )
            // InternalOberon.g:850:6: lv_args_0_0= RULE_ID
            {
            lv_args_0_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            						newLeafNode(lv_args_0_0, grammarAccess.getFormalArgAccess().getArgsIDTerminalRuleCall_0_0_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getFormalArgRule());
            						}
            						addWithLastConsumed(
            							current,
            							"args",
            							lv_args_0_0,
            							"org.eclipse.xtext.common.Terminals.ID");
            					

            }


            }

            // InternalOberon.g:866:4: (otherlv_1= ',' ( (lv_args_2_0= RULE_ID ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==23) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalOberon.g:867:5: otherlv_1= ',' ( (lv_args_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,23,FOLLOW_3); 

            	    					newLeafNode(otherlv_1, grammarAccess.getFormalArgAccess().getCommaKeyword_0_1_0());
            	    				
            	    // InternalOberon.g:871:5: ( (lv_args_2_0= RULE_ID ) )
            	    // InternalOberon.g:872:6: (lv_args_2_0= RULE_ID )
            	    {
            	    // InternalOberon.g:872:6: (lv_args_2_0= RULE_ID )
            	    // InternalOberon.g:873:7: lv_args_2_0= RULE_ID
            	    {
            	    lv_args_2_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            	    							newLeafNode(lv_args_2_0, grammarAccess.getFormalArgAccess().getArgsIDTerminalRuleCall_0_1_1_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getFormalArgRule());
            	    							}
            	    							addWithLastConsumed(
            	    								current,
            	    								"args",
            	    								lv_args_2_0,
            	    								"org.eclipse.xtext.common.Terminals.ID");
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

            otherlv_3=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getFormalArgAccess().getColonKeyword_1());
            		
            // InternalOberon.g:895:3: ( (lv_argType_4_0= ruleOberonType ) )
            // InternalOberon.g:896:4: (lv_argType_4_0= ruleOberonType )
            {
            // InternalOberon.g:896:4: (lv_argType_4_0= ruleOberonType )
            // InternalOberon.g:897:5: lv_argType_4_0= ruleOberonType
            {

            					newCompositeNode(grammarAccess.getFormalArgAccess().getArgTypeOberonTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_argType_4_0=ruleOberonType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFormalArgRule());
            					}
            					set(
            						current,
            						"argType",
            						lv_argType_4_0,
            						"br.unb.cic.obron.ide.Oberon.OberonType");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFormalArg"


    // $ANTLR start "entryRuleArguments"
    // InternalOberon.g:918:1: entryRuleArguments returns [EObject current=null] : iv_ruleArguments= ruleArguments EOF ;
    public final EObject entryRuleArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArguments = null;


        try {
            // InternalOberon.g:918:50: (iv_ruleArguments= ruleArguments EOF )
            // InternalOberon.g:919:2: iv_ruleArguments= ruleArguments EOF
            {
             newCompositeNode(grammarAccess.getArgumentsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArguments=ruleArguments();

            state._fsp--;

             current =iv_ruleArguments; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArguments"


    // $ANTLR start "ruleArguments"
    // InternalOberon.g:925:1: ruleArguments returns [EObject current=null] : ( ( (lv_exp_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_exps_2_0= ruleExpression ) ) )* ) ;
    public final EObject ruleArguments() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_exp_0_0 = null;

        EObject lv_exps_2_0 = null;



        	enterRule();

        try {
            // InternalOberon.g:931:2: ( ( ( (lv_exp_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_exps_2_0= ruleExpression ) ) )* ) )
            // InternalOberon.g:932:2: ( ( (lv_exp_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_exps_2_0= ruleExpression ) ) )* )
            {
            // InternalOberon.g:932:2: ( ( (lv_exp_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_exps_2_0= ruleExpression ) ) )* )
            // InternalOberon.g:933:3: ( (lv_exp_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_exps_2_0= ruleExpression ) ) )*
            {
            // InternalOberon.g:933:3: ( (lv_exp_0_0= ruleExpression ) )
            // InternalOberon.g:934:4: (lv_exp_0_0= ruleExpression )
            {
            // InternalOberon.g:934:4: (lv_exp_0_0= ruleExpression )
            // InternalOberon.g:935:5: lv_exp_0_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getArgumentsAccess().getExpExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_29);
            lv_exp_0_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArgumentsRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_0_0,
            						"br.unb.cic.obron.ide.Oberon.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOberon.g:952:3: (otherlv_1= ',' ( (lv_exps_2_0= ruleExpression ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==23) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalOberon.g:953:4: otherlv_1= ',' ( (lv_exps_2_0= ruleExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,23,FOLLOW_21); 

            	    				newLeafNode(otherlv_1, grammarAccess.getArgumentsAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalOberon.g:957:4: ( (lv_exps_2_0= ruleExpression ) )
            	    // InternalOberon.g:958:5: (lv_exps_2_0= ruleExpression )
            	    {
            	    // InternalOberon.g:958:5: (lv_exps_2_0= ruleExpression )
            	    // InternalOberon.g:959:6: lv_exps_2_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getArgumentsAccess().getExpsExpressionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_29);
            	    lv_exps_2_0=ruleExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getArgumentsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"exps",
            	    							lv_exps_2_0,
            	    							"br.unb.cic.obron.ide.Oberon.Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArguments"


    // $ANTLR start "entryRuleExpression"
    // InternalOberon.g:981:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalOberon.g:981:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalOberon.g:982:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalOberon.g:988:1: ruleExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleTExpression ) ) ( ( (lv_opr_1_0= ruleOperation ) ) ( (lv_right_2_0= ruleExpression ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        EObject lv_opr_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalOberon.g:994:2: ( ( ( (lv_left_0_0= ruleTExpression ) ) ( ( (lv_opr_1_0= ruleOperation ) ) ( (lv_right_2_0= ruleExpression ) ) )* ) )
            // InternalOberon.g:995:2: ( ( (lv_left_0_0= ruleTExpression ) ) ( ( (lv_opr_1_0= ruleOperation ) ) ( (lv_right_2_0= ruleExpression ) ) )* )
            {
            // InternalOberon.g:995:2: ( ( (lv_left_0_0= ruleTExpression ) ) ( ( (lv_opr_1_0= ruleOperation ) ) ( (lv_right_2_0= ruleExpression ) ) )* )
            // InternalOberon.g:996:3: ( (lv_left_0_0= ruleTExpression ) ) ( ( (lv_opr_1_0= ruleOperation ) ) ( (lv_right_2_0= ruleExpression ) ) )*
            {
            // InternalOberon.g:996:3: ( (lv_left_0_0= ruleTExpression ) )
            // InternalOberon.g:997:4: (lv_left_0_0= ruleTExpression )
            {
            // InternalOberon.g:997:4: (lv_left_0_0= ruleTExpression )
            // InternalOberon.g:998:5: lv_left_0_0= ruleTExpression
            {

            					newCompositeNode(grammarAccess.getExpressionAccess().getLeftTExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_30);
            lv_left_0_0=ruleTExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressionRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"br.unb.cic.obron.ide.Oberon.TExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOberon.g:1015:3: ( ( (lv_opr_1_0= ruleOperation ) ) ( (lv_right_2_0= ruleExpression ) ) )*
            loop18:
            do {
                int alt18=2;
                alt18 = dfa18.predict(input);
                switch (alt18) {
            	case 1 :
            	    // InternalOberon.g:1016:4: ( (lv_opr_1_0= ruleOperation ) ) ( (lv_right_2_0= ruleExpression ) )
            	    {
            	    // InternalOberon.g:1016:4: ( (lv_opr_1_0= ruleOperation ) )
            	    // InternalOberon.g:1017:5: (lv_opr_1_0= ruleOperation )
            	    {
            	    // InternalOberon.g:1017:5: (lv_opr_1_0= ruleOperation )
            	    // InternalOberon.g:1018:6: lv_opr_1_0= ruleOperation
            	    {

            	    						newCompositeNode(grammarAccess.getExpressionAccess().getOprOperationParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_opr_1_0=ruleOperation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"opr",
            	    							lv_opr_1_0,
            	    							"br.unb.cic.obron.ide.Oberon.Operation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalOberon.g:1035:4: ( (lv_right_2_0= ruleExpression ) )
            	    // InternalOberon.g:1036:5: (lv_right_2_0= ruleExpression )
            	    {
            	    // InternalOberon.g:1036:5: (lv_right_2_0= ruleExpression )
            	    // InternalOberon.g:1037:6: lv_right_2_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getExpressionAccess().getRightExpressionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    lv_right_2_0=ruleExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"right",
            	    							lv_right_2_0,
            	    							"br.unb.cic.obron.ide.Oberon.Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOperation"
    // InternalOberon.g:1059:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalOberon.g:1059:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalOberon.g:1060:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalOberon.g:1066:1: ruleOperation returns [EObject current=null] : ( ( ( (lv_OperationRelacional_0_1= '=' | lv_OperationRelacional_0_2= '#' | lv_OperationRelacional_0_3= '<' | lv_OperationRelacional_0_4= '<=' | lv_OperationRelacional_0_5= '>' | lv_OperationRelacional_0_6= '>=' ) ) ) | ( ( (lv_OperationAritmetic_1_1= '*' | lv_OperationAritmetic_1_2= '/' | lv_OperationAritmetic_1_3= '+' | lv_OperationAritmetic_1_4= '-' ) ) ) | ( ( (lv_OperationLogic_2_1= '&&' | lv_OperationLogic_2_2= '||' ) ) ) ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token lv_OperationRelacional_0_1=null;
        Token lv_OperationRelacional_0_2=null;
        Token lv_OperationRelacional_0_3=null;
        Token lv_OperationRelacional_0_4=null;
        Token lv_OperationRelacional_0_5=null;
        Token lv_OperationRelacional_0_6=null;
        Token lv_OperationAritmetic_1_1=null;
        Token lv_OperationAritmetic_1_2=null;
        Token lv_OperationAritmetic_1_3=null;
        Token lv_OperationAritmetic_1_4=null;
        Token lv_OperationLogic_2_1=null;
        Token lv_OperationLogic_2_2=null;


        	enterRule();

        try {
            // InternalOberon.g:1072:2: ( ( ( ( (lv_OperationRelacional_0_1= '=' | lv_OperationRelacional_0_2= '#' | lv_OperationRelacional_0_3= '<' | lv_OperationRelacional_0_4= '<=' | lv_OperationRelacional_0_5= '>' | lv_OperationRelacional_0_6= '>=' ) ) ) | ( ( (lv_OperationAritmetic_1_1= '*' | lv_OperationAritmetic_1_2= '/' | lv_OperationAritmetic_1_3= '+' | lv_OperationAritmetic_1_4= '-' ) ) ) | ( ( (lv_OperationLogic_2_1= '&&' | lv_OperationLogic_2_2= '||' ) ) ) ) )
            // InternalOberon.g:1073:2: ( ( ( (lv_OperationRelacional_0_1= '=' | lv_OperationRelacional_0_2= '#' | lv_OperationRelacional_0_3= '<' | lv_OperationRelacional_0_4= '<=' | lv_OperationRelacional_0_5= '>' | lv_OperationRelacional_0_6= '>=' ) ) ) | ( ( (lv_OperationAritmetic_1_1= '*' | lv_OperationAritmetic_1_2= '/' | lv_OperationAritmetic_1_3= '+' | lv_OperationAritmetic_1_4= '-' ) ) ) | ( ( (lv_OperationLogic_2_1= '&&' | lv_OperationLogic_2_2= '||' ) ) ) )
            {
            // InternalOberon.g:1073:2: ( ( ( (lv_OperationRelacional_0_1= '=' | lv_OperationRelacional_0_2= '#' | lv_OperationRelacional_0_3= '<' | lv_OperationRelacional_0_4= '<=' | lv_OperationRelacional_0_5= '>' | lv_OperationRelacional_0_6= '>=' ) ) ) | ( ( (lv_OperationAritmetic_1_1= '*' | lv_OperationAritmetic_1_2= '/' | lv_OperationAritmetic_1_3= '+' | lv_OperationAritmetic_1_4= '-' ) ) ) | ( ( (lv_OperationLogic_2_1= '&&' | lv_OperationLogic_2_2= '||' ) ) ) )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 19:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
                {
                alt22=1;
                }
                break;
            case 33:
            case 34:
            case 35:
            case 36:
                {
                alt22=2;
                }
                break;
            case 37:
            case 38:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalOberon.g:1074:3: ( ( (lv_OperationRelacional_0_1= '=' | lv_OperationRelacional_0_2= '#' | lv_OperationRelacional_0_3= '<' | lv_OperationRelacional_0_4= '<=' | lv_OperationRelacional_0_5= '>' | lv_OperationRelacional_0_6= '>=' ) ) )
                    {
                    // InternalOberon.g:1074:3: ( ( (lv_OperationRelacional_0_1= '=' | lv_OperationRelacional_0_2= '#' | lv_OperationRelacional_0_3= '<' | lv_OperationRelacional_0_4= '<=' | lv_OperationRelacional_0_5= '>' | lv_OperationRelacional_0_6= '>=' ) ) )
                    // InternalOberon.g:1075:4: ( (lv_OperationRelacional_0_1= '=' | lv_OperationRelacional_0_2= '#' | lv_OperationRelacional_0_3= '<' | lv_OperationRelacional_0_4= '<=' | lv_OperationRelacional_0_5= '>' | lv_OperationRelacional_0_6= '>=' ) )
                    {
                    // InternalOberon.g:1075:4: ( (lv_OperationRelacional_0_1= '=' | lv_OperationRelacional_0_2= '#' | lv_OperationRelacional_0_3= '<' | lv_OperationRelacional_0_4= '<=' | lv_OperationRelacional_0_5= '>' | lv_OperationRelacional_0_6= '>=' ) )
                    // InternalOberon.g:1076:5: (lv_OperationRelacional_0_1= '=' | lv_OperationRelacional_0_2= '#' | lv_OperationRelacional_0_3= '<' | lv_OperationRelacional_0_4= '<=' | lv_OperationRelacional_0_5= '>' | lv_OperationRelacional_0_6= '>=' )
                    {
                    // InternalOberon.g:1076:5: (lv_OperationRelacional_0_1= '=' | lv_OperationRelacional_0_2= '#' | lv_OperationRelacional_0_3= '<' | lv_OperationRelacional_0_4= '<=' | lv_OperationRelacional_0_5= '>' | lv_OperationRelacional_0_6= '>=' )
                    int alt19=6;
                    switch ( input.LA(1) ) {
                    case 19:
                        {
                        alt19=1;
                        }
                        break;
                    case 28:
                        {
                        alt19=2;
                        }
                        break;
                    case 29:
                        {
                        alt19=3;
                        }
                        break;
                    case 30:
                        {
                        alt19=4;
                        }
                        break;
                    case 31:
                        {
                        alt19=5;
                        }
                        break;
                    case 32:
                        {
                        alt19=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;
                    }

                    switch (alt19) {
                        case 1 :
                            // InternalOberon.g:1077:6: lv_OperationRelacional_0_1= '='
                            {
                            lv_OperationRelacional_0_1=(Token)match(input,19,FOLLOW_2); 

                            						newLeafNode(lv_OperationRelacional_0_1, grammarAccess.getOperationAccess().getOperationRelacionalEqualsSignKeyword_0_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getOperationRule());
                            						}
                            						setWithLastConsumed(current, "OperationRelacional", lv_OperationRelacional_0_1, null);
                            					

                            }
                            break;
                        case 2 :
                            // InternalOberon.g:1088:6: lv_OperationRelacional_0_2= '#'
                            {
                            lv_OperationRelacional_0_2=(Token)match(input,28,FOLLOW_2); 

                            						newLeafNode(lv_OperationRelacional_0_2, grammarAccess.getOperationAccess().getOperationRelacionalNumberSignKeyword_0_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getOperationRule());
                            						}
                            						setWithLastConsumed(current, "OperationRelacional", lv_OperationRelacional_0_2, null);
                            					

                            }
                            break;
                        case 3 :
                            // InternalOberon.g:1099:6: lv_OperationRelacional_0_3= '<'
                            {
                            lv_OperationRelacional_0_3=(Token)match(input,29,FOLLOW_2); 

                            						newLeafNode(lv_OperationRelacional_0_3, grammarAccess.getOperationAccess().getOperationRelacionalLessThanSignKeyword_0_0_2());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getOperationRule());
                            						}
                            						setWithLastConsumed(current, "OperationRelacional", lv_OperationRelacional_0_3, null);
                            					

                            }
                            break;
                        case 4 :
                            // InternalOberon.g:1110:6: lv_OperationRelacional_0_4= '<='
                            {
                            lv_OperationRelacional_0_4=(Token)match(input,30,FOLLOW_2); 

                            						newLeafNode(lv_OperationRelacional_0_4, grammarAccess.getOperationAccess().getOperationRelacionalLessThanSignEqualsSignKeyword_0_0_3());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getOperationRule());
                            						}
                            						setWithLastConsumed(current, "OperationRelacional", lv_OperationRelacional_0_4, null);
                            					

                            }
                            break;
                        case 5 :
                            // InternalOberon.g:1121:6: lv_OperationRelacional_0_5= '>'
                            {
                            lv_OperationRelacional_0_5=(Token)match(input,31,FOLLOW_2); 

                            						newLeafNode(lv_OperationRelacional_0_5, grammarAccess.getOperationAccess().getOperationRelacionalGreaterThanSignKeyword_0_0_4());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getOperationRule());
                            						}
                            						setWithLastConsumed(current, "OperationRelacional", lv_OperationRelacional_0_5, null);
                            					

                            }
                            break;
                        case 6 :
                            // InternalOberon.g:1132:6: lv_OperationRelacional_0_6= '>='
                            {
                            lv_OperationRelacional_0_6=(Token)match(input,32,FOLLOW_2); 

                            						newLeafNode(lv_OperationRelacional_0_6, grammarAccess.getOperationAccess().getOperationRelacionalGreaterThanSignEqualsSignKeyword_0_0_5());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getOperationRule());
                            						}
                            						setWithLastConsumed(current, "OperationRelacional", lv_OperationRelacional_0_6, null);
                            					

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOberon.g:1146:3: ( ( (lv_OperationAritmetic_1_1= '*' | lv_OperationAritmetic_1_2= '/' | lv_OperationAritmetic_1_3= '+' | lv_OperationAritmetic_1_4= '-' ) ) )
                    {
                    // InternalOberon.g:1146:3: ( ( (lv_OperationAritmetic_1_1= '*' | lv_OperationAritmetic_1_2= '/' | lv_OperationAritmetic_1_3= '+' | lv_OperationAritmetic_1_4= '-' ) ) )
                    // InternalOberon.g:1147:4: ( (lv_OperationAritmetic_1_1= '*' | lv_OperationAritmetic_1_2= '/' | lv_OperationAritmetic_1_3= '+' | lv_OperationAritmetic_1_4= '-' ) )
                    {
                    // InternalOberon.g:1147:4: ( (lv_OperationAritmetic_1_1= '*' | lv_OperationAritmetic_1_2= '/' | lv_OperationAritmetic_1_3= '+' | lv_OperationAritmetic_1_4= '-' ) )
                    // InternalOberon.g:1148:5: (lv_OperationAritmetic_1_1= '*' | lv_OperationAritmetic_1_2= '/' | lv_OperationAritmetic_1_3= '+' | lv_OperationAritmetic_1_4= '-' )
                    {
                    // InternalOberon.g:1148:5: (lv_OperationAritmetic_1_1= '*' | lv_OperationAritmetic_1_2= '/' | lv_OperationAritmetic_1_3= '+' | lv_OperationAritmetic_1_4= '-' )
                    int alt20=4;
                    switch ( input.LA(1) ) {
                    case 33:
                        {
                        alt20=1;
                        }
                        break;
                    case 34:
                        {
                        alt20=2;
                        }
                        break;
                    case 35:
                        {
                        alt20=3;
                        }
                        break;
                    case 36:
                        {
                        alt20=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;
                    }

                    switch (alt20) {
                        case 1 :
                            // InternalOberon.g:1149:6: lv_OperationAritmetic_1_1= '*'
                            {
                            lv_OperationAritmetic_1_1=(Token)match(input,33,FOLLOW_2); 

                            						newLeafNode(lv_OperationAritmetic_1_1, grammarAccess.getOperationAccess().getOperationAritmeticAsteriskKeyword_1_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getOperationRule());
                            						}
                            						setWithLastConsumed(current, "OperationAritmetic", lv_OperationAritmetic_1_1, null);
                            					

                            }
                            break;
                        case 2 :
                            // InternalOberon.g:1160:6: lv_OperationAritmetic_1_2= '/'
                            {
                            lv_OperationAritmetic_1_2=(Token)match(input,34,FOLLOW_2); 

                            						newLeafNode(lv_OperationAritmetic_1_2, grammarAccess.getOperationAccess().getOperationAritmeticSolidusKeyword_1_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getOperationRule());
                            						}
                            						setWithLastConsumed(current, "OperationAritmetic", lv_OperationAritmetic_1_2, null);
                            					

                            }
                            break;
                        case 3 :
                            // InternalOberon.g:1171:6: lv_OperationAritmetic_1_3= '+'
                            {
                            lv_OperationAritmetic_1_3=(Token)match(input,35,FOLLOW_2); 

                            						newLeafNode(lv_OperationAritmetic_1_3, grammarAccess.getOperationAccess().getOperationAritmeticPlusSignKeyword_1_0_2());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getOperationRule());
                            						}
                            						setWithLastConsumed(current, "OperationAritmetic", lv_OperationAritmetic_1_3, null);
                            					

                            }
                            break;
                        case 4 :
                            // InternalOberon.g:1182:6: lv_OperationAritmetic_1_4= '-'
                            {
                            lv_OperationAritmetic_1_4=(Token)match(input,36,FOLLOW_2); 

                            						newLeafNode(lv_OperationAritmetic_1_4, grammarAccess.getOperationAccess().getOperationAritmeticHyphenMinusKeyword_1_0_3());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getOperationRule());
                            						}
                            						setWithLastConsumed(current, "OperationAritmetic", lv_OperationAritmetic_1_4, null);
                            					

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalOberon.g:1196:3: ( ( (lv_OperationLogic_2_1= '&&' | lv_OperationLogic_2_2= '||' ) ) )
                    {
                    // InternalOberon.g:1196:3: ( ( (lv_OperationLogic_2_1= '&&' | lv_OperationLogic_2_2= '||' ) ) )
                    // InternalOberon.g:1197:4: ( (lv_OperationLogic_2_1= '&&' | lv_OperationLogic_2_2= '||' ) )
                    {
                    // InternalOberon.g:1197:4: ( (lv_OperationLogic_2_1= '&&' | lv_OperationLogic_2_2= '||' ) )
                    // InternalOberon.g:1198:5: (lv_OperationLogic_2_1= '&&' | lv_OperationLogic_2_2= '||' )
                    {
                    // InternalOberon.g:1198:5: (lv_OperationLogic_2_1= '&&' | lv_OperationLogic_2_2= '||' )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==37) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==38) ) {
                        alt21=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalOberon.g:1199:6: lv_OperationLogic_2_1= '&&'
                            {
                            lv_OperationLogic_2_1=(Token)match(input,37,FOLLOW_2); 

                            						newLeafNode(lv_OperationLogic_2_1, grammarAccess.getOperationAccess().getOperationLogicAmpersandAmpersandKeyword_2_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getOperationRule());
                            						}
                            						setWithLastConsumed(current, "OperationLogic", lv_OperationLogic_2_1, null);
                            					

                            }
                            break;
                        case 2 :
                            // InternalOberon.g:1210:6: lv_OperationLogic_2_2= '||'
                            {
                            lv_OperationLogic_2_2=(Token)match(input,38,FOLLOW_2); 

                            						newLeafNode(lv_OperationLogic_2_2, grammarAccess.getOperationAccess().getOperationLogicVerticalLineVerticalLineKeyword_2_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getOperationRule());
                            						}
                            						setWithLastConsumed(current, "OperationLogic", lv_OperationLogic_2_2, null);
                            					

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleTExpression"
    // InternalOberon.g:1227:1: entryRuleTExpression returns [EObject current=null] : iv_ruleTExpression= ruleTExpression EOF ;
    public final EObject entryRuleTExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTExpression = null;


        try {
            // InternalOberon.g:1227:52: (iv_ruleTExpression= ruleTExpression EOF )
            // InternalOberon.g:1228:2: iv_ruleTExpression= ruleTExpression EOF
            {
             newCompositeNode(grammarAccess.getTExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTExpression=ruleTExpression();

            state._fsp--;

             current =iv_ruleTExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTExpression"


    // $ANTLR start "ruleTExpression"
    // InternalOberon.g:1234:1: ruleTExpression returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_exp_1_0= ruleExpression ) ) otherlv_2= ')' ) | ( (lv_intvalue_3_0= ruleIntValue ) ) | ( (lv_boolvalue_4_0= ruleBoolValue ) ) | ( ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '(' ( (lv_args_7_0= ruleArguments ) )? otherlv_8= ')' )? (otherlv_9= '.' ( (lv_atribs_10_0= RULE_ID ) ) )* (otherlv_11= '[' ( (lv_index_12_0= ruleExpression ) ) otherlv_13= ']' )* ) ) ;
    public final EObject ruleTExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_atribs_10_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_exp_1_0 = null;

        AntlrDatatypeRuleToken lv_intvalue_3_0 = null;

        AntlrDatatypeRuleToken lv_boolvalue_4_0 = null;

        EObject lv_args_7_0 = null;

        EObject lv_index_12_0 = null;



        	enterRule();

        try {
            // InternalOberon.g:1240:2: ( ( (otherlv_0= '(' ( (lv_exp_1_0= ruleExpression ) ) otherlv_2= ')' ) | ( (lv_intvalue_3_0= ruleIntValue ) ) | ( (lv_boolvalue_4_0= ruleBoolValue ) ) | ( ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '(' ( (lv_args_7_0= ruleArguments ) )? otherlv_8= ')' )? (otherlv_9= '.' ( (lv_atribs_10_0= RULE_ID ) ) )* (otherlv_11= '[' ( (lv_index_12_0= ruleExpression ) ) otherlv_13= ']' )* ) ) )
            // InternalOberon.g:1241:2: ( (otherlv_0= '(' ( (lv_exp_1_0= ruleExpression ) ) otherlv_2= ')' ) | ( (lv_intvalue_3_0= ruleIntValue ) ) | ( (lv_boolvalue_4_0= ruleBoolValue ) ) | ( ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '(' ( (lv_args_7_0= ruleArguments ) )? otherlv_8= ')' )? (otherlv_9= '.' ( (lv_atribs_10_0= RULE_ID ) ) )* (otherlv_11= '[' ( (lv_index_12_0= ruleExpression ) ) otherlv_13= ']' )* ) )
            {
            // InternalOberon.g:1241:2: ( (otherlv_0= '(' ( (lv_exp_1_0= ruleExpression ) ) otherlv_2= ')' ) | ( (lv_intvalue_3_0= ruleIntValue ) ) | ( (lv_boolvalue_4_0= ruleBoolValue ) ) | ( ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '(' ( (lv_args_7_0= ruleArguments ) )? otherlv_8= ')' )? (otherlv_9= '.' ( (lv_atribs_10_0= RULE_ID ) ) )* (otherlv_11= '[' ( (lv_index_12_0= ruleExpression ) ) otherlv_13= ']' )* ) )
            int alt27=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt27=1;
                }
                break;
            case RULE_INT:
                {
                alt27=2;
                }
                break;
            case 63:
            case 64:
                {
                alt27=3;
                }
                break;
            case RULE_ID:
                {
                alt27=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalOberon.g:1242:3: (otherlv_0= '(' ( (lv_exp_1_0= ruleExpression ) ) otherlv_2= ')' )
                    {
                    // InternalOberon.g:1242:3: (otherlv_0= '(' ( (lv_exp_1_0= ruleExpression ) ) otherlv_2= ')' )
                    // InternalOberon.g:1243:4: otherlv_0= '(' ( (lv_exp_1_0= ruleExpression ) ) otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,26,FOLLOW_21); 

                    				newLeafNode(otherlv_0, grammarAccess.getTExpressionAccess().getLeftParenthesisKeyword_0_0());
                    			
                    // InternalOberon.g:1247:4: ( (lv_exp_1_0= ruleExpression ) )
                    // InternalOberon.g:1248:5: (lv_exp_1_0= ruleExpression )
                    {
                    // InternalOberon.g:1248:5: (lv_exp_1_0= ruleExpression )
                    // InternalOberon.g:1249:6: lv_exp_1_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getTExpressionAccess().getExpExpressionParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_exp_1_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTExpressionRule());
                    						}
                    						set(
                    							current,
                    							"exp",
                    							lv_exp_1_0,
                    							"br.unb.cic.obron.ide.Oberon.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getTExpressionAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOberon.g:1272:3: ( (lv_intvalue_3_0= ruleIntValue ) )
                    {
                    // InternalOberon.g:1272:3: ( (lv_intvalue_3_0= ruleIntValue ) )
                    // InternalOberon.g:1273:4: (lv_intvalue_3_0= ruleIntValue )
                    {
                    // InternalOberon.g:1273:4: (lv_intvalue_3_0= ruleIntValue )
                    // InternalOberon.g:1274:5: lv_intvalue_3_0= ruleIntValue
                    {

                    					newCompositeNode(grammarAccess.getTExpressionAccess().getIntvalueIntValueParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_intvalue_3_0=ruleIntValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTExpressionRule());
                    					}
                    					set(
                    						current,
                    						"intvalue",
                    						lv_intvalue_3_0,
                    						"br.unb.cic.obron.ide.Oberon.IntValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalOberon.g:1292:3: ( (lv_boolvalue_4_0= ruleBoolValue ) )
                    {
                    // InternalOberon.g:1292:3: ( (lv_boolvalue_4_0= ruleBoolValue ) )
                    // InternalOberon.g:1293:4: (lv_boolvalue_4_0= ruleBoolValue )
                    {
                    // InternalOberon.g:1293:4: (lv_boolvalue_4_0= ruleBoolValue )
                    // InternalOberon.g:1294:5: lv_boolvalue_4_0= ruleBoolValue
                    {

                    					newCompositeNode(grammarAccess.getTExpressionAccess().getBoolvalueBoolValueParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_boolvalue_4_0=ruleBoolValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTExpressionRule());
                    					}
                    					set(
                    						current,
                    						"boolvalue",
                    						lv_boolvalue_4_0,
                    						"br.unb.cic.obron.ide.Oberon.BoolValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalOberon.g:1312:3: ( ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '(' ( (lv_args_7_0= ruleArguments ) )? otherlv_8= ')' )? (otherlv_9= '.' ( (lv_atribs_10_0= RULE_ID ) ) )* (otherlv_11= '[' ( (lv_index_12_0= ruleExpression ) ) otherlv_13= ']' )* )
                    {
                    // InternalOberon.g:1312:3: ( ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '(' ( (lv_args_7_0= ruleArguments ) )? otherlv_8= ')' )? (otherlv_9= '.' ( (lv_atribs_10_0= RULE_ID ) ) )* (otherlv_11= '[' ( (lv_index_12_0= ruleExpression ) ) otherlv_13= ']' )* )
                    // InternalOberon.g:1313:4: ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '(' ( (lv_args_7_0= ruleArguments ) )? otherlv_8= ')' )? (otherlv_9= '.' ( (lv_atribs_10_0= RULE_ID ) ) )* (otherlv_11= '[' ( (lv_index_12_0= ruleExpression ) ) otherlv_13= ']' )*
                    {
                    // InternalOberon.g:1313:4: ( (lv_name_5_0= RULE_ID ) )
                    // InternalOberon.g:1314:5: (lv_name_5_0= RULE_ID )
                    {
                    // InternalOberon.g:1314:5: (lv_name_5_0= RULE_ID )
                    // InternalOberon.g:1315:6: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_31); 

                    						newLeafNode(lv_name_5_0, grammarAccess.getTExpressionAccess().getNameIDTerminalRuleCall_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTExpressionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_5_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalOberon.g:1331:4: (otherlv_6= '(' ( (lv_args_7_0= ruleArguments ) )? otherlv_8= ')' )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==26) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalOberon.g:1332:5: otherlv_6= '(' ( (lv_args_7_0= ruleArguments ) )? otherlv_8= ')'
                            {
                            otherlv_6=(Token)match(input,26,FOLLOW_32); 

                            					newLeafNode(otherlv_6, grammarAccess.getTExpressionAccess().getLeftParenthesisKeyword_3_1_0());
                            				
                            // InternalOberon.g:1336:5: ( (lv_args_7_0= ruleArguments ) )?
                            int alt23=2;
                            int LA23_0 = input.LA(1);

                            if ( ((LA23_0>=RULE_ID && LA23_0<=RULE_INT)||LA23_0==26||(LA23_0>=63 && LA23_0<=64)) ) {
                                alt23=1;
                            }
                            switch (alt23) {
                                case 1 :
                                    // InternalOberon.g:1337:6: (lv_args_7_0= ruleArguments )
                                    {
                                    // InternalOberon.g:1337:6: (lv_args_7_0= ruleArguments )
                                    // InternalOberon.g:1338:7: lv_args_7_0= ruleArguments
                                    {

                                    							newCompositeNode(grammarAccess.getTExpressionAccess().getArgsArgumentsParserRuleCall_3_1_1_0());
                                    						
                                    pushFollow(FOLLOW_25);
                                    lv_args_7_0=ruleArguments();

                                    state._fsp--;


                                    							if (current==null) {
                                    								current = createModelElementForParent(grammarAccess.getTExpressionRule());
                                    							}
                                    							add(
                                    								current,
                                    								"args",
                                    								lv_args_7_0,
                                    								"br.unb.cic.obron.ide.Oberon.Arguments");
                                    							afterParserOrEnumRuleCall();
                                    						

                                    }


                                    }
                                    break;

                            }

                            otherlv_8=(Token)match(input,27,FOLLOW_33); 

                            					newLeafNode(otherlv_8, grammarAccess.getTExpressionAccess().getRightParenthesisKeyword_3_1_2());
                            				

                            }
                            break;

                    }

                    // InternalOberon.g:1360:4: (otherlv_9= '.' ( (lv_atribs_10_0= RULE_ID ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==14) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalOberon.g:1361:5: otherlv_9= '.' ( (lv_atribs_10_0= RULE_ID ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getTExpressionAccess().getFullStopKeyword_3_2_0());
                    	    				
                    	    // InternalOberon.g:1365:5: ( (lv_atribs_10_0= RULE_ID ) )
                    	    // InternalOberon.g:1366:6: (lv_atribs_10_0= RULE_ID )
                    	    {
                    	    // InternalOberon.g:1366:6: (lv_atribs_10_0= RULE_ID )
                    	    // InternalOberon.g:1367:7: lv_atribs_10_0= RULE_ID
                    	    {
                    	    lv_atribs_10_0=(Token)match(input,RULE_ID,FOLLOW_33); 

                    	    							newLeafNode(lv_atribs_10_0, grammarAccess.getTExpressionAccess().getAtribsIDTerminalRuleCall_3_2_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTExpressionRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"atribs",
                    	    								lv_atribs_10_0,
                    	    								"org.eclipse.xtext.common.Terminals.ID");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    // InternalOberon.g:1384:4: (otherlv_11= '[' ( (lv_index_12_0= ruleExpression ) ) otherlv_13= ']' )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==39) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalOberon.g:1385:5: otherlv_11= '[' ( (lv_index_12_0= ruleExpression ) ) otherlv_13= ']'
                    	    {
                    	    otherlv_11=(Token)match(input,39,FOLLOW_21); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getTExpressionAccess().getLeftSquareBracketKeyword_3_3_0());
                    	    				
                    	    // InternalOberon.g:1389:5: ( (lv_index_12_0= ruleExpression ) )
                    	    // InternalOberon.g:1390:6: (lv_index_12_0= ruleExpression )
                    	    {
                    	    // InternalOberon.g:1390:6: (lv_index_12_0= ruleExpression )
                    	    // InternalOberon.g:1391:7: lv_index_12_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getTExpressionAccess().getIndexExpressionParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_34);
                    	    lv_index_12_0=ruleExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTExpressionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"index",
                    	    								lv_index_12_0,
                    	    								"br.unb.cic.obron.ide.Oberon.Expression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    otherlv_13=(Token)match(input,40,FOLLOW_35); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getTExpressionAccess().getRightSquareBracketKeyword_3_3_2());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTExpression"


    // $ANTLR start "entryRuleStatement"
    // InternalOberon.g:1418:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalOberon.g:1418:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalOberon.g:1419:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalOberon.g:1425:1: ruleStatement returns [EObject current=null] : ( ( (lv_stmt_0_0= ruleTStatement ) ) (otherlv_1= ';' ( (lv_stmts_2_0= ruleStatement ) ) )* ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_stmt_0_0 = null;

        EObject lv_stmts_2_0 = null;



        	enterRule();

        try {
            // InternalOberon.g:1431:2: ( ( ( (lv_stmt_0_0= ruleTStatement ) ) (otherlv_1= ';' ( (lv_stmts_2_0= ruleStatement ) ) )* ) )
            // InternalOberon.g:1432:2: ( ( (lv_stmt_0_0= ruleTStatement ) ) (otherlv_1= ';' ( (lv_stmts_2_0= ruleStatement ) ) )* )
            {
            // InternalOberon.g:1432:2: ( ( (lv_stmt_0_0= ruleTStatement ) ) (otherlv_1= ';' ( (lv_stmts_2_0= ruleStatement ) ) )* )
            // InternalOberon.g:1433:3: ( (lv_stmt_0_0= ruleTStatement ) ) (otherlv_1= ';' ( (lv_stmts_2_0= ruleStatement ) ) )*
            {
            // InternalOberon.g:1433:3: ( (lv_stmt_0_0= ruleTStatement ) )
            // InternalOberon.g:1434:4: (lv_stmt_0_0= ruleTStatement )
            {
            // InternalOberon.g:1434:4: (lv_stmt_0_0= ruleTStatement )
            // InternalOberon.g:1435:5: lv_stmt_0_0= ruleTStatement
            {

            					newCompositeNode(grammarAccess.getStatementAccess().getStmtTStatementParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_36);
            lv_stmt_0_0=ruleTStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStatementRule());
            					}
            					set(
            						current,
            						"stmt",
            						lv_stmt_0_0,
            						"br.unb.cic.obron.ide.Oberon.TStatement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOberon.g:1452:3: (otherlv_1= ';' ( (lv_stmts_2_0= ruleStatement ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==12) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalOberon.g:1453:4: otherlv_1= ';' ( (lv_stmts_2_0= ruleStatement ) )
            	    {
            	    otherlv_1=(Token)match(input,12,FOLLOW_37); 

            	    				newLeafNode(otherlv_1, grammarAccess.getStatementAccess().getSemicolonKeyword_1_0());
            	    			
            	    // InternalOberon.g:1457:4: ( (lv_stmts_2_0= ruleStatement ) )
            	    // InternalOberon.g:1458:5: (lv_stmts_2_0= ruleStatement )
            	    {
            	    // InternalOberon.g:1458:5: (lv_stmts_2_0= ruleStatement )
            	    // InternalOberon.g:1459:6: lv_stmts_2_0= ruleStatement
            	    {

            	    						newCompositeNode(grammarAccess.getStatementAccess().getStmtsStatementParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_36);
            	    lv_stmts_2_0=ruleStatement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStatementRule());
            	    						}
            	    						add(
            	    							current,
            	    							"stmts",
            	    							lv_stmts_2_0,
            	    							"br.unb.cic.obron.ide.Oberon.Statement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleTStatement"
    // InternalOberon.g:1481:1: entryRuleTStatement returns [EObject current=null] : iv_ruleTStatement= ruleTStatement EOF ;
    public final EObject entryRuleTStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTStatement = null;


        try {
            // InternalOberon.g:1481:51: (iv_ruleTStatement= ruleTStatement EOF )
            // InternalOberon.g:1482:2: iv_ruleTStatement= ruleTStatement EOF
            {
             newCompositeNode(grammarAccess.getTStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTStatement=ruleTStatement();

            state._fsp--;

             current =iv_ruleTStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTStatement"


    // $ANTLR start "ruleTStatement"
    // InternalOberon.g:1488:1: ruleTStatement returns [EObject current=null] : ( ( ( (lv_des_0_0= ruleDesignator ) ) (otherlv_1= ':=' ( (lv_exp_2_0= ruleExpression ) ) )? ) | (otherlv_3= 'readInt' otherlv_4= '(' ( (lv_var_5_0= RULE_ID ) ) otherlv_6= ')' ) | (otherlv_7= 'write' otherlv_8= '(' ( (lv_exp_9_0= ruleExpression ) ) otherlv_10= ')' ) | (otherlv_11= 'IF' ( (lv_cond_12_0= ruleExpression ) ) otherlv_13= 'THEN' ( (lv_thenStmt_14_0= ruleStatement ) ) (otherlv_15= 'ELSIF' ( (lv_elsifs_16_0= ruleelseIfStmt ) ) )* (otherlv_17= 'ELSE' ( (lv_elseStmt_18_0= ruleStatement ) ) )? otherlv_19= 'END' ) | (otherlv_20= 'WHILE' ( (lv_cond_21_0= ruleExpression ) ) otherlv_22= 'DO' ( (lv_stmt_23_0= ruleStatement ) ) otherlv_24= 'END' ) | (otherlv_25= 'REPEAT' ( (lv_stmt_26_0= ruleStatement ) ) otherlv_27= 'UNTIL' ( (lv_cond_28_0= ruleExpression ) ) ) | (otherlv_29= 'FOR' ( (lv_init_30_0= ruleStatement ) ) otherlv_31= 'TO' ( (lv_condition_32_0= ruleExpression ) ) otherlv_33= 'DO' ( (lv_stmt_34_0= ruleStatement ) ) otherlv_35= 'END' ) | (otherlv_36= 'FOR' ( (lv_var_37_0= RULE_ID ) ) otherlv_38= 'IN' ( (lv_min_39_0= ruleExpression ) ) otherlv_40= '..' ( (lv_max_41_0= ruleExpression ) ) otherlv_42= 'DO' ( (lv_stmt_43_0= ruleStatement ) ) otherlv_44= 'END' ) | (otherlv_45= 'LOOP' ( (lv_stmt_46_0= ruleStatement ) ) otherlv_47= 'END' ) | (otherlv_48= 'RETURN' ( (lv_exp_49_0= ruleExpression ) ) ) | (otherlv_50= 'CASE' ( (lv_exp_51_0= ruleExpression ) ) otherlv_52= 'OF' ( (lv_case_53_0= rulecaseAlternative ) ) (otherlv_54= '|' ( (lv_cases_55_0= rulecaseAlternative ) ) )* (otherlv_56= 'ELSE' ( (lv_elseStmt_57_0= ruleStatement ) ) )? otherlv_58= 'END' ) | ( (lv_exit_59_0= 'EXIT' ) ) ) ;
    public final EObject ruleTStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_var_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token lv_var_37_0=null;
        Token otherlv_38=null;
        Token otherlv_40=null;
        Token otherlv_42=null;
        Token otherlv_44=null;
        Token otherlv_45=null;
        Token otherlv_47=null;
        Token otherlv_48=null;
        Token otherlv_50=null;
        Token otherlv_52=null;
        Token otherlv_54=null;
        Token otherlv_56=null;
        Token otherlv_58=null;
        Token lv_exit_59_0=null;
        EObject lv_des_0_0 = null;

        EObject lv_exp_2_0 = null;

        EObject lv_exp_9_0 = null;

        EObject lv_cond_12_0 = null;

        EObject lv_thenStmt_14_0 = null;

        EObject lv_elsifs_16_0 = null;

        EObject lv_elseStmt_18_0 = null;

        EObject lv_cond_21_0 = null;

        EObject lv_stmt_23_0 = null;

        EObject lv_stmt_26_0 = null;

        EObject lv_cond_28_0 = null;

        EObject lv_init_30_0 = null;

        EObject lv_condition_32_0 = null;

        EObject lv_stmt_34_0 = null;

        EObject lv_min_39_0 = null;

        EObject lv_max_41_0 = null;

        EObject lv_stmt_43_0 = null;

        EObject lv_stmt_46_0 = null;

        EObject lv_exp_49_0 = null;

        EObject lv_exp_51_0 = null;

        EObject lv_case_53_0 = null;

        EObject lv_cases_55_0 = null;

        EObject lv_elseStmt_57_0 = null;



        	enterRule();

        try {
            // InternalOberon.g:1494:2: ( ( ( ( (lv_des_0_0= ruleDesignator ) ) (otherlv_1= ':=' ( (lv_exp_2_0= ruleExpression ) ) )? ) | (otherlv_3= 'readInt' otherlv_4= '(' ( (lv_var_5_0= RULE_ID ) ) otherlv_6= ')' ) | (otherlv_7= 'write' otherlv_8= '(' ( (lv_exp_9_0= ruleExpression ) ) otherlv_10= ')' ) | (otherlv_11= 'IF' ( (lv_cond_12_0= ruleExpression ) ) otherlv_13= 'THEN' ( (lv_thenStmt_14_0= ruleStatement ) ) (otherlv_15= 'ELSIF' ( (lv_elsifs_16_0= ruleelseIfStmt ) ) )* (otherlv_17= 'ELSE' ( (lv_elseStmt_18_0= ruleStatement ) ) )? otherlv_19= 'END' ) | (otherlv_20= 'WHILE' ( (lv_cond_21_0= ruleExpression ) ) otherlv_22= 'DO' ( (lv_stmt_23_0= ruleStatement ) ) otherlv_24= 'END' ) | (otherlv_25= 'REPEAT' ( (lv_stmt_26_0= ruleStatement ) ) otherlv_27= 'UNTIL' ( (lv_cond_28_0= ruleExpression ) ) ) | (otherlv_29= 'FOR' ( (lv_init_30_0= ruleStatement ) ) otherlv_31= 'TO' ( (lv_condition_32_0= ruleExpression ) ) otherlv_33= 'DO' ( (lv_stmt_34_0= ruleStatement ) ) otherlv_35= 'END' ) | (otherlv_36= 'FOR' ( (lv_var_37_0= RULE_ID ) ) otherlv_38= 'IN' ( (lv_min_39_0= ruleExpression ) ) otherlv_40= '..' ( (lv_max_41_0= ruleExpression ) ) otherlv_42= 'DO' ( (lv_stmt_43_0= ruleStatement ) ) otherlv_44= 'END' ) | (otherlv_45= 'LOOP' ( (lv_stmt_46_0= ruleStatement ) ) otherlv_47= 'END' ) | (otherlv_48= 'RETURN' ( (lv_exp_49_0= ruleExpression ) ) ) | (otherlv_50= 'CASE' ( (lv_exp_51_0= ruleExpression ) ) otherlv_52= 'OF' ( (lv_case_53_0= rulecaseAlternative ) ) (otherlv_54= '|' ( (lv_cases_55_0= rulecaseAlternative ) ) )* (otherlv_56= 'ELSE' ( (lv_elseStmt_57_0= ruleStatement ) ) )? otherlv_58= 'END' ) | ( (lv_exit_59_0= 'EXIT' ) ) ) )
            // InternalOberon.g:1495:2: ( ( ( (lv_des_0_0= ruleDesignator ) ) (otherlv_1= ':=' ( (lv_exp_2_0= ruleExpression ) ) )? ) | (otherlv_3= 'readInt' otherlv_4= '(' ( (lv_var_5_0= RULE_ID ) ) otherlv_6= ')' ) | (otherlv_7= 'write' otherlv_8= '(' ( (lv_exp_9_0= ruleExpression ) ) otherlv_10= ')' ) | (otherlv_11= 'IF' ( (lv_cond_12_0= ruleExpression ) ) otherlv_13= 'THEN' ( (lv_thenStmt_14_0= ruleStatement ) ) (otherlv_15= 'ELSIF' ( (lv_elsifs_16_0= ruleelseIfStmt ) ) )* (otherlv_17= 'ELSE' ( (lv_elseStmt_18_0= ruleStatement ) ) )? otherlv_19= 'END' ) | (otherlv_20= 'WHILE' ( (lv_cond_21_0= ruleExpression ) ) otherlv_22= 'DO' ( (lv_stmt_23_0= ruleStatement ) ) otherlv_24= 'END' ) | (otherlv_25= 'REPEAT' ( (lv_stmt_26_0= ruleStatement ) ) otherlv_27= 'UNTIL' ( (lv_cond_28_0= ruleExpression ) ) ) | (otherlv_29= 'FOR' ( (lv_init_30_0= ruleStatement ) ) otherlv_31= 'TO' ( (lv_condition_32_0= ruleExpression ) ) otherlv_33= 'DO' ( (lv_stmt_34_0= ruleStatement ) ) otherlv_35= 'END' ) | (otherlv_36= 'FOR' ( (lv_var_37_0= RULE_ID ) ) otherlv_38= 'IN' ( (lv_min_39_0= ruleExpression ) ) otherlv_40= '..' ( (lv_max_41_0= ruleExpression ) ) otherlv_42= 'DO' ( (lv_stmt_43_0= ruleStatement ) ) otherlv_44= 'END' ) | (otherlv_45= 'LOOP' ( (lv_stmt_46_0= ruleStatement ) ) otherlv_47= 'END' ) | (otherlv_48= 'RETURN' ( (lv_exp_49_0= ruleExpression ) ) ) | (otherlv_50= 'CASE' ( (lv_exp_51_0= ruleExpression ) ) otherlv_52= 'OF' ( (lv_case_53_0= rulecaseAlternative ) ) (otherlv_54= '|' ( (lv_cases_55_0= rulecaseAlternative ) ) )* (otherlv_56= 'ELSE' ( (lv_elseStmt_57_0= ruleStatement ) ) )? otherlv_58= 'END' ) | ( (lv_exit_59_0= 'EXIT' ) ) )
            {
            // InternalOberon.g:1495:2: ( ( ( (lv_des_0_0= ruleDesignator ) ) (otherlv_1= ':=' ( (lv_exp_2_0= ruleExpression ) ) )? ) | (otherlv_3= 'readInt' otherlv_4= '(' ( (lv_var_5_0= RULE_ID ) ) otherlv_6= ')' ) | (otherlv_7= 'write' otherlv_8= '(' ( (lv_exp_9_0= ruleExpression ) ) otherlv_10= ')' ) | (otherlv_11= 'IF' ( (lv_cond_12_0= ruleExpression ) ) otherlv_13= 'THEN' ( (lv_thenStmt_14_0= ruleStatement ) ) (otherlv_15= 'ELSIF' ( (lv_elsifs_16_0= ruleelseIfStmt ) ) )* (otherlv_17= 'ELSE' ( (lv_elseStmt_18_0= ruleStatement ) ) )? otherlv_19= 'END' ) | (otherlv_20= 'WHILE' ( (lv_cond_21_0= ruleExpression ) ) otherlv_22= 'DO' ( (lv_stmt_23_0= ruleStatement ) ) otherlv_24= 'END' ) | (otherlv_25= 'REPEAT' ( (lv_stmt_26_0= ruleStatement ) ) otherlv_27= 'UNTIL' ( (lv_cond_28_0= ruleExpression ) ) ) | (otherlv_29= 'FOR' ( (lv_init_30_0= ruleStatement ) ) otherlv_31= 'TO' ( (lv_condition_32_0= ruleExpression ) ) otherlv_33= 'DO' ( (lv_stmt_34_0= ruleStatement ) ) otherlv_35= 'END' ) | (otherlv_36= 'FOR' ( (lv_var_37_0= RULE_ID ) ) otherlv_38= 'IN' ( (lv_min_39_0= ruleExpression ) ) otherlv_40= '..' ( (lv_max_41_0= ruleExpression ) ) otherlv_42= 'DO' ( (lv_stmt_43_0= ruleStatement ) ) otherlv_44= 'END' ) | (otherlv_45= 'LOOP' ( (lv_stmt_46_0= ruleStatement ) ) otherlv_47= 'END' ) | (otherlv_48= 'RETURN' ( (lv_exp_49_0= ruleExpression ) ) ) | (otherlv_50= 'CASE' ( (lv_exp_51_0= ruleExpression ) ) otherlv_52= 'OF' ( (lv_case_53_0= rulecaseAlternative ) ) (otherlv_54= '|' ( (lv_cases_55_0= rulecaseAlternative ) ) )* (otherlv_56= 'ELSE' ( (lv_elseStmt_57_0= ruleStatement ) ) )? otherlv_58= 'END' ) | ( (lv_exit_59_0= 'EXIT' ) ) )
            int alt34=12;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // InternalOberon.g:1496:3: ( ( (lv_des_0_0= ruleDesignator ) ) (otherlv_1= ':=' ( (lv_exp_2_0= ruleExpression ) ) )? )
                    {
                    // InternalOberon.g:1496:3: ( ( (lv_des_0_0= ruleDesignator ) ) (otherlv_1= ':=' ( (lv_exp_2_0= ruleExpression ) ) )? )
                    // InternalOberon.g:1497:4: ( (lv_des_0_0= ruleDesignator ) ) (otherlv_1= ':=' ( (lv_exp_2_0= ruleExpression ) ) )?
                    {
                    // InternalOberon.g:1497:4: ( (lv_des_0_0= ruleDesignator ) )
                    // InternalOberon.g:1498:5: (lv_des_0_0= ruleDesignator )
                    {
                    // InternalOberon.g:1498:5: (lv_des_0_0= ruleDesignator )
                    // InternalOberon.g:1499:6: lv_des_0_0= ruleDesignator
                    {

                    						newCompositeNode(grammarAccess.getTStatementAccess().getDesDesignatorParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_des_0_0=ruleDesignator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTStatementRule());
                    						}
                    						set(
                    							current,
                    							"des",
                    							lv_des_0_0,
                    							"br.unb.cic.obron.ide.Oberon.Designator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOberon.g:1516:4: (otherlv_1= ':=' ( (lv_exp_2_0= ruleExpression ) ) )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==41) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalOberon.g:1517:5: otherlv_1= ':=' ( (lv_exp_2_0= ruleExpression ) )
                            {
                            otherlv_1=(Token)match(input,41,FOLLOW_21); 

                            					newLeafNode(otherlv_1, grammarAccess.getTStatementAccess().getColonEqualsSignKeyword_0_1_0());
                            				
                            // InternalOberon.g:1521:5: ( (lv_exp_2_0= ruleExpression ) )
                            // InternalOberon.g:1522:6: (lv_exp_2_0= ruleExpression )
                            {
                            // InternalOberon.g:1522:6: (lv_exp_2_0= ruleExpression )
                            // InternalOberon.g:1523:7: lv_exp_2_0= ruleExpression
                            {

                            							newCompositeNode(grammarAccess.getTStatementAccess().getExpExpressionParserRuleCall_0_1_1_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_exp_2_0=ruleExpression();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getTStatementRule());
                            							}
                            							set(
                            								current,
                            								"exp",
                            								lv_exp_2_0,
                            								"br.unb.cic.obron.ide.Oberon.Expression");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOberon.g:1543:3: (otherlv_3= 'readInt' otherlv_4= '(' ( (lv_var_5_0= RULE_ID ) ) otherlv_6= ')' )
                    {
                    // InternalOberon.g:1543:3: (otherlv_3= 'readInt' otherlv_4= '(' ( (lv_var_5_0= RULE_ID ) ) otherlv_6= ')' )
                    // InternalOberon.g:1544:4: otherlv_3= 'readInt' otherlv_4= '(' ( (lv_var_5_0= RULE_ID ) ) otherlv_6= ')'
                    {
                    otherlv_3=(Token)match(input,42,FOLLOW_23); 

                    				newLeafNode(otherlv_3, grammarAccess.getTStatementAccess().getReadIntKeyword_1_0());
                    			
                    otherlv_4=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getTStatementAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalOberon.g:1552:4: ( (lv_var_5_0= RULE_ID ) )
                    // InternalOberon.g:1553:5: (lv_var_5_0= RULE_ID )
                    {
                    // InternalOberon.g:1553:5: (lv_var_5_0= RULE_ID )
                    // InternalOberon.g:1554:6: lv_var_5_0= RULE_ID
                    {
                    lv_var_5_0=(Token)match(input,RULE_ID,FOLLOW_25); 

                    						newLeafNode(lv_var_5_0, grammarAccess.getTStatementAccess().getVarIDTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTStatementRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"var",
                    							lv_var_5_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getTStatementAccess().getRightParenthesisKeyword_1_3());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOberon.g:1576:3: (otherlv_7= 'write' otherlv_8= '(' ( (lv_exp_9_0= ruleExpression ) ) otherlv_10= ')' )
                    {
                    // InternalOberon.g:1576:3: (otherlv_7= 'write' otherlv_8= '(' ( (lv_exp_9_0= ruleExpression ) ) otherlv_10= ')' )
                    // InternalOberon.g:1577:4: otherlv_7= 'write' otherlv_8= '(' ( (lv_exp_9_0= ruleExpression ) ) otherlv_10= ')'
                    {
                    otherlv_7=(Token)match(input,43,FOLLOW_23); 

                    				newLeafNode(otherlv_7, grammarAccess.getTStatementAccess().getWriteKeyword_2_0());
                    			
                    otherlv_8=(Token)match(input,26,FOLLOW_21); 

                    				newLeafNode(otherlv_8, grammarAccess.getTStatementAccess().getLeftParenthesisKeyword_2_1());
                    			
                    // InternalOberon.g:1585:4: ( (lv_exp_9_0= ruleExpression ) )
                    // InternalOberon.g:1586:5: (lv_exp_9_0= ruleExpression )
                    {
                    // InternalOberon.g:1586:5: (lv_exp_9_0= ruleExpression )
                    // InternalOberon.g:1587:6: lv_exp_9_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getTStatementAccess().getExpExpressionParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_exp_9_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTStatementRule());
                    						}
                    						set(
                    							current,
                    							"exp",
                    							lv_exp_9_0,
                    							"br.unb.cic.obron.ide.Oberon.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getTStatementAccess().getRightParenthesisKeyword_2_3());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalOberon.g:1610:3: (otherlv_11= 'IF' ( (lv_cond_12_0= ruleExpression ) ) otherlv_13= 'THEN' ( (lv_thenStmt_14_0= ruleStatement ) ) (otherlv_15= 'ELSIF' ( (lv_elsifs_16_0= ruleelseIfStmt ) ) )* (otherlv_17= 'ELSE' ( (lv_elseStmt_18_0= ruleStatement ) ) )? otherlv_19= 'END' )
                    {
                    // InternalOberon.g:1610:3: (otherlv_11= 'IF' ( (lv_cond_12_0= ruleExpression ) ) otherlv_13= 'THEN' ( (lv_thenStmt_14_0= ruleStatement ) ) (otherlv_15= 'ELSIF' ( (lv_elsifs_16_0= ruleelseIfStmt ) ) )* (otherlv_17= 'ELSE' ( (lv_elseStmt_18_0= ruleStatement ) ) )? otherlv_19= 'END' )
                    // InternalOberon.g:1611:4: otherlv_11= 'IF' ( (lv_cond_12_0= ruleExpression ) ) otherlv_13= 'THEN' ( (lv_thenStmt_14_0= ruleStatement ) ) (otherlv_15= 'ELSIF' ( (lv_elsifs_16_0= ruleelseIfStmt ) ) )* (otherlv_17= 'ELSE' ( (lv_elseStmt_18_0= ruleStatement ) ) )? otherlv_19= 'END'
                    {
                    otherlv_11=(Token)match(input,44,FOLLOW_21); 

                    				newLeafNode(otherlv_11, grammarAccess.getTStatementAccess().getIFKeyword_3_0());
                    			
                    // InternalOberon.g:1615:4: ( (lv_cond_12_0= ruleExpression ) )
                    // InternalOberon.g:1616:5: (lv_cond_12_0= ruleExpression )
                    {
                    // InternalOberon.g:1616:5: (lv_cond_12_0= ruleExpression )
                    // InternalOberon.g:1617:6: lv_cond_12_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getTStatementAccess().getCondExpressionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_cond_12_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTStatementRule());
                    						}
                    						set(
                    							current,
                    							"cond",
                    							lv_cond_12_0,
                    							"br.unb.cic.obron.ide.Oberon.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,45,FOLLOW_37); 

                    				newLeafNode(otherlv_13, grammarAccess.getTStatementAccess().getTHENKeyword_3_2());
                    			
                    // InternalOberon.g:1638:4: ( (lv_thenStmt_14_0= ruleStatement ) )
                    // InternalOberon.g:1639:5: (lv_thenStmt_14_0= ruleStatement )
                    {
                    // InternalOberon.g:1639:5: (lv_thenStmt_14_0= ruleStatement )
                    // InternalOberon.g:1640:6: lv_thenStmt_14_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getTStatementAccess().getThenStmtStatementParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_thenStmt_14_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTStatementRule());
                    						}
                    						set(
                    							current,
                    							"thenStmt",
                    							lv_thenStmt_14_0,
                    							"br.unb.cic.obron.ide.Oberon.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOberon.g:1657:4: (otherlv_15= 'ELSIF' ( (lv_elsifs_16_0= ruleelseIfStmt ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==46) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalOberon.g:1658:5: otherlv_15= 'ELSIF' ( (lv_elsifs_16_0= ruleelseIfStmt ) )
                    	    {
                    	    otherlv_15=(Token)match(input,46,FOLLOW_21); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getTStatementAccess().getELSIFKeyword_3_4_0());
                    	    				
                    	    // InternalOberon.g:1662:5: ( (lv_elsifs_16_0= ruleelseIfStmt ) )
                    	    // InternalOberon.g:1663:6: (lv_elsifs_16_0= ruleelseIfStmt )
                    	    {
                    	    // InternalOberon.g:1663:6: (lv_elsifs_16_0= ruleelseIfStmt )
                    	    // InternalOberon.g:1664:7: lv_elsifs_16_0= ruleelseIfStmt
                    	    {

                    	    							newCompositeNode(grammarAccess.getTStatementAccess().getElsifsElseIfStmtParserRuleCall_3_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_40);
                    	    lv_elsifs_16_0=ruleelseIfStmt();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTStatementRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elsifs",
                    	    								lv_elsifs_16_0,
                    	    								"br.unb.cic.obron.ide.Oberon.elseIfStmt");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    // InternalOberon.g:1682:4: (otherlv_17= 'ELSE' ( (lv_elseStmt_18_0= ruleStatement ) ) )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==47) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalOberon.g:1683:5: otherlv_17= 'ELSE' ( (lv_elseStmt_18_0= ruleStatement ) )
                            {
                            otherlv_17=(Token)match(input,47,FOLLOW_37); 

                            					newLeafNode(otherlv_17, grammarAccess.getTStatementAccess().getELSEKeyword_3_5_0());
                            				
                            // InternalOberon.g:1687:5: ( (lv_elseStmt_18_0= ruleStatement ) )
                            // InternalOberon.g:1688:6: (lv_elseStmt_18_0= ruleStatement )
                            {
                            // InternalOberon.g:1688:6: (lv_elseStmt_18_0= ruleStatement )
                            // InternalOberon.g:1689:7: lv_elseStmt_18_0= ruleStatement
                            {

                            							newCompositeNode(grammarAccess.getTStatementAccess().getElseStmtStatementParserRuleCall_3_5_1_0());
                            						
                            pushFollow(FOLLOW_7);
                            lv_elseStmt_18_0=ruleStatement();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getTStatementRule());
                            							}
                            							set(
                            								current,
                            								"elseStmt",
                            								lv_elseStmt_18_0,
                            								"br.unb.cic.obron.ide.Oberon.Statement");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_19=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_19, grammarAccess.getTStatementAccess().getENDKeyword_3_6());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalOberon.g:1713:3: (otherlv_20= 'WHILE' ( (lv_cond_21_0= ruleExpression ) ) otherlv_22= 'DO' ( (lv_stmt_23_0= ruleStatement ) ) otherlv_24= 'END' )
                    {
                    // InternalOberon.g:1713:3: (otherlv_20= 'WHILE' ( (lv_cond_21_0= ruleExpression ) ) otherlv_22= 'DO' ( (lv_stmt_23_0= ruleStatement ) ) otherlv_24= 'END' )
                    // InternalOberon.g:1714:4: otherlv_20= 'WHILE' ( (lv_cond_21_0= ruleExpression ) ) otherlv_22= 'DO' ( (lv_stmt_23_0= ruleStatement ) ) otherlv_24= 'END'
                    {
                    otherlv_20=(Token)match(input,48,FOLLOW_21); 

                    				newLeafNode(otherlv_20, grammarAccess.getTStatementAccess().getWHILEKeyword_4_0());
                    			
                    // InternalOberon.g:1718:4: ( (lv_cond_21_0= ruleExpression ) )
                    // InternalOberon.g:1719:5: (lv_cond_21_0= ruleExpression )
                    {
                    // InternalOberon.g:1719:5: (lv_cond_21_0= ruleExpression )
                    // InternalOberon.g:1720:6: lv_cond_21_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getTStatementAccess().getCondExpressionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_cond_21_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTStatementRule());
                    						}
                    						set(
                    							current,
                    							"cond",
                    							lv_cond_21_0,
                    							"br.unb.cic.obron.ide.Oberon.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_22=(Token)match(input,49,FOLLOW_37); 

                    				newLeafNode(otherlv_22, grammarAccess.getTStatementAccess().getDOKeyword_4_2());
                    			
                    // InternalOberon.g:1741:4: ( (lv_stmt_23_0= ruleStatement ) )
                    // InternalOberon.g:1742:5: (lv_stmt_23_0= ruleStatement )
                    {
                    // InternalOberon.g:1742:5: (lv_stmt_23_0= ruleStatement )
                    // InternalOberon.g:1743:6: lv_stmt_23_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getTStatementAccess().getStmtStatementParserRuleCall_4_3_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_stmt_23_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTStatementRule());
                    						}
                    						set(
                    							current,
                    							"stmt",
                    							lv_stmt_23_0,
                    							"br.unb.cic.obron.ide.Oberon.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_24=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_24, grammarAccess.getTStatementAccess().getENDKeyword_4_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalOberon.g:1766:3: (otherlv_25= 'REPEAT' ( (lv_stmt_26_0= ruleStatement ) ) otherlv_27= 'UNTIL' ( (lv_cond_28_0= ruleExpression ) ) )
                    {
                    // InternalOberon.g:1766:3: (otherlv_25= 'REPEAT' ( (lv_stmt_26_0= ruleStatement ) ) otherlv_27= 'UNTIL' ( (lv_cond_28_0= ruleExpression ) ) )
                    // InternalOberon.g:1767:4: otherlv_25= 'REPEAT' ( (lv_stmt_26_0= ruleStatement ) ) otherlv_27= 'UNTIL' ( (lv_cond_28_0= ruleExpression ) )
                    {
                    otherlv_25=(Token)match(input,50,FOLLOW_37); 

                    				newLeafNode(otherlv_25, grammarAccess.getTStatementAccess().getREPEATKeyword_5_0());
                    			
                    // InternalOberon.g:1771:4: ( (lv_stmt_26_0= ruleStatement ) )
                    // InternalOberon.g:1772:5: (lv_stmt_26_0= ruleStatement )
                    {
                    // InternalOberon.g:1772:5: (lv_stmt_26_0= ruleStatement )
                    // InternalOberon.g:1773:6: lv_stmt_26_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getTStatementAccess().getStmtStatementParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_stmt_26_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTStatementRule());
                    						}
                    						set(
                    							current,
                    							"stmt",
                    							lv_stmt_26_0,
                    							"br.unb.cic.obron.ide.Oberon.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_27=(Token)match(input,51,FOLLOW_21); 

                    				newLeafNode(otherlv_27, grammarAccess.getTStatementAccess().getUNTILKeyword_5_2());
                    			
                    // InternalOberon.g:1794:4: ( (lv_cond_28_0= ruleExpression ) )
                    // InternalOberon.g:1795:5: (lv_cond_28_0= ruleExpression )
                    {
                    // InternalOberon.g:1795:5: (lv_cond_28_0= ruleExpression )
                    // InternalOberon.g:1796:6: lv_cond_28_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getTStatementAccess().getCondExpressionParserRuleCall_5_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_cond_28_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTStatementRule());
                    						}
                    						set(
                    							current,
                    							"cond",
                    							lv_cond_28_0,
                    							"br.unb.cic.obron.ide.Oberon.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalOberon.g:1815:3: (otherlv_29= 'FOR' ( (lv_init_30_0= ruleStatement ) ) otherlv_31= 'TO' ( (lv_condition_32_0= ruleExpression ) ) otherlv_33= 'DO' ( (lv_stmt_34_0= ruleStatement ) ) otherlv_35= 'END' )
                    {
                    // InternalOberon.g:1815:3: (otherlv_29= 'FOR' ( (lv_init_30_0= ruleStatement ) ) otherlv_31= 'TO' ( (lv_condition_32_0= ruleExpression ) ) otherlv_33= 'DO' ( (lv_stmt_34_0= ruleStatement ) ) otherlv_35= 'END' )
                    // InternalOberon.g:1816:4: otherlv_29= 'FOR' ( (lv_init_30_0= ruleStatement ) ) otherlv_31= 'TO' ( (lv_condition_32_0= ruleExpression ) ) otherlv_33= 'DO' ( (lv_stmt_34_0= ruleStatement ) ) otherlv_35= 'END'
                    {
                    otherlv_29=(Token)match(input,52,FOLLOW_37); 

                    				newLeafNode(otherlv_29, grammarAccess.getTStatementAccess().getFORKeyword_6_0());
                    			
                    // InternalOberon.g:1820:4: ( (lv_init_30_0= ruleStatement ) )
                    // InternalOberon.g:1821:5: (lv_init_30_0= ruleStatement )
                    {
                    // InternalOberon.g:1821:5: (lv_init_30_0= ruleStatement )
                    // InternalOberon.g:1822:6: lv_init_30_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getTStatementAccess().getInitStatementParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_43);
                    lv_init_30_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTStatementRule());
                    						}
                    						set(
                    							current,
                    							"init",
                    							lv_init_30_0,
                    							"br.unb.cic.obron.ide.Oberon.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_31=(Token)match(input,53,FOLLOW_21); 

                    				newLeafNode(otherlv_31, grammarAccess.getTStatementAccess().getTOKeyword_6_2());
                    			
                    // InternalOberon.g:1843:4: ( (lv_condition_32_0= ruleExpression ) )
                    // InternalOberon.g:1844:5: (lv_condition_32_0= ruleExpression )
                    {
                    // InternalOberon.g:1844:5: (lv_condition_32_0= ruleExpression )
                    // InternalOberon.g:1845:6: lv_condition_32_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getTStatementAccess().getConditionExpressionParserRuleCall_6_3_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_condition_32_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTStatementRule());
                    						}
                    						set(
                    							current,
                    							"condition",
                    							lv_condition_32_0,
                    							"br.unb.cic.obron.ide.Oberon.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_33=(Token)match(input,49,FOLLOW_37); 

                    				newLeafNode(otherlv_33, grammarAccess.getTStatementAccess().getDOKeyword_6_4());
                    			
                    // InternalOberon.g:1866:4: ( (lv_stmt_34_0= ruleStatement ) )
                    // InternalOberon.g:1867:5: (lv_stmt_34_0= ruleStatement )
                    {
                    // InternalOberon.g:1867:5: (lv_stmt_34_0= ruleStatement )
                    // InternalOberon.g:1868:6: lv_stmt_34_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getTStatementAccess().getStmtStatementParserRuleCall_6_5_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_stmt_34_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTStatementRule());
                    						}
                    						set(
                    							current,
                    							"stmt",
                    							lv_stmt_34_0,
                    							"br.unb.cic.obron.ide.Oberon.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_35=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_35, grammarAccess.getTStatementAccess().getENDKeyword_6_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalOberon.g:1891:3: (otherlv_36= 'FOR' ( (lv_var_37_0= RULE_ID ) ) otherlv_38= 'IN' ( (lv_min_39_0= ruleExpression ) ) otherlv_40= '..' ( (lv_max_41_0= ruleExpression ) ) otherlv_42= 'DO' ( (lv_stmt_43_0= ruleStatement ) ) otherlv_44= 'END' )
                    {
                    // InternalOberon.g:1891:3: (otherlv_36= 'FOR' ( (lv_var_37_0= RULE_ID ) ) otherlv_38= 'IN' ( (lv_min_39_0= ruleExpression ) ) otherlv_40= '..' ( (lv_max_41_0= ruleExpression ) ) otherlv_42= 'DO' ( (lv_stmt_43_0= ruleStatement ) ) otherlv_44= 'END' )
                    // InternalOberon.g:1892:4: otherlv_36= 'FOR' ( (lv_var_37_0= RULE_ID ) ) otherlv_38= 'IN' ( (lv_min_39_0= ruleExpression ) ) otherlv_40= '..' ( (lv_max_41_0= ruleExpression ) ) otherlv_42= 'DO' ( (lv_stmt_43_0= ruleStatement ) ) otherlv_44= 'END'
                    {
                    otherlv_36=(Token)match(input,52,FOLLOW_3); 

                    				newLeafNode(otherlv_36, grammarAccess.getTStatementAccess().getFORKeyword_7_0());
                    			
                    // InternalOberon.g:1896:4: ( (lv_var_37_0= RULE_ID ) )
                    // InternalOberon.g:1897:5: (lv_var_37_0= RULE_ID )
                    {
                    // InternalOberon.g:1897:5: (lv_var_37_0= RULE_ID )
                    // InternalOberon.g:1898:6: lv_var_37_0= RULE_ID
                    {
                    lv_var_37_0=(Token)match(input,RULE_ID,FOLLOW_44); 

                    						newLeafNode(lv_var_37_0, grammarAccess.getTStatementAccess().getVarIDTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTStatementRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"var",
                    							lv_var_37_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_38=(Token)match(input,54,FOLLOW_21); 

                    				newLeafNode(otherlv_38, grammarAccess.getTStatementAccess().getINKeyword_7_2());
                    			
                    // InternalOberon.g:1918:4: ( (lv_min_39_0= ruleExpression ) )
                    // InternalOberon.g:1919:5: (lv_min_39_0= ruleExpression )
                    {
                    // InternalOberon.g:1919:5: (lv_min_39_0= ruleExpression )
                    // InternalOberon.g:1920:6: lv_min_39_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getTStatementAccess().getMinExpressionParserRuleCall_7_3_0());
                    					
                    pushFollow(FOLLOW_45);
                    lv_min_39_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTStatementRule());
                    						}
                    						set(
                    							current,
                    							"min",
                    							lv_min_39_0,
                    							"br.unb.cic.obron.ide.Oberon.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_40=(Token)match(input,55,FOLLOW_21); 

                    				newLeafNode(otherlv_40, grammarAccess.getTStatementAccess().getFullStopFullStopKeyword_7_4());
                    			
                    // InternalOberon.g:1941:4: ( (lv_max_41_0= ruleExpression ) )
                    // InternalOberon.g:1942:5: (lv_max_41_0= ruleExpression )
                    {
                    // InternalOberon.g:1942:5: (lv_max_41_0= ruleExpression )
                    // InternalOberon.g:1943:6: lv_max_41_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getTStatementAccess().getMaxExpressionParserRuleCall_7_5_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_max_41_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTStatementRule());
                    						}
                    						set(
                    							current,
                    							"max",
                    							lv_max_41_0,
                    							"br.unb.cic.obron.ide.Oberon.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_42=(Token)match(input,49,FOLLOW_37); 

                    				newLeafNode(otherlv_42, grammarAccess.getTStatementAccess().getDOKeyword_7_6());
                    			
                    // InternalOberon.g:1964:4: ( (lv_stmt_43_0= ruleStatement ) )
                    // InternalOberon.g:1965:5: (lv_stmt_43_0= ruleStatement )
                    {
                    // InternalOberon.g:1965:5: (lv_stmt_43_0= ruleStatement )
                    // InternalOberon.g:1966:6: lv_stmt_43_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getTStatementAccess().getStmtStatementParserRuleCall_7_7_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_stmt_43_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTStatementRule());
                    						}
                    						set(
                    							current,
                    							"stmt",
                    							lv_stmt_43_0,
                    							"br.unb.cic.obron.ide.Oberon.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_44=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_44, grammarAccess.getTStatementAccess().getENDKeyword_7_8());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalOberon.g:1989:3: (otherlv_45= 'LOOP' ( (lv_stmt_46_0= ruleStatement ) ) otherlv_47= 'END' )
                    {
                    // InternalOberon.g:1989:3: (otherlv_45= 'LOOP' ( (lv_stmt_46_0= ruleStatement ) ) otherlv_47= 'END' )
                    // InternalOberon.g:1990:4: otherlv_45= 'LOOP' ( (lv_stmt_46_0= ruleStatement ) ) otherlv_47= 'END'
                    {
                    otherlv_45=(Token)match(input,56,FOLLOW_37); 

                    				newLeafNode(otherlv_45, grammarAccess.getTStatementAccess().getLOOPKeyword_8_0());
                    			
                    // InternalOberon.g:1994:4: ( (lv_stmt_46_0= ruleStatement ) )
                    // InternalOberon.g:1995:5: (lv_stmt_46_0= ruleStatement )
                    {
                    // InternalOberon.g:1995:5: (lv_stmt_46_0= ruleStatement )
                    // InternalOberon.g:1996:6: lv_stmt_46_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getTStatementAccess().getStmtStatementParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_stmt_46_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTStatementRule());
                    						}
                    						set(
                    							current,
                    							"stmt",
                    							lv_stmt_46_0,
                    							"br.unb.cic.obron.ide.Oberon.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_47=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_47, grammarAccess.getTStatementAccess().getENDKeyword_8_2());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalOberon.g:2019:3: (otherlv_48= 'RETURN' ( (lv_exp_49_0= ruleExpression ) ) )
                    {
                    // InternalOberon.g:2019:3: (otherlv_48= 'RETURN' ( (lv_exp_49_0= ruleExpression ) ) )
                    // InternalOberon.g:2020:4: otherlv_48= 'RETURN' ( (lv_exp_49_0= ruleExpression ) )
                    {
                    otherlv_48=(Token)match(input,57,FOLLOW_21); 

                    				newLeafNode(otherlv_48, grammarAccess.getTStatementAccess().getRETURNKeyword_9_0());
                    			
                    // InternalOberon.g:2024:4: ( (lv_exp_49_0= ruleExpression ) )
                    // InternalOberon.g:2025:5: (lv_exp_49_0= ruleExpression )
                    {
                    // InternalOberon.g:2025:5: (lv_exp_49_0= ruleExpression )
                    // InternalOberon.g:2026:6: lv_exp_49_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getTStatementAccess().getExpExpressionParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_exp_49_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTStatementRule());
                    						}
                    						set(
                    							current,
                    							"exp",
                    							lv_exp_49_0,
                    							"br.unb.cic.obron.ide.Oberon.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 11 :
                    // InternalOberon.g:2045:3: (otherlv_50= 'CASE' ( (lv_exp_51_0= ruleExpression ) ) otherlv_52= 'OF' ( (lv_case_53_0= rulecaseAlternative ) ) (otherlv_54= '|' ( (lv_cases_55_0= rulecaseAlternative ) ) )* (otherlv_56= 'ELSE' ( (lv_elseStmt_57_0= ruleStatement ) ) )? otherlv_58= 'END' )
                    {
                    // InternalOberon.g:2045:3: (otherlv_50= 'CASE' ( (lv_exp_51_0= ruleExpression ) ) otherlv_52= 'OF' ( (lv_case_53_0= rulecaseAlternative ) ) (otherlv_54= '|' ( (lv_cases_55_0= rulecaseAlternative ) ) )* (otherlv_56= 'ELSE' ( (lv_elseStmt_57_0= ruleStatement ) ) )? otherlv_58= 'END' )
                    // InternalOberon.g:2046:4: otherlv_50= 'CASE' ( (lv_exp_51_0= ruleExpression ) ) otherlv_52= 'OF' ( (lv_case_53_0= rulecaseAlternative ) ) (otherlv_54= '|' ( (lv_cases_55_0= rulecaseAlternative ) ) )* (otherlv_56= 'ELSE' ( (lv_elseStmt_57_0= ruleStatement ) ) )? otherlv_58= 'END'
                    {
                    otherlv_50=(Token)match(input,58,FOLLOW_21); 

                    				newLeafNode(otherlv_50, grammarAccess.getTStatementAccess().getCASEKeyword_10_0());
                    			
                    // InternalOberon.g:2050:4: ( (lv_exp_51_0= ruleExpression ) )
                    // InternalOberon.g:2051:5: (lv_exp_51_0= ruleExpression )
                    {
                    // InternalOberon.g:2051:5: (lv_exp_51_0= ruleExpression )
                    // InternalOberon.g:2052:6: lv_exp_51_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getTStatementAccess().getExpExpressionParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_exp_51_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTStatementRule());
                    						}
                    						set(
                    							current,
                    							"exp",
                    							lv_exp_51_0,
                    							"br.unb.cic.obron.ide.Oberon.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_52=(Token)match(input,21,FOLLOW_21); 

                    				newLeafNode(otherlv_52, grammarAccess.getTStatementAccess().getOFKeyword_10_2());
                    			
                    // InternalOberon.g:2073:4: ( (lv_case_53_0= rulecaseAlternative ) )
                    // InternalOberon.g:2074:5: (lv_case_53_0= rulecaseAlternative )
                    {
                    // InternalOberon.g:2074:5: (lv_case_53_0= rulecaseAlternative )
                    // InternalOberon.g:2075:6: lv_case_53_0= rulecaseAlternative
                    {

                    						newCompositeNode(grammarAccess.getTStatementAccess().getCaseCaseAlternativeParserRuleCall_10_3_0());
                    					
                    pushFollow(FOLLOW_46);
                    lv_case_53_0=rulecaseAlternative();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTStatementRule());
                    						}
                    						set(
                    							current,
                    							"case",
                    							lv_case_53_0,
                    							"br.unb.cic.obron.ide.Oberon.caseAlternative");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOberon.g:2092:4: (otherlv_54= '|' ( (lv_cases_55_0= rulecaseAlternative ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==59) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalOberon.g:2093:5: otherlv_54= '|' ( (lv_cases_55_0= rulecaseAlternative ) )
                    	    {
                    	    otherlv_54=(Token)match(input,59,FOLLOW_21); 

                    	    					newLeafNode(otherlv_54, grammarAccess.getTStatementAccess().getVerticalLineKeyword_10_4_0());
                    	    				
                    	    // InternalOberon.g:2097:5: ( (lv_cases_55_0= rulecaseAlternative ) )
                    	    // InternalOberon.g:2098:6: (lv_cases_55_0= rulecaseAlternative )
                    	    {
                    	    // InternalOberon.g:2098:6: (lv_cases_55_0= rulecaseAlternative )
                    	    // InternalOberon.g:2099:7: lv_cases_55_0= rulecaseAlternative
                    	    {

                    	    							newCompositeNode(grammarAccess.getTStatementAccess().getCasesCaseAlternativeParserRuleCall_10_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_46);
                    	    lv_cases_55_0=rulecaseAlternative();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTStatementRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"cases",
                    	    								lv_cases_55_0,
                    	    								"br.unb.cic.obron.ide.Oberon.caseAlternative");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    // InternalOberon.g:2117:4: (otherlv_56= 'ELSE' ( (lv_elseStmt_57_0= ruleStatement ) ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==47) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalOberon.g:2118:5: otherlv_56= 'ELSE' ( (lv_elseStmt_57_0= ruleStatement ) )
                            {
                            otherlv_56=(Token)match(input,47,FOLLOW_37); 

                            					newLeafNode(otherlv_56, grammarAccess.getTStatementAccess().getELSEKeyword_10_5_0());
                            				
                            // InternalOberon.g:2122:5: ( (lv_elseStmt_57_0= ruleStatement ) )
                            // InternalOberon.g:2123:6: (lv_elseStmt_57_0= ruleStatement )
                            {
                            // InternalOberon.g:2123:6: (lv_elseStmt_57_0= ruleStatement )
                            // InternalOberon.g:2124:7: lv_elseStmt_57_0= ruleStatement
                            {

                            							newCompositeNode(grammarAccess.getTStatementAccess().getElseStmtStatementParserRuleCall_10_5_1_0());
                            						
                            pushFollow(FOLLOW_7);
                            lv_elseStmt_57_0=ruleStatement();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getTStatementRule());
                            							}
                            							set(
                            								current,
                            								"elseStmt",
                            								lv_elseStmt_57_0,
                            								"br.unb.cic.obron.ide.Oberon.Statement");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_58=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_58, grammarAccess.getTStatementAccess().getENDKeyword_10_6());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalOberon.g:2148:3: ( (lv_exit_59_0= 'EXIT' ) )
                    {
                    // InternalOberon.g:2148:3: ( (lv_exit_59_0= 'EXIT' ) )
                    // InternalOberon.g:2149:4: (lv_exit_59_0= 'EXIT' )
                    {
                    // InternalOberon.g:2149:4: (lv_exit_59_0= 'EXIT' )
                    // InternalOberon.g:2150:5: lv_exit_59_0= 'EXIT'
                    {
                    lv_exit_59_0=(Token)match(input,60,FOLLOW_2); 

                    					newLeafNode(lv_exit_59_0, grammarAccess.getTStatementAccess().getExitEXITKeyword_11_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTStatementRule());
                    					}
                    					setWithLastConsumed(current, "exit", lv_exit_59_0, "EXIT");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTStatement"


    // $ANTLR start "entryRuleDesignator"
    // InternalOberon.g:2166:1: entryRuleDesignator returns [EObject current=null] : iv_ruleDesignator= ruleDesignator EOF ;
    public final EObject entryRuleDesignator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDesignator = null;


        try {
            // InternalOberon.g:2166:51: (iv_ruleDesignator= ruleDesignator EOF )
            // InternalOberon.g:2167:2: iv_ruleDesignator= ruleDesignator EOF
            {
             newCompositeNode(grammarAccess.getDesignatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDesignator=ruleDesignator();

            state._fsp--;

             current =iv_ruleDesignator; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDesignator"


    // $ANTLR start "ruleDesignator"
    // InternalOberon.g:2173:1: ruleDesignator returns [EObject current=null] : ( ( (lv_designator_0_0= ruleTDesignator ) ) ( (otherlv_1= '[' ( (lv_indexes_2_0= ruleExpression ) ) otherlv_3= ']' ) | (otherlv_4= '.' ( (lv_atribs_5_0= RULE_ID ) ) ) )* ) ;
    public final EObject ruleDesignator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_atribs_5_0=null;
        EObject lv_designator_0_0 = null;

        EObject lv_indexes_2_0 = null;



        	enterRule();

        try {
            // InternalOberon.g:2179:2: ( ( ( (lv_designator_0_0= ruleTDesignator ) ) ( (otherlv_1= '[' ( (lv_indexes_2_0= ruleExpression ) ) otherlv_3= ']' ) | (otherlv_4= '.' ( (lv_atribs_5_0= RULE_ID ) ) ) )* ) )
            // InternalOberon.g:2180:2: ( ( (lv_designator_0_0= ruleTDesignator ) ) ( (otherlv_1= '[' ( (lv_indexes_2_0= ruleExpression ) ) otherlv_3= ']' ) | (otherlv_4= '.' ( (lv_atribs_5_0= RULE_ID ) ) ) )* )
            {
            // InternalOberon.g:2180:2: ( ( (lv_designator_0_0= ruleTDesignator ) ) ( (otherlv_1= '[' ( (lv_indexes_2_0= ruleExpression ) ) otherlv_3= ']' ) | (otherlv_4= '.' ( (lv_atribs_5_0= RULE_ID ) ) ) )* )
            // InternalOberon.g:2181:3: ( (lv_designator_0_0= ruleTDesignator ) ) ( (otherlv_1= '[' ( (lv_indexes_2_0= ruleExpression ) ) otherlv_3= ']' ) | (otherlv_4= '.' ( (lv_atribs_5_0= RULE_ID ) ) ) )*
            {
            // InternalOberon.g:2181:3: ( (lv_designator_0_0= ruleTDesignator ) )
            // InternalOberon.g:2182:4: (lv_designator_0_0= ruleTDesignator )
            {
            // InternalOberon.g:2182:4: (lv_designator_0_0= ruleTDesignator )
            // InternalOberon.g:2183:5: lv_designator_0_0= ruleTDesignator
            {

            					newCompositeNode(grammarAccess.getDesignatorAccess().getDesignatorTDesignatorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_33);
            lv_designator_0_0=ruleTDesignator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDesignatorRule());
            					}
            					set(
            						current,
            						"designator",
            						lv_designator_0_0,
            						"br.unb.cic.obron.ide.Oberon.TDesignator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOberon.g:2200:3: ( (otherlv_1= '[' ( (lv_indexes_2_0= ruleExpression ) ) otherlv_3= ']' ) | (otherlv_4= '.' ( (lv_atribs_5_0= RULE_ID ) ) ) )*
            loop35:
            do {
                int alt35=3;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==39) ) {
                    alt35=1;
                }
                else if ( (LA35_0==14) ) {
                    alt35=2;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalOberon.g:2201:4: (otherlv_1= '[' ( (lv_indexes_2_0= ruleExpression ) ) otherlv_3= ']' )
            	    {
            	    // InternalOberon.g:2201:4: (otherlv_1= '[' ( (lv_indexes_2_0= ruleExpression ) ) otherlv_3= ']' )
            	    // InternalOberon.g:2202:5: otherlv_1= '[' ( (lv_indexes_2_0= ruleExpression ) ) otherlv_3= ']'
            	    {
            	    otherlv_1=(Token)match(input,39,FOLLOW_21); 

            	    					newLeafNode(otherlv_1, grammarAccess.getDesignatorAccess().getLeftSquareBracketKeyword_1_0_0());
            	    				
            	    // InternalOberon.g:2206:5: ( (lv_indexes_2_0= ruleExpression ) )
            	    // InternalOberon.g:2207:6: (lv_indexes_2_0= ruleExpression )
            	    {
            	    // InternalOberon.g:2207:6: (lv_indexes_2_0= ruleExpression )
            	    // InternalOberon.g:2208:7: lv_indexes_2_0= ruleExpression
            	    {

            	    							newCompositeNode(grammarAccess.getDesignatorAccess().getIndexesExpressionParserRuleCall_1_0_1_0());
            	    						
            	    pushFollow(FOLLOW_34);
            	    lv_indexes_2_0=ruleExpression();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getDesignatorRule());
            	    							}
            	    							add(
            	    								current,
            	    								"indexes",
            	    								lv_indexes_2_0,
            	    								"br.unb.cic.obron.ide.Oberon.Expression");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    otherlv_3=(Token)match(input,40,FOLLOW_33); 

            	    					newLeafNode(otherlv_3, grammarAccess.getDesignatorAccess().getRightSquareBracketKeyword_1_0_2());
            	    				

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalOberon.g:2231:4: (otherlv_4= '.' ( (lv_atribs_5_0= RULE_ID ) ) )
            	    {
            	    // InternalOberon.g:2231:4: (otherlv_4= '.' ( (lv_atribs_5_0= RULE_ID ) ) )
            	    // InternalOberon.g:2232:5: otherlv_4= '.' ( (lv_atribs_5_0= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FOLLOW_3); 

            	    					newLeafNode(otherlv_4, grammarAccess.getDesignatorAccess().getFullStopKeyword_1_1_0());
            	    				
            	    // InternalOberon.g:2236:5: ( (lv_atribs_5_0= RULE_ID ) )
            	    // InternalOberon.g:2237:6: (lv_atribs_5_0= RULE_ID )
            	    {
            	    // InternalOberon.g:2237:6: (lv_atribs_5_0= RULE_ID )
            	    // InternalOberon.g:2238:7: lv_atribs_5_0= RULE_ID
            	    {
            	    lv_atribs_5_0=(Token)match(input,RULE_ID,FOLLOW_33); 

            	    							newLeafNode(lv_atribs_5_0, grammarAccess.getDesignatorAccess().getAtribsIDTerminalRuleCall_1_1_1_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getDesignatorRule());
            	    							}
            	    							addWithLastConsumed(
            	    								current,
            	    								"atribs",
            	    								lv_atribs_5_0,
            	    								"org.eclipse.xtext.common.Terminals.ID");
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDesignator"


    // $ANTLR start "entryRuleTDesignator"
    // InternalOberon.g:2260:1: entryRuleTDesignator returns [EObject current=null] : iv_ruleTDesignator= ruleTDesignator EOF ;
    public final EObject entryRuleTDesignator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTDesignator = null;


        try {
            // InternalOberon.g:2260:52: (iv_ruleTDesignator= ruleTDesignator EOF )
            // InternalOberon.g:2261:2: iv_ruleTDesignator= ruleTDesignator EOF
            {
             newCompositeNode(grammarAccess.getTDesignatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTDesignator=ruleTDesignator();

            state._fsp--;

             current =iv_ruleTDesignator; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTDesignator"


    // $ANTLR start "ruleTDesignator"
    // InternalOberon.g:2267:1: ruleTDesignator returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_args_2_0= ruleArguments ) )? otherlv_3= ')' )? ) ;
    public final EObject ruleTDesignator() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_args_2_0 = null;



        	enterRule();

        try {
            // InternalOberon.g:2273:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_args_2_0= ruleArguments ) )? otherlv_3= ')' )? ) )
            // InternalOberon.g:2274:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_args_2_0= ruleArguments ) )? otherlv_3= ')' )? )
            {
            // InternalOberon.g:2274:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_args_2_0= ruleArguments ) )? otherlv_3= ')' )? )
            // InternalOberon.g:2275:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_args_2_0= ruleArguments ) )? otherlv_3= ')' )?
            {
            // InternalOberon.g:2275:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalOberon.g:2276:4: (lv_name_0_0= RULE_ID )
            {
            // InternalOberon.g:2276:4: (lv_name_0_0= RULE_ID )
            // InternalOberon.g:2277:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_47); 

            					newLeafNode(lv_name_0_0, grammarAccess.getTDesignatorAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTDesignatorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalOberon.g:2293:3: (otherlv_1= '(' ( (lv_args_2_0= ruleArguments ) )? otherlv_3= ')' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==26) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalOberon.g:2294:4: otherlv_1= '(' ( (lv_args_2_0= ruleArguments ) )? otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_32); 

                    				newLeafNode(otherlv_1, grammarAccess.getTDesignatorAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalOberon.g:2298:4: ( (lv_args_2_0= ruleArguments ) )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( ((LA36_0>=RULE_ID && LA36_0<=RULE_INT)||LA36_0==26||(LA36_0>=63 && LA36_0<=64)) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalOberon.g:2299:5: (lv_args_2_0= ruleArguments )
                            {
                            // InternalOberon.g:2299:5: (lv_args_2_0= ruleArguments )
                            // InternalOberon.g:2300:6: lv_args_2_0= ruleArguments
                            {

                            						newCompositeNode(grammarAccess.getTDesignatorAccess().getArgsArgumentsParserRuleCall_1_1_0());
                            					
                            pushFollow(FOLLOW_25);
                            lv_args_2_0=ruleArguments();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getTDesignatorRule());
                            						}
                            						add(
                            							current,
                            							"args",
                            							lv_args_2_0,
                            							"br.unb.cic.obron.ide.Oberon.Arguments");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getTDesignatorAccess().getRightParenthesisKeyword_1_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTDesignator"


    // $ANTLR start "entryRulecaseAlternative"
    // InternalOberon.g:2326:1: entryRulecaseAlternative returns [EObject current=null] : iv_rulecaseAlternative= rulecaseAlternative EOF ;
    public final EObject entryRulecaseAlternative() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecaseAlternative = null;


        try {
            // InternalOberon.g:2326:56: (iv_rulecaseAlternative= rulecaseAlternative EOF )
            // InternalOberon.g:2327:2: iv_rulecaseAlternative= rulecaseAlternative EOF
            {
             newCompositeNode(grammarAccess.getCaseAlternativeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecaseAlternative=rulecaseAlternative();

            state._fsp--;

             current =iv_rulecaseAlternative; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecaseAlternative"


    // $ANTLR start "rulecaseAlternative"
    // InternalOberon.g:2333:1: rulecaseAlternative returns [EObject current=null] : ( ( (lv_exp_0_0= ruleExpression ) ) (otherlv_1= '..' ( (lv_max_2_0= ruleExpression ) ) )? otherlv_3= ':' ( (lv_stmt_4_0= ruleStatement ) ) ) ;
    public final EObject rulecaseAlternative() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_exp_0_0 = null;

        EObject lv_max_2_0 = null;

        EObject lv_stmt_4_0 = null;



        	enterRule();

        try {
            // InternalOberon.g:2339:2: ( ( ( (lv_exp_0_0= ruleExpression ) ) (otherlv_1= '..' ( (lv_max_2_0= ruleExpression ) ) )? otherlv_3= ':' ( (lv_stmt_4_0= ruleStatement ) ) ) )
            // InternalOberon.g:2340:2: ( ( (lv_exp_0_0= ruleExpression ) ) (otherlv_1= '..' ( (lv_max_2_0= ruleExpression ) ) )? otherlv_3= ':' ( (lv_stmt_4_0= ruleStatement ) ) )
            {
            // InternalOberon.g:2340:2: ( ( (lv_exp_0_0= ruleExpression ) ) (otherlv_1= '..' ( (lv_max_2_0= ruleExpression ) ) )? otherlv_3= ':' ( (lv_stmt_4_0= ruleStatement ) ) )
            // InternalOberon.g:2341:3: ( (lv_exp_0_0= ruleExpression ) ) (otherlv_1= '..' ( (lv_max_2_0= ruleExpression ) ) )? otherlv_3= ':' ( (lv_stmt_4_0= ruleStatement ) )
            {
            // InternalOberon.g:2341:3: ( (lv_exp_0_0= ruleExpression ) )
            // InternalOberon.g:2342:4: (lv_exp_0_0= ruleExpression )
            {
            // InternalOberon.g:2342:4: (lv_exp_0_0= ruleExpression )
            // InternalOberon.g:2343:5: lv_exp_0_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getCaseAlternativeAccess().getExpExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_48);
            lv_exp_0_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCaseAlternativeRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_0_0,
            						"br.unb.cic.obron.ide.Oberon.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOberon.g:2360:3: (otherlv_1= '..' ( (lv_max_2_0= ruleExpression ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==55) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalOberon.g:2361:4: otherlv_1= '..' ( (lv_max_2_0= ruleExpression ) )
                    {
                    otherlv_1=(Token)match(input,55,FOLLOW_21); 

                    				newLeafNode(otherlv_1, grammarAccess.getCaseAlternativeAccess().getFullStopFullStopKeyword_1_0());
                    			
                    // InternalOberon.g:2365:4: ( (lv_max_2_0= ruleExpression ) )
                    // InternalOberon.g:2366:5: (lv_max_2_0= ruleExpression )
                    {
                    // InternalOberon.g:2366:5: (lv_max_2_0= ruleExpression )
                    // InternalOberon.g:2367:6: lv_max_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getCaseAlternativeAccess().getMaxExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_49);
                    lv_max_2_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCaseAlternativeRule());
                    						}
                    						set(
                    							current,
                    							"max",
                    							lv_max_2_0,
                    							"br.unb.cic.obron.ide.Oberon.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,24,FOLLOW_37); 

            			newLeafNode(otherlv_3, grammarAccess.getCaseAlternativeAccess().getColonKeyword_2());
            		
            // InternalOberon.g:2389:3: ( (lv_stmt_4_0= ruleStatement ) )
            // InternalOberon.g:2390:4: (lv_stmt_4_0= ruleStatement )
            {
            // InternalOberon.g:2390:4: (lv_stmt_4_0= ruleStatement )
            // InternalOberon.g:2391:5: lv_stmt_4_0= ruleStatement
            {

            					newCompositeNode(grammarAccess.getCaseAlternativeAccess().getStmtStatementParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_stmt_4_0=ruleStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCaseAlternativeRule());
            					}
            					set(
            						current,
            						"stmt",
            						lv_stmt_4_0,
            						"br.unb.cic.obron.ide.Oberon.Statement");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecaseAlternative"


    // $ANTLR start "entryRuleelseIfStmt"
    // InternalOberon.g:2412:1: entryRuleelseIfStmt returns [EObject current=null] : iv_ruleelseIfStmt= ruleelseIfStmt EOF ;
    public final EObject entryRuleelseIfStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleelseIfStmt = null;


        try {
            // InternalOberon.g:2412:51: (iv_ruleelseIfStmt= ruleelseIfStmt EOF )
            // InternalOberon.g:2413:2: iv_ruleelseIfStmt= ruleelseIfStmt EOF
            {
             newCompositeNode(grammarAccess.getElseIfStmtRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleelseIfStmt=ruleelseIfStmt();

            state._fsp--;

             current =iv_ruleelseIfStmt; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleelseIfStmt"


    // $ANTLR start "ruleelseIfStmt"
    // InternalOberon.g:2419:1: ruleelseIfStmt returns [EObject current=null] : ( ( (lv_cond_0_0= ruleExpression ) ) otherlv_1= 'THEN' ( (lv_stmt_2_0= ruleStatement ) ) ) ;
    public final EObject ruleelseIfStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_cond_0_0 = null;

        EObject lv_stmt_2_0 = null;



        	enterRule();

        try {
            // InternalOberon.g:2425:2: ( ( ( (lv_cond_0_0= ruleExpression ) ) otherlv_1= 'THEN' ( (lv_stmt_2_0= ruleStatement ) ) ) )
            // InternalOberon.g:2426:2: ( ( (lv_cond_0_0= ruleExpression ) ) otherlv_1= 'THEN' ( (lv_stmt_2_0= ruleStatement ) ) )
            {
            // InternalOberon.g:2426:2: ( ( (lv_cond_0_0= ruleExpression ) ) otherlv_1= 'THEN' ( (lv_stmt_2_0= ruleStatement ) ) )
            // InternalOberon.g:2427:3: ( (lv_cond_0_0= ruleExpression ) ) otherlv_1= 'THEN' ( (lv_stmt_2_0= ruleStatement ) )
            {
            // InternalOberon.g:2427:3: ( (lv_cond_0_0= ruleExpression ) )
            // InternalOberon.g:2428:4: (lv_cond_0_0= ruleExpression )
            {
            // InternalOberon.g:2428:4: (lv_cond_0_0= ruleExpression )
            // InternalOberon.g:2429:5: lv_cond_0_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getElseIfStmtAccess().getCondExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_39);
            lv_cond_0_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getElseIfStmtRule());
            					}
            					set(
            						current,
            						"cond",
            						lv_cond_0_0,
            						"br.unb.cic.obron.ide.Oberon.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,45,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getElseIfStmtAccess().getTHENKeyword_1());
            		
            // InternalOberon.g:2450:3: ( (lv_stmt_2_0= ruleStatement ) )
            // InternalOberon.g:2451:4: (lv_stmt_2_0= ruleStatement )
            {
            // InternalOberon.g:2451:4: (lv_stmt_2_0= ruleStatement )
            // InternalOberon.g:2452:5: lv_stmt_2_0= ruleStatement
            {

            					newCompositeNode(grammarAccess.getElseIfStmtAccess().getStmtStatementParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_stmt_2_0=ruleStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getElseIfStmtRule());
            					}
            					set(
            						current,
            						"stmt",
            						lv_stmt_2_0,
            						"br.unb.cic.obron.ide.Oberon.Statement");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleelseIfStmt"


    // $ANTLR start "entryRuleOberonType"
    // InternalOberon.g:2473:1: entryRuleOberonType returns [EObject current=null] : iv_ruleOberonType= ruleOberonType EOF ;
    public final EObject entryRuleOberonType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOberonType = null;


        try {
            // InternalOberon.g:2473:51: (iv_ruleOberonType= ruleOberonType EOF )
            // InternalOberon.g:2474:2: iv_ruleOberonType= ruleOberonType EOF
            {
             newCompositeNode(grammarAccess.getOberonTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOberonType=ruleOberonType();

            state._fsp--;

             current =iv_ruleOberonType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOberonType"


    // $ANTLR start "ruleOberonType"
    // InternalOberon.g:2480:1: ruleOberonType returns [EObject current=null] : ( ( () otherlv_1= 'INTEGER' ) | ( () otherlv_3= 'BOOLEAN' ) | ( (lv_name_4_0= RULE_ID ) ) | (otherlv_5= 'ARRAY' ( (lv_numElement_6_0= RULE_INT ) ) otherlv_7= 'OF' ( (lv_nameType_8_0= ruleOberonType ) ) ) ) ;
    public final EObject ruleOberonType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token lv_numElement_6_0=null;
        Token otherlv_7=null;
        EObject lv_nameType_8_0 = null;



        	enterRule();

        try {
            // InternalOberon.g:2486:2: ( ( ( () otherlv_1= 'INTEGER' ) | ( () otherlv_3= 'BOOLEAN' ) | ( (lv_name_4_0= RULE_ID ) ) | (otherlv_5= 'ARRAY' ( (lv_numElement_6_0= RULE_INT ) ) otherlv_7= 'OF' ( (lv_nameType_8_0= ruleOberonType ) ) ) ) )
            // InternalOberon.g:2487:2: ( ( () otherlv_1= 'INTEGER' ) | ( () otherlv_3= 'BOOLEAN' ) | ( (lv_name_4_0= RULE_ID ) ) | (otherlv_5= 'ARRAY' ( (lv_numElement_6_0= RULE_INT ) ) otherlv_7= 'OF' ( (lv_nameType_8_0= ruleOberonType ) ) ) )
            {
            // InternalOberon.g:2487:2: ( ( () otherlv_1= 'INTEGER' ) | ( () otherlv_3= 'BOOLEAN' ) | ( (lv_name_4_0= RULE_ID ) ) | (otherlv_5= 'ARRAY' ( (lv_numElement_6_0= RULE_INT ) ) otherlv_7= 'OF' ( (lv_nameType_8_0= ruleOberonType ) ) ) )
            int alt39=4;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt39=1;
                }
                break;
            case 62:
                {
                alt39=2;
                }
                break;
            case RULE_ID:
                {
                alt39=3;
                }
                break;
            case 20:
                {
                alt39=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalOberon.g:2488:3: ( () otherlv_1= 'INTEGER' )
                    {
                    // InternalOberon.g:2488:3: ( () otherlv_1= 'INTEGER' )
                    // InternalOberon.g:2489:4: () otherlv_1= 'INTEGER'
                    {
                    // InternalOberon.g:2489:4: ()
                    // InternalOberon.g:2490:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getOberonTypeAccess().getIntegerAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,61,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getOberonTypeAccess().getINTEGERKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOberon.g:2502:3: ( () otherlv_3= 'BOOLEAN' )
                    {
                    // InternalOberon.g:2502:3: ( () otherlv_3= 'BOOLEAN' )
                    // InternalOberon.g:2503:4: () otherlv_3= 'BOOLEAN'
                    {
                    // InternalOberon.g:2503:4: ()
                    // InternalOberon.g:2504:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getOberonTypeAccess().getBooleanAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,62,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getOberonTypeAccess().getBOOLEANKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOberon.g:2516:3: ( (lv_name_4_0= RULE_ID ) )
                    {
                    // InternalOberon.g:2516:3: ( (lv_name_4_0= RULE_ID ) )
                    // InternalOberon.g:2517:4: (lv_name_4_0= RULE_ID )
                    {
                    // InternalOberon.g:2517:4: (lv_name_4_0= RULE_ID )
                    // InternalOberon.g:2518:5: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_name_4_0, grammarAccess.getOberonTypeAccess().getNameIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOberonTypeRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_4_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalOberon.g:2535:3: (otherlv_5= 'ARRAY' ( (lv_numElement_6_0= RULE_INT ) ) otherlv_7= 'OF' ( (lv_nameType_8_0= ruleOberonType ) ) )
                    {
                    // InternalOberon.g:2535:3: (otherlv_5= 'ARRAY' ( (lv_numElement_6_0= RULE_INT ) ) otherlv_7= 'OF' ( (lv_nameType_8_0= ruleOberonType ) ) )
                    // InternalOberon.g:2536:4: otherlv_5= 'ARRAY' ( (lv_numElement_6_0= RULE_INT ) ) otherlv_7= 'OF' ( (lv_nameType_8_0= ruleOberonType ) )
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_16); 

                    				newLeafNode(otherlv_5, grammarAccess.getOberonTypeAccess().getARRAYKeyword_3_0());
                    			
                    // InternalOberon.g:2540:4: ( (lv_numElement_6_0= RULE_INT ) )
                    // InternalOberon.g:2541:5: (lv_numElement_6_0= RULE_INT )
                    {
                    // InternalOberon.g:2541:5: (lv_numElement_6_0= RULE_INT )
                    // InternalOberon.g:2542:6: lv_numElement_6_0= RULE_INT
                    {
                    lv_numElement_6_0=(Token)match(input,RULE_INT,FOLLOW_17); 

                    						newLeafNode(lv_numElement_6_0, grammarAccess.getOberonTypeAccess().getNumElementINTTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOberonTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"numElement",
                    							lv_numElement_6_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,21,FOLLOW_18); 

                    				newLeafNode(otherlv_7, grammarAccess.getOberonTypeAccess().getOFKeyword_3_2());
                    			
                    // InternalOberon.g:2562:4: ( (lv_nameType_8_0= ruleOberonType ) )
                    // InternalOberon.g:2563:5: (lv_nameType_8_0= ruleOberonType )
                    {
                    // InternalOberon.g:2563:5: (lv_nameType_8_0= ruleOberonType )
                    // InternalOberon.g:2564:6: lv_nameType_8_0= ruleOberonType
                    {

                    						newCompositeNode(grammarAccess.getOberonTypeAccess().getNameTypeOberonTypeParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_nameType_8_0=ruleOberonType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOberonTypeRule());
                    						}
                    						set(
                    							current,
                    							"nameType",
                    							lv_nameType_8_0,
                    							"br.unb.cic.obron.ide.Oberon.OberonType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOberonType"


    // $ANTLR start "entryRuleIntValue"
    // InternalOberon.g:2586:1: entryRuleIntValue returns [String current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final String entryRuleIntValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIntValue = null;


        try {
            // InternalOberon.g:2586:48: (iv_ruleIntValue= ruleIntValue EOF )
            // InternalOberon.g:2587:2: iv_ruleIntValue= ruleIntValue EOF
            {
             newCompositeNode(grammarAccess.getIntValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntValue=ruleIntValue();

            state._fsp--;

             current =iv_ruleIntValue.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // InternalOberon.g:2593:1: ruleIntValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleIntValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalOberon.g:2599:2: (this_INT_0= RULE_INT )
            // InternalOberon.g:2600:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getIntValueAccess().getINTTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleBoolValue"
    // InternalOberon.g:2610:1: entryRuleBoolValue returns [String current=null] : iv_ruleBoolValue= ruleBoolValue EOF ;
    public final String entryRuleBoolValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolValue = null;


        try {
            // InternalOberon.g:2610:49: (iv_ruleBoolValue= ruleBoolValue EOF )
            // InternalOberon.g:2611:2: iv_ruleBoolValue= ruleBoolValue EOF
            {
             newCompositeNode(grammarAccess.getBoolValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolValue=ruleBoolValue();

            state._fsp--;

             current =iv_ruleBoolValue.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolValue"


    // $ANTLR start "ruleBoolValue"
    // InternalOberon.g:2617:1: ruleBoolValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TRUE_0= ruleTRUE | this_FALSE_1= ruleFALSE ) ;
    public final AntlrDatatypeRuleToken ruleBoolValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_TRUE_0 = null;

        AntlrDatatypeRuleToken this_FALSE_1 = null;



        	enterRule();

        try {
            // InternalOberon.g:2623:2: ( (this_TRUE_0= ruleTRUE | this_FALSE_1= ruleFALSE ) )
            // InternalOberon.g:2624:2: (this_TRUE_0= ruleTRUE | this_FALSE_1= ruleFALSE )
            {
            // InternalOberon.g:2624:2: (this_TRUE_0= ruleTRUE | this_FALSE_1= ruleFALSE )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==63) ) {
                alt40=1;
            }
            else if ( (LA40_0==64) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalOberon.g:2625:3: this_TRUE_0= ruleTRUE
                    {

                    			newCompositeNode(grammarAccess.getBoolValueAccess().getTRUEParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TRUE_0=ruleTRUE();

                    state._fsp--;


                    			current.merge(this_TRUE_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOberon.g:2636:3: this_FALSE_1= ruleFALSE
                    {

                    			newCompositeNode(grammarAccess.getBoolValueAccess().getFALSEParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FALSE_1=ruleFALSE();

                    state._fsp--;


                    			current.merge(this_FALSE_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoolValue"


    // $ANTLR start "entryRuleTRUE"
    // InternalOberon.g:2650:1: entryRuleTRUE returns [String current=null] : iv_ruleTRUE= ruleTRUE EOF ;
    public final String entryRuleTRUE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTRUE = null;


        try {
            // InternalOberon.g:2650:44: (iv_ruleTRUE= ruleTRUE EOF )
            // InternalOberon.g:2651:2: iv_ruleTRUE= ruleTRUE EOF
            {
             newCompositeNode(grammarAccess.getTRUERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTRUE=ruleTRUE();

            state._fsp--;

             current =iv_ruleTRUE.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTRUE"


    // $ANTLR start "ruleTRUE"
    // InternalOberon.g:2657:1: ruleTRUE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'True' ;
    public final AntlrDatatypeRuleToken ruleTRUE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOberon.g:2663:2: (kw= 'True' )
            // InternalOberon.g:2664:2: kw= 'True'
            {
            kw=(Token)match(input,63,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getTRUEAccess().getTrueKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTRUE"


    // $ANTLR start "entryRuleFALSE"
    // InternalOberon.g:2672:1: entryRuleFALSE returns [String current=null] : iv_ruleFALSE= ruleFALSE EOF ;
    public final String entryRuleFALSE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFALSE = null;


        try {
            // InternalOberon.g:2672:45: (iv_ruleFALSE= ruleFALSE EOF )
            // InternalOberon.g:2673:2: iv_ruleFALSE= ruleFALSE EOF
            {
             newCompositeNode(grammarAccess.getFALSERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFALSE=ruleFALSE();

            state._fsp--;

             current =iv_ruleFALSE.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFALSE"


    // $ANTLR start "ruleFALSE"
    // InternalOberon.g:2679:1: ruleFALSE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'False' ;
    public final AntlrDatatypeRuleToken ruleFALSE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOberon.g:2685:2: (kw= 'False' )
            // InternalOberon.g:2686:2: kw= 'False'
            {
            kw=(Token)match(input,64,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getFALSEAccess().getFalseKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFALSE"

    // Delegated rules


    protected DFA18 dfa18 = new DFA18(this);
    protected DFA34 dfa34 = new DFA34(this);
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\1\1\15\uffff";
    static final String dfa_3s = "\1\4\15\uffff";
    static final String dfa_4s = "\1\74\15\uffff";
    static final String dfa_5s = "\1\uffff\1\2\14\1";
    static final String dfa_6s = "\16\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\7\uffff\2\1\5\uffff\1\2\1\uffff\1\1\1\uffff\2\1\2\uffff\1\1\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\uffff\1\1\1\uffff\14\1\1\uffff\6\1",
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

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 1015:3: ( ( (lv_opr_1_0= ruleOperation ) ) ( (lv_right_2_0= ruleExpression ) ) )*";
        }
    }
    static final String dfa_8s = "\17\uffff";
    static final String dfa_9s = "\1\4\6\uffff\1\4\4\uffff\1\14\2\uffff";
    static final String dfa_10s = "\1\74\6\uffff\1\74\4\uffff\1\66\2\uffff";
    static final String dfa_11s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\11\1\12\1\13\1\14\1\uffff\1\7\1\10";
    static final String dfa_12s = "\17\uffff}>";
    static final String[] dfa_13s = {
            "\1\1\45\uffff\1\2\1\3\1\4\3\uffff\1\5\1\uffff\1\6\1\uffff\1\7\3\uffff\1\10\1\11\1\12\1\uffff\1\13",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\14\45\uffff\3\15\3\uffff\1\15\1\uffff\1\15\1\uffff\1\15\3\uffff\3\15\1\uffff\1\15",
            "",
            "",
            "",
            "",
            "\1\15\1\uffff\1\15\13\uffff\1\15\14\uffff\1\15\1\uffff\1\15\13\uffff\1\15\1\16",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1495:2: ( ( ( (lv_des_0_0= ruleDesignator ) ) (otherlv_1= ':=' ( (lv_exp_2_0= ruleExpression ) ) )? ) | (otherlv_3= 'readInt' otherlv_4= '(' ( (lv_var_5_0= RULE_ID ) ) otherlv_6= ')' ) | (otherlv_7= 'write' otherlv_8= '(' ( (lv_exp_9_0= ruleExpression ) ) otherlv_10= ')' ) | (otherlv_11= 'IF' ( (lv_cond_12_0= ruleExpression ) ) otherlv_13= 'THEN' ( (lv_thenStmt_14_0= ruleStatement ) ) (otherlv_15= 'ELSIF' ( (lv_elsifs_16_0= ruleelseIfStmt ) ) )* (otherlv_17= 'ELSE' ( (lv_elseStmt_18_0= ruleStatement ) ) )? otherlv_19= 'END' ) | (otherlv_20= 'WHILE' ( (lv_cond_21_0= ruleExpression ) ) otherlv_22= 'DO' ( (lv_stmt_23_0= ruleStatement ) ) otherlv_24= 'END' ) | (otherlv_25= 'REPEAT' ( (lv_stmt_26_0= ruleStatement ) ) otherlv_27= 'UNTIL' ( (lv_cond_28_0= ruleExpression ) ) ) | (otherlv_29= 'FOR' ( (lv_init_30_0= ruleStatement ) ) otherlv_31= 'TO' ( (lv_condition_32_0= ruleExpression ) ) otherlv_33= 'DO' ( (lv_stmt_34_0= ruleStatement ) ) otherlv_35= 'END' ) | (otherlv_36= 'FOR' ( (lv_var_37_0= RULE_ID ) ) otherlv_38= 'IN' ( (lv_min_39_0= ruleExpression ) ) otherlv_40= '..' ( (lv_max_41_0= ruleExpression ) ) otherlv_42= 'DO' ( (lv_stmt_43_0= ruleStatement ) ) otherlv_44= 'END' ) | (otherlv_45= 'LOOP' ( (lv_stmt_46_0= ruleStatement ) ) otherlv_47= 'END' ) | (otherlv_48= 'RETURN' ( (lv_exp_49_0= ruleExpression ) ) ) | (otherlv_50= 'CASE' ( (lv_exp_51_0= ruleExpression ) ) otherlv_52= 'OF' ( (lv_case_53_0= rulecaseAlternative ) ) (otherlv_54= '|' ( (lv_cases_55_0= rulecaseAlternative ) ) )* (otherlv_56= 'ELSE' ( (lv_elseStmt_57_0= ruleStatement ) ) )? otherlv_58= 'END' ) | ( (lv_exit_59_0= 'EXIT' ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000207A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x17151C0000002010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002060012L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002040012L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000012L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x6000000000100010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x8000000004000030L,0x0000000000000001L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000001001000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000002078000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000007FF0080002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008004004002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x800000000C000030L,0x0000000000000001L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000008000004002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x17151C0000000010L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000C00000002000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0800800000002000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0080000001000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000001000000L});

}