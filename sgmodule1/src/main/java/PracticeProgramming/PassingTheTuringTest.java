/*
 Practice using Scanner to pass the Turing Test
 */
package PracticeProgramming;
//Imported Scanner from library
import java.util.Scanner;

/**
 *
 * @author jon
 */
public class PassingTheTuringTest {
    public static void main(String[] args) {
        //Initialize Scanner
        Scanner ai = new Scanner(System.in);
        //Initialize variables
        String myName;
        String aiName;
        String myColor;
        String myFood;
        int myNumber;
        // Begin Printing to console and taking user input
        System.out.println("Hello!");
        System.out.println("What is your name?");
        myName = ai.nextLine();
        // Have computer confirm
        System.out.println("Huh, so your name is " + myName + " right? I'm AI!");
        //move to next question and variables, in this case color
        System.out.println("So what's your favorite color?");
        myColor = ai.nextLine();
        System.out.println("Wow I love " + myColor + " too!");
        // Now Food
        System.out.println("We might have a lot in common! What's your favorite food " + myName + "?");
        myFood = ai.nextLine();
        //Small talk
        System.out.println("You also like " + myFood + " too?! We really are 2 peas in a pod.");
        //Number time
        System.out.println("I guess I might as well ask your favorite number too, what's the best number in your opinion?");
        //Notice the change to nextInt, because we declared myNumber as an Integer type
        myNumber = ai.nextInt();
        // small talk to end the conversation
        System.out.println("No way you like " + myNumber + ". I guess we couldn't be a 100% match haha!");
        System.out.println("I had fun talking to you " + myName + ". Have a wonderful day!");
    }
    
}
