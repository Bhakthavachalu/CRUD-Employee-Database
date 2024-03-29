package com.example.Springbootthymeleafcrudemployeedatabase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Springbootthymeleafcrudemployeedatabase.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
