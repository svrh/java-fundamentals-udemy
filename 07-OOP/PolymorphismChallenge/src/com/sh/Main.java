package com.sh;

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void startEngine() {
        System.out.println("Car -> startEngine()");
    }

    public void accelerate() {
        System.out.println("Car -> accelerate()");
    }

    public void brake() {
        System.out.println("Car -> brake()");
    }
}

class Tesla extends Car {
    public Tesla(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Tesla -> startEngine()");
    }

    @Override
    public void accelerate() {
        System.out.println("Tesla -> accelerate()");
    }

    @Override
    public void brake() {
        System.out.println("Tesla -> brake()");
    }
}

class Porsche extends Car {
    public Porsche(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Porsche -> startEngine()");
    }

    @Override
    public void accelerate() {
        System.out.println("Porsche -> accelerate()");
    }

    @Override
    public void brake() {
        System.out.println("Porsche -> brake()");
    }
}

class Nissan extends Car {
    public Nissan(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + " -> startEngine()");
    }

    @Override
    public void accelerate() {
        System.out.println(getClass().getSimpleName() + " -> accelerate()");
    }

    @Override
    public void brake() {
        System.out.println(getClass().getSimpleName() + " -> brake()");
    }
}

public class Main {

    public static void main(String[] args) {
        // We are going to go back to the car analogy.
        // Create a base class called Car
        // It should have a few fields that would be appropriate for a generic car class.
        // engine, cylinders, wheels, etc.
        // Constructor should initialize cylinders (number of) and name, and set wheels to 4
        // and engine to true. Cylinders and names would be passed parameters.
        //
        // Create appropriate getters
        //
        // Create some methods like startEngine, accelerate, and brake
        //
        // show a message for each in the base class
        // Now create 3 sub classes for your favorite vehicles.
        // Override the appropriate methods to demonstrate polymorphism in use.
        // Put all classes in the one java file (this one).

        for (int i = 1; i < 6; i++) {
            Car car = randomCar();
            System.out.println("Car #" + i + ": " + car.getName() + "\n"
                                + "Cylinders: " + car.getCylinders() + "\n");
            car.startEngine();
            car.accelerate();
            car.brake();
            System.out.println("\n");
        }

        }

    public static Car randomCar() {
        int randomNumber = (int) (Math.random() * 3 + 1);
        switch (randomNumber) {
            case 1:
                return new Tesla("Model S", 0);
            case 2:
                return new Porsche("911 Turbo S", 6);
            case 3:
                return new Nissan("GT-R", 6);
        }
        return null;
    }
}
