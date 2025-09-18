package neetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ValidAnagram {

	public static void main(String[] args) {
		System.out.println(isAnagram("xx", "x"));
	}

	public static boolean isAnagram(String s, String t) {
		char[] charArray = s.toCharArray();
		char[] charArray1 = t.toCharArray();
		Arrays.sort(charArray);
		Arrays.sort(charArray1);
		return Arrays.equals(charArray, charArray1);
	}
}
