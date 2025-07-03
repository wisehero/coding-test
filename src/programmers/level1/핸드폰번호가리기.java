package programmers.level1;

public class 핸드폰번호가리기 {

	public static void main(String[] args) {
		System.out.println(solution("01033334444"));
	}

	public static String solution(String phone_number) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < phone_number.length(); i++) {

			if (i < phone_number.length() - 4) {
				sb.append("*");
			} else {
				sb.append(phone_number.charAt(i));
			}
		}
		return sb.toString();
	}
}
