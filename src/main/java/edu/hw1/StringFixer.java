package edu.hw1;

import java.util.ArrayList;
import java.util.List;

public class StringFixer {
	public String fixString(String stringToFix) {

		List<Character> fixedString = new ArrayList<>(stringToFix.length());

		for (int i = 0; i < stringToFix.length(); ++i) {
			if (i % 2 == 0) {
				fixedString.addLast(stringToFix.charAt(i));
			} else {
				fixedString.add(i - 1, stringToFix.charAt(i));
			}
		}

		StringBuilder sBuilder = new StringBuilder();

		for (Character i : fixedString) {
			sBuilder.append(i);
		}

		return sBuilder.toString();
	}
}
