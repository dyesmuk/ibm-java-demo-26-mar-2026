package com.ibm.demo.day1.oop;

public class ClassDemo {
	
	// class-level fields / class-level variables 
	static int num1; // static field 
	int num3; // instance field 

	public static void main(String[] args) {
		
		// local field / local variable 
		int num2 = 2;

		Employee emp3 = new Employee();
		System.out.println(emp3.toString());
		System.out.println(num2);

		//// datatype var op value sep
////		int num = 10;
//
//		Employee emp = new Employee();
//		emp.id = 1;
//		emp.name = "Sonu";
//		emp.salary = 90000;
////		System.out.println(emp.id + " " + emp.name + " " + emp.salary);
//		System.out.println(emp.toString());
//		emp.work();
//
//		Employee emp2 = new Employee();
//		emp2.id = 2;
//		emp2.name = "Monu";
//		emp2.salary = 92000;
////		System.out.println(emp2.id + " " + emp2.name + " " + emp2.salary);
//		System.out.println(emp2.toString());
//		emp2.work();

	}

}

//package com.ibm.demo.day1.oop;
//
//public class ClassDemo {
//
//	public static void main(String[] args) {
//
////		data - college, student, employee, salary, name, phone, email, id, aadhaar etc 
//
////		id, name, phone, email, salary
//		
//		
//		System.out.println("Class demo");
//	}
//
//}
