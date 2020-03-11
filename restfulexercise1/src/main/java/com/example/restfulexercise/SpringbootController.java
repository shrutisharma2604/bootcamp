package com.example.restfulexercise;
import com.example.restfulexercise.exception.EmpNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
@RestController
public class SpringbootController {
    @Autowired
    private EmployeeService employeeService;
    private MessageSource messageSource;

    @GetMapping(path = "/welcome")
    public String display() {

        return "Welcome to Spring Boot";
    }

    @GetMapping("/emp")
    public List<Employee> retrieve() {
        return employeeService.findAll();
    }

    @GetMapping("/emp/{id}")
    public Employee retrieveOne(@PathVariable int id) {
        Employee employee = employeeService.findOne(id);
        if (employee == null)
            throw new EmpNotFoundException("id-" + id);
        return employee;
    }

    @PostMapping("/emp")
    public ResponseEntity<Object> createEmp(@Valid @RequestBody Employee employee) {
        Employee saveemp = employeeService.save(employee);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().
                path("/{id}")
                .buildAndExpand(saveemp.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @PutMapping("/emp/update")
    public List<Employee> updateEmp(@RequestBody Employee employee) {
        return employeeService.updateEmp(employee);
    }

    @DeleteMapping("/emp/{id}")
    public void deleteEmp(@PathVariable int id) {
        Employee employee = employeeService.deleteById(id);
        if (employee == null)
            throw new EmpNotFoundException("id-" + id);
    }
}

