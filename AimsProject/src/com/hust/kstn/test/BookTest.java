package com.hust.kstn.test;

import com.hust.kstn.models.Book;
import com.hust.kstn.models.BookAuthor;
import java.util.ArrayList;
import java.util.List;

public class BookTest {
    public static void main(String[] args) {
        BookAuthor author1 = new BookAuthor("J.K. Rowling", 1965, "British author, best known for the Harry Potter series.");
        BookAuthor author2 = new BookAuthor("George R.R. Martin", 1948, "American novelist and short-story writer in the fantasy, horror, and science fiction genres.");

        List<BookAuthor> authorsForBook = new ArrayList<>();
        authorsForBook.add(author1);
        authorsForBook.add(author2);

        Book book1 = new Book("Harry Potter and the Sorcerer's Stone", "Fantasy", 25.50, 76944, authorsForBook);
        
        System.out.println("--- Book Details ---");
        System.out.println(book1);
    }
}