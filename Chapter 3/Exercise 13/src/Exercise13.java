//:Write a method that displays char values in binary form. Demonstrate it using several different characters.
/**
 * Exercise 13 of Chapter 3
 * @author Linloir
 * @author Jonathan Zhang
 * @version 1.0 2020-10-17
 */

import java.util.*;


public class Exercise13 {
    static int displayCharValue(char input) {
        int conv = ~input;
        return ~conv;
    }
    public static void main(String[] args) {
        char aChar = 'x';
        System.out.println("x is: " + Integer.toBinaryString(displayCharValue(aChar)));

        aChar = 'a';
        System.out.println("a is: " + Integer.toBinaryString(displayCharValue(aChar)));

        aChar = 'b';
        System.out.println("b is: " + Integer.toBinaryString(displayCharValue(aChar)));
    }
}/*Output:
x is: 1111000
a is: 1100001
b is: 1100010
*/

/*
Comments:
    1. Still can't understand the difference between static, public and public static method.
Question:
    1. Why can I refer a static method of the main class from the main method with out claiming a class or an object? (line19)
 */
