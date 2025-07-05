package programmers.level1;

import java.util.Arrays;

public class 나누어떨어지는숫자배열 {
	public static void main(String[] args) {
		int[] numbers = {5, 9, 7, 10};
		System.out.println(Arrays.toString(solution(numbers, 5)));
	}

	public static int[] solution(int[] arr, int divisor) {
		int[] result = Arrays.stream(arr)
			.filter(n -> n % divisor == 0)
			.sorted()
			.toArray();

		return result.length == 0 ? new int[]{-1} : result;
	}
}
