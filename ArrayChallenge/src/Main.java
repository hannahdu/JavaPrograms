import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by nana1 on 7/2/2017.
 */

//sorted array for descending order
public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myInteger = getIntegers(5);
        int[] sorted = sortInteger(myInteger);
        printArray(myInteger);
        printArray(sorted);

//        for(int i=0; i< myInteger.length; i++) {
//            System.out.println("Element "+ i + ", typed value was " + myInteger[i]);
//        }
//        System.out.println("");
    }

    public static int[] getIntegers(int number) {
        int[] array = new int[number];
        System.out.println("Enter "+ number +" integer values. \r");


        for(int i=0; i<array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for(int i=0; i<array.length; i++) {
            System.out.println("Element "+ i+ " contents" + array[i]);
        }
    }

    public static int[] sortInteger(int[] array) {
//        int[] sortedArray = new int[array.length];
//        for(int i=0; i<array.length; i++) {
//            sortedArray[i] = array[i]; // creating a copy of the original array into a new array
//        }
        int[] sortedArray = Arrays.copyOf(array, array.length); //using built in function to copy array
        boolean flag = true;
        int temp;

        while(flag) {
            flag = false;
            for(int i = 0; i<sortedArray.length-1; i++) {
                if(sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1]; //swapping the position of the numbers
                    sortedArray[i+1] =temp;
                    flag = true;
                }
            }
        }
        return sortedArray;

    }
}
