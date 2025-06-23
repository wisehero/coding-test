package programmers.level1;

public class 자릿수더하기 {

	public static void main(String[] args) {
		System.out.println(solutionV2(123));
	}

	public static int solution(int n) {
		int answer = 0;

		String answerStr = String.valueOf(n);

		for (int i = 0; i < answerStr.length(); i++) {
			answer += answerStr.charAt(i) - '0';
		}

		return answer;
	}

	public static int solutionV2(int n) {
		int answer = 0;

		while (true) {
			answer += n % 10;

			if (n < 10) {
				break;
			}

			n /= 10;
		}

		return answer;
	}
}
