//:Write a program that uses two nested for loops and the modulus operator (%) to detect and print prime numbers
/**
 * Exercise 4 of Chapter 4
 * @author Linloir
 * @author Jonathan Zhang
 * @version 1.0 2020-10-18
 */

public class Exercise4 {
    public static void main(String[] args) {
        int max = 100;
        for (int step = 1; step <= max; step++) {
            boolean isPrimeNumber = true;
            for (int step2 = 2; (step2 < step) && (isPrimeNumber == true); step2++) {
                if (step % step2 == 0)
                    isPrimeNumber = false;
            }
            if (isPrimeNumber)
                System.out.println("Number " + step + " \tis a prime number");
        }
    }
}/*Output:
Number 1 	is a prime number
Number 2 	is a prime number
Number 3 	is a prime number
Number 5 	is a prime number
Number 7 	is a prime number
Number 11 	is a prime number
Number 13 	is a prime number
Number 17 	is a prime number
Number 19 	is a prime number
Number 23 	is a prime number
Number 29 	is a prime number
Number 31 	is a prime number
Number 37 	is a prime number
Number 41 	is a prime number
Number 43 	is a prime number
Number 47 	is a prime number
Number 53 	is a prime number
Number 59 	is a prime number
Number 61 	is a prime number
Number 67 	is a prime number
Number 71 	is a prime number
Number 73 	is a prime number
Number 79 	is a prime number
Number 83 	is a prime number
Number 89 	is a prime number
Number 97 	is a prime number
*/
