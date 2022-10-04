package com.usk.training.day3;

public class FinalEx {

	public static void main(String[] args) {

	}

}

class Vehicle {

	final int COUNT = 10;

	public String getNumber() {
		// count = 11;
		return "ABX678";
	}
}

class Car extends Vehicle {

	public final String getNumber() {
		return "ABX679";
	}

}
