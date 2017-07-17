/**
 * Created by nana1 on 7/2/2017.
 */
public class DeluxeBurger extends Hamburger{
    public DeluxeBurger() {
        super("Deluxe", "sausage and bacon", 14.54, "White");
        super.addHamburgerAddtion1("chips", 2.75);
        super.addHamburgerAddtion2("Drink", 1.81);
    }

    @Override
    public void addHamburgerAddtion1(String name, double price) {
        System.out.println("cannot add additiona items to deluxe burger");
    }

    @Override
    public void addHamburgerAddtion2(String name, double price) {
        System.out.println("cannot add additiona items to deluxe burger");
    }

    @Override
    public void addHamburgerAddtion3(String name, double price) {
        System.out.println("cannot add additiona items to deluxe burger");
    }

    @Override
    public void addHamburgerAddtion4(String name, double price) {
        System.out.println("cannot add additiona items to deluxe burger");
    }
}
