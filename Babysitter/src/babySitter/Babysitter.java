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
}
