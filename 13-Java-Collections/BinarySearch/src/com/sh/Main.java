package com.sh;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Generic Theatre", 8, 12);
//        theatre.getSeats();
        if (theatre.reserveSeat("G06")) {
            System.out.println("Proceed with payment.");
        } else {
            System.out.println("Sorry, seat is already reserved.");
        }

        if (theatre.reserveSeat("G06")) {
            System.out.println("Proceed with payment.");
        } else {
            System.out.println("Sorry, seat is already reserved.");
        }
    }
}
