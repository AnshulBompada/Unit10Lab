package unit10lab;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

public class BookLoader {
    private File libraryData = new File("C:\\Users\\Anshul\\Documents\\RegularCode\\Unit10Lab\\app\\src\\main\\java\\unit10lab\\books.txt");
    private Scanner libraryCounter;
    private Scanner libraryLoader;

    public BookLoader() {
        try {
            libraryCounter = new Scanner(libraryData);
            libraryLoader = new Scanner(libraryData);
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Book> loadBooks() {
        return loadBooks( bookCounter() );
    }

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