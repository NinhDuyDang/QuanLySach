package com.example.book_management.core.service;
import com.example.book_management.app.api.EmployeeApi;
import com.example.book_management.app.dto.employee.EmployeeRepo;
import com.example.book_management.app.dto.employee.EmployeeRequest;
import com.example.book_management.core.domain.entity.Employee;
import com.example.book_management.core.port.mapper.EmployeeMapper;
import com.example.book_management.core.port.repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@Service
@RequiredArgsConstructor
@Transactional
public class EmployeeService implements EmployeeApi {
    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;
    @Override
    public List<EmployeeRepo> getEmployeeList() {
        return employeeRepository.getAll().stream()
                .map(employeeMapper::toEmployeeRepo)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<EmployeeRepo> getEmployeeById(Integer id) {
        return employeeRepository.getBEmployeeById(id)
                .map(employeeMapper::toEmployeeRepo);
    }

    @Override
    public EmployeeRepo addEmployee(EmployeeRepo employeeRepo) {
        EmployeeRequest employeeRequest = employeeMapper.toEmployeeRequest(employeeRepo);
        Employee employee = employeeMapper.toEmployee(employeeRequest);
        return employeeMapper.toEmployeeRepo(employeeRepository.save(employee));
    }

    @Override
    public EmployeeRepo updateEmployee(Integer id, EmployeeRepo employeeRepo) {
        Optional<Employee> employeeOptional = employeeRepository.getBEmployeeById(id);
        if (employeeOptional.isPresent()) {
            Employee employeeToUpdate = employeeOptional.get();
            employeeMapper.updateEmployee(employeeToUpdate, employeeMapper.toEmployeeRequest(employeeRepo));
            return employeeMapper.toEmployeeRepo(employeeRepository.save(employeeToUpdate));
        }
        return null;
    }
    @Override
    public EmployeeRepo deleteEmployee(Integer id) {
        Optional<Employee> employeeOptional = employeeRepository.getBEmployeeById(id);
        if (employeeOptional.isPresent()) {
            employeeRepository.deleteEmployeeById(id);
            return employeeMapper.toEmployeeRepo(employeeOptional.get());
        }
        return null;
    }
}
