package com.company;

public class Main {

    public static void main(String[] args) {
// CODE WITHOUT ENCAPSULATION
//        Player player = new Player();
//        player.name = "Scott";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        player.health = 200;
//
//        damage = 11;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());


// CODE WITH ENCAPSULATION
        EnhancedPlayer player = new EnhancedPlayer("Tim", 100, "Sword");
        System.out.println("Intitial health is " + player.getHealth());


        Printer printer = new Printer(40, 0, false);
        printer.fillToner(100);

        printer.printPage();
    }
}
