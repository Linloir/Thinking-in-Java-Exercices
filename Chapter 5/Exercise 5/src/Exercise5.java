//:Create a class named Dog including an overloaded bark() method. This method should response to different type of argument
// and print different types of bark.

/**
 * Exercise 5 of Chapter 5
 * @author Linloir
 * @author Jonathan Zhang
 * @version 1.0 2020-10-25
 */

import java.util.*;

public class Exercise5 {
    public static void main(String[] args) {
        Dog aDog = new Dog();
        int i = 1;
        char c = 'x';
        float f = 1.0f;
        aDog.bark(i);
        aDog.bark(c);
        aDog.bark(f);
    }
}

class Dog {
    void bark(int i) {
        System.out.println("barking");
    }
    void bark(char c) {
        System.out.println("howling");
    }
    void bark(float f) {
        System.out.println("wulfing");
    }
}
