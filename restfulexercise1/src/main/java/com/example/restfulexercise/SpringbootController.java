package com.example.restfulexercise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SpringbootController {
  @Autowired
   private EmployeeService employeeService;
   private MessageSource messageSource;

    @GetMapping(path = "/welcome")
    public String display(){

        return "Welcome to Spring Boot";
    }

    @GetMapping("/emp")
    public List<Employee> retrieve(){
    return employeeService.findAll();
    }

    @GetMapping("/emp/{id}")
    public Employee retrieveOne(@PathVariable int id){
        return employeeService.findOne(id);
    }
    @PostMapping("/emp")
    public Employee createEmp(@RequestBody Employee employee){
        Employee saveemp=employeeService.save(employee);
        return saveemp;
    }

    @GetMapping(path = "/welcome-internationalization")
    public String messageInter(){
    return messageSource.getMessage("good.morning.message",null, LocaleContextHolder.getLocale());
  }
}