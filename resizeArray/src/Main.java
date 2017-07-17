import java.util.Scanner;

/**
 * Created by nana1 on 7/2/2017.
 */
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static int[] baseData = new int[10];

    public static void main(String[] args) {
        System.out.println("Enter 10 integers");
        getInput();
        printArray(baseData);
        resizeArray();
//        System.out.println("Enter 12 integers");
//        getInput();
        baseData[10]= 20;
        baseData[11]=30;
        printArray(baseData);
    }

    private static void getInput() {
        for(int i=0; i< baseData.length; i++) {
            baseData[i] = scanner.nextInt();
        }
    }
    private static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }

    private static void resizeArray() {
        int[] original = baseData;
        baseData = new int[12];
        for(int i=0; i< original.length; i++){
            baseData[i] = original[i];
        }
    }


}
