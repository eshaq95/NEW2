package model.users.Books;


/**
 * class describes what a basic book object should look like
 * a book should have an image, title , author count , description
 */
public class Book {

    private String isbn;
    private String title;
    private String img;
    private int numOfPages;
    private String bookDescription;
    private int numOfAuthors;

    public Book(String isbn, String title, String img, int numOfPages, String bookDescription, int numOfAuthors) {
        this.isbn = isbn;
        this.title = title;
        this.img = img;
        this.numOfPages = numOfPages;
        this.bookDescription = bookDescription;
        this.numOfAuthors = numOfAuthors;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getImg() {
        return img;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public int getNumOfAuthors() {
        return numOfAuthors;
    }
}
