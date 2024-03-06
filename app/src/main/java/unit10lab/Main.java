package unit10lab;

import java.util.*;

public class Main {
    /**
     * User interface for searching the library
     * @author Abishta Cherukuri-Purna
     * @param args
     */
    public static void main(String[] args) {
        // Scanner for User Input
        Scanner kb = new Scanner(System.in);
        // Instantiation of book library
        ArrayList<Book> libBooks = new BookLoader().loadBooks();
        Library library = new Library(libBooks);
        // Intro
        System.out.println("Welcome to the library. Please go through the process to find your book!");
        // While loop allows for searching to done multiple times in a seingle session
        while(true) {
            System.out.println("\n\033[30;45mSEARCH:\033[0m");
            System.out.println("Enter a search field(\033[30;44mAuthor\033[0m/\033[30;41mTitle\033[0m/\033[30;43mGenre\033[0m/\033[30;42mAvailablility\033[0m): ");
            String field = kb.nextLine().toLowerCase();

            // Checking whether it is a valid search feild
            if (!Arrays.asList(new String[] {"author","title","genre","availability"}).contains(field)){
                System.out.println("Invalid search field");
                continue;
            }
            String query = new String();
            // Availability only requires search feild
            if ( !field.equals("availability") ) {
                System.out.println("Enter a search query: ");
                query = kb.nextLine();
            }

            System.out.println("\nBOOKS FOUND:");

            // Searching
            ArrayList<Book> books = library.search(field, query);
            // Checkign if empty
            if (books.isEmpty()) continue;
            String booksAsString = books.toString();
            // Empty arraylist checking as an edge case
            if ( !booksAsString.equals("[]") ) {
                // Printing out
                System.out.println(
                    booksAsString
                        .substring( 
                            1, 
                            booksAsString.length() - 1)
                        .replaceAll(", ", "\n\n") );
            } else {
                System.out.println("Invalide search query. Please try again or check the database manually");
            }
        }
    }
}
