import static org.junit.Assert.*;

import org.junit.Test;


public class ManagementWindow {

	@Test
	public void test() {
		Double expectedAnswer = Double.valueOf(12);
	    Double actualAnswer = Double.valueOf(2*6);
	    assertEquals(expectedAnswer, actualAnswer);
	}

}
