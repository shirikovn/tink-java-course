package edu.hw2.remoteserver;

public final class PopularCommandExecutor {
	private final ConnectionManager manager = new DefaultConnectionManager();
	private final int maxAttempts = 10;

	public void updatePackages() {
		tryExecute("apt update && apt upgrade -y");
	}

	void tryExecute(String command) throws ConnectionException {
		Connection connection = manager.getConnection();
		boolean successfully = false;

		for (int attemptNumber = 0; attemptNumber < maxAttempts; attemptNumber += 1) {
			try {
				connection.execute(command);
				successfully = true;
				break;
			} catch (ConnectionException e) {
				// handle exception
			}
		}
		
		try {
			connection.close();
		} catch (Exception e) {
			// handle exception
		}

		if (!successfully) {
			throw new ConnectionException();
		}
	}
}
