package com.example.book_management.core.port.repository;

import com.example.book_management.core.domain.entity.Employee;
import org.springframework.stereotype.Repository;

import javax.crypto.spec.OAEPParameterSpec;
import java.util.List;
import java.util.Optional;
@Repository
public interface EmployeeRepository {
    List<Employee> getAll();
    Optional<Employee> getBEmployeeById(Integer employeeId);
    Employee save(Employee employee);
    void deleteEmployeeById(Integer employeeId);
}
