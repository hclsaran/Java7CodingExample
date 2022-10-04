package com.usk.training.day3;

class Bank {

	float getRateOfInterest() {
		return 9;
	}
}

class BankA extends Bank {
	float getRateOfInterest() {
		return 8;
	}
}

class BankB extends Bank {
	float getRateOfInterest() {
		return 7.5f;
	}
}

class BankC extends Bank {

}

class OverridingEx {

	public static void main(String args[]) {
		Bank b = new Bank();
		Bank b1 = new BankA();
		Bank b2 = new BankB();
		Bank c = new BankC();
		System.out.println(b.getRateOfInterest());
		System.out.println(b1.getRateOfInterest());
		System.out.println(b2.getRateOfInterest());
		System.out.println(c.getRateOfInterest());
	}

}