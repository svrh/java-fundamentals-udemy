package com.sh;

public class Main {

    public static void main(String[] args) {

        // Create a new class for a bank account
        // Create fields for the account number, balance, customer name, email and phone number.
        //
        // Create getters and setters for each field
        // Create two additional methods
        // 1. To allow the customer to deposit funds (this should increment the balance field).
        // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
        // but not allow the withdrawal to complete if their are insufficient funds.
        // You will want to create various code in the Main class (the one created by IntelliJ) to
        // confirm your code is working.
        // Add some System.out.println's in the two methods above as well.

        Account defaultAccount = new Account();
        Account timsAccount = new Account("12345", 0.00, "Tim Westwood", "tim@westwood.com", "(041) 123 456 789");

        System.out.println(timsAccount.getNumber());
        System.out.println(timsAccount.getBalance());

        timsAccount.withdraw(100.0);
        timsAccount.deposit(50);
        timsAccount.withdraw(100);
        timsAccount.deposit(50);
        timsAccount.withdraw(100);

        Account bobsAccount = new Account("Bob", "bob@mail.com", "12345");
        System.out.println(bobsAccount.getNumber() + " owner: " + bobsAccount.getCustomerName());

        // Create a new class VipCustomer
        // it should have 3 fields name, credit limit, and email address.
        // create 3 constructors
        // 1st constructor empty should call the constructor with 3 parameters with default values
        // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
        // 3rd constructor should save all fields.
        // create getters only for this using code generation of intellij as setters wont be needed
        // test and confirm it works.

        VipCustomer vip1 = new VipCustomer();
        System.out.println(vip1.getName());

        VipCustomer vip2 = new VipCustomer("Bon Iver", 150_000.00);
        System.out.println(vip2.getName());

        VipCustomer vip3 = new VipCustomer("Sean Carter", 500_000.00, "jayz@tidal.com");
        System.out.println(vip3.getName());
    }
}
