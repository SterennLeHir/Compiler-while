// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g 2023-11-27 15:02:24

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class whileParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Node_Commands", "Node_Exprlist", "Node_Output", "Node_Input", "Node_ForEach", "Node_For", "Node_While", "Node_If", "Node_Affectation", "Maj", "Min", "Dec", "Variable", "Symbol", "WS", "'function'", "':'", "'read'", "'%'", "'write'", "','", "';'", "'foreach'", "'in'", "'do'", "'od'", "'for'", "'while'", "'if'", "'then'", "'else'", "'fi'", "'nop'", "':='", "'('", "')'", "'hd'", "'tl'", "'cons'", "'list'", "'nil'", "'=?'"
    };
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
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
    public static final int Node_Commands=4;
    public static final int Node_Exprlist=5;
    public static final int Node_Output=6;
    public static final int Node_Input=7;
    public static final int Node_ForEach=8;
    public static final int Node_For=9;
    public static final int Node_While=10;
    public static final int Node_If=11;
    public static final int Node_Affectation=12;
    public static final int Maj=13;
    public static final int Min=14;
    public static final int Dec=15;
    public static final int Variable=16;
    public static final int Symbol=17;
    public static final int WS=18;

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
    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:43:1: program : function ( program )? ;
    public final whileParser.program_return program() throws RecognitionException {
        whileParser.program_return retval = new whileParser.program_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        whileParser.function_return function1 = null;

        whileParser.program_return program2 = null;



        try {
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:44:2: ( function ( program )? )
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:44:4: function ( program )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_function_in_program230);
            function1=function();

            state._fsp--;

            adaptor.addChild(root_0, function1.getTree());
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:44:13: ( program )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==19) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:44:13: program
                    {
                    pushFollow(FOLLOW_program_in_program232);
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
    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:45:1: function : 'function' Symbol ':' ( WS )* definition -> ^( 'function' Symbol ':' definition ) ;
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
        RewriteRuleTokenStream stream_19=new RewriteRuleTokenStream(adaptor,"token 19");
        RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
        RewriteRuleTokenStream stream_20=new RewriteRuleTokenStream(adaptor,"token 20");
        RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"rule definition");
        try {
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:46:2: ( 'function' Symbol ':' ( WS )* definition -> ^( 'function' Symbol ':' definition ) )
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:46:4: 'function' Symbol ':' ( WS )* definition
            {
            string_literal3=(Token)match(input,19,FOLLOW_19_in_function243);  
            stream_19.add(string_literal3);

            Symbol4=(Token)match(input,Symbol,FOLLOW_Symbol_in_function245);  
            stream_Symbol.add(Symbol4);

            char_literal5=(Token)match(input,20,FOLLOW_20_in_function247);  
            stream_20.add(char_literal5);

            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:46:26: ( WS )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==WS) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:46:26: WS
            	    {
            	    WS6=(Token)match(input,WS,FOLLOW_WS_in_function249);  
            	    stream_WS.add(WS6);


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            pushFollow(FOLLOW_definition_in_function252);
            definition7=definition();

            state._fsp--;

            stream_definition.add(definition7.getTree());


            // AST REWRITE
            // elements: 19, Symbol, definition, 20
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 46:42: -> ^( 'function' Symbol ':' definition )
            {
                // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:46:45: ^( 'function' Symbol ':' definition )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_19.nextNode(), root_1);

                adaptor.addChild(root_1, stream_Symbol.nextNode());
                adaptor.addChild(root_1, stream_20.nextNode());
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
    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:48:1: definition : 'read' input ( WS )* '%' commands '%' ( WS )* 'write' output ( WS )* -> ^( 'read' input commands 'write' output ) ;
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
        RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
        RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
        RewriteRuleTokenStream stream_21=new RewriteRuleTokenStream(adaptor,"token 21");
        RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");
        RewriteRuleSubtreeStream stream_input=new RewriteRuleSubtreeStream(adaptor,"rule input");
        RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");
        try {
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:49:2: ( 'read' input ( WS )* '%' commands '%' ( WS )* 'write' output ( WS )* -> ^( 'read' input commands 'write' output ) )
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:49:4: 'read' input ( WS )* '%' commands '%' ( WS )* 'write' output ( WS )*
            {
            string_literal8=(Token)match(input,21,FOLLOW_21_in_definition277);  
            stream_21.add(string_literal8);

            pushFollow(FOLLOW_input_in_definition279);
            input9=input();

            state._fsp--;

            stream_input.add(input9.getTree());
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:49:17: ( WS )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==WS) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:49:17: WS
            	    {
            	    WS10=(Token)match(input,WS,FOLLOW_WS_in_definition281);  
            	    stream_WS.add(WS10);


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            char_literal11=(Token)match(input,22,FOLLOW_22_in_definition284);  
            stream_22.add(char_literal11);

            pushFollow(FOLLOW_commands_in_definition286);
            commands12=commands();

            state._fsp--;

            stream_commands.add(commands12.getTree());
            char_literal13=(Token)match(input,22,FOLLOW_22_in_definition288);  
            stream_22.add(char_literal13);

            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:49:38: ( WS )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==WS) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:49:38: WS
            	    {
            	    WS14=(Token)match(input,WS,FOLLOW_WS_in_definition290);  
            	    stream_WS.add(WS14);


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            string_literal15=(Token)match(input,23,FOLLOW_23_in_definition293);  
            stream_23.add(string_literal15);

            pushFollow(FOLLOW_output_in_definition295);
            output16=output();

            state._fsp--;

            stream_output.add(output16.getTree());
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:49:57: ( WS )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==WS) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:49:57: WS
            	    {
            	    WS17=(Token)match(input,WS,FOLLOW_WS_in_definition297);  
            	    stream_WS.add(WS17);


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);



            // AST REWRITE
            // elements: 23, input, output, 21, commands
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 49:61: -> ^( 'read' input commands 'write' output )
            {
                // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:49:64: ^( 'read' input commands 'write' output )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_21.nextNode(), root_1);

                adaptor.addChild(root_1, stream_input.nextTree());
                adaptor.addChild(root_1, stream_commands.nextTree());
                adaptor.addChild(root_1, stream_23.nextNode());
                adaptor.addChild(root_1, stream_output.nextTree());

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
    // $ANTLR end "definition"

    public static class input_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "input"
    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:50:1: input : ( inputSub )? -> ^( Node_Input ( inputSub )? ) ;
    public final whileParser.input_return input() throws RecognitionException {
        whileParser.input_return retval = new whileParser.input_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        whileParser.inputSub_return inputSub18 = null;


        RewriteRuleSubtreeStream stream_inputSub=new RewriteRuleSubtreeStream(adaptor,"rule inputSub");
        try {
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:51:2: ( ( inputSub )? -> ^( Node_Input ( inputSub )? ) )
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:51:5: ( inputSub )?
            {
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:51:5: ( inputSub )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Variable) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:51:5: inputSub
                    {
                    pushFollow(FOLLOW_inputSub_in_input323);
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
            // 51:15: -> ^( Node_Input ( inputSub )? )
            {
                // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:51:17: ^( Node_Input ( inputSub )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(Node_Input, "Node_Input"), root_1);

                // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:51:30: ( inputSub )?
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
    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:52:1: inputSub : Variable ( ',' Variable )* -> ( Variable )+ ;
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
        RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
        RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");

        try {
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:53:2: ( Variable ( ',' Variable )* -> ( Variable )+ )
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:53:4: Variable ( ',' Variable )*
            {
            Variable19=(Token)match(input,Variable,FOLLOW_Variable_in_inputSub341);  
            stream_Variable.add(Variable19);

            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:53:13: ( ',' Variable )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==24) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:53:14: ',' Variable
            	    {
            	    char_literal20=(Token)match(input,24,FOLLOW_24_in_inputSub344);  
            	    stream_24.add(char_literal20);

            	    Variable21=(Token)match(input,Variable,FOLLOW_Variable_in_inputSub346);  
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
            // 53:28: -> ( Variable )+
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
    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:54:1: output : Variable ( ',' Variable )* -> ^( Node_Output ( Variable )+ ) ;
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
        RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
        RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");

        try {
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:55:2: ( Variable ( ',' Variable )* -> ^( Node_Output ( Variable )+ ) )
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:55:4: Variable ( ',' Variable )*
            {
            Variable22=(Token)match(input,Variable,FOLLOW_Variable_in_output363);  
            stream_Variable.add(Variable22);

            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:55:13: ( ',' Variable )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:55:14: ',' Variable
            	    {
            	    char_literal23=(Token)match(input,24,FOLLOW_24_in_output366);  
            	    stream_24.add(char_literal23);

            	    Variable24=(Token)match(input,Variable,FOLLOW_Variable_in_output368);  
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
            // 55:29: -> ^( Node_Output ( Variable )+ )
            {
                // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:55:32: ^( Node_Output ( Variable )+ )
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
    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:56:1: vars : Variable ( ',' Variable )* -> ( Variable )+ ;
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
        RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
        RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");

        try {
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:57:2: ( Variable ( ',' Variable )* -> ( Variable )+ )
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:57:4: Variable ( ',' Variable )*
            {
            Variable25=(Token)match(input,Variable,FOLLOW_Variable_in_vars389);  
            stream_Variable.add(Variable25);

            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:57:13: ( ',' Variable )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==24) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:57:14: ',' Variable
            	    {
            	    char_literal26=(Token)match(input,24,FOLLOW_24_in_vars392);  
            	    stream_24.add(char_literal26);

            	    Variable27=(Token)match(input,Variable,FOLLOW_Variable_in_vars394);  
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
            // 57:29: -> ( Variable )+
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
    // $ANTLR end "vars"

    public static class exprs_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprs"
    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:58:1: exprs : expression ( ',' expression )* -> ( expression )+ ;
    public final whileParser.exprs_return exprs() throws RecognitionException {
        whileParser.exprs_return retval = new whileParser.exprs_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal29=null;
        whileParser.expression_return expression28 = null;

        whileParser.expression_return expression30 = null;


        Object char_literal29_tree=null;
        RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:59:2: ( expression ( ',' expression )* -> ( expression )+ )
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:59:4: expression ( ',' expression )*
            {
            pushFollow(FOLLOW_expression_in_exprs410);
            expression28=expression();

            state._fsp--;

            stream_expression.add(expression28.getTree());
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:59:15: ( ',' expression )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==24) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:59:16: ',' expression
            	    {
            	    char_literal29=(Token)match(input,24,FOLLOW_24_in_exprs413);  
            	    stream_24.add(char_literal29);

            	    pushFollow(FOLLOW_expression_in_exprs415);
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
            // 59:33: -> ( expression )+
            {
                if ( !(stream_expression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_0, stream_expression.nextTree());

                }
                stream_expression.reset();

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
    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:60:1: commands : ( WS )* command ( ';' command )* ( WS )* -> ^( Node_Commands ( command )+ ) ;
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
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
        RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
        RewriteRuleSubtreeStream stream_command=new RewriteRuleSubtreeStream(adaptor,"rule command");
        try {
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:61:2: ( ( WS )* command ( ';' command )* ( WS )* -> ^( Node_Commands ( command )+ ) )
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:61:4: ( WS )* command ( ';' command )* ( WS )*
            {
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:61:4: ( WS )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==WS) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:61:4: WS
            	    {
            	    WS31=(Token)match(input,WS,FOLLOW_WS_in_commands432);  
            	    stream_WS.add(WS31);


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            pushFollow(FOLLOW_command_in_commands435);
            command32=command();

            state._fsp--;

            stream_command.add(command32.getTree());
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:61:16: ( ';' command )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==25) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:61:17: ';' command
            	    {
            	    char_literal33=(Token)match(input,25,FOLLOW_25_in_commands438);  
            	    stream_25.add(char_literal33);

            	    pushFollow(FOLLOW_command_in_commands440);
            	    command34=command();

            	    state._fsp--;

            	    stream_command.add(command34.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:61:31: ( WS )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==WS) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:61:31: WS
            	    {
            	    WS35=(Token)match(input,WS,FOLLOW_WS_in_commands444);  
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
            // 61:35: -> ^( Node_Commands ( command )+ )
            {
                // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:61:38: ^( Node_Commands ( command )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(Node_Commands, "Node_Commands"), root_1);

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
    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:62:1: command : ( 'foreach' Variable 'in' expression 'do' commands 'od' ^( Node_ForEach expression commands ) | 'for' expression 'do' commands 'od' -> ^( Node_For expression commands ) | 'while' expression 'do' commands 'od' -> ^( Node_While expression commands ) | 'if' ( WS )* expression 'then' commands 'od' ( ( WS )* 'else' commands )? ( WS )* 'fi' ^( Node_If expression commands ) | 'nop' | vars ':=' exprs -> ^( Node_Affectation vars exprs ) );
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
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");
        RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");
        RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");
        try {
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:63:2: ( 'foreach' Variable 'in' expression 'do' commands 'od' ^( Node_ForEach expression commands ) | 'for' expression 'do' commands 'od' -> ^( Node_For expression commands ) | 'while' expression 'do' commands 'od' -> ^( Node_While expression commands ) | 'if' ( WS )* expression 'then' commands 'od' ( ( WS )* 'else' commands )? ( WS )* 'fi' ^( Node_If expression commands ) | 'nop' | vars ':=' exprs -> ^( Node_Affectation vars exprs ) )
            int alt18=6;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt18=1;
                }
                break;
            case 30:
                {
                alt18=2;
                }
                break;
            case 31:
                {
                alt18=3;
                }
                break;
            case 32:
                {
                alt18=4;
                }
                break;
            case 36:
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
                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:63:4: 'foreach' Variable 'in' expression 'do' commands 'od' ^( Node_ForEach expression commands )
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal36=(Token)match(input,26,FOLLOW_26_in_command469); 
                    string_literal36_tree = (Object)adaptor.create(string_literal36);
                    adaptor.addChild(root_0, string_literal36_tree);

                    Variable37=(Token)match(input,Variable,FOLLOW_Variable_in_command471); 
                    Variable37_tree = (Object)adaptor.create(Variable37);
                    adaptor.addChild(root_0, Variable37_tree);

                    string_literal38=(Token)match(input,27,FOLLOW_27_in_command473); 
                    string_literal38_tree = (Object)adaptor.create(string_literal38);
                    adaptor.addChild(root_0, string_literal38_tree);

                    pushFollow(FOLLOW_expression_in_command475);
                    expression39=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression39.getTree());
                    string_literal40=(Token)match(input,28,FOLLOW_28_in_command477); 
                    string_literal40_tree = (Object)adaptor.create(string_literal40);
                    adaptor.addChild(root_0, string_literal40_tree);

                    pushFollow(FOLLOW_commands_in_command479);
                    commands41=commands();

                    state._fsp--;

                    adaptor.addChild(root_0, commands41.getTree());
                    string_literal42=(Token)match(input,29,FOLLOW_29_in_command481); 
                    string_literal42_tree = (Object)adaptor.create(string_literal42);
                    adaptor.addChild(root_0, string_literal42_tree);

                    Node_ForEach43=(Token)match(input,Node_ForEach,FOLLOW_Node_ForEach_in_command484); 
                    Node_ForEach43_tree = (Object)adaptor.create(Node_ForEach43);
                    root_0 = (Object)adaptor.becomeRoot(Node_ForEach43_tree, root_0);


                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_command486);
                    expression44=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression44.getTree());
                    pushFollow(FOLLOW_commands_in_command488);
                    commands45=commands();

                    state._fsp--;

                    adaptor.addChild(root_0, commands45.getTree());

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:64:5: 'for' expression 'do' commands 'od'
                    {
                    string_literal46=(Token)match(input,30,FOLLOW_30_in_command495);  
                    stream_30.add(string_literal46);

                    pushFollow(FOLLOW_expression_in_command497);
                    expression47=expression();

                    state._fsp--;

                    stream_expression.add(expression47.getTree());
                    string_literal48=(Token)match(input,28,FOLLOW_28_in_command499);  
                    stream_28.add(string_literal48);

                    pushFollow(FOLLOW_commands_in_command501);
                    commands49=commands();

                    state._fsp--;

                    stream_commands.add(commands49.getTree());
                    string_literal50=(Token)match(input,29,FOLLOW_29_in_command503);  
                    stream_29.add(string_literal50);



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
                    // 64:41: -> ^( Node_For expression commands )
                    {
                        // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:64:44: ^( Node_For expression commands )
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
                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:65:5: 'while' expression 'do' commands 'od'
                    {
                    string_literal51=(Token)match(input,31,FOLLOW_31_in_command519);  
                    stream_31.add(string_literal51);

                    pushFollow(FOLLOW_expression_in_command521);
                    expression52=expression();

                    state._fsp--;

                    stream_expression.add(expression52.getTree());
                    string_literal53=(Token)match(input,28,FOLLOW_28_in_command523);  
                    stream_28.add(string_literal53);

                    pushFollow(FOLLOW_commands_in_command525);
                    commands54=commands();

                    state._fsp--;

                    stream_commands.add(commands54.getTree());
                    string_literal55=(Token)match(input,29,FOLLOW_29_in_command527);  
                    stream_29.add(string_literal55);



                    // AST REWRITE
                    // elements: commands, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 65:43: -> ^( Node_While expression commands )
                    {
                        // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:65:46: ^( Node_While expression commands )
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
                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:66:5: 'if' ( WS )* expression 'then' commands 'od' ( ( WS )* 'else' commands )? ( WS )* 'fi' ^( Node_If expression commands )
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal56=(Token)match(input,32,FOLLOW_32_in_command543); 
                    string_literal56_tree = (Object)adaptor.create(string_literal56);
                    adaptor.addChild(root_0, string_literal56_tree);

                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:66:10: ( WS )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==WS) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:66:10: WS
                    	    {
                    	    WS57=(Token)match(input,WS,FOLLOW_WS_in_command545); 
                    	    WS57_tree = (Object)adaptor.create(WS57);
                    	    adaptor.addChild(root_0, WS57_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    pushFollow(FOLLOW_expression_in_command548);
                    expression58=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression58.getTree());
                    string_literal59=(Token)match(input,33,FOLLOW_33_in_command550); 
                    string_literal59_tree = (Object)adaptor.create(string_literal59);
                    adaptor.addChild(root_0, string_literal59_tree);

                    pushFollow(FOLLOW_commands_in_command553);
                    commands60=commands();

                    state._fsp--;

                    adaptor.addChild(root_0, commands60.getTree());
                    string_literal61=(Token)match(input,29,FOLLOW_29_in_command555); 
                    string_literal61_tree = (Object)adaptor.create(string_literal61);
                    adaptor.addChild(root_0, string_literal61_tree);

                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:66:47: ( ( WS )* 'else' commands )?
                    int alt16=2;
                    alt16 = dfa16.predict(input);
                    switch (alt16) {
                        case 1 :
                            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:66:48: ( WS )* 'else' commands
                            {
                            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:66:48: ( WS )*
                            loop15:
                            do {
                                int alt15=2;
                                int LA15_0 = input.LA(1);

                                if ( (LA15_0==WS) ) {
                                    alt15=1;
                                }


                                switch (alt15) {
                            	case 1 :
                            	    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:66:48: WS
                            	    {
                            	    WS62=(Token)match(input,WS,FOLLOW_WS_in_command558); 
                            	    WS62_tree = (Object)adaptor.create(WS62);
                            	    adaptor.addChild(root_0, WS62_tree);


                            	    }
                            	    break;

                            	default :
                            	    break loop15;
                                }
                            } while (true);

                            string_literal63=(Token)match(input,34,FOLLOW_34_in_command560); 
                            string_literal63_tree = (Object)adaptor.create(string_literal63);
                            adaptor.addChild(root_0, string_literal63_tree);

                            pushFollow(FOLLOW_commands_in_command562);
                            commands64=commands();

                            state._fsp--;

                            adaptor.addChild(root_0, commands64.getTree());

                            }
                            break;

                    }

                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:66:69: ( WS )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==WS) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:66:69: WS
                    	    {
                    	    WS65=(Token)match(input,WS,FOLLOW_WS_in_command566); 
                    	    WS65_tree = (Object)adaptor.create(WS65);
                    	    adaptor.addChild(root_0, WS65_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    string_literal66=(Token)match(input,35,FOLLOW_35_in_command569); 
                    string_literal66_tree = (Object)adaptor.create(string_literal66);
                    adaptor.addChild(root_0, string_literal66_tree);

                    Node_If67=(Token)match(input,Node_If,FOLLOW_Node_If_in_command572); 
                    Node_If67_tree = (Object)adaptor.create(Node_If67);
                    root_0 = (Object)adaptor.becomeRoot(Node_If67_tree, root_0);


                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_command574);
                    expression68=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression68.getTree());
                    pushFollow(FOLLOW_commands_in_command576);
                    commands69=commands();

                    state._fsp--;

                    adaptor.addChild(root_0, commands69.getTree());

                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:67:5: 'nop'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal70=(Token)match(input,36,FOLLOW_36_in_command583); 
                    string_literal70_tree = (Object)adaptor.create(string_literal70);
                    adaptor.addChild(root_0, string_literal70_tree);


                    }
                    break;
                case 6 :
                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:68:5: vars ':=' exprs
                    {
                    pushFollow(FOLLOW_vars_in_command589);
                    vars71=vars();

                    state._fsp--;

                    stream_vars.add(vars71.getTree());
                    string_literal72=(Token)match(input,37,FOLLOW_37_in_command591);  
                    stream_37.add(string_literal72);

                    pushFollow(FOLLOW_exprs_in_command593);
                    exprs73=exprs();

                    state._fsp--;

                    stream_exprs.add(exprs73.getTree());


                    // AST REWRITE
                    // elements: exprs, vars
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 68:21: -> ^( Node_Affectation vars exprs )
                    {
                        // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:68:24: ^( Node_Affectation vars exprs )
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
    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:70:1: exprBase : ( '(' Symbol lExpr ')' | '(' 'hd' exprBase ')' | '(' 'tl' exprBase ')' | '(' 'cons' lExpr ')' | '(' 'list' lExpr ')' | 'nil' | Variable | Symbol );
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

        try {
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:71:3: ( '(' Symbol lExpr ')' | '(' 'hd' exprBase ')' | '(' 'tl' exprBase ')' | '(' 'cons' lExpr ')' | '(' 'list' lExpr ')' | 'nil' | Variable | Symbol )
            int alt19=8;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:71:5: '(' Symbol lExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal74=(Token)match(input,38,FOLLOW_38_in_exprBase623); 
                    char_literal74_tree = (Object)adaptor.create(char_literal74);
                    adaptor.addChild(root_0, char_literal74_tree);

                    Symbol75=(Token)match(input,Symbol,FOLLOW_Symbol_in_exprBase625); 
                    Symbol75_tree = (Object)adaptor.create(Symbol75);
                    adaptor.addChild(root_0, Symbol75_tree);

                    pushFollow(FOLLOW_lExpr_in_exprBase627);
                    lExpr76=lExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, lExpr76.getTree());
                    char_literal77=(Token)match(input,39,FOLLOW_39_in_exprBase629); 
                    char_literal77_tree = (Object)adaptor.create(char_literal77);
                    adaptor.addChild(root_0, char_literal77_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:72:5: '(' 'hd' exprBase ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal78=(Token)match(input,38,FOLLOW_38_in_exprBase635); 
                    char_literal78_tree = (Object)adaptor.create(char_literal78);
                    adaptor.addChild(root_0, char_literal78_tree);

                    string_literal79=(Token)match(input,40,FOLLOW_40_in_exprBase637); 
                    string_literal79_tree = (Object)adaptor.create(string_literal79);
                    adaptor.addChild(root_0, string_literal79_tree);

                    pushFollow(FOLLOW_exprBase_in_exprBase639);
                    exprBase80=exprBase();

                    state._fsp--;

                    adaptor.addChild(root_0, exprBase80.getTree());
                    char_literal81=(Token)match(input,39,FOLLOW_39_in_exprBase641); 
                    char_literal81_tree = (Object)adaptor.create(char_literal81);
                    adaptor.addChild(root_0, char_literal81_tree);


                    }
                    break;
                case 3 :
                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:73:5: '(' 'tl' exprBase ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal82=(Token)match(input,38,FOLLOW_38_in_exprBase648); 
                    char_literal82_tree = (Object)adaptor.create(char_literal82);
                    adaptor.addChild(root_0, char_literal82_tree);

                    string_literal83=(Token)match(input,41,FOLLOW_41_in_exprBase650); 
                    string_literal83_tree = (Object)adaptor.create(string_literal83);
                    adaptor.addChild(root_0, string_literal83_tree);

                    pushFollow(FOLLOW_exprBase_in_exprBase652);
                    exprBase84=exprBase();

                    state._fsp--;

                    adaptor.addChild(root_0, exprBase84.getTree());
                    char_literal85=(Token)match(input,39,FOLLOW_39_in_exprBase654); 
                    char_literal85_tree = (Object)adaptor.create(char_literal85);
                    adaptor.addChild(root_0, char_literal85_tree);


                    }
                    break;
                case 4 :
                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:74:5: '(' 'cons' lExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal86=(Token)match(input,38,FOLLOW_38_in_exprBase660); 
                    char_literal86_tree = (Object)adaptor.create(char_literal86);
                    adaptor.addChild(root_0, char_literal86_tree);

                    string_literal87=(Token)match(input,42,FOLLOW_42_in_exprBase662); 
                    string_literal87_tree = (Object)adaptor.create(string_literal87);
                    adaptor.addChild(root_0, string_literal87_tree);

                    pushFollow(FOLLOW_lExpr_in_exprBase664);
                    lExpr88=lExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, lExpr88.getTree());
                    char_literal89=(Token)match(input,39,FOLLOW_39_in_exprBase666); 
                    char_literal89_tree = (Object)adaptor.create(char_literal89);
                    adaptor.addChild(root_0, char_literal89_tree);


                    }
                    break;
                case 5 :
                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:75:5: '(' 'list' lExpr ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal90=(Token)match(input,38,FOLLOW_38_in_exprBase672); 
                    char_literal90_tree = (Object)adaptor.create(char_literal90);
                    adaptor.addChild(root_0, char_literal90_tree);

                    string_literal91=(Token)match(input,43,FOLLOW_43_in_exprBase674); 
                    string_literal91_tree = (Object)adaptor.create(string_literal91);
                    adaptor.addChild(root_0, string_literal91_tree);

                    pushFollow(FOLLOW_lExpr_in_exprBase676);
                    lExpr92=lExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, lExpr92.getTree());
                    char_literal93=(Token)match(input,39,FOLLOW_39_in_exprBase678); 
                    char_literal93_tree = (Object)adaptor.create(char_literal93);
                    adaptor.addChild(root_0, char_literal93_tree);


                    }
                    break;
                case 6 :
                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:76:5: 'nil'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal94=(Token)match(input,44,FOLLOW_44_in_exprBase684); 
                    string_literal94_tree = (Object)adaptor.create(string_literal94);
                    adaptor.addChild(root_0, string_literal94_tree);


                    }
                    break;
                case 7 :
                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:77:5: Variable
                    {
                    root_0 = (Object)adaptor.nil();

                    Variable95=(Token)match(input,Variable,FOLLOW_Variable_in_exprBase691); 
                    Variable95_tree = (Object)adaptor.create(Variable95);
                    adaptor.addChild(root_0, Variable95_tree);


                    }
                    break;
                case 8 :
                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:78:5: Symbol
                    {
                    root_0 = (Object)adaptor.nil();

                    Symbol96=(Token)match(input,Symbol,FOLLOW_Symbol_in_exprBase697); 
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
    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:79:1: expression : exprBase ( '=?' exprBase )? ;
    public final whileParser.expression_return expression() throws RecognitionException {
        whileParser.expression_return retval = new whileParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal98=null;
        whileParser.exprBase_return exprBase97 = null;

        whileParser.exprBase_return exprBase99 = null;


        Object string_literal98_tree=null;

        try {
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:80:2: ( exprBase ( '=?' exprBase )? )
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:80:4: exprBase ( '=?' exprBase )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_exprBase_in_expression705);
            exprBase97=exprBase();

            state._fsp--;

            adaptor.addChild(root_0, exprBase97.getTree());
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:80:13: ( '=?' exprBase )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==45) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:80:14: '=?' exprBase
                    {
                    string_literal98=(Token)match(input,45,FOLLOW_45_in_expression708); 
                    string_literal98_tree = (Object)adaptor.create(string_literal98);
                    adaptor.addChild(root_0, string_literal98_tree);

                    pushFollow(FOLLOW_exprBase_in_expression710);
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
    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:81:1: lExpr : ( exprBase lExpr )? ;
    public final whileParser.lExpr_return lExpr() throws RecognitionException {
        whileParser.lExpr_return retval = new whileParser.lExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        whileParser.exprBase_return exprBase100 = null;

        whileParser.lExpr_return lExpr101 = null;



        try {
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:82:2: ( ( exprBase lExpr )? )
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:82:4: ( exprBase lExpr )?
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:82:4: ( exprBase lExpr )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=Variable && LA21_0<=Symbol)||LA21_0==38||LA21_0==44) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:82:5: exprBase lExpr
                    {
                    pushFollow(FOLLOW_exprBase_in_lExpr723);
                    exprBase100=exprBase();

                    state._fsp--;

                    adaptor.addChild(root_0, exprBase100.getTree());
                    pushFollow(FOLLOW_lExpr_in_lExpr725);
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
        "\2\22\2\uffff";
    static final String DFA16_maxS =
        "\2\43\2\uffff";
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
            return "66:47: ( ( WS )* 'else' commands )?";
        }
    }
    static final String DFA19_eotS =
        "\12\uffff";
    static final String DFA19_eofS =
        "\12\uffff";
    static final String DFA19_minS =
        "\1\20\1\21\10\uffff";
    static final String DFA19_maxS =
        "\1\54\1\53\10\uffff";
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
            return "70:1: exprBase : ( '(' Symbol lExpr ')' | '(' 'hd' exprBase ')' | '(' 'tl' exprBase ')' | '(' 'cons' lExpr ')' | '(' 'list' lExpr ')' | 'nil' | Variable | Symbol );";
        }
    }
 

    public static final BitSet FOLLOW_function_in_program230 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_program_in_program232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_function243 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_Symbol_in_function245 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_function247 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_WS_in_function249 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_definition_in_function252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_definition277 = new BitSet(new long[]{0x0000000000450000L});
    public static final BitSet FOLLOW_input_in_definition279 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_WS_in_definition281 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_22_in_definition284 = new BitSet(new long[]{0x00000011C4050000L});
    public static final BitSet FOLLOW_commands_in_definition286 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_definition288 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_WS_in_definition290 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_23_in_definition293 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_output_in_definition295 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_WS_in_definition297 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_inputSub_in_input323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Variable_in_inputSub341 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_inputSub344 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_Variable_in_inputSub346 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_Variable_in_output363 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_output366 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_Variable_in_output368 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_Variable_in_vars389 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_vars392 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_Variable_in_vars394 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_expression_in_exprs410 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_exprs413 = new BitSet(new long[]{0x0000104000030000L});
    public static final BitSet FOLLOW_expression_in_exprs415 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_WS_in_commands432 = new BitSet(new long[]{0x00000011C4050000L});
    public static final BitSet FOLLOW_command_in_commands435 = new BitSet(new long[]{0x0000000002040002L});
    public static final BitSet FOLLOW_25_in_commands438 = new BitSet(new long[]{0x00000011C4050000L});
    public static final BitSet FOLLOW_command_in_commands440 = new BitSet(new long[]{0x0000000002040002L});
    public static final BitSet FOLLOW_WS_in_commands444 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_26_in_command469 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_Variable_in_command471 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_command473 = new BitSet(new long[]{0x0000104000030000L});
    public static final BitSet FOLLOW_expression_in_command475 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_command477 = new BitSet(new long[]{0x00000011C4050000L});
    public static final BitSet FOLLOW_commands_in_command479 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_command481 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_Node_ForEach_in_command484 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_command486 = new BitSet(new long[]{0x00000011C4050000L});
    public static final BitSet FOLLOW_commands_in_command488 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_30_in_command495 = new BitSet(new long[]{0x0000104000030000L});
    public static final BitSet FOLLOW_expression_in_command497 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_command499 = new BitSet(new long[]{0x00000011C4050000L});
    public static final BitSet FOLLOW_commands_in_command501 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_command503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_command519 = new BitSet(new long[]{0x0000104000030000L});
    public static final BitSet FOLLOW_expression_in_command521 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_command523 = new BitSet(new long[]{0x00000011C4050000L});
    public static final BitSet FOLLOW_commands_in_command525 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_command527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_command543 = new BitSet(new long[]{0x0000104000070000L});
    public static final BitSet FOLLOW_WS_in_command545 = new BitSet(new long[]{0x0000104000070000L});
    public static final BitSet FOLLOW_expression_in_command548 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_command550 = new BitSet(new long[]{0x00000011C4050000L});
    public static final BitSet FOLLOW_commands_in_command553 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_command555 = new BitSet(new long[]{0x0000000C00040000L});
    public static final BitSet FOLLOW_WS_in_command558 = new BitSet(new long[]{0x0000000400040000L});
    public static final BitSet FOLLOW_34_in_command560 = new BitSet(new long[]{0x00000011C4050000L});
    public static final BitSet FOLLOW_commands_in_command562 = new BitSet(new long[]{0x0000000800040000L});
    public static final BitSet FOLLOW_WS_in_command566 = new BitSet(new long[]{0x0000000800040000L});
    public static final BitSet FOLLOW_35_in_command569 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_Node_If_in_command572 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_command574 = new BitSet(new long[]{0x00000011C4050000L});
    public static final BitSet FOLLOW_commands_in_command576 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_36_in_command583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vars_in_command589 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_command591 = new BitSet(new long[]{0x0000104000030000L});
    public static final BitSet FOLLOW_exprs_in_command593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_exprBase623 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_Symbol_in_exprBase625 = new BitSet(new long[]{0x000010C000030000L});
    public static final BitSet FOLLOW_lExpr_in_exprBase627 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_exprBase629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_exprBase635 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_exprBase637 = new BitSet(new long[]{0x0000104000030000L});
    public static final BitSet FOLLOW_exprBase_in_exprBase639 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_exprBase641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_exprBase648 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_exprBase650 = new BitSet(new long[]{0x0000104000030000L});
    public static final BitSet FOLLOW_exprBase_in_exprBase652 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_exprBase654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_exprBase660 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_exprBase662 = new BitSet(new long[]{0x000010C000030000L});
    public static final BitSet FOLLOW_lExpr_in_exprBase664 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_exprBase666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_exprBase672 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_exprBase674 = new BitSet(new long[]{0x000010C000030000L});
    public static final BitSet FOLLOW_lExpr_in_exprBase676 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_exprBase678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_exprBase684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Variable_in_exprBase691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Symbol_in_exprBase697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprBase_in_expression705 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_expression708 = new BitSet(new long[]{0x0000104000030000L});
    public static final BitSet FOLLOW_exprBase_in_expression710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprBase_in_lExpr723 = new BitSet(new long[]{0x0000104000030000L});
    public static final BitSet FOLLOW_lExpr_in_lExpr725 = new BitSet(new long[]{0x0000000000000002L});

}