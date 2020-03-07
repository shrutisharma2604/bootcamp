package com.example.restfulexercise;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class EmployeeService {
    private static int empCount=4;
    private static List<Employee> list=new ArrayList<>();
    static {
        list.add(new Employee(1,"Shruti",22));
        list.add(new Employee(2,"Nisha",23));
        list.add(new Employee(3,"Chandani",24));
        list.add(new Employee(4,"Shuvani",25));
    }


    public List<Employee> findAll(){
        return list;
    }

    public Employee save(Employee employee){
        if(employee.getId()==null){
            employee.setId(++empCount);
        }
        list.add(employee);
        return employee;
    }
    public Employee findOne(int id){
        for(Employee employee:list){
            if (employee.getId()==id){
                return employee;
            }
        }
        return null;
    }
}
