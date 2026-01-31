package programmers.level1;

import java.util.*;

public class 완주하지못한선수 {
	public String solution(String[] participant, String[] completion) {
		Map<String, Integer> map = new HashMap<>();
		String answer = "";

		for (String s : participant) {
			map.put(s, map.getOrDefault(s, 0) + 1);
		}

		for (String s : completion) {
			if (map.containsKey(s)) {
				map.put(s, map.get(s) - 1);
			}
			answer = s;
		}

		List<String> keys = new ArrayList<>(map.keySet());


		return answer;
	}
}
