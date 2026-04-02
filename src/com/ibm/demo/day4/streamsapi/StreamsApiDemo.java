package com.ibm.demo.day4.streamsapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamsApiDemo {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<Employee>(Arrays.asList(new Employee(1, "Monu", 90000),
				new Employee(2, "Sonu", 95000), new Employee(3, "Tonu", 92000)));

		System.out.println("Number of employees: " + employees.size());
		
		System.out.println("1. List of employees using for loop: ");

		for (int i = 0; i)
			System.out.println();

		System.out.println("2. List of employees using for each loop: ");
		

		System.out.println("3. List of employees using forEach method: ");


	}

}
