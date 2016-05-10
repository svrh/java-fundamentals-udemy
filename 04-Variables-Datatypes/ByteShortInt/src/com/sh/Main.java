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

    }
}
