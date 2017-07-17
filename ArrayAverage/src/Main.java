import java.util.Scanner;

/**
 * Created by nana1 on 7/2/2017.
 */
public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getInteger(5);
        for(int i=0; i<myIntegers.length; i++) {
            System.out.println("Element " + i +", typed value was " + myIntegers[i] );
        }
        System.out.println("the average is " + getAverage(myIntegers));
    }

    public static int[] getInteger(int number) {
        System.out.println("Enter "+number+ " integer values. \r");
        int[] value = new int[number];

        for (int i=0; i<value.length; i++) {
            value[i] = scanner.nextInt();
        }
        return value;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for(int i=0; i< array.length; i++) {
            sum += array[i];
        }
        return (double)sum/ (double) array.length;
    }
}
