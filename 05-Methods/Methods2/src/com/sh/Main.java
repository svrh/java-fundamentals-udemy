package com.sh;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
//        calculateScore(true, 10000, 8, 200);
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
