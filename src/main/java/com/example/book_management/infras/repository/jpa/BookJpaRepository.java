package com.example.book_management.infras.repository.jpa;


import com.example.book_management.app.dto.book.BookRequest;
import com.example.book_management.core.domain.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface   BookJpaRepository extends JpaRepository<Book, Integer> {

}
