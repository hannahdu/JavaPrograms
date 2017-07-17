/**
 * Created by nana1 on 6/30/2017.
 */
public class Doors {
    private int doorSize;
    private int doorNumber;
    private int doorMaterial;

    public Doors(int doorSize, int doorNumber, int doorMaterial) {
        this.doorSize = doorSize;
        this.doorNumber = doorNumber;
        this.doorMaterial = doorMaterial;
    }

    public void doorType(String material) {
        System.out.println("Door type is " + material + " material");
    }

    public int getDoorSize() {
        return doorSize;
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    public int getDoorMaterial() {
        return doorMaterial;
    }
}
