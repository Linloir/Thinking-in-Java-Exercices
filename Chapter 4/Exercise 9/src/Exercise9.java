//:Create a method that takes an integer as an argument
// and displays that many Fibonacci numbers starting from the beginning

/**
 * Exercise 9 of Chapter 4
 * @author Linloir
 * @author Jonathan Zhang
 * @version 1.0 2020-10-22
 */

public class Exercise9 {
    public static void main(String[] args) {
        int numberCount = Integer.parseInt(args[0]);
        int fab1 = 1, fab2 = 1;
        switch (numberCount) {
            case 1: System.out.println(fab1);
                    break;
            default: System.out.print(fab1 + " ");
                    System.out.print(fab2 + " ");
        }
        for (int currentNumber = 1; currentNumber <= numberCount; currentNumber++) {
            switch (numberCount % 2) {
                case 1: fab1 = fab1 + fab2;
                        System.out.print(fab1 + " ");
                case 2: fab2 = fab1 + fab2;
                        System.out.print(fab2 + " ");
            }
        }
    }
}
