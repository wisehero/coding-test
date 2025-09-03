package programmers.level1;

import java.util.*;

public class K번째수 {

	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];

		for (int i = 0; i < commands.length; i++) {
			int a = commands[i][0];
			int b = commands[i][1];
			int c = commands[i][2];

			int[] arr = Arrays.copyOfRange(array, a - 1, b);
			Arrays.sort(arr);
			answer[i] = arr[c - 1];
		}

		return answer;
	}
}
