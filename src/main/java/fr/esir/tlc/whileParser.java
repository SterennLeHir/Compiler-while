package fr.esir.tlc;// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g 2023-12-04 10:20:04

import org.antlr.runtime.*;


import org.antlr.runtime.tree.*;

public class whileParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Node_Bloc", "Node_Exprlist", "Node_Output", "Node_Input", "Node_ForEach", "Node_For", "Node_While", "Node_If", "Node_Affectation", "Node_Function", "Node_Left", "Node_Right", "Node_Head", "Node_Tail", "Node_Cons", "Node_List", "Maj", "Min", "Dec", "Variable", "Symbol", "WS", "'function'", "':'", "'read'", "'%'", "'write'", "','", "';'", "'foreach'", "'in'", "'do'", "'od'", "'for'", "'while'", "'if'", "'then'", "'else'", "'fi'", "'nop'", "':='", "'('", "')'", "'hd'", "'tl'", "'cons'", "'list'", "'nil'", "'=?'"
    };
    public static final int EOF=-1;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
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
    public static final int Node_Bloc=4;
    public static final int Node_Exprlist=5;
    public static final int Node_Output=6;
    public static final int Node_Input=7;
    public static final int Node_ForEach=8;
    public static final int Node_For=9;
    public static final int Node_While=10;
    public static final int Node_If=11;
    public static final int Node_Affectation=12;
    public static final int Node_Function=13;
    public static final int Node_Left=14;
    public static final int Node_Right=15;
    public static final int Node_Head=16;
    public static final int Node_Tail=17;
    public static final int Node_Cons=18;
    public static final int Node_List=19;
    public static final int Maj=20;
    public static final int Min=21;
    public static final int Dec=22;
    public static final int Variable=23;
    public static final int Symbol=24;
    public static final int WS=25;

    // delegates
    // delegators


        public whileParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public whileParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
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
    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:50:1: program : function ( program )? ;
    public final whileParser.program_return program() throws RecognitionException {
        whileParser.program_return retval = new whileParser.program_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        whileParser.function_return function1 = null;

        whileParser.program_return program2 = null;



        try {
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:51:2: ( function ( program )? )
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:51:4: function ( program )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_function_in_program252);
            function1=function();

            state._fsp--;

            adaptor.addChild(root_0, function1.getTree());
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:51:13: ( program )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==26) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:51:13: program
                    {
                    pushFollow(FOLLOW_program_in_program254);
                    program2=program();

                    state._fsp--;

                    adaptor.addChild(root_0, program2.getTree());

                    }
                    break;

            }


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
        return retval;
    }
    // $ANTLR end "program"

    public static class function_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function"
    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:52:1: function : 'function' Symbol ':' ( WS )* definition -> ^( Node_Function Symbol definition ) ;
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
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleTokenStream stream_Symbol=new RewriteRuleTokenStream(adaptor,"token Symbol");
        RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
        RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"rule definition");
        try {
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:53:2: ( 'function' Symbol ':' ( WS )* definition -> ^( Node_Function Symbol definition ) )
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:53:4: 'function' Symbol ':' ( WS )* definition
            {
            string_literal3=(Token)match(input,26,FOLLOW_26_in_function265);  
            stream_26.add(string_literal3);

            Symbol4=(Token)match(input,Symbol,FOLLOW_Symbol_in_function267);  
            stream_Symbol.add(Symbol4);

            char_literal5=(Token)match(input,27,FOLLOW_27_in_function269);  
            stream_27.add(char_literal5);

            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:53:26: ( WS )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==WS) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:53:26: WS
            	    {
            	    WS6=(Token)match(input,WS,FOLLOW_WS_in_function271);  
            	    stream_WS.add(WS6);


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            pushFollow(FOLLOW_definition_in_function274);
            definition7=definition();

            state._fsp--;

            stream_definition.add(definition7.getTree());


            // AST REWRITE
            // elements: Symbol, definition
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 53:42: -> ^( Node_Function Symbol definition )
            {
                // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:53:45: ^( Node_Function Symbol definition )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(Node_Function, "Node_Function"), root_1);

                adaptor.addChild(root_1, stream_Symbol.nextNode());
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
        return retval;
    }
    // $ANTLR end "function"

    public static class definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "definition"
    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:55:1: definition : 'read' input ( WS )* '%' commands '%' ( WS )* 'write' output ( WS )* -> input commands output ;
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
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");
        RewriteRuleSubtreeStream stream_input=new RewriteRuleSubtreeStream(adaptor,"rule input");
        RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");
        try {
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:56:2: ( 'read' input ( WS )* '%' commands '%' ( WS )* 'write' output ( WS )* -> input commands output )
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:56:4: 'read' input ( WS )* '%' commands '%' ( WS )* 'write' output ( WS )*
            {
            string_literal8=(Token)match(input,28,FOLLOW_28_in_definition299);  
            stream_28.add(string_literal8);

            pushFollow(FOLLOW_input_in_definition301);
            input9=input();

            state._fsp--;

            stream_input.add(input9.getTree());
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:56:17: ( WS )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==WS) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:56:17: WS
            	    {
            	    WS10=(Token)match(input,WS,FOLLOW_WS_in_definition303);  
            	    stream_WS.add(WS10);


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            char_literal11=(Token)match(input,29,FOLLOW_29_in_definition306);  
            stream_29.add(char_literal11);

            pushFollow(FOLLOW_commands_in_definition308);
            commands12=commands();

            state._fsp--;

            stream_commands.add(commands12.getTree());
            char_literal13=(Token)match(input,29,FOLLOW_29_in_definition310);  
            stream_29.add(char_literal13);

            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:56:38: ( WS )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==WS) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:56:38: WS
            	    {
            	    WS14=(Token)match(input,WS,FOLLOW_WS_in_definition312);  
            	    stream_WS.add(WS14);


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            string_literal15=(Token)match(input,30,FOLLOW_30_in_definition315);  
            stream_30.add(string_literal15);

            pushFollow(FOLLOW_output_in_definition317);
            output16=output();

            state._fsp--;

            stream_output.add(output16.getTree());
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:56:57: ( WS )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==WS) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:56:57: WS
            	    {
            	    WS17=(Token)match(input,WS,FOLLOW_WS_in_definition319);  
            	    stream_WS.add(WS17);


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);



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
            // 56:61: -> input commands output
            {
                adaptor.addChild(root_0, stream_input.nextTree());
                adaptor.addChild(root_0, stream_commands.nextTree());
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
        return retval;
    }
    // $ANTLR end "definition"

    public static class input_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "input"
    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:57:1: input : ( inputSub )? -> ^( Node_Input ( inputSub )? ) ;
    public final whileParser.input_return input() throws RecognitionException {
        whileParser.input_return retval = new whileParser.input_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        whileParser.inputSub_return inputSub18 = null;


        RewriteRuleSubtreeStream stream_inputSub=new RewriteRuleSubtreeStream(adaptor,"rule inputSub");
        try {
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:58:2: ( ( inputSub )? -> ^( Node_Input ( inputSub )? ) )
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:58:5: ( inputSub )?
            {
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:58:5: ( inputSub )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Variable) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:58:5: inputSub
                    {
                    pushFollow(FOLLOW_inputSub_in_input340);
                    inputSub18=inputSub();

                    state._fsp--;

                    stream_inputSub.add(inputSub18.getTree());

                    }
                    break;

            }



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
            // 58:15: -> ^( Node_Input ( inputSub )? )
            {
                // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:58:17: ^( Node_Input ( inputSub )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(Node_Input, "Node_Input"), root_1);

                // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:58:30: ( inputSub )?
                if ( stream_inputSub.hasNext() ) {
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
        return retval;
    }
    // $ANTLR end "input"

    public static class inputSub_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inputSub"
    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:59:1: inputSub : Variable ( ',' Variable )* -> ( Variable )+ ;
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
        RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");

        try {
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:60:2: ( Variable ( ',' Variable )* -> ( Variable )+ )
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:60:4: Variable ( ',' Variable )*
            {
            Variable19=(Token)match(input,Variable,FOLLOW_Variable_in_inputSub358);  
            stream_Variable.add(Variable19);

            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:60:13: ( ',' Variable )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==31) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:60:14: ',' Variable
            	    {
            	    char_literal20=(Token)match(input,31,FOLLOW_31_in_inputSub361);  
            	    stream_31.add(char_literal20);

            	    Variable21=(Token)match(input,Variable,FOLLOW_Variable_in_inputSub363);  
            	    stream_Variable.add(Variable21);


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);



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
            // 60:28: -> ( Variable )+
            {
                if ( !(stream_Variable.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_Variable.hasNext() ) {
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
        return retval;
    }
    // $ANTLR end "inputSub"

    public static class output_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "output"
    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:61:1: output : Variable ( ',' Variable )* -> ^( Node_Output ( Variable )+ ) ;
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
        RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");

        try {
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:62:2: ( Variable ( ',' Variable )* -> ^( Node_Output ( Variable )+ ) )
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:62:4: Variable ( ',' Variable )*
            {
            Variable22=(Token)match(input,Variable,FOLLOW_Variable_in_output380);  
            stream_Variable.add(Variable22);

            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:62:13: ( ',' Variable )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==31) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:62:14: ',' Variable
            	    {
            	    char_literal23=(Token)match(input,31,FOLLOW_31_in_output383);  
            	    stream_31.add(char_literal23);

            	    Variable24=(Token)match(input,Variable,FOLLOW_Variable_in_output385);  
            	    stream_Variable.add(Variable24);


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);



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
            // 62:29: -> ^( Node_Output ( Variable )+ )
            {
                // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:62:32: ^( Node_Output ( Variable )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(Node_Output, "Node_Output"), root_1);

                if ( !(stream_Variable.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_Variable.hasNext() ) {
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
        return retval;
    }
    // $ANTLR end "output"

    public static class vars_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vars"
    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:63:1: vars : Variable ( ',' Variable )* -> ^( Node_Left ( Variable )+ ) ;
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
        RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");

        try {
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:64:2: ( Variable ( ',' Variable )* -> ^( Node_Left ( Variable )+ ) )
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:64:4: Variable ( ',' Variable )*
            {
            Variable25=(Token)match(input,Variable,FOLLOW_Variable_in_vars406);  
            stream_Variable.add(Variable25);

            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:64:13: ( ',' Variable )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==31) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:64:14: ',' Variable
            	    {
            	    char_literal26=(Token)match(input,31,FOLLOW_31_in_vars409);  
            	    stream_31.add(char_literal26);

            	    Variable27=(Token)match(input,Variable,FOLLOW_Variable_in_vars411);  
            	    stream_Variable.add(Variable27);


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);



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
            // 64:29: -> ^( Node_Left ( Variable )+ )
            {
                // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:64:32: ^( Node_Left ( Variable )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(Node_Left, "Node_Left"), root_1);

                if ( !(stream_Variable.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_Variable.hasNext() ) {
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
        return retval;
    }
    // $ANTLR end "vars"

    public static class exprs_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprs"
    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:65:1: exprs : expression ( ',' expression )* -> ^( Node_Right ( expression )+ ) ;
    public final whileParser.exprs_return exprs() throws RecognitionException {
        whileParser.exprs_return retval = new whileParser.exprs_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal29=null;
        whileParser.expression_return expression28 = null;

        whileParser.expression_return expression30 = null;


        Object char_literal29_tree=null;
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:66:2: ( expression ( ',' expression )* -> ^( Node_Right ( expression )+ ) )
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:66:4: expression ( ',' expression )*
            {
            pushFollow(FOLLOW_expression_in_exprs431);
            expression28=expression();

            state._fsp--;

            stream_expression.add(expression28.getTree());
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:66:15: ( ',' expression )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==31) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:66:16: ',' expression
            	    {
            	    char_literal29=(Token)match(input,31,FOLLOW_31_in_exprs434);  
            	    stream_31.add(char_literal29);

            	    pushFollow(FOLLOW_expression_in_exprs436);
            	    expression30=expression();

            	    state._fsp--;

            	    stream_expression.add(expression30.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);



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
            // 66:33: -> ^( Node_Right ( expression )+ )
            {
                // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:66:36: ^( Node_Right ( expression )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(Node_Right, "Node_Right"), root_1);

                if ( !(stream_expression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expression.hasNext() ) {
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
        return retval;
    }
    // $ANTLR end "exprs"

    public static class commands_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "commands"
    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:67:1: commands : ( WS )* command ( ';' command )* ( WS )* -> ^( Node_Bloc ( command )+ ) ;
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
        RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleSubtreeStream stream_command=new RewriteRuleSubtreeStream(adaptor,"rule command");
        try {
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:68:2: ( ( WS )* command ( ';' command )* ( WS )* -> ^( Node_Bloc ( command )+ ) )
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:68:4: ( WS )* command ( ';' command )* ( WS )*
            {
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:68:4: ( WS )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==WS) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:68:4: WS
            	    {
            	    WS31=(Token)match(input,WS,FOLLOW_WS_in_commands457);  
            	    stream_WS.add(WS31);


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            pushFollow(FOLLOW_command_in_commands460);
            command32=command();

            state._fsp--;

            stream_command.add(command32.getTree());
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:68:16: ( ';' command )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==32) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:68:17: ';' command
            	    {
            	    char_literal33=(Token)match(input,32,FOLLOW_32_in_commands463);  
            	    stream_32.add(char_literal33);

            	    pushFollow(FOLLOW_command_in_commands465);
            	    command34=command();

            	    state._fsp--;

            	    stream_command.add(command34.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:68:31: ( WS )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==WS) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:68:31: WS
            	    {
            	    WS35=(Token)match(input,WS,FOLLOW_WS_in_commands469);  
            	    stream_WS.add(WS35);


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);



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
            // 68:35: -> ^( Node_Bloc ( command )+ )
            {
                // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:68:38: ^( Node_Bloc ( command )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(Node_Bloc, "Node_Bloc"), root_1);

                if ( !(stream_command.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_command.hasNext() ) {
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
        return retval;
    }
    // $ANTLR end "commands"

    public static class command_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "command"
    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:69:1: command : ( 'foreach' Variable 'in' expression 'do' commands 'od' ^( Node_ForEach expression commands ) | 'for' expression 'do' commands 'od' -> ^( Node_For expression commands ) | 'while' expression 'do' commands 'od' -> ^( Node_While expression commands ) | 'if' ( WS )* expression 'then' commands 'od' ( ( WS )* 'else' commands )? ( WS )* 'fi' ^( Node_If expression commands ) | 'nop' | vars ':=' exprs -> ^( Node_Affectation vars exprs ) );
    public final whileParser.command_return command() throws RecognitionException {
        whileParser.command_return retval = new whileParser.command_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal36=null;
        Token Variable37=null;
        Token string_literal38=null;
        Token string_literal40=null;
        Token string_literal42=null;
        Token Node_ForEach43=null;
        Token string_literal46=null;
        Token string_literal48=null;
        Token string_literal50=null;
        Token string_literal51=null;
        Token string_literal53=null;
        Token string_literal55=null;
        Token string_literal56=null;
        Token WS57=null;
        Token string_literal59=null;
        Token string_literal61=null;
        Token WS62=null;
        Token string_literal63=null;
        Token WS65=null;
        Token string_literal66=null;
        Token Node_If67=null;
        Token string_literal70=null;
        Token string_literal72=null;
        whileParser.expression_return expression39 = null;

        whileParser.commands_return commands41 = null;

        whileParser.expression_return expression44 = null;

        whileParser.commands_return commands45 = null;

        whileParser.expression_return expression47 = null;

        whileParser.commands_return commands49 = null;

        whileParser.expression_return expression52 = null;

        whileParser.commands_return commands54 = null;

        whileParser.expression_return expression58 = null;

        whileParser.commands_return commands60 = null;

        whileParser.commands_return commands64 = null;

        whileParser.expression_return expression68 = null;

        whileParser.commands_return commands69 = null;

        whileParser.vars_return vars71 = null;

        whileParser.exprs_return exprs73 = null;


        Object string_literal36_tree=null;
        Object Variable37_tree=null;
        Object string_literal38_tree=null;
        Object string_literal40_tree=null;
        Object string_literal42_tree=null;
        Object Node_ForEach43_tree=null;
        Object string_literal46_tree=null;
        Object string_literal48_tree=null;
        Object string_literal50_tree=null;
        Object string_literal51_tree=null;
        Object string_literal53_tree=null;
        Object string_literal55_tree=null;
        Object string_literal56_tree=null;
        Object WS57_tree=null;
        Object string_literal59_tree=null;
        Object string_literal61_tree=null;
        Object WS62_tree=null;
        Object string_literal63_tree=null;
        Object WS65_tree=null;
        Object string_literal66_tree=null;
        Object Node_If67_tree=null;
        Object string_literal70_tree=null;
        Object string_literal72_tree=null;
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");
        RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");
        RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");
        try {
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:70:2: ( 'foreach' Variable 'in' expression 'do' commands 'od' ^( Node_ForEach expression commands ) | 'for' expression 'do' commands 'od' -> ^( Node_For expression commands ) | 'while' expression 'do' commands 'od' -> ^( Node_While expression commands ) | 'if' ( WS )* expression 'then' commands 'od' ( ( WS )* 'else' commands )? ( WS )* 'fi' ^( Node_If expression commands ) | 'nop' | vars ':=' exprs -> ^( Node_Affectation vars exprs ) )
            int alt18=6;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt18=1;
                }
                break;
            case 37:
                {
                alt18=2;
                }
                break;
            case 38:
                {
                alt18=3;
                }
                break;
            case 39:
                {
                alt18=4;
                }
                break;
            case 43:
                {
                alt18=5;
                }
                break;
            case Variable:
                {
                alt18=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:70:4: 'foreach' Variable 'in' expression 'do' commands 'od' ^( Node_ForEach expression commands )
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal36=(Token)match(input,33,FOLLOW_33_in_command494); 
                    string_literal36_tree = (Object)adaptor.create(string_literal36);
                    adaptor.addChild(root_0, string_literal36_tree);

                    Variable37=(Token)match(input,Variable,FOLLOW_Variable_in_command496); 
                    Variable37_tree = (Object)adaptor.create(Variable37);
                    adaptor.addChild(root_0, Variable37_tree);

                    string_literal38=(Token)match(input,34,FOLLOW_34_in_command498); 
                    string_literal38_tree = (Object)adaptor.create(string_literal38);
                    adaptor.addChild(root_0, string_literal38_tree);

                    pushFollow(FOLLOW_expression_in_command500);
                    expression39=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression39.getTree());
                    string_literal40=(Token)match(input,35,FOLLOW_35_in_command502); 
                    string_literal40_tree = (Object)adaptor.create(string_literal40);
                    adaptor.addChild(root_0, string_literal40_tree);

                    pushFollow(FOLLOW_commands_in_command504);
                    commands41=commands();

                    state._fsp--;

                    adaptor.addChild(root_0, commands41.getTree());
                    string_literal42=(Token)match(input,36,FOLLOW_36_in_command506); 
                    string_literal42_tree = (Object)adaptor.create(string_literal42);
                    adaptor.addChild(root_0, string_literal42_tree);

                    Node_ForEach43=(Token)match(input,Node_ForEach,FOLLOW_Node_ForEach_in_command509); 
                    Node_ForEach43_tree = (Object)adaptor.create(Node_ForEach43);
                    root_0 = (Object)adaptor.becomeRoot(Node_ForEach43_tree, root_0);


                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_command511);
                    expression44=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression44.getTree());
                    pushFollow(FOLLOW_commands_in_command513);
                    commands45=commands();

                    state._fsp--;

                    adaptor.addChild(root_0, commands45.getTree());

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:71:5: 'for' expression 'do' commands 'od'
                    {
                    string_literal46=(Token)match(input,37,FOLLOW_37_in_command520);  
                    stream_37.add(string_literal46);

                    pushFollow(FOLLOW_expression_in_command522);
                    expression47=expression();

                    state._fsp--;

                    stream_expression.add(expression47.getTree());
                    string_literal48=(Token)match(input,35,FOLLOW_35_in_command524);  
                    stream_35.add(string_literal48);

                    pushFollow(FOLLOW_commands_in_command526);
                    commands49=commands();

                    state._fsp--;

                    stream_commands.add(commands49.getTree());
                    string_literal50=(Token)match(input,36,FOLLOW_36_in_command528);  
                    stream_36.add(string_literal50);



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
                    // 71:41: -> ^( Node_For expression commands )
                    {
                        // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:71:44: ^( Node_For expression commands )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(Node_For, "Node_For"), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        adaptor.addChild(root_1, stream_commands.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:72:5: 'while' expression 'do' commands 'od'
                    {
                    string_literal51=(Token)match(input,38,FOLLOW_38_in_command544);  
                    stream_38.add(string_literal51);

                    pushFollow(FOLLOW_expression_in_command546);
                    expression52=expression();

                    state._fsp--;

                    stream_expression.add(expression52.getTree());
                    string_literal53=(Token)match(input,35,FOLLOW_35_in_command548);  
                    stream_35.add(string_literal53);

                    pushFollow(FOLLOW_commands_in_command550);
                    commands54=commands();

                    state._fsp--;

                    stream_commands.add(commands54.getTree());
                    string_literal55=(Token)match(input,36,FOLLOW_36_in_command552);  
                    stream_36.add(string_literal55);



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
                    // 72:43: -> ^( Node_While expression commands )
                    {
                        // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:72:46: ^( Node_While expression commands )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(Node_While, "Node_While"), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        adaptor.addChild(root_1, stream_commands.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:73:5: 'if' ( WS )* expression 'then' commands 'od' ( ( WS )* 'else' commands )? ( WS )* 'fi' ^( Node_If expression commands )
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal56=(Token)match(input,39,FOLLOW_39_in_command568); 
                    string_literal56_tree = (Object)adaptor.create(string_literal56);
                    adaptor.addChild(root_0, string_literal56_tree);

                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:73:10: ( WS )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==WS) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:73:10: WS
                    	    {
                    	    WS57=(Token)match(input,WS,FOLLOW_WS_in_command570); 
                    	    WS57_tree = (Object)adaptor.create(WS57);
                    	    adaptor.addChild(root_0, WS57_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    pushFollow(FOLLOW_expression_in_command573);
                    expression58=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression58.getTree());
                    string_literal59=(Token)match(input,40,FOLLOW_40_in_command575); 
                    string_literal59_tree = (Object)adaptor.create(string_literal59);
                    adaptor.addChild(root_0, string_literal59_tree);

                    pushFollow(FOLLOW_commands_in_command578);
                    commands60=commands();

                    state._fsp--;

                    adaptor.addChild(root_0, commands60.getTree());
                    string_literal61=(Token)match(input,36,FOLLOW_36_in_command580); 
                    string_literal61_tree = (Object)adaptor.create(string_literal61);
                    adaptor.addChild(root_0, string_literal61_tree);

                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:73:47: ( ( WS )* 'else' commands )?
                    int alt16=2;
                    alt16 = dfa16.predict(input);
                    switch (alt16) {
                        case 1 :
                            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:73:48: ( WS )* 'else' commands
                            {
                            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:73:48: ( WS )*
                            loop15:
                            do {
                                int alt15=2;
                                int LA15_0 = input.LA(1);

                                if ( (LA15_0==WS) ) {
                                    alt15=1;
                                }


                                switch (alt15) {
                            	case 1 :
                            	    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:73:48: WS
                            	    {
                            	    WS62=(Token)match(input,WS,FOLLOW_WS_in_command583); 
                            	    WS62_tree = (Object)adaptor.create(WS62);
                            	    adaptor.addChild(root_0, WS62_tree);


                            	    }
                            	    break;

                            	default :
                            	    break loop15;
                                }
                            } while (true);

                            string_literal63=(Token)match(input,41,FOLLOW_41_in_command585); 
                            string_literal63_tree = (Object)adaptor.create(string_literal63);
                            adaptor.addChild(root_0, string_literal63_tree);

                            pushFollow(FOLLOW_commands_in_command587);
                            commands64=commands();

                            state._fsp--;

                            adaptor.addChild(root_0, commands64.getTree());

                            }
                            break;

                    }

                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:73:69: ( WS )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==WS) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:73:69: WS
                    	    {
                    	    WS65=(Token)match(input,WS,FOLLOW_WS_in_command591); 
                    	    WS65_tree = (Object)adaptor.create(WS65);
                    	    adaptor.addChild(root_0, WS65_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    string_literal66=(Token)match(input,42,FOLLOW_42_in_command594); 
                    string_literal66_tree = (Object)adaptor.create(string_literal66);
                    adaptor.addChild(root_0, string_literal66_tree);

                    Node_If67=(Token)match(input,Node_If,FOLLOW_Node_If_in_command597); 
                    Node_If67_tree = (Object)adaptor.create(Node_If67);
                    root_0 = (Object)adaptor.becomeRoot(Node_If67_tree, root_0);


                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_command599);
                    expression68=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression68.getTree());
                    pushFollow(FOLLOW_commands_in_command601);
                    commands69=commands();

                    state._fsp--;

                    adaptor.addChild(root_0, commands69.getTree());

                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:74:5: 'nop'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal70=(Token)match(input,43,FOLLOW_43_in_command608); 
                    string_literal70_tree = (Object)adaptor.create(string_literal70);
                    adaptor.addChild(root_0, string_literal70_tree);


                    }
                    break;
                case 6 :
                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:75:5: vars ':=' exprs
                    {
                    pushFollow(FOLLOW_vars_in_command614);
                    vars71=vars();

                    state._fsp--;

                    stream_vars.add(vars71.getTree());
                    string_literal72=(Token)match(input,44,FOLLOW_44_in_command616);  
                    stream_44.add(string_literal72);

                    pushFollow(FOLLOW_exprs_in_command618);
                    exprs73=exprs();

                    state._fsp--;

                    stream_exprs.add(exprs73.getTree());


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
                    // 75:21: -> ^( Node_Affectation vars exprs )
                    {
                        // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:75:24: ^( Node_Affectation vars exprs )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(Node_Affectation, "Node_Affectation"), root_1);

                        adaptor.addChild(root_1, stream_vars.nextTree());
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
        return retval;
    }
    // $ANTLR end "command"

    public static class exprBase_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprBase"
    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:77:1: exprBase : ( '(' Symbol lExpr ')' | '(' 'hd' exprBase ')' -> ^( Node_Head exprBase ) | '(' 'tl' exprBase ')' -> ^( Node_Tail exprBase ) | '(' 'cons' lExpr ')' -> ^( Node_Cons lExpr ) | '(' 'list' lExpr ')' -> ^( Node_List lExpr ) | 'nil' | Variable | Symbol );
    public final whileParser.exprBase_return exprBase() throws RecognitionException {
        whileParser.exprBase_return retval = new whileParser.exprBase_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal74=null;
        Token Symbol75=null;
        Token char_literal77=null;
        Token char_literal78=null;
        Token string_literal79=null;
        Token char_literal81=null;
        Token char_literal82=null;
        Token string_literal83=null;
        Token char_literal85=null;
        Token char_literal86=null;
        Token string_literal87=null;
        Token char_literal89=null;
        Token char_literal90=null;
        Token string_literal91=null;
        Token char_literal93=null;
        Token string_literal94=null;
        Token Variable95=null;
        Token Symbol96=null;
        whileParser.lExpr_return lExpr76 = null;

        whileParser.exprBase_return exprBase80 = null;

        whileParser.exprBase_return exprBase84 = null;

        whileParser.lExpr_return lExpr88 = null;

        whileParser.lExpr_return lExpr92 = null;


        Object char_literal74_tree=null;
        Object Symbol75_tree=null;
        Object char_literal77_tree=null;
        Object char_literal78_tree=null;
        Object string_literal79_tree=null;
        Object char_literal81_tree=null;
        Object char_literal82_tree=null;
        Object string_literal83_tree=null;
        Object char_literal85_tree=null;
        Object char_literal86_tree=null;
        Object string_literal87_tree=null;
        Object char_literal89_tree=null;
        Object char_literal90_tree=null;
        Object string_literal91_tree=null;
        Object char_literal93_tree=null;
        Object string_literal94_tree=null;
        Object Variable95_tree=null;
        Object Symbol96_tree=null;
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");
        RewriteRuleSubtreeStream stream_lExpr=new RewriteRuleSubtreeStream(adaptor,"rule lExpr");
        try {
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:78:3: ( '(' Symbol lExpr ')' | '(' 'hd' exprBase ')' -> ^( Node_Head exprBase ) | '(' 'tl' exprBase ')' -> ^( Node_Tail exprBase ) | '(' 'cons' lExpr ')' -> ^( Node_Cons lExpr ) | '(' 'list' lExpr ')' -> ^( Node_List lExpr ) | 'nil' | Variable | Symbol )
            int alt19=8;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:78:5: '(' Symbol lExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal74=(Token)match(input,45,FOLLOW_45_in_exprBase648); 
                    char_literal74_tree = (Object)adaptor.create(char_literal74);
                    adaptor.addChild(root_0, char_literal74_tree);

                    Symbol75=(Token)match(input,Symbol,FOLLOW_Symbol_in_exprBase650); 
                    Symbol75_tree = (Object)adaptor.create(Symbol75);
                    adaptor.addChild(root_0, Symbol75_tree);

                    pushFollow(FOLLOW_lExpr_in_exprBase652);
                    lExpr76=lExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, lExpr76.getTree());
                    char_literal77=(Token)match(input,46,FOLLOW_46_in_exprBase654); 
                    char_literal77_tree = (Object)adaptor.create(char_literal77);
                    adaptor.addChild(root_0, char_literal77_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:79:5: '(' 'hd' exprBase ')'
                    {
                    char_literal78=(Token)match(input,45,FOLLOW_45_in_exprBase660);  
                    stream_45.add(char_literal78);

                    string_literal79=(Token)match(input,47,FOLLOW_47_in_exprBase662);  
                    stream_47.add(string_literal79);

                    pushFollow(FOLLOW_exprBase_in_exprBase664);
                    exprBase80=exprBase();

                    state._fsp--;

                    stream_exprBase.add(exprBase80.getTree());
                    char_literal81=(Token)match(input,46,FOLLOW_46_in_exprBase666);  
                    stream_46.add(char_literal81);



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
                    // 79:27: -> ^( Node_Head exprBase )
                    {
                        // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:79:31: ^( Node_Head exprBase )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(Node_Head, "Node_Head"), root_1);

                        adaptor.addChild(root_1, stream_exprBase.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:80:5: '(' 'tl' exprBase ')'
                    {
                    char_literal82=(Token)match(input,45,FOLLOW_45_in_exprBase681);  
                    stream_45.add(char_literal82);

                    string_literal83=(Token)match(input,48,FOLLOW_48_in_exprBase683);  
                    stream_48.add(string_literal83);

                    pushFollow(FOLLOW_exprBase_in_exprBase685);
                    exprBase84=exprBase();

                    state._fsp--;

                    stream_exprBase.add(exprBase84.getTree());
                    char_literal85=(Token)match(input,46,FOLLOW_46_in_exprBase687);  
                    stream_46.add(char_literal85);



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
                    // 80:27: -> ^( Node_Tail exprBase )
                    {
                        // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:80:30: ^( Node_Tail exprBase )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(Node_Tail, "Node_Tail"), root_1);

                        adaptor.addChild(root_1, stream_exprBase.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:81:5: '(' 'cons' lExpr ')'
                    {
                    char_literal86=(Token)match(input,45,FOLLOW_45_in_exprBase701);  
                    stream_45.add(char_literal86);

                    string_literal87=(Token)match(input,49,FOLLOW_49_in_exprBase703);  
                    stream_49.add(string_literal87);

                    pushFollow(FOLLOW_lExpr_in_exprBase705);
                    lExpr88=lExpr();

                    state._fsp--;

                    stream_lExpr.add(lExpr88.getTree());
                    char_literal89=(Token)match(input,46,FOLLOW_46_in_exprBase707);  
                    stream_46.add(char_literal89);



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
                    // 81:26: -> ^( Node_Cons lExpr )
                    {
                        // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:81:29: ^( Node_Cons lExpr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(Node_Cons, "Node_Cons"), root_1);

                        adaptor.addChild(root_1, stream_lExpr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:82:5: '(' 'list' lExpr ')'
                    {
                    char_literal90=(Token)match(input,45,FOLLOW_45_in_exprBase721);  
                    stream_45.add(char_literal90);

                    string_literal91=(Token)match(input,50,FOLLOW_50_in_exprBase723);  
                    stream_50.add(string_literal91);

                    pushFollow(FOLLOW_lExpr_in_exprBase725);
                    lExpr92=lExpr();

                    state._fsp--;

                    stream_lExpr.add(lExpr92.getTree());
                    char_literal93=(Token)match(input,46,FOLLOW_46_in_exprBase727);  
                    stream_46.add(char_literal93);



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
                    // 82:26: -> ^( Node_List lExpr )
                    {
                        // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:82:29: ^( Node_List lExpr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(Node_List, "Node_List"), root_1);

                        adaptor.addChild(root_1, stream_lExpr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:83:5: 'nil'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal94=(Token)match(input,51,FOLLOW_51_in_exprBase741); 
                    string_literal94_tree = (Object)adaptor.create(string_literal94);
                    adaptor.addChild(root_0, string_literal94_tree);


                    }
                    break;
                case 7 :
                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:84:5: Variable
                    {
                    root_0 = (Object)adaptor.nil();

                    Variable95=(Token)match(input,Variable,FOLLOW_Variable_in_exprBase748); 
                    Variable95_tree = (Object)adaptor.create(Variable95);
                    adaptor.addChild(root_0, Variable95_tree);


                    }
                    break;
                case 8 :
                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:85:5: Symbol
                    {
                    root_0 = (Object)adaptor.nil();

                    Symbol96=(Token)match(input,Symbol,FOLLOW_Symbol_in_exprBase754); 
                    Symbol96_tree = (Object)adaptor.create(Symbol96);
                    adaptor.addChild(root_0, Symbol96_tree);


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
        return retval;
    }
    // $ANTLR end "exprBase"

    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:86:1: expression : exprBase ( '=?' exprBase )? ;
    public final whileParser.expression_return expression() throws RecognitionException {
        whileParser.expression_return retval = new whileParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal98=null;
        whileParser.exprBase_return exprBase97 = null;

        whileParser.exprBase_return exprBase99 = null;


        Object string_literal98_tree=null;

        try {
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:87:2: ( exprBase ( '=?' exprBase )? )
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:87:4: exprBase ( '=?' exprBase )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_exprBase_in_expression762);
            exprBase97=exprBase();

            state._fsp--;

            adaptor.addChild(root_0, exprBase97.getTree());
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:87:13: ( '=?' exprBase )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==52) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:87:14: '=?' exprBase
                    {
                    string_literal98=(Token)match(input,52,FOLLOW_52_in_expression765); 
                    string_literal98_tree = (Object)adaptor.create(string_literal98);
                    adaptor.addChild(root_0, string_literal98_tree);

                    pushFollow(FOLLOW_exprBase_in_expression767);
                    exprBase99=exprBase();

                    state._fsp--;

                    adaptor.addChild(root_0, exprBase99.getTree());

                    }
                    break;

            }


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
        return retval;
    }
    // $ANTLR end "expression"

    public static class lExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lExpr"
    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:88:1: lExpr : ( exprBase lExpr )? ;
    public final whileParser.lExpr_return lExpr() throws RecognitionException {
        whileParser.lExpr_return retval = new whileParser.lExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        whileParser.exprBase_return exprBase100 = null;

        whileParser.lExpr_return lExpr101 = null;



        try {
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:89:2: ( ( exprBase lExpr )? )
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:89:4: ( exprBase lExpr )?
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:89:4: ( exprBase lExpr )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=Variable && LA21_0<=Symbol)||LA21_0==45||LA21_0==51) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:89:5: exprBase lExpr
                    {
                    pushFollow(FOLLOW_exprBase_in_lExpr780);
                    exprBase100=exprBase();

                    state._fsp--;

                    adaptor.addChild(root_0, exprBase100.getTree());
                    pushFollow(FOLLOW_lExpr_in_lExpr782);
                    lExpr101=lExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, lExpr101.getTree());

                    }
                    break;

            }


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
        return retval;
    }
    // $ANTLR end "lExpr"

    // Delegated rules


    protected DFA16 dfa16 = new DFA16(this);
    protected DFA19 dfa19 = new DFA19(this);
    static final String DFA16_eotS =
        "\4\uffff";
    static final String DFA16_eofS =
        "\4\uffff";
    static final String DFA16_minS =
        "\2\31\2\uffff";
    static final String DFA16_maxS =
        "\2\52\2\uffff";
    static final String DFA16_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA16_specialS =
        "\4\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\1\17\uffff\1\2\1\3",
            "\1\1\17\uffff\1\2\1\3",
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
            return "73:47: ( ( WS )* 'else' commands )?";
        }
    }
    static final String DFA19_eotS =
        "\12\uffff";
    static final String DFA19_eofS =
        "\12\uffff";
    static final String DFA19_minS =
        "\1\27\1\30\10\uffff";
    static final String DFA19_maxS =
        "\1\63\1\62\10\uffff";
    static final String DFA19_acceptS =
        "\2\uffff\1\6\1\7\1\10\1\1\1\2\1\3\1\4\1\5";
    static final String DFA19_specialS =
        "\12\uffff}>";
    static final String[] DFA19_transitionS = {
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

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "77:1: exprBase : ( '(' Symbol lExpr ')' | '(' 'hd' exprBase ')' -> ^( Node_Head exprBase ) | '(' 'tl' exprBase ')' -> ^( Node_Tail exprBase ) | '(' 'cons' lExpr ')' -> ^( Node_Cons lExpr ) | '(' 'list' lExpr ')' -> ^( Node_List lExpr ) | 'nil' | Variable | Symbol );";
        }
    }
 

    public static final BitSet FOLLOW_function_in_program252 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_program_in_program254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_function265 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_Symbol_in_function267 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_function269 = new BitSet(new long[]{0x0000000012000000L});
    public static final BitSet FOLLOW_WS_in_function271 = new BitSet(new long[]{0x0000000012000000L});
    public static final BitSet FOLLOW_definition_in_function274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_definition299 = new BitSet(new long[]{0x0000000022800000L});
    public static final BitSet FOLLOW_input_in_definition301 = new BitSet(new long[]{0x0000000022000000L});
    public static final BitSet FOLLOW_WS_in_definition303 = new BitSet(new long[]{0x0000000022000000L});
    public static final BitSet FOLLOW_29_in_definition306 = new BitSet(new long[]{0x000008E202800000L});
    public static final BitSet FOLLOW_commands_in_definition308 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_definition310 = new BitSet(new long[]{0x0000000042000000L});
    public static final BitSet FOLLOW_WS_in_definition312 = new BitSet(new long[]{0x0000000042000000L});
    public static final BitSet FOLLOW_30_in_definition315 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_output_in_definition317 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_WS_in_definition319 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_inputSub_in_input340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Variable_in_inputSub358 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_inputSub361 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_Variable_in_inputSub363 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_Variable_in_output380 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_output383 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_Variable_in_output385 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_Variable_in_vars406 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_vars409 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_Variable_in_vars411 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_expression_in_exprs431 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_exprs434 = new BitSet(new long[]{0x0008200001800000L});
    public static final BitSet FOLLOW_expression_in_exprs436 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_WS_in_commands457 = new BitSet(new long[]{0x000008E202800000L});
    public static final BitSet FOLLOW_command_in_commands460 = new BitSet(new long[]{0x0000000102000002L});
    public static final BitSet FOLLOW_32_in_commands463 = new BitSet(new long[]{0x000008E202800000L});
    public static final BitSet FOLLOW_command_in_commands465 = new BitSet(new long[]{0x0000000102000002L});
    public static final BitSet FOLLOW_WS_in_commands469 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_33_in_command494 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_Variable_in_command496 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_command498 = new BitSet(new long[]{0x0008200001800000L});
    public static final BitSet FOLLOW_expression_in_command500 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_command502 = new BitSet(new long[]{0x000008E202800000L});
    public static final BitSet FOLLOW_commands_in_command504 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_command506 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_Node_ForEach_in_command509 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_command511 = new BitSet(new long[]{0x000008E202800000L});
    public static final BitSet FOLLOW_commands_in_command513 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_37_in_command520 = new BitSet(new long[]{0x0008200001800000L});
    public static final BitSet FOLLOW_expression_in_command522 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_command524 = new BitSet(new long[]{0x000008E202800000L});
    public static final BitSet FOLLOW_commands_in_command526 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_command528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_command544 = new BitSet(new long[]{0x0008200001800000L});
    public static final BitSet FOLLOW_expression_in_command546 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_command548 = new BitSet(new long[]{0x000008E202800000L});
    public static final BitSet FOLLOW_commands_in_command550 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_command552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_command568 = new BitSet(new long[]{0x0008200003800000L});
    public static final BitSet FOLLOW_WS_in_command570 = new BitSet(new long[]{0x0008200003800000L});
    public static final BitSet FOLLOW_expression_in_command573 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_command575 = new BitSet(new long[]{0x000008E202800000L});
    public static final BitSet FOLLOW_commands_in_command578 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_command580 = new BitSet(new long[]{0x0000060002000000L});
    public static final BitSet FOLLOW_WS_in_command583 = new BitSet(new long[]{0x0000020002000000L});
    public static final BitSet FOLLOW_41_in_command585 = new BitSet(new long[]{0x000008E202800000L});
    public static final BitSet FOLLOW_commands_in_command587 = new BitSet(new long[]{0x0000040002000000L});
    public static final BitSet FOLLOW_WS_in_command591 = new BitSet(new long[]{0x0000040002000000L});
    public static final BitSet FOLLOW_42_in_command594 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_Node_If_in_command597 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_command599 = new BitSet(new long[]{0x000008E202800000L});
    public static final BitSet FOLLOW_commands_in_command601 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_43_in_command608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vars_in_command614 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_command616 = new BitSet(new long[]{0x0008200001800000L});
    public static final BitSet FOLLOW_exprs_in_command618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_exprBase648 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_Symbol_in_exprBase650 = new BitSet(new long[]{0x0008600001800000L});
    public static final BitSet FOLLOW_lExpr_in_exprBase652 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_exprBase654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_exprBase660 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_exprBase662 = new BitSet(new long[]{0x0008200001800000L});
    public static final BitSet FOLLOW_exprBase_in_exprBase664 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_exprBase666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_exprBase681 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_exprBase683 = new BitSet(new long[]{0x0008200001800000L});
    public static final BitSet FOLLOW_exprBase_in_exprBase685 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_exprBase687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_exprBase701 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_exprBase703 = new BitSet(new long[]{0x0008600001800000L});
    public static final BitSet FOLLOW_lExpr_in_exprBase705 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_exprBase707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_exprBase721 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_exprBase723 = new BitSet(new long[]{0x0008600001800000L});
    public static final BitSet FOLLOW_lExpr_in_exprBase725 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_exprBase727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_exprBase741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Variable_in_exprBase748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Symbol_in_exprBase754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprBase_in_expression762 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_expression765 = new BitSet(new long[]{0x0008200001800000L});
    public static final BitSet FOLLOW_exprBase_in_expression767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprBase_in_lExpr780 = new BitSet(new long[]{0x0008200001800000L});
    public static final BitSet FOLLOW_lExpr_in_lExpr782 = new BitSet(new long[]{0x0000000000000002L});

}