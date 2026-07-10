package com.uffizio.emp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Entity
@Table(name = "employees")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "employee_name", nullable = false, length = 100)
    private String employeeName;

    @Column(nullable = false, unique = true, length = 100)
    private String email;

    @Column(length = 15)
    private String phoneNumber;

    @Column(length = 100)
    private String department;

    @Column(length = 100)
    private String designation;

    @Column(precision = 10, scale = 2)
    private double salary;

    @Column(name = "joining_date")
    private LocalDate joiningDate;

    @Column(nullable = false)
    private Boolean active;
}
