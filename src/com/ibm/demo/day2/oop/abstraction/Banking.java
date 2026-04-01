package com.ibm.demo.day2.oop.abstraction;

// real time use of abstract methods 

abstract class Rbi {
	abstract void doKyc();
}

interface FinanceMinistry {

	public abstract void payInterest();

}

interface StateGovt {

}

class HdfcBank extends Rbi implements FinanceMinistry, StateGovt {

	@Override
	void doKyc() {
		System.out.println("KYC with Aadhaar");
	}

	@Override
	public void payInterest() {
		System.out.println("paying interest");
	}
}

class IciciBank extends Rbi {
	@Override
	void doKyc() {
		System.out.println("KYC with PAN");
	}
}

public class Banking {
}
