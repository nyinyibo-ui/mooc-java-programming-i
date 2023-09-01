
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

public class Searching {

    public static void main(String[] args) {
        // The program below is meant for testing the search algorithms you'll write
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        System.out.println("How many books to create?");
        int numberOfBooks = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < numberOfBooks; i++) {
            books.add(new Book(i, "name for the book " + i));
        }

        System.out.println("Id of the book to search for?");
        int idToSearchFor = Integer.valueOf(scanner.nextLine());

        System.out.println("");
        System.out.println("Searching with linear search:");
        long start = System.currentTimeMillis();
        int linearSearchId = linearSearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (linearSearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(linearSearchId));
        }

        System.out.println("");

        System.out.println("");
        System.out.println("Seaching with binary search:");
        start = System.currentTimeMillis();
        int binarySearchId = binarySearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (binarySearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(binarySearchId));
        }

    }
    
    // to you this function to sort the unordered arrayList of object
public static ArrayList<Book> sortBooksById(ArrayList<Book> books) {
    Collections.sort(books, new Comparator<Book>() {
        public int compare(Book b1, Book b2) {
            return Integer.compare(b1.getId(),b2.getId());
        }
    });
    return books;
}

    public static int linearSearch(ArrayList<Book> books, int searchedId) {

        // if you wnat sort the id of books
//        books=sortBooksById(books);

        // find the searched ID in the id list
        for (Book book : books) {
            if (book.getId()== searchedId) {
                return books.indexOf(book);
            }
        }
        return -1;
    }

    public static int binarySearch(ArrayList<Book> books, long searchedId) {

        // if you want to sort the id of books
//        books=sortBooksById(books);
        
        //set initial upper and lower limit
        int upper = books.size() - 1;
        int lower = 0;

        while (lower <= upper) {
            int middle = (upper + lower) / 2;
            Book book=books.get(middle);
            int id=book.getId();
            if (id == searchedId) {
                return middle;
            }//if the value at list[middle] is smaller than searched
            else if (id < searchedId) {
                lower = middle + 1;
            } //    if the value at list[middle] is larger than searched
            else if (id> searchedId) {
                upper = middle - 1;
            }
        }

        return -1;
    }
}
