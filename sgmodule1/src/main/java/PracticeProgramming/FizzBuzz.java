/*

 */
package PracticeProgramming;

/**
 *
 * @author jonga
 */
public class FizzBuzz {

    public static void main(String[] args) {
        // For loop to print out 1-100 to console
        for (int counter = 1; counter <= 100; counter++) {
            if (counter % 15 == 0) {
                System.out.println("Fizz Buzz");
            } else if (counter % 3 == 0) {
                System.out.println("Fizz");
            } else if (counter % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(counter);
            }
        }

    }
}
