package com.kodilla.collections.adv.immutable.special.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookManagerTest {

    private BookManager bookManager = new BookManager();

    @Test
    public void shouldCreateBookIfSuchBookDoesNotExist() {
        //given
        //when
        bookManager.createBook("The Lord Of The Rings", "Tolkien");
        //then
        assertEquals(1, bookManager.books.size());
    }

    @Test
    public void shouldNotCreateBookIfThisBookAlreadyExist() {
        //given
        bookManager.createBook("The Lord Of The Rings", "Tolkien");
        //when
        bookManager.createBook("The Lord Of The Rings", "Tolkien");
        //then
        assertEquals(1, bookManager.books.size());
    }
}