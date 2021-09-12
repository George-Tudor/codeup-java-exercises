package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if(score >5000) {
            System.out.println("Your score was 5000");
        } else {
            System.out.println("Got Here");
        }

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        if(gameOver) {
            int secondScore = 10000;
            levelCompleted = 8;
            bonus = 200;
            System.out.println("Second score = " + secondScore);
            System.out.println("Level completed = " + levelCompleted);
            System.out.println("The bonus is " + bonus);
            int finalScore = secondScore + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

    }
}
