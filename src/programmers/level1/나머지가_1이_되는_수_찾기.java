package programmers.level1;

import java.util.*;

public class 나머지가_1이_되는_수_찾기 {

	public static void main(String[] args) {
		System.out.println(solutuion(10));
		System.out.println(solutuion(12));
	}

	public static int solutuion(int n) {
		int answer = 0;

		for (int i = 1; i <= n - 1; i++) {
			if (n % i == 1) {
				answer = i;
				break;
			}
		}

		return answer;
	}
}
