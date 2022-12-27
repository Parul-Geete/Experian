package com.experian.experianapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class ExperianApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExperianApplication.class, args);
	}

}
