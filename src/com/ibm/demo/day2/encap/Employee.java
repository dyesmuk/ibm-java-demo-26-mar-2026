package com.ibm.demo.day2.encap;

public class Employee {

	private int id;
	private String name;
	private double salary;

	public Employee() {
		System.out.println("default constructor");
	}

	public Employee(int id, String name) {
		System.out.println("all args constructor");
		this.id = id;
		this.name = name;
	}

	public Employee(int id, String name, double salary) {
		System.out.println("2 args constructor");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}

//package com.ibm.demo.day2.encap;
//
//public class Employee {
//
//	private int id;
//	private String name;
//	private double salary;
//	
//	// getter 
//	public double getSalary() {
//		return salary;
//	}
//	
//	// setter 
//	public void setSalary(double salary) {
//		this.salary = salary;
//	}
//
//	public Employee() {
//		System.out.println("default constructor");
//	}
//
//	public Employee(int id, String name) {
//		System.out.println("all args constructor");
//		this.id = id;
//		this.name = name;
//	}
//
//	public Employee(int id, String name, double salary) {
//		System.out.println("2 args constructor");
//		this.id = id;
//		this.name = name;
//		this.salary = salary;
//	}
//
//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
//	}
//
//}
