/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilersproject;

import compilersproject.regularEX.TestStringAgenstRegEX;
import compilersproject.regularEX.TokenLabel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author anaconda
 */
public class CompilersProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        ArrayList<String> codeLines = FileUtil.readTheFile();
        ArrayList<TokenLabel> tokensAndLabels = new ArrayList<>();
        for(int i = 0 ; i < codeLines.size() ; i++){
            tokensAndLabels.addAll(TestStringAgenstRegEX.test(codeLines.get(i)));
        }
        FileUtil.writeTheFile(tokensAndLabels);
//        String input = "float x = 13.87 , y = 65.44";
//        Pattern pattern = Pattern.compile(TokenLabel.FLOAT_LITERAL);
//        Matcher matcher = pattern.matcher(input);
//        while(matcher.find()){
//            System.out.println(matcher.start()+"\n"+input.substring(matcher.start(),matcher.end())+"\n"+matcher.end());
//            //input = matcher.replaceFirst("x");
//        }
//        pattern = Pattern.compile(TokenLabel.INTEGRAL_LITERAL);
//        matcher = pattern.matcher(input);
//        while(matcher.find()){
//            System.out.println(matcher.start()+"\n"+input.substring(matcher.start(),matcher.end())+"\n"+matcher.end());
//        }
//        System.out.println(input);
//        
    }
    
}
