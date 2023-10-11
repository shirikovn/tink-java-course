package edu.hw1;


import static edu.hw1.Main.rotateLeft;
import static edu.hw1.Main.rotateRight;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RotateTest {
	
	@Test
	void testRightRotate() {
		int a = rotateRight(8, 1);
		
		assertThat(a)
			.isEqualTo(4);
	}
	
	@Test
	void testLeftRotate() {
		int a = rotateLeft(17, 2);
		
		assertThat(a)
			.isEqualTo(6);
	}
	
	@DisplayName("How does rotating works with 0 or 1")
	@Test
	void testRotate1() {
		int a = rotateLeft(0, 34);
		
		assertThat(a)
			.isEqualTo(0);
	}
}
