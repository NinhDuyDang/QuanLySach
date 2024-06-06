package com.example.book_management.core.port.repository;


import com.example.book_management.app.dto.book.BookRequest;
import com.example.book_management.core.domain.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository  {
     List<Book> getAllBooks();
     Optional<Book> getBookById(Integer id);
     Book save(Book book);
     void deleteBookById(Integer id);
}
