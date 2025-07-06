package com.example.demo;

import com.example.demo.model.Employee;
import com.example.demo.model.Skill;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.SkillService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Set;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	private static final Logger LOGGER = LoggerFactory.getLogger(DemoApplication.class);

	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private SkillService skillService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// testGetEmployee();
		testAddSkillToEmployee();
	}

	public void testGetEmployee() {
		Employee employee = employeeService.get(1);
		LOGGER.debug("Employee: {}", employee);
		LOGGER.debug("Skills: {}", employee.getSkillList());
	}

	public void testAddSkillToEmployee() {
		Employee employee = employeeService.get(1); // existing employee ID
		Skill skill = skillService.get(2);           // skill to assign

		Set<Skill> skillList = employee.getSkillList();
		skillList.add(skill);
		employee.setSkillList(skillList);

		employeeService.save(employee);

		LOGGER.info("Skill added successfully to employee.");
	}
}
