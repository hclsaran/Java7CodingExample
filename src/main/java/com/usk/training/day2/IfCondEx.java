package com.usk.training.day2;

public class IfCondEx {

	public static void main(String[] args) {
		String var = args[0];
		if (var.equals("name")) {
			System.out.println("Santhosh");
		}
		if (var.equals("location")) {
			System.out.println("NA");
		} else {
			System.out.println("Please enter correct option");
		}
	}

}
