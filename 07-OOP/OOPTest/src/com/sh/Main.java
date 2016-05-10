package com.sh;

public class Main {

    public static void main(String[] args) {
	    Hamburger hamburger = new Hamburger("Chicken Hamburger", "corn", "chicken", 3.00);
        hamburger.addition1("Cheese", 0.20);
        hamburger.addition2("Salad", 0.10);
        hamburger.addition3("Tomato", 0.10);
        hamburger.addition4("Cucumber", 0.10);
        System.out.println(String.format("Total price: %.2f",hamburger.makeHamburger()));

        HealthyBurger healthy = new HealthyBurger("Vegan", 3.69);
        healthy.addition1("Salad", 0.10);
        healthy.addition5("Sunflower seeds", 0.20);
        System.out.println("Total price: " + healthy.makeHamburger());

        DeluxeBurger deluxe = new DeluxeBurger();
        System.out.println("Total price: " + deluxe.makeHamburger());
    }
}
