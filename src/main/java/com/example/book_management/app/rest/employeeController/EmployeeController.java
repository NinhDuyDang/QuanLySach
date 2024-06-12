package com.example.book_management.app.rest.employeeController;

import com.example.book_management.app.api.EmployeeApi;
import com.example.book_management.app.dto.employee.EmployeeRepo;
import com.example.book_management.core.service.EmployeeService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/employee")
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class EmployeeController {
    private  final EmployeeApi employeeService;

    @Operation(summary = "get list")
    @GetMapping("/list")
    public List<EmployeeRepo> getAllEmployees() {
        return employeeService.getEmployeeList();
    }

    @Operation(summary = "get list by id")
    @GetMapping("/list/{id}")
    public Optional<EmployeeRepo> getEmployeeById(@PathVariable Integer id) {
        return  employeeService.getEmployeeById(id);
    }

    @Operation(summary = "add")
    @PostMapping("/add")
    public EmployeeRepo addEmployee(@RequestBody EmployeeRepo employeeRepo) {
        return employeeService.addEmployee(employeeRepo);
    }
    @Operation(summary = "update by  employee")
    @PutMapping("/update/{id}")
    public EmployeeRepo updateEmployee(@PathVariable Integer id, @RequestBody EmployeeRepo employeeRepo) {
        return employeeService.updateEmployee(id, employeeRepo);
    }
    @Operation(summary = "delete by id")
    @DeleteMapping("/delete/{id}")
    public void deleteEmployee(@PathVariable Integer id) {
         employeeService.deleteEmployee(id);
    }
}
