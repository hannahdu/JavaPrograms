/**
 * Created by nana1 on 6/29/2017.
 */
public class Dog extends Animal {
    // specifying fields (characteristics)
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    //constructor
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight); // super class extends constructor from another class
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;

    }

    private void chew() {
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat(); // super class is Animal class in this case
    }
    public void walk() {
        System.out.println("Dog.walk() called");
        super.move(5); // use super to indicate only reference super class (Animal class)
    }

    public void run() {
        System.out.println("Dog.run() called");
        move(10);
    }

    private void moveLegs(int speed) {
        System.out.println("DOg.moveLegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
