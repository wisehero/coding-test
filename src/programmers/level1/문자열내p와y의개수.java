package programmers.level1;

import java.util.ArrayList;

public class 문자열내p와y의개수 {
	public static void main(String[] args) {

		System.out.println(solution("pPoooyY"));
	}

	public static boolean solution(String s) {
		// 대문자와 소문자가 섞여있는 문자열 S가 주어진다. s에 p의 개수와 y의 개수를 비교해 같으면 True, 다르면 False를
		// 리턴하는 함수를 완성. 문자열은 p와 y로만 이루어져있다. 하나도 없는 경우에는 항상 True다. 대소문자는 구분하지 않는다.
		boolean answer = true;
		int p = 0;
		int y = 0;

		s = s.toLowerCase();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'p')
				p++;
			else if (s.charAt(i) == 'y')
				y++;
		}

		return p == y;
	}
}
