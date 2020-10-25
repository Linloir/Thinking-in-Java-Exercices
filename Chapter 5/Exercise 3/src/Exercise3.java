//:Create a class containing a default constructor, print a message in the constructor. Create an object for this class.

/**
 * Exercise 3 of Chapter 5
 * @author Linloir
 * @author Jonathan Zhang
 * @version 1.0 2020-10-25
 */

import java.util.*;

class ClassWithADefaultConstructor {
    ClassWithADefaultConstructor(){
        System.out.println("A Message");
    }
}

public class Exercise3 {
    public static void main(String[] args) {
        ClassWithADefaultConstructor anObject = new ClassWithADefaultConstructor();
    }

}
