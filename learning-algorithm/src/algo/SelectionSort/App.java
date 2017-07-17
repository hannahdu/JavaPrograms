package algo.SelectionSort;

/**
 * Created by nana1 on 7/12/2017.
 */
public class App {
    public static void main(String[] args) {
        int[] myArray = selectionSort((new int[] {9,8,3,13,87,12,99}));
                for(int i=0; i< myArray.length; i++) {
                    System.out.println(myArray[i]);
                }
    }

    public static int[] selectionSort(int[] a) {
        for(int i = 0; i< a.length-1; i++) {
            int minimum = i;
            for(int j= i+1; j< a.length;j++) {
                if(a[j] < a[minimum]) {
                    minimum = j;
                }
            }
            int temp = a[minimum];
            a[minimum] =  a[i];
            a[i] = temp;
        }
        return a;
    }
}

