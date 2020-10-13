//:Code a program demonstrating no matter how many objects of a specific class built, a specific static realm only has
// one instance.
/**
 * Exercise 8 of Chapter 2
 * @author Linloir
 * @author Jonathan Zhang
 * @version 1.0 2020-10-13
 */

package com.Linloir.demo;
import java.util.*;

public class Exercise8 {
    public static void main(String[] args) {
        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();
        StaticTest st3 = new StaticTest();
        System.out.println(st1.i);
        System.out.println(st2.i);
        System.out.println(st3.i);
    }
}

class StaticTest {
    static int i = 1;
}/*Output:
1
1
1
*/
