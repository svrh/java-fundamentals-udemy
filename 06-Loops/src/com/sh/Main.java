package com.sh;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000, 2.0));
        for (int i = 2; i < 9; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0, i)));
        }

        for (int i = 8; i > 1; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0, i)));
        }

        int counter = 0;

        for (int i = 5; i < 20; i++) {
            if (isPrime(i)) {
                counter++;
                System.out.println(i + " is a prime number. Counter set to = " + counter);
                if (counter >= 3) {
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