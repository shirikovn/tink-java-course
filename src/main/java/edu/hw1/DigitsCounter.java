package edu.hw1;

public class DigitsCounter {

	public int countDigits(int input) {

		input = Math.abs(input);
		int digits = 0;

		if (input == 0)
			return 1;

		while (input > 0) {
			input /= 10;
			digits += 1;
		}

		return digits;
	}

}
