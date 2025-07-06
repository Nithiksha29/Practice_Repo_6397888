package com.example.demo;

import com.example.demo.model.Department;
import com.example.demo.model.Employee;
import com.example.demo.service.DepartmentService;
import com.example.demo.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.text.SimpleDateFormat;

@SpringBootApplication
public class DemoApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(DemoApplication.class);

	private static EmployeeService employeeService;
	private static DepartmentService departmentService;

	public static void main(String[] args) throws Exception {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		employeeService = context.getBean(EmployeeService.class);
		departmentService = context.getBean(DepartmentService.class);

		// Uncomment only the method you want to test
		testAddEmployee();
		// testGetEmployee();
		// testUpdateEmployee();
	}

	private static void testGetEmployee() {
		LOGGER.info("Start");
		Employee employee = employeeService.get(1);
		LOGGER.debug("Employee: {}", employee);
		LOGGER.debug("Department: {}", employee.getDepartment());
		LOGGER.info("End");
	}

	private static void testAddEmployee() throws Exception {
		LOGGER.info("Start");
		Employee employee = new Employee();
		employee.setId(102);
		employee.setName("John");
		employee.setSalary(50000.0);
		employee.setPermanent(true);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		employee.setDateOfBirth(sdf.parse("1995-03-15"));

		Department department = departmentService.get(1); // assuming department with id 1 exists
		employee.setDepartment(department);

		employeeService.save(employee);
		LOGGER.debug("Employee: {}", employee);
		LOGGER.info("End");
	}

	private static void testUpdateEmployee() {
		LOGGER.info("Start");
		Employee employee = employeeService.get(102); // existing employee ID
		Department newDept = departmentService.get(2); // new department ID

		employee.setDepartment(newDept);
		employeeService.save(employee);

		LOGGER.debug("Updated Employee: {}", employee);
		LOGGER.info("End");
	}
}
