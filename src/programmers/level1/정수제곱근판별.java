package programmers.level1;

public class 정수제곱근판별 {

	public static void main(String[] args) {
		System.out.println(solution(121));
		System.out.println(solution(3));
	}

	public static long solution(long n) {
		long answer = 0;
		// n은 1이상, 50000000000000 이하인 양의 정수입니다.
		// n에 루트를 씌워서 자연수가 나오면 거기에 1을 더해서 리턴
		// 자연수가 아니라면 -1 리턴

		var sqrt = Math.sqrt(n);
		if (sqrt == (long) sqrt) { // n이 조건상 int의 범위를 넘어서기 때문에 long
			return (long) Math.pow(sqrt + 1, 2);
		} else {
			return -1;
		}
	}
}
