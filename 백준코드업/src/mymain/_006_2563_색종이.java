package mymain;

import java.util.Scanner;

public class _006_2563_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int[][] hwa = new int[100][100]; // ��ȭ���� �迭

		int n = scan.nextInt(); // paper count �������� ����
		int[][] arr = new int[n][2];

		for (int i = 0; i < n; i++) {

			arr[i][0] = Integer.parseInt(scan.next());// integer.parseInt(scan.next());��
			arr[i][1] = Integer.parseInt(scan.next());// scan���� ���� ���ڿ��� integer�� ��ȯ�� int���� ����.

		}

		int cnt = 0;

		for (int i = 0; i < n; i++) {// �������� ������ŭ ������.

			for (int j = arr[i][0]; j < arr[i][0] + 10; j++) {// ���� for������ arr[i][0]��°�� ���� ���ִ�.
																// �������� �� ���� ���̴� 10�̴ϱ� arr[i][0] + 10��ŭ for��������.
				for (int k = arr[i][1]; k < arr[i][1] + 10; k++) {// ���������� �� for�� arr[i][1]��°�� ���� ��������ϱ� 10���Ѹ�ŭ ������.

					if (hwa[j][k] == 1) {// ���� ��ȭ���� ���� 1�� ��쿣 �׳� �Ѿ��.

					} else {// ���� 1�� �ƴ� �ٸ���쿡�� ��ȭ���� ���� 1�� �ְ� count��

						hwa[j][k] = 1;
						cnt++;

					}

				}

			}

		}

		System.out.println(cnt);

		/*
		 * for(int i = 0; i < 100; i++) { //��ȭ�� �迭���
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
