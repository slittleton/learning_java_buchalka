package com.company;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println(newScore);
        calculateScore(200);
        calculateScore();

        calcFeetAndInchesToCentimeters(2, 3);
        calcFeetAndInchesToCentimeters(3);

        getDurationString(70, 45);
        getDurationString(121);
        getDurationString(-121);


    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 100;
    }

    public static int calculateScore(int score) {
        System.out.println("Player scored " + score + " points");
        return score * 100;
    }

    public static void calculateScore() {
        System.out.println("No Player points, No Player name");
    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        if (feet <= 0 || inches <= 0) {
            return -1;
        }
        inches = inches + (12 * feet);
        double cm = inches * 2.54;

        System.out.println(cm + " cm");
        return cm;
    }

    public static double calcFeetAndInchesToCentimeters(int inches) {
        if (inches <= 0) {
            return -1;
        }
        double cm = inches * 2.54;

        System.out.println(cm + " cm");
        return cm;
    }
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            System.out.println(INVALID_VALUE_MESSAGE);
            return INVALID_VALUE_MESSAGE;
        }
        int hours = (int) Math.floor(minutes / 60);
        minutes = minutes % 60;

        System.out.println(hours + "h " + minutes + "m " + seconds + "s");


        return (hours + "h " + minutes + "m " + seconds + "s");
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            System.out.println(INVALID_VALUE_MESSAGE);
            return INVALID_VALUE_MESSAGE;
        }
        int minutes = (int) Math.floor(seconds / 60);
        seconds = seconds % 60;

        return getDurationString(minutes, seconds);

    }

}
