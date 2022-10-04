package com.usk.training.day2;

public class SwitchEx {

	public static void main(String[] args) {
		int number = Integer.parseInt(args[0]);
		int number2 = 1;
		switch (number) {
		case 0:
			System.out.println("Zore");
			break;
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("two");
			break;
		default:
			System.out.println("Not found");
		}
	}

}
