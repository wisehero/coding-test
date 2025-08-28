package programmers.level1;

public class 시저암호 {

	public String solution(String s, int n) {
		String answer = "";
		String alphaUpper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String alphaLower = "abcdefghijklmnopqrstuvwxyz";

		for (int i = 0; i < s.length(); i++) {
			if (Character.isUpperCase(s.charAt(i))) {
				int index = alphaUpper.indexOf(s.charAt(i));
				int newIndex = (index + n) % 26;
				answer += alphaUpper.charAt(newIndex);
			}

			if (Character.isLowerCase(s.charAt(i))) {
				int index = alphaLower.indexOf(s.charAt(i));
				int newIndex = (index + n) % 26;
				answer += alphaLower.charAt(newIndex);
			}

			if (s.charAt(i) == ' ') {
				answer += " ";
			}
		}
		return answer;
	}

}
