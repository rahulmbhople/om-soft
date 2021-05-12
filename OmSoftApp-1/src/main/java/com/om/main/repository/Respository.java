package com.om.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.om.main.model.Employee;
import com.om.main.model.Manager;

@Repository
public interface Respository extends CrudRepository<Manager, String> {

	
}
