/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProgramming;

/**
 *
 * @author jonga
 */
public class ReverseAWord {
    public static void main(String[] args) {
        String word = "anime";
        String reverse = ""; // empty String
        char r; // char type as empty variable to add to
        System.out.println("The original word is " + word);
        // for loop to increment through the length of the word String
        for (int i = 0; i < word.length(); i++) {
           r = word.charAt(i); // Here using the charAt method to extract each character in the word String
           reverse = r + reverse; // Using what i learned before to add fetched iterations together to a empty String
       }
        System.out.println("The word reversed is " + reverse);
    }
    
    
}
