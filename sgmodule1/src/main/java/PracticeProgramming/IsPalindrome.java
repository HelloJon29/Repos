
package PracticeProgramming;

/**
 *
 * @author jonga
 */
public class IsPalindrome {
    public static void main(String[] args) {
       String name = "anna";
       String reverse = "";
       
       for (int i = name.length() - 1; i >= 0; i--){ // this for loop counts backwards/decrements from the String length, also treats name as an array
           reverse = reverse + name.charAt(i); // New info about .charAt method, can be used along with String, this new expression reads the name in reverse
       }
       if (reverse.equals(name)) { // Ive used .equals before, but it means that the value of content is the same, comprared to ==
           System.out.println(name + " is a palindrome!");
       } else {
           System.out.println(name + " is not a palindrome!");
       }
    }
}
