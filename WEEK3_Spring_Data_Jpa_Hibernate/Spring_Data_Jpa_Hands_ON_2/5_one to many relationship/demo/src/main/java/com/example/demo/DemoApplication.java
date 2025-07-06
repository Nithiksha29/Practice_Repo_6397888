package com.example.demo;

import com.example.demo.model.Department;
import com.example.demo.model.Employee;
import com.example.demo.model.Skill;
import com.example.demo.service.DepartmentService;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.SkillService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	private static final Logger LOGGER = LoggerFactory.getLogger(DemoApplication.class);

	@Autowired private DepartmentService departmentService;
	@Autowired private EmployeeService employeeService;
	@Autowired private SkillService skillService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) {
		// Uncomment the one you want to test

		testGetDepartment();
		// testGetEmployee();
		// testAddSkillToEmployee();
	}

	void testGetDepartment() {
		Department dept = departmentService.get(1);
		LOGGER.info("Department: {}", dept);
		LOGGER.info("Employees: {}", dept.getEmployeeList());
	}

	void testGetEmployee() {
		Employee employee = employeeService.get(1);
		LOGGER.info("Employee: {}", employee);
		LOGGER.info("Department: {}", employee.getDepartment());
		LOGGER.info("Skills: {}", employee.getSkillList());
	}

	void testAddSkillToEmployee() {
		Employee employee = employeeService.get(2);
		Skill skill = skillService.get(3);
		employee.getSkillList().add(skill);
		employeeService.save(employee);
		LOGGER.info("Skill added to employee");
	}
}
