package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth: ");

        boolean hasNextInt = scanner.hasNextInt(); // checks to see if next input is an integer

        if(hasNextInt){
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // to keep the program from skipping the next input(handle next line character - enter key)

            int age = 2019 - yearOfBirth;

            System.out.println("Enter Your name: ");
            String name = scanner.nextLine();

            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + ", and you are " + age + " years old");
            } else {
                System.out.println("Invalid year of birth");
            }
        } else{
            System.out.println("Unable to parse year of birth.");
        }



        scanner.close();

    }


}
