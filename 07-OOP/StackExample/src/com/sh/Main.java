package com.sh;

public class Main {

    public static void main(String[] args) {
        Stack stack1 = new Stack(10);

        char name[] = {'S', 'v', 'e', 't', 'o'};
        Stack stack2 = new Stack(name);

        char ch;
        int i;

        for (i = 0; i < 10; i++) {
            stack1.push((char)('A'+i));
        }

        Stack stack3 = new Stack(stack1);

        System.out.print("Contents of stack 1: ");
        for (i = 0; i < 10; i++) {
            ch = stack1.pop();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Contents of stack 2: ");
        for (i = 0; i< 5; i++) {
            ch = stack2.pop();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Contents of stack 3: ");
        for (i = 0; i < 10; i++) {
            ch = stack3.pop();
            System.out.print(ch);
        }
    }
}
