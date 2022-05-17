package mymain;

import java.util.Scanner;

public class _009_4344_평균은넘겠지 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		double hap = 0; //학생들 점수의 합

		double cnt = 0;

		int C = scan.nextInt();

		int[][] arr = new int[100][100];

		for (int i = 0; i < C; i++) {

			double N = scan.nextInt();

			for (int k = 0; k < N; k++) {

				arr[k][i] = Integer.parseInt(scan.next());

				hap = hap + arr[k][i];

			}

			double avg = hap / N;

			for (int j = 0; j < N; j++) {
				if (avg > arr[j][i]) {
					cnt++;
				}
				hap = 0;

			}
			double pe = (cnt / N) * 100;
			System.out.printf("%.03f%%", pe);
			cnt = 0;
			System.out.println();
		}

	}

}
