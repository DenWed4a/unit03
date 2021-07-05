package com.training.unit03.main;

import java.util.Random;

public class Task03 {

	public static void main(String[] args) {
		Random rand = new Random();
		int n = rand.nextInt(20);
		int negative = 0;
		int positive = 0;
		int zero = 0;
		int coin;
		double[] array = new double[n];

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextDouble();
			//подбросим монетку на отрицательное или положительное число
			if ((coin = rand.nextInt(2)) == 0) {
				array[i] = array[i] * (-1);
			}
			if (array[i] > 0) {
				positive++;
			} else if (array[i] < 0) {
				negative++;
			} else if (array[i] == 0) {
				zero++;
			}
		}
		System.out.println("Положительных элементов: " + positive + "\n" + "Отрицательных элементов: " + negative + "\n"
				+ "Нулевых элементов: " + zero);

	}

}
