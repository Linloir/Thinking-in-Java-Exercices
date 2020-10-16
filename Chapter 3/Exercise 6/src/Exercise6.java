//:Following Exercise 5, create a new Dog reference and assign it to spot's object. Test for comparison using == and
// equals() for all references
/**
 * Exercise 6 of Chapter 3
 * @author Linloir
 * @author Jonathan Zhang
 * @version 1.0 2020-10-16
 */

public class Exercise6 {
    public static void main(String[] args) {

        Dog spot = new Dog();
        Dog scruffy = new Dog();

        spot.name = "spot";
        scruffy.name = "scruffy";

        spot.says = "Ruff!";
        scruffy.says = "Wurf!";

        System.out.println(spot.name + " says: " + spot.says);
        System.out.println(scruffy.name + " says: " + scruffy.says);

        Dog newDog = new Dog();
        newDog = spot;

        System.out.println(newDog == spot);
        System.out.println(newDog == scruffy);
        System.out.println(spot == scruffy);

        System.out.println(newDog.equals(spot));
        System.out.println(newDog.equals(scruffy));
        System.out.println(spot.equals(scruffy));

    }
}

class Dog {
    String name;
    String says;
}/*Output:
spot says: Ruff!
scruffy says: Wurf!
true
false
false
true
false
false
*/

/*
Comments:
    1. System.out.println method prints a boolean type data as 'true' and 'false'
Questions:
    1. What does equals() method actually compares?
       If the object has two or more data inside do equals compare all of them?
       For example:
            class AClass {
                int aData1;
                int aData2;
            }

            public class MainClass {
                public static void main(String[] args) {
                    AClass object1 = new object1();
                    AClass object2 = new object2();
                    object1.aData1 = 1;
                    object1.aData2 = 2;
                    object2.aData1 = 1;
                    object2.aData2 = 3;
                    System.out.println(object1.equals(object2));
                }
            }
            Whether the output is true or false?
 */
//:~
