package programmers.level1;

public class 모의고사 {
	public int[] solution(int[] answers) {
		int[] supo1 = {1, 2, 3, 4, 5};
		int[] supo2 = {2, 1, 2, 3, 2, 4, 2, 5};
		int[] supo3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

		int score1 = 0, score2 = 0, score3 = 0;

		for (int i = 0; i < answers.length; i++) {
			int answer = answers[i];
			if (answer == supo1[i % 5]) score1++;
			if (answer == supo2[i % 8]) score2++;
			if (answer == supo3[i % 10]) score3++;
		}

		int maxScore = Math.max(score1, Math.max(score2, score3));

		int winnerCount = 0;
		if (score1 == maxScore) winnerCount++;
		if (score2 == maxScore) winnerCount++;
		if (score3 == maxScore) winnerCount++;

		int[] result = new int[winnerCount];
		int index = 0;
		if (score1 == maxScore) result[index++] = 1;
		if (score2 == maxScore) result[index++] = 2;
		if (score3 == maxScore) result[index++] = 3;

		return result;
	}
}
