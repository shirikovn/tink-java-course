package edu.hw1;

public class MinutesToSecondsConverter {

	final private int MAXSECONDS = 59;
	final private int MINSECONDS = 0;

	final private int INCORRECTINPUT = -1;

	final private int SECONDINMINUTE = 60;

	final private String DEVIDER = ":";

	public int minutesToSeconds(String input) {
		String[] parts = input.split(DEVIDER);

		if (Integer.parseInt(parts[1]) > MAXSECONDS || Integer.parseInt(parts[1]) < MINSECONDS) {
			return INCORRECTINPUT;
		}

		return Integer.parseInt(parts[1]) + Integer.parseInt(parts[0]) * SECONDINMINUTE;
	}

}
