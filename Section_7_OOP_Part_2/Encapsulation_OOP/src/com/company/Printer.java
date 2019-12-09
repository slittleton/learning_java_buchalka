package com.company;

public class Printer {
    private int tonerLevel;
    private double numberOfPagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, int numberOfPagesPrinter, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.numberOfPagesPrinted = numberOfPagesPrinter;
        this.duplex = duplex;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public double getNumberOfPagesPrinter() {
        return numberOfPagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public void fillToner(int amount) {
        int extraToner;
        if (this.tonerLevel + amount > 100) {
            extraToner = (this.tonerLevel + amount) - 100;
            this.tonerLevel = 100;
            System.out.println("Extra Toner returned in the amount of " + extraToner + "% of a toner cartridge");

        } else {
            this.tonerLevel += amount;
        }
        System.out.println("Toner levels are now at" + this.tonerLevel + "%");
    }

    public void printPage() {
        if (this.duplex == false) {
            this.numberOfPagesPrinted++;
            System.out.println("Page Printed. A total of " + numberOfPagesPrinted + " pages have been printed");
        }
        if (this.duplex == true) {
            this.numberOfPagesPrinted += 0.5;
            System.out.println("Page Printed. A total of " + numberOfPagesPrinted + " pages have been printed");
        }

        this.tonerLevel--;
    }
}
