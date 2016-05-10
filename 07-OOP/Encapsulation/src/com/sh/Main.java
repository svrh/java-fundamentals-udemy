package com.sh;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(50, true);

        System.out.println("Initial page count = " + printer.getPrintedPages());
        int pagesPrinted = printer.print(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count = " + printer.getPrintedPages());
        pagesPrinted = printer.print(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count = " + printer.getPrintedPages());
    }
}
