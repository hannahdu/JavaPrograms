package algo.linearsearch;

/**
 * Created by nana1 on 7/11/2017.
 */
public class App {
    public static void main(String[] args) {

    }

    public static int linearSearch(int[] a, int x) {
        for(int i =0; i < a.length; i++) {
            if(a[i] == x) {
                return i;
            }
        }
        return -1;
    }
}
