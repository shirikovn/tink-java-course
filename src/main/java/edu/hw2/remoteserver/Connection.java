package edu.hw2.remoteserver;

public interface Connection extends AutoCloseable {
	void execute(String command) throws ConnectionException;
}
