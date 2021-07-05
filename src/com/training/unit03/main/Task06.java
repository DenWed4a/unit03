package com.training.unit03.main;

public class Task06 {

	public static void main(String[] args) {
		int n = 5;
		int m = 6;
		int count = 0;
		int[][] arrays = new int[5][6];
		for (int i = 0; i < arrays.length; i++) {
			for (int j = 0; j < arrays[i].length; j++) {
				if (arrays[i][j] == 7) {
					count++;
				}
			}
		}

	}

}
