//:Find codes with 'ATypeName' and change them into a full program and run it
/**
 * Exercise 3 of Chapter 2
 * @author Linloir
 * @author Jonathan Zhang
 * @version 1.0
 * @since 2020-10-12
 */

package com.Linloir.demo;
import java.util.*;

public class Exercise3 {
    public static void main(String[] args) {
        ATypeName a = new ATypeName();
        a.print();
    }
}

class ATypeName {
    void print() {
        System.out.println("Hello World");
    }
}/*Output:
Hello World
*/