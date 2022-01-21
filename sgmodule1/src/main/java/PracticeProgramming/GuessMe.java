
package PracticeProgramming;

import java.util.Scanner;

/**
 *
 * @author jon
 */
public class GuessMe {
    public static void main (String[] arg) {
        int chosenNumber = 29;
        System.out.println("I chose a number, try guessing it!");
        Scanner guess = new Scanner(System.in);
        int userNumber = guess.nextInt();
        System.out.println("You guessed: " + userNumber);
        
        if(userNumber == chosenNumber) {
            System.out.println("Wow nice guess! You got it!");
        }
        if(userNumber > chosenNumber) {
            System.out.println("Too bad! I chose " + chosenNumber + ". Way too high!");
        }
        if(userNumber < chosenNumber) {
            System.out.println("Haha too low, I chose " + chosenNumber + "!");
        }
        
    }
}
