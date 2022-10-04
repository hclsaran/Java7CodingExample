package com.usk.training.day5;

public class NestedExceptions {

	public static void main(String args[]) {
		
		int[] arr = { 1, 2, 3 };
		
		try {
			int div = arr[1] / 0;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}

		try {
			try {
				int div = arr[1] / 0;
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

	}

}
