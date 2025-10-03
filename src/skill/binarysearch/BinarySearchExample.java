package skill.binarysearch;

public class BinarySearchExample {

	public int search(int[] arr, int target) {
		int left = 0; // 맨 처음
		int right = arr.length - 1; // 맨 끝

		while (left <= right) {
			// 중간 인덱스 계산
			int mid = left + (right - left) / 2;

			// 중간 값이 타겟과 일치하는 경우
			if (arr[mid] == target) {
				return mid;
			}

			// 중간 값이 타겟보다 작은 경우(오른쪽 부분 탐색)
			if (arr[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1; // 배열에 타겟 값이 없는 경우
	}

	public static void main(String[] args) {
		BinarySearchExample bs = new BinarySearchExample();
		int[] sortedArray = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
		int target = 23;

		int resultIndex = bs.search(sortedArray, target);

		if (resultIndex != -1) {
			System.out.println("값 " + target + "은(는) 인덱스 " + resultIndex + "에 있습니다.");
		} else {
			System.out.println("값 " + target + "을(를) 찾을 수 없습니다.");
		}
	}
}
