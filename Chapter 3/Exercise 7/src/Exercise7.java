//:Write a program that simulates coin-flipping
/**
 * Exercise 7 of Chapter 3
 * @author Linloir
 * @author Jonathan Zhang
 * @version 1.0 2020-10-16
 */

import java.util.*;

public class Exercise7 {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(100);
        int b = rand.nextInt(100);

        System.out.println("It's " + ((a <= 50 && b <= 50) || (a > 50 && b > 50)) + " that the coin face upwards.");
//      System.out.println((a <= 50 && b > 50) || (a > 50 && b <= 50));
    }
}/*Output:(%50 match)
It's true that the coin face upwards.
*/

/*
Question:
    1. How to make the incidence more close to 50% ?
 */
