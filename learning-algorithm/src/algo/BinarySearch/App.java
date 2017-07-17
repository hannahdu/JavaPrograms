package algo.BinarySearch;

/**
 * Created by nana1 on 7/11/2017.
 */
public class App {

    public static void main(String[] args) {
        System.out.println(binarySearch(new int[] {1,2,3,4,7,9,12,18}, 82));
    }

    public static int binarySearch(int[] A, int x) {
        int p = 0;  // p is the starting index of the range of interest
        int r = A.length -1; // r is the ending index of the range

        while(p <= r) {
            int q = (p + r)/2; // q is the midpoint of the range
            if(x < A[q]) r = q-1;
            else if (x > A[q]) p = q+1;
            else return q;
        }
        return -1;
    }
}


