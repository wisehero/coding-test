package programmers.level1;

public class 짝수와홀수 {
	public static void main(String[] args) {

	}

	public static String solution(int num) {
		String answer = "";

		answer = num % 2 == 0 ? "Even" : "Odd";
		return answer;
	}

}
