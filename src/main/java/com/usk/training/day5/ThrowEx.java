package com.usk.training.day5;

public class ThrowEx {

	public static void main(String args[]) {
		try {
			div(1, 0);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}

	public static int div(int a, int b) throws ArithmeticException {
		if (b == 0) {
			throw new ArithmeticException("Can't be devided by zero");
		}
		return a / b;
	}

}
