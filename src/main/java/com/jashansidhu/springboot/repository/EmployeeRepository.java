package com.jashansidhu.springboot.repository;

import com.jashansidhu.springboot.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // all crud database methods to interact with database
}
