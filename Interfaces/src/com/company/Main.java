package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ITelephone timsPhone;
        timsPhone = new DeskPhone(123456);
        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();

        System.out.println("==========================");

        // notice that we can change the variable to another class because the interface is
        // the same for both classes
        timsPhone = new MobilePhone(555555);
        timsPhone.powerOn();
        timsPhone.callPhone(555555);
        timsPhone.answer();
    }
}
