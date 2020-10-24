//:Create a class containing an uninitialized String reference. Demonstrate that this reference is initialized by Java
// to null.

/**
 * Exercise 1 of Chapter 5
 * @author Linloir
 * @author Jonathan Zhang
 * @version 1.0
 */

import java.util.*;

public class Exercise1 {
    public static void main(String[] args) {
        UnInitializedString test = new UnInitializedString();
        System.out.println(test);
    }
}

class UnInitializedString {
    String a;
}
