//:Repeat Exercise 10 from the previous chapter, using the ternary operator and a bitwise test to display the ones and
// zeroes, instead of Integer.toBinaryString( ).
/**
 * Exercise 5 of Chapter 4
 * @author Linloir
 * @author Jonathan Zhang
 * @version 2.0 2020-10-18
 */

import java.util.*;

//version 1.0
/*
public class Exercise5 {
    static void methodAnd (int integer1, int integer2) {
        for (int bit = 1; bit <= 32; bit++) {
            int compareBit1 = (integer1 << (bit - 1)) >>> 31;
//          System.out.println("CompareBit 1: " + Integer.toBinaryString(compareBit1));
            int compareBit2 = (integer2 << (bit - 1)) >>> 31;
//          System.out.println("CompareBit 2: " + Integer.toBinaryString(compareBit2));
            if (compareBit1 == compareBit2)
                System.out.print(compareBit1 == 1 ? "1" : "0");
            else
                System.out.print("0");
        }
    }
    public static void main(String[] args) {
        int integer1 = 0x2AA;
        int integer2 = 0x123;

        Exercise5.methodAnd(integer1, integer2);
    }
}
*/

//version 2.0
public class Exercise5 {
    static int compareBits(int bit1, int bit2) {
        return bit1 == bit2 ? (bit1 == 0 ? 2 : 1) : 3;
    }
    static int getBit(int integer, int bit) {
        int aBit = (integer << (bit - 1)) >>> 31;
        return aBit;
    }
    static void methodAnd (int integer1, int integer2) {
        int bit = 1;
        while (compareBits(getBit(integer1, bit),getBit(integer2, bit)) != 1)
            bit++;
        for (; bit <= 32; bit++) {
            System.out.print(compareBits(getBit(integer1, bit),getBit(integer2, bit)) == 1 ? "1" : "0");
        }
    }
    public static void main(String[] args) {
        int integer1 = 0x2AA;
        int integer2 = 0x123;

        Exercise5.methodAnd(integer1, integer2);
    }
}