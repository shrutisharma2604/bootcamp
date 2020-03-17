package com.example.employeeTable;

import com.example.employeeTable.Entities.Employee;
import com.example.employeeTable.Repositories.EmployeeRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class EmployeeTableApplication {

	public static void main(String[] args) { ApplicationContext applicationContext =  SpringApplication.run(EmployeeTableApplication.class, args);

		EmployeeRepo employeeRepo = applicationContext.getBean(EmployeeRepo.class);

		Employee employee = new Employee();
		employee.setFirstName("Shruti");
		employee.setLastName("Sharma");
		employee.setAge(22);
		employee.setSalary(10000);

		Employee employee2 = new Employee();
		employee2.setFirstName("Richa");
		employee2.setLastName("Sharma");
		employee2.setAge(32);
		employee2.setSalary(20000);

		Employee employee3 = new Employee();
		employee3.setFirstName("Esha");
		employee3.setLastName("Pradhan");
		employee3.setAge(52);
		employee3.setSalary(40000);

		Employee employee4 = new Employee();
		employee4.setFirstName("Jyoti");
		employee4.setLastName("Singh");
		employee4.setAge(29);
		employee4.setSalary(10000);

		employeeRepo.save(employee);
		employeeRepo.save(employee2);
		employeeRepo.save(employee3);
		employeeRepo.save(employee4);

		// JPQL ans 1
		List<Object[]> employeeList = employeeRepo.getSalary();
		for (Object[] e: employeeList) {
			System.out.println(e[0]);
		}
		System.out.println(employeeRepo.findAll());


		// JPQL ans 2
		List<Object[]> objects =employeeRepo.avgSalary();
		for (Object[] e: objects) {
			employeeRepo.updateEmployee(String.valueOf(e[0]),25000);
		}
		System.out.println(employeeRepo.findAll());


		// JPQL ans 3
		int minSalary = employeeRepo.minSalary();
		employeeRepo.deleteEmployee(minSalary);

		System.out.println(employeeRepo.findAll());

		// Native SQL ans 1

		Employee employee5 = new Employee();
		employee5.setFirstName("Rohit");
		employee5.setLastName("Sharma");
		employee5.setAge(29);
		employee5.setSalary(10000);

		employeeRepo.save(employee5);

		List<Object[]> objects1 = employeeRepo.NameEndWithSingh();
		for(Object[] o: objects1) {
			System.out.println(o[0]);
			System.out.println(o[1]);
			System.out.println(o[2]);
		}

		// Native SQL ans 2

		Employee employee6 = new Employee();
		employee6.setFirstName("Vaibhav");
		employee6.setLastName("Upadhyay");
		employee6.setAge(50);
		employee6.setSalary(10000);

		employeeRepo.save(employee6);
		employeeRepo.AgeGreaterThan45(45);
	}

}
