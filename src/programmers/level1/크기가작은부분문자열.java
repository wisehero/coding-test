package programmers.level1;

public class 크기가작은부분문자열 {

	public int solution(String t, String p) {
		int count = 0;
		int len = p.length();
		long target = Long.parseLong(p); // p가 길 수도 있으므로 long 사용

		for (int i = 0; i <= t.length() - len; i++) {
			String sub = t.substring(i, i + len);
			long value = Long.parseLong(sub);
			if (value <= target) {
				count++;
			}
		}

		return count;
	}
}
