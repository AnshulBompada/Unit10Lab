package unit10lab;
import java.util.ArrayList;

public class Library {
    public final ArrayList<Book> books;

    public Library(ArrayList<Book> books) {
        this.books = books;
        System.out.println(books.toString());
    }
    // Method to search books by various criteria
    public ArrayList<Book> search(String field, String query) {
        ArrayList<Book> searchResults = new ArrayList<>();

        switch (field.toLowerCase()) {
            case "author":
                searchResults.addAll(searchByAuthor(query, this.books));
                break;
            case "title":
                searchResults.addAll(searchByTitle(query, this.books));
                break;
            case "genre":
                searchResults.addAll(searchByGenre(query, this.books));
                break;
            case "availability":
                searchResults.addAll(searchByAvailability(this.books));
                break;
            default:
                System.out.print("Invalid search field. Please try again.");
                break;
        }

        return searchResults;
    }

    /**
     * Method to search books by author
     * @author Anshul Bompada
     * @return Arraylist of books by the same author
     */
    public ArrayList<Book> searchByAuthor(String author, ArrayList<Book> library) {
        ArrayList<Book> booksByAuthor = new ArrayList<>();
        for (int i = 0; i < library.size(); i++) {            
            if (library.get(i).getAuthor().equals(author)) {
                booksByAuthor.add( library.get(i) );
            }
        }
        return booksByAuthor;
    }

    /**
     * Method to search books by title
     * @author Anshul Bompada
     * @return ArrayList of books with the same title
     */
    public ArrayList<Book> searchByTitle(String title, ArrayList<Book> library) {
        ArrayList<Book> booksByTitle = new ArrayList<>();
        for (int i = 0; i < library.size(); i++) {            
            if (library.get(i).getTitle().equals(title)) {
                booksByTitle.add( library.get(i) );
            }
        }
        return booksByTitle;
    }

    /** Method to get all books by genre
     * @author Anshul Bompada
     * @return ArrayList with all books with a certain 
     */
    public ArrayList<Book> searchByGenre(String genre, ArrayList<Book> library) {
        ArrayList<Book> booksByGenre = new ArrayList<>();
        for (int i = 0; i < library.size(); i++) {            
            if (library.get(i).getGenre().equals(genre)) {
             booksByGenre.add( library.get(i) );
            }
        }
        return booksByGenre;
    }

    /** 
     * Method to get all available books
     * @author Abishta Cherukuri-Purna
     * @return ArrayList with all available books
     */
    public ArrayList<Book> searchByAvailability(ArrayList<Book> library) {
        ArrayList<Book> booksByAvailability = new ArrayList<>();
        for (int i = 0; i < library.size(); i++) {            
            if (library.get(i).getAvailability() == true) {
                booksByAvailability.add( library.get(i) );
            }
        }
        return booksByAvailability;
    }
}