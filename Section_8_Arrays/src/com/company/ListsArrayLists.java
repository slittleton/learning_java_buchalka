package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ListsArrayLists {

    // RESIZING AN ARRAY - Naive Method
    private static Scanner s = new Scanner(System.in);
    private static int[] baseData = new int[3];

    public static void getInput() {
        System.out.println("Please enter " + baseData.length + " digits");
        for (int i = 0; i < baseData.length; i++) {
            baseData[i] = s.nextInt();
        }
    }

    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void resizeArray(int expandByNum) {
        int[] original = baseData;
        baseData = new int[expandByNum]; // new empty array with new size
        for (int i = 0; i < original.length; i++) {
            baseData[i] = original[i]; // puts original elements into size changed array
        }
    }

    // ARRAY LISTS
    private ArrayList<String> groceryList = new ArrayList<String>();


    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for(int i=0; i< groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified.");
    }

    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
        System.out.println(theItem + "has been removed from the grocery list");
    }

    public String findItem(String searchItem) {
//        boolean exists = list.contains(searchItem);
        int position = groceryList.indexOf(searchItem);
        if (position >= 0) {
            return groceryList.get(position);
        }
        return null;
    }
}
