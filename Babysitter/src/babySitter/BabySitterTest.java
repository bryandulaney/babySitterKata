package babySitter;

import static org.junit.Assert.*;

import org.junit.Test;

public class BabySitterTest {

	private static final int BEDTIME = 8;

	@Test
	public void shouldNotStartBefore5PM() {
		Babysitter sitter = new Babysitter(2, 5, BEDTIME);
		assertEquals(0, sitter.calcPay());
	}

	@Test
	public void shouldNotEndAfter4AM() {
		Babysitter sitter = new Babysitter(16, 18, BEDTIME);
		assertEquals(0, sitter.calcPay());
	}

	@Test
	public void shouldMake12DollarsPerHourBeforeBedtime() {
		Babysitter sitter = new Babysitter(6, 8, BEDTIME);
		assertEquals(24, sitter.calcPay());
	}

	@Test
	public void shouldMake8DollarsPerHourFromBedtimeTilMidnight() {
		Babysitter sitter = new Babysitter(8, 10, BEDTIME);
		assertEquals(16, sitter.calcPay());
	}

	@Test
	public void shouldMake16DollarsPerHourFromMidnightTilEndOfShift() {
		Babysitter sitter = new Babysitter(12, 14, BEDTIME);
		assertEquals(32, sitter.calcPay());
	}

	@Test
	public void shouldBePaidCorrectlyAtEndOfShift() {
		Babysitter sitter = new Babysitter(5, 16, BEDTIME);
		assertEquals(132, sitter.calcPay());
	}

	@Test
	public void bedtimeIsStartTime() {
		Babysitter sitter = new Babysitter(BEDTIME, 16, BEDTIME);
		assertEquals(96, sitter.calcPay());
	}

}
