package net.javaguides.springboot;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mindtree.employeemanagerapp.model.Employee;
import com.mindtree.employeemanagerapp.service.serviceimpl.EmployeeServiceImpl;

class EmployeeServiceImplTests {
	
	@Autowired
	EmployeeServiceImpl employeeServiceImpl;
	
	@Test
	void testCreateEmployee() {
		
		Employee employee = new Employee("John", "Smith", "jsmith@gmail.com");
		
		Employee createdEmployee = employeeServiceImpl.createEmployee(employee);
		
		Assertions.assertTrue(createdEmployee.getId()>0);
	}
	

	@Test
	void testGetAllEmployees() {
		
		List<Employee> employees = employeeServiceImpl.getAllEmployees();
		
		Assertions.assertTrue(employees.size()>0);
		
	}
	
	@Test
	void testGetEmployeeById() {
		
		Employee employeeofId1 = employeeServiceImpl.getEmployeeById(1L);
		
		assertEquals(1L, employeeofId1.getId());
	}

}