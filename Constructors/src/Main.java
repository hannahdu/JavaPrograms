/**
 * Created by nana1 on 6/29/2017.
 */
public class Main {
    public static void main(String[] args) {
//        bankAccount one = new bankAccount();
//        bankAccount two = new bankAccount();
//        one.setBalance(100);
//        one.setAccountNumber("123");
//        one.setCustomerName("hannah");
//        one.setEmail("hannahsdu@gmail.com");
//        one.setNumber("6505268587");

        //calling constructors
//        bankAccount one = new bankAccount("123", 100.0, "hannah", "hannahsdu@gmail.com",
//                "6505268587");
//        System.out.println(one.getAccountNumber());
//        System.out.println(one.getBalance());
//
//        one.deposit(100.0);
//        one.withdrawl(52.8);
//
//        one.withdrawl(200.0);
        VipCustomer A = new VipCustomer();
        System.out.println(A.getName());

        VipCustomer B = new VipCustomer("Hannah", 500.0);
        System.out.println(B.getName());

        VipCustomer C = new VipCustomer("tim", 200.0, "tim@email.com");
        System.out.println(C.getName());
    }
}
