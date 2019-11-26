package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

//        System.out.println(getLargestPrime(5));
//        System.out.println(getLargestPrime(71));
//        System.out.println(getLargestPrime(4));
        System.out.println(getLargestPrime(15));
    }


    public static int sumDigits(int number) {
        // example: 125 -> 5 + 2 + 1 = 8;
        int sum = 0;
        while (number > 0) {
            // extract least siginificant digit
            int digit = number % 10;
            sum += digit;
            number /= 10; // decimal will automatically be dropped because number is an int

        }
        return sum;
    }

    public static boolean isPalindrome(int number) {
        number = Math.abs(number);

        int reversed = 0;
        int truncated = number;

        while (truncated != 0) {
            reversed *= 10; // moves number over by order of magnitude to create a new 0 position
            reversed += truncated % 10; // the remainder is added to the new 0 position
            truncated /= 10; // the truncated number has the last digit dropped off since it is an int with decimal
        }
        return number == reversed;
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) return -1;

        int lastDigit = number % 10;
        int firstDigit = 0;
        int truncated = number;

        while (truncated != 0) {
            firstDigit = truncated;
            truncated /= 10; // drop off last digit
        }
        return lastDigit + firstDigit;
    }


    public static int getEvenDigitSum(int number) {
        if (number < 0) return -1;
        int sum = 0;
        while (number > 0) {
            // extract least siginificant digit
            int digit = number % 10;
            if (digit % 2 == 0) {
                sum += digit;
            } // check if digit is even, if true then add to sum
            number /= 10; // decimal will automatically be dropped because number is an int
        }
        return sum;
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if (num1 > 99 || num2 > 99 || num1 < 10 || num2 < 10) return false;
        if (num1 == num2) return true;

        int num2Saved = num2;
        boolean match = false;

        while (!match && num1 > 0) {
            int digit = num1 % 10;
            num1 /= 10;
            num2 = num2Saved;
            while (!match && num2 > 0) {
                match = digit == (num2 % 10);
                num2 /= 10;
            }
        }
        return match;
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {

        if (!isValid(num1) || !isValid(num2) || !isValid(num3)) return false;

        int count = 0;
        num1 = num1 % 10;
        num2 = num2 % 10;
        num3 = num3 % 10;

        if (num1 == num2 || num1 == num3 || num2 == num3) return true;

        return false;

    }

    public static boolean isValid(int num) {
        if (num < 10) return false;
        if (num > 1000) return false;
        return true;
    }

    public static int getGreatestCommonDivisor(int num1, int num2) {
        if (num1 < 10 || num2 < 10) {
            return -1;
        }

        int smaller = 0;

        if (num1 < num2) {
            smaller = num1;
        } else {
            smaller = num2;
        }

        int greatest = 0;
        int common1 = 0;
        int common2 = 0;

        for (int i = 1; i <= smaller; i++) {
            if (num1 % i == 0) {
                common1 = i;
            }
            if (num2 % i == 0) {
                common2 = i;
            }
            if (common1 == common2) {
                greatest = common1;
            }
        }
        return greatest;
    }

    public static void printFactors(int num) {
        if (num < 1) {
            System.out.println("Invalid Value");
        }
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPerfectNumber(int num) {
        if (num < 1) return false;
        if (num % 2 > 0) return false;

        int total = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                total += i;
            }
        }
        return num == total;
    }

    // Print number to words
    public static void numberToWords(int num) {
        if (num < 0) {
            System.out.println("Invalid Value");
        } else {
            if (num == 0) {
                System.out.println("Zero");
            } else {


                int digitCount = getDigitCount(num);
                int digit;
                num = reverse(num);
                int reversedDigitCount = getDigitCount(num);


                while (num != 0) {
                    digit = num % 10;
                    num = num / 10;

                    switch (digit) {
                        case 0:
                            System.out.println("Zero");
                            break;
                        case 1:
                            System.out.println("One");
                            break;
                        case 2:
                            System.out.println("Two");
                            break;
                        case 3:
                            System.out.println("Three");
                            break;
                        case 4:
                            System.out.println("Four");
                            break;
                        case 5:
                            System.out.println("Five");
                            break;
                        case 6:
                            System.out.println("Six");
                            break;
                        case 7:
                            System.out.println("Seven");
                            break;
                        case 8:
                            System.out.println("Eight");
                            break;
                        case 9:
                            System.out.println("Nine");
                            break;
                    }

                }
                if (digitCount != reversedDigitCount) {
                    int zeros = (digitCount - reversedDigitCount);
                    for (int i = 0; i < zeros; i++) {
                        System.out.println("Zero");
                    }
                }
            }
        }


    }

    public static int reverse(int num) {
        int reversed = 0;
        int truncated = num;

        while (truncated != 0) {
            reversed *= 10; // moves number over by order of magnitude to create a new 0 position
            reversed += truncated % 10; // the remainder is added to the new 0 position
            truncated /= 10; // the truncated number has the last digit dropped off since it is an int with decimal
        }
        return reversed;
    }

    public static int getDigitCount(int num) {
        if (num < 0) return -1;
        int count = 0;
        while (num != 0) {
            count++;
            num = num / 10;
        }
        if (count == 0) count = 1;
        return count;

    }


    // Flour Pack Problem
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) return false;

        int bigSum = bigCount * 5;

        if (bigSum + smallCount < goal) return false;
        if (bigSum > goal) {
            if (bigSum % goal != 0) {
                if ((bigSum - 5) + smallCount < goal) return false;
            }
        }
        return true;
    }

    public static int getLargestPrime(int number) {
        int largest = -1;
        if (number < 0 || number == 1) return -1;

        for (int i = 2; i <= number; i++) {
            if (isPrime(i) && i > largest) {
                largest = i;
            }
        }

        return largest;
    }


    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int j = 2; j < n; j++)
            if (n % j == 0) {
                return false;
            }
        return true;
    }

}