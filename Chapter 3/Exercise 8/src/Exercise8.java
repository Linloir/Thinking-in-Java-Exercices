//:Show that hex and octal notations work with long values. Use Long.toBinaryString() to display the results.
/**
 * Exercise 8 of Chapter 3
 * @author Linloir
 * @author Jonathan Zhang
 * @version 1.0 2020-10-16
 */

import java.util.*;

public class Exercise8 {
    public static void main(String[] args) {
        long a = 0x2fL;
        long b = 0177L;
        System.out.println("a = " + Long.toBinaryString(a));
        System.out.println("b = " + Long.toBinaryString(b));
    }
}/*Output:
a = 101111
b = 1111111
*/
