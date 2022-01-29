// Practicing If statements in this excercise
package PracticeProgramming;

import java.util.Scanner;

/**
 *
 * @author jon
 */
public class YourLifeInMovies {
    public static void main(String[] args) {
        // Initialize a few basic variables
        String name = "";
        int age = 0;
        // Instantiate scanner
        Scanner myScanner = new Scanner(System.in);
        // Take user input and print general questions and responses
        System.out.println("Hell there, what's your name?");
        name = myScanner.nextLine();
        System.out.println("Nice to meet you " + name + ". So how old are you?");
        age = myScanner.nextInt();
        System.out.println("Wow you're " + age + "? Here are some fun facts.");
        // Now if statements to print out some age roasts
        if (age > 57){
            System.out.println("The Pixar movie Up is now a decade old!");
            System.out.println("And the first Harry Potter movie came out over 15 years ago...");
            System.out.println("Also Space Jam came out not in the last decade, but the decade before!");
            System.out.println("And the first release of Jurassic Park is closer to the moon landing than it is today.");
            System.out.println("And lastly, Mash TV has been around for half a century!");
        } else if (age > 47) {
            System.out.println("The Pixar movie Up is now a decade old!");
            System.out.println("And the first Harry Potter movie came out over 15 years ago...");
            System.out.println("Also Space Jam came out not in the last decade, but the decade before!");
            System.out.println("And the first release of Jurassic Park is closer to the moon landing than it is today.");
        } else if (age > 37) {
            System.out.println("The Pixar movie Up is now a decade old!");
            System.out.println("And the first Harry Potter movie came out over 15 years ago...");
            System.out.println("Also Space Jam came out not in the last decade, but the decade before!");
        } else if (age > 27) {
            System.out.println("The Pixar movie Up is now a decade old!");
            System.out.println("And the first Harry Potter movie came out over 15 years ago...");
        } else {
            System.out.println("The Pixar movie Up is now a decade old!");
        }
    }
}
