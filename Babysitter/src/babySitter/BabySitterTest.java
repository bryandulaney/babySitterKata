package babySitter;

import static org.junit.Assert.*;

import org.junit.Test;

public class BabySitterTest {

	
	@Test
	public void shouldNotStartBefore5PM() {
		Babysitter sitter = new Babysitter(2,0,0);
		assertEquals(false, sitter.eligibleStartTime(2));
		assertEquals(true, sitter.eligibleStartTime(5));
	}
	
	@Test
	public void shouldNotEndAfter4AM() {
		Babysitter sitter = new Babysitter(0,17,0);
		assertEquals(false, sitter.eligibleEndTime(17));
		assertEquals(true, sitter.eligibleEndTime(16));
	}

}
