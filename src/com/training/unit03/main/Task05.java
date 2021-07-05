package com.training.unit03.main;



public class Task05 {

	public static void main(String[] args) {
		int[] array = { 11, 2, 90, 13, 1, 2, 5 };
		
		for (int i = 0; i < array.length; i++) {
			int current = array[i];
			int j = i;
			
			while (j > 0 && array[j - 1] > current) {
				array[j] = array[j - 1];
				j--;
			}
			array[j] = current;
		}
		for (int element : array) {
			System.out.print(element + " ");
		}

	}
}
