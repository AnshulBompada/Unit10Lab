package unit10lab;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        
        while(true){
        ArrayList<Book> lib = new BookLoader().loadBooks();

        System.out.println("Enter a search field: ");
        String field = kb.nextLine();

        System.out.println(" enter a serch query: ");
        String query = kb.nextLine();

        }
    }
}
