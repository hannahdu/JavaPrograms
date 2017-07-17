/**
 * Created by nana1 on 6/29/2017.
 */
public class Car { // class is a blueprint for an object we want to create
    //public is access modifier public--> unrestricted access
    // member variables -> field - can be accessed anywhere inside the class
    //private--> only access by internal class
    //fields are usually private - state(characteristics) of the object
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("commodore") ){
            this.model = model;
        } else {
            this.model = "unknown"; //using this to specify the field --> updating the field using the parameter of the method
        }
    }
    public String getModel() {
        return this.model;
    }
}
