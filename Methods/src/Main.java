/**
 * Created by nana1 on 6/28/2017.
 */
public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("your final score was "+ highScore);


        score = 10000;
        levelCompleted = 8;
        bonus =200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("your final score was "+ highScore);


        int scorePosition = calculateHighScorePosition(1500);
        System.out.println("your score position is " + scorePosition);
        displayHighScorePosition("hannah", scorePosition);


        // only need to define variable type once
        scorePosition = calculateHighScorePosition(900);
        System.out.println("your score position is " + scorePosition);
        displayHighScorePosition("bruce", scorePosition);

        scorePosition = calculateHighScorePosition(400);
        System.out.println("your score position is " + scorePosition);
        displayHighScorePosition("David", scorePosition);

        scorePosition = calculateHighScorePosition(50);
        System.out.println("your score position is " + scorePosition);
        displayHighScorePosition("kelvin", scorePosition);

    }
    // procedure is a void method
    // function is a method that returns a value


    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " manage to get into position "
                + position + " on the high score table");

    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        }
        return 4;
    }


    //cannot put a method inside another method

    //pass information to method --define parameters
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;

    }



}
