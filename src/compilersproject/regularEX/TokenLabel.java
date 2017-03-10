/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilersproject.regularEX;

/**
 *
 * @author anaconda
 */
public class TokenLabel {
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
    public static final String INTEGRAL_LITERAL = "\\b\\d+\\b";
    public static final String FLOAT_LITERAL = "\\b\\d+\\.\\d+\\b";
    public static final String STRING_LITERAL = "\\b\"\\w+\"\\b";
    public static final String ID = "\\b\\w+\\b";
    
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
    
    
    public static final String COMMENT1 = "//\\.";
    public static final String COMMENT2 = "/*\\.*/";
    public static final String COMMENT_L = "/*";
    public static final String COMMENT_R = "*/";
    
    public static final String PLUS = "\\+";
    public static final String MINUS = "\\-";
    public static final String MULTIPLY = "\\*";
    public static final String EQUAL = "\\=";
    public static final String DIVITION = "/";
    
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
    public static final String OR = "||";
}

