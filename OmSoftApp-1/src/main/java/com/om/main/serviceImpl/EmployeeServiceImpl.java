package com.om.main.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.om.main.model.Employee;
import com.om.main.repository.EmployeeRepository;
import com.om.main.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepository repo;
	
	@Override
	public void saveData(Employee emp) {
			repo.save(emp);	
	}

	@Override
	public List<Employee> getAllData() {
		return (List<Employee>) repo.findAll();
	}

	@Override
	public Employee getByEmpId(Employee mn, int empId) {
		Employee employee=repo.findByEmpId(empId);
		return employee;
		
	}

	@Override
	public String deleteData(int empId) {
	repo.deleteById(empId);
	return "done";
	}

	
}
