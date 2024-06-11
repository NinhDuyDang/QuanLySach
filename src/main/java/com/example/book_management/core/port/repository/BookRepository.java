package com.example.book_management.core.port.repository;
import com.example.book_management.core.domain.entity.Book;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface BookRepository  {
     List<Book> getAllBooks();
     Optional<Book> getBookById(Integer id);
     Book save(Book book);
     void deleteBookById(Integer id);
}
