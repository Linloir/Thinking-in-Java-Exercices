//:Print value from 1 to 100
/**
 * Exercise 1 of Chpater 4
 * @author Linloir
 * @author Jonathan Zhang
 * @version 1.0 2020-10-18
 */

import java.util.*;

public class Exercise1 {
    public static void main(String[] args) {
        for (int step = 0, num = 1; step < 100; ++step, ++num)
            System.out.println(num);
    }
}/*Output
1
2
...
100
*/

/*
Comments:
    1. While int two number in the 'initialization' parameter of 'for', only one int declaration is allowed
       e.g. for(int step = 0, num = 1;.... //legal
            for(int step = 0, int num = 1;... //illegal Warning: Can't resolve num
    2. While doing self-add operation in the 'step' parameter of 'for, use ',' to seperate several expressions is allowed
Questions:
    1. How can i claim two variables of different type in the 'initialization' parameter ?
 */