package com.example.employeeTable.Repositories;

import com.example.employeeTable.Entities.Employee;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.annotation.security.PermitAll;
import javax.transaction.Transactional;
import java.util.List;

public interface EmployeeRepo extends CrudRepository<Employee,Integer> {

    @Query("select firstName,lastName from Employee as emp where salary < (select avg(salary) from Employee ORDER BY age ASC, salary DESC)")
    List<Object[]> getSalary();

    @Query("select salary from Employee where salary<(select avg(salary) from Employee )")
    List<Object[]> avgSalary();

    @Transactional
    @Modifying
    @Query("update Employee emp set emp.salary=:sal where emp.firstName=:name")
    void updateEmployee(@Param("name") String name,@Param("sal") int sal);

    @Query("select min(salary) from Employee")
    int minSalary();

    @Transactional
    @Modifying
    @Query("delete from Employee where salary=:minSal")
    void deleteEmployee(@Param("minSal") int minSal);

    @Query(value = "select empId,empFirstName,empAge from employeeTable where empLastName like '%Singh'",nativeQuery = true)
    List<Object[]> NameEndWithSingh();

    @Transactional
    @Modifying
    @Query(value = "delete from employeeTable where empAge>:age",nativeQuery = true)
    void AgeGreaterThan45(@Param("age") int age);
}
