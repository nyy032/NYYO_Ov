package mymain;

import java.util.Scanner;

public class _008_17608_����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt(); // ������� ����

		int[] arr = new int[N]; // �迭 ����.

		int cnt = 0;

		int p = arr[N - 1];

		for (int i = 0; i < N; i++) { // N�� ��ŭ ������ ����� ���� �Է�

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
