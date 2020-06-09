package com.kodilla.rest.controller;

import com.google.gson.Gson;
import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@WebMvcTest(BookController.class)
public class BookControllerMvcTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BookService bookService;

    @Test
    public void shouldFetchBooks() throws Exception {

        //given
        List<BookDto> booksList = new ArrayList<>();
        booksList.add(new BookDto("title 1", "author 1"));
        booksList.add(new BookDto("title 2", "author 2"));
        Mockito.when(bookService.getBooks()).thenReturn(booksList);

        //when & then
        mockMvc.perform(MockMvcRequestBuilders.get("/books").contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().is(200))
                .andExpect(MockMvcResultMatchers.jsonPath("$", Matchers.hasSize(2)));
    }

    @Test
    public void shouldAddBook() throws Exception {

        //given
        Gson gson = new Gson();
//        BookDto book1 = new BookDto("Title 1", "Author 1");
        BookDto[] books = new BookDto[]{new BookDto("title1", "author1"), new BookDto("title2", "author2")};
        String booksInJson = gson.toJson(books);
        System.out.println(gson.toJson(booksInJson));


        //when & then
        mockMvc.perform(MockMvcRequestBuilders.post("/books")
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(MockMvcResultMatchers.content().contentTypeCompatibleWith(booksInJson))
                .andExpect(MockMvcResultMatchers.status().is(200));
    }
}
