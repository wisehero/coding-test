package programmers.level1;

import java.util.*;

public class 과일장수 {

	public int solution(int k, int m, int[] score) {
		int answer = 0;
		List<Integer> list = new ArrayList<>();

		for (int i : score) {
			list.add(i);
		}

		Collections.sort(list, Collections.reverseOrder());

		int start = 0;
		int end = m;

		while (end <= score.length) {
			List<Integer> subList = list.subList(start, end);
			answer += subList.get(m - 1) * m;

			start += m;
			end += m;
		}

		return answer;
	}
}
