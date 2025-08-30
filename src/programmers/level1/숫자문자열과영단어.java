package programmers.level1;

import java.util.HashMap;
import java.util.Map;

public class 숫자문자열과영단어 {

	public static void main(String[] args) {
		System.out.println(solution("one4seveneight"));
	}

	public static int solution(String s) {
		StringBuilder answer = new StringBuilder();

		Map<String, String> hashMap = new HashMap<>();
		hashMap.put("zero", "0");
		hashMap.put("one", "1");
		hashMap.put("two", "2");
		hashMap.put("three", "3");
		hashMap.put("four", "4");
		hashMap.put("five", "5");
		hashMap.put("six", "6");
		hashMap.put("seven", "7");
		hashMap.put("eight", "8");
		hashMap.put("nine", "9");

		StringBuilder temp = new StringBuilder();
		for (char c : s.toCharArray()) {
			if (Character.isDigit(c)) {
				answer.append(c);
			} else {
				temp.append(c);
				if (hashMap.containsKey(temp.toString())) {
					answer.append(hashMap.get(temp.toString()));
					temp = new StringBuilder();
				}
			}
		}

		return Integer.parseInt(answer.toString());
	}
}
