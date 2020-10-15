//:Code a program demonstrating auto packaging function works for all primitive type and wrapper type
/**
 * Exercise 9 of Chapter 2
 * @author Linloir
 * @author Jonathan Zhang
 * @version 1.0 2020-10-13
 */

package com.Linloir.demo;
import java.util.*;

public class Exercise9 {
    public static void main(String[] args) {
        Character ch = 'x';
        System.out.println(ch);
    }
}/*Output:
x
*/

//Guide version
/*
package com.Linloir.demo;
import java.util.*;

public class Exercise9 {
    public static void main(String[] args) {
    Byte by = 1;
    byte bt = by;
    System.out.println("byte = " + bt);
    Short sh = 1;
    short s = sh;
    System.out.println("short = " + s);
    Integer in = 1;
    int i = in;
    System.out.println("int = " + i);
    Long lo = 1L;
    long l = lo;
    System.out.println("long = " + l);
    Boolean bo = true;
    boolean b = bo;
    System.out.println("boolean = " + b);
    Character ch = 'x';
    char c = ch;
    System.out.println("char = " + c);
    Float fl = 1.0f;
    float f = fl;
    System.out.println("float = " + f);
    Double db = 1.0d;
    double d = db;
    System.out.println("double = " + d);
    }
} /* Output:
byte = 1
short = 1
int = 1
long = 1
boolean = true
char = x
float = 1.0
double = 1.0
*///:~
