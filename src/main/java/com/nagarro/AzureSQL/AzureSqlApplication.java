package com.nagarro.AzureSQL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
public class AzureSqlApplication {

    @Autowired
	private EmployeeRepository repository;

    @PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee){
		return repository.save(employee);
	}

	@GetMapping("/employees")
	public List<Employee> getEmployees(){
		return repository.findAll();
	}


	public static void main(String[] args) {
		SpringApplication.run(AzureSqlApplication.class, args);
	}

}
