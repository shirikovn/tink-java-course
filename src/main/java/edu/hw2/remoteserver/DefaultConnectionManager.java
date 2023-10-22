package edu.hw2.remoteserver;

import java.util.Random;

public class DefaultConnectionManager implements ConnectionManager {

	@Override
	public Connection getConnection() {
		Random randomizer = new Random();
		if (randomizer.nextBoolean()) {
			return new StableConnection();
		} else {
			return new FaultyConnection();
		}
	}

}
