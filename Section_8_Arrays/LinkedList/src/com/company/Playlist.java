package com.company;

import java.util.*;

public class Playlist {
    private LinkedList<Song> playList = new LinkedList<Song>();
    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {


        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.12);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("I put the finger on you", 3.25);
        album.addSong("Lets go", 3.45);
        album.addSong("Inject the venom", 3.33);
        album.addSong("Snowballed", 4.51);
        album.addSong("Evil walks", 3.45);
        album.addSong("C.O.D.", 5.25);
        album.addSong("Breaking the rules", 5.32);
        album.addSong("Night of the long knives", 5.12);
        albums.add(album);


    }

    private static void printList(LinkedList<Song> linkedList) {
        Iterator<Song> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Playing song" + i.next().getTitle());
        }
        System.out.println("============");
    }

    // Insert Songs into Playlist in alphabetical order
    private static boolean addInOrder(LinkedList<Song> linkedList, Song newSong) {
        ListIterator<Song> songListIterator = linkedList.listIterator();

        while (songListIterator.hasNext()) {
            int comparison = songListIterator.next().getTitle().compareTo(newSong.getTitle());
            if (comparison == 0) {
                System.out.println("song " + newSong.getTitle() + " is already in playlist");
            } else if (comparison > 0) {
                songListIterator.previous();
                songListIterator.add(newSong);
                return true;
            } else if (comparison < 0) {

            }
        }
        songListIterator.add(newSong);
        return true;
    }


//    private static void visit(LinkedList cities) {
//        Scanner scanner = new Scanner(System.in);
//        boolean quit = false;
//        // going forward will be used to check which direction we are going in the list
//        // this is necessary because if you reverse direction you have to next() or previous() again
//        // because otherwise the initial next() or previous() will give you the element that you just went to
//        // as an output
//        // example -> goingForward = true -> visiting Brisbane next() visiting Perth previous() visiting Perth
//        // example -> goingForward = false -> visiting Brisbane previous() visiting Melboure next() visiting Melbourne
//
//        boolean goingForward = true;
//
//        ListIterator<String> listIterator = cities.listIterator();
//
//        if (cities.isEmpty()) {
//            System.out.println("No cities in the itinerary");
//
//        } else {
//            System.out.println("Now visiting " + listIterator.next());
//            printMenu();
//        }
//
//        while (!quit) {
//            int action = scanner.nextInt();
//            scanner.nextLine();
//            switch (action) {
//                case 0:
//                    System.out.println("Holiday (Vacation) over");
//                    quit = true;
//                    break;
//                case 1:
//                    if (!goingForward) {
//                        if (listIterator.hasNext()) {
//                            listIterator.next();
//                        }
//                        goingForward = true;
//                    }
//                    if (listIterator.hasNext()) {
//                        System.out.println("Now Visiting" + listIterator.next());
//                    } else {
//                        System.out.println("Reached end of list");
//                        goingForward = false;
//                    }
//                    break;
//                case 2:
//                    if (goingForward) {
//                        if (listIterator.hasPrevious()) {
//                            listIterator.previous();
//                        }
//                        goingForward = false;
//                    }
//                    if (listIterator.hasPrevious()) {
//                        System.out.println("Now Visiting" + listIterator.previous());
//                    } else {
//                        System.out.println("We are at the start of the list");
//                        goingForward = true;
//                    }
//                    break;
//                case 3:
//                    printMenu();
//                    break;
//            }
//        }
//    }
}
