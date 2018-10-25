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
public class PalindromeCheck {
    
    public static boolean checkPalindrome(String s){
        String reverse = ReverseString.reverseStringWithBuffer(s);
        if (reverse.equals(s)) return true;
        else return false;
    }
}
