//:Convert the example "AllTheColorsOfTheRainbow" into a program
/**
 * Exercise 11 of Chapter 2
 * @author Linloir
 * @author Jonathan Zhang
 * @version 1.0 2020-10-15
 */

import java.util.*;

public class Exercise11 {
    public static void main(String[] args){
        AllTheColorOfTheRainbow rainbow1 = new AllTheColorOfTheRainbow();
        rainbow1.changeTheHueOfTheColor(100);
    }
}

class AllTheColorOfTheRainbow {
    int anIntegerRepresentingColors;
    void changeTheHueOfTheColor(int newHue) {
        AllTheColorOfTheRainbow c = new AllTheColorOfTheRainbow();
        c.anIntegerRepresentingColors = newHue;
        System.out.println("The new Hue is " + c.anIntegerRepresentingColors);
    }
}/*Output:
The new Hue is 100
*/

/*
Questions:
    1. What is the difference between:(line with *)
        class AllTheColorOfTheRainbow {
            int anIntegerRepresentingColors;
            void changeTheHueOfTheColor(int newHue) {
                *AllTheColorOfTheRainbow c = new AllTheColorOfTheRainbow();
                c.anIntegerRepresentingColors = newHue;
                System.out.println("The new Hue is " + c.anIntegerRepresentingColors);
            }
        }

        class AllTheColorOfTheRainbow {
            int anIntegerRepresentingColors;
            *AllTheColorOfTheRainbow c = new AllTheColorOfTheRainbow();
            void changeTheHueOfTheColor(int newHue) {
                c.anIntegerRepresentingColors = newHue;
                System.out.println("The new Hue is " + c.anIntegerRepresentingColors);
            }
        }
    2. Is
            ClassType1 a = new ClassType1();
            ClassType2 a = new ClassType2();
       Legal?
    3. As I can't new an object in main and use it in other methods, can I:
            public static void main(String[] args) {
                ClassType a = new ClassType();
            }

            class ClassType {
                void aMethod {
                    ClassType a = new ClassType();
                }
            }
 */
