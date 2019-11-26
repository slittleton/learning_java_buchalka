package com.company;

import java.util.Scanner;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phone;
    // CONSTRUCTOR
    public BankAccount(){
        // constructor with new BankAccount() without parameters is often used to set default values
        this("542", 2.50, "Default Name", "Default address", "default phone");
        System.out.println("Empty Constructor Call");

    }
    public BankAccount(String accountNumber, double balance, String name, String email, String phone ){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public BankAccount(String name, String email, String phone) {
        // constructor with some parameters while setting others as defaults;
        this("99999", 100.55, name, email, phone);
        this.name = name;
        this.email = email;
        this.phone = phone;

    }

    // GETTERS
    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhone() {
        return this.phone;
    }

    // SETTERS
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // Change Balance
    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("All deposit methods require a positive amount to be deposited");
        } else {
            double oldBalance = this.balance;
            this.balance += amount;
            System.out.println("Your previous balance was: " + oldBalance);
            System.out.println("Your new balance is: " + this.balance);
        }
    }

    public void withdrawl(double amount) {
        double oldBalance = this.balance;
        if (this.balance - amount < 0) {
            System.out.println("You do not have enough funds to withdraw " + amount);
        } else {
            this.balance = Math.round((this.balance - amount) * 100.0) / 100.0;
            System.out.println("Your previous balance was: " + oldBalance);
            System.out.println("Your new balance is: " + this.balance);
        }

    }


}
