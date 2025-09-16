package programmers.level1;

public class 옹알이 {

	public int solution(String[] babbling) {
		int answer = 0;

		for (String word : babbling) {
			if (word.contains("ayaaya") || word.contains("yeye") ||
				word.contains("woowoo") || word.contains("mama")) {
				continue;
			}

			String temp = word.replace("aya", "*")
				.replace("ye", "*")
				.replace("woo", "*")
				.replace("ma", "*");

			if (temp.replace("*", "").isEmpty()) {
				answer++;
			}
		}
		return answer;
	}
}
