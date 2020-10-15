//：Write a program that calculates velocity using a constant distance and a constant time
/**
 * Exercise 4 of Chapter 3
 * @author Linloir
 * @author Jonathan Zhang
 * @version 1.0 2020-10-15
 */

import java.util.*;

public class Exercise4 {
    public static void main(String[] args) {
        Random rand = new Random();

        int d, t;
        d = rand.nextInt(100);
        t = rand.nextInt(100);

        float a = d;
        float b = t;
        float v = a / b;

        System.out.println("Distance is " + d + " meters");
        System.out.println("Time is "+ t + " seconds");
        System.out.println("Velocity is " + v + " m/s");
    }
}

/*
Comments:
    1. In line19,20, in order to avoid the loss of precision, two new variable are created to store the original 'int'
       type figures as 'float' type.
       Is there a better way to do division of two 'int' without losing precision?
Question:
    1. How can I get a random number that is always positive ?
 */
