package programmers.level1;

public class 소수찾기 {

	public int solution(int n) {
		int answer = 0;

		for (int i = 1; i <= n; i++) {
			if (isPrime(i)) {
				answer++;
			}
		}
		return answer;
	}

	public boolean isPrime(int number) {
		if (number < 2) {
			return false;
		}

		for (int i = 2; i < Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
