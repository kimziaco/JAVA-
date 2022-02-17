package chapter5_배열;

public class ArrayEX19 {

	public static void main(String[] args) {

		int[][] score = { { 100, 100, 100 }, { 20, 20, 20 }, { 30, 30, 30 }, { 40, 40, 40 }, { 50, 50, 50 } };

		int korTotal = 0, engTotal = 0, mathTotal = 0;

		System.out.println("번호 국어 영어 수학 총점 평균");
		System.out.println("==================================");

		for (int i = 0; i < score.length; i++) {
			int sum = 0;
			float avg = 0.0f;

			korTotal += score[i][0];
			engTotal += score[i][1];
			mathTotal += score[i][2];
			System.out.printf("%3d\n", i + 1);

			for (int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
				System.out.printf("%8d",score[i][j]);
			}

		}

	}

}
