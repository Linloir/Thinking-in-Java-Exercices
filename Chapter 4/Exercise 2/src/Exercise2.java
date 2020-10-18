//:Write a program that generates 25 random int values. For each value, use an if-else statement to classify it as
// greater than, less than, or equal to a second randomly generated value.
/**
 * Exercise 2 of Chapter 4
 * @author Linloir
 * @author Jonathan Zhang
 * @version 1.0 2020-10-18
 */

import java.util.*;

public class Exercise2 {
    public static void main(String[] args) {
        Random rand = new Random(47);
        int num1 = rand.nextInt(100);
        System.out.println("Number 1\t: " + num1);
        int num2;
        for (int step = 1; step < 25; step++) {
            num2 = rand.nextInt(100);
            System.out.print("Number "+ (step+1) + "\t: " + num2 + " ");
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
