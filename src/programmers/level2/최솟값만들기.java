package programmers.level2;

import java.util.Arrays;

public class 최솟값만들기 {

	public int solution(int[] A, int[] B) {
		int answer = 0;

		// A는 오름차순 정렬
		Arrays.sort(A);

		// B는 오름차순 정렬 (뒤집지 않음)
		Arrays.sort(B);

		// A의 작은 값들과 B의 큰 값들을 곱하기
		// A[i] * B[B.length - 1 - i]
		for (int i = 0; i < A.length; i++) {
			answer += A[i] * B[B.length - 1 - i];
		}

		return answer;
	}

}
