/**
 * Created by nana1 on 6/30/2017.
 */
public class Printer {
    private int tonerLevel;
    private int pagePrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, int pagePrinted, boolean isDuplex) {
        if(tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }else {
            this.tonerLevel = -1;
        }
        this.pagePrinted = pagePrinted;
        this.isDuplex = isDuplex;
    }

    public int addToner(int tonerAmount) {
        if(tonerAmount > 0 && tonerAmount <= 100) {
            if((this.tonerLevel + tonerAmount) > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        }else {
            return -1;
        }
    }

//    public void fillUpToner(int filledToner) {
//        this.tonerLevel = this.tonerLevel + filledToner;
//        if(tonerLevel > 100) {
//            System.out.println(this.tonerLevel+ " toner filled. printer is  broken");
//        }
//    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if(this.isDuplex) {
            pagesToPrint /=2;
            System.out.println("printing in duplex mode");
        }
        this.pagePrinted += pagesToPrint;
        return pagesToPrint;
    }


//    public void printedPage(int pageWantsPrint) {
//        this.pagePrinted = this.pagePrinted + pageWantsPrint;
//        System.out.println("total page printed is " + this.pagePrinted);
//    }
//
//    public void checkDuplex(boolean printerType) {
//        if (printerType) {
//            System.out.println("Yes, this is a duplex printer");
//        }
//
//    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagePrinted() {
        return pagePrinted;
    }

    public boolean getIsDuplex() {
        return isDuplex;
    }
}


