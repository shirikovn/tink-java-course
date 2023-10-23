package edu.project1;

import edu.project1.dictinary.DictinaryImpl;
import edu.project1.dictinary.Dictionary;

public class ConsoleHangman {
	private final int ATTEMPTS = 10;
	
	private final Session session;
	
	public ConsoleHangman() {
		Dictionary dictionary = new DictinaryImpl();
		this.session = new Session(dictionary.randomWord(), ATTEMPTS);
	}
	
	public void run() {
		while(true) {
			if(session.getAttempts() == session.getMaxAttempts()) {
				break;
			}
		}
	}
	
	
}
