package com.tester.rest.service;

import com.tester.rest.controller.BookDto;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    private List<BookDto> books = new ArrayList<>();

    public List<BookDto> getBooks () {
        return books;
    }

    public void addBook(BookDto book) {
        books.add(book);
    }

    public void removeBook(BookDto book) { books.remove(book); }


}
