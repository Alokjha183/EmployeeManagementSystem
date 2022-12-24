package net.javaguides.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.springboot.modal.Employee;
import net.javaguides.springboot.repositories.EmployeeRepository;

@SpringBootApplication
public class EmployeeManagementSystemApplication implements CommandLineRunner {
	@Autowired
	EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementSystemApplication.class, args);
		System.out.println("project started");
	}

	@Override
	public void run(String... args) throws Exception {
//		Employee employee1=new Employee("Alok", "Jha", "alokra.raj1@gmail.com");
//		employeeRepository.save(employee1);
//		
//		Employee employee2=new Employee("John", "Cena", "cena.raj1@gmail.com");
//		employeeRepository.save(employee2);
//		
//		Employee employee3=new Employee("aashu", "sharna", "alokra.raj1@gmail.com");
//		employeeRepository.save(employee3);
//		
//		Employee employee4=new Employee("Amit", "Jha", "burbak.raj1@gmail.com");
//		employeeRepository.save(employee4);
		
		
	}

}
