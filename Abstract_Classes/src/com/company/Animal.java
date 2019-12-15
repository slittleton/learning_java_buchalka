package com.company;
/*
 * abstract class   - used to set up a class that will be inherited by other classes.
 *                  - it will not be instantiated itself.
 *                  - used to provide common methods that can be declared with or without implementation
 *                  -  We can run abstract class in java like any other class if it has main() method.
 *                  - Can also be used to implement interfaces.
 *                  - Can declare fields that are not static and final and define public, protected and private
 *                    concrete methods
 *                  - can extend only one parent class but it can implement multiple interfaces
 *                  - when an abstract class is subclassed, the subclass usually provides implementation for all
 *                    of the abstract methods in its parent class. if it doesn't then  the subclass must also be
 *                    declared abstract
 *                  - Uses - sharing code among several closely related classes. Or if you expect classes to have many
 *                          common methods or fields or required access modifiers other than
 *                          public(ex-protect, private). Or if you want to declare non static or
 *                          non final fields(ex name, age), this enables you to define methods taht can access and
 *                          modify the state of an object (getName, setName). Or when you have a requirement for your
 *                          base class to provide a default implementation of certain methods but other methods should
 *                          be open to being overridden by child classes.
 *
 *
 * interface        - the declaration of methods of a Class
 *                  - define the kind of operation an object can perform. these operations are defined by the classes
 *                      that implement the interface.
 *                  - cannot be instantiated
 *                  - can extend another interface
 *                  - as of Java 8, interfaces can contain default methods(implemented methods).
 *                  - as of Java 9, interfaces can contain private methods - used when default methods share common
 *                      code in the interface.
 *                  - Uses - you expect unrelated classes will implement your interface. Or if you want to specify
 *                           the behavior of a particular data type, but you are not concerned about who implements its
 *                           behavior. Or if you want to seperate different behavior.
 *                  - Example - The Collections API - List interface for example is used for ArrayList and LinkedList
 *
 * */
public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();
    public abstract void breathe();

    public String getName() {
        return name;
    }
}
