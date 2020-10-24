//:Create a class containing a String field initialized at the beginning and another one that initialized by constructor

/**
 * Exercise 2 of Chapter 5
 * @author Linloir
 * @author Jonathan Zhang
 * @version 1.0 2020-10-24
 */

import java.util.*;

public class Exercise2 {
    public static void main(String[] args) {
        StringInitializedAtTheBeginning stringA = new StringInitializedAtTheBeginning();
        StringInitializedByConstructor stringB = new StringInitializedByConstructor();
        System.out.println(stringA.aStringA);
        System.out.println(stringB.aStringB);
    }
}

class StringInitializedAtTheBeginning {
    String aStringA = "String A";
}

class StringInitializedByConstructor {
    StringInitializedByConstructor() {
        aStringB = "String B";
    }
    String aStringB;
}

/*
Comments:
    1. So what is the difference between the two ways of initialization ?n
 */
