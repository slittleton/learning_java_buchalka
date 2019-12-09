package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
class IntClass{
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {
//        // write your code here
//        String[] strArray = new String[10];
//        int[] intArray = new int[10];
//
//        ArrayList<String> strArrayList = new ArrayList<String>();
////        ArrayList<IntClass> intArrayList = new ArrayList<IntClass>();
//
//        Integer integer = new Integer(54);
//        Double doubleValue = new Double(12.25);
//        ArrayList<Integer> intArrayList = new ArrayList<Integer>();

//        // boxing - putting class wrapper around primitive type
//        for (int i = 0; i < 10; i++) {
//            intArrayList.add(Integer.valueOf(i));
//        }
//
////        unboxing - removing class wrapper from primitive type
//        for (int i = 0; i < 10; i++) {
//            System.out.println(intArrayList.get(i).intValue());
//        }


//        // SHORTER WAY
//        Integer myIntValue = 56;
//        int myInt = myIntValue.intValue();
//
//        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
//
//
//        for (double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
//            myDoubleValues.add(Double.valueOf(dbl));
//        }
//        for (int i = 0; i < myDoubleValues.size(); i++) {
//            double value = myDoubleValues.get(i).doubleValue();
//            System.out.println("-> " + value);
//        }

        Bank bank = new Bank("National Australia Bank");
        bank.addBranch("Adelaide");
        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Bob", 150.54);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Percy", 1.65);

        bank.listCustomers("Adelaide", true);
        bank.listCustomers("Sydney", true);

        bank.addBranch("Melbourne");
        if(!bank.addCustomer("Melbourne", "Brian", 5.53)) {
            System.out.println("Error Melbourne branch does not exist");
        }
        if(!bank.addBranch("Adelaide")) {
            System.out.println("Adelaide branch already exists");
        }
        if(!bank.addCustomerTransaction("Adelaide", "Fergus", 52.33)) {
            System.out.println("Customer does not exist at branch");
        }

        if(!bank.addCustomer("Adelaide", "Tim", 12.21)) {
            System.out.println("Customer Tim already exists");
        }
    }
}
