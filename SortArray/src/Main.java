import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by nana1 on 7/2/2017.
 */
public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myInteger = getIntegers(5);
        int[] sortedArray = sortArray(myInteger);
        printArray(myInteger);
        printArray(sortedArray);

    }

    public static int[] getIntegers(int number) {
        int[] array = new int[number];
        System.out.println("Enter "+ number + " integer numbers.\r");

        for(int i=0; i<array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for(int i= 0; i<array.length; i++) {
            System.out.println("Element "+ i + ", input was "+ array[i]);
        }
    }

    public static int[] sortArray(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;

        while(flag) {
            flag = false;
            for(int i=0; i< sortedArray.length-1; i++) {
                if(sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
