package com.training.unit03.main;

import java.util.Random;

public class Task04 {

	public static void main(String[] args) {

		Random rand = new Random();
		int[] array = new int[20];

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(100);
		}

		int temp;
		boolean needIteration = true;
		while (needIteration) {
			needIteration = false;

			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] < array[i + 1]) {
					temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					needIteration = true;
				}

			}

		}

	}

}
