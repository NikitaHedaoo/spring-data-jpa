package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(EmployeeRepository repository) {
		return (args -> {
//			insertJavaAdvocates(repository);
//			System.out.println(repository.findAll());
			System.out.println(repository.findEmployeeByLastNameContaining("j"));
		});
	}
	private void insertJavaAdvocates(EmployeeRepository repository) {
		repository.save(new Employee("Niki",""));
		repository.save(new Employee("Nishi","jain"));
		repository.save(new Employee("Nishita","jain"));
	}
}
