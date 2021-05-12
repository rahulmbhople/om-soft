package com.om.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class OmSoftApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(OmSoftApp1Application.class, args);
	}

}
