package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(calculateInterest(10000, 2.0));
        ;

        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }

        System.out.println(isPrime(7));
        primeRange(1, 15);
    }

    public static double calculateInterest(double amount, double interestRate) {

        return amount * (interestRate / 100);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i < n/2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void primeRange(int start, int stop) {
        int count = 0;
        for (int i = start; i < stop; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println(i + " isPrime");

                if (count >= 3) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
    }

    public static boolean isOdd(int number) {
        if (number < 0) return false;
        if (number % 2 == 0) return false;
        return true;
    }

    public static int sumOdd(int start, int end) {
        if (start > end) return -1;
        if (start < 0) return -1;
        int total = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                total += i;
            }
        }
        return total;
    }

}
