package lab11.Prob1.Prob3;

import org.hamcrest.core.Is;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Book {
    private String ISBN;
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }
    public String getISBN() {
        return ISBN;
    }
    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }
    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void addBook(String ISBN, String title, String author, Map<String, Book> map) {
        Book book = new Book(ISBN, title, author);
        if(map.containsKey(ISBN)) {
            System.out.println("This book already exists");
        }
        else {
            map.put(ISBN, book);
            System.out.println("New added book");
        }
        }

    public String borrowBook(String ISBN, Map<String, Book> map) {
        String confirmMessage = "";
        if(map.containsKey(ISBN))
            confirmMessage = "This book doesn't already exist";
        else {
            Book book = map.get(ISBN);
            if(book.isBorrowed)
                confirmMessage = "This book is already borrowed";
            else
                book.setBorrowed(true);
        }
        return confirmMessage;
    }

    public Book returnBook(String ISBN, Map<String, Book> map, Book book) {
        if(map.containsKey(ISBN))
            System.out.println("This book doesn't exist");
        else {
            book = map.get(ISBN);
            if(book.isBorrowed)
                book.setBorrowed(false);
        }
       return book;
    }

    public Book getBookDetails(String ISBN, Map<String, Book> map, Book book) {
        if(map.containsKey(ISBN))
            System.out.println("This book doesn't exist");
        else {
            book = map.get(ISBN);
        }
        return book;
    }
    public List<Book> listAllBooks(Map<String, Book> map) {
        List<Book> list = new ArrayList<>();
        for (Map.Entry<String, Book> entry : map.entrySet()) {
          Book book =  entry.getValue();
            list.add(book);
        }
        return list;
    }

    public List<Book> listBorrowedBooks(Map<String, Book> map) {
        List<Book> list = new ArrayList<>();
        for (Map.Entry<String, Book> entry : map.entrySet()) {
            Book book =  entry.getValue();
            if(book.isBorrowed)
            list.add(book);
        }
        return list;
    }

    @Override
    public String toString() {
        return "Book{ISBN= "+  ISBN + "title= " + title + "Author: "+ author+ "Author: " +author+ "Borrowed= "+isBorrowed;
    }
}
