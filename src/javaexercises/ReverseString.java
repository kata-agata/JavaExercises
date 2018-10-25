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
public class ReverseString {
    public static String reverseStringWithBuffer(String s) {
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        return sb.toString();
    }
    
    public static String reverseStringIteration(String s){
        char ch[] = s.toCharArray();
        String reverse = "";
        for (int i=ch.length-1 ; i>=0; i--){
            reverse+=ch[i];
        }
                
        return reverse;
    }
}
