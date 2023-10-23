package edu.hw1;

public class NestableChecker {

	public boolean isNestable(Integer[] first, Integer[] second) {

		Integer maxFirst = Integer.MIN_VALUE;
		Integer minFirst = Integer.MAX_VALUE;

		Integer maxSecond = Integer.MIN_VALUE;
		Integer minSecond = Integer.MAX_VALUE;

		for (int i = 0; i < first.length; ++i) {
			maxFirst = Math.max(maxFirst, first[i]);
			minFirst = Math.min(minFirst, first[i]);
		}

		for (int i = 0; i < second.length; ++i) {
			maxSecond = Math.max(maxSecond, second[i]);
			minSecond = Math.min(minSecond, second[i]);
		}

		if (first.length == 0) {
			return true;
		}

		if (second.length == 0) {
			return false;
		}

		if (maxSecond > maxFirst && minSecond < minFirst) {
			return true;
		} else {
			return false;
		}

	}

}
