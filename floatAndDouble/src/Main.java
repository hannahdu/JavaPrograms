/**
 * Created by nana1 on 6/28/2017.
 */
public class Main {
    public static void main(String[] args) {
        // width of integer is 32 (4 bytes)
        int myIntValue = 5/2;
        // width of float is 32 (4 bytes)
        float myFloatValue = 5f/2f;
        // width of double is 64 (8 bytes) Default in java
        double myDoubleValue = 5d/2d;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        double pounds = 5d;
        double kilo = pounds * 0.45359237;
        System.out.println(pounds
                + " pounds are equal to " + kilo
                + " kilograms" );
    }
}
