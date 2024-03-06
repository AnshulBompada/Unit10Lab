package unit10lab;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        ArrayList<Book> libBooks = new BookLoader().loadBooks();
        Library library = new Library(libBooks);
        System.out.println("Welcome to the library. Please go through the proces to find your book!");
        while(true) {
            System.out.println("\nSEARCH:");
            System.out.println("Enter a search field(Author/Title/Genre/Availability): ");
            String field = kb.nextLine();

            String query;
            if ( !field.toLowerCase().equals("availability") ) {
                System.out.println("Enter a search query: ");
                query = kb.nextLine();


            } else {
                System.out.println("No query for availability search");
                query = new String();
            }
            System.out.println("\nBOOKS FOUND:");

            ArrayList<Book> books = library.search(field, query);
            if (books.isEmpty()) continue;
            String booksAsString = books.toString();
            if ( !booksAsString.equals("[]") ) {
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
