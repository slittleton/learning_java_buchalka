package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    /*
     * nested inner class - can access any private instance variable of outer class,
     *                      cannot have static methods inside
     *
     * method local inner class - class declared within a block(method or if statement for example) within the outer class,
     *                            cannot use local variables of outer method until that local
     *                             variable is final. scope is restricted to the block
     * anonymous inner class - nested class without a class name. declared and instantiated at the same time.
     *                          used when a local class is required only once. commonly used to attach event handler to
     *                          a button in user interfaces
     *
     * static nested class - used to associate a class with its outer class - cannot access
     *                       non-static methods of outer class without creating an instance
     *
     * */
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {
        // Using inner class with outer class ===========================
//        Gearbox mcLaren = new Gearbox(6);
//        // must specify outer class first to access inner class
//        // must have an instance of outer class to create inner class instance
//        Gearbox.Gear first = mcLaren.new Gear(1, 12.3);
//        System.out.println(first.driveSpeed(1000));

//        Gearbox mcLaren = new Gearbox(6);
//        mcLaren.addGear(1, 5.3);
//        mcLaren.addGear(2, 10.6);
//        mcLaren.addGear(3, 15.9);
//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(1);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(1000));
//        mcLaren.changeGear(2);
//        System.out.println(mcLaren.wheelSpeed(3000));
//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(3);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(6000));

//        // Inner Local class ===========================
//        class ClickListener implements Button.OnClickListener {
//            public ClickListener() {
//                System.out.println("I've been attached");
//            }
//
//            @Override
//            public void onClick(String title) {
//                System.out.println(title + " was clicked");
//            }
//        }
//
//        btnPrint.setOnClickListener(new ClickListener());
//        listen();

        // Anonymous Inner Class ===========================
        System.out.println("enter 1 to simulate a click or 0 to exit");

        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked from anonymous class");
            }
        });

        listen();

    }



    private static void listen() {
        boolean quit = false;
        while (!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
                    break;
            }
        }
    }


}
