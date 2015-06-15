package babySitter;

import static org.junit.Assert.*;

import org.junit.Test;

public class BabySitterTest {
	
	private static final int BEDTIME = 8;

	@Test
	public void shouldNotStartBefore5PM() {
		Babysitter sitter = new Babysitter(2, 0, BEDTIME);
		assertEquals(false, sitter.eligibleStartTime(2));
		assertEquals(true, sitter.eligibleStartTime(5));
	}

	@Test
	public void shouldNotEndAfter4AM() {
		Babysitter sitter = new Babysitter(0, 17, BEDTIME);
		assertEquals(false, sitter.eligibleEndTime(17));
		assertEquals(true, sitter.eligibleEndTime(16));
	}
	
	@Test
	public void shouldMake12DollarsPerHourBeforeBedtime() {
		Babysitter sitter = new Babysitter(6,8,BEDTIME);
		assertEquals(24, sitter.calcPay());
	}
	
	@Test
	public void shouldMake8DollarsPerHourFromBedtimeTilMidnight() {
		Babysitter sitter = new Babysitter(8, 10, BEDTIME);
		assertEquals(16, sitter.calcPay());
	}

}
