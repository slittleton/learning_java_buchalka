package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
//        placesToVisit.add("Sydney");
//        placesToVisit.add("Melbourne");
//        placesToVisit.add("Brisbane");
//        placesToVisit.add("Perth");
//        placesToVisit.add("Adelaide");
//        placesToVisit.add("Darwin");
//        printList(placesToVisit);
//
//        placesToVisit.add(1, "Alice Springs");
//        printList(placesToVisit);
//        placesToVisit.remove(4);
//        printList(placesToVisit);

        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Melbourne");
        addInOrder(placesToVisit, "Brisbane");
        addInOrder(placesToVisit, "Perth");
        addInOrder(placesToVisit, "Adelaide");
        addInOrder(placesToVisit, "Darwin");
        addInOrder(placesToVisit, "Darwin");
        printList(placesToVisit);

        visit(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("============");
    }

    // insert cities in alphabetical order
    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);// next() moves on to next entry
            if (comparison == 0) {
                // equal, do not add
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if (comparison > 0) {
                // new city should appear before this one
                stringListIterator.previous();// moves to previous entry to insert city in proper place
                stringListIterator.add(newCity);
                return true;
            } else if (comparison < 0) {
                // move on to next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        // going forward will be used to check which direction we are going in the list
        // this is necessary because if you reverse direction you have to next() or previous() again
        // because otherwise the initial next() or previous() will give you the element that you just went to
        // as an output
        // example -> goingForward = true -> visiting Brisbane next() visiting Perth previous() visiting Perth
        // example -> goingForward = false -> visiting Brisbane previous() visiting Melboure next() visiting Melbourne

        boolean goingForward = true;

        ListIterator<String> listIterator = cities.listIterator();

        if (cities.isEmpty()) {
            System.out.println("No cities in the itinerary");

        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Holiday (Vacation) over");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now Visiting" + listIterator.next());
                    } else {
                        System.out.println("Reached end of list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now Visiting" + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    public static void printMenu() {
        System.out.println("Available actions:\npress");
        System.out.println("" +
                "0 - to quit\n" +
                "1 - got to next city\n" +
                "2 - go to previous city\n" +
                "3 print menu options");

    }
}
