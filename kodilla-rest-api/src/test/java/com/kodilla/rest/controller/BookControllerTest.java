package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BookControllerTest {

    BookService bookServiceMock = Mockito.mock(BookService.class);
    BookController bookController = new BookController(bookServiceMock);
    List<BookDto> booksList = new ArrayList<>();

    @Test
    public void shouldFetchBooks() {
        //given
        booksList.add(new BookDto("Title 1", "Author 1"));
        booksList.add(new BookDto("Title 2", "Author 2"));
        Mockito.when(bookServiceMock.getBooks()).thenReturn(booksList);

        //when
        List<BookDto> result = bookController.getBooks();

        //then
        assertThat(result).hasSize(2);
    }

    @Test
    public void shouldAddCorrectBook() {
        //given
        ArgumentCaptor<BookDto> books = ArgumentCaptor.forClass(BookDto.class);

        //when
        bookController.addBook(new BookDto("Title 1", "Author 1"));

        //then
        Mockito.verify(bookServiceMock).addBook(books.capture());
        assertEquals("Title 1", books.getValue().getTitle());
        assertEquals("Author 1", books.getValue().getAuthor());
    }
}