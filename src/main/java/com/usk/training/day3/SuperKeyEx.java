package com.usk.training.day3;

public class SuperKeyEx {

	public static void main(String[] args) {
		Admin a = new Admin();
		System.out.println(a.getDetails());
	}

}

class Employee {

	Employee(String dept) {
		this.dept = dept;
	}

	public String name = "Santhosh";

	public Long id = 51679445L;

	public String dept;

	public String getDetails() {
		return name + " " + id +" "+dept;
	}
}

class Admin extends Employee {
	
	Admin(){
		super("R&D");
	}

	public String role = "IT_ADMIN";

	public String getDetails() {
		// String name = super.name;
		String name = super.getDetails();
		return name + " " + role;
	}

}
