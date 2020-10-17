//:Write a program with two constant values, one with alternating binary
// ones and zeroes, with a zero in the least-significant digit, and the
// second, also alternating, with one in the least-significant digit

/**
 * Exercise 10 of Chapter 3
 * @author Linloir
 * @author Jonathan Zhang
 * @version 1.0 2020-10-16
 */

import java.util.*;

public class Exercise10 {
    public static void main(String[] args) {

        int a = 0x2AA;
        int b = 0x155;

        System.out.println("a & b is: " + Integer.toBinaryString(a & b));
        System.out.println("a | b is: " + Integer.toBinaryString(a | b));
        System.out.println("a ^ b is: " + Integer.toBinaryString(a ^ b));
        System.out.println("~a is: " + Integer.toBinaryString(~a));
        System.out.println("~b is: " + Integer.toBinaryString(~b));
    }
}/*Output:
a & b is: 0
a | b is: 1111111111
a ^ b is: 1111111111
~a is: 11111111111111111111110101010101
~b is: 11111111111111111111111010101010
*/

/*
Comments:
    1. Using Hex can easily express binary sequence like 11111...(1,3,7&F), 101010101(1&5), 100101010(2&A)
    2. 'toBinaryString' function prints only one zero for sequence full of zeroes
    3. When using '~', you get a number of the full length of it's type
 */
