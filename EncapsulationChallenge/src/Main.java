/**
 * Created by nana1 on 6/30/2017.
 */
public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50,5,true);
//        printer.fillUpToner(60);
//        printer.checkDuplex(true);
//        printer.printedPage(6);
//        printer.printedPage(7);

        System.out.println("initial page count = " + printer.getPagePrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("pages printed was " +pagesPrinted+ ". New total print count for printer = "+ printer.getPagePrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("pages printed was " +pagesPrinted+ ". New total print count for printer = "+ printer.getPagePrinted());
    }
}

// encapsulation cannot access the fields directly, need to use getter and methods