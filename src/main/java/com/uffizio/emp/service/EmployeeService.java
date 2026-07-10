package com.uffizio.emp.service;

import com.uffizio.emp.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    // Create Employee
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    // Get Employee By Id
    EmployeeDto getEmployeeById(Long id);

    // Get All Employees
    List<EmployeeDto> getAllEmployees();

    // Update Employee
    EmployeeDto updateEmployee(Long id, EmployeeDto employeeDto);

    // Delete Employee
    void deleteEmployee(Long id);
}
