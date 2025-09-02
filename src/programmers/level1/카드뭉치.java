package programmers.level1;

public class 카드뭉치 {
	public String solution(String[] cards1, String[] cards2, String[] goal) {
		String answer = "";

		int idx1 = 0;
		int idx2 = 0;

		for (String s : goal) {
			if (s.equals(cards1[Math.min(idx1, cards1.length)])) {
				idx1++;
				continue;
			}
			if (s.equals(cards2[Math.min(idx2, cards2.length)])) {
				idx2++;
				continue;
			}
		}
		answer = idx1 + idx2 == goal.length ? "Yes" : "No";
		return answer;
	}
}
