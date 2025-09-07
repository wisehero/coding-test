package programmers.level2;

import java.util.Arrays;

public class 최댓값과최솟값 {

	public String solution(String s) {
		String[] arr = s.split(" ");
		int[] iarr = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			iarr[i] = Integer.parseInt(arr[i]);
		}

		Arrays.sort(iarr);

		return iarr[0] + " " + iarr[iarr.length - 1];
	}
}
