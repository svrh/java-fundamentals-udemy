package com.sh;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Create a program using arrays that sorts a list of integers in descending order.
        // Descending order is highest value to lowest.
        // In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
        // ultimately have an array with 106,81,26, 15, 5 in it.
        // Set up the program so that the numbers to sort are read in from the keyboard.
        // Implement the following methods - getIntegers, printArray, and sortIntegers
        // getIntegers returns an array of entered integers from keyboard
        // printArray prints out the contents of the array
        // and sortIntegers should sort the array and return a new array containing the sorted numbers
        // you will have to figure out how to copy the array elements from the passed array into a new
        // array and sort them and return the new sorted array.

        int[] smallArray = getIntegers(5);
        long startTime2 = System.nanoTime();
        int[] sorted = sortIntegers(smallArray);
        long endTime2 = System.nanoTime();
        printArray(sorted);

//        long duration2 = (endTime2 - startTime2);
//        System.out.println(duration2);

//        int[] myArray = getIntegers(10000);
//        long startTime = System.nanoTime();
//        quickSortArray(myArray, 0, myArray.length - 1);
//        long endTime = System.nanoTime();
//        printArray(myArray);
//
//        long duration = (endTime - startTime);
//        System.out.println(duration);
    }

    private static int[] getIntegers(int number){
        int[] values = new int[number];
        System.out.println("Enter " + number + " integers.\r");
        for (int i = 0; i < number; i++) {

            values[i] = scanner.nextInt();
//            values[i] = randInt();
        }
        return values;
    }

    private static int randInt(){
        int randomNum = ThreadLocalRandom.current().nextInt(1, 10_000 + 1);
        return randomNum;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i +", typed value was: " + array[i]);
        }
    }

    private static int[] sortIntegers(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length-1; i++) {
                if (sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }


    private static void quickSortArray(int[] array, int left, int right) {
        int p = partition(array, left, right);
        if (left < p - 1)
            quickSortArray(array, left, p - 1);
        if (p < right)
            quickSortArray(array, p, right);
    }

    private static int partition(int[] array, int left, int right)
    {
        int l = left, r = right;
        int tmp;
        int pivot = array[(left + right) / 2];

        while (l <= r) {
            while (array[l] > pivot)
                l++;
            while (array[r] < pivot)
                r--;
            if (l <= r) {
                tmp = array[l];
                array[l] = array[r];
                array[r] = tmp;
                l++;
                r--;
            }
        }
        return l;
    }
}