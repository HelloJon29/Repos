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
        // String variables for input
        String stringHeight = null;
        String stringWidth = null;
        String stringGlass = null;
        String stringTrim = null;
        String stringNumberOfWindows = null;
        // other variables
        float areaOfWindow;
        float cost;
        float perimiterOfWindow;
        float totalWindows;

        // initialize Scanner
        Scanner myScanner = new Scanner(System.in);
        try {
            // get input

            System.out.println("Please enter window height");
            stringHeight = myScanner.nextLine();
            System.out.println("Please enter window width");
            stringWidth = myScanner.nextLine();
            System.out.println("Please enter the cost of the glass");
            stringGlass = myScanner.nextLine();
            System.out.println("Please enter the cost of the trim");
            stringTrim = myScanner.nextLine();
            System.out.println("How many windows?");
            stringNumberOfWindows = myScanner.nextLine();
            // convert String to float values
            height = Float.parseFloat(stringHeight);
            width = Float.parseFloat(stringWidth);
            glass = Float.parseFloat(stringGlass);
            trim = Float.parseFloat(stringTrim);
            numberOfWindows = Float.parseFloat(stringNumberOfWindows);
            //calculate area of window
            areaOfWindow = height * width;
            //calculate perimiter of window
            perimiterOfWindow = 2 * (height + width);
            //calculate the total cost
            cost = ((glass * areaOfWindow) + (trim * perimiterOfWindow));
            totalWindows = (cost * numberOfWindows);
            //display the results to the user
            System.out.println("Window height = " + stringHeight);
            System.out.println("Window width = " + stringWidth);
            System.out.println("Window area = " + areaOfWindow);
            System.out.println("Window perimiter = " + perimiterOfWindow);
            System.out.println("Total Cost of single window = " + cost);
            System.out.println("Total Cost of all windows = " + totalWindows);
        } catch (NumberFormatException e) {
            System.out.println("Enter only numbers!");
        }

    }
}
