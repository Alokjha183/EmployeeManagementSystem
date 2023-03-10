package net.javaguides.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.modal.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
