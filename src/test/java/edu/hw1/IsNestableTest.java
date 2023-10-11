package edu.hw1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import static edu.hw1.Main.isNestable;

public class IsNestableTest {
	
	@Test
	void first() {
		boolean b = isNestable(new Integer[] {1, 2, 3, 4}, new Integer[] {0, 6});
		
		assertThat(b)
			.isEqualTo(true);
	}
	
	@Test
	void second() {
		boolean b = isNestable(new Integer[] {1, 2, 3, 4}, new Integer[] {2,3});
		
		assertThat(b)
			.isEqualTo(false);
	}
	
	@Test
	void voidFirst() {
		boolean b = isNestable(new Integer[] {}, new Integer[] {2,3});
		
		assertThat(b)
			.isEqualTo(true);
	}
	
	@Test
	void voidSecond() {
		boolean b = isNestable(new Integer[] {1, 2, 3, 4}, new Integer[] {});
		
		assertThat(b)
			.isEqualTo(false);
	}
	
	
}
