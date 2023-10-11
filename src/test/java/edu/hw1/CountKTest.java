package edu.hw1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import static edu.hw1.Main.countK;

public class CountKTest {

	@Test
	void standrtInput(){
		int iters = countK(6621);
		assertThat(iters)
			.isEqualTo(5);
	}
	
	@Test
	void selfInput(){
		int iters = countK(6174);
		assertThat(iters)
			.isEqualTo(0);
	}
}
