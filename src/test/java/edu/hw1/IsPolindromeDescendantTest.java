package edu.hw1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import static edu.hw1.Main.isPalindromeDescendant;

public class IsPolindromeDescendantTest {
	
	@Test
	void test1(){
		boolean a = isPalindromeDescendant(11211230);
		boolean b = isPalindromeDescendant(23336014);
		
		assertThat(a)
			.isEqualTo(true);
		
		assertThat(b)
			.isEqualTo(true);
	}
	
	@Test
	void test2(){
		boolean a = isPalindromeDescendant(131);

		assertThat(a)
			.isEqualTo(true);

	}
	
	@Test
	void test3(){
		boolean a = isPalindromeDescendant(131423423);

		assertThat(a)
			.isEqualTo(false);

	}
	
	
}
