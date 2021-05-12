package com.om.main.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.om.main.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

	Employee findByEmpId(int empId);


	
}
