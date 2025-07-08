package programmers.level1;

import java.util.Arrays;

public class 예산 {
	public int solution(int[] d, int budget) {
		int answer = 0;

		Arrays.sort(d);
		for(int a : d) {
			if (budget - a >= 0){
				budget -= a;
				answer++;
			} else {
				break;
			}
		}
		return answer;
	}
}
