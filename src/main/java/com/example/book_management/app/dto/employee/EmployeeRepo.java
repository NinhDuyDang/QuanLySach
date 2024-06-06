package com.example.book_management.app.dto.employee;



import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;
@Setter
@Getter
@NoArgsConstructor
public class EmployeeRepo {
    private Integer employeeId;
    private String name;
    private String  age;
    private Date startedDate;
    private String type;
}
