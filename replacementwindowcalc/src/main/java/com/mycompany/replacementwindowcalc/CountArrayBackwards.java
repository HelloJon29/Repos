
package com.mycompany.replacementwindowcalc;

/**
 *
 * @author jon
 */
public class CountArrayBackwards {
    public static void main(String[] arg) {
        int[] newArray = {0 , 1, 2, 3, 4, 5, 6, 7};
        
        for (int count = newArray.length - 1; count >= 0; count--) {
            System.out.println(newArray[count]);
        }
    }
    }
