package com.sh;

public class Main {

    public static void main(String[] args) {
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

        VipCustomer vip1 = new VipCustomer();
        System.out.println(vip1.getName());

        VipCustomer vip2 = new VipCustomer("Bon Iver", 150_000.00);
        System.out.println(vip2.getName());

        VipCustomer vip3 = new VipCustomer("Sean Carter", 500_000.00, "jayz@tidal.com");
        System.out.println(vip3.getName());
    }
}
