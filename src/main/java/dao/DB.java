package dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
    private String dbName = "teamproject";
    private String username = "root";
    private String password = "omon123";

    private Connection con = null;

    public DB() throws SQLException {
        this.initiate_db_con();
    }

    public void initiate_db_con() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        String url = String.format("jdbc:mysql://localhost:3306/%s", this.dbName);
        con = DriverManager.getConnection(url, this.username, this.password);
    }

    public Connection getCon() {
        return this.con;
    }
}
