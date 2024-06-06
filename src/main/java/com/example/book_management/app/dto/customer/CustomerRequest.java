package com.example.book_management.app.dto.customer;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CustomerRequest {
    private Integer customerId;

    private String name;

    private String phone;
}
