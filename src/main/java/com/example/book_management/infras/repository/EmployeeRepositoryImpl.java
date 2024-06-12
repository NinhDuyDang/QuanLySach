package com.example.book_management.infras.repository;

import com.example.book_management.core.domain.entity.Employee;
import com.example.book_management.core.port.repository.EmployeeRepository;
import com.example.book_management.infras.repository.jpa.EmployeeJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@RequiredArgsConstructor
@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {
    @Autowired
    private  final EmployeeJpaRepository employeeJpaRepository;
    @Override
    public List<Employee> getAll() {
        return employeeJpaRepository.findAll();
    }

    @Override
    public Optional<Employee> getBEmployeeById(Integer employeeId) {
        return employeeJpaRepository.findById(employeeId);
    }

    @Override
    public Employee save(Employee employee) {
        return employeeJpaRepository.save(employee);
    }

    @Override
    public void deleteEmployeeById(Integer employeeId) {
        employeeJpaRepository.deleteById(employeeId);

    }
}
