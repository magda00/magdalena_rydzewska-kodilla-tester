package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashMap;
import java.util.Map;

public class BookManager {
    Map<Book, Book> books = new HashMap<>();

    public Book createBook(String title, String author) {
        Book book = new Book(title, author);
        if (books.containsKey(book)) {
            books.get(book);
        }
        books.put(book, book);
        return book;
    }
}
