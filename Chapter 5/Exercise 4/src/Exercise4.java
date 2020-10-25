//:Add an overloaded constructor to the previous exercise that takes a String argument and prints it along with your message.

/**
 * Exercise 4 of Chapter 5
 * @author Linloir
 * @author Jonathan Zhang
 * @version 1.0 2020-10-25
 */

import java.util.*;

public class Exercise4 {
    public static void main(String[] args) {
        ClassWithAOverloadedConstructor anObject = new ClassWithAOverloadedConstructor(1);
    }
}

class ClassWithAOverloadedConstructor {
    ClassWithAOverloadedConstructor(int input) {
        System.out.println("A message " + input);
    }
}
