/**
 * Created by nana1 on 6/28/2017.
 */
public class Main {
    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1+2 = " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult +" - 1 = " + result);

        previousResult = result;
        result = result *10;
        System.out.println(previousResult + " * 10 =  "+ result);
        result++;
        System.out.println("result is now " + result);
        result--;
        System.out.println("result is now " + result);
        result +=2;
        System.out.println("result is now " + result);
        result *= 10;
        System.out.println("result is now " + result);
        result -= 10;
        System.out.println("result is now " + result);
        result /= 10;
        System.out.println("result is now " + result);


        boolean isAlien = false;
        if (isAlien == true)
            System.out.println("it is not an Alien");

        int topScore = 80;
        if (topScore <100)
            System.out.println("you got the highest score");

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100)
            System.out.println("greater than second top and leass than 100");

        if ((topScore > 90) || (secondTopScore <= 90))
            System.out.println("One of these is true");

        boolean isCar = false;
        if (isCar == true) // needs to be a boolean in parentheses
        System.out.println("this is not suppose to happen");

        isCar = true;
        boolean wasCar = isCar ? true : false;
        // shortcut for checking if (isCar == true)
        if (wasCar)
            System.out.println("wasCar is true");

        double doubleValue = 20d;
        double secondDoubleValue = 80d;
        double sum = (doubleValue + secondDoubleValue)* 25;
        System.out.println(" The sum is " + sum);
        double remainder = sum % 40;

        if (remainder <= 20)
            System.out.println("Total was over the limit");


    }
}
