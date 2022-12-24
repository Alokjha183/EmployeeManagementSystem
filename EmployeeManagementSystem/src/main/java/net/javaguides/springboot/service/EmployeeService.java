package net.javaguides.springboot.service;

import java.util.List;

import net.javaguides.springboot.modal.Employee;

public interface EmployeeService {
	 List<Employee> getAllEmployees();
	void saveEmployee(Employee employee);
	Employee getEmployeeById(Long id);
	
	void deleteEmployeeById(Long id);
}
