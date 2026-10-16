package se.iths.antonia.parprogrammering.model;

public class Book {
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        isBorrowed = false;
    }

    public Book() {
        title = "okänd titel";
        author = "okänd författare";
        isBorrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed() {
        isBorrowed = true;
    }

    public void returnBook() {
        isBorrowed = false;
    }
}
