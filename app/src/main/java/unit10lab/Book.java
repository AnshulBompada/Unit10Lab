package unit10lab;

public class Book {
    private String title;
    private String author;
    private String genre;
    private boolean available;

    // Constructor
    public Book(String title, String author, String genre, boolean available) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.available = available;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean getAvailability() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    // toString method to print Book details
    @Override
    public String toString() {
        return "Title: " + title + "\nAuthor: " + author + "\nGenre: " + genre + "\nAvailable: " + available;
    }
}