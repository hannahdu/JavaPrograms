/**
 * Created by nana1 on 6/29/2017.
 */
public class MotherBoard {
    private String model;
    private String manufactures;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public void loadProgram(String programName) {
        System.out.println("Program "+ programName + " is now loading...");
    }

    public String getModel() {
        return model;
    }

    public String getManufactures() {
        return manufactures;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }

    public MotherBoard(String model, String manufactures, int ramSlots, int cardSlots, String bios) {

        this.model = model;
        this.manufactures = manufactures;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }
}
