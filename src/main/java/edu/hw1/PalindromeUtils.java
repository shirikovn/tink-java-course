package edu.hw1;

public class PalindromeUtils {

	private DigitsCounter digitsCounter = new DigitsCounter();

	public boolean isPalindromeDescendant(int input) {

		if (digitsCounter.countDigits(input) % 2 == 1) {
			if (isPolindrome(input)) {
				return true;
			}
			return false;
		}

		while (input > 9) {
			if (isPolindrome(input)) {
				return true;
			}

			if (digitsCounter.countDigits(input) % 2 == 1) {
				return false;
			}

			input = childPolindrom(input);
		}

		return false;

	}

	private boolean isPolindrome(Integer input) {
		String st = input.toString();
		boolean flag = true;
		for (int i = 0; i < (st.length() / 2); ++i) {
			if (st.charAt(i) != st.charAt(st.length() - i - 1)) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	private int childPolindrom(int input) {
		int ans = 0;
		for (int i = 0; i < digitsCounter.countDigits(input) / 2; ++i) {
			ans += (input % 10) * Math.pow(10, i);
			input /= 10;
			ans += input % 10 * Math.pow(10, i);
			input /= 10;
		}

		return ans;
	}

}
