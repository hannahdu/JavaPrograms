/**
 * Created by nana1 on 6/29/2017.
 */
public class Main {
    public static void main(String[] args) {
//        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
//        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
//        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4.0));
//        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0, 5.0));
//
//        //for(init; condition; increment) {
//        for(int i = 0; i < 5; i++) {
//            System.out.println("loop " + i + " hello!");
//        }

        for (int i = 2; i < 9; i++) {
            System.out.println("10000.0 at interest " + i + "% = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }
        System.out.println("****************************");
        for (int i = 8; i > 1; i--) {
            System.out.println("10000.0 at interest " + i + "% = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }


        // prime number chanllenge
        int count = 0;
        for (int i = 2; i < 100; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("prime number is " + i);
                if (count == 6) {
                    System.out.println("exiting for loop");
                    break;
                }
            }
        }
    }
    // Prime number method
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= (long) Math.sqrt(n); i++) {  //more optimized condition sqrt(n)--> faster
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));

    }
//    public static double calculateInterest(double amount, double interestRate) {
//        for (interestRate = 2; interestRate <9; interestRate++) {
//            double interestAmount = (amount * (interestRate/100));
//            return interestAmount;
//            System.out.println("At " + interestRate + " = " + interestAmount);
//        }
//
//    }


}
