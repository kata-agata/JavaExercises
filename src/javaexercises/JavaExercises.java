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


public class JavaExercises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(ReverseString.reverseStringWithBuffer("baby")); //reverse string with StringBuffer class
        System.out.println(ReverseString.reverseStringIteration("baby"));  // reverse string with for loop and char array
        
        System.out.println(PalindromeCheck.checkPalindrome("kajak")); // chcecking Palindrome with ReverseString Class
        System.out.println(PalindromeCheck.checkPalindrome("kokoko")); // chcecking Palindrome with ReverseString Class
        
        System.out.println(EachWordFirstLetterToUpperCase.eachWordFirstLetterToUpperCase("please first letter big"));// first letter capital using substring, toUpperCase and trim
        
        System.out.println(ReverseEachWordinString.reverseEachWord("ok bo gol"));
        
        System.out.println(Toggle.eachWordToggle("niedlugo czas spac"));
        
        System.out.println(ReverseToggle.reverseToggle("niedlugo czas spac"));
        
        System.out.println(WhiteSpaces.removeWhiteSpaces("bez przerw to zdanie zrob"));
        System.out.println(CountWords.count("How many words can you see"));
        
        System.out.println(SwapStrings.withoutTemp("ja", "agata"));
    }
    
}
