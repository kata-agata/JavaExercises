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
public class ReverseToggle {
    public static String reverseToggle(String s) {
        String words[]= s.split("\\s");
        String joinString = "";
        
        for(String w : words){
            String reverse = ReverseString.reverseStringWithBuffer(w);
            String first = reverse.substring(0, 1);
            String afterFirst = reverse.substring(1);
            joinString += first.toLowerCase()+ afterFirst.toUpperCase() + " ";
        }
        return joinString.trim();
                
    }
}
