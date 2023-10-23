package edu.hw1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FixStringTest {

	StringFixer fixer = new StringFixer();

	@DisplayName("input: hTsii  s aimex dpus rtni.g")
	@Test
	void defualtInput() {
		String res = fixer.fixString("hTsii  s aimex dpus rtni.g");
		assertThat(res).isEqualTo("This is a mixed up string.");
	}

	@DisplayName("input: 214365")
	@Test
	void numbersInput() {
		String res = fixer.fixString("214365");
		assertThat(res).isEqualTo("123456");
	}
}
