package com.company;

public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {

            int years = (int) Math.floor(minutes / 60 / 24 / 365);
            int days = (int) Math.floor((minutes / 60 / 24) % 365);
            int leftOverMinutes = (int) Math.floor(minutes % 60);

            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }


    }
}
