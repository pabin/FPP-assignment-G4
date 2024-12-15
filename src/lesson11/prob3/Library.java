package lesson11.prob3;

import java.util.HashMap;

public class Library {
    HashMap<String, Book> books = new HashMap<>();

    public void addBook(String ISBN, String title, String author) {
        Book b = books.get(ISBN);

        if (b != null) {
            System.out.println("ISBN exists in library");
        } else {
            Book newBook = new Book(ISBN, title, author);
            books.put(ISBN, newBook);
        }
    }

    public void borrowBook(String ISBN) {
        Book b = books.get(ISBN);

        if (b == null) {
            System.out.println("Book doesn't exit in library");
        } else {
            b.setBorrowed(true);
            System.out.println("Book borrowed successfully!");
        }
    }

    public void returnBook(String ISBN) {
        Book b = books.get(ISBN);

        if (b == null) {
            System.out.println("Book record missing from library database!");
        } else {
            b.setBorrowed(false);
            System.out.println("Book returned successfully!");
        }
    }

    public boolean isBookBorrowed(String ISBN) {
        Book b = books.get(ISBN);

        if (b == null) {
            System.out.println("Book doesn't exist");
            return false;
        } else {
            return b.isBorrowed();
        }
    }

    public String getBookDetails(String ISBN) {
        Book b = books.get(ISBN);

        if (b == null) {
            return null;
        } else {
            return b.toString();
        }
    }

    public void listAllBooks() {
        books.forEach((k, v) -> System.out.println(v.toString()));
    }

    public void listBorrowedBooks() {
        books.forEach((k, v) -> {
            if (v.isBorrowed()) {
                System.out.println(v.toString());
            }
        });
    }

    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("12345", "Easy Breathing", "James");
        library.addBook("12355", "Good Habits", "Tom");
        library.addBook("12365", "Neutral Actions", "Bill");
        library.addBook("12375", "Dynamic Personality", "Simon");

        library.listAllBooks();
        library.borrowBook("12375");
        library.borrowBook("12345");
        library.borrowBook("12355");

        System.out.println();
        library.listBorrowedBooks();

        System.out.println();
        library.returnBook("12375");
        library.returnBook("12345");

        library.listBorrowedBooks();

        System.out.println();
        System.out.println("is borrowed ? " + library.isBookBorrowed("12375"));
        System.out.println("is borrowed ? " + library.isBookBorrowed("12365"));

        System.out.println("12375");
        System.out.println();

        System.out.println(library);
    }

}
