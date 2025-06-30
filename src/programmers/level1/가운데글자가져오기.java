package programmers.level1;

public class 가운데글자가져오기 {

	public static void main(String[] args) {
		System.out.println(solution("abcde"));
		System.out.println(solution("qwer"));
	}

	public static String solution(String s) {
		String answer = "";
		int index = 0;

		if (s.length() % 2 == 0) {
			index = s.length() / 2;
			answer = s.substring(index-1, index + 1);
		} else {
			index = s.length() / 2 + 1;
			answer = s.substring(index - 1, index);
		}

		return answer;
	}
}
