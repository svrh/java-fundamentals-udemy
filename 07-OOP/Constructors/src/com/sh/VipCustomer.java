package com.sh;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer() {
        this("VIP Custumer", 100_000.00, "default@mail.com");
//        System.out.println("OK.");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "default@mai.com");
//        System.out.println("OK.");
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
//        System.out.println("VIP Customer: " + name + " with credit limit " + creditLimit + " and email " + email + " created.");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
