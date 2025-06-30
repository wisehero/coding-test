package programmers.level1;

public class 하샤드수 {

	public static void main(String[] args) {
		System.out.println(solution(18));
		System.out.println(solution2(13));
		System.out.println(solution2(10));
		System.out.println(solution2(12));
		System.out.println(solution(11));
	}

	public static boolean solution(int x) {
		boolean answer = true;
		int a = 0; // 자릿수의 합

		// x의 자릿수의 합으로 x가 나누어져야 한다.
		String arr = String.valueOf(x);
		String[] split = arr.split("");

		for (int i = 0; i < split.length; i++) {
			a += Integer.parseInt(split[i]);
		}

		if (x % a != 0) {
			answer = false;
		}

		return answer;
	}

	public static boolean solution2(int x) {
		int sum = String.valueOf(x).chars().map(ch -> ch - '0').sum();
		return x % sum == 0;
	}
}
