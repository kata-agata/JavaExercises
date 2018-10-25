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
public class ReverseEachWordinString {
    public static String reverseEachWord(String s) {
        String words[]= s.split("\\s");
        String joinString = "";
        
        for(String w : words){
            String reverse = ReverseString.reverseStringWithBuffer(w);
            joinString += reverse + " ";
        }
        return joinString.trim();
                
    }
}
