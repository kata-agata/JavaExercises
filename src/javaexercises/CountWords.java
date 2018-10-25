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
public class CountWords {
    public static int count(String s){
        String words[] = s.split("\\s");
        int size = words.length;
        return size;
    }
}
