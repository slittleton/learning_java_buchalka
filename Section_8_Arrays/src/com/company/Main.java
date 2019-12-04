package com.company;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Scanner groceryScanner = new Scanner(System.in);
    private static ListsArrayLists groceryList = new ListsArrayLists();

    public static void main(String[] args) {
//        int[] myIntArray = new int[10]; // creates array with 10 element slots
//        myIntArray[5] = 50;
//        myIntArray[8] = 23;
//        int[] myIntArray2 = {22, 55, 66, 88, 44, 77, 99, 22, 11, 33}; // assign these values to array at time of creation
//        int[] myIntArray3 = new int[10];
//        for(int i=0; i< myIntArray.length; i++){
//            myIntArray3[i] = i*3;
//        }
//        for(int i=0; i< myIntArray.length; i++){
//            System.out.println(myIntArray3[i]);
//        }

//        int[] myIntegers = getIntegers(5);
//        for (int i = 0; i < myIntegers.length; i++) {
//            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
//        }
//        System.out.println("The Average is " + getAverage(myIntegers));


//        int[] myInts = SortDesc.getIntegers(5);
//        int[] sorted = SortDesc.sortIntegers(myInts);
//        SortDesc.printArray(sorted);

//        int[] arr6 = {1,2,3,4,5,6};
//        System.out.println("Array = " + Arrays.toString( arr6));
//        System.out.println("Reversed = " + Arrays.toString(ReverseArray.reverseArray(arr6)));

        // ARRAYLISTS
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {

            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\t 0 -> print choice options");
        System.out.println("\t 1 -> print list");
        System.out.println("\t 2 -> add item");
        System.out.println("\t 3 -> modify item");
        System.out.println("\t 4 -> remove item");
        System.out.println("\t 5 -> find item");
        System.out.println("\t 6 -> quit");
    }

    public static void addItem() {
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.print("Enter Item Number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo - 1, newItem); // deduct 1 to translate into an array index number
    }

    public static void removeItem() {
        System.out.print("Enter Item Number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemNo-1);

    }

    public static void searchForItem() {
        System.out.print("Item to search for");
        String searchItem = scanner.nextLine();
        if(groceryList.findItem(searchItem)!= null){
            System.out.println("Found " + searchItem +  " in our grocery list");
        }else{
            System.out.println(searchItem + " is not int he shopping list");
        }
    }


//    public static int[] getIntegers(int number) {
//        System.out.println("Enter " + number + " integer values. \r");
//        int[] values = new int[number];
//
//        for (int i = 0; i < values.length; i++) {
//            values[i] = scanner.nextInt();
//        }
//        return values;
//    }
//    public static double getAverage(int[] array) {
//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            sum += array[i];
//        }
//        return (double) sum / (double) array.length;
//    }

}
