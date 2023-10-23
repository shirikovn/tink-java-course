package edu.hw1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IsPolindromeDescendantTest {

	PalindromeUtils utils = new PalindromeUtils();

	@DisplayName("Long true input")
	@Test
	void test1() {
		boolean a = utils.isPalindromeDescendant(11211230);
		boolean b = utils.isPalindromeDescendant(23336014);

		assertThat(a).isEqualTo(true);

		assertThat(b).isEqualTo(true);
	}

	@DisplayName("3-char true input")
	@Test
	void test2() {
		boolean a = utils.isPalindromeDescendant(131);

		assertThat(a).isEqualTo(true);

	}

	@DisplayName("Regular false input")
	@Test
	void test3() {
		boolean a = utils.isPalindromeDescendant(131423423);

		assertThat(a).isEqualTo(false);

	}

}
