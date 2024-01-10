// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g 2023-12-30 14:57:25

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;

import org.antlr.runtime.tree.*;

public class whileParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Node_Bloc", "Node_Exprlist", "Node_Output", "Node_Input", "Node_ForEach", "Node_For", "Node_While", "Node_If", "Node_Else", "Node_Affectation", "Node_Params", "Node_Function", "Node_Left", "Node_Right", "Node_Call", "Node_Head", "Node_Tail", "Node_Cons", "Node_List", "Maj", "Min", "Dec", "Variable", "Symbol", "WS", "'function'", "':'", "'read'", "'%'", "'write'", "','", "';'", "'foreach'", "'in'", "'do'", "'od'", "'for'", "'while'", "'if'", "'then'", "'else'", "'fi'", "'nop'", "':='", "'('", "')'", "'hd'", "'tl'", "'cons'", "'list'", "'nil'", "'=?'"
    };
    public static final int EOF=-1;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int Node_Bloc=4;
    public static final int Node_Exprlist=5;
    public static final int Node_Output=6;
    public static final int Node_Input=7;
    public static final int Node_ForEach=8;
    public static final int Node_For=9;
    public static final int Node_While=10;
    public static final int Node_If=11;
    public static final int Node_Else=12;
    public static final int Node_Affectation=13;
    public static final int Node_Params=14;
    public static final int Node_Function=15;
    public static final int Node_Left=16;
    public static final int Node_Right=17;
    public static final int Node_Call=18;
    public static final int Node_Head=19;
    public static final int Node_Tail=20;
    public static final int Node_Cons=21;
    public static final int Node_List=22;
    public static final int Maj=23;
    public static final int Min=24;
    public static final int Dec=25;
    public static final int Variable=26;
    public static final int Symbol=27;
    public static final int WS=28;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", "commands", "definition", "exprs", "vars", "output", 
        "lExpr", "function", "input", "expression", "exprBase", "program", 
        "inputSub", "command"
    };
    public static final boolean[] decisionCanBacktrack = new boolean[] {
        false, // invalid decision
        false, false, false, false, false, false, false, false, false, 
            false, false, false, false, false, false, false, false, false
    };

     
        public int ruleLevel = 0;
        public int getRuleLevel() { return ruleLevel; }
        public void incRuleLevel() { ruleLevel++; }
        public void decRuleLevel() { ruleLevel--; }
        public whileParser(TokenStream input) {
            this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
        }
        public whileParser(TokenStream input, int port, RecognizerSharedState state) {
            super(input, state);
            DebugEventSocketProxy proxy =
                new DebugEventSocketProxy(this,port,adaptor);
            setDebugListener(proxy);
            setTokenStream(new DebugTokenStream(input,proxy));
            try {
                proxy.handshake();
            }
            catch (IOException ioe) {
                reportError(ioe);
            }
            TreeAdaptor adap = new CommonTreeAdaptor();
            setTreeAdaptor(adap);
            proxy.setTreeAdaptor(adap);
        }
    public whileParser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg);

         
        TreeAdaptor adap = new CommonTreeAdaptor();
        setTreeAdaptor(adap);

    }
    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }

    protected DebugTreeAdaptor adaptor;
    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = new DebugTreeAdaptor(dbg,adaptor);

    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }


    public String[] getTokenNames() { return whileParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g"; }


    public static class program_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:53:1: program : function ( program )? ;
    public final whileParser.program_return program() throws RecognitionException {
        whileParser.program_return retval = new whileParser.program_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        whileParser.function_return function1 = null;

        whileParser.program_return program2 = null;



        try { dbg.enterRule(getGrammarFileName(), "program");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(53, 1);

        try {
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:54:2: ( function ( program )? )
            dbg.enterAlt(1);

            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:54:4: function ( program )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(54,4);
            pushFollow(FOLLOW_function_in_program261);
            function1=function();

            state._fsp--;

            adaptor.addChild(root_0, function1.getTree());
            dbg.location(54,13);
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:54:13: ( program )?
            int alt1=2;
            try { dbg.enterSubRule(1);
            try { dbg.enterDecision(1, decisionCanBacktrack[1]);

            int LA1_0 = input.LA(1);

            if ( (LA1_0==29) ) {
                alt1=1;
            }
            } finally {dbg.exitDecision(1);}

            switch (alt1) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:54:13: program
                    {
                    dbg.location(54,13);
                    pushFollow(FOLLOW_program_in_program263);
                    program2=program();

                    state._fsp--;

                    adaptor.addChild(root_0, program2.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(1);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(54, 22);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "program");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "program"

    public static class function_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function"
    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:55:1: function : 'function' Symbol ':' ( WS )* definition -> ^( Node_Function Symbol definition ) ;
    public final whileParser.function_return function() throws RecognitionException {
        whileParser.function_return retval = new whileParser.function_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal3=null;
        Token Symbol4=null;
        Token char_literal5=null;
        Token WS6=null;
        whileParser.definition_return definition7 = null;


        Object string_literal3_tree=null;
        Object Symbol4_tree=null;
        Object char_literal5_tree=null;
        Object WS6_tree=null;
        RewriteRuleTokenStream stream_Symbol=new RewriteRuleTokenStream(adaptor,"token Symbol");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"rule definition");
        try { dbg.enterRule(getGrammarFileName(), "function");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(55, 1);

        try {
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:56:2: ( 'function' Symbol ':' ( WS )* definition -> ^( Node_Function Symbol definition ) )
            dbg.enterAlt(1);

            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:56:4: 'function' Symbol ':' ( WS )* definition
            {
            dbg.location(56,4);
            string_literal3=(Token)match(input,29,FOLLOW_29_in_function274);  
            stream_29.add(string_literal3);

            dbg.location(56,15);
            Symbol4=(Token)match(input,Symbol,FOLLOW_Symbol_in_function276);  
            stream_Symbol.add(Symbol4);

            dbg.location(56,22);
            char_literal5=(Token)match(input,30,FOLLOW_30_in_function278);  
            stream_30.add(char_literal5);

            dbg.location(56,26);
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:56:26: ( WS )*
            try { dbg.enterSubRule(2);

            loop2:
            do {
                int alt2=2;
                try { dbg.enterDecision(2, decisionCanBacktrack[2]);

                int LA2_0 = input.LA(1);

                if ( (LA2_0==WS) ) {
                    alt2=1;
                }


                } finally {dbg.exitDecision(2);}

                switch (alt2) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:56:26: WS
            	    {
            	    dbg.location(56,26);
            	    WS6=(Token)match(input,WS,FOLLOW_WS_in_function280);  
            	    stream_WS.add(WS6);


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);
            } finally {dbg.exitSubRule(2);}

            dbg.location(56,30);
            pushFollow(FOLLOW_definition_in_function283);
            definition7=definition();

            state._fsp--;

            stream_definition.add(definition7.getTree());


            // AST REWRITE
            // elements: definition, Symbol
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 56:42: -> ^( Node_Function Symbol definition )
            {
                dbg.location(56,45);
                // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:56:45: ^( Node_Function Symbol definition )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(56,47);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(Node_Function, "Node_Function"), root_1);

                dbg.location(56,62);
                adaptor.addChild(root_1, stream_Symbol.nextNode());
                dbg.location(56,70);
                adaptor.addChild(root_1, stream_definition.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(56, 82);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "function");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "function"

    public static class definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "definition"
    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:58:1: definition : 'read' input ( WS )* '%' commands '%' ( WS )* 'write' output ( WS )* -> input commands output ;
    public final whileParser.definition_return definition() throws RecognitionException {
        whileParser.definition_return retval = new whileParser.definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal8=null;
        Token WS10=null;
        Token char_literal11=null;
        Token char_literal13=null;
        Token WS14=null;
        Token string_literal15=null;
        Token WS17=null;
        whileParser.input_return input9 = null;

        whileParser.commands_return commands12 = null;

        whileParser.output_return output16 = null;


        Object string_literal8_tree=null;
        Object WS10_tree=null;
        Object char_literal11_tree=null;
        Object char_literal13_tree=null;
        Object WS14_tree=null;
        Object string_literal15_tree=null;
        Object WS17_tree=null;
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");
        RewriteRuleSubtreeStream stream_input=new RewriteRuleSubtreeStream(adaptor,"rule input");
        RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");
        try { dbg.enterRule(getGrammarFileName(), "definition");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(58, 1);

        try {
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:59:2: ( 'read' input ( WS )* '%' commands '%' ( WS )* 'write' output ( WS )* -> input commands output )
            dbg.enterAlt(1);

            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:59:4: 'read' input ( WS )* '%' commands '%' ( WS )* 'write' output ( WS )*
            {
            dbg.location(59,4);
            string_literal8=(Token)match(input,31,FOLLOW_31_in_definition309);  
            stream_31.add(string_literal8);

            dbg.location(59,11);
            pushFollow(FOLLOW_input_in_definition311);
            input9=input();

            state._fsp--;

            stream_input.add(input9.getTree());
            dbg.location(59,17);
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:59:17: ( WS )*
            try { dbg.enterSubRule(3);

            loop3:
            do {
                int alt3=2;
                try { dbg.enterDecision(3, decisionCanBacktrack[3]);

                int LA3_0 = input.LA(1);

                if ( (LA3_0==WS) ) {
                    alt3=1;
                }


                } finally {dbg.exitDecision(3);}

                switch (alt3) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:59:17: WS
            	    {
            	    dbg.location(59,17);
            	    WS10=(Token)match(input,WS,FOLLOW_WS_in_definition313);  
            	    stream_WS.add(WS10);


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);
            } finally {dbg.exitSubRule(3);}

            dbg.location(59,21);
            char_literal11=(Token)match(input,32,FOLLOW_32_in_definition316);  
            stream_32.add(char_literal11);

            dbg.location(59,25);
            pushFollow(FOLLOW_commands_in_definition318);
            commands12=commands();

            state._fsp--;

            stream_commands.add(commands12.getTree());
            dbg.location(59,34);
            char_literal13=(Token)match(input,32,FOLLOW_32_in_definition320);  
            stream_32.add(char_literal13);

            dbg.location(59,38);
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:59:38: ( WS )*
            try { dbg.enterSubRule(4);

            loop4:
            do {
                int alt4=2;
                try { dbg.enterDecision(4, decisionCanBacktrack[4]);

                int LA4_0 = input.LA(1);

                if ( (LA4_0==WS) ) {
                    alt4=1;
                }


                } finally {dbg.exitDecision(4);}

                switch (alt4) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:59:38: WS
            	    {
            	    dbg.location(59,38);
            	    WS14=(Token)match(input,WS,FOLLOW_WS_in_definition322);  
            	    stream_WS.add(WS14);


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);
            } finally {dbg.exitSubRule(4);}

            dbg.location(59,42);
            string_literal15=(Token)match(input,33,FOLLOW_33_in_definition325);  
            stream_33.add(string_literal15);

            dbg.location(59,50);
            pushFollow(FOLLOW_output_in_definition327);
            output16=output();

            state._fsp--;

            stream_output.add(output16.getTree());
            dbg.location(59,57);
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:59:57: ( WS )*
            try { dbg.enterSubRule(5);

            loop5:
            do {
                int alt5=2;
                try { dbg.enterDecision(5, decisionCanBacktrack[5]);

                int LA5_0 = input.LA(1);

                if ( (LA5_0==WS) ) {
                    alt5=1;
                }


                } finally {dbg.exitDecision(5);}

                switch (alt5) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:59:57: WS
            	    {
            	    dbg.location(59,57);
            	    WS17=(Token)match(input,WS,FOLLOW_WS_in_definition329);  
            	    stream_WS.add(WS17);


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);
            } finally {dbg.exitSubRule(5);}



            // AST REWRITE
            // elements: output, input, commands
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 59:61: -> input commands output
            {
                dbg.location(59,64);
                adaptor.addChild(root_0, stream_input.nextTree());
                dbg.location(59,70);
                adaptor.addChild(root_0, stream_commands.nextTree());
                dbg.location(59,79);
                adaptor.addChild(root_0, stream_output.nextTree());

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(59, 85);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "definition");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "definition"

    public static class input_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "input"
    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:60:1: input : ( inputSub )? -> ^( Node_Input ( inputSub )? ) ;
    public final whileParser.input_return input() throws RecognitionException {
        whileParser.input_return retval = new whileParser.input_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        whileParser.inputSub_return inputSub18 = null;


        RewriteRuleSubtreeStream stream_inputSub=new RewriteRuleSubtreeStream(adaptor,"rule inputSub");
        try { dbg.enterRule(getGrammarFileName(), "input");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(60, 1);

        try {
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:61:2: ( ( inputSub )? -> ^( Node_Input ( inputSub )? ) )
            dbg.enterAlt(1);

            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:61:5: ( inputSub )?
            {
            dbg.location(61,5);
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:61:5: ( inputSub )?
            int alt6=2;
            try { dbg.enterSubRule(6);
            try { dbg.enterDecision(6, decisionCanBacktrack[6]);

            int LA6_0 = input.LA(1);

            if ( (LA6_0==Variable) ) {
                alt6=1;
            }
            } finally {dbg.exitDecision(6);}

            switch (alt6) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:61:5: inputSub
                    {
                    dbg.location(61,5);
                    pushFollow(FOLLOW_inputSub_in_input350);
                    inputSub18=inputSub();

                    state._fsp--;

                    stream_inputSub.add(inputSub18.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(6);}



            // AST REWRITE
            // elements: inputSub
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 61:15: -> ^( Node_Input ( inputSub )? )
            {
                dbg.location(61,17);
                // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:61:17: ^( Node_Input ( inputSub )? )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(61,19);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(Node_Input, "Node_Input"), root_1);

                dbg.location(61,30);
                // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:61:30: ( inputSub )?
                if ( stream_inputSub.hasNext() ) {
                    dbg.location(61,30);
                    adaptor.addChild(root_1, stream_inputSub.nextTree());

                }
                stream_inputSub.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(61, 40);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "input");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "input"

    public static class inputSub_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inputSub"
    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:62:1: inputSub : Variable ( ',' Variable )* -> ( Variable )+ ;
    public final whileParser.inputSub_return inputSub() throws RecognitionException {
        whileParser.inputSub_return retval = new whileParser.inputSub_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Variable19=null;
        Token char_literal20=null;
        Token Variable21=null;

        Object Variable19_tree=null;
        Object char_literal20_tree=null;
        Object Variable21_tree=null;
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");

        try { dbg.enterRule(getGrammarFileName(), "inputSub");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(62, 1);

        try {
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:63:2: ( Variable ( ',' Variable )* -> ( Variable )+ )
            dbg.enterAlt(1);

            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:63:4: Variable ( ',' Variable )*
            {
            dbg.location(63,4);
            Variable19=(Token)match(input,Variable,FOLLOW_Variable_in_inputSub368);  
            stream_Variable.add(Variable19);

            dbg.location(63,13);
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:63:13: ( ',' Variable )*
            try { dbg.enterSubRule(7);

            loop7:
            do {
                int alt7=2;
                try { dbg.enterDecision(7, decisionCanBacktrack[7]);

                int LA7_0 = input.LA(1);

                if ( (LA7_0==34) ) {
                    alt7=1;
                }


                } finally {dbg.exitDecision(7);}

                switch (alt7) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:63:14: ',' Variable
            	    {
            	    dbg.location(63,14);
            	    char_literal20=(Token)match(input,34,FOLLOW_34_in_inputSub371);  
            	    stream_34.add(char_literal20);

            	    dbg.location(63,18);
            	    Variable21=(Token)match(input,Variable,FOLLOW_Variable_in_inputSub373);  
            	    stream_Variable.add(Variable21);


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);
            } finally {dbg.exitSubRule(7);}



            // AST REWRITE
            // elements: Variable
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 63:28: -> ( Variable )+
            {
                dbg.location(63,31);
                if ( !(stream_Variable.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_Variable.hasNext() ) {
                    dbg.location(63,31);
                    adaptor.addChild(root_0, stream_Variable.nextNode());

                }
                stream_Variable.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(63, 42);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "inputSub");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "inputSub"

    public static class output_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "output"
    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:64:1: output : Variable ( ',' Variable )* -> ^( Node_Output ( Variable )+ ) ;
    public final whileParser.output_return output() throws RecognitionException {
        whileParser.output_return retval = new whileParser.output_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Variable22=null;
        Token char_literal23=null;
        Token Variable24=null;

        Object Variable22_tree=null;
        Object char_literal23_tree=null;
        Object Variable24_tree=null;
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");

        try { dbg.enterRule(getGrammarFileName(), "output");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(64, 1);

        try {
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:65:2: ( Variable ( ',' Variable )* -> ^( Node_Output ( Variable )+ ) )
            dbg.enterAlt(1);

            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:65:4: Variable ( ',' Variable )*
            {
            dbg.location(65,4);
            Variable22=(Token)match(input,Variable,FOLLOW_Variable_in_output390);  
            stream_Variable.add(Variable22);

            dbg.location(65,13);
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:65:13: ( ',' Variable )*
            try { dbg.enterSubRule(8);

            loop8:
            do {
                int alt8=2;
                try { dbg.enterDecision(8, decisionCanBacktrack[8]);

                int LA8_0 = input.LA(1);

                if ( (LA8_0==34) ) {
                    alt8=1;
                }


                } finally {dbg.exitDecision(8);}

                switch (alt8) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:65:14: ',' Variable
            	    {
            	    dbg.location(65,14);
            	    char_literal23=(Token)match(input,34,FOLLOW_34_in_output393);  
            	    stream_34.add(char_literal23);

            	    dbg.location(65,18);
            	    Variable24=(Token)match(input,Variable,FOLLOW_Variable_in_output395);  
            	    stream_Variable.add(Variable24);


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);
            } finally {dbg.exitSubRule(8);}



            // AST REWRITE
            // elements: Variable
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 65:29: -> ^( Node_Output ( Variable )+ )
            {
                dbg.location(65,32);
                // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:65:32: ^( Node_Output ( Variable )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(65,34);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(Node_Output, "Node_Output"), root_1);

                dbg.location(65,46);
                if ( !(stream_Variable.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_Variable.hasNext() ) {
                    dbg.location(65,46);
                    adaptor.addChild(root_1, stream_Variable.nextNode());

                }
                stream_Variable.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(65, 56);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "output");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "output"

    public static class vars_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vars"
    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:66:1: vars : Variable ( ',' Variable )* -> ^( Node_Left ( Variable )+ ) ;
    public final whileParser.vars_return vars() throws RecognitionException {
        whileParser.vars_return retval = new whileParser.vars_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Variable25=null;
        Token char_literal26=null;
        Token Variable27=null;

        Object Variable25_tree=null;
        Object char_literal26_tree=null;
        Object Variable27_tree=null;
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");

        try { dbg.enterRule(getGrammarFileName(), "vars");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(66, 1);

        try {
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:67:2: ( Variable ( ',' Variable )* -> ^( Node_Left ( Variable )+ ) )
            dbg.enterAlt(1);

            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:67:4: Variable ( ',' Variable )*
            {
            dbg.location(67,4);
            Variable25=(Token)match(input,Variable,FOLLOW_Variable_in_vars416);  
            stream_Variable.add(Variable25);

            dbg.location(67,13);
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:67:13: ( ',' Variable )*
            try { dbg.enterSubRule(9);

            loop9:
            do {
                int alt9=2;
                try { dbg.enterDecision(9, decisionCanBacktrack[9]);

                int LA9_0 = input.LA(1);

                if ( (LA9_0==34) ) {
                    alt9=1;
                }


                } finally {dbg.exitDecision(9);}

                switch (alt9) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:67:14: ',' Variable
            	    {
            	    dbg.location(67,14);
            	    char_literal26=(Token)match(input,34,FOLLOW_34_in_vars419);  
            	    stream_34.add(char_literal26);

            	    dbg.location(67,18);
            	    Variable27=(Token)match(input,Variable,FOLLOW_Variable_in_vars421);  
            	    stream_Variable.add(Variable27);


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);
            } finally {dbg.exitSubRule(9);}



            // AST REWRITE
            // elements: Variable
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 67:29: -> ^( Node_Left ( Variable )+ )
            {
                dbg.location(67,32);
                // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:67:32: ^( Node_Left ( Variable )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(67,34);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(Node_Left, "Node_Left"), root_1);

                dbg.location(67,44);
                if ( !(stream_Variable.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_Variable.hasNext() ) {
                    dbg.location(67,44);
                    adaptor.addChild(root_1, stream_Variable.nextNode());

                }
                stream_Variable.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(67, 54);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vars");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "vars"

    public static class exprs_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprs"
    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:68:1: exprs : expression ( ',' expression )* -> ^( Node_Right ( expression )+ ) ;
    public final whileParser.exprs_return exprs() throws RecognitionException {
        whileParser.exprs_return retval = new whileParser.exprs_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal29=null;
        whileParser.expression_return expression28 = null;

        whileParser.expression_return expression30 = null;


        Object char_literal29_tree=null;
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try { dbg.enterRule(getGrammarFileName(), "exprs");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(68, 1);

        try {
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:69:2: ( expression ( ',' expression )* -> ^( Node_Right ( expression )+ ) )
            dbg.enterAlt(1);

            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:69:4: expression ( ',' expression )*
            {
            dbg.location(69,4);
            pushFollow(FOLLOW_expression_in_exprs441);
            expression28=expression();

            state._fsp--;

            stream_expression.add(expression28.getTree());
            dbg.location(69,15);
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:69:15: ( ',' expression )*
            try { dbg.enterSubRule(10);

            loop10:
            do {
                int alt10=2;
                try { dbg.enterDecision(10, decisionCanBacktrack[10]);

                int LA10_0 = input.LA(1);

                if ( (LA10_0==34) ) {
                    alt10=1;
                }


                } finally {dbg.exitDecision(10);}

                switch (alt10) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:69:16: ',' expression
            	    {
            	    dbg.location(69,16);
            	    char_literal29=(Token)match(input,34,FOLLOW_34_in_exprs444);  
            	    stream_34.add(char_literal29);

            	    dbg.location(69,20);
            	    pushFollow(FOLLOW_expression_in_exprs446);
            	    expression30=expression();

            	    state._fsp--;

            	    stream_expression.add(expression30.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);
            } finally {dbg.exitSubRule(10);}



            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 69:33: -> ^( Node_Right ( expression )+ )
            {
                dbg.location(69,36);
                // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:69:36: ^( Node_Right ( expression )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(69,38);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(Node_Right, "Node_Right"), root_1);

                dbg.location(69,49);
                if ( !(stream_expression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expression.hasNext() ) {
                    dbg.location(69,49);
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(69, 61);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "exprs");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "exprs"

    public static class commands_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "commands"
    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:70:1: commands : ( WS )* command ( ';' command )* ( WS )* -> ^( Node_Bloc ( command )+ ) ;
    public final whileParser.commands_return commands() throws RecognitionException {
        whileParser.commands_return retval = new whileParser.commands_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WS31=null;
        Token char_literal33=null;
        Token WS35=null;
        whileParser.command_return command32 = null;

        whileParser.command_return command34 = null;


        Object WS31_tree=null;
        Object char_literal33_tree=null;
        Object WS35_tree=null;
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
        RewriteRuleSubtreeStream stream_command=new RewriteRuleSubtreeStream(adaptor,"rule command");
        try { dbg.enterRule(getGrammarFileName(), "commands");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(70, 1);

        try {
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:71:2: ( ( WS )* command ( ';' command )* ( WS )* -> ^( Node_Bloc ( command )+ ) )
            dbg.enterAlt(1);

            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:71:4: ( WS )* command ( ';' command )* ( WS )*
            {
            dbg.location(71,4);
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:71:4: ( WS )*
            try { dbg.enterSubRule(11);

            loop11:
            do {
                int alt11=2;
                try { dbg.enterDecision(11, decisionCanBacktrack[11]);

                int LA11_0 = input.LA(1);

                if ( (LA11_0==WS) ) {
                    alt11=1;
                }


                } finally {dbg.exitDecision(11);}

                switch (alt11) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:71:4: WS
            	    {
            	    dbg.location(71,4);
            	    WS31=(Token)match(input,WS,FOLLOW_WS_in_commands467);  
            	    stream_WS.add(WS31);


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);
            } finally {dbg.exitSubRule(11);}

            dbg.location(71,8);
            pushFollow(FOLLOW_command_in_commands470);
            command32=command();

            state._fsp--;

            stream_command.add(command32.getTree());
            dbg.location(71,16);
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:71:16: ( ';' command )*
            try { dbg.enterSubRule(12);

            loop12:
            do {
                int alt12=2;
                try { dbg.enterDecision(12, decisionCanBacktrack[12]);

                int LA12_0 = input.LA(1);

                if ( (LA12_0==35) ) {
                    alt12=1;
                }


                } finally {dbg.exitDecision(12);}

                switch (alt12) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:71:17: ';' command
            	    {
            	    dbg.location(71,17);
            	    char_literal33=(Token)match(input,35,FOLLOW_35_in_commands473);  
            	    stream_35.add(char_literal33);

            	    dbg.location(71,21);
            	    pushFollow(FOLLOW_command_in_commands475);
            	    command34=command();

            	    state._fsp--;

            	    stream_command.add(command34.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);
            } finally {dbg.exitSubRule(12);}

            dbg.location(71,31);
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:71:31: ( WS )*
            try { dbg.enterSubRule(13);

            loop13:
            do {
                int alt13=2;
                try { dbg.enterDecision(13, decisionCanBacktrack[13]);

                int LA13_0 = input.LA(1);

                if ( (LA13_0==WS) ) {
                    alt13=1;
                }


                } finally {dbg.exitDecision(13);}

                switch (alt13) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:71:31: WS
            	    {
            	    dbg.location(71,31);
            	    WS35=(Token)match(input,WS,FOLLOW_WS_in_commands479);  
            	    stream_WS.add(WS35);


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);
            } finally {dbg.exitSubRule(13);}



            // AST REWRITE
            // elements: command
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 71:35: -> ^( Node_Bloc ( command )+ )
            {
                dbg.location(71,38);
                // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:71:38: ^( Node_Bloc ( command )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(71,40);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(Node_Bloc, "Node_Bloc"), root_1);

                dbg.location(71,50);
                if ( !(stream_command.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_command.hasNext() ) {
                    dbg.location(71,50);
                    adaptor.addChild(root_1, stream_command.nextTree());

                }
                stream_command.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(71, 59);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "commands");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "commands"

    public static class command_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "command"
    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:72:1: command : ( 'foreach' Variable 'in' expression 'do' commands 'od' -> ^( Node_ForEach Variable expression commands ) | 'for' expression 'do' commands 'od' -> ^( Node_For expression commands ) | 'while' expression 'do' commands 'od' -> ^( Node_While expression commands ) | 'if' expression 'then' commands ( 'else' commands )? 'fi' -> ^( Node_If expression commands ( ^( Node_Else commands ) )? ) | 'nop' | vars ':=' exprs -> ^( Node_Affectation vars exprs ) );
    public final whileParser.command_return command() throws RecognitionException {
        whileParser.command_return retval = new whileParser.command_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal36=null;
        Token Variable37=null;
        Token string_literal38=null;
        Token string_literal40=null;
        Token string_literal42=null;
        Token string_literal43=null;
        Token string_literal45=null;
        Token string_literal47=null;
        Token string_literal48=null;
        Token string_literal50=null;
        Token string_literal52=null;
        Token string_literal53=null;
        Token string_literal55=null;
        Token string_literal57=null;
        Token string_literal59=null;
        Token string_literal60=null;
        Token string_literal62=null;
        whileParser.expression_return expression39 = null;

        whileParser.commands_return commands41 = null;

        whileParser.expression_return expression44 = null;

        whileParser.commands_return commands46 = null;

        whileParser.expression_return expression49 = null;

        whileParser.commands_return commands51 = null;

        whileParser.expression_return expression54 = null;

        whileParser.commands_return commands56 = null;

        whileParser.commands_return commands58 = null;

        whileParser.vars_return vars61 = null;

        whileParser.exprs_return exprs63 = null;


        Object string_literal36_tree=null;
        Object Variable37_tree=null;
        Object string_literal38_tree=null;
        Object string_literal40_tree=null;
        Object string_literal42_tree=null;
        Object string_literal43_tree=null;
        Object string_literal45_tree=null;
        Object string_literal47_tree=null;
        Object string_literal48_tree=null;
        Object string_literal50_tree=null;
        Object string_literal52_tree=null;
        Object string_literal53_tree=null;
        Object string_literal55_tree=null;
        Object string_literal57_tree=null;
        Object string_literal59_tree=null;
        Object string_literal60_tree=null;
        Object string_literal62_tree=null;
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");
        RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");
        RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");
        try { dbg.enterRule(getGrammarFileName(), "command");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(72, 1);

        try {
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:73:2: ( 'foreach' Variable 'in' expression 'do' commands 'od' -> ^( Node_ForEach Variable expression commands ) | 'for' expression 'do' commands 'od' -> ^( Node_For expression commands ) | 'while' expression 'do' commands 'od' -> ^( Node_While expression commands ) | 'if' expression 'then' commands ( 'else' commands )? 'fi' -> ^( Node_If expression commands ( ^( Node_Else commands ) )? ) | 'nop' | vars ':=' exprs -> ^( Node_Affectation vars exprs ) )
            int alt15=6;
            try { dbg.enterDecision(15, decisionCanBacktrack[15]);

            switch ( input.LA(1) ) {
            case 36:
                {
                alt15=1;
                }
                break;
            case 40:
                {
                alt15=2;
                }
                break;
            case 41:
                {
                alt15=3;
                }
                break;
            case 42:
                {
                alt15=4;
                }
                break;
            case 46:
                {
                alt15=5;
                }
                break;
            case Variable:
                {
                alt15=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(15);}

            switch (alt15) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:73:4: 'foreach' Variable 'in' expression 'do' commands 'od'
                    {
                    dbg.location(73,4);
                    string_literal36=(Token)match(input,36,FOLLOW_36_in_command504);  
                    stream_36.add(string_literal36);

                    dbg.location(73,14);
                    Variable37=(Token)match(input,Variable,FOLLOW_Variable_in_command506);  
                    stream_Variable.add(Variable37);

                    dbg.location(73,23);
                    string_literal38=(Token)match(input,37,FOLLOW_37_in_command508);  
                    stream_37.add(string_literal38);

                    dbg.location(73,28);
                    pushFollow(FOLLOW_expression_in_command510);
                    expression39=expression();

                    state._fsp--;

                    stream_expression.add(expression39.getTree());
                    dbg.location(73,39);
                    string_literal40=(Token)match(input,38,FOLLOW_38_in_command512);  
                    stream_38.add(string_literal40);

                    dbg.location(73,44);
                    pushFollow(FOLLOW_commands_in_command514);
                    commands41=commands();

                    state._fsp--;

                    stream_commands.add(commands41.getTree());
                    dbg.location(73,53);
                    string_literal42=(Token)match(input,39,FOLLOW_39_in_command516);  
                    stream_39.add(string_literal42);



                    // AST REWRITE
                    // elements: expression, Variable, commands
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 73:58: -> ^( Node_ForEach Variable expression commands )
                    {
                        dbg.location(73,61);
                        // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:73:61: ^( Node_ForEach Variable expression commands )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(73,63);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(Node_ForEach, "Node_ForEach"), root_1);

                        dbg.location(73,76);
                        adaptor.addChild(root_1, stream_Variable.nextNode());
                        dbg.location(73,85);
                        adaptor.addChild(root_1, stream_expression.nextTree());
                        dbg.location(73,96);
                        adaptor.addChild(root_1, stream_commands.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:74:5: 'for' expression 'do' commands 'od'
                    {
                    dbg.location(74,5);
                    string_literal43=(Token)match(input,40,FOLLOW_40_in_command534);  
                    stream_40.add(string_literal43);

                    dbg.location(74,11);
                    pushFollow(FOLLOW_expression_in_command536);
                    expression44=expression();

                    state._fsp--;

                    stream_expression.add(expression44.getTree());
                    dbg.location(74,22);
                    string_literal45=(Token)match(input,38,FOLLOW_38_in_command538);  
                    stream_38.add(string_literal45);

                    dbg.location(74,27);
                    pushFollow(FOLLOW_commands_in_command540);
                    commands46=commands();

                    state._fsp--;

                    stream_commands.add(commands46.getTree());
                    dbg.location(74,36);
                    string_literal47=(Token)match(input,39,FOLLOW_39_in_command542);  
                    stream_39.add(string_literal47);



                    // AST REWRITE
                    // elements: expression, commands
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 74:41: -> ^( Node_For expression commands )
                    {
                        dbg.location(74,44);
                        // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:74:44: ^( Node_For expression commands )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(74,46);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(Node_For, "Node_For"), root_1);

                        dbg.location(74,55);
                        adaptor.addChild(root_1, stream_expression.nextTree());
                        dbg.location(74,66);
                        adaptor.addChild(root_1, stream_commands.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:75:5: 'while' expression 'do' commands 'od'
                    {
                    dbg.location(75,5);
                    string_literal48=(Token)match(input,41,FOLLOW_41_in_command558);  
                    stream_41.add(string_literal48);

                    dbg.location(75,13);
                    pushFollow(FOLLOW_expression_in_command560);
                    expression49=expression();

                    state._fsp--;

                    stream_expression.add(expression49.getTree());
                    dbg.location(75,24);
                    string_literal50=(Token)match(input,38,FOLLOW_38_in_command562);  
                    stream_38.add(string_literal50);

                    dbg.location(75,29);
                    pushFollow(FOLLOW_commands_in_command564);
                    commands51=commands();

                    state._fsp--;

                    stream_commands.add(commands51.getTree());
                    dbg.location(75,38);
                    string_literal52=(Token)match(input,39,FOLLOW_39_in_command566);  
                    stream_39.add(string_literal52);



                    // AST REWRITE
                    // elements: expression, commands
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 75:43: -> ^( Node_While expression commands )
                    {
                        dbg.location(75,46);
                        // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:75:46: ^( Node_While expression commands )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(75,48);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(Node_While, "Node_While"), root_1);

                        dbg.location(75,59);
                        adaptor.addChild(root_1, stream_expression.nextTree());
                        dbg.location(75,70);
                        adaptor.addChild(root_1, stream_commands.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:76:5: 'if' expression 'then' commands ( 'else' commands )? 'fi'
                    {
                    dbg.location(76,5);
                    string_literal53=(Token)match(input,42,FOLLOW_42_in_command582);  
                    stream_42.add(string_literal53);

                    dbg.location(76,10);
                    pushFollow(FOLLOW_expression_in_command584);
                    expression54=expression();

                    state._fsp--;

                    stream_expression.add(expression54.getTree());
                    dbg.location(76,21);
                    string_literal55=(Token)match(input,43,FOLLOW_43_in_command586);  
                    stream_43.add(string_literal55);

                    dbg.location(76,29);
                    pushFollow(FOLLOW_commands_in_command589);
                    commands56=commands();

                    state._fsp--;

                    stream_commands.add(commands56.getTree());
                    dbg.location(76,38);
                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:76:38: ( 'else' commands )?
                    int alt14=2;
                    try { dbg.enterSubRule(14);
                    try { dbg.enterDecision(14, decisionCanBacktrack[14]);

                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==44) ) {
                        alt14=1;
                    }
                    } finally {dbg.exitDecision(14);}

                    switch (alt14) {
                        case 1 :
                            dbg.enterAlt(1);

                            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:76:39: 'else' commands
                            {
                            dbg.location(76,39);
                            string_literal57=(Token)match(input,44,FOLLOW_44_in_command592);  
                            stream_44.add(string_literal57);

                            dbg.location(76,46);
                            pushFollow(FOLLOW_commands_in_command594);
                            commands58=commands();

                            state._fsp--;

                            stream_commands.add(commands58.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(14);}

                    dbg.location(76,57);
                    string_literal59=(Token)match(input,45,FOLLOW_45_in_command598);  
                    stream_45.add(string_literal59);



                    // AST REWRITE
                    // elements: commands, expression, commands
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 76:62: -> ^( Node_If expression commands ( ^( Node_Else commands ) )? )
                    {
                        dbg.location(76,65);
                        // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:76:65: ^( Node_If expression commands ( ^( Node_Else commands ) )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(76,67);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(Node_If, "Node_If"), root_1);

                        dbg.location(76,75);
                        adaptor.addChild(root_1, stream_expression.nextTree());
                        dbg.location(76,86);
                        adaptor.addChild(root_1, stream_commands.nextTree());
                        dbg.location(76,95);
                        // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:76:95: ( ^( Node_Else commands ) )?
                        if ( stream_commands.hasNext() ) {
                            dbg.location(76,95);
                            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:76:95: ^( Node_Else commands )
                            {
                            Object root_2 = (Object)adaptor.nil();
                            dbg.location(76,97);
                            root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(Node_Else, "Node_Else"), root_2);

                            dbg.location(76,107);
                            adaptor.addChild(root_2, stream_commands.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_commands.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:77:5: 'nop'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(77,5);
                    string_literal60=(Token)match(input,46,FOLLOW_46_in_command621); 
                    string_literal60_tree = (Object)adaptor.create(string_literal60);
                    adaptor.addChild(root_0, string_literal60_tree);


                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:78:5: vars ':=' exprs
                    {
                    dbg.location(78,5);
                    pushFollow(FOLLOW_vars_in_command627);
                    vars61=vars();

                    state._fsp--;

                    stream_vars.add(vars61.getTree());
                    dbg.location(78,10);
                    string_literal62=(Token)match(input,47,FOLLOW_47_in_command629);  
                    stream_47.add(string_literal62);

                    dbg.location(78,15);
                    pushFollow(FOLLOW_exprs_in_command631);
                    exprs63=exprs();

                    state._fsp--;

                    stream_exprs.add(exprs63.getTree());


                    // AST REWRITE
                    // elements: vars, exprs
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 78:21: -> ^( Node_Affectation vars exprs )
                    {
                        dbg.location(78,24);
                        // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:78:24: ^( Node_Affectation vars exprs )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(78,26);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(Node_Affectation, "Node_Affectation"), root_1);

                        dbg.location(78,43);
                        adaptor.addChild(root_1, stream_vars.nextTree());
                        dbg.location(78,48);
                        adaptor.addChild(root_1, stream_exprs.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(79, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "command");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "command"

    public static class exprBase_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprBase"
    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:80:1: exprBase : ( '(' Symbol lExpr ')' -> ^( Node_Call Symbol ^( Node_Params lExpr ) ) | '(' 'hd' exprBase ')' -> ^( Node_Head exprBase ) | '(' 'tl' exprBase ')' -> ^( Node_Tail exprBase ) | '(' 'cons' lExpr ')' -> ^( Node_Cons lExpr ) | '(' 'list' lExpr ')' -> ^( Node_List lExpr ) | 'nil' | Variable | Symbol );
    public final whileParser.exprBase_return exprBase() throws RecognitionException {
        whileParser.exprBase_return retval = new whileParser.exprBase_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal64=null;
        Token Symbol65=null;
        Token char_literal67=null;
        Token char_literal68=null;
        Token string_literal69=null;
        Token char_literal71=null;
        Token char_literal72=null;
        Token string_literal73=null;
        Token char_literal75=null;
        Token char_literal76=null;
        Token string_literal77=null;
        Token char_literal79=null;
        Token char_literal80=null;
        Token string_literal81=null;
        Token char_literal83=null;
        Token string_literal84=null;
        Token Variable85=null;
        Token Symbol86=null;
        whileParser.lExpr_return lExpr66 = null;

        whileParser.exprBase_return exprBase70 = null;

        whileParser.exprBase_return exprBase74 = null;

        whileParser.lExpr_return lExpr78 = null;

        whileParser.lExpr_return lExpr82 = null;


        Object char_literal64_tree=null;
        Object Symbol65_tree=null;
        Object char_literal67_tree=null;
        Object char_literal68_tree=null;
        Object string_literal69_tree=null;
        Object char_literal71_tree=null;
        Object char_literal72_tree=null;
        Object string_literal73_tree=null;
        Object char_literal75_tree=null;
        Object char_literal76_tree=null;
        Object string_literal77_tree=null;
        Object char_literal79_tree=null;
        Object char_literal80_tree=null;
        Object string_literal81_tree=null;
        Object char_literal83_tree=null;
        Object string_literal84_tree=null;
        Object Variable85_tree=null;
        Object Symbol86_tree=null;
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_Symbol=new RewriteRuleTokenStream(adaptor,"token Symbol");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");
        RewriteRuleSubtreeStream stream_lExpr=new RewriteRuleSubtreeStream(adaptor,"rule lExpr");
        try { dbg.enterRule(getGrammarFileName(), "exprBase");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(80, 1);

        try {
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:81:3: ( '(' Symbol lExpr ')' -> ^( Node_Call Symbol ^( Node_Params lExpr ) ) | '(' 'hd' exprBase ')' -> ^( Node_Head exprBase ) | '(' 'tl' exprBase ')' -> ^( Node_Tail exprBase ) | '(' 'cons' lExpr ')' -> ^( Node_Cons lExpr ) | '(' 'list' lExpr ')' -> ^( Node_List lExpr ) | 'nil' | Variable | Symbol )
            int alt16=8;
            try { dbg.enterDecision(16, decisionCanBacktrack[16]);

            try {
                isCyclicDecision = true;
                alt16 = dfa16.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(16);}

            switch (alt16) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:81:5: '(' Symbol lExpr ')'
                    {
                    dbg.location(81,5);
                    char_literal64=(Token)match(input,48,FOLLOW_48_in_exprBase661);  
                    stream_48.add(char_literal64);

                    dbg.location(81,9);
                    Symbol65=(Token)match(input,Symbol,FOLLOW_Symbol_in_exprBase663);  
                    stream_Symbol.add(Symbol65);

                    dbg.location(81,16);
                    pushFollow(FOLLOW_lExpr_in_exprBase665);
                    lExpr66=lExpr();

                    state._fsp--;

                    stream_lExpr.add(lExpr66.getTree());
                    dbg.location(81,22);
                    char_literal67=(Token)match(input,49,FOLLOW_49_in_exprBase667);  
                    stream_49.add(char_literal67);



                    // AST REWRITE
                    // elements: Symbol, lExpr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 81:26: -> ^( Node_Call Symbol ^( Node_Params lExpr ) )
                    {
                        dbg.location(81,29);
                        // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:81:29: ^( Node_Call Symbol ^( Node_Params lExpr ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(81,31);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(Node_Call, "Node_Call"), root_1);

                        dbg.location(81,41);
                        adaptor.addChild(root_1, stream_Symbol.nextNode());
                        dbg.location(81,48);
                        // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:81:48: ^( Node_Params lExpr )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(81,50);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(Node_Params, "Node_Params"), root_2);

                        dbg.location(81,62);
                        adaptor.addChild(root_2, stream_lExpr.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:82:5: '(' 'hd' exprBase ')'
                    {
                    dbg.location(82,5);
                    char_literal68=(Token)match(input,48,FOLLOW_48_in_exprBase687);  
                    stream_48.add(char_literal68);

                    dbg.location(82,9);
                    string_literal69=(Token)match(input,50,FOLLOW_50_in_exprBase689);  
                    stream_50.add(string_literal69);

                    dbg.location(82,14);
                    pushFollow(FOLLOW_exprBase_in_exprBase691);
                    exprBase70=exprBase();

                    state._fsp--;

                    stream_exprBase.add(exprBase70.getTree());
                    dbg.location(82,23);
                    char_literal71=(Token)match(input,49,FOLLOW_49_in_exprBase693);  
                    stream_49.add(char_literal71);



                    // AST REWRITE
                    // elements: exprBase
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 82:27: -> ^( Node_Head exprBase )
                    {
                        dbg.location(82,31);
                        // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:82:31: ^( Node_Head exprBase )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(82,33);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(Node_Head, "Node_Head"), root_1);

                        dbg.location(82,43);
                        adaptor.addChild(root_1, stream_exprBase.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:83:5: '(' 'tl' exprBase ')'
                    {
                    dbg.location(83,5);
                    char_literal72=(Token)match(input,48,FOLLOW_48_in_exprBase708);  
                    stream_48.add(char_literal72);

                    dbg.location(83,9);
                    string_literal73=(Token)match(input,51,FOLLOW_51_in_exprBase710);  
                    stream_51.add(string_literal73);

                    dbg.location(83,14);
                    pushFollow(FOLLOW_exprBase_in_exprBase712);
                    exprBase74=exprBase();

                    state._fsp--;

                    stream_exprBase.add(exprBase74.getTree());
                    dbg.location(83,23);
                    char_literal75=(Token)match(input,49,FOLLOW_49_in_exprBase714);  
                    stream_49.add(char_literal75);



                    // AST REWRITE
                    // elements: exprBase
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 83:27: -> ^( Node_Tail exprBase )
                    {
                        dbg.location(83,30);
                        // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:83:30: ^( Node_Tail exprBase )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(83,32);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(Node_Tail, "Node_Tail"), root_1);

                        dbg.location(83,42);
                        adaptor.addChild(root_1, stream_exprBase.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:84:5: '(' 'cons' lExpr ')'
                    {
                    dbg.location(84,5);
                    char_literal76=(Token)match(input,48,FOLLOW_48_in_exprBase728);  
                    stream_48.add(char_literal76);

                    dbg.location(84,9);
                    string_literal77=(Token)match(input,52,FOLLOW_52_in_exprBase730);  
                    stream_52.add(string_literal77);

                    dbg.location(84,16);
                    pushFollow(FOLLOW_lExpr_in_exprBase732);
                    lExpr78=lExpr();

                    state._fsp--;

                    stream_lExpr.add(lExpr78.getTree());
                    dbg.location(84,22);
                    char_literal79=(Token)match(input,49,FOLLOW_49_in_exprBase734);  
                    stream_49.add(char_literal79);



                    // AST REWRITE
                    // elements: lExpr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 84:26: -> ^( Node_Cons lExpr )
                    {
                        dbg.location(84,29);
                        // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:84:29: ^( Node_Cons lExpr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(84,31);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(Node_Cons, "Node_Cons"), root_1);

                        dbg.location(84,41);
                        adaptor.addChild(root_1, stream_lExpr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:85:5: '(' 'list' lExpr ')'
                    {
                    dbg.location(85,5);
                    char_literal80=(Token)match(input,48,FOLLOW_48_in_exprBase748);  
                    stream_48.add(char_literal80);

                    dbg.location(85,9);
                    string_literal81=(Token)match(input,53,FOLLOW_53_in_exprBase750);  
                    stream_53.add(string_literal81);

                    dbg.location(85,16);
                    pushFollow(FOLLOW_lExpr_in_exprBase752);
                    lExpr82=lExpr();

                    state._fsp--;

                    stream_lExpr.add(lExpr82.getTree());
                    dbg.location(85,22);
                    char_literal83=(Token)match(input,49,FOLLOW_49_in_exprBase754);  
                    stream_49.add(char_literal83);



                    // AST REWRITE
                    // elements: lExpr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 85:26: -> ^( Node_List lExpr )
                    {
                        dbg.location(85,29);
                        // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:85:29: ^( Node_List lExpr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(85,31);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(Node_List, "Node_List"), root_1);

                        dbg.location(85,41);
                        adaptor.addChild(root_1, stream_lExpr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:86:5: 'nil'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(86,5);
                    string_literal84=(Token)match(input,54,FOLLOW_54_in_exprBase768); 
                    string_literal84_tree = (Object)adaptor.create(string_literal84);
                    adaptor.addChild(root_0, string_literal84_tree);


                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:87:5: Variable
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(87,5);
                    Variable85=(Token)match(input,Variable,FOLLOW_Variable_in_exprBase775); 
                    Variable85_tree = (Object)adaptor.create(Variable85);
                    adaptor.addChild(root_0, Variable85_tree);


                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:88:5: Symbol
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(88,5);
                    Symbol86=(Token)match(input,Symbol,FOLLOW_Symbol_in_exprBase781); 
                    Symbol86_tree = (Object)adaptor.create(Symbol86);
                    adaptor.addChild(root_0, Symbol86_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(88, 11);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "exprBase");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "exprBase"

    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:89:1: expression : exprBase ( '=?' exprBase )? ;
    public final whileParser.expression_return expression() throws RecognitionException {
        whileParser.expression_return retval = new whileParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal88=null;
        whileParser.exprBase_return exprBase87 = null;

        whileParser.exprBase_return exprBase89 = null;


        Object string_literal88_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(89, 1);

        try {
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:90:2: ( exprBase ( '=?' exprBase )? )
            dbg.enterAlt(1);

            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:90:4: exprBase ( '=?' exprBase )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(90,4);
            pushFollow(FOLLOW_exprBase_in_expression789);
            exprBase87=exprBase();

            state._fsp--;

            adaptor.addChild(root_0, exprBase87.getTree());
            dbg.location(90,13);
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:90:13: ( '=?' exprBase )?
            int alt17=2;
            try { dbg.enterSubRule(17);
            try { dbg.enterDecision(17, decisionCanBacktrack[17]);

            int LA17_0 = input.LA(1);

            if ( (LA17_0==55) ) {
                alt17=1;
            }
            } finally {dbg.exitDecision(17);}

            switch (alt17) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:90:14: '=?' exprBase
                    {
                    dbg.location(90,14);
                    string_literal88=(Token)match(input,55,FOLLOW_55_in_expression792); 
                    string_literal88_tree = (Object)adaptor.create(string_literal88);
                    adaptor.addChild(root_0, string_literal88_tree);

                    dbg.location(90,19);
                    pushFollow(FOLLOW_exprBase_in_expression794);
                    exprBase89=exprBase();

                    state._fsp--;

                    adaptor.addChild(root_0, exprBase89.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(17);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(90, 30);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "expression"

    public static class lExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lExpr"
    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:91:1: lExpr : ( exprBase lExpr )? ;
    public final whileParser.lExpr_return lExpr() throws RecognitionException {
        whileParser.lExpr_return retval = new whileParser.lExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        whileParser.exprBase_return exprBase90 = null;

        whileParser.lExpr_return lExpr91 = null;



        try { dbg.enterRule(getGrammarFileName(), "lExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(91, 1);

        try {
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:92:2: ( ( exprBase lExpr )? )
            dbg.enterAlt(1);

            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:92:4: ( exprBase lExpr )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(92,4);
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:92:4: ( exprBase lExpr )?
            int alt18=2;
            try { dbg.enterSubRule(18);
            try { dbg.enterDecision(18, decisionCanBacktrack[18]);

            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=Variable && LA18_0<=Symbol)||LA18_0==48||LA18_0==54) ) {
                alt18=1;
            }
            } finally {dbg.exitDecision(18);}

            switch (alt18) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:92:5: exprBase lExpr
                    {
                    dbg.location(92,5);
                    pushFollow(FOLLOW_exprBase_in_lExpr807);
                    exprBase90=exprBase();

                    state._fsp--;

                    adaptor.addChild(root_0, exprBase90.getTree());
                    dbg.location(92,14);
                    pushFollow(FOLLOW_lExpr_in_lExpr809);
                    lExpr91=lExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, lExpr91.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(18);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(92, 21);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "lExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "lExpr"

    // Delegated rules


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\12\uffff";
    static final String DFA16_eofS =
        "\12\uffff";
    static final String DFA16_minS =
        "\1\32\1\33\10\uffff";
    static final String DFA16_maxS =
        "\1\66\1\65\10\uffff";
    static final String DFA16_acceptS =
        "\2\uffff\1\6\1\7\1\10\1\1\1\2\1\3\1\4\1\5";
    static final String DFA16_specialS =
        "\12\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\3\1\4\24\uffff\1\1\5\uffff\1\2",
            "\1\5\26\uffff\1\6\1\7\1\10\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "80:1: exprBase : ( '(' Symbol lExpr ')' -> ^( Node_Call Symbol ^( Node_Params lExpr ) ) | '(' 'hd' exprBase ')' -> ^( Node_Head exprBase ) | '(' 'tl' exprBase ')' -> ^( Node_Tail exprBase ) | '(' 'cons' lExpr ')' -> ^( Node_Cons lExpr ) | '(' 'list' lExpr ')' -> ^( Node_List lExpr ) | 'nil' | Variable | Symbol );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
 

    public static final BitSet FOLLOW_function_in_program261 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_program_in_program263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_function274 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_Symbol_in_function276 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_function278 = new BitSet(new long[]{0x0000000090000000L});
    public static final BitSet FOLLOW_WS_in_function280 = new BitSet(new long[]{0x0000000090000000L});
    public static final BitSet FOLLOW_definition_in_function283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_definition309 = new BitSet(new long[]{0x0000000114000000L});
    public static final BitSet FOLLOW_input_in_definition311 = new BitSet(new long[]{0x0000000110000000L});
    public static final BitSet FOLLOW_WS_in_definition313 = new BitSet(new long[]{0x0000000110000000L});
    public static final BitSet FOLLOW_32_in_definition316 = new BitSet(new long[]{0x0000471014000000L});
    public static final BitSet FOLLOW_commands_in_definition318 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_definition320 = new BitSet(new long[]{0x0000000210000000L});
    public static final BitSet FOLLOW_WS_in_definition322 = new BitSet(new long[]{0x0000000210000000L});
    public static final BitSet FOLLOW_33_in_definition325 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_output_in_definition327 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_WS_in_definition329 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_inputSub_in_input350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Variable_in_inputSub368 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_inputSub371 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_Variable_in_inputSub373 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_Variable_in_output390 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_output393 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_Variable_in_output395 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_Variable_in_vars416 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_vars419 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_Variable_in_vars421 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_expression_in_exprs441 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_exprs444 = new BitSet(new long[]{0x004100000C000000L});
    public static final BitSet FOLLOW_expression_in_exprs446 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_WS_in_commands467 = new BitSet(new long[]{0x0000471014000000L});
    public static final BitSet FOLLOW_command_in_commands470 = new BitSet(new long[]{0x0000000810000002L});
    public static final BitSet FOLLOW_35_in_commands473 = new BitSet(new long[]{0x0000471014000000L});
    public static final BitSet FOLLOW_command_in_commands475 = new BitSet(new long[]{0x0000000810000002L});
    public static final BitSet FOLLOW_WS_in_commands479 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_36_in_command504 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_Variable_in_command506 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_command508 = new BitSet(new long[]{0x004100000C000000L});
    public static final BitSet FOLLOW_expression_in_command510 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_command512 = new BitSet(new long[]{0x0000471014000000L});
    public static final BitSet FOLLOW_commands_in_command514 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_command516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_command534 = new BitSet(new long[]{0x004100000C000000L});
    public static final BitSet FOLLOW_expression_in_command536 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_command538 = new BitSet(new long[]{0x0000471014000000L});
    public static final BitSet FOLLOW_commands_in_command540 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_command542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_command558 = new BitSet(new long[]{0x004100000C000000L});
    public static final BitSet FOLLOW_expression_in_command560 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_command562 = new BitSet(new long[]{0x0000471014000000L});
    public static final BitSet FOLLOW_commands_in_command564 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_command566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_command582 = new BitSet(new long[]{0x004100000C000000L});
    public static final BitSet FOLLOW_expression_in_command584 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_command586 = new BitSet(new long[]{0x0000471014000000L});
    public static final BitSet FOLLOW_commands_in_command589 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_44_in_command592 = new BitSet(new long[]{0x0000471014000000L});
    public static final BitSet FOLLOW_commands_in_command594 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_command598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_command621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vars_in_command627 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_command629 = new BitSet(new long[]{0x004100000C000000L});
    public static final BitSet FOLLOW_exprs_in_command631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_exprBase661 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_Symbol_in_exprBase663 = new BitSet(new long[]{0x004300000C000000L});
    public static final BitSet FOLLOW_lExpr_in_exprBase665 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_exprBase667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_exprBase687 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_exprBase689 = new BitSet(new long[]{0x004100000C000000L});
    public static final BitSet FOLLOW_exprBase_in_exprBase691 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_exprBase693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_exprBase708 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_exprBase710 = new BitSet(new long[]{0x004100000C000000L});
    public static final BitSet FOLLOW_exprBase_in_exprBase712 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_exprBase714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_exprBase728 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_exprBase730 = new BitSet(new long[]{0x004300000C000000L});
    public static final BitSet FOLLOW_lExpr_in_exprBase732 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_exprBase734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_exprBase748 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_exprBase750 = new BitSet(new long[]{0x004300000C000000L});
    public static final BitSet FOLLOW_lExpr_in_exprBase752 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_exprBase754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_exprBase768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Variable_in_exprBase775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Symbol_in_exprBase781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprBase_in_expression789 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_expression792 = new BitSet(new long[]{0x004100000C000000L});
    public static final BitSet FOLLOW_exprBase_in_expression794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprBase_in_lExpr807 = new BitSet(new long[]{0x004100000C000000L});
    public static final BitSet FOLLOW_lExpr_in_lExpr809 = new BitSet(new long[]{0x0000000000000002L});

}