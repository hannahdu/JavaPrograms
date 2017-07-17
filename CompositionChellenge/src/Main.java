/**
 * Created by nana1 on 6/30/2017.
 */
public class Main {
    public static void main(String[] args) {
// need to initialize all the fields in the composition class before using
//        Room theRoom = new Room(walls, doors, size, floorType);
//        theRoom.wallDetail();
//    }
        Walls wall1 = new Walls("west");
        Walls wall2 = new Walls("east");
        Walls wall3 = new Walls("north");
        Walls wall4 = new Walls("south");

        Ceiling ceiling = new Ceiling(12, 55);
        Bed bed = new Bed("modern", 4, 3, 2);
        Lamp lamp = new Lamp("classic", false, 75);
        Room room = new Room("Hannah's room", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

        room.makeBed();
        room.getLamp().turnOn();
    }

}

