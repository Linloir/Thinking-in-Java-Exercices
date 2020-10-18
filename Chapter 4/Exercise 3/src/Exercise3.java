//:Modify Exercise 2 so that your code is surrounded by an “infinite” while loop. It will then run until you interrupt
// it from the keyboard

/**
 * Exercise 3 of Chapter 4
 * @author Linloir
 * @author Jonathan Zhang
 * @version 1.0 2020-10-18
 */

import java.util.*;

public class Exercise3 {
    public static void main(String[] args) {
        Random rand = new Random(47);
        int num1 = rand.nextInt(100);
        System.out.println("Number 1\t: " + num1);
        int num2;
        int step = 1;
        boolean a = true;
        while (a) {
            num2 = rand.nextInt(100);
            System.out.print("Number "+ ++step + "\t: " + num2 + " ");
            if (num2 > num1)
                System.out.println("\tGreater than the previous number");
            else if (num2 < num1)
                System.out.println("\tLess than the previous number");
            else
                System.out.println("\tEqual to the previous number");
            num1 = num2;
        }
    }
}
