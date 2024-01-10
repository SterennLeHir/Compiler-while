package fr.esir.tlc;// $ANTLR 3.5.1 C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g 2024-01-10 18:18:34

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class whileParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "Dec", "Maj", "Min", "Node_Affectation", 
		"Node_Bloc", "Node_Call", "Node_Cons", "Node_Else", "Node_Exprlist", "Node_For", 
		"Node_ForEach", "Node_Function", "Node_Head", "Node_If", "Node_Input", 
		"Node_Left", "Node_List", "Node_Output", "Node_Params", "Node_Right", 
		"Node_Tail", "Node_While", "Symbol", "Variable", "WS", "'%'", "'('", "')'", 
		"','", "':'", "':='", "';'", "'=?'", "'cons'", "'do'", "'else'", "'fi'", 
		"'for'", "'foreach'", "'function'", "'hd'", "'if'", "'in'", "'list'", 
		"'nil'", "'nop'", "'od'", "'read'", "'then'", "'tl'", "'while'", "'write'"
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
	public static final int Dec=4;
	public static final int Maj=5;
	public static final int Min=6;
	public static final int Node_Affectation=7;
	public static final int Node_Bloc=8;
	public static final int Node_Call=9;
	public static final int Node_Cons=10;
	public static final int Node_Else=11;
	public static final int Node_Exprlist=12;
	public static final int Node_For=13;
	public static final int Node_ForEach=14;
	public static final int Node_Function=15;
	public static final int Node_Head=16;
	public static final int Node_If=17;
	public static final int Node_Input=18;
	public static final int Node_Left=19;
	public static final int Node_List=20;
	public static final int Node_Output=21;
	public static final int Node_Params=22;
	public static final int Node_Right=23;
	public static final int Node_Tail=24;
	public static final int Node_While=25;
	public static final int Symbol=26;
	public static final int Variable=27;
	public static final int WS=28;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

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
	@Override public String[] getTokenNames() { return whileParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g"; }


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:53:1: program : function ( program )? ;
	public final program_return program() throws RecognitionException {
		program_return retval = new program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope function1 =null;
		ParserRuleReturnScope program2 =null;


		try {
			// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:54:2: ( function ( program )? )
			// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:54:4: function ( program )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_function_in_program261);
			function1=function();
			state._fsp--;

			adaptor.addChild(root_0, function1.getTree());

			// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:54:13: ( program )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==43) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:54:13: program
					{
					pushFollow(FOLLOW_program_in_program263);
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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"


	public static class function_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "function"
	// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:55:1: function : 'function' Symbol ':' ( WS )* definition -> ^( Node_Function Symbol definition ) ;
	public final function_return function() throws RecognitionException {
		function_return retval = new function_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal3=null;
		Token Symbol4=null;
		Token char_literal5=null;
		Token WS6=null;
		ParserRuleReturnScope definition7 =null;

		Object string_literal3_tree=null;
		Object Symbol4_tree=null;
		Object char_literal5_tree=null;
		Object WS6_tree=null;
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_Symbol=new RewriteRuleTokenStream(adaptor,"token Symbol");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"rule definition");

		try {
			// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:56:2: ( 'function' Symbol ':' ( WS )* definition -> ^( Node_Function Symbol definition ) )
			// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:56:4: 'function' Symbol ':' ( WS )* definition
			{
			string_literal3=(Token)match(input,43,FOLLOW_43_in_function274);  
			stream_43.add(string_literal3);

			Symbol4=(Token)match(input,Symbol,FOLLOW_Symbol_in_function276);  
			stream_Symbol.add(Symbol4);

			char_literal5=(Token)match(input,33,FOLLOW_33_in_function278);  
			stream_33.add(char_literal5);

			// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:56:26: ( WS )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==WS) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:56:26: WS
					{
					WS6=(Token)match(input,WS,FOLLOW_WS_in_function280);  
					stream_WS.add(WS6);

					}
					break;

				default :
					break loop2;
				}
			}

			pushFollow(FOLLOW_definition_in_function283);
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
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 56:42: -> ^( Node_Function Symbol definition )
			{
				// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:56:45: ^( Node_Function Symbol definition )
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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "function"


	public static class definition_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "definition"
	// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:58:1: definition : 'read' input ( WS )* '%' commands '%' ( WS )* 'write' output ( WS )* -> input commands output ;
	public final definition_return definition() throws RecognitionException {
		definition_return retval = new definition_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal8=null;
		Token WS10=null;
		Token char_literal11=null;
		Token char_literal13=null;
		Token WS14=null;
		Token string_literal15=null;
		Token WS17=null;
		ParserRuleReturnScope input9 =null;
		ParserRuleReturnScope commands12 =null;
		ParserRuleReturnScope output16 =null;

		Object string_literal8_tree=null;
		Object WS10_tree=null;
		Object char_literal11_tree=null;
		Object char_literal13_tree=null;
		Object WS14_tree=null;
		Object string_literal15_tree=null;
		Object WS17_tree=null;
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");
		RewriteRuleSubtreeStream stream_input=new RewriteRuleSubtreeStream(adaptor,"rule input");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:59:2: ( 'read' input ( WS )* '%' commands '%' ( WS )* 'write' output ( WS )* -> input commands output )
			// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:59:4: 'read' input ( WS )* '%' commands '%' ( WS )* 'write' output ( WS )*
			{
			string_literal8=(Token)match(input,51,FOLLOW_51_in_definition309);  
			stream_51.add(string_literal8);

			pushFollow(FOLLOW_input_in_definition311);
			input9=input();
			state._fsp--;

			stream_input.add(input9.getTree());
			// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:59:17: ( WS )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==WS) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:59:17: WS
					{
					WS10=(Token)match(input,WS,FOLLOW_WS_in_definition313);  
					stream_WS.add(WS10);

					}
					break;

				default :
					break loop3;
				}
			}

			char_literal11=(Token)match(input,29,FOLLOW_29_in_definition316);  
			stream_29.add(char_literal11);

			pushFollow(FOLLOW_commands_in_definition318);
			commands12=commands();
			state._fsp--;

			stream_commands.add(commands12.getTree());
			char_literal13=(Token)match(input,29,FOLLOW_29_in_definition320);  
			stream_29.add(char_literal13);

			// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:59:38: ( WS )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==WS) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:59:38: WS
					{
					WS14=(Token)match(input,WS,FOLLOW_WS_in_definition322);  
					stream_WS.add(WS14);

					}
					break;

				default :
					break loop4;
				}
			}

			string_literal15=(Token)match(input,55,FOLLOW_55_in_definition325);  
			stream_55.add(string_literal15);

			pushFollow(FOLLOW_output_in_definition327);
			output16=output();
			state._fsp--;

			stream_output.add(output16.getTree());
			// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:59:57: ( WS )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==WS) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:59:57: WS
					{
					WS17=(Token)match(input,WS,FOLLOW_WS_in_definition329);  
					stream_WS.add(WS17);

					}
					break;

				default :
					break loop5;
				}
			}

			// AST REWRITE
			// elements: output, commands, input
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 59:61: -> input commands output
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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "definition"


	public static class input_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "input"
	// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:60:1: input : ( inputSub )? -> ^( Node_Input ( inputSub )? ) ;
	public final input_return input() throws RecognitionException {
		input_return retval = new input_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope inputSub18 =null;

		RewriteRuleSubtreeStream stream_inputSub=new RewriteRuleSubtreeStream(adaptor,"rule inputSub");

		try {
			// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:61:2: ( ( inputSub )? -> ^( Node_Input ( inputSub )? ) )
			// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:61:5: ( inputSub )?
			{
			// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:61:5: ( inputSub )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==Variable) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:61:5: inputSub
					{
					pushFollow(FOLLOW_inputSub_in_input350);
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
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 61:15: -> ^( Node_Input ( inputSub )? )
			{
				// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:61:17: ^( Node_Input ( inputSub )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(Node_Input, "Node_Input"), root_1);
				// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:61:30: ( inputSub )?
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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "input"


	public static class inputSub_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "inputSub"
	// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:62:1: inputSub : Variable ( ',' Variable )* -> ( Variable )+ ;
	public final inputSub_return inputSub() throws RecognitionException {
		inputSub_return retval = new inputSub_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Variable19=null;
		Token char_literal20=null;
		Token Variable21=null;

		Object Variable19_tree=null;
		Object char_literal20_tree=null;
		Object Variable21_tree=null;
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");

		try {
			// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:63:2: ( Variable ( ',' Variable )* -> ( Variable )+ )
			// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:63:4: Variable ( ',' Variable )*
			{
			Variable19=(Token)match(input,Variable,FOLLOW_Variable_in_inputSub368);  
			stream_Variable.add(Variable19);

			// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:63:13: ( ',' Variable )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==32) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:63:14: ',' Variable
					{
					char_literal20=(Token)match(input,32,FOLLOW_32_in_inputSub371);  
					stream_32.add(char_literal20);

					Variable21=(Token)match(input,Variable,FOLLOW_Variable_in_inputSub373);  
					stream_Variable.add(Variable21);

					}
					break;

				default :
					break loop7;
				}
			}

			// AST REWRITE
			// elements: Variable
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 63:28: -> ( Variable )+
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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "inputSub"


	public static class output_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "output"
	// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:64:1: output : Variable ( ',' Variable )* -> ^( Node_Output ( Variable )+ ) ;
	public final output_return output() throws RecognitionException {
		output_return retval = new output_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Variable22=null;
		Token char_literal23=null;
		Token Variable24=null;

		Object Variable22_tree=null;
		Object char_literal23_tree=null;
		Object Variable24_tree=null;
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");

		try {
			// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:65:2: ( Variable ( ',' Variable )* -> ^( Node_Output ( Variable )+ ) )
			// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:65:4: Variable ( ',' Variable )*
			{
			Variable22=(Token)match(input,Variable,FOLLOW_Variable_in_output390);  
			stream_Variable.add(Variable22);

			// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:65:13: ( ',' Variable )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==32) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:65:14: ',' Variable
					{
					char_literal23=(Token)match(input,32,FOLLOW_32_in_output393);  
					stream_32.add(char_literal23);

					Variable24=(Token)match(input,Variable,FOLLOW_Variable_in_output395);  
					stream_Variable.add(Variable24);

					}
					break;

				default :
					break loop8;
				}
			}

			// AST REWRITE
			// elements: Variable
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 65:29: -> ^( Node_Output ( Variable )+ )
			{
				// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:65:32: ^( Node_Output ( Variable )+ )
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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "output"


	public static class vars_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "vars"
	// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:66:1: vars : Variable ( ',' Variable )* -> ^( Node_Left ( Variable )+ ) ;
	public final vars_return vars() throws RecognitionException {
		vars_return retval = new vars_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Variable25=null;
		Token char_literal26=null;
		Token Variable27=null;

		Object Variable25_tree=null;
		Object char_literal26_tree=null;
		Object Variable27_tree=null;
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");

		try {
			// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:67:2: ( Variable ( ',' Variable )* -> ^( Node_Left ( Variable )+ ) )
			// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:67:4: Variable ( ',' Variable )*
			{
			Variable25=(Token)match(input,Variable,FOLLOW_Variable_in_vars416);  
			stream_Variable.add(Variable25);

			// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:67:13: ( ',' Variable )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==32) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:67:14: ',' Variable
					{
					char_literal26=(Token)match(input,32,FOLLOW_32_in_vars419);  
					stream_32.add(char_literal26);

					Variable27=(Token)match(input,Variable,FOLLOW_Variable_in_vars421);  
					stream_Variable.add(Variable27);

					}
					break;

				default :
					break loop9;
				}
			}

			// AST REWRITE
			// elements: Variable
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 67:29: -> ^( Node_Left ( Variable )+ )
			{
				// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:67:32: ^( Node_Left ( Variable )+ )
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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "vars"


	public static class exprs_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprs"
	// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:68:1: exprs : expression ( ',' expression )* -> ^( Node_Right ( expression )+ ) ;
	public final exprs_return exprs() throws RecognitionException {
		exprs_return retval = new exprs_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal29=null;
		ParserRuleReturnScope expression28 =null;
		ParserRuleReturnScope expression30 =null;

		Object char_literal29_tree=null;
		RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:69:2: ( expression ( ',' expression )* -> ^( Node_Right ( expression )+ ) )
			// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:69:4: expression ( ',' expression )*
			{
			pushFollow(FOLLOW_expression_in_exprs441);
			expression28=expression();
			state._fsp--;

			stream_expression.add(expression28.getTree());
			// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:69:15: ( ',' expression )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==32) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:69:16: ',' expression
					{
					char_literal29=(Token)match(input,32,FOLLOW_32_in_exprs444);  
					stream_32.add(char_literal29);

					pushFollow(FOLLOW_expression_in_exprs446);
					expression30=expression();
					state._fsp--;

					stream_expression.add(expression30.getTree());
					}
					break;

				default :
					break loop10;
				}
			}

			// AST REWRITE
			// elements: expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 69:33: -> ^( Node_Right ( expression )+ )
			{
				// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:69:36: ^( Node_Right ( expression )+ )
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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exprs"


	public static class commands_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "commands"
	// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:70:1: commands : ( WS )* command ( ';' command )* ( WS )* -> ^( Node_Bloc ( command )+ ) ;
	public final commands_return commands() throws RecognitionException {
		commands_return retval = new commands_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WS31=null;
		Token char_literal33=null;
		Token WS35=null;
		ParserRuleReturnScope command32 =null;
		ParserRuleReturnScope command34 =null;

		Object WS31_tree=null;
		Object char_literal33_tree=null;
		Object WS35_tree=null;
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_command=new RewriteRuleSubtreeStream(adaptor,"rule command");

		try {
			// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:71:2: ( ( WS )* command ( ';' command )* ( WS )* -> ^( Node_Bloc ( command )+ ) )
			// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:71:4: ( WS )* command ( ';' command )* ( WS )*
			{
			// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:71:4: ( WS )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==WS) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:71:4: WS
					{
					WS31=(Token)match(input,WS,FOLLOW_WS_in_commands467);  
					stream_WS.add(WS31);

					}
					break;

				default :
					break loop11;
				}
			}

			pushFollow(FOLLOW_command_in_commands470);
			command32=command();
			state._fsp--;

			stream_command.add(command32.getTree());
			// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:71:16: ( ';' command )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==35) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:71:17: ';' command
					{
					char_literal33=(Token)match(input,35,FOLLOW_35_in_commands473);  
					stream_35.add(char_literal33);

					pushFollow(FOLLOW_command_in_commands475);
					command34=command();
					state._fsp--;

					stream_command.add(command34.getTree());
					}
					break;

				default :
					break loop12;
				}
			}

			// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:71:31: ( WS )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==WS) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:71:31: WS
					{
					WS35=(Token)match(input,WS,FOLLOW_WS_in_commands479);  
					stream_WS.add(WS35);

					}
					break;

				default :
					break loop13;
				}
			}

			// AST REWRITE
			// elements: command
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 71:35: -> ^( Node_Bloc ( command )+ )
			{
				// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:71:38: ^( Node_Bloc ( command )+ )
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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "commands"


	public static class command_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "command"
	// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:72:1: command : ( 'foreach' Variable 'in' expression 'do' commands 'od' -> ^( Node_ForEach Variable expression commands ) | 'for' expression 'do' commands 'od' -> ^( Node_For expression commands ) | 'while' expression 'do' commands 'od' -> ^( Node_While expression commands ) | 'if' expression 'then' commands ( 'else' commands )? 'fi' -> ^( Node_If expression commands ( ^( Node_Else commands ) )? ) | 'nop' | vars ':=' exprs -> ^( Node_Affectation vars exprs ) );
	public final command_return command() throws RecognitionException {
		command_return retval = new command_return();
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
		ParserRuleReturnScope expression39 =null;
		ParserRuleReturnScope commands41 =null;
		ParserRuleReturnScope expression44 =null;
		ParserRuleReturnScope commands46 =null;
		ParserRuleReturnScope expression49 =null;
		ParserRuleReturnScope commands51 =null;
		ParserRuleReturnScope expression54 =null;
		ParserRuleReturnScope commands56 =null;
		ParserRuleReturnScope commands58 =null;
		ParserRuleReturnScope vars61 =null;
		ParserRuleReturnScope exprs63 =null;

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
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");
		RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:73:2: ( 'foreach' Variable 'in' expression 'do' commands 'od' -> ^( Node_ForEach Variable expression commands ) | 'for' expression 'do' commands 'od' -> ^( Node_For expression commands ) | 'while' expression 'do' commands 'od' -> ^( Node_While expression commands ) | 'if' expression 'then' commands ( 'else' commands )? 'fi' -> ^( Node_If expression commands ( ^( Node_Else commands ) )? ) | 'nop' | vars ':=' exprs -> ^( Node_Affectation vars exprs ) )
			int alt15=6;
			switch ( input.LA(1) ) {
			case 42:
				{
				alt15=1;
				}
				break;
			case 41:
				{
				alt15=2;
				}
				break;
			case 54:
				{
				alt15=3;
				}
				break;
			case 45:
				{
				alt15=4;
				}
				break;
			case 49:
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
				throw nvae;
			}
			switch (alt15) {
				case 1 :
					// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:73:4: 'foreach' Variable 'in' expression 'do' commands 'od'
					{
					string_literal36=(Token)match(input,42,FOLLOW_42_in_command504);  
					stream_42.add(string_literal36);

					Variable37=(Token)match(input,Variable,FOLLOW_Variable_in_command506);  
					stream_Variable.add(Variable37);

					string_literal38=(Token)match(input,46,FOLLOW_46_in_command508);  
					stream_46.add(string_literal38);

					pushFollow(FOLLOW_expression_in_command510);
					expression39=expression();
					state._fsp--;

					stream_expression.add(expression39.getTree());
					string_literal40=(Token)match(input,38,FOLLOW_38_in_command512);  
					stream_38.add(string_literal40);

					pushFollow(FOLLOW_commands_in_command514);
					commands41=commands();
					state._fsp--;

					stream_commands.add(commands41.getTree());
					string_literal42=(Token)match(input,50,FOLLOW_50_in_command516);  
					stream_50.add(string_literal42);

					// AST REWRITE
					// elements: Variable, expression, commands
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 73:58: -> ^( Node_ForEach Variable expression commands )
					{
						// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:73:61: ^( Node_ForEach Variable expression commands )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(Node_ForEach, "Node_ForEach"), root_1);
						adaptor.addChild(root_1, stream_Variable.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_1, stream_commands.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:74:5: 'for' expression 'do' commands 'od'
					{
					string_literal43=(Token)match(input,41,FOLLOW_41_in_command534);  
					stream_41.add(string_literal43);

					pushFollow(FOLLOW_expression_in_command536);
					expression44=expression();
					state._fsp--;

					stream_expression.add(expression44.getTree());
					string_literal45=(Token)match(input,38,FOLLOW_38_in_command538);  
					stream_38.add(string_literal45);

					pushFollow(FOLLOW_commands_in_command540);
					commands46=commands();
					state._fsp--;

					stream_commands.add(commands46.getTree());
					string_literal47=(Token)match(input,50,FOLLOW_50_in_command542);  
					stream_50.add(string_literal47);

					// AST REWRITE
					// elements: expression, commands
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 74:41: -> ^( Node_For expression commands )
					{
						// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:74:44: ^( Node_For expression commands )
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
					// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:75:5: 'while' expression 'do' commands 'od'
					{
					string_literal48=(Token)match(input,54,FOLLOW_54_in_command558);  
					stream_54.add(string_literal48);

					pushFollow(FOLLOW_expression_in_command560);
					expression49=expression();
					state._fsp--;

					stream_expression.add(expression49.getTree());
					string_literal50=(Token)match(input,38,FOLLOW_38_in_command562);  
					stream_38.add(string_literal50);

					pushFollow(FOLLOW_commands_in_command564);
					commands51=commands();
					state._fsp--;

					stream_commands.add(commands51.getTree());
					string_literal52=(Token)match(input,50,FOLLOW_50_in_command566);  
					stream_50.add(string_literal52);

					// AST REWRITE
					// elements: expression, commands
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 75:43: -> ^( Node_While expression commands )
					{
						// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:75:46: ^( Node_While expression commands )
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
					// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:76:5: 'if' expression 'then' commands ( 'else' commands )? 'fi'
					{
					string_literal53=(Token)match(input,45,FOLLOW_45_in_command582);  
					stream_45.add(string_literal53);

					pushFollow(FOLLOW_expression_in_command584);
					expression54=expression();
					state._fsp--;

					stream_expression.add(expression54.getTree());
					string_literal55=(Token)match(input,52,FOLLOW_52_in_command586);  
					stream_52.add(string_literal55);

					pushFollow(FOLLOW_commands_in_command589);
					commands56=commands();
					state._fsp--;

					stream_commands.add(commands56.getTree());
					// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:76:38: ( 'else' commands )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==39) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:76:39: 'else' commands
							{
							string_literal57=(Token)match(input,39,FOLLOW_39_in_command592);  
							stream_39.add(string_literal57);

							pushFollow(FOLLOW_commands_in_command594);
							commands58=commands();
							state._fsp--;

							stream_commands.add(commands58.getTree());
							}
							break;

					}

					string_literal59=(Token)match(input,40,FOLLOW_40_in_command598);  
					stream_40.add(string_literal59);

					// AST REWRITE
					// elements: commands, expression, commands
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 76:62: -> ^( Node_If expression commands ( ^( Node_Else commands ) )? )
					{
						// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:76:65: ^( Node_If expression commands ( ^( Node_Else commands ) )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(Node_If, "Node_If"), root_1);
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_1, stream_commands.nextTree());
						// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:76:95: ( ^( Node_Else commands ) )?
						if ( stream_commands.hasNext() ) {
							// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:76:95: ^( Node_Else commands )
							{
							Object root_2 = (Object)adaptor.nil();
							root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(Node_Else, "Node_Else"), root_2);
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
					// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:77:5: 'nop'
					{
					root_0 = (Object)adaptor.nil();


					string_literal60=(Token)match(input,49,FOLLOW_49_in_command621); 
					string_literal60_tree = (Object)adaptor.create(string_literal60);
					adaptor.addChild(root_0, string_literal60_tree);

					}
					break;
				case 6 :
					// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:78:5: vars ':=' exprs
					{
					pushFollow(FOLLOW_vars_in_command627);
					vars61=vars();
					state._fsp--;

					stream_vars.add(vars61.getTree());
					string_literal62=(Token)match(input,34,FOLLOW_34_in_command629);  
					stream_34.add(string_literal62);

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
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 78:21: -> ^( Node_Affectation vars exprs )
					{
						// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:78:24: ^( Node_Affectation vars exprs )
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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "command"


	public static class exprBase_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprBase"
	// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:80:1: exprBase : ( '(' Symbol lExpr ')' -> ^( Node_Call Symbol ^( Node_Params lExpr ) ) | '(' 'hd' exprBase ')' -> ^( Node_Head exprBase ) | '(' 'tl' exprBase ')' -> ^( Node_Tail exprBase ) | '(' 'cons' lExpr ')' -> ^( Node_Cons lExpr ) | '(' 'list' lExpr ')' -> ^( Node_List lExpr ) | 'nil' | Variable | Symbol );
	public final exprBase_return exprBase() throws RecognitionException {
		exprBase_return retval = new exprBase_return();
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
		ParserRuleReturnScope lExpr66 =null;
		ParserRuleReturnScope exprBase70 =null;
		ParserRuleReturnScope exprBase74 =null;
		ParserRuleReturnScope lExpr78 =null;
		ParserRuleReturnScope lExpr82 =null;

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
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_Symbol=new RewriteRuleTokenStream(adaptor,"token Symbol");
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
		RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");
		RewriteRuleSubtreeStream stream_lExpr=new RewriteRuleSubtreeStream(adaptor,"rule lExpr");

		try {
			// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:81:3: ( '(' Symbol lExpr ')' -> ^( Node_Call Symbol ^( Node_Params lExpr ) ) | '(' 'hd' exprBase ')' -> ^( Node_Head exprBase ) | '(' 'tl' exprBase ')' -> ^( Node_Tail exprBase ) | '(' 'cons' lExpr ')' -> ^( Node_Cons lExpr ) | '(' 'list' lExpr ')' -> ^( Node_List lExpr ) | 'nil' | Variable | Symbol )
			int alt16=8;
			switch ( input.LA(1) ) {
			case 30:
				{
				switch ( input.LA(2) ) {
				case Symbol:
					{
					alt16=1;
					}
					break;
				case 44:
					{
					alt16=2;
					}
					break;
				case 53:
					{
					alt16=3;
					}
					break;
				case 37:
					{
					alt16=4;
					}
					break;
				case 47:
					{
					alt16=5;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 16, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 48:
				{
				alt16=6;
				}
				break;
			case Variable:
				{
				alt16=7;
				}
				break;
			case Symbol:
				{
				alt16=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:81:5: '(' Symbol lExpr ')'
					{
					char_literal64=(Token)match(input,30,FOLLOW_30_in_exprBase661);  
					stream_30.add(char_literal64);

					Symbol65=(Token)match(input,Symbol,FOLLOW_Symbol_in_exprBase663);  
					stream_Symbol.add(Symbol65);

					pushFollow(FOLLOW_lExpr_in_exprBase665);
					lExpr66=lExpr();
					state._fsp--;

					stream_lExpr.add(lExpr66.getTree());
					char_literal67=(Token)match(input,31,FOLLOW_31_in_exprBase667);  
					stream_31.add(char_literal67);

					// AST REWRITE
					// elements: Symbol, lExpr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 81:26: -> ^( Node_Call Symbol ^( Node_Params lExpr ) )
					{
						// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:81:29: ^( Node_Call Symbol ^( Node_Params lExpr ) )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(Node_Call, "Node_Call"), root_1);
						adaptor.addChild(root_1, stream_Symbol.nextNode());
						// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:81:48: ^( Node_Params lExpr )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(Node_Params, "Node_Params"), root_2);
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
					// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:82:5: '(' 'hd' exprBase ')'
					{
					char_literal68=(Token)match(input,30,FOLLOW_30_in_exprBase687);  
					stream_30.add(char_literal68);

					string_literal69=(Token)match(input,44,FOLLOW_44_in_exprBase689);  
					stream_44.add(string_literal69);

					pushFollow(FOLLOW_exprBase_in_exprBase691);
					exprBase70=exprBase();
					state._fsp--;

					stream_exprBase.add(exprBase70.getTree());
					char_literal71=(Token)match(input,31,FOLLOW_31_in_exprBase693);  
					stream_31.add(char_literal71);

					// AST REWRITE
					// elements: exprBase
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 82:27: -> ^( Node_Head exprBase )
					{
						// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:82:31: ^( Node_Head exprBase )
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
					// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:83:5: '(' 'tl' exprBase ')'
					{
					char_literal72=(Token)match(input,30,FOLLOW_30_in_exprBase708);  
					stream_30.add(char_literal72);

					string_literal73=(Token)match(input,53,FOLLOW_53_in_exprBase710);  
					stream_53.add(string_literal73);

					pushFollow(FOLLOW_exprBase_in_exprBase712);
					exprBase74=exprBase();
					state._fsp--;

					stream_exprBase.add(exprBase74.getTree());
					char_literal75=(Token)match(input,31,FOLLOW_31_in_exprBase714);  
					stream_31.add(char_literal75);

					// AST REWRITE
					// elements: exprBase
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 83:27: -> ^( Node_Tail exprBase )
					{
						// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:83:30: ^( Node_Tail exprBase )
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
					// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:84:5: '(' 'cons' lExpr ')'
					{
					char_literal76=(Token)match(input,30,FOLLOW_30_in_exprBase728);  
					stream_30.add(char_literal76);

					string_literal77=(Token)match(input,37,FOLLOW_37_in_exprBase730);  
					stream_37.add(string_literal77);

					pushFollow(FOLLOW_lExpr_in_exprBase732);
					lExpr78=lExpr();
					state._fsp--;

					stream_lExpr.add(lExpr78.getTree());
					char_literal79=(Token)match(input,31,FOLLOW_31_in_exprBase734);  
					stream_31.add(char_literal79);

					// AST REWRITE
					// elements: lExpr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 84:26: -> ^( Node_Cons lExpr )
					{
						// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:84:29: ^( Node_Cons lExpr )
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
					// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:85:5: '(' 'list' lExpr ')'
					{
					char_literal80=(Token)match(input,30,FOLLOW_30_in_exprBase748);  
					stream_30.add(char_literal80);

					string_literal81=(Token)match(input,47,FOLLOW_47_in_exprBase750);  
					stream_47.add(string_literal81);

					pushFollow(FOLLOW_lExpr_in_exprBase752);
					lExpr82=lExpr();
					state._fsp--;

					stream_lExpr.add(lExpr82.getTree());
					char_literal83=(Token)match(input,31,FOLLOW_31_in_exprBase754);  
					stream_31.add(char_literal83);

					// AST REWRITE
					// elements: lExpr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 85:26: -> ^( Node_List lExpr )
					{
						// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:85:29: ^( Node_List lExpr )
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
					// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:86:5: 'nil'
					{
					root_0 = (Object)adaptor.nil();


					string_literal84=(Token)match(input,48,FOLLOW_48_in_exprBase768); 
					string_literal84_tree = (Object)adaptor.create(string_literal84);
					adaptor.addChild(root_0, string_literal84_tree);

					}
					break;
				case 7 :
					// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:87:5: Variable
					{
					root_0 = (Object)adaptor.nil();


					Variable85=(Token)match(input,Variable,FOLLOW_Variable_in_exprBase775); 
					Variable85_tree = (Object)adaptor.create(Variable85);
					adaptor.addChild(root_0, Variable85_tree);

					}
					break;
				case 8 :
					// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:88:5: Symbol
					{
					root_0 = (Object)adaptor.nil();


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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exprBase"


	public static class expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:89:1: expression : exprBase ( '=?' exprBase )? ;
	public final expression_return expression() throws RecognitionException {
		expression_return retval = new expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal88=null;
		ParserRuleReturnScope exprBase87 =null;
		ParserRuleReturnScope exprBase89 =null;

		Object string_literal88_tree=null;

		try {
			// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:90:2: ( exprBase ( '=?' exprBase )? )
			// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:90:4: exprBase ( '=?' exprBase )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_exprBase_in_expression789);
			exprBase87=exprBase();
			state._fsp--;

			adaptor.addChild(root_0, exprBase87.getTree());

			// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:90:13: ( '=?' exprBase )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==36) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:90:14: '=?' exprBase
					{
					string_literal88=(Token)match(input,36,FOLLOW_36_in_expression792); 
					string_literal88_tree = (Object)adaptor.create(string_literal88);
					adaptor.addChild(root_0, string_literal88_tree);

					pushFollow(FOLLOW_exprBase_in_expression794);
					exprBase89=exprBase();
					state._fsp--;

					adaptor.addChild(root_0, exprBase89.getTree());

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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class lExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "lExpr"
	// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:91:1: lExpr : ( exprBase lExpr )? ;
	public final lExpr_return lExpr() throws RecognitionException {
		lExpr_return retval = new lExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope exprBase90 =null;
		ParserRuleReturnScope lExpr91 =null;


		try {
			// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:92:2: ( ( exprBase lExpr )? )
			// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:92:4: ( exprBase lExpr )?
			{
			root_0 = (Object)adaptor.nil();


			// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:92:4: ( exprBase lExpr )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( ((LA18_0 >= Symbol && LA18_0 <= Variable)||LA18_0==30||LA18_0==48) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:92:5: exprBase lExpr
					{
					pushFollow(FOLLOW_exprBase_in_lExpr807);
					exprBase90=exprBase();
					state._fsp--;

					adaptor.addChild(root_0, exprBase90.getTree());

					pushFollow(FOLLOW_lExpr_in_lExpr809);
					lExpr91=lExpr();
					state._fsp--;

					adaptor.addChild(root_0, lExpr91.getTree());

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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lExpr"

	// Delegated rules



	public static final BitSet FOLLOW_function_in_program261 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_program_in_program263 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_function274 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_Symbol_in_function276 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_function278 = new BitSet(new long[]{0x0008000010000000L});
	public static final BitSet FOLLOW_WS_in_function280 = new BitSet(new long[]{0x0008000010000000L});
	public static final BitSet FOLLOW_definition_in_function283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_definition309 = new BitSet(new long[]{0x0000000038000000L});
	public static final BitSet FOLLOW_input_in_definition311 = new BitSet(new long[]{0x0000000030000000L});
	public static final BitSet FOLLOW_WS_in_definition313 = new BitSet(new long[]{0x0000000030000000L});
	public static final BitSet FOLLOW_29_in_definition316 = new BitSet(new long[]{0x0042260018000000L});
	public static final BitSet FOLLOW_commands_in_definition318 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_definition320 = new BitSet(new long[]{0x0080000010000000L});
	public static final BitSet FOLLOW_WS_in_definition322 = new BitSet(new long[]{0x0080000010000000L});
	public static final BitSet FOLLOW_55_in_definition325 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_output_in_definition327 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_WS_in_definition329 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_inputSub_in_input350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_inputSub368 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_32_in_inputSub371 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_Variable_in_inputSub373 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_Variable_in_output390 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_32_in_output393 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_Variable_in_output395 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_Variable_in_vars416 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_32_in_vars419 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_Variable_in_vars421 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_expression_in_exprs441 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_32_in_exprs444 = new BitSet(new long[]{0x000100004C000000L});
	public static final BitSet FOLLOW_expression_in_exprs446 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_WS_in_commands467 = new BitSet(new long[]{0x0042260018000000L});
	public static final BitSet FOLLOW_command_in_commands470 = new BitSet(new long[]{0x0000000810000002L});
	public static final BitSet FOLLOW_35_in_commands473 = new BitSet(new long[]{0x0042260008000000L});
	public static final BitSet FOLLOW_command_in_commands475 = new BitSet(new long[]{0x0000000810000002L});
	public static final BitSet FOLLOW_WS_in_commands479 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_42_in_command504 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_Variable_in_command506 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_command508 = new BitSet(new long[]{0x000100004C000000L});
	public static final BitSet FOLLOW_expression_in_command510 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_command512 = new BitSet(new long[]{0x0042260018000000L});
	public static final BitSet FOLLOW_commands_in_command514 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_command516 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_command534 = new BitSet(new long[]{0x000100004C000000L});
	public static final BitSet FOLLOW_expression_in_command536 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_command538 = new BitSet(new long[]{0x0042260018000000L});
	public static final BitSet FOLLOW_commands_in_command540 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_command542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_command558 = new BitSet(new long[]{0x000100004C000000L});
	public static final BitSet FOLLOW_expression_in_command560 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_command562 = new BitSet(new long[]{0x0042260018000000L});
	public static final BitSet FOLLOW_commands_in_command564 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_command566 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_command582 = new BitSet(new long[]{0x000100004C000000L});
	public static final BitSet FOLLOW_expression_in_command584 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_command586 = new BitSet(new long[]{0x0042260018000000L});
	public static final BitSet FOLLOW_commands_in_command589 = new BitSet(new long[]{0x0000018000000000L});
	public static final BitSet FOLLOW_39_in_command592 = new BitSet(new long[]{0x0042260018000000L});
	public static final BitSet FOLLOW_commands_in_command594 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_command598 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_command621 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vars_in_command627 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_command629 = new BitSet(new long[]{0x000100004C000000L});
	public static final BitSet FOLLOW_exprs_in_command631 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_exprBase661 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_Symbol_in_exprBase663 = new BitSet(new long[]{0x00010000CC000000L});
	public static final BitSet FOLLOW_lExpr_in_exprBase665 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_exprBase667 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_exprBase687 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_exprBase689 = new BitSet(new long[]{0x000100004C000000L});
	public static final BitSet FOLLOW_exprBase_in_exprBase691 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_exprBase693 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_exprBase708 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_53_in_exprBase710 = new BitSet(new long[]{0x000100004C000000L});
	public static final BitSet FOLLOW_exprBase_in_exprBase712 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_exprBase714 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_exprBase728 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_exprBase730 = new BitSet(new long[]{0x00010000CC000000L});
	public static final BitSet FOLLOW_lExpr_in_exprBase732 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_exprBase734 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_exprBase748 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_exprBase750 = new BitSet(new long[]{0x00010000CC000000L});
	public static final BitSet FOLLOW_lExpr_in_exprBase752 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_exprBase754 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_exprBase768 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_exprBase775 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Symbol_in_exprBase781 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprBase_in_expression789 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_36_in_expression792 = new BitSet(new long[]{0x000100004C000000L});
	public static final BitSet FOLLOW_exprBase_in_expression794 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprBase_in_lExpr807 = new BitSet(new long[]{0x000100004C000000L});
	public static final BitSet FOLLOW_lExpr_in_lExpr809 = new BitSet(new long[]{0x0000000000000002L});
}
