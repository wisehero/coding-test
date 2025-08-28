package hackerrank;

public class TimeConversion {

	public static void main(String[] args) {
		String s = "02:01:00AM";

		String result = timeConversion(s);
		System.out.println(result);
	}

	public static String timeConversion(String s) {
		String period = s.substring(8, 10);
		int hour = Integer.parseInt(s.substring(0, 2));
		String rest = s.substring(2, 8);

		if (period.equals(("PM"))) {
			if (hour != 12) {
				hour += 12;
			}
			return String.format("%02d", hour) + rest;
		} else { // AM
			if (hour == 12) {
				hour = 0;
			}
			return String.format("%02d", hour) + rest;
		}
	}
}
