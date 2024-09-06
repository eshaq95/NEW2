package dao;

import model.users.Books.Book;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Use this class to interact with the book table in
 * the database
 * Everything in this class manages one connection
 * to prevent opening to many database connects
 */
public class BookDao {

    private Connection con;

    public BookDao(Connection con) {
        this.con = con;
    }

    public ArrayList<Book> allBooks() throws SQLException {
        ArrayList<Book> books = new ArrayList<Book>();
        Statement stmt = null;
        try {

            stmt = con.createStatement();
            String query = String.format("select * from book_details;");
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                String title = rs.getString("title");
                String isbn = rs.getString("isbn");
                int numberOfPages = rs.getInt("num_pages");
                String img = rs.getString("img");
                int numberOfAuthors = rs.getInt("num_of_authors");
                String bookDescription = rs.getString("book_description");
                Book book = new Book(isbn, title, img, numberOfPages, bookDescription, numberOfAuthors);
                books.add(book);
                return books;
            }

//            int numberOfUsers = rs.getInt("total");

        } catch (SQLException e) {
            System.out.println("didn't work");
            e.printStackTrace();
        } finally {
            stmt.close();
        }
        return books;
    }


}
