// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g 2023-12-04 10:20:04

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class whileLexer extends Lexer {
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

    public whileLexer() {;} 
    public whileLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public whileLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g"; }

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:3:7: ( 'function' )
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:3:9: 'function'
            {
            match("function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:4:7: ( ':' )
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:4:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:5:7: ( 'read' )
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:5:9: 'read'
            {
            match("read"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:6:7: ( '%' )
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:6:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:7:7: ( 'write' )
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:7:9: 'write'
            {
            match("write"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:8:7: ( ',' )
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:8:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:9:7: ( ';' )
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:9:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:10:7: ( 'foreach' )
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:10:9: 'foreach'
            {
            match("foreach"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:11:7: ( 'in' )
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:11:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:12:7: ( 'do' )
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:12:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:13:7: ( 'od' )
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:13:9: 'od'
            {
            match("od"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:14:7: ( 'for' )
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:14:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:15:7: ( 'while' )
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:15:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:16:7: ( 'if' )
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:16:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:17:7: ( 'then' )
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:17:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:18:7: ( 'else' )
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:18:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:19:7: ( 'fi' )
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:19:9: 'fi'
            {
            match("fi"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:20:7: ( 'nop' )
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:20:9: 'nop'
            {
            match("nop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:21:7: ( ':=' )
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:21:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:22:7: ( '(' )
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:22:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:23:7: ( ')' )
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:23:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:24:7: ( 'hd' )
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:24:9: 'hd'
            {
            match("hd"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:25:7: ( 'tl' )
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:25:9: 'tl'
            {
            match("tl"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:26:7: ( 'cons' )
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:26:9: 'cons'
            {
            match("cons"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:27:7: ( 'list' )
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:27:9: 'list'
            {
            match("list"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:28:7: ( 'nil' )
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:28:9: 'nil'
            {
            match("nil"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:29:7: ( '=?' )
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:29:9: '=?'
            {
            match("=?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "Maj"
    public final void mMaj() throws RecognitionException {
        try {
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:30:2: ( 'A' .. 'Z' )
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:30:4: 'A' .. 'Z'
            {
            matchRange('A','Z'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "Maj"

    // $ANTLR start "Min"
    public final void mMin() throws RecognitionException {
        try {
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:32:2: ( 'a' .. 'z' )
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:32:4: 'a' .. 'z'
            {
            matchRange('a','z'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "Min"

    // $ANTLR start "Dec"
    public final void mDec() throws RecognitionException {
        try {
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:34:2: ( '0' .. '9' )
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:34:4: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "Dec"

    // $ANTLR start "Variable"
    public final void mVariable() throws RecognitionException {
        try {
            int _type = Variable;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:37:17: ( Maj ( Maj | Min | Dec )* ( '!' | '?' )? )
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:37:19: Maj ( Maj | Min | Dec )* ( '!' | '?' )?
            {
            mMaj(); 
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:37:22: ( Maj | Min | Dec )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:37:36: ( '!' | '?' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='!'||LA2_0=='?') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:
                    {
                    if ( input.LA(1)=='!'||input.LA(1)=='?' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Variable"

    // $ANTLR start "Symbol"
    public final void mSymbol() throws RecognitionException {
        try {
            int _type = Symbol;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:39:17: ( Min ( Maj | Min | Dec )* ( '!' | '?' )? )
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:39:19: Min ( Maj | Min | Dec )* ( '!' | '?' )?
            {
            mMin(); 
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:39:22: ( Maj | Min | Dec )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:39:36: ( '!' | '?' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='!'||LA4_0=='?') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:
                    {
                    if ( input.LA(1)=='!'||input.LA(1)=='?' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Symbol"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:41:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:41:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:1:8: ( T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | Variable | Symbol | WS )
        int alt5=30;
        alt5 = dfa5.predict(input);
        switch (alt5) {
            case 1 :
                // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:1:10: T__26
                {
                mT__26(); 

                }
                break;
            case 2 :
                // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:1:16: T__27
                {
                mT__27(); 

                }
                break;
            case 3 :
                // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:1:22: T__28
                {
                mT__28(); 

                }
                break;
            case 4 :
                // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:1:28: T__29
                {
                mT__29(); 

                }
                break;
            case 5 :
                // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:1:34: T__30
                {
                mT__30(); 

                }
                break;
            case 6 :
                // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:1:40: T__31
                {
                mT__31(); 

                }
                break;
            case 7 :
                // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:1:46: T__32
                {
                mT__32(); 

                }
                break;
            case 8 :
                // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:1:52: T__33
                {
                mT__33(); 

                }
                break;
            case 9 :
                // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:1:58: T__34
                {
                mT__34(); 

                }
                break;
            case 10 :
                // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:1:64: T__35
                {
                mT__35(); 

                }
                break;
            case 11 :
                // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:1:70: T__36
                {
                mT__36(); 

                }
                break;
            case 12 :
                // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:1:76: T__37
                {
                mT__37(); 

                }
                break;
            case 13 :
                // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:1:82: T__38
                {
                mT__38(); 

                }
                break;
            case 14 :
                // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:1:88: T__39
                {
                mT__39(); 

                }
                break;
            case 15 :
                // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:1:94: T__40
                {
                mT__40(); 

                }
                break;
            case 16 :
                // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:1:100: T__41
                {
                mT__41(); 

                }
                break;
            case 17 :
                // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:1:106: T__42
                {
                mT__42(); 

                }
                break;
            case 18 :
                // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:1:112: T__43
                {
                mT__43(); 

                }
                break;
            case 19 :
                // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:1:118: T__44
                {
                mT__44(); 

                }
                break;
            case 20 :
                // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:1:124: T__45
                {
                mT__45(); 

                }
                break;
            case 21 :
                // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:1:130: T__46
                {
                mT__46(); 

                }
                break;
            case 22 :
                // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:1:136: T__47
                {
                mT__47(); 

                }
                break;
            case 23 :
                // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:1:142: T__48
                {
                mT__48(); 

                }
                break;
            case 24 :
                // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:1:148: T__49
                {
                mT__49(); 

                }
                break;
            case 25 :
                // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:1:154: T__50
                {
                mT__50(); 

                }
                break;
            case 26 :
                // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:1:160: T__51
                {
                mT__51(); 

                }
                break;
            case 27 :
                // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:1:166: T__52
                {
                mT__52(); 

                }
                break;
            case 28 :
                // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:1:172: Variable
                {
                mVariable(); 

                }
                break;
            case 29 :
                // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:1:181: Symbol
                {
                mSymbol(); 

                }
                break;
            case 30 :
                // C:\\Users\\slh35\\Documents\\COURS\\ESIR2\\SEMESTRE 1\\TLC\\TP\\compiler-while\\while.g:1:188: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\1\uffff\1\25\1\33\1\25\1\uffff\1\25\2\uffff\6\25\2\uffff\3\25"+
        "\4\uffff\2\25\1\55\2\uffff\3\25\1\61\1\62\1\63\1\64\1\25\1\66\3"+
        "\25\1\72\3\25\1\77\1\uffff\3\25\4\uffff\1\25\1\uffff\1\25\1\105"+
        "\1\106\1\uffff\4\25\1\uffff\1\113\2\25\1\116\1\117\2\uffff\1\120"+
        "\1\121\2\25\1\uffff\1\124\1\125\4\uffff\2\25\2\uffff\1\25\1\131"+
        "\1\132\2\uffff";
    static final String DFA5_eofS =
        "\133\uffff";
    static final String DFA5_minS =
        "\1\11\1\151\1\75\1\145\1\uffff\1\150\2\uffff\1\146\1\157\1\144"+
        "\1\150\1\154\1\151\2\uffff\1\144\1\157\1\151\4\uffff\1\156\1\162"+
        "\1\41\2\uffff\1\141\2\151\4\41\1\145\1\41\1\163\1\160\1\154\1\41"+
        "\1\156\1\163\1\143\1\41\1\uffff\1\144\1\164\1\154\4\uffff\1\156"+
        "\1\uffff\1\145\2\41\1\uffff\1\163\2\164\1\141\1\uffff\1\41\2\145"+
        "\2\41\2\uffff\2\41\1\151\1\143\1\uffff\2\41\4\uffff\1\157\1\150"+
        "\2\uffff\1\156\2\41\2\uffff";
    static final String DFA5_maxS =
        "\1\172\1\165\1\75\1\145\1\uffff\1\162\2\uffff\1\156\1\157\1\144"+
        "\2\154\1\157\2\uffff\1\144\1\157\1\151\4\uffff\1\156\1\162\1\172"+
        "\2\uffff\1\141\2\151\4\172\1\145\1\172\1\163\1\160\1\154\1\172\1"+
        "\156\1\163\1\143\1\172\1\uffff\1\144\1\164\1\154\4\uffff\1\156\1"+
        "\uffff\1\145\2\172\1\uffff\1\163\2\164\1\141\1\uffff\1\172\2\145"+
        "\2\172\2\uffff\2\172\1\151\1\143\1\uffff\2\172\4\uffff\1\157\1\150"+
        "\2\uffff\1\156\2\172\2\uffff";
    static final String DFA5_acceptS =
        "\4\uffff\1\4\1\uffff\1\6\1\7\6\uffff\1\24\1\25\3\uffff\1\33\1\34"+
        "\1\35\1\36\3\uffff\1\23\1\2\21\uffff\1\21\3\uffff\1\11\1\16\1\12"+
        "\1\13\1\uffff\1\27\3\uffff\1\26\4\uffff\1\14\5\uffff\1\22\1\32\4"+
        "\uffff\1\3\2\uffff\1\17\1\20\1\30\1\31\2\uffff\1\5\1\15\3\uffff"+
        "\1\10\1\1";
    static final String DFA5_specialS =
        "\133\uffff}>";
    static final String[] DFA5_transitionS = {
            "\2\26\2\uffff\1\26\22\uffff\1\26\4\uffff\1\4\2\uffff\1\16\1"+
            "\17\2\uffff\1\6\15\uffff\1\2\1\7\1\uffff\1\23\3\uffff\32\24"+
            "\6\uffff\2\25\1\21\1\11\1\14\1\1\1\25\1\20\1\10\2\25\1\22\1"+
            "\25\1\15\1\12\2\25\1\3\1\25\1\13\2\25\1\5\3\25",
            "\1\31\5\uffff\1\30\5\uffff\1\27",
            "\1\32",
            "\1\34",
            "",
            "\1\36\11\uffff\1\35",
            "",
            "",
            "\1\40\7\uffff\1\37",
            "\1\41",
            "\1\42",
            "\1\43\3\uffff\1\44",
            "\1\45",
            "\1\47\5\uffff\1\46",
            "",
            "",
            "\1\50",
            "\1\51",
            "\1\52",
            "",
            "",
            "",
            "",
            "\1\53",
            "\1\54",
            "\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32"+
            "\25",
            "",
            "",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32"+
            "\25",
            "\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32"+
            "\25",
            "\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32"+
            "\25",
            "\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32"+
            "\25",
            "\1\65",
            "\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32"+
            "\25",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32"+
            "\25",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\4"+
            "\25\1\76\25\25",
            "",
            "\1\100",
            "\1\101",
            "\1\102",
            "",
            "",
            "",
            "",
            "\1\103",
            "",
            "\1\104",
            "\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32"+
            "\25",
            "\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32"+
            "\25",
            "",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "",
            "\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32"+
            "\25",
            "\1\114",
            "\1\115",
            "\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32"+
            "\25",
            "\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32"+
            "\25",
            "",
            "",
            "\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32"+
            "\25",
            "\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32"+
            "\25",
            "\1\122",
            "\1\123",
            "",
            "\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32"+
            "\25",
            "\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32"+
            "\25",
            "",
            "",
            "",
            "",
            "\1\126",
            "\1\127",
            "",
            "",
            "\1\130",
            "\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32"+
            "\25",
            "\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32"+
            "\25",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | Variable | Symbol | WS );";
        }
    }
 

}