package edu.hw1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RotateTest {

	Rotater rotater = new Rotater();

	@DisplayName("How does rotating right works with regular input")
	@Test
	void testRightRotate() {
		int a = rotater.rotateRight(8, 1);

		assertThat(a).isEqualTo(4);
	}

	@DisplayName("How does rotating left works with regular input")
	void testLeftRotate() {
		int a = rotater.rotateLeft(17, 2);

		assertThat(a).isEqualTo(6);
	}

	@DisplayName("How does rotating works with 0 or 1")
	@Test
	void testRotate1() {
		int a = rotater.rotateLeft(0, 34);

		assertThat(a).isEqualTo(0);
	}
}
