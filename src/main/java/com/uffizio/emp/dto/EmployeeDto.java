package com.uffizio.emp.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeDto {
    private Long id;
    private String employeeName;
    private String email;
    private String phoneNumber;
    private String department;
    private String designation;
    private double salary;
    private LocalDate joiningDate;
    private Boolean active;
}
