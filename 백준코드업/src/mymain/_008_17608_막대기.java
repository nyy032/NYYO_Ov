package mymain;

import java.util.Scanner;

public class _008_17608_막대기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt(); // 막대기의 개수

		int[] arr = new int[N]; // 배열 생성.

		int cnt = 0;

		int p = arr[N - 1];

		for (int i = 0; i < N; i++) { // N개 만큼 각각의 막대기 길이 입력

			arr[i] = Integer.parseInt(scan.next());

		}

		for (int i = N - 1; i >= 0; i--) {

			if (p < arr[i]) {
				cnt++;
				p = arr[i];
			}

		}
		System.out.println(cnt);

	}

}
