/**
 * Created by nana1 on 6/29/2017.
 */
public class Vehicle {
    private String name;
    private String size;
    private int currentVelocity;
    private int currentDirection;


    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentDirection = 0;
        this.currentVelocity = 0;
    }

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at " + currentDirection + " degrees");
    }

    public void move(int velocity, int direction) {
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vehicle.move(): MOving at "+currentVelocity+ " speed in direction "
                + currentDirection);
    }

    public void stop(){
        this.currentVelocity= 0;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
//    public Vehicle(String steering, int gears, int speed) {
//        this.steering = steering;
//        this.gears = gears;
//        this.speed = speed;
//
//    }
//
//    public void changeGears(int number) {
//        System.out.println("Vehicle.changeGears() called");
//    }
//
//    public void changeSpeed(int transmission) {
//        System.out.println("Vehicle.changeSpeed() called");
//    }
//
//    public String getSteering() {
//        return steering;
//    }
//
//    public int getGears() {
//        return gears;
//    }
//
//    public int getSpeed() {
//        return speed;
//    }
}
