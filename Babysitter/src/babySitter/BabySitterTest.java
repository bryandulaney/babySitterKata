package babySitter;

import static org.junit.Assert.*;

import org.junit.Test;

public class BabySitterTest {

	
	@Test
	public void shouldNotStartBefore5Pm() {
		Babysitter sitter = new Babysitter(2,0,0);
		assertEquals(false, sitter.eligibleStartTime(2));
		assertEquals(true, sitter.eligibleStartTime(5));
	}

}
