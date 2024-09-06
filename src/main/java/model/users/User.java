package model.users;

/**
 * User class models generic user
 * ever other type of user extends this class
 * always inherit from this class and add other
 * useful method specific to your class
 */
public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phoneNumber;
    private String role;
    private Boolean verified;
    private Boolean locked;

    public User(String firstName, String lastName, String email, String password, String phoneNumber, String role, Boolean verified, Boolean locked) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.role = role;
        this.verified = verified;
        this.locked = locked;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public Boolean getVerified() {
        return verified;
    }

    public Boolean setVerified(Boolean verified) {
        return this.verified = verified;
    }

    public Boolean getLocked() {
        return locked;
    }

    public Boolean setLocked(Boolean locked) {
        return this.locked = locked;
    }
}
