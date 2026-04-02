package com.ibm.demo.day4.streamsapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsApiDemo {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<Employee>(Arrays.asList(new Employee(1, "Monu", 90000),
				new Employee(2, "Sonu", 95000), new Employee(3, "Tonu", 92000), new Employee(4, "Ponu", 97000)));

		System.out.println("Number of employees: " + employees.size());

		System.out.println("1. List of employees using for loop: ");
		for (int i = 0; i < employees.size(); i++)
			System.out.println(employees.get(i));

		System.out.println("2. List of employees using for each loop: ");
		for (Employee emp : employees)
			System.out.println(emp);

		System.out.println("3. List of employees using forEach method: ");
//		employees.forEach((emp) -> {System.out.println(emp);});
		employees.forEach(emp -> System.out.println(emp));

		System.out.println("4. List of employees with salary > 91000: ");
		employees.forEach((emp) -> {
			if (emp.salary > 91000)
				System.out.println(emp);
		});

		System.out.println("5. Increase employees' salary by 10%: ");

		List<Employee> updatedEmployees = employees.stream()
				.map(e -> new Employee(e.getId(), e.getName(), e.getSalary() * 1.10)).toList();
		updatedEmployees.forEach(e -> System.out.println(e.toString()));

		// Also updates original employees list
//		List<Employee> updatedEmployees = employees.stream().map(emp -> {
//			emp.setSalary(emp.getSalary() * 1.10);
//			return emp;
//		}).toList();

		updatedEmployees.forEach(e -> System.out.println(e.toString()));
		employees.forEach(e -> System.out.println(e.toString()));

	}
}
