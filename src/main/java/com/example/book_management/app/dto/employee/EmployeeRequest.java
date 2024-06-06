package com.example.book_management.app.dto.employee;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
public class EmployeeRequest {

    private Integer employeeId;

    private String name;

    private String  age;


    private Date startedDate;

    private String type;
}
