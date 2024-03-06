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
    /**
     * Modification of original toString code from Mr.Rob
     * @author Chistopher Roberson, Abishta Cherukuri-Purna
     */
    @Override
    public String toString() {
        return "\033[30;41mTitle:\033[0m " + title + "\n\033[30;44mAuthor:\033[0m " + author + "\n\033[30;43mGenre:\033[0m " + genre + "\n\033[30;42mAvailable:\033[0m " + available;
    }
}