package com.example.book_management.core.sevice;

import com.example.book_management.app.api.BooksApi;
import com.example.book_management.app.dto.book.BookRepo;
import com.example.book_management.app.dto.book.BookRequest;
import com.example.book_management.core.domain.entity.Book;
import com.example.book_management.core.port.mapper.BookMapper;
import com.example.book_management.core.port.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BookService implements BooksApi {
    BookRepository bookRepository;
    BookMapper bookMapper;

    @Override
    public List<BookRepo> getAllBooks() {
        return bookRepository.getAllBooks().stream()
                .map(bookMapper::toBookRepo)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<BookRepo> getBookByid(Integer id) {
        return bookRepository.getBookById(id)
                .map(bookMapper::toBookRepo);
    }

    @Override
    public BookRepo createBook(BookRepo bookRepo) {
        BookRequest bookRequest = bookMapper.toBookRequest(bookRepo);
        Book book = bookMapper.toBook(bookRequest);
        return bookMapper.toBookRepo(bookRepository.save(book));
    }

    @Override
    public BookRepo updateBook(Integer id, BookRepo bookRepo) {
        Optional<Book> existingBook = bookRepository.getBookById(id);
        if (existingBook.isPresent()) {
            Book bookToUpdate = existingBook.get();
            bookMapper.updateBook(bookToUpdate, bookMapper.toBookRequest(bookRepo));
            return bookMapper.toBookRepo(bookRepository.save(bookToUpdate));
        }
        return null;
    }


    @Override
    public BookRepo delete(int id) {
        Optional<Book> bookToDelete = bookRepository.getBookById(id);
        if (bookToDelete.isPresent()) {
            bookRepository.deleteBookById(id);
            return bookMapper.toBookRepo(bookToDelete.get());
        }
        return null;
    }
}
