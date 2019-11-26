package com.company;

public class Main {

    public static void main(String[] args) {
        int value = 1;
        if (value == 1) System.out.println("Value was 1");

        int switchValue = 3;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("value was 3 or 4 or 5");
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        char charValue = 'A';

        switch (charValue) {
            case 'A':
                System.out.println("Value was A");
                break;
            case 'B':
                System.out.println("Value was B");
                break;
            case 'C':
            case 'D':
            case 'E':
                System.out.println("value was C or D or E");
                break;
            default:
                System.out.println("Was not found");
                break;
        }


    }

    public static void printNumberInWord(int number) {

        switch (number) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
        }
    }


}
