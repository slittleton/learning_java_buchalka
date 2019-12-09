package com.company;

public class Dog  extends Animal{
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("Dog.chew() called");
    }
    @Override
    public void eat(){
        System.out.println("Dog.eat() called");
        chew();
        super.eat();// called from parent class
        // prevents infinite loop because just calling eat would have this method
        // call itself from inside this class
    }
    public void walk(){
        System.out.println("Dog.walk() called");
        move(5);// called from parent class and since it does not exist in
        // the Dog class it is not overridden by Dog version of method
    }
    public void run(){
        System.out.println("Dog.run() called");
        move(10);
    }
    public void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called with speed of " + speed);
    }
    @Override
    public void move(int speed){ // to override the method must have same number of params
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
        Hi.hello();
    }
}

class Hi {
    public static void hello(){
        System.out.println("Hello");
    }
}