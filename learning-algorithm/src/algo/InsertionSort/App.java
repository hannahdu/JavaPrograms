package algo.InsertionSort;

/**
 * Created by nana1 on 7/12/2017.
 */
public class App {
    public static void main(String[] args) {
        int[] myArray = insertionSort(new int[]{3,2,7,8,12,1,66,33});
        for(int i = 0; i<myArray.length; i++) {
            System.out.println(myArray[i]);
        }

    }
    public static int[] insertionSort(int[] a) {
        for(int i = 1; i<a.length; i++) {
            int element = a[i];
            // element variable contains data that we intend to bring
            // to the sorted area
            int j = i-1;
            // j points to the index position of the last element
            // in the sorted area
            while(j >= 0 && a[j] > element) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = element;
        }
        return a;

    }
}

