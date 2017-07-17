/**
 * Created by nana1 on 6/28/2017.
 */
public class Main {
    public static void main(String[] args){
        String myString = "this is a string";
        System.out.println(myString);
        myString = myString + ", and this is more.";
        System.out.println(myString);

        String numberString ="250.55";
        numberString = numberString + "49.95";
        System.out.println("the result is: " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        //java converts myInt to String because it's add to a String
        System.out.println("the result is: " + lastString);
    }
}
