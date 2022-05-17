package mymain;

import java.util.Scanner;

public class _019_2748_피보나치_메모리얼 {

	static long[] arr = new long[91]; // n값이 90보다 작거나 같은 자연수니까 배열을 넉넉하게 잡아준다
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
