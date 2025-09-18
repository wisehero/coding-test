package neetcode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
	public static void main(String[] args) {

		System.out.println(hasDuplicate(new int[] {1, 2, 3, 1}));
		System.out.println(hasDuplicate(new int[] {1, 2, 3, 4}));

	}

	public static boolean hasDuplicate(int[] nums) {
		boolean answer = false;
		Set<Integer> set = new HashSet<>();
		for (int num : nums) {
			set.add(num);
		}

		int length1 = nums.length;
		int length2 = set.size();

		if (length1 != length2) {
			return true;
		}

		return answer;
	}
}
