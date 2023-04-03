package com.springboot.cruddatabase.dao;

import com.springboot.cruddatabase.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    //add a method to sort by LastName
    public List<Employee> findAllByOrderByLastNameAsc();
}
