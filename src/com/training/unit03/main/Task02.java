package com.training.unit03.main;

import java.util.Random;

public class Task02 {

	public static void main(String[] args) {
		Random rand = new Random();

		int[] array = new int[rand.nextInt(10) + 2];
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt();
		}
		for (int element : array) {
			System.out.print(element + " ");
		}
		System.out.println();
		int min = array[0];
		int max = array[0];
		for (int element : array) {
			if (element < min) {
				min = element;
			} else if (element > max) {
				max = element;
			}

		}
		int lengthS = Math.abs(max - min);
		System.out.println("Наименьшая длина числовой оси равна: " + lengthS);
	}

}
