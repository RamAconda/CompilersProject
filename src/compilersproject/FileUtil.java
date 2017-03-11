/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilersproject;

import compilersproject.regularEX.TokenLabel;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anaconda
 */
public class FileUtil {

    public static ArrayList<String> readTheFile() throws IOException {
        ArrayList<String> returned = new ArrayList<>();
        String filePath = "/home/anaconda/NetBeansProjects/CompilersProject/src/input.txt";
        File file = new File(filePath);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                returned.add(line);
            }
            fileReader.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileUtil.class.getName()).log(Level.SEVERE, null, ex);
        }

        return returned;
    }

    public static void writeTheFile(ArrayList<TokenLabel> toWrite) {
        String filePath = "/home/anaconda/NetBeansProjects/CompilersProject/src/output.txt";
        PrintWriter writer;
        try {
            writer = new PrintWriter(filePath , "UTF-8");
            for(TokenLabel s : toWrite){
                writer.println(s.toString());
            }
            writer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileUtil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(FileUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
