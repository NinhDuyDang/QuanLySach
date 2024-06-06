package com.example.book_management.app.api;

import com.example.book_management.app.dto.book.BookRepo;
import com.example.book_management.app.dto.book.BookRequest;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public interface BooksApi {
    @Operation(summary = "get list")
    @GetMapping("/list")
    List<BookRepo> getAllBooks();
    @Operation(summary = "get list by id ")
    @GetMapping("list/{id}")
    Optional<BookRepo> getBookByid(@PathVariable("id") Integer Id);
    @Operation(summary = "create book")
    @PostMapping("/add")
    BookRepo createBook(@RequestBody BookRepo bookRepo);
    @Operation(summary = "update book")
    @PutMapping("update/{id}")
    BookRepo updateBook(@PathVariable("id") Integer id, @RequestBody BookRepo bookRepo);
    @Operation(summary = "delete by id")
    @DeleteMapping("delete/{id}")
    BookRepo delete(@PathVariable("id") int id);
}
