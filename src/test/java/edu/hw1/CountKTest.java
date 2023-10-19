package edu.hw1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CountKTest {
	
	KCounter kCounter = new KCounter();
	
	@DisplayName("input 6621")
	@Test
	void standrtInput(){
		int iters = kCounter.countK(6621);
		assertThat(iters)
			.isEqualTo(5);
	}
	
	@DisplayName("input k number")
	@Test
	void selfInput(){
		int iters = kCounter.countK(6174);
		assertThat(iters)
			.isEqualTo(0);
	}
}
