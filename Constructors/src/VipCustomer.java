/**
 * Created by nana1 on 6/29/2017.
 */
public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    // constructor with all fields specified
    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    // constructor with 2 specified fields and 1 default field
    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "default email");
    }

    // emppty constructor with default fields
    public VipCustomer() {
        this("default name", 25.0, "default email");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
