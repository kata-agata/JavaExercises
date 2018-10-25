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
public class EachWordFirstLetterToUpperCase {
    
    public static String eachWordFirstLetterToUpperCase(String s){
        
        String words[] = s.split("\\s");
        String joinString = "";
        for (String w:words){
              String first = w.substring(0,1);
              String afterFirst = w.substring(1);
              joinString+=first.toUpperCase()+afterFirst+" ";
        }
       
        
        return joinString.trim();
    }
    
}
