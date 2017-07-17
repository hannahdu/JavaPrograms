/**
 * Created by nana1 on 6/29/2017.
 */

//composition is "has"- creating object within object
// inheritance is "is"
// use composition before inheritance
public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220B", "dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27 inch Beast", "Acer", 27, new Resolution(2540,1440));
        MotherBoard theMotherBoard = new MotherBoard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherBoard);
//        thePC.getMonitor().drawPixelAt(1500,1200,"red");_
//        thePC.getMotherboard().loadProgram("WIindows 1.0");
//        thePC.getTheCase().pressPowerButton();
        thePC.powerUp();
    }
}
