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
//        ClassContainingAFloatField.aMethod(a);        //Question 1. Test
        aMethod(a);
        System.out.println(a.f);
    }
}

class ClassContainingAFloatField {
//    static void aMethod(ClassContainingAFloatField b) {       //Question 1. Test
//        b.f = 6.66f;
//    }
    float f = 2.33f;
}/*Output:
2.33
6.66
*/

/*
Comment:
    1. It's mighty to encounter a mistake when a variable of float type is valuated by a number of double type.
       e.g. float f = 2.33;
       Fixed. float f = 2.33f;
Question:
    1. What if aMethod(ClassContainingAFloatField) is contained in class ClassContainingAFloatField ?
Answer:
    1. Normally built and run.
 */
