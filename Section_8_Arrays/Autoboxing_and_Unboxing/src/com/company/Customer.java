package com.company;

import java.util.ArrayList;

public class Customer {
    private ArrayList<Double> transactions;
    private String customer;

    public Customer(String customerName, double initialAmount ) {

        this.customer = customerName;
        this.transactions = new ArrayList<Double>();
        addTransaction(initialAmount);
    }

    public String getName() {
        return customer;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }


    public void addTransaction(double amount) {

        transactions.add(amount);
        System.out.println("Transaction added to " + customer + " in the amount of " + amount);
    }


}
