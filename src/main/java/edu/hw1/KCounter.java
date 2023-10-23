package edu.hw1;

import java.util.Arrays;

public class KCounter {
	public int countK(int input) {
		int[] num = new int[4];
		for (int i = 0; i < 4; ++i) {
			num[4 - 1 - i] = input % 10;
			input /= 10;
		}

		return countK(num, 0);

	}

	private int countK(int[] num, int counter) {

		if (Arrays.equals(num, new int[] { 6, 1, 7, 4 })) {
			return counter;
		}

		counter += 1;

		int[] maxNum = num.clone();
		Arrays.sort(maxNum);

		int maxX = 0;
		int minN = 0;

		for (int i = 0; i < 4; ++i) {
			maxX += maxNum[i] * Math.pow(10, i);
			minN += maxNum[3 - i] * Math.pow(10, i);
		}

		int newN = maxX - minN;

		int[] newNumAns = new int[4];

		for (int i = 0; i < 4; ++i) {
			newNumAns[4 - 1 - i] = newN % 10;
			newN /= 10;
		}

		return countK(newNumAns, counter);
	}

}
