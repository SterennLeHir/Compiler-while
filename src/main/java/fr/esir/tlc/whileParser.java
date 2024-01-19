// $ANTLR 3.5.1 C:\\Users\\slh35\\Downloads\\while.g 2024-01-19 22:56:37
package fr.esir.tlc;

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
		"Node_Left", "Node_List", "Node_Output", "Node_Params", "Node_Program", 
		"Node_Right", "Node_Tail", "Node_While", "Symbol", "Variable", "WS", "'%'", 
		"'('", "')'", "','", "':'", "':='", "';'", "'=?'", "'cons'", "'do'", "'else'", 
		"'fi'", "'for'", "'foreach'", "'function'", "'hd'", "'if'", "'in'", "'list'", 
		"'nil'", "'nop'", "'od'", "'read'", "'then'", "'tl'", "'while'", "'write'"
	};
	public static final int EOF=-1;
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
	public static final int T__56=56;
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
	public static final int Node_Program=23;
	public static final int Node_Right=24;
	public static final int Node_Tail=25;
	public static final int Node_While=26;
	public static final int Symbol=27;
	public static final int Variable=28;
	public static final int WS=29;

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
	@Override public String getGrammarFileName() { return "C:\\Users\\slh35\\Downloads\\while.g"; }


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// C:\\Users\\slh35\\Downloads\\while.g:54:1: program : ( function )+ -> ^( Node_Program ( function )+ ) ;
	public final whileParser.program_return program() throws RecognitionException {
		whileParser.program_return retval = new whileParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope function1 =null;

		RewriteRuleSubtreeStream stream_function=new RewriteRuleSubtreeStream(adaptor,"rule function");

		try {
			// C:\\Users\\slh35\\Downloads\\while.g:55:2: ( ( function )+ -> ^( Node_Program ( function )+ ) )
			// C:\\Users\\slh35\\Downloads\\while.g:55:4: ( function )+
			{
			// C:\\Users\\slh35\\Downloads\\while.g:55:4: ( function )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==44) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\slh35\\Downloads\\while.g:55:4: function
					{
					pushFollow(FOLLOW_function_in_program264);
					function1=function();
					state._fsp--;

					stream_function.add(function1.getTree());
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			// AST REWRITE
			// elements: function
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 55:14: -> ^( Node_Program ( function )+ )
			{
				// C:\\Users\\slh35\\Downloads\\while.g:55:17: ^( Node_Program ( function )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(Node_Program, "Node_Program"), root_1);
				if ( !(stream_function.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_function.hasNext() ) {
					adaptor.addChild(root_1, stream_function.nextTree());
				}
				stream_function.reset();

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
	// $ANTLR end "program"


	public static class function_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "function"
	// C:\\Users\\slh35\\Downloads\\while.g:56:1: function : 'function' Symbol ':' ( WS )* definition -> ^( Node_Function Symbol definition ) ;
	public final whileParser.function_return function() throws RecognitionException {
		whileParser.function_return retval = new whileParser.function_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal2=null;
		Token Symbol3=null;
		Token char_literal4=null;
		Token WS5=null;
		ParserRuleReturnScope definition6 =null;

		Object string_literal2_tree=null;
		Object Symbol3_tree=null;
		Object char_literal4_tree=null;
		Object WS5_tree=null;
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_Symbol=new RewriteRuleTokenStream(adaptor,"token Symbol");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"rule definition");

		try {
			// C:\\Users\\slh35\\Downloads\\while.g:57:2: ( 'function' Symbol ':' ( WS )* definition -> ^( Node_Function Symbol definition ) )
			// C:\\Users\\slh35\\Downloads\\while.g:57:4: 'function' Symbol ':' ( WS )* definition
			{
			string_literal2=(Token)match(input,44,FOLLOW_44_in_function283);  
			stream_44.add(string_literal2);

			Symbol3=(Token)match(input,Symbol,FOLLOW_Symbol_in_function285);  
			stream_Symbol.add(Symbol3);

			char_literal4=(Token)match(input,34,FOLLOW_34_in_function287);  
			stream_34.add(char_literal4);

			// C:\\Users\\slh35\\Downloads\\while.g:57:26: ( WS )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==WS) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\slh35\\Downloads\\while.g:57:26: WS
					{
					WS5=(Token)match(input,WS,FOLLOW_WS_in_function289);  
					stream_WS.add(WS5);

					}
					break;

				default :
					break loop2;
				}
			}

			pushFollow(FOLLOW_definition_in_function292);
			definition6=definition();
			state._fsp--;

			stream_definition.add(definition6.getTree());
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
			// 57:42: -> ^( Node_Function Symbol definition )
			{
				// C:\\Users\\slh35\\Downloads\\while.g:57:45: ^( Node_Function Symbol definition )
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
	// C:\\Users\\slh35\\Downloads\\while.g:59:1: definition : 'read' input ( WS )* '%' commands '%' ( WS )* 'write' output ( WS )* -> input commands output ;
	public final whileParser.definition_return definition() throws RecognitionException {
		whileParser.definition_return retval = new whileParser.definition_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal7=null;
		Token WS9=null;
		Token char_literal10=null;
		Token char_literal12=null;
		Token WS13=null;
		Token string_literal14=null;
		Token WS16=null;
		ParserRuleReturnScope input8 =null;
		ParserRuleReturnScope commands11 =null;
		ParserRuleReturnScope output15 =null;

		Object string_literal7_tree=null;
		Object WS9_tree=null;
		Object char_literal10_tree=null;
		Object char_literal12_tree=null;
		Object WS13_tree=null;
		Object string_literal14_tree=null;
		Object WS16_tree=null;
		RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
		RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");
		RewriteRuleSubtreeStream stream_input=new RewriteRuleSubtreeStream(adaptor,"rule input");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// C:\\Users\\slh35\\Downloads\\while.g:60:2: ( 'read' input ( WS )* '%' commands '%' ( WS )* 'write' output ( WS )* -> input commands output )
			// C:\\Users\\slh35\\Downloads\\while.g:60:4: 'read' input ( WS )* '%' commands '%' ( WS )* 'write' output ( WS )*
			{
			string_literal7=(Token)match(input,52,FOLLOW_52_in_definition317);  
			stream_52.add(string_literal7);

			pushFollow(FOLLOW_input_in_definition319);
			input8=input();
			state._fsp--;

			stream_input.add(input8.getTree());
			// C:\\Users\\slh35\\Downloads\\while.g:60:17: ( WS )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==WS) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\slh35\\Downloads\\while.g:60:17: WS
					{
					WS9=(Token)match(input,WS,FOLLOW_WS_in_definition321);  
					stream_WS.add(WS9);

					}
					break;

				default :
					break loop3;
				}
			}

			char_literal10=(Token)match(input,30,FOLLOW_30_in_definition324);  
			stream_30.add(char_literal10);

			pushFollow(FOLLOW_commands_in_definition326);
			commands11=commands();
			state._fsp--;

			stream_commands.add(commands11.getTree());
			char_literal12=(Token)match(input,30,FOLLOW_30_in_definition328);  
			stream_30.add(char_literal12);

			// C:\\Users\\slh35\\Downloads\\while.g:60:38: ( WS )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==WS) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\slh35\\Downloads\\while.g:60:38: WS
					{
					WS13=(Token)match(input,WS,FOLLOW_WS_in_definition330);  
					stream_WS.add(WS13);

					}
					break;

				default :
					break loop4;
				}
			}

			string_literal14=(Token)match(input,56,FOLLOW_56_in_definition333);  
			stream_56.add(string_literal14);

			pushFollow(FOLLOW_output_in_definition335);
			output15=output();
			state._fsp--;

			stream_output.add(output15.getTree());
			// C:\\Users\\slh35\\Downloads\\while.g:60:57: ( WS )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==WS) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\slh35\\Downloads\\while.g:60:57: WS
					{
					WS16=(Token)match(input,WS,FOLLOW_WS_in_definition337);  
					stream_WS.add(WS16);

					}
					break;

				default :
					break loop5;
				}
			}

			// AST REWRITE
			// elements: commands, input, output
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 60:61: -> input commands output
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
	// C:\\Users\\slh35\\Downloads\\while.g:61:1: input : ( inputSub )? -> ^( Node_Input ( inputSub )? ) ;
	public final whileParser.input_return input() throws RecognitionException {
		whileParser.input_return retval = new whileParser.input_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope inputSub17 =null;

		RewriteRuleSubtreeStream stream_inputSub=new RewriteRuleSubtreeStream(adaptor,"rule inputSub");

		try {
			// C:\\Users\\slh35\\Downloads\\while.g:62:2: ( ( inputSub )? -> ^( Node_Input ( inputSub )? ) )
			// C:\\Users\\slh35\\Downloads\\while.g:62:5: ( inputSub )?
			{
			// C:\\Users\\slh35\\Downloads\\while.g:62:5: ( inputSub )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==Variable) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\slh35\\Downloads\\while.g:62:5: inputSub
					{
					pushFollow(FOLLOW_inputSub_in_input358);
					inputSub17=inputSub();
					state._fsp--;

					stream_inputSub.add(inputSub17.getTree());
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
			// 62:15: -> ^( Node_Input ( inputSub )? )
			{
				// C:\\Users\\slh35\\Downloads\\while.g:62:17: ^( Node_Input ( inputSub )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(Node_Input, "Node_Input"), root_1);
				// C:\\Users\\slh35\\Downloads\\while.g:62:30: ( inputSub )?
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
	// C:\\Users\\slh35\\Downloads\\while.g:63:1: inputSub : Variable ( ',' Variable )* -> ( Variable )+ ;
	public final whileParser.inputSub_return inputSub() throws RecognitionException {
		whileParser.inputSub_return retval = new whileParser.inputSub_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Variable18=null;
		Token char_literal19=null;
		Token Variable20=null;

		Object Variable18_tree=null;
		Object char_literal19_tree=null;
		Object Variable20_tree=null;
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");

		try {
			// C:\\Users\\slh35\\Downloads\\while.g:64:2: ( Variable ( ',' Variable )* -> ( Variable )+ )
			// C:\\Users\\slh35\\Downloads\\while.g:64:4: Variable ( ',' Variable )*
			{
			Variable18=(Token)match(input,Variable,FOLLOW_Variable_in_inputSub376);  
			stream_Variable.add(Variable18);

			// C:\\Users\\slh35\\Downloads\\while.g:64:13: ( ',' Variable )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==33) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\slh35\\Downloads\\while.g:64:14: ',' Variable
					{
					char_literal19=(Token)match(input,33,FOLLOW_33_in_inputSub379);  
					stream_33.add(char_literal19);

					Variable20=(Token)match(input,Variable,FOLLOW_Variable_in_inputSub381);  
					stream_Variable.add(Variable20);

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
			// 64:28: -> ( Variable )+
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
	// C:\\Users\\slh35\\Downloads\\while.g:65:1: output : Variable ( ',' Variable )* -> ^( Node_Output ( Variable )+ ) ;
	public final whileParser.output_return output() throws RecognitionException {
		whileParser.output_return retval = new whileParser.output_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Variable21=null;
		Token char_literal22=null;
		Token Variable23=null;

		Object Variable21_tree=null;
		Object char_literal22_tree=null;
		Object Variable23_tree=null;
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");

		try {
			// C:\\Users\\slh35\\Downloads\\while.g:66:2: ( Variable ( ',' Variable )* -> ^( Node_Output ( Variable )+ ) )
			// C:\\Users\\slh35\\Downloads\\while.g:66:4: Variable ( ',' Variable )*
			{
			Variable21=(Token)match(input,Variable,FOLLOW_Variable_in_output398);  
			stream_Variable.add(Variable21);

			// C:\\Users\\slh35\\Downloads\\while.g:66:13: ( ',' Variable )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==33) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// C:\\Users\\slh35\\Downloads\\while.g:66:14: ',' Variable
					{
					char_literal22=(Token)match(input,33,FOLLOW_33_in_output401);  
					stream_33.add(char_literal22);

					Variable23=(Token)match(input,Variable,FOLLOW_Variable_in_output403);  
					stream_Variable.add(Variable23);

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
			// 66:29: -> ^( Node_Output ( Variable )+ )
			{
				// C:\\Users\\slh35\\Downloads\\while.g:66:32: ^( Node_Output ( Variable )+ )
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
	// C:\\Users\\slh35\\Downloads\\while.g:67:1: vars : Variable ( ',' Variable )* -> ^( Node_Left ( Variable )+ ) ;
	public final whileParser.vars_return vars() throws RecognitionException {
		whileParser.vars_return retval = new whileParser.vars_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Variable24=null;
		Token char_literal25=null;
		Token Variable26=null;

		Object Variable24_tree=null;
		Object char_literal25_tree=null;
		Object Variable26_tree=null;
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");

		try {
			// C:\\Users\\slh35\\Downloads\\while.g:68:2: ( Variable ( ',' Variable )* -> ^( Node_Left ( Variable )+ ) )
			// C:\\Users\\slh35\\Downloads\\while.g:68:4: Variable ( ',' Variable )*
			{
			Variable24=(Token)match(input,Variable,FOLLOW_Variable_in_vars424);  
			stream_Variable.add(Variable24);

			// C:\\Users\\slh35\\Downloads\\while.g:68:13: ( ',' Variable )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==33) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// C:\\Users\\slh35\\Downloads\\while.g:68:14: ',' Variable
					{
					char_literal25=(Token)match(input,33,FOLLOW_33_in_vars427);  
					stream_33.add(char_literal25);

					Variable26=(Token)match(input,Variable,FOLLOW_Variable_in_vars429);  
					stream_Variable.add(Variable26);

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
			// 68:29: -> ^( Node_Left ( Variable )+ )
			{
				// C:\\Users\\slh35\\Downloads\\while.g:68:32: ^( Node_Left ( Variable )+ )
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
	// C:\\Users\\slh35\\Downloads\\while.g:69:1: exprs : expression ( ',' expression )* -> ^( Node_Right ( expression )+ ) ;
	public final whileParser.exprs_return exprs() throws RecognitionException {
		whileParser.exprs_return retval = new whileParser.exprs_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal28=null;
		ParserRuleReturnScope expression27 =null;
		ParserRuleReturnScope expression29 =null;

		Object char_literal28_tree=null;
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// C:\\Users\\slh35\\Downloads\\while.g:70:2: ( expression ( ',' expression )* -> ^( Node_Right ( expression )+ ) )
			// C:\\Users\\slh35\\Downloads\\while.g:70:4: expression ( ',' expression )*
			{
			pushFollow(FOLLOW_expression_in_exprs449);
			expression27=expression();
			state._fsp--;

			stream_expression.add(expression27.getTree());
			// C:\\Users\\slh35\\Downloads\\while.g:70:15: ( ',' expression )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==33) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// C:\\Users\\slh35\\Downloads\\while.g:70:16: ',' expression
					{
					char_literal28=(Token)match(input,33,FOLLOW_33_in_exprs452);  
					stream_33.add(char_literal28);

					pushFollow(FOLLOW_expression_in_exprs454);
					expression29=expression();
					state._fsp--;

					stream_expression.add(expression29.getTree());
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
			// 70:33: -> ^( Node_Right ( expression )+ )
			{
				// C:\\Users\\slh35\\Downloads\\while.g:70:36: ^( Node_Right ( expression )+ )
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
	// C:\\Users\\slh35\\Downloads\\while.g:71:1: commands : ( WS )* command ( ';' command )* ( WS )* -> ^( Node_Bloc ( command )+ ) ;
	public final whileParser.commands_return commands() throws RecognitionException {
		whileParser.commands_return retval = new whileParser.commands_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WS30=null;
		Token char_literal32=null;
		Token WS34=null;
		ParserRuleReturnScope command31 =null;
		ParserRuleReturnScope command33 =null;

		Object WS30_tree=null;
		Object char_literal32_tree=null;
		Object WS34_tree=null;
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_command=new RewriteRuleSubtreeStream(adaptor,"rule command");

		try {
			// C:\\Users\\slh35\\Downloads\\while.g:72:2: ( ( WS )* command ( ';' command )* ( WS )* -> ^( Node_Bloc ( command )+ ) )
			// C:\\Users\\slh35\\Downloads\\while.g:72:4: ( WS )* command ( ';' command )* ( WS )*
			{
			// C:\\Users\\slh35\\Downloads\\while.g:72:4: ( WS )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==WS) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// C:\\Users\\slh35\\Downloads\\while.g:72:4: WS
					{
					WS30=(Token)match(input,WS,FOLLOW_WS_in_commands475);  
					stream_WS.add(WS30);

					}
					break;

				default :
					break loop11;
				}
			}

			pushFollow(FOLLOW_command_in_commands478);
			command31=command();
			state._fsp--;

			stream_command.add(command31.getTree());
			// C:\\Users\\slh35\\Downloads\\while.g:72:16: ( ';' command )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==36) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// C:\\Users\\slh35\\Downloads\\while.g:72:17: ';' command
					{
					char_literal32=(Token)match(input,36,FOLLOW_36_in_commands481);  
					stream_36.add(char_literal32);

					pushFollow(FOLLOW_command_in_commands483);
					command33=command();
					state._fsp--;

					stream_command.add(command33.getTree());
					}
					break;

				default :
					break loop12;
				}
			}

			// C:\\Users\\slh35\\Downloads\\while.g:72:31: ( WS )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==WS) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// C:\\Users\\slh35\\Downloads\\while.g:72:31: WS
					{
					WS34=(Token)match(input,WS,FOLLOW_WS_in_commands487);  
					stream_WS.add(WS34);

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
			// 72:35: -> ^( Node_Bloc ( command )+ )
			{
				// C:\\Users\\slh35\\Downloads\\while.g:72:38: ^( Node_Bloc ( command )+ )
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
	// C:\\Users\\slh35\\Downloads\\while.g:73:1: command : ( 'foreach' Variable 'in' expression 'do' commands 'od' -> ^( Node_ForEach expression commands ) | 'for' expression 'do' commands 'od' -> ^( Node_For expression commands ) | 'while' expression 'do' commands 'od' -> ^( Node_While expression commands ) | 'if' expression 'then' commands ( 'else' commands )? 'fi' -> ^( Node_If expression commands ( ^( Node_Else commands ) )? ) | 'nop' | vars ':=' exprs -> ^( Node_Affectation vars exprs ) );
	public final whileParser.command_return command() throws RecognitionException {
		whileParser.command_return retval = new whileParser.command_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal35=null;
		Token Variable36=null;
		Token string_literal37=null;
		Token string_literal39=null;
		Token string_literal41=null;
		Token string_literal42=null;
		Token string_literal44=null;
		Token string_literal46=null;
		Token string_literal47=null;
		Token string_literal49=null;
		Token string_literal51=null;
		Token string_literal52=null;
		Token string_literal54=null;
		Token string_literal56=null;
		Token string_literal58=null;
		Token string_literal59=null;
		Token string_literal61=null;
		ParserRuleReturnScope expression38 =null;
		ParserRuleReturnScope commands40 =null;
		ParserRuleReturnScope expression43 =null;
		ParserRuleReturnScope commands45 =null;
		ParserRuleReturnScope expression48 =null;
		ParserRuleReturnScope commands50 =null;
		ParserRuleReturnScope expression53 =null;
		ParserRuleReturnScope commands55 =null;
		ParserRuleReturnScope commands57 =null;
		ParserRuleReturnScope vars60 =null;
		ParserRuleReturnScope exprs62 =null;

		Object string_literal35_tree=null;
		Object Variable36_tree=null;
		Object string_literal37_tree=null;
		Object string_literal39_tree=null;
		Object string_literal41_tree=null;
		Object string_literal42_tree=null;
		Object string_literal44_tree=null;
		Object string_literal46_tree=null;
		Object string_literal47_tree=null;
		Object string_literal49_tree=null;
		Object string_literal51_tree=null;
		Object string_literal52_tree=null;
		Object string_literal54_tree=null;
		Object string_literal56_tree=null;
		Object string_literal58_tree=null;
		Object string_literal59_tree=null;
		Object string_literal61_tree=null;
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");
		RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// C:\\Users\\slh35\\Downloads\\while.g:74:2: ( 'foreach' Variable 'in' expression 'do' commands 'od' -> ^( Node_ForEach expression commands ) | 'for' expression 'do' commands 'od' -> ^( Node_For expression commands ) | 'while' expression 'do' commands 'od' -> ^( Node_While expression commands ) | 'if' expression 'then' commands ( 'else' commands )? 'fi' -> ^( Node_If expression commands ( ^( Node_Else commands ) )? ) | 'nop' | vars ':=' exprs -> ^( Node_Affectation vars exprs ) )
			int alt15=6;
			switch ( input.LA(1) ) {
			case 43:
				{
				alt15=1;
				}
				break;
			case 42:
				{
				alt15=2;
				}
				break;
			case 55:
				{
				alt15=3;
				}
				break;
			case 46:
				{
				alt15=4;
				}
				break;
			case 50:
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
					// C:\\Users\\slh35\\Downloads\\while.g:74:4: 'foreach' Variable 'in' expression 'do' commands 'od'
					{
					string_literal35=(Token)match(input,43,FOLLOW_43_in_command512);  
					stream_43.add(string_literal35);

					Variable36=(Token)match(input,Variable,FOLLOW_Variable_in_command514);  
					stream_Variable.add(Variable36);

					string_literal37=(Token)match(input,47,FOLLOW_47_in_command516);  
					stream_47.add(string_literal37);

					pushFollow(FOLLOW_expression_in_command518);
					expression38=expression();
					state._fsp--;

					stream_expression.add(expression38.getTree());
					string_literal39=(Token)match(input,39,FOLLOW_39_in_command520);  
					stream_39.add(string_literal39);

					pushFollow(FOLLOW_commands_in_command522);
					commands40=commands();
					state._fsp--;

					stream_commands.add(commands40.getTree());
					string_literal41=(Token)match(input,51,FOLLOW_51_in_command524);  
					stream_51.add(string_literal41);

					// AST REWRITE
					// elements: commands, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 74:58: -> ^( Node_ForEach expression commands )
					{
						// C:\\Users\\slh35\\Downloads\\while.g:74:61: ^( Node_ForEach expression commands )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(Node_ForEach, "Node_ForEach"), root_1);
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_1, stream_commands.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// C:\\Users\\slh35\\Downloads\\while.g:75:5: 'for' expression 'do' commands 'od'
					{
					string_literal42=(Token)match(input,42,FOLLOW_42_in_command540);  
					stream_42.add(string_literal42);

					pushFollow(FOLLOW_expression_in_command542);
					expression43=expression();
					state._fsp--;

					stream_expression.add(expression43.getTree());
					string_literal44=(Token)match(input,39,FOLLOW_39_in_command544);  
					stream_39.add(string_literal44);

					pushFollow(FOLLOW_commands_in_command546);
					commands45=commands();
					state._fsp--;

					stream_commands.add(commands45.getTree());
					string_literal46=(Token)match(input,51,FOLLOW_51_in_command548);  
					stream_51.add(string_literal46);

					// AST REWRITE
					// elements: commands, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 75:41: -> ^( Node_For expression commands )
					{
						// C:\\Users\\slh35\\Downloads\\while.g:75:44: ^( Node_For expression commands )
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
					// C:\\Users\\slh35\\Downloads\\while.g:76:5: 'while' expression 'do' commands 'od'
					{
					string_literal47=(Token)match(input,55,FOLLOW_55_in_command564);  
					stream_55.add(string_literal47);

					pushFollow(FOLLOW_expression_in_command566);
					expression48=expression();
					state._fsp--;

					stream_expression.add(expression48.getTree());
					string_literal49=(Token)match(input,39,FOLLOW_39_in_command568);  
					stream_39.add(string_literal49);

					pushFollow(FOLLOW_commands_in_command570);
					commands50=commands();
					state._fsp--;

					stream_commands.add(commands50.getTree());
					string_literal51=(Token)match(input,51,FOLLOW_51_in_command572);  
					stream_51.add(string_literal51);

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
					// 76:43: -> ^( Node_While expression commands )
					{
						// C:\\Users\\slh35\\Downloads\\while.g:76:46: ^( Node_While expression commands )
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
					// C:\\Users\\slh35\\Downloads\\while.g:77:5: 'if' expression 'then' commands ( 'else' commands )? 'fi'
					{
					string_literal52=(Token)match(input,46,FOLLOW_46_in_command588);  
					stream_46.add(string_literal52);

					pushFollow(FOLLOW_expression_in_command590);
					expression53=expression();
					state._fsp--;

					stream_expression.add(expression53.getTree());
					string_literal54=(Token)match(input,53,FOLLOW_53_in_command592);  
					stream_53.add(string_literal54);

					pushFollow(FOLLOW_commands_in_command595);
					commands55=commands();
					state._fsp--;

					stream_commands.add(commands55.getTree());
					// C:\\Users\\slh35\\Downloads\\while.g:77:38: ( 'else' commands )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==40) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// C:\\Users\\slh35\\Downloads\\while.g:77:39: 'else' commands
							{
							string_literal56=(Token)match(input,40,FOLLOW_40_in_command598);  
							stream_40.add(string_literal56);

							pushFollow(FOLLOW_commands_in_command600);
							commands57=commands();
							state._fsp--;

							stream_commands.add(commands57.getTree());
							}
							break;

					}

					string_literal58=(Token)match(input,41,FOLLOW_41_in_command604);  
					stream_41.add(string_literal58);

					// AST REWRITE
					// elements: commands, commands, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 77:62: -> ^( Node_If expression commands ( ^( Node_Else commands ) )? )
					{
						// C:\\Users\\slh35\\Downloads\\while.g:77:65: ^( Node_If expression commands ( ^( Node_Else commands ) )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(Node_If, "Node_If"), root_1);
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_1, stream_commands.nextTree());
						// C:\\Users\\slh35\\Downloads\\while.g:77:95: ( ^( Node_Else commands ) )?
						if ( stream_commands.hasNext() ) {
							// C:\\Users\\slh35\\Downloads\\while.g:77:95: ^( Node_Else commands )
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
					// C:\\Users\\slh35\\Downloads\\while.g:78:5: 'nop'
					{
					root_0 = (Object)adaptor.nil();


					string_literal59=(Token)match(input,50,FOLLOW_50_in_command627); 
					string_literal59_tree = (Object)adaptor.create(string_literal59);
					adaptor.addChild(root_0, string_literal59_tree);

					}
					break;
				case 6 :
					// C:\\Users\\slh35\\Downloads\\while.g:79:5: vars ':=' exprs
					{
					pushFollow(FOLLOW_vars_in_command633);
					vars60=vars();
					state._fsp--;

					stream_vars.add(vars60.getTree());
					string_literal61=(Token)match(input,35,FOLLOW_35_in_command635);  
					stream_35.add(string_literal61);

					pushFollow(FOLLOW_exprs_in_command637);
					exprs62=exprs();
					state._fsp--;

					stream_exprs.add(exprs62.getTree());
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
					// 79:21: -> ^( Node_Affectation vars exprs )
					{
						// C:\\Users\\slh35\\Downloads\\while.g:79:24: ^( Node_Affectation vars exprs )
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
	// C:\\Users\\slh35\\Downloads\\while.g:81:1: exprBase : ( '(' Symbol ( lExpr )? ')' -> ^( Node_Call Symbol ^( Node_Params ( lExpr )? ) ) | '(' 'hd' exprBase ')' -> ^( Node_Head exprBase ) | '(' 'tl' exprBase ')' -> ^( Node_Tail exprBase ) | '(' 'cons' ( lExpr )? ')' -> ^( Node_Cons ( lExpr )? ) | '(' 'list' ( lExpr )? ')' -> ^( Node_List ( lExpr )? ) | 'nil' | Variable | Symbol );
	public final whileParser.exprBase_return exprBase() throws RecognitionException {
		whileParser.exprBase_return retval = new whileParser.exprBase_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal63=null;
		Token Symbol64=null;
		Token char_literal66=null;
		Token char_literal67=null;
		Token string_literal68=null;
		Token char_literal70=null;
		Token char_literal71=null;
		Token string_literal72=null;
		Token char_literal74=null;
		Token char_literal75=null;
		Token string_literal76=null;
		Token char_literal78=null;
		Token char_literal79=null;
		Token string_literal80=null;
		Token char_literal82=null;
		Token string_literal83=null;
		Token Variable84=null;
		Token Symbol85=null;
		ParserRuleReturnScope lExpr65 =null;
		ParserRuleReturnScope exprBase69 =null;
		ParserRuleReturnScope exprBase73 =null;
		ParserRuleReturnScope lExpr77 =null;
		ParserRuleReturnScope lExpr81 =null;

		Object char_literal63_tree=null;
		Object Symbol64_tree=null;
		Object char_literal66_tree=null;
		Object char_literal67_tree=null;
		Object string_literal68_tree=null;
		Object char_literal70_tree=null;
		Object char_literal71_tree=null;
		Object string_literal72_tree=null;
		Object char_literal74_tree=null;
		Object char_literal75_tree=null;
		Object string_literal76_tree=null;
		Object char_literal78_tree=null;
		Object char_literal79_tree=null;
		Object string_literal80_tree=null;
		Object char_literal82_tree=null;
		Object string_literal83_tree=null;
		Object Variable84_tree=null;
		Object Symbol85_tree=null;
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_Symbol=new RewriteRuleTokenStream(adaptor,"token Symbol");
		RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
		RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");
		RewriteRuleSubtreeStream stream_lExpr=new RewriteRuleSubtreeStream(adaptor,"rule lExpr");

		try {
			// C:\\Users\\slh35\\Downloads\\while.g:82:3: ( '(' Symbol ( lExpr )? ')' -> ^( Node_Call Symbol ^( Node_Params ( lExpr )? ) ) | '(' 'hd' exprBase ')' -> ^( Node_Head exprBase ) | '(' 'tl' exprBase ')' -> ^( Node_Tail exprBase ) | '(' 'cons' ( lExpr )? ')' -> ^( Node_Cons ( lExpr )? ) | '(' 'list' ( lExpr )? ')' -> ^( Node_List ( lExpr )? ) | 'nil' | Variable | Symbol )
			int alt19=8;
			switch ( input.LA(1) ) {
			case 31:
				{
				switch ( input.LA(2) ) {
				case Symbol:
					{
					alt19=1;
					}
					break;
				case 45:
					{
					alt19=2;
					}
					break;
				case 54:
					{
					alt19=3;
					}
					break;
				case 38:
					{
					alt19=4;
					}
					break;
				case 48:
					{
					alt19=5;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 19, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 49:
				{
				alt19=6;
				}
				break;
			case Variable:
				{
				alt19=7;
				}
				break;
			case Symbol:
				{
				alt19=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}
			switch (alt19) {
				case 1 :
					// C:\\Users\\slh35\\Downloads\\while.g:82:5: '(' Symbol ( lExpr )? ')'
					{
					char_literal63=(Token)match(input,31,FOLLOW_31_in_exprBase667);  
					stream_31.add(char_literal63);

					Symbol64=(Token)match(input,Symbol,FOLLOW_Symbol_in_exprBase669);  
					stream_Symbol.add(Symbol64);

					// C:\\Users\\slh35\\Downloads\\while.g:82:16: ( lExpr )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( ((LA16_0 >= Symbol && LA16_0 <= Variable)||LA16_0==31||LA16_0==49) ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// C:\\Users\\slh35\\Downloads\\while.g:82:16: lExpr
							{
							pushFollow(FOLLOW_lExpr_in_exprBase671);
							lExpr65=lExpr();
							state._fsp--;

							stream_lExpr.add(lExpr65.getTree());
							}
							break;

					}

					char_literal66=(Token)match(input,32,FOLLOW_32_in_exprBase674);  
					stream_32.add(char_literal66);

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
					// 82:27: -> ^( Node_Call Symbol ^( Node_Params ( lExpr )? ) )
					{
						// C:\\Users\\slh35\\Downloads\\while.g:82:30: ^( Node_Call Symbol ^( Node_Params ( lExpr )? ) )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(Node_Call, "Node_Call"), root_1);
						adaptor.addChild(root_1, stream_Symbol.nextNode());
						// C:\\Users\\slh35\\Downloads\\while.g:82:49: ^( Node_Params ( lExpr )? )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(Node_Params, "Node_Params"), root_2);
						// C:\\Users\\slh35\\Downloads\\while.g:82:63: ( lExpr )?
						if ( stream_lExpr.hasNext() ) {
							adaptor.addChild(root_2, stream_lExpr.nextTree());
						}
						stream_lExpr.reset();

						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// C:\\Users\\slh35\\Downloads\\while.g:83:5: '(' 'hd' exprBase ')'
					{
					char_literal67=(Token)match(input,31,FOLLOW_31_in_exprBase695);  
					stream_31.add(char_literal67);

					string_literal68=(Token)match(input,45,FOLLOW_45_in_exprBase697);  
					stream_45.add(string_literal68);

					pushFollow(FOLLOW_exprBase_in_exprBase699);
					exprBase69=exprBase();
					state._fsp--;

					stream_exprBase.add(exprBase69.getTree());
					char_literal70=(Token)match(input,32,FOLLOW_32_in_exprBase701);  
					stream_32.add(char_literal70);

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
					// 83:27: -> ^( Node_Head exprBase )
					{
						// C:\\Users\\slh35\\Downloads\\while.g:83:31: ^( Node_Head exprBase )
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
					// C:\\Users\\slh35\\Downloads\\while.g:84:5: '(' 'tl' exprBase ')'
					{
					char_literal71=(Token)match(input,31,FOLLOW_31_in_exprBase716);  
					stream_31.add(char_literal71);

					string_literal72=(Token)match(input,54,FOLLOW_54_in_exprBase718);  
					stream_54.add(string_literal72);

					pushFollow(FOLLOW_exprBase_in_exprBase720);
					exprBase73=exprBase();
					state._fsp--;

					stream_exprBase.add(exprBase73.getTree());
					char_literal74=(Token)match(input,32,FOLLOW_32_in_exprBase722);  
					stream_32.add(char_literal74);

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
					// 84:27: -> ^( Node_Tail exprBase )
					{
						// C:\\Users\\slh35\\Downloads\\while.g:84:30: ^( Node_Tail exprBase )
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
					// C:\\Users\\slh35\\Downloads\\while.g:85:5: '(' 'cons' ( lExpr )? ')'
					{
					char_literal75=(Token)match(input,31,FOLLOW_31_in_exprBase736);  
					stream_31.add(char_literal75);

					string_literal76=(Token)match(input,38,FOLLOW_38_in_exprBase738);  
					stream_38.add(string_literal76);

					// C:\\Users\\slh35\\Downloads\\while.g:85:16: ( lExpr )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( ((LA17_0 >= Symbol && LA17_0 <= Variable)||LA17_0==31||LA17_0==49) ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// C:\\Users\\slh35\\Downloads\\while.g:85:16: lExpr
							{
							pushFollow(FOLLOW_lExpr_in_exprBase740);
							lExpr77=lExpr();
							state._fsp--;

							stream_lExpr.add(lExpr77.getTree());
							}
							break;

					}

					char_literal78=(Token)match(input,32,FOLLOW_32_in_exprBase743);  
					stream_32.add(char_literal78);

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
					// 85:27: -> ^( Node_Cons ( lExpr )? )
					{
						// C:\\Users\\slh35\\Downloads\\while.g:85:30: ^( Node_Cons ( lExpr )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(Node_Cons, "Node_Cons"), root_1);
						// C:\\Users\\slh35\\Downloads\\while.g:85:42: ( lExpr )?
						if ( stream_lExpr.hasNext() ) {
							adaptor.addChild(root_1, stream_lExpr.nextTree());
						}
						stream_lExpr.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// C:\\Users\\slh35\\Downloads\\while.g:86:5: '(' 'list' ( lExpr )? ')'
					{
					char_literal79=(Token)match(input,31,FOLLOW_31_in_exprBase758);  
					stream_31.add(char_literal79);

					string_literal80=(Token)match(input,48,FOLLOW_48_in_exprBase760);  
					stream_48.add(string_literal80);

					// C:\\Users\\slh35\\Downloads\\while.g:86:16: ( lExpr )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( ((LA18_0 >= Symbol && LA18_0 <= Variable)||LA18_0==31||LA18_0==49) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// C:\\Users\\slh35\\Downloads\\while.g:86:16: lExpr
							{
							pushFollow(FOLLOW_lExpr_in_exprBase762);
							lExpr81=lExpr();
							state._fsp--;

							stream_lExpr.add(lExpr81.getTree());
							}
							break;

					}

					char_literal82=(Token)match(input,32,FOLLOW_32_in_exprBase765);  
					stream_32.add(char_literal82);

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
					// 86:27: -> ^( Node_List ( lExpr )? )
					{
						// C:\\Users\\slh35\\Downloads\\while.g:86:30: ^( Node_List ( lExpr )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(Node_List, "Node_List"), root_1);
						// C:\\Users\\slh35\\Downloads\\while.g:86:42: ( lExpr )?
						if ( stream_lExpr.hasNext() ) {
							adaptor.addChild(root_1, stream_lExpr.nextTree());
						}
						stream_lExpr.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					// C:\\Users\\slh35\\Downloads\\while.g:87:5: 'nil'
					{
					root_0 = (Object)adaptor.nil();


					string_literal83=(Token)match(input,49,FOLLOW_49_in_exprBase780); 
					string_literal83_tree = (Object)adaptor.create(string_literal83);
					adaptor.addChild(root_0, string_literal83_tree);

					}
					break;
				case 7 :
					// C:\\Users\\slh35\\Downloads\\while.g:88:5: Variable
					{
					root_0 = (Object)adaptor.nil();


					Variable84=(Token)match(input,Variable,FOLLOW_Variable_in_exprBase787); 
					Variable84_tree = (Object)adaptor.create(Variable84);
					adaptor.addChild(root_0, Variable84_tree);

					}
					break;
				case 8 :
					// C:\\Users\\slh35\\Downloads\\while.g:89:5: Symbol
					{
					root_0 = (Object)adaptor.nil();


					Symbol85=(Token)match(input,Symbol,FOLLOW_Symbol_in_exprBase793); 
					Symbol85_tree = (Object)adaptor.create(Symbol85);
					adaptor.addChild(root_0, Symbol85_tree);

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
	// C:\\Users\\slh35\\Downloads\\while.g:90:1: expression : exprBase ( '=?' exprBase )? ;
	public final whileParser.expression_return expression() throws RecognitionException {
		whileParser.expression_return retval = new whileParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal87=null;
		ParserRuleReturnScope exprBase86 =null;
		ParserRuleReturnScope exprBase88 =null;

		Object string_literal87_tree=null;

		try {
			// C:\\Users\\slh35\\Downloads\\while.g:91:2: ( exprBase ( '=?' exprBase )? )
			// C:\\Users\\slh35\\Downloads\\while.g:91:4: exprBase ( '=?' exprBase )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_exprBase_in_expression801);
			exprBase86=exprBase();
			state._fsp--;

			adaptor.addChild(root_0, exprBase86.getTree());

			// C:\\Users\\slh35\\Downloads\\while.g:91:13: ( '=?' exprBase )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==37) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// C:\\Users\\slh35\\Downloads\\while.g:91:14: '=?' exprBase
					{
					string_literal87=(Token)match(input,37,FOLLOW_37_in_expression804); 
					string_literal87_tree = (Object)adaptor.create(string_literal87);
					adaptor.addChild(root_0, string_literal87_tree);

					pushFollow(FOLLOW_exprBase_in_expression806);
					exprBase88=exprBase();
					state._fsp--;

					adaptor.addChild(root_0, exprBase88.getTree());

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
	// C:\\Users\\slh35\\Downloads\\while.g:92:1: lExpr : ( exprBase )+ ;
	public final whileParser.lExpr_return lExpr() throws RecognitionException {
		whileParser.lExpr_return retval = new whileParser.lExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope exprBase89 =null;


		try {
			// C:\\Users\\slh35\\Downloads\\while.g:93:2: ( ( exprBase )+ )
			// C:\\Users\\slh35\\Downloads\\while.g:93:4: ( exprBase )+
			{
			root_0 = (Object)adaptor.nil();


			// C:\\Users\\slh35\\Downloads\\while.g:93:4: ( exprBase )+
			int cnt21=0;
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( ((LA21_0 >= Symbol && LA21_0 <= Variable)||LA21_0==31||LA21_0==49) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// C:\\Users\\slh35\\Downloads\\while.g:93:4: exprBase
					{
					pushFollow(FOLLOW_exprBase_in_lExpr818);
					exprBase89=exprBase();
					state._fsp--;

					adaptor.addChild(root_0, exprBase89.getTree());

					}
					break;

				default :
					if ( cnt21 >= 1 ) break loop21;
					EarlyExitException eee = new EarlyExitException(21, input);
					throw eee;
				}
				cnt21++;
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



	public static final BitSet FOLLOW_function_in_program264 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_44_in_function283 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_Symbol_in_function285 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_function287 = new BitSet(new long[]{0x0010000020000000L});
	public static final BitSet FOLLOW_WS_in_function289 = new BitSet(new long[]{0x0010000020000000L});
	public static final BitSet FOLLOW_definition_in_function292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_definition317 = new BitSet(new long[]{0x0000000070000000L});
	public static final BitSet FOLLOW_input_in_definition319 = new BitSet(new long[]{0x0000000060000000L});
	public static final BitSet FOLLOW_WS_in_definition321 = new BitSet(new long[]{0x0000000060000000L});
	public static final BitSet FOLLOW_30_in_definition324 = new BitSet(new long[]{0x00844C0030000000L});
	public static final BitSet FOLLOW_commands_in_definition326 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_definition328 = new BitSet(new long[]{0x0100000020000000L});
	public static final BitSet FOLLOW_WS_in_definition330 = new BitSet(new long[]{0x0100000020000000L});
	public static final BitSet FOLLOW_56_in_definition333 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_output_in_definition335 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_WS_in_definition337 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_inputSub_in_input358 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_inputSub376 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_33_in_inputSub379 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_Variable_in_inputSub381 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_Variable_in_output398 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_33_in_output401 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_Variable_in_output403 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_Variable_in_vars424 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_33_in_vars427 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_Variable_in_vars429 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_expression_in_exprs449 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_33_in_exprs452 = new BitSet(new long[]{0x0002000098000000L});
	public static final BitSet FOLLOW_expression_in_exprs454 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_WS_in_commands475 = new BitSet(new long[]{0x00844C0030000000L});
	public static final BitSet FOLLOW_command_in_commands478 = new BitSet(new long[]{0x0000001020000002L});
	public static final BitSet FOLLOW_36_in_commands481 = new BitSet(new long[]{0x00844C0010000000L});
	public static final BitSet FOLLOW_command_in_commands483 = new BitSet(new long[]{0x0000001020000002L});
	public static final BitSet FOLLOW_WS_in_commands487 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_43_in_command512 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_Variable_in_command514 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_command516 = new BitSet(new long[]{0x0002000098000000L});
	public static final BitSet FOLLOW_expression_in_command518 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_command520 = new BitSet(new long[]{0x00844C0030000000L});
	public static final BitSet FOLLOW_commands_in_command522 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_command524 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_command540 = new BitSet(new long[]{0x0002000098000000L});
	public static final BitSet FOLLOW_expression_in_command542 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_command544 = new BitSet(new long[]{0x00844C0030000000L});
	public static final BitSet FOLLOW_commands_in_command546 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_command548 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_command564 = new BitSet(new long[]{0x0002000098000000L});
	public static final BitSet FOLLOW_expression_in_command566 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_command568 = new BitSet(new long[]{0x00844C0030000000L});
	public static final BitSet FOLLOW_commands_in_command570 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_command572 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_command588 = new BitSet(new long[]{0x0002000098000000L});
	public static final BitSet FOLLOW_expression_in_command590 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_53_in_command592 = new BitSet(new long[]{0x00844C0030000000L});
	public static final BitSet FOLLOW_commands_in_command595 = new BitSet(new long[]{0x0000030000000000L});
	public static final BitSet FOLLOW_40_in_command598 = new BitSet(new long[]{0x00844C0030000000L});
	public static final BitSet FOLLOW_commands_in_command600 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_command604 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_command627 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vars_in_command633 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_command635 = new BitSet(new long[]{0x0002000098000000L});
	public static final BitSet FOLLOW_exprs_in_command637 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_exprBase667 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_Symbol_in_exprBase669 = new BitSet(new long[]{0x0002000198000000L});
	public static final BitSet FOLLOW_lExpr_in_exprBase671 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_exprBase674 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_exprBase695 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_exprBase697 = new BitSet(new long[]{0x0002000098000000L});
	public static final BitSet FOLLOW_exprBase_in_exprBase699 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_exprBase701 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_exprBase716 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_exprBase718 = new BitSet(new long[]{0x0002000098000000L});
	public static final BitSet FOLLOW_exprBase_in_exprBase720 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_exprBase722 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_exprBase736 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_exprBase738 = new BitSet(new long[]{0x0002000198000000L});
	public static final BitSet FOLLOW_lExpr_in_exprBase740 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_exprBase743 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_exprBase758 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_exprBase760 = new BitSet(new long[]{0x0002000198000000L});
	public static final BitSet FOLLOW_lExpr_in_exprBase762 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_exprBase765 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_exprBase780 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_exprBase787 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Symbol_in_exprBase793 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprBase_in_expression801 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_37_in_expression804 = new BitSet(new long[]{0x0002000098000000L});
	public static final BitSet FOLLOW_exprBase_in_expression806 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprBase_in_lExpr818 = new BitSet(new long[]{0x0002000098000002L});
}
