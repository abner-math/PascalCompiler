package org.xtext.example.pascal.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPascalLexer extends Lexer {
    public static final int T__40=40;
    public static final int RULE_RELATIONAL_OPERATOR=15;
    public static final int RULE_ID=24;
    public static final int RULE_NIL_KEYWORD=9;
    public static final int RULE_LABEL_KEYWORD=18;
    public static final int RULE_ANY_OTHER=29;
    public static final int RULE_UNSIGNED_DIGIT_SEQUENCE=19;
    public static final int RULE_IDENTIFIER=5;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=27;
    public static final int RULE_ADDITION_OPERATOR=6;
    public static final int RULE_NOT_KEYWORD=17;
    public static final int RULE_LETTER=23;
    public static final int RULE_ML_COMMENT=26;
    public static final int RULE_END_KEYWORD=14;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=8;
    public static final int T__33=33;
    public static final int RULE_REAL_NUMBER=10;
    public static final int RULE_SIGNED_REAL_NUMBER=12;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_OR_KEYWORD=7;
    public static final int RULE_MULTIPLICATION_OPERATOR=16;
    public static final int RULE_INT=25;
    public static final int RULE_BEGIN_KEYWORD=13;
    public static final int RULE_DIGIT_SEQUENCE=20;
    public static final int RULE_WS=28;
    public static final int RULE_SIGNED_INTEGER_NUMBER=11;
    public static final int RULE_DIGIT=21;
    public static final int RULE_LETTER_EXTENDED=22;
    public static final int RULE_INTEGER_NUMBER=4;

    // delegates
    // delegators

    public InternalPascalLexer() {;} 
    public InternalPascalLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalPascalLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g"; }

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:11:7: ( '.' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:11:9: '.'
            {
            match('.'); 

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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:12:7: ( 'program' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:12:9: 'program'
            {
            match("program"); 


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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:13:7: ( ';' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:13:9: ';'
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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:14:7: ( '(' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:14:9: '('
            {
            match('('); 

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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:15:7: ( ')' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:15:9: ')'
            {
            match(')'); 

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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:16:7: ( ',' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:16:9: ','
            {
            match(','); 

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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:17:7: ( ':' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:17:9: ':'
            {
            match(':'); 

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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:18:7: ( ':=' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:18:9: ':='
            {
            match(":="); 


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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:19:7: ( '[' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:19:9: '['
            {
            match('['); 

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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:20:7: ( ']' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:20:9: ']'
            {
            match(']'); 

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
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:21:7: ( 'goto' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:21:9: 'goto'
            {
            match("goto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "RULE_ADDITION_OPERATOR"
    public final void mRULE_ADDITION_OPERATOR() throws RecognitionException {
        try {
            int _type = RULE_ADDITION_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3631:24: ( ( '+' | '-' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3631:26: ( '+' | '-' )
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ADDITION_OPERATOR"

    // $ANTLR start "RULE_MULTIPLICATION_OPERATOR"
    public final void mRULE_MULTIPLICATION_OPERATOR() throws RecognitionException {
        try {
            int _type = RULE_MULTIPLICATION_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3633:30: ( ( '*' | '/' | 'div' | 'mod' | 'and' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3633:32: ( '*' | '/' | 'div' | 'mod' | 'and' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3633:32: ( '*' | '/' | 'div' | 'mod' | 'and' )
            int alt1=5;
            switch ( input.LA(1) ) {
            case '*':
                {
                alt1=1;
                }
                break;
            case '/':
                {
                alt1=2;
                }
                break;
            case 'd':
                {
                alt1=3;
                }
                break;
            case 'm':
                {
                alt1=4;
                }
                break;
            case 'a':
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3633:33: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3633:37: '/'
                    {
                    match('/'); 

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3633:41: 'div'
                    {
                    match("div"); 


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3633:47: 'mod'
                    {
                    match("mod"); 


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3633:53: 'and'
                    {
                    match("and"); 


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
    // $ANTLR end "RULE_MULTIPLICATION_OPERATOR"

    // $ANTLR start "RULE_RELATIONAL_OPERATOR"
    public final void mRULE_RELATIONAL_OPERATOR() throws RecognitionException {
        try {
            int _type = RULE_RELATIONAL_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3635:26: ( ( '=' | '<>' | '<' | '<=' | '>' | '>=' | 'in' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3635:28: ( '=' | '<>' | '<' | '<=' | '>' | '>=' | 'in' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3635:28: ( '=' | '<>' | '<' | '<=' | '>' | '>=' | 'in' )
            int alt2=7;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3635:29: '='
                    {
                    match('='); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3635:33: '<>'
                    {
                    match("<>"); 


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3635:38: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3635:42: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3635:47: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3635:51: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3635:56: 'in'
                    {
                    match("in"); 


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
    // $ANTLR end "RULE_RELATIONAL_OPERATOR"

    // $ANTLR start "RULE_BEGIN_KEYWORD"
    public final void mRULE_BEGIN_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_BEGIN_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3637:20: ( 'begin' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3637:22: 'begin'
            {
            match("begin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BEGIN_KEYWORD"

    // $ANTLR start "RULE_END_KEYWORD"
    public final void mRULE_END_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_END_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3639:18: ( 'end' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3639:20: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_END_KEYWORD"

    // $ANTLR start "RULE_LABEL_KEYWORD"
    public final void mRULE_LABEL_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_LABEL_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3641:20: ( 'label' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3641:22: 'label'
            {
            match("label"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LABEL_KEYWORD"

    // $ANTLR start "RULE_NIL_KEYWORD"
    public final void mRULE_NIL_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_NIL_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3643:18: ( 'nil' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3643:20: 'nil'
            {
            match("nil"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NIL_KEYWORD"

    // $ANTLR start "RULE_NOT_KEYWORD"
    public final void mRULE_NOT_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_NOT_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3645:18: ( 'not' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3645:20: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NOT_KEYWORD"

    // $ANTLR start "RULE_OR_KEYWORD"
    public final void mRULE_OR_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_OR_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3647:17: ( 'or' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3647:19: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OR_KEYWORD"

    // $ANTLR start "RULE_SIGNED_INTEGER_NUMBER"
    public final void mRULE_SIGNED_INTEGER_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_SIGNED_INTEGER_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3649:28: ( ( '+' | '-' ) RULE_INTEGER_NUMBER )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3649:30: ( '+' | '-' ) RULE_INTEGER_NUMBER
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            mRULE_INTEGER_NUMBER(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SIGNED_INTEGER_NUMBER"

    // $ANTLR start "RULE_INTEGER_NUMBER"
    public final void mRULE_INTEGER_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_INTEGER_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3651:21: ( RULE_UNSIGNED_DIGIT_SEQUENCE )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3651:23: RULE_UNSIGNED_DIGIT_SEQUENCE
            {
            mRULE_UNSIGNED_DIGIT_SEQUENCE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTEGER_NUMBER"

    // $ANTLR start "RULE_SIGNED_REAL_NUMBER"
    public final void mRULE_SIGNED_REAL_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_SIGNED_REAL_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3653:25: ( ( '+' | '-' ) RULE_REAL_NUMBER )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3653:27: ( '+' | '-' ) RULE_REAL_NUMBER
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            mRULE_REAL_NUMBER(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SIGNED_REAL_NUMBER"

    // $ANTLR start "RULE_REAL_NUMBER"
    public final void mRULE_REAL_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_REAL_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3655:18: ( ( RULE_UNSIGNED_DIGIT_SEQUENCE '.' ( RULE_UNSIGNED_DIGIT_SEQUENCE )? ( ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )? | RULE_UNSIGNED_DIGIT_SEQUENCE ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3655:20: ( RULE_UNSIGNED_DIGIT_SEQUENCE '.' ( RULE_UNSIGNED_DIGIT_SEQUENCE )? ( ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )? | RULE_UNSIGNED_DIGIT_SEQUENCE ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3655:20: ( RULE_UNSIGNED_DIGIT_SEQUENCE '.' ( RULE_UNSIGNED_DIGIT_SEQUENCE )? ( ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )? | RULE_UNSIGNED_DIGIT_SEQUENCE ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3655:21: RULE_UNSIGNED_DIGIT_SEQUENCE '.' ( RULE_UNSIGNED_DIGIT_SEQUENCE )? ( ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )?
                    {
                    mRULE_UNSIGNED_DIGIT_SEQUENCE(); 
                    match('.'); 
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3655:54: ( RULE_UNSIGNED_DIGIT_SEQUENCE )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3655:54: RULE_UNSIGNED_DIGIT_SEQUENCE
                            {
                            mRULE_UNSIGNED_DIGIT_SEQUENCE(); 

                            }
                            break;

                    }

                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3655:84: ( ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='E'||LA4_0=='e') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3655:85: ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE
                            {
                            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            mRULE_DIGIT_SEQUENCE(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3655:117: RULE_UNSIGNED_DIGIT_SEQUENCE ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE
                    {
                    mRULE_UNSIGNED_DIGIT_SEQUENCE(); 
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    mRULE_DIGIT_SEQUENCE(); 

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
    // $ANTLR end "RULE_REAL_NUMBER"

    // $ANTLR start "RULE_UNSIGNED_DIGIT_SEQUENCE"
    public final void mRULE_UNSIGNED_DIGIT_SEQUENCE() throws RecognitionException {
        try {
            int _type = RULE_UNSIGNED_DIGIT_SEQUENCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3657:30: ( RULE_DIGIT ( RULE_DIGIT )* )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3657:32: RULE_DIGIT ( RULE_DIGIT )*
            {
            mRULE_DIGIT(); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3657:43: ( RULE_DIGIT )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3657:43: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNSIGNED_DIGIT_SEQUENCE"

    // $ANTLR start "RULE_DIGIT_SEQUENCE"
    public final void mRULE_DIGIT_SEQUENCE() throws RecognitionException {
        try {
            int _type = RULE_DIGIT_SEQUENCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3659:21: ( ( '+' | '-' )? RULE_UNSIGNED_DIGIT_SEQUENCE )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3659:23: ( '+' | '-' )? RULE_UNSIGNED_DIGIT_SEQUENCE
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3659:23: ( '+' | '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='+'||LA7_0=='-') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            mRULE_UNSIGNED_DIGIT_SEQUENCE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT_SEQUENCE"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            int _type = RULE_DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3661:12: ( '0' .. '9' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3661:14: '0' .. '9'
            {
            matchRange('0','9'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_IDENTIFIER"
    public final void mRULE_IDENTIFIER() throws RecognitionException {
        try {
            int _type = RULE_IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3663:17: ( RULE_LETTER_EXTENDED ( RULE_LETTER_EXTENDED | RULE_DIGIT )* )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3663:19: RULE_LETTER_EXTENDED ( RULE_LETTER_EXTENDED | RULE_DIGIT )*
            {
            mRULE_LETTER_EXTENDED(); 
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3663:40: ( RULE_LETTER_EXTENDED | RULE_DIGIT )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='a' && LA8_0<='z')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IDENTIFIER"

    // $ANTLR start "RULE_LETTER"
    public final void mRULE_LETTER() throws RecognitionException {
        try {
            int _type = RULE_LETTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3665:13: ( ( 'A' .. 'Z' | 'a' .. 'z' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3665:15: ( 'A' .. 'Z' | 'a' .. 'z' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LETTER"

    // $ANTLR start "RULE_LETTER_EXTENDED"
    public final void mRULE_LETTER_EXTENDED() throws RecognitionException {
        try {
            int _type = RULE_LETTER_EXTENDED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3667:22: ( ( RULE_LETTER | '_' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3667:24: ( RULE_LETTER | '_' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LETTER_EXTENDED"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3669:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3669:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3669:11: ( '^' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='^') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3669:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3669:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')||(LA10_0>='A' && LA10_0<='Z')||LA10_0=='_'||(LA10_0>='a' && LA10_0<='z')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3671:10: ( ( '0' .. '9' )+ )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3671:12: ( '0' .. '9' )+
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3671:12: ( '0' .. '9' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3671:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3673:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3673:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3673:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\"') ) {
                alt14=1;
            }
            else if ( (LA14_0=='\'') ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3673:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3673:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop12:
                    do {
                        int alt12=3;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='\\') ) {
                            alt12=1;
                        }
                        else if ( ((LA12_0>='\u0000' && LA12_0<='!')||(LA12_0>='#' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='\uFFFF')) ) {
                            alt12=2;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3673:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3673:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3673:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3673:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop13:
                    do {
                        int alt13=3;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0=='\\') ) {
                            alt13=1;
                        }
                        else if ( ((LA13_0>='\u0000' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='[')||(LA13_0>=']' && LA13_0<='\uFFFF')) ) {
                            alt13=2;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3673:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3673:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    match('\''); 

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
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3675:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3675:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3675:24: ( options {greedy=false; } : . )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='*') ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1=='/') ) {
                        alt15=2;
                    }
                    else if ( ((LA15_1>='\u0000' && LA15_1<='.')||(LA15_1>='0' && LA15_1<='\uFFFF')) ) {
                        alt15=1;
                    }


                }
                else if ( ((LA15_0>='\u0000' && LA15_0<=')')||(LA15_0>='+' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3675:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3677:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3677:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3677:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\u0000' && LA16_0<='\t')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\uFFFF')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3677:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3677:40: ( ( '\\r' )? '\\n' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='\n'||LA18_0=='\r') ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3677:41: ( '\\r' )? '\\n'
                    {
                    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3677:41: ( '\\r' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='\r') ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3677:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

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
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3679:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3679:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3679:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='\t' && LA19_0<='\n')||LA19_0=='\r'||LA19_0==' ') ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3681:16: ( . )
            // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:3681:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:8: ( T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | RULE_ADDITION_OPERATOR | RULE_MULTIPLICATION_OPERATOR | RULE_RELATIONAL_OPERATOR | RULE_BEGIN_KEYWORD | RULE_END_KEYWORD | RULE_LABEL_KEYWORD | RULE_NIL_KEYWORD | RULE_NOT_KEYWORD | RULE_OR_KEYWORD | RULE_SIGNED_INTEGER_NUMBER | RULE_INTEGER_NUMBER | RULE_SIGNED_REAL_NUMBER | RULE_REAL_NUMBER | RULE_UNSIGNED_DIGIT_SEQUENCE | RULE_DIGIT_SEQUENCE | RULE_DIGIT | RULE_IDENTIFIER | RULE_LETTER | RULE_LETTER_EXTENDED | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt20=37;
        alt20 = dfa20.predict(input);
        switch (alt20) {
            case 1 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:10: T__30
                {
                mT__30(); 

                }
                break;
            case 2 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:16: T__31
                {
                mT__31(); 

                }
                break;
            case 3 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:22: T__32
                {
                mT__32(); 

                }
                break;
            case 4 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:28: T__33
                {
                mT__33(); 

                }
                break;
            case 5 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:34: T__34
                {
                mT__34(); 

                }
                break;
            case 6 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:40: T__35
                {
                mT__35(); 

                }
                break;
            case 7 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:46: T__36
                {
                mT__36(); 

                }
                break;
            case 8 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:52: T__37
                {
                mT__37(); 

                }
                break;
            case 9 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:58: T__38
                {
                mT__38(); 

                }
                break;
            case 10 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:64: T__39
                {
                mT__39(); 

                }
                break;
            case 11 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:70: T__40
                {
                mT__40(); 

                }
                break;
            case 12 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:76: RULE_ADDITION_OPERATOR
                {
                mRULE_ADDITION_OPERATOR(); 

                }
                break;
            case 13 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:99: RULE_MULTIPLICATION_OPERATOR
                {
                mRULE_MULTIPLICATION_OPERATOR(); 

                }
                break;
            case 14 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:128: RULE_RELATIONAL_OPERATOR
                {
                mRULE_RELATIONAL_OPERATOR(); 

                }
                break;
            case 15 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:153: RULE_BEGIN_KEYWORD
                {
                mRULE_BEGIN_KEYWORD(); 

                }
                break;
            case 16 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:172: RULE_END_KEYWORD
                {
                mRULE_END_KEYWORD(); 

                }
                break;
            case 17 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:189: RULE_LABEL_KEYWORD
                {
                mRULE_LABEL_KEYWORD(); 

                }
                break;
            case 18 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:208: RULE_NIL_KEYWORD
                {
                mRULE_NIL_KEYWORD(); 

                }
                break;
            case 19 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:225: RULE_NOT_KEYWORD
                {
                mRULE_NOT_KEYWORD(); 

                }
                break;
            case 20 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:242: RULE_OR_KEYWORD
                {
                mRULE_OR_KEYWORD(); 

                }
                break;
            case 21 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:258: RULE_SIGNED_INTEGER_NUMBER
                {
                mRULE_SIGNED_INTEGER_NUMBER(); 

                }
                break;
            case 22 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:285: RULE_INTEGER_NUMBER
                {
                mRULE_INTEGER_NUMBER(); 

                }
                break;
            case 23 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:305: RULE_SIGNED_REAL_NUMBER
                {
                mRULE_SIGNED_REAL_NUMBER(); 

                }
                break;
            case 24 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:329: RULE_REAL_NUMBER
                {
                mRULE_REAL_NUMBER(); 

                }
                break;
            case 25 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:346: RULE_UNSIGNED_DIGIT_SEQUENCE
                {
                mRULE_UNSIGNED_DIGIT_SEQUENCE(); 

                }
                break;
            case 26 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:375: RULE_DIGIT_SEQUENCE
                {
                mRULE_DIGIT_SEQUENCE(); 

                }
                break;
            case 27 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:395: RULE_DIGIT
                {
                mRULE_DIGIT(); 

                }
                break;
            case 28 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:406: RULE_IDENTIFIER
                {
                mRULE_IDENTIFIER(); 

                }
                break;
            case 29 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:422: RULE_LETTER
                {
                mRULE_LETTER(); 

                }
                break;
            case 30 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:434: RULE_LETTER_EXTENDED
                {
                mRULE_LETTER_EXTENDED(); 

                }
                break;
            case 31 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:455: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 32 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:463: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 33 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:472: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 34 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:484: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 35 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:500: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 36 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:516: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 37 :
                // ../org.xtext.example.Pascal.ui/src-gen/org/xtext/example/pascal/ui/contentassist/antlr/internal/InternalPascal.g:1:524: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA2_eotS =
        "\2\uffff\1\7\1\11\6\uffff";
    static final String DFA2_eofS =
        "\12\uffff";
    static final String DFA2_minS =
        "\1\74\1\uffff\2\75\6\uffff";
    static final String DFA2_maxS =
        "\1\151\1\uffff\1\76\1\75\6\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\2\uffff\1\7\1\2\1\4\1\3\1\6\1\5";
    static final String DFA2_specialS =
        "\12\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\2\1\1\1\3\52\uffff\1\4",
            "",
            "\1\6\1\5",
            "\1\10",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "3635:28: ( '=' | '<>' | '<' | '<=' | '>' | '>=' | 'in' )";
        }
    }
    static final String DFA5_eotS =
        "\5\uffff";
    static final String DFA5_eofS =
        "\5\uffff";
    static final String DFA5_minS =
        "\1\60\2\56\2\uffff";
    static final String DFA5_maxS =
        "\1\71\2\145\2\uffff";
    static final String DFA5_acceptS =
        "\3\uffff\1\2\1\1";
    static final String DFA5_specialS =
        "\5\uffff}>";
    static final String[] DFA5_transitionS = {
            "\12\1",
            "\1\4\1\uffff\12\2\13\uffff\1\3\37\uffff\1\3",
            "\1\4\1\uffff\12\2\13\uffff\1\3\37\uffff\1\3",
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
            return "3655:20: ( RULE_UNSIGNED_DIGIT_SEQUENCE '.' ( RULE_UNSIGNED_DIGIT_SEQUENCE )? ( ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )? | RULE_UNSIGNED_DIGIT_SEQUENCE ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )";
        }
    }
    static final String DFA20_eotS =
        "\2\uffff\1\44\4\uffff\1\53\2\uffff\1\44\1\57\1\uffff\1\61\3\44"+
        "\3\uffff\6\44\1\77\2\44\3\41\3\uffff\1\44\1\uffff\1\44\10\uffff"+
        "\1\44\1\uffff\1\107\3\uffff\3\44\1\uffff\1\67\5\44\1\122\1\uffff"+
        "\1\77\4\uffff\2\44\1\uffff\1\107\1\uffff\3\61\1\44\1\126\1\44\1"+
        "\130\1\131\1\uffff\1\44\1\133\1\44\1\uffff\1\44\2\uffff\1\44\1\uffff"+
        "\1\137\1\140\1\44\2\uffff\1\142\1\uffff";
    static final String DFA20_eofS =
        "\143\uffff";
    static final String DFA20_minS =
        "\1\0\1\uffff\1\60\4\uffff\1\75\2\uffff\2\60\1\uffff\1\52\3\60\3"+
        "\uffff\6\60\1\56\2\60\1\101\2\0\3\uffff\1\60\1\uffff\1\60\10\uffff"+
        "\1\60\1\uffff\1\56\3\uffff\3\60\1\uffff\7\60\1\uffff\1\56\4\uffff"+
        "\2\60\1\uffff\1\56\1\uffff\10\60\1\uffff\3\60\1\uffff\1\60\2\uffff"+
        "\1\60\1\uffff\3\60\2\uffff\1\60\1\uffff";
    static final String DFA20_maxS =
        "\1\uffff\1\uffff\1\172\4\uffff\1\75\2\uffff\1\172\1\71\1\uffff"+
        "\1\57\3\172\3\uffff\6\172\1\145\3\172\2\uffff\3\uffff\1\172\1\uffff"+
        "\1\172\10\uffff\1\172\1\uffff\1\145\3\uffff\3\172\1\uffff\7\172"+
        "\1\uffff\1\145\4\uffff\2\172\1\uffff\1\145\1\uffff\10\172\1\uffff"+
        "\3\172\1\uffff\1\172\2\uffff\1\172\1\uffff\3\172\2\uffff\1\172\1"+
        "\uffff";
    static final String DFA20_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\4\1\5\1\6\1\uffff\1\11\1\12\2\uffff"+
        "\1\15\4\uffff\3\16\14\uffff\1\44\1\45\1\1\1\uffff\1\34\1\uffff\1"+
        "\3\1\4\1\5\1\6\1\10\1\7\1\11\1\12\1\uffff\1\14\1\uffff\1\15\1\42"+
        "\1\43\3\uffff\1\16\7\uffff\1\26\1\uffff\1\30\1\37\1\41\1\44\2\uffff"+
        "\1\25\1\uffff\1\27\10\uffff\1\24\3\uffff\1\20\1\uffff\1\22\1\23"+
        "\1\uffff\1\13\3\uffff\1\17\1\21\1\uffff\1\2";
    static final String DFA20_specialS =
        "\1\2\35\uffff\1\1\1\0\103\uffff}>";
    static final String[] DFA20_transitionS = {
            "\11\41\2\40\2\41\1\40\22\41\1\40\1\41\1\36\4\41\1\37\1\4\1"+
            "\5\1\14\1\13\1\6\1\13\1\1\1\15\12\32\1\7\1\3\1\22\1\21\1\23"+
            "\2\41\32\33\1\10\1\41\1\11\1\35\1\34\1\41\1\20\1\25\1\33\1\16"+
            "\1\26\1\33\1\12\1\33\1\24\2\33\1\27\1\17\1\30\1\31\1\2\12\33"+
            "\uff85\41",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\21\45\1\43\10\45",
            "",
            "",
            "",
            "",
            "\1\52",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\16\45\1\56\13\45",
            "\12\60",
            "",
            "\1\62\4\uffff\1\63",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\10\45\1\64\21\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\16\45\1\65\13\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\15\45\1\66\14\45",
            "",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\15\45\1\70\14\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\4\45\1\71\25\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\15\45\1\72\14\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\1\73\31\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\10\45\1\74\5\45"+
            "\1\75\13\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\21\45\1\76\10\45",
            "\1\101\1\uffff\12\100\13\uffff\1\101\37\uffff\1\101",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\32\102\4\uffff\1\102\1\uffff\32\102",
            "\0\103",
            "\0\103",
            "",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\16\45\1\105\13\45",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\23\45\1\106\6\45",
            "",
            "\1\111\1\uffff\12\110\13\uffff\1\111\37\uffff\1\111",
            "",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\25\45\1\112\4\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\3\45\1\113\26\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\3\45\1\114\26\45",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\6\45\1\115\23\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\3\45\1\116\26\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\1\45\1\117\30\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\13\45\1\120\16\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\23\45\1\121\6\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\101\1\uffff\12\100\13\uffff\1\101\37\uffff\1\101",
            "",
            "",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\6\45\1\123\23\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\16\45\1\124\13\45",
            "",
            "\1\111\1\uffff\12\110\13\uffff\1\111\37\uffff\1\111",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\10\45\1\125\21\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\4\45\1\127\25\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\21\45\1\132\10\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\15\45\1\134\14\45",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\13\45\1\135\16\45",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\1\136\31\45",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\14\45\1\141\15\45",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | RULE_ADDITION_OPERATOR | RULE_MULTIPLICATION_OPERATOR | RULE_RELATIONAL_OPERATOR | RULE_BEGIN_KEYWORD | RULE_END_KEYWORD | RULE_LABEL_KEYWORD | RULE_NIL_KEYWORD | RULE_NOT_KEYWORD | RULE_OR_KEYWORD | RULE_SIGNED_INTEGER_NUMBER | RULE_INTEGER_NUMBER | RULE_SIGNED_REAL_NUMBER | RULE_REAL_NUMBER | RULE_UNSIGNED_DIGIT_SEQUENCE | RULE_DIGIT_SEQUENCE | RULE_DIGIT | RULE_IDENTIFIER | RULE_LETTER | RULE_LETTER_EXTENDED | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_31 = input.LA(1);

                        s = -1;
                        if ( ((LA20_31>='\u0000' && LA20_31<='\uFFFF')) ) {s = 67;}

                        else s = 33;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA20_30 = input.LA(1);

                        s = -1;
                        if ( ((LA20_30>='\u0000' && LA20_30<='\uFFFF')) ) {s = 67;}

                        else s = 33;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA20_0 = input.LA(1);

                        s = -1;
                        if ( (LA20_0=='.') ) {s = 1;}

                        else if ( (LA20_0=='p') ) {s = 2;}

                        else if ( (LA20_0==';') ) {s = 3;}

                        else if ( (LA20_0=='(') ) {s = 4;}

                        else if ( (LA20_0==')') ) {s = 5;}

                        else if ( (LA20_0==',') ) {s = 6;}

                        else if ( (LA20_0==':') ) {s = 7;}

                        else if ( (LA20_0=='[') ) {s = 8;}

                        else if ( (LA20_0==']') ) {s = 9;}

                        else if ( (LA20_0=='g') ) {s = 10;}

                        else if ( (LA20_0=='+'||LA20_0=='-') ) {s = 11;}

                        else if ( (LA20_0=='*') ) {s = 12;}

                        else if ( (LA20_0=='/') ) {s = 13;}

                        else if ( (LA20_0=='d') ) {s = 14;}

                        else if ( (LA20_0=='m') ) {s = 15;}

                        else if ( (LA20_0=='a') ) {s = 16;}

                        else if ( (LA20_0=='=') ) {s = 17;}

                        else if ( (LA20_0=='<') ) {s = 18;}

                        else if ( (LA20_0=='>') ) {s = 19;}

                        else if ( (LA20_0=='i') ) {s = 20;}

                        else if ( (LA20_0=='b') ) {s = 21;}

                        else if ( (LA20_0=='e') ) {s = 22;}

                        else if ( (LA20_0=='l') ) {s = 23;}

                        else if ( (LA20_0=='n') ) {s = 24;}

                        else if ( (LA20_0=='o') ) {s = 25;}

                        else if ( ((LA20_0>='0' && LA20_0<='9')) ) {s = 26;}

                        else if ( ((LA20_0>='A' && LA20_0<='Z')||LA20_0=='c'||LA20_0=='f'||LA20_0=='h'||(LA20_0>='j' && LA20_0<='k')||(LA20_0>='q' && LA20_0<='z')) ) {s = 27;}

                        else if ( (LA20_0=='_') ) {s = 28;}

                        else if ( (LA20_0=='^') ) {s = 29;}

                        else if ( (LA20_0=='\"') ) {s = 30;}

                        else if ( (LA20_0=='\'') ) {s = 31;}

                        else if ( ((LA20_0>='\t' && LA20_0<='\n')||LA20_0=='\r'||LA20_0==' ') ) {s = 32;}

                        else if ( ((LA20_0>='\u0000' && LA20_0<='\b')||(LA20_0>='\u000B' && LA20_0<='\f')||(LA20_0>='\u000E' && LA20_0<='\u001F')||LA20_0=='!'||(LA20_0>='#' && LA20_0<='&')||(LA20_0>='?' && LA20_0<='@')||LA20_0=='\\'||LA20_0=='`'||(LA20_0>='{' && LA20_0<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}