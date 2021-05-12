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

import com.om.main.model.Manager;
import com.om.main.service.ManagerService;

@RestController
public class ManagerController {

	@Autowired
	ManagerService hs;
	
	@RequestMapping("/")
	public String m1() {
		
		return "--- CRUD APP ---";
	}
	
	@GetMapping("getAllManagers")
	public List<Manager> getAllData() {
		List<Manager> list = hs.getAllData();
		return list;
	}

	@PostMapping("saveData")
	public Manager saveData(@RequestBody Manager mn) {
		hs.saveData(mn);
		return mn;
	}
	
	@PutMapping("/putData/{email}")
	public Manager putData(@RequestBody Manager mn, @PathVariable("email") String email) {
		System.out.println("controller === put");
		Manager mng = hs.getByEmail(mn,email);
		return mng;
	}
	
	@DeleteMapping("/deleteData/{email}")
	public String deleteData(@PathVariable("email") String email) {
		System.out.println("delete req----");
		String result = hs.deleteData(email);
		return result;
	}

	
}
