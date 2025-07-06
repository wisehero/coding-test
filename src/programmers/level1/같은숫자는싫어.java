package programmers.level1;

import java.util.ArrayList;
import java.util.List;

public class 같은숫자는싫어 {
	public int[] solution(int[] arr) {
		List<Integer> list = new ArrayList<>();
		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.

		int cur = arr[0];
		list.add(cur);
		for (int i = 1; i < arr.length; i++) {
			int next = arr[i];
			if (next != cur) {
				list.add(next);
				cur = next;
			}
		}

		return list.stream().mapToInt(Integer::intValue).toArray();
	}
}
