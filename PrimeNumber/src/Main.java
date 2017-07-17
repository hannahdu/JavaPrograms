/**
 * Created by nana1 on 6/29/2017.
 */
public class Main {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 100; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println(i + " is a prime number");
                if (count == 5) {
                    System.out.println("existing for loop");
                    break;
                }
            }
        }

    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


}
