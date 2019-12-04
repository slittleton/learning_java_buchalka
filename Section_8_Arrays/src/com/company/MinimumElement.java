package com.company;

import java.util.Scanner;

public class MinimumElement {
    private static Scanner scanner = new Scanner(System.in);

    public static int[] readIntegers(int number) {
        System.out.println("Pleast Enter " + number + " integers");
        int[] myList = new int[number];
        for (int i = 0; i < myList.length; i++) {
            myList[i] = scanner.nextInt();
        }
        return myList;
    }

    public static int findMin(int[] array) {
        int currentMin = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < currentMin) {
                currentMin = array[i];
            }
        }
        return currentMin;
    }
}
