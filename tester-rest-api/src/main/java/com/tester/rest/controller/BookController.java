package com.tester.rest.controller;

import com.tester.rest.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<BookDto> getBooks() {
        return bookService.getBooks();
    }

    @PostMapping
    public void addBooks(@RequestBody BookDto bookDto) {
        bookService.addBook(bookDto);
    }

    @DeleteMapping
    public void removeBooks(@RequestBody BookDto bookDto) {
        bookService.removeBook(bookDto);
    }

}
