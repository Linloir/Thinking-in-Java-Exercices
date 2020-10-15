//:Create a class called 'Dog' containing two Strings: name and says. In main(), create two dog objects with names 'spot'
// (who says, 'Ruff!') and 'scruffy' (who says, 'Wurf!'). Then display their names and what they say.
/**
 * Exercise 5 of Chapter 3
 * @author Linloir
 * @author Jonathan Zhang
 * @version 1.0 2020-10-15
 */

import java.util.*;

public class Exercise5 {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        dog1.name = "spot";
        dog2.name = "scruffy";

        dog1.says = "Ruff!";
        dog2.says = "Wurf!";

        System.out.println(dog1.name + " says: " + dog1.says);
        System.out.println(dog2.name + " says: " + dog2.says);
    }
}

class Dog {
    String name;
    String says;
}/*Output:
spot says: Ruff!
scruffy says: Wurf!
*/
