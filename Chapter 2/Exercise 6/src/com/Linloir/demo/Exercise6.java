//:Write a program which contains function storage() and invoke it
/**
 * Exercise 6 of Chapter 2
 * @author Linloir
 * @author Jonathan Zhang
 * @version 1.0
 * @since 2020-10-12
 */
/*
package com.Linloir.demo;
import java.util.*;

public class Exercise6 {
    int storage(String s){
        return s.length() * 2;
    }
    String c;
    public static void main(String[] args) {
        Exercise6 s = new Exercise6();
        s.c = "Hello World";
        System.out.println(Exercise6.storage(s.c));
    }
}/*Output:
22
* /

*/

/*
Bugs:
    1. In this version, can't refer a non-static function from a static function(line 21)
Question:
    1. Why can't I refer a non-static function from a static function? What is the barrier?
    2. What is the difference between anouncing a char(or int etc) in a class and evaluate it in a function? And what if
        evaluating it in a instance referred from a function?
Comment:
    1. String has a capital S
    2. String uses "
*/

//Guide version
package com.Linloir.demo;

public class Exercise6 {
    String s = "Hello, World!";
    int storage(String s) {
        return s.length() * 2;
    }
    void print() {
        System.out.println("Storage(s) = " + storage(s));
    }
    public static void main(String[] args) {
        Exercise6 st = new Exercise6();
        st.print();
    }
}/*Output:
storage(s) = 26
*///:~


