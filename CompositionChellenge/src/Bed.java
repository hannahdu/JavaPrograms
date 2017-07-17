/**
 * Created by nana1 on 6/30/2017.
 */
public class Bed {
    private String style;
    private int pillows;
    private int height;
    private int quilt;

    public Bed(String style, int pillows, int height, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.quilt = quilt;
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getQuilt() {
        return quilt;
    }

    public void make() {
        System.out.println("bed-> making");
    }
}
