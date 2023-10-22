package edu.hw2.remoteserver;

public class FaultyConnectionManager implements ConnectionManager {

	@Override
	public Connection getConnection() {
		return new FaultyConnection();
	}

}
