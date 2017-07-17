package ADT;

/**
 * Created by nana1 on 7/10/2017.
 */
public class Counter {
    private String name;
    private int count = 0;

    public Counter(String name) {
        this.name = name;
    }

    public void increment() {
        count++;
    }

    public int getCurrentValue() {
        return count;
    }

    public String toString() {
        return name + ": " + count;
    }
}
