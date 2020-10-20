//:Modify the two test( ) methods in the previous two programs so that they take two extra arguments, begin and end,
// and so that testval is tested to see if it is within the range between (and including) begin and end.

/**
 * Exercise 6 of Chapter 4
 * @author Linloir
 * @author Jonathan Zhang
 * @version 1.0 2020-10-20
 */

import java.util.*;

public class Exercise6 {
    static int test(int testval, int target,int bgn, int end) {
        if(testval >= bgn && testval <= end) {
            if (testval > target)
                return +1;
            else if (testval < target)
                return -1;
            return 0;
        }
        if (testval > target)
            return +2;
        else if (testval < target)
            return -2;
        return 3;
    }
    public static void main(String[] args) {
        System.out.println(test(2,5,1,6));
        System.out.println(test(6,6,1,3));
        System.out.println(test(4,3,1,2));
    }
}
