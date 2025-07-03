package programmers.level1;

public class 없는숫자더하기 {
	public static void main(String[] args) {

	}

	public static int solution(int[] numbers) {
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			boolean found = false;
			for (int number : numbers) {
				if (number == i) {
					found = true;
					break;
				}
			}
			if (!found) {
				sum += i;
			}
		}

		return sum;
	}
}
