package edu.hw1;

public class Rotater {
	public int rotateRight(int n, int shift) {
		String st = Integer.toBinaryString(n);

		if (st.length() == 1) {
			return n;
		}

		for (int i = 0; i < shift; ++i) {
			st = st.charAt(st.length() - 1) + st.substring(0, st.length() - 1);
		}

		return Integer.parseInt(st, 2);
	}

	public int rotateLeft(int n, int shift) {
		String st = Integer.toBinaryString(n);

		if (st.length() == 1) {
			return n;
		}

		for (int i = 0; i < shift; ++i) {
			st = st.substring(1, st.length()) + st.charAt(0);
		}

		return Integer.parseInt(st, 2);
	}
}
