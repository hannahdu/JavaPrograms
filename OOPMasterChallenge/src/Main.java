/**
 * Created by nana1 on 6/30/2017.
 */
public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "sausage", 3.56, "white");
        double price = hamburger.itemizedHamburger();
        hamburger.addHamburgerAddtion1("Tomato", 0.27);
        hamburger.addHamburgerAddtion2("Lettuce", 0.75);
        hamburger.addHamburgerAddtion3("Cheese", 1.12);
        System.out.println("TOtal burger price is " + hamburger.itemizedHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddtion1("egg", 5.43);
        healthyBurger.addHealthAddition1("lentils", 3.41);
        System.out.println("total healthy burger price is " + healthyBurger.itemizedHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddtion3("Tomato", 4.99);
        db.itemizedHamburger();
    }

}
