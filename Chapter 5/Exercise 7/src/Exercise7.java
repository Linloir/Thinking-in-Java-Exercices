//:Create a class without a constructor, and then create an object of that class in main( ) to verify that the default
// constructor is automatically synthesized.

/**
 * Exercise 7 of Chapter 5
 * @author Linloir
 * @author Jonathan Zhang
 * @version 1.0 2020-10-25
 */

import java.util.*;

public class Exercise7 {
    public static void main(String[] args) {
        ClassWithoutAConstructor anObject = new ClassWithoutAConstructor();
    }
}

class ClassWithoutAConstructor {

}