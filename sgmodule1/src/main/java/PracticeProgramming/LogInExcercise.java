// Simple excercise to check for log in credentials
package PracticeProgramming;

import java.util.Scanner;

/**
 *
 * @author jon
 */
public class LogInExcercise {
    public static void main(String[] arg) {
        //These variables and print statements ask for username
        System.out.println("Please enter username");
        String username = "FreshFish";
        
        //The first initialization of scanner to be used throughout the program
        Scanner unlock = new Scanner(System.in);
        String attempt = unlock.nextLine();
        
        //The first while loop to catch incorrect log info
        while(!attempt.equals(username)) {
            System.out.println("Incorrect username");
            System.out.println("Please enter username");
            attempt = unlock.nextLine();
        }
        //These variables and print statemeents ask for password
        System.out.println("Please enter password");
        String password = "JuicyJuice";
        
        // The second loop to catch incorrect log info
        while(!attempt.equals(password)) {
            System.out.println("Incorrect password");
            System.out.println("Please enter password");
            attempt = unlock.nextLine();
        }
        
        //when all the above conditions are satisfied print this
        System.out.println("Log in successful!");
    }
}
