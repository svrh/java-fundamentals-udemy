package com.sh;

public class Main {

    public static void main(String[] args) {
        //int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;

        // byte has a width of 8
        byte byteMinValue = -128;
        byte byteMaxValue = 127;
        byte newByteValue = (byte) (byteMinValue/2);
        System.out.println("NBW: " + newByteValue);

        // short has a width of 16
        short shortValue = 32767;

        // long has a width of 64
        long longValue = 9_223_372_036_854_775_807L;

        // 1. Create a byte variable and set it to any valid byte number.
        // 2. Create a short variable and set it to any valid short number.
        // 3. Create a int variable and set it to any valid in number.
        // 4. Create a variable of type long, and make it equal to
        //    50000 + 10 times the sum of the byte, plus the short plus the int

        byte byteVar = 127;
        short shortVar = 32000;
        int intVar = 1000000;
        long longVar = 50000L + 10L * (byteVar + shortVar + intVar);
        System.out.println("longVar: " + longVar);

    }
}
