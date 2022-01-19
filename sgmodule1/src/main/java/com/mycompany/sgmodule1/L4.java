package com.mycompany.sgmodule1;

import java.util.Scanner;

/**
 *
 * @author jon
 */
public class L4 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Hey enter a number");
        int number1 = Integer.parseInt(myScanner.nextLine());
        
        System.out.println("Now another number");
        int number2 = Integer.parseInt(myScanner.nextLine());
        
        int answer = number1 + number2;
        System.out.println("The Answer is " + answer);
        
    }
}