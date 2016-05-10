package com.sh;

/**
 * Created by Sveto on 16-Mar-16.
 */
public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public Account() {
        this("XXXXXXXXX", 0.00, "Default name", "Default email", "Default phone");
        System.out.println("Default constructor.");
    }

    public Account(String number, double balance, String customerName, String customerEmail, String customerPhone) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
        System.out.println("AC with parameters:");
    }

    public Account(String customerName, String custumerEmail, String customerPhone) {
        this("XXXXXXXXX", 0.00, customerName, custumerEmail, customerPhone);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustumerEmail() {
        return customerEmail;
    }

    public void setCustumerEmail(String custumerEmail) {
        this.customerEmail = custumerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("OK. Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }

    public void withdraw(double withdrawAmount) {
        if (this.balance - withdrawAmount < 0) {
            System.out.println("Operation not possible.");
        } else {
            this.balance -= withdrawAmount;
            System.out.println("OK. Remaining balance is " + this.balance);
        }
    }
}
