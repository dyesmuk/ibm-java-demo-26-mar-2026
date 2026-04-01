package com.ibm.demo.day3.innerclass;

@FunctionalInterface
public interface Calc {

	public abstract int addNums(int i, int j);

}



//public interface Calc {
//
//	public abstract int addNums(int i, int j);
//
//	public abstract int subtractNums(int i, int j);
//}
//
//class CalcDemo implements Calc {
//
//	@Override
//	public int addNums(int i, int j) {
//		return i + j;
//	}
//
//	@Override
//	public int subtractNums(int i, int j) {
//		return i - j;
//	}
//
//}