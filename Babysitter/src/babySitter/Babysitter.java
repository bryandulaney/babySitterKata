package babySitter;

public class Babysitter {
	private int start;
	private int bed;
	private int end;
	private static final int INELIGIBLE_SHIFT_PAY = 0;
	private static final int PAY_BEFORE_BEDTIME = 12;
	private static final int PAY_FROM_BEDTIME_TIL_MIDNIGHT = 8;
	private static final int PAY_AFTER_MIDNIGHT = 16;

	public Babysitter(int start, int end, int bed) {
		this.start = start;
		this.end = end;
		this.bed = bed;
	}

	public int calcPay() {
		int hourlyWage = 0;
		int totalWage = 0;

		for (int currentTime = start; currentTime < end; currentTime++) {
			if (isNotEligibleSittingHour(currentTime)) {
				hourlyWage = INELIGIBLE_SHIFT_PAY;
			} else if (isBeforeBedtimeButBeforeMidnight(currentTime)) {
				hourlyWage = PAY_BEFORE_BEDTIME;
			} else if (isAfterBedtimeButBeforeMidnight(currentTime)) {
				hourlyWage = PAY_FROM_BEDTIME_TIL_MIDNIGHT;
			} else {
				hourlyWage = PAY_AFTER_MIDNIGHT;
			}

			totalWage += hourlyWage;
			hourlyWage = 0;
		}
		return totalWage;
	}

	private boolean isNotEligibleSittingHour(int hour) {
		return hour < 5 || hour >= 16;
	}

	private boolean isBeforeBedtimeButBeforeMidnight(int hour) {
		return hour < bed && hour < 12;
	}

	private boolean isAfterBedtimeButBeforeMidnight(int hour) {
		return hour >= bed && hour < 12;
	}

}
