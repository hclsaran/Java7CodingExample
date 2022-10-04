package com.usk.training.day5;

public class HandlingExceptions {

	public static void main(String[] args) {

		int i = 10;
		int j = 0;
		try {
			int result = i / j;
		} catch (ArithmeticException e) {
			System.out.println("Can't be devided by Zero.");
		}

		int[] nums = { 1, 2, 3 };
		try {
			System.out.println(nums[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Please access less index value.");
		}

		// java.lang.NullPointerException
		String name = null;
		// System.out.println(name.length());

		// java.lang.NumberFormatException
		String strId = "51679445t";
		// Long longId = Long.valueOf(strId);
		// System.out.println(longId);
	}

}
