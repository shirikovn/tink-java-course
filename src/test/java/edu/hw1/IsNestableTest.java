package edu.hw1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IsNestableTest {

	NestableChecker nestableChecker = new NestableChecker();

	@DisplayName("true input")
	@Test
	void first() {
		boolean b = nestableChecker.isNestable(new Integer[] { 1, 2, 3, 4 }, new Integer[] { 0, 6 });

		assertThat(b).isEqualTo(true);
	}

	@DisplayName("false input")
	@Test
	void second() {
		boolean b = nestableChecker.isNestable(new Integer[] { 1, 2, 3, 4 }, new Integer[] { 2, 3 });

		assertThat(b).isEqualTo(false);
	}

	@DisplayName("void first")
	@Test
	void voidFirst() {
		boolean b = nestableChecker.isNestable(new Integer[] {}, new Integer[] { 2, 3 });

		assertThat(b).isEqualTo(true);
	}

	@DisplayName("void second")
	@Test
	void voidSecond() {
		boolean b = nestableChecker.isNestable(new Integer[] { 1, 2, 3, 4 }, new Integer[] {});

		assertThat(b).isEqualTo(false);
	}

}
