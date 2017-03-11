/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilersproject.regularEX;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author anaconda
 */
public class TestStringAgenstRegEX {
    
    private static ArrayList<TokenLabel> tokenLabels = null;
    
    public static ArrayList<TokenLabel> test(String codeLine){
        ArrayList<TokenLabel> returned = new ArrayList<>();
        TreeMap<Integer,TokenLabel> tokensMap = new TreeMap<>();
        
        if(tokenLabels == null){
            tokenLabels = TokenLabel.initializeTokensArray();
        }
        for(TokenLabel tl : tokenLabels){
            codeLine = matchPattern(codeLine, tl , tokensMap);
        }
        
        Set<Integer> keySet = tokensMap.keySet();
        for(Integer i : keySet){
            returned.add(tokensMap.get(i));
        }
        
        return returned;
    }
    
    private static String matchPattern(String codeLine , TokenLabel tokenLabel 
            , TreeMap<Integer , TokenLabel> output){
        Pattern pattern = Pattern.compile(tokenLabel.getToken());
        Matcher matcher = pattern.matcher(codeLine);
        StringBuffer sb = new StringBuffer();
        while(matcher.find()){
            output.put(matcher.start(), new TokenLabel(tokenLabel.getLabel() 
                    , codeLine.substring(matcher.start(),matcher.end())));
            matcher.appendReplacement(sb, makeRepeatedString(matcher.end()-matcher.start()));
        }
        matcher.appendTail(sb);
        return sb.toString();
        
    }
    
    private static String makeRepeatedString(int repeat){
        char[] chars = new char[repeat];
        Arrays.fill(chars , ' ');
        return new String(chars);
    }
}
