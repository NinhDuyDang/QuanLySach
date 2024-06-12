package com.example.book_management;

import com.example.book_management.core.port.mapper.BookMapper;
import com.example.book_management.core.port.mapper.EmployeeMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class BookManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookManagementApplication.class, args);
	}

	@Bean
	public EmployeeMapper employeeMapper() {
		return Mappers.getMapper(EmployeeMapper.class);
	}
	@Bean
	public BookMapper bookMapper() {
		return Mappers.getMapper(BookMapper.class);
	}

}
