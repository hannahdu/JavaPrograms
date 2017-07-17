/**
 * Created by nana1 on 7/10/2017.
 */
public class Animal {
    String name;
    int size;
    String color;


    public Animal(String name, int size, String color) {
        this.name = name;
        this.size = size;
        this.color = color;
    }

    public void sleep() {
        System.out.println("I am " + name + ", I sleep");
    }


}
