package mymain;

import java.util.Scanner;

public class _006_2563_색종이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int[][] hwa = new int[100][100]; // 도화지의 배열

		int n = scan.nextInt(); // paper count 색종이의 개수
		int[][] arr = new int[n][2];

		for (int i = 0; i < n; i++) {

			arr[i][0] = Integer.parseInt(scan.next());// integer.parseInt(scan.next());란
			arr[i][1] = Integer.parseInt(scan.next());// scan으로 받은 문자열을 integer로 변환한 int값을 리턴.

		}

		int cnt = 0;

		for (int i = 0; i < n; i++) {// 색종이의 갯수만큼 돌린다.

			for (int j = arr[i][0]; j < arr[i][0] + 10; j++) {// 위의 for문에서 arr[i][0]번째의 값이 들어가있다.
																// 색종이의 한 변의 길이는 10이니까 arr[i][0] + 10만큼 for을돌리자.
				for (int k = arr[i][1]; k < arr[i][1] + 10; k++) {// 마찬가지로 위 for의 arr[i][1]번째의 값이 들어있으니까 10더한만큼 돌리자.

					if (hwa[j][k] == 1) {// 만약 도화지의 값이 1인 경우엔 그냥 넘어간다.

					} else {// 만약 1이 아닌 다른경우에는 도화지의 값에 1을 넣고 count한

						hwa[j][k] = 1;
						cnt++;

					}

				}

			}

		}

		System.out.println(cnt);

		/*
		 * for(int i = 0; i < 100; i++) { //도화지 배열출력
		 * 
		 * for(int j = 0; j < 100; j++) {
		 * 
		 * if(hwa[i][j] == 1) {
		 * 
		 * cnt++;
		 * 
		 * }
		 * 
		 * }
		 * 
		 * }
		 */

	}

}
