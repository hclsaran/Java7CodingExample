package com.usk.training.day4;

public class TwoDArrayEx {

	public static void main(String[] args) {
		int matrixA[][] = { { 1, 2, 3 }, { 2, 3, 4, 5 }, { 6, 7, 8 } };
		for (int i = 0; i < matrixA.length; i++) {
			for (int j = 0; j < matrixA[i].length; j++) {
				System.out.print(matrixA[i][j] + " ");
			}
			System.out.println();
		}
	}
}