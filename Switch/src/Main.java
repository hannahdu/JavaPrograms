/**
 * Created by nana1 on 6/29/2017.
 */
public class Main {
    public static void main (String[] args) {
//        int value  = 1;
//        if ( value == 1) {
//            System.out.println("value equals one");
//        }else if (value == 2) {
//            System.out.println("value equals two");
//        } else {
//            System.out.println("other");
//        }

//        int switchValue = 4;
//
//        switch (switchValue) {
//            case 1:
//                System.out.println("value is one");
//                break;
//            case 2:
//                System.out.println("value is two");
//                break;
//            case 3:case 4:case 5:
//                System.out.println("value is 3, or 4, or 5");
//                System.out.println("the exact value is " + switchValue);
//                break;
//            default:
//                System.out.println("others");
//                break;
//        }
        // more code here
        // switch can only test different values for the same variable
        // each switch case needs a break statement or it will fall through

        char switchLetter = 'D';

        switch(switchLetter) {
            case 'A':
                System.out.println("this is A");
                break;
            case 'B':
                System.out.println("this is B");
                break;
            case 'C': case'D': case 'E':
                System.out.println("this is " + switchLetter);
                break;
            default:
                System.out.println("not found");
                break;

        }

        String month = "JUN";
        switch(month.toLowerCase()) {
            case "jan":
                System.out.println("Jan was found");
                break;
            case "apr":
                System.out.println("April was found");
                break;
            case "jun":
                System.out.println("June was found");
                break;
            default:
                System.out.println("not found");
                break;
        }
    }

}
