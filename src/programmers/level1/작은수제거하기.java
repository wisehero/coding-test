package programmers.level1;

public class 작은수제거하기 {
	public static void main(String[] args) {

	}

	public static int[] solution(int[] arr) {
		if (arr.length == 1)
			return new int[] {-1};

		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}

		int[] result = new int[arr.length - 1];
		int idx = 0;
		boolean removed = false;

		for (int num : arr) {
			if (!removed && num == min) {
				removed = true;
				continue;
			}
			result[idx++] = num;
		}

		return result;
	}
}
