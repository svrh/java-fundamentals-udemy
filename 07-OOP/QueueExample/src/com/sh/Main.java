package com.sh;

public class Main {

    public static void main(String[] args) {
        Queue bigQueue = new Queue(100);
        Queue smallQueue = new Queue(4);

        char ch;

        System.out.println("Storing the alphabet in bigQueue.");
        for (int i = 0; i < 26; i++) {
            bigQueue.put((char)('A'+i));
        }
        System.out.print("Contents of bigQueue: ");
        for (int i = 0; i < 26; i++) {
            ch = bigQueue.get();
            if (ch != (char) 0) System.out.print(ch);
        }

        System.out.println("\n");

        System.out.println("Using smallQueue to generate errors.");
        for(int i=0; i < 5; i++) {
            System.out.print("Attempting to store " +
                    (char) ('Z' - i));
            smallQueue.put((char) ('Z' - i));
            System.out.println();
        }
        System.out.println();

        System.out.print("Contents of smallQ: ");
        for(int i=0; i < 5; i++) {
            ch = smallQueue.get();
            if(ch != (char) 0) System.out.print(ch);
        }
    }
}
