package programmers.level1;

public class 지폐접기 {

	public int solution(int[] wallet, int[] bill) {
		int answer = 0;

		while (min(bill) > min(wallet) || max(bill) > max(wallet)) {
			if (bill[0] > bill[1]) {
				bill[0] /= 2;
			} else {
				bill[1] /= 2;
			}
			answer += 1;
		}
		return answer;
	}

	private int min(int[] arr) {
		int min = arr[0];
		for (int num : arr) {
			if (num < min)
				min = num;
		}

		return min;
	}

	private int max(int[] arr) {
		int max = arr[0];
		for (int num : arr) {
			if (num > max)
				max = num;
		}
		return max;
	}
}
