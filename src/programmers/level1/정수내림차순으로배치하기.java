package programmers.level1;

import java.util.Arrays;

public class 정수내림차순으로배치하기 {
	public static void main(String[] args) {

	}

	public long solution(long n) {
		long answer = 0;
		// long -> String[] 배열로 만들고
		// String[] 배열을 내림차순으로 정렬한 다음
		// 다시 long으로 변환

		var arr = String.valueOf(n).toCharArray();
		Arrays.sort(arr);

		var sb = new StringBuilder(new String(arr));
		sb.reverse();

		return Long.parseLong(sb.toString());
	}
}
