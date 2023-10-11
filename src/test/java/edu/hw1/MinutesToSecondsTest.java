package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static edu.hw1.Main.minutesToSeconds;

public class MinutesToSecondsTest {
    
	@DisplayName("correct input format")
    @Test
    void correctInput() {
    	int secs = minutesToSeconds("98:43");
    	assertThat(secs)
    		.isEqualTo(5923);
    }
	
	@DisplayName("incorrect input format")
	@Test
	void incorrectInput() {
		int secs = minutesToSeconds("43:60");
		assertThat(secs)
			.isEqualTo(-1);
	}
    
}
