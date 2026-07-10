package com.uffizio.emp.repo;

import com.uffizio.emp.entity.Employee;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    // Find employee by email
    Optional<Employee> findByEmail(String email);

    // Find employees by department
    List<Employee> findByDepartment(String department);

    // Find employees by active status
    List<Employee> findByActive(Boolean active);

    // Check if email already exists
    boolean existsByEmail(String email);

    // Delete employee by email
    void deleteByEmail(String email);

    // Search employees by name
    List<Employee> findByEmployeeNameContainingIgnoreCase(String employeeName);
}
