//:Start with a number that has a binary one in the most significant position. Using the signed right-shift operator,
// right shift it all the way through all of its binary positions, each time displaying the result using
// Integer.toBinaryString( ).
/**
 * Exercise 11 of Chapter 3
 * @author Linloir
 * @author Jonathan Zhang
 * @version 1.0 2020-10-17
 */

import java.util.*;

public class Exercise11 {
    public static void main(String[] args) {
        int numberWithBinaryOneInTheMostSignificantPosition = 0x200;
//      int i = 2
//      System.out.println(i += 1);
        for (int step = 1; step <= 10; ++step) {
            System.out.println("step " + step + ": " + Integer.toBinaryString(numberWithBinaryOneInTheMostSignificantPosition>>=1));
        }
    }
}/*Output:
step 1: 100000000
step 2: 10000000
step 3: 1000000
step 4: 100000
step 5: 10000
step 6: 1000
step 7: 100
step 8: 10
step 9: 1
step 10: 0
*/

/*
Comments:
    1. Line16&17 demonstrate the priority between print and +=: first '+' and then '=' and then print.
    2. '>>=' also follows the priority in comment1.
 */
