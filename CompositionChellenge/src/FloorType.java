/**
 * Created by nana1 on 6/30/2017.
 */
public class FloorType {
    private String floorFinish;
    private int floorSize;

    public FloorType(String floorFinish, int floorSize) {
        this.floorFinish = floorFinish;
        this.floorSize = floorSize;
    }
    public String getFloorFinish() {
        return floorFinish;
    }

    public int getFloorSize() {
        return floorSize;
    }

    public void flooring(String type) {
        System.out.println("Floor type is " + type);
    }


}
