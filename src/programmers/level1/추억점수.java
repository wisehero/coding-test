package programmers.level1;

import java.util.*;

public class 추억점수 {
	public int[] solution(String[] name, int[] yearning, String[][] photo) {
		int[] answer = new int[photo.length];

		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < yearning.length; i++) {
			map.put(name[i], yearning[i]);
		}

		for (int i = 0; i < photo.length; i++) {
			int score = 0;
			for (String pp : photo[i]) {
				if (map.containsKey(pp)) {
					score += map.get(pp);
				}
			}

			answer[i] = score;
		}

		return answer;
	}
}
