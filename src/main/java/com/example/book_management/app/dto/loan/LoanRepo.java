package com.example.book_management.app.dto.loan;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
public class LoanRepo {
    private String title;
    private String name;
    private String borrowDate;
    private String dueDate;
    private String status;
}
