package dao;


import model.users.User;
import org.jetbrains.annotations.NotNull;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 */
public class UserDao {

    //	use one connection across class
    Connection con;

    public UserDao(Connection con) {
        this.con = con;
    }

    private boolean createUser(Statement stmt, @org.jetbrains.annotations.NotNull User user) throws SQLException {
        // function is an extension of creating user in database.
        if (user.getRole() == null) {
            return false;
        } else {
            String query = String.format("call user_signup(\'%s\',\'%s\',\'%s\',\'%s\',\'%s\',\'%s\');",
                    user.getFirstName(), user.getLastName(), user.getEmail(), user.getPassword(), user.getPhoneNumber(),
                    user.getRole());


            return stmt.execute(query);
        }
    }

    public boolean registerUser(User user) throws SQLException {
        // use this function to register a user
        Statement stmt = null;
        try {
            stmt = con.createStatement();
            return createUser(stmt, user);
        } catch (SQLException e) {
            System.out.println("I threw an error");
            e.printStackTrace();
        } finally {
            stmt.close();
        }
//			always clean up after yourself
        return false;
    }


    public boolean doesUserExist(@NotNull User user) throws SQLException {
//        checks if user with email exsists in databse
        Statement stmt = null;
        try {

            stmt = con.createStatement();
            String query = String.format("select count(*) as total from user where email = \'%s\';", user.getEmail());
            ResultSet rs = stmt.executeQuery(query);
            rs.next();
            int numberOfUsers = rs.getInt("total");
            return numberOfUsers > 0;
        } catch (SQLException e) {
            System.out.println("didn't work");
            e.printStackTrace();
        } finally {
            stmt.close();
        }

        return false;
    }

    public boolean isUserVerified(User user) throws SQLException {
//        is user verified? return 1 or 0 from database, use comparison operator to return boolean.
        Statement stmt = null;
        try {
            stmt = con.createStatement();
            String query = String.format("select is_user_verified(\"%s\") as verified;", user.getEmail());
            ResultSet rs = stmt.executeQuery(query);
            rs.next();
            boolean verified = rs.getInt("verified") != 0;
            return verified;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            stmt.close();
        }
        return false;
    }

    public boolean validateCredentials(User user) throws SQLException {
//        ask database if users email and password match if any error occurs
//        return false because we couldn't check to verify credentials
        Statement stmt = null;
        try {
            stmt = con.createStatement();
            String query = String.format("select validate_credentials(\"%s\",\"%s\") as valid;", user.getEmail(), user.getPassword());
            ResultSet rs = stmt.executeQuery(query);
            rs.next();
            boolean valid = rs.getInt("valid") != 0;
            return valid;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            stmt.close();
        }
        return false;

    }

}
