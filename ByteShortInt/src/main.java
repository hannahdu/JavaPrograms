/**
 * Created by nana1 on 6/28/2017.
 */
public class main {
    public static void main(String[] args){
        byte byteValue = 127;
        short shortValue = 2000;
        int intValue = 30000;
        long longValue = 50000L + 10L *(byteValue + shortValue + intValue);
        System.out.println("long Vales is: " + longValue);
    }
}
