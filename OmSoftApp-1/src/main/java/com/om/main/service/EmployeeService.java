package com.om.main.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.om.main.model.Employee;
import com.om.main.model.Manager;

public interface EmployeeService {

	void saveData(Employee st);

	List<Employee> getAllData();

	String deleteData(int empId);

	Employee getByEmpId(Employee mn, int empId);

	
}
