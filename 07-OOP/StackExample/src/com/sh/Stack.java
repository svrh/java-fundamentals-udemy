package com.sh;

public class Stack {
    private char[] st;
    private int top;

    Stack(int size) {
        st = new char[size];
        top = 0;
    }

    Stack(Stack ob) {
        top = ob.top;
        st = new char[ob.st.length];

        for (int i = 0; i < top; i++) {
            st[i] = ob.st[i];
        }
    }

    Stack(char a[]) {
        st = new char[a.length];
        for (int i = 0; i < a.length; i++) {
            push(a[i]);
        }
    }

    void push(char ch) {
        if (top == st.length) {
            System.out.println(" - Stack is full.");
            return;
        }
        st[top] = ch;
        top++;
    }

    char pop() {
        if (top == 0) {
            System.out.println(" - Stack is empty.");
            return (char) 0;
        }
        top--;
        return st[top];
    }
}
