package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//
//        int counter = 0;
//        int sum = 0;
//
//        while (true) {
//            int order = counter + 1;
//
//            System.out.println("Enter number # " + order + ": ");
//
//            boolean isAnInt = scanner.hasNextInt();
//            if (isAnInt) {
//                int number = scanner.nextInt();
//                counter++;
//                sum += number;
//                if (counter == 10) {
//                    break;
//                }
//            } else {
//                System.out.println("Invalid number");
//            }
//
//            scanner.nextLine();// handle end of line (enter key)
//
//        }
//
//        System.out.println("sum = " + sum);
//
//        scanner.close();

        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (true) {
            System.out.println("Enter a number: ");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                sum += scanner.nextInt();
                count++;
                System.out.println("Sum is: " + sum + " Average is: " + ((double) sum / count));
                scanner.nextLine();
            } else {
                break;
            }
        }
        System.out.println("Sum is: " + sum + " Average is: " + ((double) sum / count));
        scanner.close();
    }
}
