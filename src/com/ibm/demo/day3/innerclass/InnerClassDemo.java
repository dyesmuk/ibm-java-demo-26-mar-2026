package com.ibm.demo.day3.innerclass;

// How to use abstract methods from an interface ?

//// option 1 - by a concrete class 
//public class InnerClassDemo {
//
//	public static void main(String[] args) {
//
//		CalcDemo obj = new CalcDemo();
//		System.out.println(obj.addNums(10, 20));
//		System.out.println(obj.subtractNums(10, 5));
//	}
//}

////option 2 - by anonymous inner class 
//public class InnerClassDemo {
//
//	public static void main(String[] args) {
//
//		Calc obj = new Calc() {
//			@Override
//			public int addNums(int i, int j) {
//				return i + j;
//			}
//
//			@Override
//			public int subtractNums(int i, int j) {
//				return i - j;
//			}
//		};
//
//		System.out.println(obj.addNums(10, 20));
//		System.out.println(obj.subtractNums(10, 5));
//	}
//}

//option 3 - by lambda expression 
// (applicable only to function interface)

public class InnerClassDemo {

	public static void main(String[] args) {

//		Calc obj = (int i, int j) -> {
//			return i + j;
//		};

		Calc obj = (int i, int j) ->  i + j;
		
		System.out.println(obj.addNums(10, 20));
		
		

	}
}













