package edu.project1;


public class Session {
	private final String answer;
	private final int maxAttempts;
	private int attempts;
	
	private boolean guessed;
	
	
	public Session(String word, int attempts) {
		this.answer = word;
		this.maxAttempts = attempts;
		this.attempts = 0;
		this.guessed = false;
	}
	
	boolean guess(char guess) {
		attempts += 1;
		if(answer.contains(String.valueOf(guess))) {
			return true;
		} else {
			return false;
		}
	}
	
	public int getMaxAttempts() {
		return maxAttempts;
	}
	
	public int getAttempts() {
		return attempts;
	}
}
