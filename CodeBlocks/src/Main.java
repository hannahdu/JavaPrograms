/**
 * Created by nana1 on 6/28/2017.
 */
public class Main {
    public static void main (String[] args) {
        boolean gameOver = true;
        int score = 4000;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score < 5000 && score> 1000) {
//            System.out.println("your score was less 5000 but greater than 1000");
//        } else if (score < 1000) { // if only one line do not need braces
//            System.out.println("your score is not less than 1000");
//        } else {
//            System.out.println("got here");
//        }
        if (gameOver == true) {
            int finalScore = score +(levelCompleted * bonus);
            System.out.println("your final score was " + finalScore);
        }
        // cannot access variables created inside the code block because they are deleted once executed.
        // variable inside a code block is called scope

//        boolean secondGame = true;
//        int secondScore = 10000;
//        int secondLevelCompleted = 8;
//        int secondBonus = 200;
//
//        if (secondGame == true) {
//            int finalScore = secondScore +(secondLevelCompleted * secondBonus);
//            System.out.println("your final score was " + finalScore);
//        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver == true) {
            int finalScore = score +(levelCompleted * bonus);
            System.out.println("your final score was " + finalScore);
        }








    }
}
