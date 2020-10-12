//:Exercise 2.1
/**Exercise 1 of Chapter 2
 * @author Linloir
 * @author Jonathan Zhang
 * @version 1.0
 * @since 2020-10-12
 */
/**
 * Create a class consisting an int and a char
 * print their value without initialize them
 */
/*
package com.Linloir.demo;
import java.util.*;

public class Exercise1 {
    public static void main(String[] args){
        int a;
        char b;
        System.out.println(a);
        System.out.println(b);
    }
}

*/

//version comment: in ItelliJ the program can't be built due to not initialization.

//Guide version
package com.Linloir.demo;
import java.util.*;

public class Exercise1{
    int i;
    char c;
    public Exercise1() {
        System.out.println("i = " + i);
        System.out.println("c = [" + c + ']');
    }
    public static void main(String[] args){
        new Exercise1();
    }
}

/*
Question:
    1. Why is it possible to build the solution when println is put in a function named the same as the file name?
    2. Why do i need to add a returnType if i rename the function in class Exercise 1?
    3. When i do 'new Exercise1()', do i build a new instance or do i just run the function once?
    4. In Q3, if i do build a new instance then what's it's name?
 */