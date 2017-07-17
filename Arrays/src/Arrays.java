import java.util.Scanner;

/**
 * Created by nana1 on 7/2/2017.
 */

//array is a data structure that allows to store a sequence of value of the same data type
// works for all primitive types and String
public class Arrays {
    private static Scanner scanner = new Scanner(System.in); //System.in allows to type input into console

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        for(int i=0; i<myIntegers.length; i++) {
            System.out.println("element " + i + ", typed value was " +myIntegers[i]);
        }
        System.out.println("the average is "+ getAverage(myIntegers));
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }
    public static double getAverage(int[] array) {
        int sum = 0;
        for(int i=0; i<array.length; i++) {
            sum += array[i];
        }

        return (double) sum/ (double) array.length;
    }


//        int[] myIntArray = new int[25];
//        for(int i=0; i<myIntArray.length; i++) {
//            myIntArray[i] = i*10;
//        }
//        for(int i=0; i<myIntArray.length; i++) {
//            System.out.println("Element " + i + ", value is "+ myIntArray[i]);
//        }
////        int[] myIntArray = {1,2,3,4,5,6,7,8,9,10}; // assign the number of elements in the array
////        myIntArray[0] = 45; //initialize values in an array
////        myIntArray[5] = 50; // assigning 50 to element 5 because index starts at 0
//
////        double[] myDoubleArray = new double[10];
////        System.out.println(myIntArray[5]);
////        System.out.println(myIntArray[6]);
////        System.out.println(myIntArray[8]);
//        printArray(myIntArray);
//
//    }
//    public static void printArray(int[] array) {
//        for(int i=0; i<array.length; i++) {
//            System.out.println("Element " + i + ", value is "+ array[i]);
//        }

}
