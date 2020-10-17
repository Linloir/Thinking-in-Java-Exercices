//:Compare two strings
/**
 * Exercise 14 in Chapter 3
 * @author Linloir
 * @author Jonathan Zhang
 * @version 1.0 2020-10-17
 */

import java.util.*;

public class Exercise14 {
    static void compareTwoStrings (String string1, String string2) {
        if (string1 == string2) {
            System.out.println("The same");
        } else {
            System.out.println("Not the same");
        }

        if (string1 != string2) {
            System.out.println("Not the same");
        } else {
            System.out.println("The same");
        }

        //verify
        if (string1.equals(string2)) {
            System.out.println("The same");
        } else {
            System.out.println("Not the same");
        }
    }
    public static void main(String[] args) {
        String aString1 = "Hello World";
        String aString2 = "Hello World!";
        compareTwoStrings(aString1, aString2);

        String aString3 = "Test string";
        String aString4 = "Test string";
        compareTwoStrings(aString3, aString4);
    }
}/*Output:
Not the same
Not the same
Not the same
The same
The same
The same
*/
