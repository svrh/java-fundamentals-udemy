package com.harrison;

/**
 * Created by Sveto on 18-Mar-16.
 */
public class HealthyBurger extends Hamburger {

    private String addition5Name;
    private double addition5Price;

    private String addition6Name;
    private double addition6Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy Burger", "spelt", meat, price);
    }

    public void addition5(String name, double price) {
        this.addition5Name = name;
        this.addition5Price = price;
    }

    public void addition6(String name, double price) {
        this.addition6Name = name;
        this.addition6Price = price;
    }

    @Override
    public double makeHamburger() {
        double totalPrice = super.makeHamburger();
        if (addition5Name != null) {
            System.out.println(this.addition5Name + " added for extra price of " + this.addition5Price);
            totalPrice += addition5Price;
        }
        if (addition6Name != null) {
            System.out.println(this.addition6Name + " added for extra price of " + this.addition6Price);
            totalPrice += addition6Price;
        }
        return totalPrice;
    }
}
