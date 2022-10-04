package com.usk.training.day3;

public class AccessModiEx {

	public static void main(String[] args) {
		Customer c = new Customer(1L, "Santhosh");
		System.out.println(c.custId); 
		System.out.println(c.age); 
	}

}

class Customer {

	public Long custId;

	String custName;
	
	private String salary;
	
	protected int age; 

	Customer(Long custId, String custName) {
		this.custId = custId;
		this.custName = custName;
	}
}
