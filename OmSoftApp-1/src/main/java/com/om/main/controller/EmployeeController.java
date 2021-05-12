package com.om.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.om.main.model.Employee;
import com.om.main.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService es;
	
	@RequestMapping("/")
	public String m1() {
		return "--- CRUD APP ---";
	}
	
	@GetMapping("getAllEmployee")
	public List<Employee> getAllData() {
		List<Employee> list = es.getAllData();
		return list;
	}

	@PostMapping("saveData")
	public Employee saveData(@RequestBody Employee mn) {
		es.saveData(mn);
		return mn;
	}
	
	@PutMapping("/putData/{empId}")
	public Employee putData(@RequestBody Employee mn, @PathVariable("empId") int empId) {
		System.out.println("controller === put");
		Employee mng = es.getByEmpId(mn,empId);
		return mng;
	}
	
	@DeleteMapping("/deleteData/{empId}")
	public String deleteData(@PathVariable("empId") int empId) {
		System.out.println("delete req----");
		String result = es.deleteData(empId);
		return result;
	}

	
}
