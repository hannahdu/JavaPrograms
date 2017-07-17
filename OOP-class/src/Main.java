/**
 * Created by nana1 on 6/29/2017.
 */

// treat custom-defined class as data types
// when creating class, need to initialize object with new
public class Main {
    public static void main(String[] args) {
        Car porsche = new Car(); //define an object of data type Car, need to initialize object using new
        Car holden = new Car();
        //   System.out.println("Model is " + porsche.getModel()); // default state for a class is null
        porsche.setModel("Carrera"); // calling setModel method
        System.out.println("Model is " + porsche.getModel());
        // String is a special class, internal default for String is null



    }
}
