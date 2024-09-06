package model.users;

public class Customer extends User{


    public Customer(String firstName, String lastName, String email, String password, String phoneNumber, Boolean verified, Boolean locked) {
        super(firstName, lastName, email, password, phoneNumber, "customer", verified, locked);
    }
}
