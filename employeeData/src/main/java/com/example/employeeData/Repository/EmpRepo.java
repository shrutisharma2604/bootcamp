package com.example.employeeData.Repository;

import com.example.employeeData.Entities.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface EmpRepo extends PagingAndSortingRepository<Employee,Integer> {

    List<Employee> findEmployeesByName(String name);
    List<Employee> findByNameStartingWith(String character);
    List<Employee> findEmployeesByAgeBetween(Integer start,Integer end);
}
