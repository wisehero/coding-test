package programmers.level2;

public class JadenCase {

	public String solution(String s) {
		boolean isFirst = true;
		StringBuilder answer = new StringBuilder();
		for (char c : s.toCharArray()) {
			if (c == ' ') {
				answer.append(c);
				isFirst = true;
			} else {
				if (isFirst) {
					answer.append(Character.toUpperCase(c));
					isFirst = false;
				} else {
					answer.append(Character.toLowerCase(c));
				}
			}
		}
		return answer.toString();
	}

}
