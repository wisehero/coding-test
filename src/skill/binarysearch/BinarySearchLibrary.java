package skill.binarysearch;

import java.util.Arrays;

public class BinarySearchLibrary {
	public static void main(String[] args) {
		int[] sortedArray = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
		int target1 = 23;
		int target2 = 30; // 배열에 없는 값

		// 1. 값이 있는 경우
		int result1 = Arrays.binarySearch(sortedArray, target1);
		System.out.println("값 " + target1 + "의 위치: " + result1); // 결과: 5


		// 2. 값이 없는 경우
		int result2 = Arrays.binarySearch(sortedArray, target2);
		System.out.println("값 " + target2 + "의 위치: " + result2); // 결과: -7
	}
}
