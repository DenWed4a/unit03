package com.training.unit03.main;

public class Task08 {

	public static void main(String[] args) {
		int k = 4;
		int p = 7;
		int[][] arrays = new int[8][10];
		//выводим столбец
		for (int i = 0; i < arrays.length; i++) {
			System.out.println(arrays[i][p] + " ");
		}
		//выводим строку
		for (int i = 0; i < arrays[k].length; i++) {
			System.out.print(arrays[k][i]+" ");
		}		

	}

}
