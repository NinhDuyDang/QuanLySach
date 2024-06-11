package com.example.book_management.app.rest.employeeController;

import com.example.book_management.app.api.EmployeeApi;
import com.example.book_management.app.dto.employee.EmployeeRepo;
import com.example.book_management.core.service.EmployeeService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
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
}
