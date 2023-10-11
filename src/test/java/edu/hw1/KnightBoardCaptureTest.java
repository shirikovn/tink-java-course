package edu.hw1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import static edu.hw1.Main.knightBoardCapture;

public class KnightBoardCaptureTest {
	
	@Test
	void rightTest() {
		boolean a = knightBoardCapture(
				new int[][] {
					{0, 0, 0, 1, 0, 0, 0, 0},
					{0, 0, 0, 0, 0, 0, 0, 0},
					{0, 1, 0, 0, 0, 1, 0, 0},
					{0, 0, 0, 0, 1, 0, 1, 0},
					{0, 1, 0, 0, 0, 1, 0, 0},
					{0, 0, 0, 0, 0, 0, 0, 0},
					{0, 1, 0, 0, 0, 0, 0, 1},
					{0, 0, 0, 0, 1, 0, 0, 0}
					}
				
			);
		
		assertThat(a)
			.isEqualTo(true);
	}
	
	@Test
	void wrongTest() {
		boolean a = knightBoardCapture(
				new int[][] {
					{1, 0, 1, 0, 1, 0, 1, 0},
					{0, 1, 0, 1, 0, 1, 0, 1},
					{0, 0, 0, 0, 1, 0, 1, 0},
					{0, 0, 1, 0, 0, 1, 0, 1},
					{1, 0, 0, 0, 1, 0, 1, 0},
					{0, 0, 0, 0, 0, 1, 0, 1},
					{1, 0, 0, 0, 1, 0, 1, 0},
					{0, 0, 0, 1, 0, 1, 0, 1}
					}
				
			);
		
		assertThat(a)
			.isEqualTo(false);
	}
	
}
