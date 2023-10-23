package edu.hw1;

import org.apache.logging.log4j.Logger;

public class Welcomer {

	private Logger logger;

	public Welcomer(Logger logger) {
		this.logger = logger;
	}

	public void helloWorld() {
		logger.info("Hello world!");
	}
}
