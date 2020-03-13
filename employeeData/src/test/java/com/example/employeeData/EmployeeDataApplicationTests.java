package com.example.employeeData;

import com.example.employeeData.Entities.Employee;
import com.example.employeeData.Repository.EmpRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Optional;

@SpringBootTest
class EmployeeDataApplicationTests {
	@Autowired
	EmpRepo empRepo;
	@Test
	void contextLoads() {
	}

	@Test
	public void testCreate(){
		Employee employee=new Employee();
		Employee employee1=new Employee();
		employee.setName("Shruti");
		employee.setId(1);
		employee.setAge(22);
		employee.setLoc("Rudrapur");
		empRepo.save(employee);

		employee1.setName("Esha");
		employee1.setId(2);
		employee1.setAge(24);
		employee1.setLoc("Banaras");
		empRepo.save(employee1);
	}

	@Test
	public void testUpdate(){
		Optional<Employee> employee=empRepo.findById(1);
		employee.get().setName("Abhilash");
		employee.get().setAge(29);
		empRepo.save(employee.get());
	}
	@Test
	public void testDelete(){
		empRepo.deleteById(1);
	}

	@Test
	public void testRead(){
		Optional<Employee> employee=empRepo.findById(2);
		assertEquals("Esha",employee.get().getName());
		System.out.println(">>>>>>>>>>>"+employee.get().getLoc());
	}

	@Test
	public void getEmployeeCount() {
		System.out.println("total count >>>>>>>>>>>>>>>" + empRepo.count());
	}

	@Test
	public void PagingAndSorting(){
		Pageable pageable=PageRequest.of(0,1, Sort.Direction.ASC,"Age");
		empRepo.findAll(pageable).forEach(employee-> System.out.println("Paging and Sorting>>>>>>>>"+employee));
	}

	@Test
	public void findEmployeeByName() {
		List<Employee> objects = empRepo.findEmployeesByName("Shruti");
	}

	@Test
	public void findWithCharacter() {
		empRepo.findByNameStartingWith("A").forEach(employee -> System.out.println("Starting with A----------------> " + employee.getName()));
	}

	@Test
	public void findAgeBetween28To32() {
		empRepo.findEmployeesByAgeBetween(28,32).forEach(employee -> System.out.println("Age b/w 28 32--------> " + employee.getAge()));
	}
}
