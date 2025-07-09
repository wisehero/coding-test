package programmers.level1;

public class 삼진법뒤집기 {
	public int solution(int n) {
		String base3 = Integer.toString(n, 3);

		// 2. 뒤집기
		String reversed = new StringBuilder(base3).reverse().toString();

		// 3. 10진법으로 다시 변환
		return Integer.parseInt(reversed, 3);
	}
}
