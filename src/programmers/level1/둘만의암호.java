package programmers.level1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class 둘만의암호 {

	public String solution(String s, String skip, int index) {

		StringBuilder answer = new StringBuilder();

		Set<Character> skipChars = new HashSet<>();
		for (char c : skip.toCharArray()) {
			skipChars.add(c);
		}

		List<Character> availableChars = new ArrayList<>();
		for (char c = 'a'; c <= 'z'; c++) {
			if (!skipChars.contains(c)) {
				availableChars.add(c);
			}
		}

		Map<Character, Integer> charToIndex = new HashMap<>();
		for (int i = 0; i < availableChars.size(); i++) {
			charToIndex.put(availableChars.get(i), i);
		}

		int totalChars = availableChars.size();

		for (char c : s.toCharArray()) {
			int currentIndex = charToIndex.get(c);
			int newIndex = (currentIndex + index) % totalChars;
			answer.append(availableChars.get(newIndex));
		}

		return answer.toString();
	}
}
