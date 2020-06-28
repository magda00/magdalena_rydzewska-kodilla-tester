package com.kodilla.collections.adv.immutable.special.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    public void shouldDisplayBookTitleAndAuthor() {
        //given
        Book book = new Book("The Hobbit", "Tolkien");
        //when
        String title = book.getTitle();
        String author = book.getAuthor();
        //then
        assertEquals("The Hobbit", title);
        assertEquals("Tolkien", author);
    }
}