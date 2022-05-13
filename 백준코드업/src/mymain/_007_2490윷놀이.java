package mymain;

import java.util.Scanner;

public class _007_2490¿∑≥Ó¿Ã {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int[][] arr = new int[3][4];

		for (int i = 0; i < 3; i++) {

			arr[i][0] = Integer.parseInt(scan.next());
			arr[i][1] = Integer.parseInt(scan.next());
			arr[i][2] = Integer.parseInt(scan.next());
			arr[i][3] = Integer.parseInt(scan.next());

		}

		int cnt = 0;

		for (int i = 0; i < 3; i++) {

			for (int k = 0; k < 4; k++) {

				if (arr[i][k] == 1) {
					cnt++;
				} else {

				}

			}

			if (cnt == 0) {
				System.out.println("D");
			} else if (cnt == 1) {
				System.out.println("C");
			} else if (cnt == 2) {
				System.out.println("B");
			} else if (cnt == 3) {
				System.out.println("A");
			} else {
				System.out.println("E");
			}
			cnt = 0;

		}

	}

}
