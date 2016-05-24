package com.sh;

import com.sh.Accesible;

public class Main {

    public static void main(String[] args) {
//        Investigate the differences between public, private and protected field in the Account class.
//        In the following interface declaration, what is the visibility of:
//
//        1. the Accessible interface?
//        2. the int variable SOME_CONSTANT?
//        3. methodA;
//        4. methodB and methodC?

        Account demoAcount = new Account("Demo");
        demoAcount.deposit(1000);
        demoAcount.withdraw(500);
        demoAcount.withdraw(-200);
        demoAcount.deposit(-20);
        demoAcount.calculateBalance();

        System.out.println("Balance on account is " + demoAcount.getBalance());
    }

}
