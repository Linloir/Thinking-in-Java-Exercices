//:Print 3 parameters from command line window
/**
 * Exercise 10 of Chapter 2
 * @author Linloir
 * @author Jonathan Zhang
 * @version 1.0 2020-10-15
 */

package com.Linloir.demo;   //Delete this line to use
import java.util.*;

public class Exercise10 {
    public static void main(String[] args){
        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.println(args[3]);
    }
}/*Input:
java Exercise10 1 2 3
Output:
1
2
3
*/

/*
Comment:
    1. Solution for problem "找不到或无法加载主类" can be deleting line 9 (package claiming) and run cmd in the directory
       where the file *.java is in
    2. Steps to build:
        i. cd /d *:\*\*
        ii. javac Exercise10.java
        iii. java Exercise10 <first string> <second string> <third string>
Question:
    1. What should i do if i w
 */
