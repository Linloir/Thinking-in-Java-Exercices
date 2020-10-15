//:Create a class containing a float field, and use this class to demonstrate the alias mechanism when invoking(调用) a
// method
/**
 * Exercise 3 of Chapter 3
 * @author Linloir
 * @author Jonathan Zhang
 * @version 1.0 2020-10-15
 */

import java.util.*;

public class Exercise3 {
    static void aMethod(ClassContainingAFloatField b) {
        b.f = 6.66f;
    }
    public static void main(String[] args) {
        ClassContainingAFloatField a = new ClassContainingAFloatField();
        System.out.println(a.f);
        aMethod(a);
        System.out.println(a.f);
    }
}

class ClassContainingAFloatField {
    float f = 2.33f;
}/*Output:
2.33
6.66
*/
