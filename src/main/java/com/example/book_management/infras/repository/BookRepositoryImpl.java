package com.example.book_management.infras.repository;
import com.example.book_management.core.domain.entity.Book;
import com.example.book_management.core.port.repository.BookRepository;
import com.example.book_management.infras.repository.jpa.BookJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;
@RequiredArgsConstructor
@Repository
public class BookRepositoryImpl implements BookRepository {

    @Autowired
    private final BookJpaRepository bookJpaRepository;

    @Override
    public List<Book> getAllBooks() {
        return bookJpaRepository.findAll();
    }

    @Override
    public Optional<Book> getBookById(Integer id) {
        return bookJpaRepository.findById(id);
    }

    @Override
    public Book save(Book book) {
        return bookJpaRepository.save(book);
    }

    @Override
    public void deleteBookById(Integer id) {
        bookJpaRepository.deleteById(id);
    }


}
