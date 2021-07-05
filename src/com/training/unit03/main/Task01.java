package com.training.unit03.main;

import java.util.Random;

public class Task01 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int count = 0;
		int[] array = new int[rand.nextInt(10)];
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt();
			if (array[i] % 2 == 0)
				count++;
		}
		int j = 0;
		int[] evenNumbers = new int[count];
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				evenNumbers[j] = array[i];
				j++;
			}
		}
		if (count == 0) {
			System.out.println("В последовательности нет четных чисел");
		}

	}

}
