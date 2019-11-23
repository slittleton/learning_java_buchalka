package com.company;

public class Main {

    public static void main(String[] args) {
        // +++++++++++++++ Primitive Types +++++++++++++++
        // byte, short, int, long, float, double, char, boolean

        // INTEGER
        int myValue = 10000;
        int myMinValue = Integer.MIN_VALUE;
        int myMaxValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum = " + myMinValue);
        System.out.println("Integer Maximum = " + myMaxValue);
        System.out.println("Busted Max value = " + (myMaxValue + 1));
        System.out.println("Busted Min value = " + (myMinValue - 1));
        //        int myMaxIntTest = 2147483648; // error

        // BYTE
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Min Value = " + myMinByteValue);
        System.out.println("Byte Max Value = " + myMaxByteValue);

        // SHORT
        short myMinshortValue = Short.MIN_VALUE;
        short myMaxshortValue = Short.MAX_VALUE;
        System.out.println("short Min Value = " + myMinshortValue);
        System.out.println("short Max Value = " + myMaxshortValue);

        // LONG
        long myLongValue = 100L; // put L at end to designate it as long value

        long myMinlongValue = Long.MIN_VALUE;
        long myMaxlongValue = Long.MAX_VALUE;
        System.out.println("long Min Value = " + myMinlongValue);
        System.out.println("long Max Value = " + myMaxlongValue);

        // CASTING
        // to divide a byte by an in you have to use casting to tell
        // java that the expected value should work as the designated casting type
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        System.out.println(myNewByteValue);

        short myNewShortValue = (short) (myMinshortValue / 2);

        // FLOAT and DOUBLE contain decimal values
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum value = " + myMinFloatValue);
        System.out.println("Float Maximum value = " + myMaxFloatValue);

        //DOUBLE
        double myMindoubleValue = Double.MIN_VALUE;
        double myMaxdoubleValue = Double.MAX_VALUE;
        System.out.println("double Minimum value = " + myMindoubleValue);
        System.out.println("double Maximum value = " + myMaxdoubleValue);


        int myIntValue = 5 / 3; // ->1 b/c it cant handle the reminder
        float myFloatValue = 5.25f / 3.3f;
        float myFloatValue2 = (float) 5.25; //generally not preferred
        double myDoubleValue = 5.25d / 3.3d; // generally people use doubles

        System.out.println("MyIntValue" + myIntValue);
        System.out.println("MyFloatValue" + myFloatValue);
        System.out.println(("MyDouble Value" + myDoubleValue));

        double lbs = 5d;
        double kgs = lbs * 0.45359237d;
        System.out.println(kgs + " kilograms");

        //CHAR
        //char only stores a single character
        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        char myCopyrightChar = '\u00A9';

        //BOOLEAN
        // Booleans can be true or false
        boolean myTrueBool = true;
        boolean myFalseBool = false;


        // STRING
        // data type - a string is a class
        String myString = "This is a string";
        System.out.println(myString);
        myString = myString + ", this is more";
        System.out.println(myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);


        // OPERATORS
        // + - = * / % ++ -- += -= *= /=
        // == != > < >= <=
        // && || ?:
        // !

        // IF THEN STATEMENTS
        boolean isAlien = false;

        if(isAlien == false) {
            System.out.println("It is not an alien");
        }

        int topScore = 100;

        if(topScore != 100){
            System.out.println("You got the high score");
        }


        // TERNARY
        boolean isCar = false;
        boolean wasCar = isCar ? true : false;
        System.out.println(wasCar);

        double myDub = 20.00;
        double myDub2 = 80.00;
        double dubs = (myDub + myDub2) * 100;
        int rem = (int)dubs % 40;
        boolean myboo = false;
        if(rem == 0){
            myboo = true;
        } else if(rem != 0){
            myboo = false;
        }

        System.out.println("myboo " + myboo);
    }
}
