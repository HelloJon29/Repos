/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProgramming;

/**
 *
 * @author jonga
 */
public class StayPositive {
    public static void main(String[] args) {
        int start = 10;
        
        System.out.println("Count Down Begins now!");
        while (start >= 0) {
            System.out.println(start);
            start--;
        }
        System.out.println("Finish!");
    }
}
