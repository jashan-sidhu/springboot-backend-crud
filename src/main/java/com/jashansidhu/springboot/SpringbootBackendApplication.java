package com.jashansidhu.springboot;

import com.jashansidhu.springboot.model.Employee;
import com.jashansidhu.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
//		Employee employee = new Employee();
//		employee.setFirstName("Jashan");
//		employee.setLastName("Sidhu");
//		employee.setEmailId("sidhu.jashan@yahoo.com");
//		employeeRepository.save(employee);
	}
}
