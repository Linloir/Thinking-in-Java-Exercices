//:Write a program to fined out all 'vampire number' of 4 digits.

/**
 * Exercise 10 of Chapter 4
 * @author Linloir
 * @author Jonathan Zhang
 * @version 1.0 2020-10-24
 */

import java.util.*;

public class Exercise10 {
//    static void swap(int ipt1, int ipt2) {
//        int temp;
//        temp = ipt1;
//        ipt1 = ipt2;
//        ipt2 = temp;
//    }
    public static void main(String[] args) {
        int currentNumber = 1001;
        int[] digit = new int[4];

        outer:
        for (; currentNumber <= 9999; currentNumber++) {
            if (currentNumber % 100 == 0) {     //if currentNumber has pairs of trailing zeroes
                currentNumber++;
                continue outer;
            }

            digit[0] = currentNumber / 1000;
            digit[1] = (currentNumber - 1000 * digit[0]) / 100;
            digit[2] = (currentNumber - 1000 * digit[0] - 100 * digit[1]) / 10;
            digit[3] = currentNumber - 1000 * digit[0] - 100 * digit[1] - 10 * digit[2];

            inner:
            for (int step1 = 0; step1 < 3; step1++) {
                int temp;

                if ((10 * digit[0] + digit[1]) * (10 * digit[2] + digit[3]) == currentNumber) {
                    System.out.println("Vampire number get: " + currentNumber +
                            " ( " + digit[0] + digit[1] + " * " + digit[2] + digit[3] + " )");
                    break inner;
                }
                else {
                    temp = digit[2];
                    digit[2] = digit[3];
                    digit[3] = temp;
                    //swap(digit[2], digit[3]);
                }

                if ((10 * digit[0] + digit[1]) * (10 * digit[2] + digit[3]) == currentNumber) {
                    System.out.println("Vampire number get: " + currentNumber +
                            " ( " + digit[0] + digit[1] + " * " + digit[2] + digit[3] + " )");
                    break inner;
                }
                else {
                    temp = digit[1];
                    digit[1] = digit[2];
                    digit[2] = temp;
                    //swap(digit[1], digit[2]);
                }

                if ((10 * digit[0] + digit[1]) * (10 * digit[2] + digit[3]) == currentNumber) {
                    System.out.println("Vampire number get: " + currentNumber +
                            " ( " + digit[0] + digit[1] + " * " + digit[2] + digit[3] + " )");
                    break inner;
                }
                else {
                    temp = digit[2];
                    digit[2] = digit[3];
                    digit[3] = temp;
                    //swap(digit[2], digit[3]);
                }

                if ((10 * digit[0] + digit[1]) * (10 * digit[2] + digit[3]) == currentNumber) {
                    System.out.println("Vampire number get: " + currentNumber +
                            " ( " + digit[0] + digit[1] + " * " + digit[2] + digit[3] + " )");
                    break inner;
                }
                else {
                    temp = digit[0];
                    digit[0] = digit[1];
                    digit[1] = temp;
                    //swap(digit[0], digit[1]);
                }
            }
        }
    }
}

/*
Questions:
    1. How can i use a function outside 'main()' to swap two numbers?
 */
