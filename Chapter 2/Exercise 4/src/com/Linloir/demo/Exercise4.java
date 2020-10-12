//:Convert the previous DataOnly codes into a program , build and run it
/**
 * Exercise 4 of Chapter 2
 * @author Linloir
 * @author Jonathan Zhang
 * @version 1.0
 * @since 2020-10-12
 */

package com.Linloir.demo;
import javax.xml.crypto.Data;
import java.util.*;

public class Exercise4 {
    public static void main(String[] args) {
        DataOnly data = new DataOnly();
        data.i = 47;
        data.d = 1.1;
        data.b = false;
    }
}

class DataOnly {
    int i;
    double d;
    boolean b;
}/*Output:
nothing
*/

//Guide version
/*
package com.Linloir.demo

public class Exercise4 {
    int i;
    double d;
    boolean b;
    public static void main(String[] args) {
        Exercise4 d = new Exercise4();
        d.i = 47;
        d.d = 1.1;
        d.b = false;
   }
}
*/

/*
Comments:
    1. At line 48 & 37 we can see that a variable can share a same name with a instance.
    2. At line 48 we can see that inside a 'way' of a specific class we can create a instance of class itself.
Question:
    1. In what circumstance can we create a instance of a class which is the same as the 'way' that concludes the
        instance itself
    2. What will happen if we request a way that concludes a instance of the class the 'way' has? Will we get a infinite
        amount of instances?
 */
