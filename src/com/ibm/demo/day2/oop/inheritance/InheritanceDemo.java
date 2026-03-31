package com.ibm.demo.day2.oop.inheritance;

// Inheritance - 
// a subclass inherits properties (methods and fields) of superclass 
// subclass == derived class == child class 
// superclass == base class == parent class 

public class InheritanceDemo {

	public static void main(String[] args) {

//		Employee emp1 = new Employee();
//		System.out.println(emp1.toString());
//		ContractualEmployee emp2 = new ContractualEmployee();
//		System.out.println(emp2.toString());
		
		Phone phone1 = new Phone();
		phone1.call();
		phone1.sms();
		
		SmartPhone phone2 = new SmartPhone();
		phone2.call();
		phone2.sms();
//		phone2.mms(); // CE 
		phone2.camera();
		phone2.music();

		FeaturePhone phone3 = new FeaturePhone();
		phone3.music();
	}

}
