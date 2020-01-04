package com.company;

import java.util.Scanner;

public class X {
    private int x;

    public X(Scanner x) {
        System.out.println("Please enter a number");
        this.x = x.nextInt();
        x(this.x);
    }

    public void x(int x) {
        for (int i = 0; i <= x; i++) {
            System.out.println(i + " * " + this.x + " = " + (i * this.x));
        }
    }

}
