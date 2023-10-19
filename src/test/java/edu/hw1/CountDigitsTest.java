package edu.hw1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CountDigitsTest {

	DigitsCounter dcounter = new DigitsCounter();

	@DisplayName("positive input")
	@Test
	void positiveInput() {
		int counter = dcounter.countDigits(943288888);
		assertThat(counter).isEqualTo(9);

	}

	@DisplayName("negative input")
	@Test
	void negativeInput() {
		int counter = dcounter.countDigits(-78430);
		assertThat(counter).isEqualTo(5);
	}

	@DisplayName("0 input")
	@Test
	void zeroInput() {
		int counter = dcounter.countDigits(0);
		assertThat(counter).isEqualTo(1);
	}
}
