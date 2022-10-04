package com.usk.training.day5;

public class UnCheckedExceptions {

	public static void main(String[] args) {
		// java.lang.ArithmeticException
		int i = 10;
		int j = 0;
		// int result = i / j;

		// java.lang.ArrayIndexOutOfBoundsException
		int[] nums = { 1, 2, 3 };
		// System.out.println(nums[3]);

		// java.lang.NullPointerException
		String name = null;
		// System.out.println(name.length());

		// java.lang.NumberFormatException
		String strId = "51679445t";
		Long longId = Long.valueOf(strId);
		System.out.println(longId);
	}

}
