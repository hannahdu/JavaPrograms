/**
 * Created by nana1 on 6/28/2017.
 */
public class Main {
    public static void main(String[] args) {
        int newScore = calculateScore("Hannah", 500);
        System.out.println("new score is " + newScore) ;
        calculateScore(75);
        calculateScore();

        calcFeetAndInchesToCentimeters(2, 11);
        calcFeetAndInchesToCentimeters(56);
        calcFeetAndInchesToCentimeters(166);
        calcFeetAndInchesToCentimeters(-10);
 //       calcFeetAndInchesToCentimeters(5,16);
 //       calcFeetAndInchesToCentimeters(-10);



    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet >= 0) && (inches >= 0 && inches <= 12)) {
            double centimeter = 2.54 * (12 * feet + inches);
            System.out.println(feet + " feet" + inches + " inches = " + centimeter + " cm");
            return centimeter;
        } else {
            System.out.println("invalid feet and inches parameters");
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            System.out.println("Invalid inches parameter");
            return -1;
        }
        double feet = (int )inches / 12;
        double remainderInches = (int) inches % 12;
        System.out.println("there are " + feet + " feet and " + remainderInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainderInches);
    }


    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;

    }
    public static int calculateScore(int score) {
        System.out.println("some player scored " + score + " points");
        return score * 1000;

    }
    public static int calculateScore() {
        System.out.println("no player and no score");
        return 0;
    }
    // need to change the parameters to do method overloading
}
