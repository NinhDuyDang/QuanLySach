package com.example.book_management.core.port.mapper;

import com.example.book_management.app.dto.book.BookRepo;
import com.example.book_management.app.dto.book.BookRequest;
import com.example.book_management.core.domain.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface BookMapper {
    BookRepo toBookRepo(Book book);          //  Book sang BookRepo
    Book toBook(BookRequest bookRequest);    // BookRequest sang Book
    BookRequest toBookRequest(BookRepo bookRepo);  //  BookRepo sang BookRequest
    void updateBook(@MappingTarget Book book, BookRequest bookRequest);  // Cập nhật Book từ BookRequest
}
