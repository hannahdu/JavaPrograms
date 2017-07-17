/**
 * Created by nana1 on 6/29/2017.
 */
public class Main {
    public static void main(String[] args) {
        //while loop needs increment i++; otherwise, infinite loop
//        int count = 1;
//        while (count != 5) {
//            System.out.println("count value is " + count);
//            count++;
//        }
//        System.out.println("************************");
////
////        for(int i = 0; i < 5; i++) {
////            System.out.println("count value is " + i);
////        }
//
//        // while with if statement
//        count = 1;
//        while (true) {
//            if(count == 5) {
//                break;
//            }
//            System.out.println("count value is " + count);
//            count++;
//        }
//
//        // do while loop- guranteed to run at least once
//        count = 6;
//        do {
//            System.out.println("count value was " + count);
//            count++;
//
//            if(count >10) {
//                break;
//            }
//        } while (count != 5);

        // challenge
//        int number = 5;
//        int finishNumber =20;
//        while (number <= finishNumber) {
//            if(!isEvenNumber(number)) {
//                number++;
//                continue;
//            }
//            System.out.println("even number " + number);
//            number++;
//        }


        //challenge
        int number = 5;
        int finishNumber =20;
        int evenNumberFound =0;
        while (number <= finishNumber) {
            if(!isEvenNumber(number)) {
                number++;
                continue;
            }

            System.out.println("even number " + number);
            number++;

            evenNumberFound++;
            if(evenNumberFound >= 5) {
                break;
            }
        }
        System.out.println("total even number found = " + evenNumberFound);
    }

    public static boolean isEvenNumber(int number) {
        if(number %2 ==0) {
            return true;
        } else {
            return false;
        }
    }


}
