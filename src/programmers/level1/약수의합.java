package programmers.level1;

public class 약수의합 {

	public static void main(String[] args) {
		System.out.println(solution(12));  // Output: 28
		System.out.println(solution(5));   // Output: 6
	}

	public static int solution(int n) {
		int answer = n;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				answer += i;
			}
		}

		return answer;
	}
}
