package com.sh;

public class Main {

    static void vaTest(int ... v) {
        System.out.println("Number of args: " + v.length);
        System.out.println("Contents: ");
        for (int i = 0; i < v.length; i++) {
            System.out.println(i + " arg: " + v[i]);
        }
        System.out.println();
    }

    static void vaTest(String msg, int ... v){
        System.out.println("msg: " + msg + ", number of args: " + v.length);
        System.out.println("Contents: ");
        for (int i = 0; i < v.length; i++) {
            System.out.println(i + " arg: " + v[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(10);
        vaTest(9,8,7);
        vaTest("String plus numbers", 1, 2, 3);
        vaTest();

    }
}
