/**
 * Created by nana1 on 6/29/2017.
 */
public class Main {
    public static void main(String[] args) {
        int count = 1;
        int i =0;
        while (count != 20) {
            if(isEvenNumber(count)) {
                System.out.println("the even number is " + count);
                count++;
                i++;
                if(i>= 5) {
                    break;
                }
            } else {
                count++;
            }
        }
        System.out.println("total " + i + " even numbers found");

    }

    public static boolean isEvenNumber(int n) {
        if(n % 2 == 0) {
            return true;
        }
        return false;
    }



}
