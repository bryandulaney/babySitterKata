package babySitter;

public class Babysitter {
	private int start;
	private int bed;
	private int end;
	private static final int PAY_BEFORE_BEDTIME = 12;
	private static final int PAY_FROM_BEDTIME_TIL_MIDNIGHT = 8;
	private static final int PAY_AFTER_MIDNIGHT = 16;


	public Babysitter(int start, int end, int bed) {
		this.start = start;
		this.end = end;
		this.bed = bed;
	}

	public boolean eligibleStartTime(int i) {
		start = i;
		if (start >= 5) {
			return true;
		} else {
			return false;
		}
	}

	public boolean eligibleEndTime(int i) {
		end = i;
		if (end <= 16) {
			return true;
		} else {
			return false;
		}
	}

	public int calcPay() {
		int hourlyWage = 0;
		int totalWage = 0;

		for (int currentTime = start; currentTime < end; currentTime++) {
			if (isBeforeBedtime(currentTime)) {
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

	private boolean isBeforeBedtime(int hour) {
		return hour < bed;
	}

	private boolean isAfterBedtimeButBeforeMidnight(int hour) {
		return hour >= bed && hour < 12;
	}

}
