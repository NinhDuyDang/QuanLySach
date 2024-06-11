package com.example.book_management.app.api;
import com.example.book_management.app.dto.employee.EmployeeRepo;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
public interface EmployeeApi {
    @Operation(summary = "get list employee")
    @GetMapping("/list")
    List<EmployeeRepo> getEmployeeList();
    @Operation(summary = "get list by Id")
    @GetMapping("/list/{id}")
    Optional<EmployeeRepo> getEmployeeById(@PathVariable Integer id);
    @Operation(summary = "create book")
    @PostMapping("/add")
    EmployeeRepo addEmployee(@RequestBody EmployeeRepo employeeRepo);
    @Operation(summary = "update employee")
    @PutMapping("/update/{id}")
    EmployeeRepo updateEmployee(@PathVariable Integer id, @RequestBody EmployeeRepo employeeRepo);
    @Operation(summary = "delete employee")
    @DeleteMapping("/delete/{id}")
    EmployeeRepo deleteEmployee(@PathVariable Integer id);
}
