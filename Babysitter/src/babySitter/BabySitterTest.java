package babySitter;

import static org.junit.Assert.*;

import org.junit.Test;

public class BabySitterTest {

	@Test
	public void shouldNotStartBefore5PM() {
		Babysitter sitter = new Babysitter(2, 5, 8);
		assertEquals(0, sitter.calcPay());
	}

	@Test
	public void shouldNotEndAfter4AM() {
		Babysitter sitter = new Babysitter(16, 17, 8);
		assertEquals(0, sitter.calcPay());
	}

	@Test
	public void shouldMake12DollarsPerHourBeforeBedtime() {
		Babysitter sitter = new Babysitter(6, 8, 8);
		assertEquals(24, sitter.calcPay());
	}

	@Test
	public void shouldMake8DollarsPerHourFromBedtimeTilMidnight() {
		Babysitter sitter = new Babysitter(8, 10, 8);
		assertEquals(16, sitter.calcPay());
	}

	@Test
	public void shouldMake16DollarsPerHourFromMidnightTilEndOfShift() {
		Babysitter sitter = new Babysitter(12, 14, 8);
		assertEquals(32, sitter.calcPay());
	}

	@Test
	public void shouldBePaidCorrectlyAtEndOfShift() {
		Babysitter sitter = new Babysitter(5, 16, 8);
		assertEquals(132, sitter.calcPay());
	}

	@Test
	public void bedtimeIsStartTime() {
		Babysitter sitter = new Babysitter(5, 16, 5);
		assertEquals(120, sitter.calcPay());
	}

	@Test
	public void bedtimeIsEndTime() {
		Babysitter sitter = new Babysitter(5, 16, 16);
		assertEquals(148, sitter.calcPay());
	}

}
