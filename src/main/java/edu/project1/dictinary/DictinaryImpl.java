package edu.project1.dictinary;

import org.jetbrains.annotations.NotNull;

public class DictinaryImpl implements Dictionary {

	String[] words = new String[] { "cat", "dog", "apple", "car", "cow" };

	@Override
	public @NotNull String randomWord() {
		int n = (int) Math.floor(Math.random() * words.length);
		return words[n];
	}

}
