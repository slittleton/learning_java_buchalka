package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(null);
        list.traverse(list.getRoot());

//        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
        String stringData = "1 5 7 3 9 4 8 6 2";
        String[] data = stringData.split(" ");
        for(String s : data){
            list.addItem(new Node(s));
        }

        list.traverse(list.getRoot());
        list.removeItem(new Node("1"));
        list.removeItem(new Node("5"));
        list.removeItem(new Node("7"));
        list.removeItem(new Node("1"));
        list.traverse(list.getRoot());
    }
}
