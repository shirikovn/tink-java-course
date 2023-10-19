package edu.hw1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class KnightBoardCaptureTest {

	FieldChecker checker = new FieldChecker();

	@DisplayName("True input")
	@Test
	void rightTest() {
		boolean a = checker.knightBoardCapture(new int[][] { { 0, 0, 0, 1, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 1, 0, 0, 0, 1, 0, 0 }, { 0, 0, 0, 0, 1, 0, 1, 0 }, { 0, 1, 0, 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 1, 0, 0, 0, 0, 0, 1 }, { 0, 0, 0, 0, 1, 0, 0, 0 } }

		);

		assertThat(a).isEqualTo(true);
	}

	@DisplayName("false input")
	@Test
	void wrongTest() {
		boolean a = checker.knightBoardCapture(new int[][] { { 1, 0, 1, 0, 1, 0, 1, 0 }, { 0, 1, 0, 1, 0, 1, 0, 1 },
				{ 0, 0, 0, 0, 1, 0, 1, 0 }, { 0, 0, 1, 0, 0, 1, 0, 1 }, { 1, 0, 0, 0, 1, 0, 1, 0 },
				{ 0, 0, 0, 0, 0, 1, 0, 1 }, { 1, 0, 0, 0, 1, 0, 1, 0 }, { 0, 0, 0, 1, 0, 1, 0, 1 } }

		);

		assertThat(a).isEqualTo(false);
	}

}
