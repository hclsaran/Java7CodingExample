package com.usk.training.day3;

public class OverLoadingEx {

	public int add(int a, int b) {
		return (a + b);
	}

	public int add(int a, int b, int c) {
		return (a + b + c);
	}

	public double add(double a, double b) {
		return (a + b);
	}

	public static void main(String args[]) {
		OverLoadingEx ob = new OverLoadingEx();
		int r1 = ob.add(15, 25);
		System.out.println(r1);
		int r2 = ob.add(15, 25, 35);
		System.out.println(r2);
		double r3 = ob.add(11.5, 22.5);
		System.out.println(r3);
	}
	
}