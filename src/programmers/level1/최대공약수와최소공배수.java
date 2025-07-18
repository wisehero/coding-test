package programmers.level1;

public class 최대공약수와최소공배수 {
	public int[] solution(int n, int m) {
		int gcd = getGCD(n, m);
		int lcm = n * m / gcd;
		return new int[] {gcd, lcm};
	}

	private int getGCD(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}

		return a;
	}
}
