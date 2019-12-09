package com.company;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }
    public String startEngine(){
        return "Car -> startEngine";
    }
    public String accelerate(){
        return "Car -> accelerate";
    }
    public String brake() {
        return "Car -> brake";
    }
}
class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine(){
        return "Ford -> startEngine";
    }
    @Override
    public String accelerate(){
        return "Ford -> accelerate";
    }
    @Override
    public String brake() {
        return "Ford -> brake";
    }
}
class Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine(){
        return "Holden -> startEngine";
    }
    @Override
    public String accelerate(){
        return "Holden -> accelerate";
    }
    @Override
    public String brake() {
        return "Holden -> brake";
    }
}

