//:Creat a class containing a float field and use it to demonstrate the alias(别名) mechanism

/**
 * Exercise 2 of Chapter 3
 * @author Linloir
 * @author Jonathan Zhang
 * @version 1.0 2020-10-15
 */

import java.util.*;

public class Exercise2 {
    public static void main(String[] args) {
        ClassContainingAFloatField f1 = new ClassContainingAFloatField();
        ClassContainingAFloatField f2 = new ClassContainingAFloatField();

        f1.f = 2.33f;
        f2.f = 6.66f;

        System.out.println("f1 is " + f1.f);
        System.out.println("f2 is " + f2.f);

        f1 = f2;

        System.out.println("f1 is " + f1.f);
        System.out.println("f2 is " + f2.f);

        f1.f = 9.99f;

        System.out.println("f1 is " + f1.f);
        System.out.println("f2 is " + f2.f);
    }
}

class ClassContainingAFloatField {
    float f;
}/*Output:
f1 is 2.33
f2 is 6.66
f1 is 6.66
f2 is 6.66
f1 is 9.99
f2 is 9.99
*/
