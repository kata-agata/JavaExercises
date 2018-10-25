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
public class SwapStrings {
    public static String withoutTemp(String a, String b){
        System.out.println("before: a= " + a + " b= " + b);
        a=a+b;
        b=a.substring(0,a.length()-1-(b.length()-1));
        a=a.substring(b.length());
        String toprint="after: a= " + a + " b= " + b;
        return toprint;
    }
            
}
