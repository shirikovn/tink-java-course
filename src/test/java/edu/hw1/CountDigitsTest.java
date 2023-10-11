package edu.hw1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import static edu.hw1.Main.countDigits;

public class CountDigitsTest {
	
	@Test
	void positiveInput() {
		int counter = countDigits(943288888);
		assertThat(counter)
			.isEqualTo(9);
	}
	
	@Test
	void negativeInput() {
		int counter = countDigits(-78430);
		assertThat(counter)
			.isEqualTo(5);
	}
	
	@Test
	void zeroInput() {
		int counter = countDigits(0);
		assertThat(counter)
			.isEqualTo(1);
	}
}
