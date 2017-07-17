/**
 * Created by nana1 on 6/29/2017.
 */
public class Car extends Vehicle {
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear() changed to " + this.currentGear + " gear");
    }

    public void changeVelocity(int speed, int direction) {
        move(speed,direction);
        System.out.println("Car.changeVelocity(): Velocity is "+speed+ " direction "+ direction);
    }



    //    private int wheels;
//    private int headLights;
//
//    public Car(String steering, int gears, int speed, int wheels, int headLights) {
//        super(steering, gears, speed);
//        this.wheels = wheels;
//        this.headLights = headLights;
//    }
//
//    public void startedOnWheels(int numberOfWheels) {
//        System.out.println("Car.startOnWheels() called");
//    }
//
//    @Override
//    public void changeGears(int number) {
//        startedOnWheels();
//        super.changeGears(number);
//    }
}
