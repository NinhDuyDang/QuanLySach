package com.example.book_management.core.port.mapper;

import com.example.book_management.app.dto.book.BookRepo;
import com.example.book_management.app.dto.book.BookRequest;
import com.example.book_management.app.dto.employee.EmployeeRepo;
import com.example.book_management.app.dto.employee.EmployeeRequest;
import com.example.book_management.core.domain.entity.Book;
import com.example.book_management.core.domain.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
@Mapper(componentModel = "spring")
public interface EmployeeMapper {
    EmployeeRepo toEmployeeRepo(Employee employee);
    Employee toEmployee(EmployeeRequest employeeRequest);
    EmployeeRequest toEmployeeRequest(EmployeeRepo employeeRepo);
    void updateEmployee( @MappingTarget Employee employee, EmployeeRequest employeeRequest);
}
