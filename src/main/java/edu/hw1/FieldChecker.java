package edu.hw1;

public class FieldChecker {
	public boolean knightBoardCapture(int[][] field) {

		boolean flag = true;

		for (int i = 0; i < 8; ++i) {
			for (int j = 0; j < 8; ++j) {
				if (field[i][j] == 1) {
					int[] moves = { -1, -2, 1, 2 };
					for (int x : moves) {
						for (int y : moves) {
							if (Math.abs(x) != Math.abs(y)) {
								if (i + x >= 0 && i + x < 8 && j + y >= 0 && j + y < 8) {
									if (field[i + x][j + y] == 1) {
										flag = false;
									}
								}
							}
						}
					}
				}
			}
		}

		return flag;
	}

}
