/**
 * Created by nana1 on 6/28/2017.
 */
public class Main {
    public static void main(String[] args) {

        int myVariable = 50; //statement is an entire line
        if (myVariable == 50) {
            System.out.println("equal to 50");
        }

        myVariable++;
        myVariable--;
        System.out.println("this us a test");

        //statement do need to be on one line
        System.out.println("this is"
                + " another"
                + " still more");
        // multiple statements on one line
        int anotherVariable = 50; myVariable--; //not recommended confusing
        System.out.println("this is another one");

        // java will ignore white space


    }
}
