package com.example.book_management.infras.repository.jpa;

import com.example.book_management.core.domain.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeJpaRepository extends JpaRepository<Employee, Integer> {
}
