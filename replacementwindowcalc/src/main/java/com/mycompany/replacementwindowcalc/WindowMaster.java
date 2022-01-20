package com.mycompany.replacementwindowcalc;

import java.util.Scanner;

/**
 * Calculator for Replacement Windows
 *
 */
public class WindowMaster {

    public static void main(String[] args) {
        // Variables for height and width
        float height;
        float width;
        float glass;
        float trim;
        float numberOfWindows;
      
        // other variables will be used for calc values
        float areaOfWindow;
        float cost;
        float perimiterOfWindow;
        float totalWindows;

        // initialize Scanner
        Scanner myScanner = new Scanner(System.in);
        
        // Created a try-catch block using number format exception 
        // to stop invalid input from user
        try {
            
            // get input using the scanner and .nextFloat
            System.out.println("Please enter window height");
            height = myScanner.nextFloat();
            System.out.println("Please enter window width");
            width = myScanner.nextFloat();
            System.out.println("Please enter the cost of the glass");
            glass = myScanner.nextFloat();
            System.out.println("Please enter the cost of the trim");
            trim = myScanner.nextFloat();
            System.out.println("How many windows?");
            numberOfWindows = myScanner.nextFloat();
                      
            //calculate area of window
            areaOfWindow = height * width;
            //calculate perimiter of window
            perimiterOfWindow = 2 * (height + width);
            //calculate the total cost
            cost = ((glass * areaOfWindow) + (trim * perimiterOfWindow));
            totalWindows = (cost * numberOfWindows);
            //display the results to the user
            System.out.println("Window height = " + height);
            System.out.println("Window width = " + width);
            System.out.println("Window area = " + areaOfWindow);
            System.out.println("Window perimiter = " + perimiterOfWindow);
            System.out.println("Total Cost of single window = " + cost);
            System.out.println("Total Cost of all windows = " + totalWindows);
        } catch (NumberFormatException e) {
            System.out.println("Enter only numbers!");
        }

    }
    // Use this method to calculate values and return to main method
//    public static float calcValues() {
//        
//    }
}
