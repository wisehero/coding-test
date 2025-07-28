package programmers.level1;

public class 이상한문자만들기 {

	public String solution(String s) {
		StringBuilder answer = new StringBuilder();

		String[] sarr = s.split(" ", -1);

		for (int i = 0; i < sarr.length; i++) {
			for (int j = 0; j < sarr[i].length(); j++) {
				char c = sarr[i].charAt(j);
				if (j % 2 == 0) {
					answer.append(Character.toUpperCase(c));
				} else {
					answer.append(Character.toLowerCase(c));
				}
			}

			if (i < sarr.length - 1) {
				answer.append(" ");
			}
		}

		return answer.toString();
	}

	public String solutionV2(String s) {

		StringBuilder answer = new StringBuilder();
		int cnt = 0;
		String[] array = s.split("");

		for(String ss : array) {
			cnt = ss.contains(" ") ? 0 : cnt + 1;
			answer.append(cnt % 2 == 0 ? ss.toLowerCase() : ss.toUpperCase());
		}
		return answer.toString();
	}
}
