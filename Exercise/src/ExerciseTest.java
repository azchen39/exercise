import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExerciseTest {

	@Test
	void testLongest() {
		assertEquals("Andrew", Exercise.longest("Hello, my name is Andrew!"));
		
		assertEquals("punctuations", Exercise.longest("This will test if $??surprise!! punctuations will cause >:^]problems%."));
		
		assertEquals("", Exercise.longest(""));
		
		assertEquals("", Exercise.longest("%^&*$$!!!"));
		
		assertEquals("problem", Exercise.longest("I wonder if a double  space will cause a problem"));
		
		assertEquals("spaces", Exercise.longest("Maybe if it ends  in some   spaces  "));
		
		assertEquals("first", Exercise.longest("Ties goes to the first of the long words"));
		
		assertEquals("there", Exercise.longest("Even if there are many words that would win"));
	}

}
