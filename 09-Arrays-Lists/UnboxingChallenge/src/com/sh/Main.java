package com.sh;

public class Main {

    public static void main(String[] args) {
        // You job is to create a simple banking application.
        // There should be a Bank class
        // It should have an arraylist of Branches
        // Each Branch should have an arraylist of Customers
        // The Customer class should have an arraylist of Doubles (transactions)
        // Customer:
        // Name, and the ArrayList of doubles.
        // Branch:
        // Need to be able to add a new customer and initial transaction amount.
        // Also needs to add additional transactions for that customer/branch
        // Bank:
        // Add a new branch
        // Add a customer to that branch with initial transaction
        // Add a transaction for an existing customer for that branch
        // Show a list of customers for a particular branch and optionally a list
        // of their transactions
        // Demonstration autoboxing and unboxing in your code
        // Hint: Transactions
        // Add data validation.
        // e.g. check if exists, or does not exist, etc.
        // Think about where you are adding the code to perform certain actions

        Bank bank = new Bank();
        bank.addBranch("Berlin");
        bank.addCustomer("Berlin", "Hans Zimmer", 100.00);
        bank.addCustomer("Berlin", "Tomas Mayer", 150.00);
        bank.addCustomer("Berlin", "Mona Sadi", 100.00);


        bank.addTransaction("Berlin", "Hans Zimmer", 150.00);
        bank.addTransaction("Berlin", "Tomas Mayer", -100.00);


        bank.addBranch("Frankfurt Am Main");
        bank.addCustomer("Frankfurt Am Main", "Hans Mustermann", 200.00);

        bank.printCustomers("Berlin", true);
        bank.printCustomers("Frankfurt Am Main", true);

        System.out.println("Error checks:");

        bank.addCustomer("Frankfurt Am Main", "Hans Mustermann", 100.00);
        bank.addTransaction("Frankfurt Am Main", "Tomas Mayer", -100.00);
        bank.addBranch("Frankfurt Am Main");
        bank.addCustomer("Hamburg", "Hans Mustermann", 200.00);
    }
}