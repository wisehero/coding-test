package programmers.level1;

import java.util.Arrays;

public class 자연수뒤집어배열로만들기 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(12345)));
	}

	public static int[] solution(long n) {
		String str = String.valueOf(n);

		int[] answer = new int[str.length()];

		for (int i = 0; i < str.length(); i++) {
			answer[i] = str.charAt(str.length() - 1 - i) - '0';
		}
		return answer;
	}
}
