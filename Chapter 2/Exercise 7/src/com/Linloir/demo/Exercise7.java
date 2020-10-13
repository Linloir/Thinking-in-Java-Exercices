//:Convert the Incremental() code into a full available program
/**
 * Exercise 7 of Chapter 2
 * @author Linloir
 * @author Jonathan Zhang
 * @version 1.0 2020-10-13
 */

package com.Linloir.demo;
import java.util.*;

public class Exercise7 {
    public static void main(String[] args) {
        Incrementable.increment();
        System.out.println(StaticTest.i);
    }
}

class StaticTest {
    static int i = 47;
}

class Incrementable {
    static void increment() {
        StaticTest.i++;
    }
}/*Output:
48
*/