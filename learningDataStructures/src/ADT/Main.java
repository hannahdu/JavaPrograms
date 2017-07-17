package ADT;

/**
 * Created by nana1 on 7/10/2017.
 */
public class Main {
    public static void main(String[] args) {
        Counter myCounter = new Counter("my Counter");
        myCounter.increment();;
        myCounter.increment();
        myCounter.increment();
        myCounter.increment();
        System.out.println(myCounter);
    }
}
