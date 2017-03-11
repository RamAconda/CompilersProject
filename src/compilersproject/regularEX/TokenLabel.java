/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilersproject.regularEX;

import java.util.ArrayList;

/**
 *
 * @author anaconda
 */
public class TokenLabel {
    
    private String token;
    private String label;

    @Override
    public String toString() {
        return "<"+label+"> : "+token;
    }
    
    public TokenLabel(String label , String token){
        this.token = token;
        this.label = label;
    }
    
    public String getLabel(){
        return label;
    }
    public String getToken(){
        return token;
    }
    
    
    
    public static ArrayList<TokenLabel> initializeTokensArray(){
        ArrayList<TokenLabel> tokenLabels = new ArrayList<>();
        
        tokenLabels.add(new TokenLabel(IF_LABEL , IF));
        tokenLabels.add(new TokenLabel(ELSE_LABEL , ELSE));
        tokenLabels.add(new TokenLabel(WHILE_LABEL , WHILE));
        tokenLabels.add(new TokenLabel(MAIN_LABEL , MAIN));
        tokenLabels.add(new TokenLabel(VOID_LABEL , VOID));
        tokenLabels.add(new TokenLabel(THIS_LABEL , THIS));
        tokenLabels.add(new TokenLabel(CLASS_LABEL , CLASS));
        tokenLabels.add(new TokenLabel(PUBLIC_LABEL , PUBLIC));
        tokenLabels.add(new TokenLabel(RETURN_LABEL , RETURN));
        tokenLabels.add(new TokenLabel(STATIC_LABEL , STATIC));
        tokenLabels.add(new TokenLabel(NEW_LABEL , NEW));
        tokenLabels.add(new TokenLabel(TRUE_LABEL , TRUE));
        tokenLabels.add(new TokenLabel(FALSE_LABEL , FALSE));
        tokenLabels.add(new TokenLabel(LENGTH_LABEL , LENGTH));
        tokenLabels.add(new TokenLabel(EXTENDS_LABEL , EXTENDS));
        tokenLabels.add(new TokenLabel(SYSTEM_OUT_PRINTLN_LABEL , SYSTEM_OUT_PRINTLN));
        tokenLabels.add(new TokenLabel(FLOAT_LITERAL_LABEL , FLOAT_LITERAL));
        tokenLabels.add(new TokenLabel(INTEGRAL_LITERAL_LABEL , INTEGRAL_LITERAL));
        tokenLabels.add(new TokenLabel(STRING_LITERAL_LABEL , STRING_LITERAL));
        tokenLabels.add(new TokenLabel(SQUOTE_LABEL , SQUOTE));
        tokenLabels.add(new TokenLabel(DQUOTE_LABEL , DQUOTE));
        
        tokenLabels.add(new TokenLabel(COMMA_LABEL , COMMA));
        tokenLabels.add(new TokenLabel(SEMICOLON_LABEL , SEMICOLON));
        tokenLabels.add(new TokenLabel(DOT_LABEL , DOT));
        tokenLabels.add(new TokenLabel(A_CHAR_LABEL , A_CHAR));
        tokenLabels.add(new TokenLabel(STRING_LABEL , STRING));
        tokenLabels.add(new TokenLabel(FLOAT_LABEL , FLOAT));
        tokenLabels.add(new TokenLabel(CHARACTER_LABEL , CHARACTER));
        tokenLabels.add(new TokenLabel(BOOLEAN_LABEL , BOOLEAN));
        tokenLabels.add(new TokenLabel(INT_LABEL , INT));
        tokenLabels.add(new TokenLabel(COMMENT1_LABEL , COMMENT1));
        tokenLabels.add(new TokenLabel(COMMENT2_LABEL , COMMENT2));
        tokenLabels.add(new TokenLabel(COMMENT_L_LABEL , COMMENT_L));
        tokenLabels.add(new TokenLabel(COMMENT_R_LABEL , COMMENT_R));
        tokenLabels.add(new TokenLabel(PLUS_LABEL , PLUS));
        tokenLabels.add(new TokenLabel(MINUS_LABEL , MINUS));
        tokenLabels.add(new TokenLabel(MULTIPLY_LABEL , MULTIPLY));
        tokenLabels.add(new TokenLabel(EQUAL_LABEL , EQUAL));
        tokenLabels.add(new TokenLabel(DIVITION_LABEL , DIVITION));
        tokenLabels.add(new TokenLabel(LEFT_CURLY_B_LABEL , LEFT_CURLY_B));
        tokenLabels.add(new TokenLabel(RIGHT_CURLY_B_LABEL , RIGHT_CURLY_B));
        tokenLabels.add(new TokenLabel(LEFT_SQUARE_B_LABEL , LEFT_SQUARE_B));
        tokenLabels.add(new TokenLabel(RIGHT_SQUARE_B_LABEL , RIGHT_SQUARE_B));
        tokenLabels.add(new TokenLabel(LEFT_ROUND_B_LABEL , LEFT_ROUND_B));
        tokenLabels.add(new TokenLabel(RIGHT_ROUND_B_LABEL , RIGHT_ROUND_B));
        tokenLabels.add(new TokenLabel(LESSTHAN_LABEL , LESSTHAN));
        tokenLabels.add(new TokenLabel(GREATERTHAN_LABEL , GREATERTHAN));
        tokenLabels.add(new TokenLabel(NOT_LABEL , NOT));
        tokenLabels.add(new TokenLabel(AND_LABEL , AND));
        tokenLabels.add(new TokenLabel(OR_LABEL , OR));
        tokenLabels.add(new TokenLabel(EOF_LABEL , EOF));
        tokenLabels.add(new TokenLabel(ID_LABEL , ID));
        return tokenLabels;
        
    }
    
    public static final String EOF = "\n";
    
    public static final String IF = "\\bif\\b";
    public static final String ELSE = "\\belse\\b";
    public static final String WHILE = "\\bwhile\\b";
    
    public static final String MAIN = "\\bmain\\b";
    public static final String VOID = "\\bvoid\\b";
    public static final String THIS = "\\bthis\\b";
    public static final String CLASS = "\\bclass\\b";
    public static final String PUBLIC = "\\bpublic\\b";
    public static final String RETURN = "\\breturn\\b";
    public static final String STATIC = "\\bstatic\\b";
    public static final String NEW = "\\bnew\\b";
    
    public static final String TRUE = "\\btrue\\b";
    public static final String FALSE = "\\bfalse\\b";
    
    public static final String LENGTH = "\\blength\\b";
    
    public static final String EXTENDS = "\\bextends\\b";
    public static final String SYSTEM_OUT_PRINTLN = "\\bSystem\\.out\\.println\\b";
    public static final String INTEGRAL_LITERAL = "\\b(-?)\\d+\\b";
    public static final String FLOAT_LITERAL = "\\b\\d+\\.\\d+\\b";
    public static final String STRING_LITERAL = "\"\\w+\"";
    public static final String ID = "\\b[a-zA-Z]\\w*\\b";
    
    public static final String SQUOTE = "\'";
    public static final String DQUOTE = "\"";
    public static final String COMMA = ",";
    public static final String SEMICOLON = ";";
    public static final String DOT = "\\.";
    
    public static final String A_CHAR = "\'\\w\'";
    
    public static final String STRING = "\\bstring\\b";
    public static final String FLOAT = "\\bfloat\\b";
    public static final String CHARACTER = "\\bchar\\b";
    public static final String BOOLEAN = "\\bboolean\\b";
    public static final String INT = "\\bint\\b";
    
    
    public static final String COMMENT1 = "\\/\\/.*";
    public static final String COMMENT2 = "\\/\\*.*\\*\\/";
    public static final String COMMENT_L = "\\/\\*";
    public static final String COMMENT_R = "\\*\\/";
    
    public static final String PLUS = "\\+";
    public static final String MINUS = "\\-";
    public static final String MULTIPLY = "\\*";
    public static final String EQUAL = "\\=";
    public static final String DIVITION = "\\/";
    
    public static final String LEFT_CURLY_B = "\\{";
    public static final String RIGHT_CURLY_B = "\\}";
    public static final String LEFT_SQUARE_B = "\\[";
    public static final String RIGHT_SQUARE_B = "\\]";
    public static final String LEFT_ROUND_B = "\\(";
    public static final String RIGHT_ROUND_B = "\\)";
    public static final String LESSTHAN = ">";
    public static final String GREATERTHAN = "<";
    
    public static final String NOT = "!";
    public static final String AND = "&&";
    public static final String OR = "\\|\\|";
    
    //==========================================================================
    public static final String EOF_LABEL = "EOF";
    
    public static final String IF_LABEL = "IF";
    public static final String ELSE_LABEL = "ELSE";
    public static final String WHILE_LABEL = "WHILE";
    
    public static final String MAIN_LABEL = "MAIN";
    public static final String VOID_LABEL = "VOID";
    public static final String THIS_LABEL = "THIS";
    public static final String CLASS_LABEL = "CLASS";
    public static final String PUBLIC_LABEL = "PUBLIC";
    public static final String RETURN_LABEL = "RETURN";
    public static final String STATIC_LABEL = "STATIC";
    public static final String NEW_LABEL = "NEW";
    
    public static final String TRUE_LABEL = "TRUE";
    public static final String FALSE_LABEL = "FALSE";
    
    public static final String LENGTH_LABEL = "LENGTH";
    
    public static final String EXTENDS_LABEL = "EXTENDS";
    public static final String SYSTEM_OUT_PRINTLN_LABEL = "SYSTEM_OUT_PRINTLN";
    public static final String INTEGRAL_LITERAL_LABEL = "INTEGRAL_LITERAL";
    public static final String FLOAT_LITERAL_LABEL = "FLOAT_LITERAL";
    public static final String STRING_LITERAL_LABEL = "STRING_LITERAL";
    public static final String ID_LABEL = "ID";
    
    public static final String SQUOTE_LABEL = "SQUOTE";
    public static final String DQUOTE_LABEL = "DQUOTE";
    public static final String COMMA_LABEL = "COMMA";
    public static final String SEMICOLON_LABEL = "SEMICOLON";
    public static final String DOT_LABEL = "DOT";
    
    public static final String A_CHAR_LABEL = "A_CHAR";
    
    public static final String STRING_LABEL = "STRING";
    public static final String FLOAT_LABEL = "FLOAT";
    public static final String CHARACTER_LABEL = "CHARACTER";
    public static final String BOOLEAN_LABEL = "BOOLEAN";
    public static final String INT_LABEL = "INT";
    
    
    public static final String COMMENT1_LABEL = "COMMENT1";
    public static final String COMMENT2_LABEL = "COMMENT2";
    public static final String COMMENT_L_LABEL = "COMMENT_L";
    public static final String COMMENT_R_LABEL = "COMMENT_R";
    
    public static final String PLUS_LABEL = "PLUS";
    public static final String MINUS_LABEL = "MINUS";
    public static final String MULTIPLY_LABEL = "MULTIPLY";
    public static final String EQUAL_LABEL = "EQUAL";
    public static final String DIVITION_LABEL = "DIVITION";
    
    public static final String LEFT_CURLY_B_LABEL = "LEFT_CURLY_B";
    public static final String RIGHT_CURLY_B_LABEL = "RIGHT_CURLY_B";
    public static final String LEFT_SQUARE_B_LABEL = "LEFT_SQUARE_B";
    public static final String RIGHT_SQUARE_B_LABEL = "RIGHT_SQUARE_B";
    public static final String LEFT_ROUND_B_LABEL = "LEFT_ROUND_B";
    public static final String RIGHT_ROUND_B_LABEL = "RIGHT_ROUND_B";
    public static final String LESSTHAN_LABEL = "LESSTHAN";
    public static final String GREATERTHAN_LABEL = "GREATERTHAN";
    
    public static final String NOT_LABEL = "NOT";
    public static final String AND_LABEL = "AND";
    public static final String OR_LABEL = "OR";
}

