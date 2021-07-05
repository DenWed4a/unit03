package com.training.unit03.main;

public class Task10 {

	public static void main(String[] args) {
		int n = 8;
		int[][] arrays = new int[n][n];

		for (int i = 0; i < n; i = i+n-1) {
			for (int j = 0; j < arrays.length; j++) {
				arrays[i][j] = 1;
			}
		}
		
		for(int j = 0; j<n; j = j+n-1) {
			for(int i = 0; i<arrays.length; i++) {
				arrays[i][j] = 1;
			}
		}
		
		for(int i = 0; i<arrays.length; i++) {
			for(int j = 0; j<arrays.length; j++) {
				System.out.printf("%4d",arrays[i][j]);
			}System.out.println();
		}

	}

}
