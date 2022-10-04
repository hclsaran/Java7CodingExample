package com.usk.training.day3;

class Doctor {
	
	void details() {
		System.out.println("Name : test name");
		System.out.println("Exp : 10Yrs");
	}
}

class Surgeon extends Doctor {

	void specialization() {
		//super.details();
		System.out.println("Specialization : Cardio");
	}
}

class InheritanceEx {

	public static void main(String args[]) {
		Surgeon s = new Surgeon();
		s.details();
		s.specialization();
	}
}