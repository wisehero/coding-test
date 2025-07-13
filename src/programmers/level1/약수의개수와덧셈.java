package programmers.level1;

public class 약수의개수와덧셈 {
	public int solution(int left, int right) {
		int answer = 0;
		for (int i = left; i <= right; i++) {
			// i가 제곱수면 약수의 개수는 홀수
			if (Math.sqrt(i) % 1 == 0) {
				answer -= i;
			} else {
				answer += i;
			}
		}
		return answer;
	}
}
