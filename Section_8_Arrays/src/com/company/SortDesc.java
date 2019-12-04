package com.company;

import java.util.Arrays;
import java.util.Scanner;


public class SortDesc {

    private static Scanner scanner = new Scanner(System.in);

    public static int[] getIntegers(int number) {
        System.out.println("Pleast Enter " + number + " integers");
        int[] myList = new int[number];
        for (int i = 0; i < myList.length; i++) {
            int nums = i+1;
            System.out.println("Enter Integer " + nums + ": ");
            myList[i] = scanner.nextInt();
        }
        return myList;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int nums = i+1;
            System.out.println("Item " + nums + " is " + arr[i]);
        }
    }

    public static int[] sortIntegers(int[] arr) {

        // Aleternate method of sorting arrays with inbuilt method(shorter)
        int[] sortedArray2 = Arrays.copyOf(arr, arr.length);


        int[] sortedArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sortedArray[i] = arr[i];
        }
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }


}
