package model.books;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Book {

    private String isbn13;
    private String title;
    // publiction date
    private BigDecimal price;
    private String img;
//    private ArrayList<String> authors;
    private int numOfPages;
    private String description;
    private int numberOfAuthors;


    public Book(String isbn13, String title, BigDecimal price, String img, int numOfPages, String description, int numberOfAuthors ) {
        this.isbn13 = isbn13;
        this.title = title;
        this.price = price;
        this.img = img;
        this.numOfPages = numOfPages;
        this.description = description;
        this.numberOfAuthors = numberOfAuthors;
    }

    public String getIsbn13() {
        return isbn13;
    }

    public String getTitle() {
        return title;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getImg() {
        return img;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public String getDescription() {
        return description;
    }



}
