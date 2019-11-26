package com.company;

public class Main {

    public static void main(String[] args) {

        String numberAsString = "2018";
        System.out.println("NumberAsString = " + numberAsString + 5555);

        // Parse Int
        int number = Integer.parseInt(numberAsString);
        System.out.println(number + number);

        // Parse Double
        String numberAsString2 = "2018.125";
        double numberD = Double.parseDouble(numberAsString2);
        System.out.println(numberD + numberD);
    }



}
