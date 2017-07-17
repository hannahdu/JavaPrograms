package algo.MergeSort;

/**
 * Created by nana1 on 7/13/2017.
 */
public class MergeSort {
    public static void sort(int inputArray[]) {

        sort(inputArray, 0 , inputArray.length -1);
    }

    public static void sort(int inputArray[], int start, int end) {
        if(end <= start) {
            return; // done traversing the array
        }

        int mid = (start +end)/2;
        sort(inputArray, start, mid); // sort left half
        sort(inputArray, mid+1, end); // sort right half
        merge(inputArray, start, mid, end);
    }

    public static void merge(int inputArray[], int start, int mid, int end) {

    }
}
