package lab11.Prob1.Prob3;

import java.util.HashMap;
import java.util.Map;

public class TestClass {

    public static void main(String[] args) {

     Book book0 = new Book("ISBN", "Math&Science", "Fred Schrodinger");
     Book book1 = new Book("ISBN1", "Physi&Science", "Albert Einstein");
     Book book2 = new Book("ISBN2", "Comp&Science", "Electrical Engineering");
     Book book4 = new Book("ISBN3", "ArticialIntelligence", "Vinaud Chandra");
     Book book3 = new Book("ISBN3", "FrenchLiterature", "Authur Rimbaud");
     Book book5 = new Book("ISBN5", "Phylosophie", "Fred Nietche");
     Book book6 = new Book("ISBN6", "Phylosophie", "Fred Nietche");

        Map<String, Book> map = new HashMap<>();
//        map.put("ISBN", book0);
          map.put("ISBN1", book1);
//        map.put("ISBN2", book2);
//        map.put("ISBN3", book3);
//        map.put("ISBN4", book4);

        book0.addBook("ISBN", "Math&Science", "Fred Schrodinger", map);
        book1.addBook("ISBN1", "Physi&Science", "Albert Einstein", map);

        book1.borrowBook("ISBN1", map);
        System.out.println(map.get("ISBN1"));

        book1.returnBook("ISBN1", map);
        System.out.println(book1.getBookDetails("ISBN1", map));

        System.out.println(book1.listBorrowedBooks(map));

        System.out.println(book1.listAllBooks(map));

    }
}
