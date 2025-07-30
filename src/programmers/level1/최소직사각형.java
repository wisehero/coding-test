package programmers.level1;

public class 최소직사각형 {
	public int solution(int[][] sizes) {
		int maxWidth = 0;
		int maxHeight = 0;
		for (int[] size : sizes) {
			// 명함은 서로 뒤바꿀 수 있다. 가로에 긴걸 두고 세로에 짧은 것을 둔다.
			int w = Math.max(size[0], size[1]); // 가로가 큰 값
			int h = Math.min(size[0], size[1]); // 세로가 적은 값
			maxWidth = Math.max(maxWidth, w);
			maxHeight = Math.max(maxHeight, h);
		}
		return maxWidth * maxHeight;
	}
}
