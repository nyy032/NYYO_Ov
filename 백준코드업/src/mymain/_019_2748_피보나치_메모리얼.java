package mymain;

import java.util.Scanner;

public class _019_2748_�Ǻ���ġ_�޸𸮾� {

	static long[] arr = new long[91]; // n���� 90���� �۰ų� ���� �ڿ����ϱ� �迭�� �˳��ϰ� ����ش�
	static int N;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		N = scan.nextInt();

		System.out.println(fibo(N));

	}

	public static long fibo(int N) {

		if (N <= 1)
			return N;

		if (arr[N] != 0)
			return arr[N];

		else
			arr[N] = fibo(N - 1) + fibo(N - 2);
		return arr[N];

	}

}
