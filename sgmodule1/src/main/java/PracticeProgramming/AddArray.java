
package PracticeProgramming;

/**
 *
 * @author jonga
 */
public class AddArray {
    public static void main(String[] args) {
        int[] add = {12, 18, 30, 100, 40};
        int total = 0;
        //System.out.println(add[0] + add[1] + add[2] + add[3] + add[4]);
        
        for (int count = 0; count < add.length; count++) {
            total += add[count];
        }
        System.out.println(total);
    }
}
