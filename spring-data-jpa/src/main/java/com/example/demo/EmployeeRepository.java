package com.example.demo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

//This is the Interface which we will use to perform CRUD operations,
//& to make this a repository we will extend CrudRepository,
//need to pass the Entity and type of ID
//this is all needed in order to access the CRUD methods that are available with spring-data-jpa
//Although "CrudRepository" is an interface we do not need to implement anything, spring-data-jpa handles that for us

public interface EmployeeRepository extends CrudRepository<Employee,Long>{

	List<Employee> findEmployeeByLastNameContaining(String str);
}
