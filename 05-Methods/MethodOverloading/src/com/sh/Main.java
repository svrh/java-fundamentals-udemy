package com.sh;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Tony", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        calcFeetAndInchesToCentimeters(13,1);
        calcFeetAndInchesToCentimeters(100);
        calcFeetAndInchesToCentimeters(-10);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && inches >=0 && inches <= 12) {
            double centimeters = ((inches + (feet * 12)) * 2.54);
            System.out.println(feet + " feet and " + inches + " inches are " + centimeters + " centimeters.");
            return  centimeters;
        }
        System.out.println("Invalid feet or inches.");
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >=0) {
            double feet = (int) inches / 12;
            double restInches = inches % 12;
            System.out.println(inches + " inches are equal to " + feet +" feet " + restInches + " inches.");
            return calcFeetAndInchesToCentimeters(feet, restInches);
        }
        System.out.println("Invalid feet or inches.");
        return -1;
    }
}
