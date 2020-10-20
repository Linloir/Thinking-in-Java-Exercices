//:Modify Exercise 1 so that the program exits by using the break keyword at value 99. Try using return instead.

/**
 * Exercise 7 of Chapter 4
 * @author Linloir
 * @author Jonathan Zhang
 * @version 1.0 2020-10-20
 */

import java.util.*;

public class Exercise7 {
    public static void main(String[] args) {
        int num = 1;
        for (;;) {
            if(num > 99)    break;
            System.out.println(num);
            num ++;
        }
    }
}

