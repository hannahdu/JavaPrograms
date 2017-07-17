/**
 * Created by nana1 on 6/29/2017.
 */
public class bankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String number;

    // create constructors - empty -only need access modifier and class name
    // this has to be the first line under constructor
    public bankAccount() {
        this("345", 2.50, "default name",
                "default address", "null");
        // using this to set default values for empty constructor
        System.out.println("empty constructor called");
    }
    //create another constructor
    // saving field values directly in constructor is better than calling setter method
    public bankAccount(String accountNumber, double balance, String customerName,
                       String email, String number) {
        System.out.println("constructor with paramenters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.number = number;

    }

    public bankAccount(String customerName, String email, String number) {
        this("345", 100.55, customerName,email,number);

    }

    //deposit method
    public void deposit(double dfunds) {
        this.balance += dfunds;
        System.out.println("deposit is " + dfunds);
    }

    // withdrawl method
    public void withdrawl(double wfunds) {
        if ((this.balance - wfunds) < 0) {
            System.out.println("not sufficient funds");
        } else {
            this.balance -= wfunds;
            System.out.println("remaining balance is " + this.balance);
        }
    }

    // getter and setter
    //getter need to specify data type and return
    // setter use void but need to specify field with this
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

}
