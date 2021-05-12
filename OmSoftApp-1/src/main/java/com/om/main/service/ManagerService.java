package com.om.main.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.om.main.model.Manager;


public interface ManagerService {

	void saveData(Manager st);

	List<Manager> getAllData();

	Manager getByEmail(Manager mn, String email);

	String deleteData(String email);

	
}
