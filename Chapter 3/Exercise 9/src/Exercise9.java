//:Display the largest and smallest numbers for both float and double exponential notation
/**
 * Exercise 9 of Chapter 3
 * @author Linloir
 * @author Jonathan Zhang
 * @version 1.0 2020-10-16
 */

import java.util.*;

public class Exercise9 {
    public static void main(String[] args) {
        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;
        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;
        System.out.println("Float min is: " + minFloat);
        System.out.println("Float max is: " + maxFloat);
        System.out.println("Double min is: " + minDouble);
        System.out.println("Double max is: " + maxDouble);
    }
}/*Output:
Float min is: 1.4E-45
Float max is: 3.4028235E38
Double min is: 4.9E-324
Double max is: 1.7976931348623157E308
*/
