package com.harrison;

/**
 * Created by Sveto on 18-Mar-16.
 */
public class Hamburger {
    private String name;
    private String breadType;
    private String meat;
    private double price;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String breadType, String meat, double price) {
        this.name = name;
        this.breadType = breadType;
        this.meat = meat;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getBreadType() {
        return breadType;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public void addition1(String additionName, double additionPrice) {
        this.addition1Name = additionName;
        this.addition1Price = additionPrice;
    }

    public void addition2(String additionName, double additionPrice) {
        this.addition2Name = additionName;
        this.addition2Price = additionPrice;
    }

    public void addition3(String additionName, double additionPrice) {
        this.addition3Name = additionName;
        this.addition3Price = additionPrice;
    }

    public void addition4(String additionName, double additionPrice) {
        this.addition4Name = additionName;
        this.addition4Price = additionPrice;
    }

    public double makeHamburger() {
        double totalPrice = this.price;
        System.out.println(this.name + " with " + this.breadType + " bread and " + this.meat + " meat. Price: " + this.price);
        if (addition1Name != null) {
            System.out.println(this.addition1Name + " added for extra price of " + this.addition1Price);
            totalPrice += addition1Price;
        }
        if (addition2Name != null) {
            System.out.println(this.addition2Name + " added for extra price of " + this.addition2Price);
            totalPrice += addition2Price;
        }
        if (addition3Name != null) {
            System.out.println(this.addition3Name + " added for extra price of " + this.addition3Price);
            totalPrice += addition3Price;
        }
        if (addition4Name != null) {
            System.out.println(this.addition4Name + " added for extra price of " + this.addition4Price);
            totalPrice += addition4Price;
        }
        return totalPrice;

    }
}
