package babySitter;

public class Babysitter {
	private int start;
	private int bed;
	private int end;
	private static final int PAY_BEFORE_BEDTIME = 12;
	private static final int PAY_FROM_BEDTIME_TILL_MIDNIGHT = 8;
	private static final int PAY_AFTER_MIDNIGHT = 16;

	public Babysitter(int startTime, int endTime, int bedTime) {
		start = startTime;
		end = endTime;
		bed = bedTime;
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
			}

			totalWage += hourlyWage;
			hourlyWage = 0;
		}
		return totalWage;
	}

	private boolean isBeforeBedtime(int hour) {
		return hour < bed;
	}
}
