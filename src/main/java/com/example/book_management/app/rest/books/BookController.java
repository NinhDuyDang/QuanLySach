package com.example.book_management.app.rest.books;
import com.example.book_management.app.api.BooksApi;
import com.example.book_management.app.dto.book.BookRepo;
import com.example.book_management.core.sevice.BookService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("api/v1/book")
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class BookController {
 private  final BooksApi bookService;

    @Operation(summary = "get list")
    @GetMapping("/list")
    public List<BookRepo> getAllBooks() {
        return bookService.getAllBooks();
    }


    @Operation(summary = "get list by id")
    @GetMapping("/{id}")
    public Optional<BookRepo> getBookByid(@PathVariable("id") Integer id) {
        return bookService.getBookByid(id);
    }


    @Operation(summary = "create book")
    @PostMapping("/add")
    public BookRepo createBook(@RequestBody BookRepo bookRepo) {
        return bookService.createBook(bookRepo);
    }


    @Operation(summary = "update book")
    @PutMapping("/update/{id}")
    public BookRepo updateBook(@PathVariable("id") int id, @RequestBody BookRepo bookRepo) {
        return bookService.updateBook(id, bookRepo);
    }


    @Operation(summary = "delete by id")
    @DeleteMapping("/delete/{id}")
    public BookRepo delete(@PathVariable("id") int id) {
        return bookService.delete(id);
    }

}
