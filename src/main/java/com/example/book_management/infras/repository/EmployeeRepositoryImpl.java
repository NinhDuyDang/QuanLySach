package com.example.book_management.infras.repository;

import com.example.book_management.core.domain.entity.Employee;
import com.example.book_management.core.port.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@RequiredArgsConstructor
@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {
    @Autowired
    private  final EmployeeRepository employeeRepository;
    @Override
    public List<Employee> getAll() {
        return employeeRepository.getAll();
    }

    @Override
    public Optional<Employee> getBEmployeeById(Integer employeeId) {
        return employeeRepository.getBEmployeeById(employeeId);
    }

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployeeById(Integer employeeId) {
        employeeRepository.deleteEmployeeById(employeeId);

    }
}
