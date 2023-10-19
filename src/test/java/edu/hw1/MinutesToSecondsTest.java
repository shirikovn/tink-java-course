package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MinutesToSecondsTest {
    
	MinutesToSecondsConverter minutesToSecondsConverter = new MinutesToSecondsConverter();
	
	@DisplayName("correct input format")
    @Test
    void correctInput() {
    	int secs = minutesToSecondsConverter.minutesToSeconds("98:43");
    	assertThat(secs)
    		.isEqualTo(5923);
    }
	
	@DisplayName("incorrect input format")
	@Test
	void incorrectInput() {
		int secs = minutesToSecondsConverter.minutesToSeconds("43:60");
		assertThat(secs)
			.isEqualTo(-1);
	}
    
}
