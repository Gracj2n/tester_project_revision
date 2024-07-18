package com.tester.rest.controller;

import com.tester.rest.domain.BookDto;
import com.tester.rest.service.BookService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class BookControllerTest {

    @Test
    void shouldFetchBooks() {
        //given
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        List<BookDto> bookList = new ArrayList<>();
        bookList.add(new BookDto("Title 1", "Author 1"));
        bookList.add(new BookDto("Title 2", "Author 2"));
        Mockito.when(bookServiceMock.getBooks()).thenReturn(bookList);

        //when
        List<BookDto> result = bookController.getBooks();

        //then
        assertThat(result).hasSize(2);
    }

    @Test
    void shouldAddBook() {
        //given
        BookController bookController = Mockito.mock(BookController.class);
        BookDto book = new BookDto("Title 3", "Author 3");

        //when
        bookController.addBooks(book);

        //then
        Mockito.verify(bookController, Mockito.atMostOnce()).addBooks(book);
    }

}