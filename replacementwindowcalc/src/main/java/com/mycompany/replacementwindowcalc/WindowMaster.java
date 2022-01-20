package com.mycompany.replacementwindowcalc;

import java.util.Scanner;

/**
 * Calculator for Replacement Windows
 *
 */
public class WindowMaster {

    public static void main(String[] args) {
        // Variables for height and width stored with values taken from input function
        float height = input("Please enter window height.");
        float width = input("Please enter window width.");
        float glass = input("Please enter cost of the glass.");
        float trim = input("Please enter cost of the trim.");
        float numberOfWindows = input("How many windows?");

        // other variables will be used for calc values
        float areaOfWindow;
        float cost;
        float perimiterOfWindow;
        float totalWindows;

        //calculate area of window
        areaOfWindow = height * width;
        //calculate perimiter of window
        perimiterOfWindow = 2 * (height + width);
        //calculate the total cost
        cost = ((glass * areaOfWindow) + (trim * perimiterOfWindow));
        totalWindows = (cost * numberOfWindows);

        //display the results to the user after calling from results method
        results("Window height = " + height);
        results("Window width = " + width);
        results("Window area = " + areaOfWindow);
        results("Window perimiter = " + perimiterOfWindow);
        results("Total Cost of single window = " + cost);
        results("Total Cost of all windows = " + totalWindows);

    }

    // Use this method to get input values and return to main method
    public static float input(String prompt) {
        // Iitialize Scanner
        Scanner scanner = new Scanner(System.in);

        //Prompt to console
        System.out.println(prompt);
        // Use scanner to take input and return the value
        float value = scanner.nextFloat();
        return value;

    }
    // Add While loop here to catch errors instead of try-catch
    
    // Use this method to call println for the results in the main method
    public static void results(String text) {
        System.out.println(text);
    }
}
