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
        Car car = new Car("base car", 4);
        car.startEngine();
        car.accelerate();
        car.brake();

        Car tesla = new Tesla("Model S", 0);
        tesla.startEngine();
        tesla.accelerate();
        tesla.brake();

        Car nissan = new Nissan("GT-R", 6);
        nissan.startEngine();
        nissan.accelerate();
        nissan.brake();
    }
}
