package com.sh;

public class Main {

    public static void main(String[] args) {
        // width of int = 32 (4 bytes)
        int firstValue = 5 / 3;
        // width of float = 32 (4 bytes)
        float floatValue = 5f / 3f;
        // width of double = 64 (8 bytes)
        double doubleValue = 5d / 3d;

        System.out.println("int is: " + firstValue);
        System.out.println("float is: " + floatValue);
        System.out.println("double is: " + doubleValue);

        // Convert a given number of pounds to kilograms
        // 1. Create a variable to store the number of pounds
        // 2. Calculate the number of Kilograms for the number above and store in a variable.
        // 3. Print out the result.
        //
        // NOTES: 1 pound is equal to 0.45359237 kilograms.

        double numPounds = 150d;
        double convertedKilos = numPounds * 0.45359237d;
        System.out.println("Kilograms = " + convertedKilos);
    }
}