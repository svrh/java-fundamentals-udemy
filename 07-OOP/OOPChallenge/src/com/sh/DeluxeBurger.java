package com.sh;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe Hamburger", "white", "beef & bacon", 8.50);
        super.addition1("Chips", 1.50);
        super.addition2("Drinks",2.34);
    }

    @Override
    public void addition1(String additionName, double additionPrice) {
        System.out.println("Item not available.");
    }

    @Override
    public void addition2(String additionName, double additionPrice) {
        System.out.println("Item not available.");
    }

    @Override
    public void addition3(String additionName, double additionPrice) {
        System.out.println("Item not available.");
    }

    @Override
    public void addition4(String additionName, double additionPrice) {
        System.out.println("Item not available.");
    }
}
