/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProgramming;
// Imported Class
import java.util.Scanner;

/**
 *
 * @author jonga
 */
public class ForTimes {
    public static void main(String[] args) {
        // Instantiate scanner for user input
        Scanner input = new Scanner(System.in);
        int number = 0;
        // Ask for input using printLn
        System.out.println("Which times table shall I recite?");
        number = input.nextInt();
        // Begin for loop to list 1-15 times the user input
        for (int i = 1; i <= 15; i++) {
            int product = i * number;
            System.out.println(i + " * " + number + " is: " + product);
        }
        input.close();
    }
}
