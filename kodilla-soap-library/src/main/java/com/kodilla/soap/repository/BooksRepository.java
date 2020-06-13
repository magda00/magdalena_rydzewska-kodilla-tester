package com.kodilla.soap.repository;

import com.kodilla.books.soap.Book;
import com.kodilla.books.soap.Genre;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;

import java.util.HashMap;
import java.util.Map;

@Component
public class BooksRepository {
    private static final Map<String, Book> books = new HashMap<>();

    @PostConstruct
    public void initData() {
        Book bookSciFi = new Book();
        bookSciFi.setReferenceNumber("SCI/957");
        bookSciFi.setGenre(Genre.SCI_FI);
        bookSciFi.setTitle("Brave New World");
        bookSciFi.setAuthor("Aldous Huxley");
        bookSciFi.setPublicationYear(1932);

        books.put(bookSciFi.getReferenceNumber(), bookSciFi);

        Book bookFantasy = new Book();
        bookFantasy.setReferenceNumber("FANTASY/958");
        bookFantasy.setGenre(Genre.FANTASY);
        bookFantasy.setTitle("The Hobbit or There and Back Again");
        bookFantasy.setAuthor("J.R.R. Tolkien");
        bookFantasy.setPublicationYear(1937);

        books.put(bookFantasy.getReferenceNumber(), bookFantasy);

        Book bookTech = new Book();
        bookTech.setReferenceNumber("TECH/959");
        bookTech.setGenre(Genre.TECH);
        bookTech.setTitle("Clean Code");
        bookTech.setAuthor("Robert C. Martin");
        bookTech.setPublicationYear(2009);

        books.put(bookTech.getReferenceNumber(), bookTech);

        Book bookCrime = new Book();
        bookCrime.setReferenceNumber("CRIME/960");
        bookCrime.setGenre(Genre.CRIME);
        bookCrime.setTitle("The Godfather");
        bookCrime.setAuthor("Mario Puzo");
        bookCrime.setPublicationYear(1969);

        books.put(bookCrime.getReferenceNumber(), bookCrime);
    }

    public Book findBook(String referenceNumber) {
        Assert.notNull(referenceNumber, "You have to specify the reference number");
        return books.get(referenceNumber);
    }
}

