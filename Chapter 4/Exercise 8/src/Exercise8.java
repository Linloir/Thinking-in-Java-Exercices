//:Create a switch statement that prints a message for each case, and put the switch inside a for loop that tries each
// case. Put a break after each case and test it, then remove the breaks and see what happens.
/**
 * Exercise 8 of Chapter 4
 * @author Linloir
 * @author Jonathan Zhang
 * @version 1.0 2020-10-22
 */

public class Exercise8 {
    public static void main(String[] args) {
        for(int i = 0; i < 4; i++) {
            switch(i){
                case 0: System.out.println("case: 0");
                        //break;
                case 1: System.out.println("case: 1");
                        //break;
                case 2: System.out.println("case: 2");
                        //break;
                case 3: System.out.println("case: 3");
                        //break;
                default:System.out.println("default");
            }
        }
    }
}
