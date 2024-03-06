package unit10lab;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

public class BookLoader {
    // File path
    private File libraryData = new File("app\\src\\main\\java\\unit10lab\\books.txt");
    // File Scanners
    private Scanner libraryCounter;
    private Scanner libraryLoader;

    /**
     * Constructor
     * @author Sreemanth Tirumalanadhuni
     */
    public BookLoader() {
        try {
            libraryCounter = new Scanner(libraryData);
            libraryLoader = new Scanner(libraryData);
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Overloaded method of loadBooks to not rquire amountOfBooks
     * @author Sreemanth Tirumalanadhuni
     */
    public ArrayList<Book> loadBooks() {
        return loadBooks( bookCounter() );
    }
    /**
     * Loads the books in books.txt into the arraylist
     * @param amountOfBooks
     * @author Sreemanth Tirumalanadhuni
     * @return Arraylist of all the books in the library
     */
    private ArrayList<Book> loadBooks(int amountOfBooks) {
        ArrayList<Book> libraryBooks = new ArrayList<Book>();
        
        for(int i = 0; i < amountOfBooks; i++){
          try {
            libraryBooks.add(
              new Book( 
                libraryLoader.nextLine() , 
                libraryLoader.nextLine() , 
                libraryLoader.nextLine() , 
                libraryLoader.nextLine().equals("true") ) );
          } catch(Exception e) {
            System.out.println("Through out heaven and earth this library isn't the honored one.");
            System.err.println(e.toString());
            e.printStackTrace();
            break;
          }
        }
  
        return libraryBooks;
      }

    /**
     * Counts books
     * @author Sreemanth Tirumalanadhuni
     * @return Amount of books in books.txt
     */
    private int bookCounter() {
        int count = 0;
        while ( libraryCounter.hasNext() ) {
            libraryCounter.nextLine();
            count++;
        }
        if(count % 4 != 0) {
          System.out.println("Data base numbers are not matching with the book classes logging");
          System.out.println("The libary is most likely corrupted, please check through your database.");
        }
        return count / 4;
    }
}