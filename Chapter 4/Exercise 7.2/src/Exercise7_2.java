//:The second mission of Exercise 7

/**
 * Exerccise 7 of Chapter 4
 * @author Linloir
 * @author Jonathan Zhang
 * @version 2020-10-20
 */

import java.util.*;

public class Exercise7_2 {
    static int loop() {
        for(int i = 1;; i++){
            if(i > 99) return 0;
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        loop();
    }
}

/*
Question:
    1. Can I use a return in main function ?
 */
