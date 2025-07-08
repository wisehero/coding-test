package programmers.level1;

public class 문자열다루기기본 {
	public boolean solution(String s) {
		int len = s.length();
		if (len != 4 && len != 6) return false;

		for(int i = 0; i < len; i++){
			if(!Character.isDigit(s.charAt(i))) return false;
		}
		return true;
	}
}
