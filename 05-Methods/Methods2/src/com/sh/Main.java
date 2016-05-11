package com.sh;

public class Main {

    public static void main(String[] args) {

        // Create a method called displayHighScorePosition
        // it should a players name as a parameter, and a 2nd parameter as a position in the high score table
        // You should display the players name along with a message like " managed to get into position " and the
        // position they got and a further message " on the high score table".
        //
        // Create a 2nd method called calculateHighScorePosition
        // it should be sent one argument only, the player score
        // it should return an in
        // the return data should be
        // 1 if the score is >=1000
        // 2 if the score is >=500 and < 1000
        // 3 if the score is >=100 and < 500
        // 4 in all other cases
        // call both methods and display the results of the following
        // a score of 1500, 900, 400 and 50

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        int highScorePosition = calculateScrePosition(1000);
        displayHighScorePosition("Tosho", highScorePosition);

        highScorePosition = calculateScrePosition(900);
        displayHighScorePosition("Gosho", highScorePosition);

        highScorePosition = calculateScrePosition(400);
        displayHighScorePosition("Pesho", highScorePosition);

        highScorePosition = calculateScrePosition(50);
        displayHighScorePosition("Tonka", highScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " get into position " + highScorePosition);
    }

    public static int calculateScrePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        }
        return 4;
    }

    public static int calculateScore(boolean gameOver,int score, int levelCompleted, int bonus) {
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return  finalScore;
        }

        return -1;
    }
}
