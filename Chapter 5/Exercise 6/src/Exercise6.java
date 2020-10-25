//:Revise the previous program, let two overload method take two different types of argument with opposite order.

/**
 * Exercise 6 of Chapter 5
 * @author Linloir
 * @author Jonathan Zhang
 * @version 1.0 2020-10-25
 */

import java.util.*;

public class Exercise6 {
    public static void main(String[] args) {
        int i = 1;
        char c = 'x';

        Dog aDog = new Dog();
        aDog.bark(i, c);
        aDog.bark(c, i);
    }
}

class Dog {
    void bark(int i, char c) {
        System.out.println("barking");
    }
    void bark(char c, int i) {
        System.out.println("howling");
    }
}
