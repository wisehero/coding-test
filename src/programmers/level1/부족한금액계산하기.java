package programmers.level1;

public class 부족한금액계산하기 {
	public long solution(int price, int money, int count) {
		long answer = 0;

		for (int i = 1; i <= count; i++){
			answer += price * i;
		}

		if (answer > money) {
			return answer - money;
		} else {
			return 0;
		}
	}

	// 등차수열의 합공식 (처음의 항 + 마지막 항) * 항의 갯수 / 2
	public long solutionV2(int price, int money, int count) {
		long total = (long)count * (price + price * count) / 2;
		return Math.max(total - money, 0);
	}
}
