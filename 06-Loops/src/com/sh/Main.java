package com.sh;

public class Main {

    public static void main(String[] args) {

        // using the for statement, call the calculateInterest method with
        // the amount of 10000 with an interestRate of 2,3,4,5,6,7, and 8
        // and print the results to the console window.

        System.out.println("10,000 at 2% interest = " + calculateInterest(10000, 2.0));
        for (int i = 2; i < 9; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0, i)));
        }

        // How would you modify the for loop above to do the same thing as
        // shown but to start from 8% and work back to 2%

        for (int i = 8; i > 1; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0, i)));
        }

        int counter = 0;

        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                counter++;
                System.out.println(i + " is a prime number. Counter set to = " + counter);
                if (counter >= 10) {
                    System.out.println("Exiting the loop.");
                    break;
                }
            }
        }

        int number = 5;
        int finalNumber = 20;
        int primesFound = 0;
        while (number <= finalNumber) {
            if (!isPrime(number)) {
                number++;
                continue;
            }

            System.out.println("Prime number: " + number);
            number++;

            primesFound++;
            if (primesFound >= 5) {
                break;
            }
        }
        System.out.println("Total while primes: " + primesFound);
    }

    // Create a for statement using any range of numbers
    // Determine if the number is a prime number using the isPrime method
    // if it is a prime number, print it out AND increment a count of the
    // number of prime numbers found
    // if that count is 3 exit the for loop

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}