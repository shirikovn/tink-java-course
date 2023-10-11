package edu.hw1;

import static edu.hw1.Main.fixString;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class FixStringTest {
	
	@Test
	void defualtInput() {
		String res = fixString("hTsii  s aimex dpus rtni.g");
		assertThat(res)
			.isEqualTo("This is a mixed up string.");
	}
	
	@Test
	void numbersInput() {
		String res = fixString("214365");
		assertThat(res)
			.isEqualTo("123456");
	}
}
