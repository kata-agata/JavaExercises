/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexercises;

/**
 *
 * @author agataj
 */
public class WhiteSpaces {
    public static String removeWhiteSpaces(String s){
        String words[] = s.split("\\s");
        String withoutSpaces = "";
        
        for (String w : words){
            withoutSpaces += w;
        }
        return withoutSpaces;
    }
    
}
