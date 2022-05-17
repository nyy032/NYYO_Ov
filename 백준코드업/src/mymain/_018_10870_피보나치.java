package mymain;

import java.util.Scanner;

public class _018_10870_피보나치 {

	static int N;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		N = scan.nextInt();
		
		
		System.out.println(fibo(N));

	}
	
	public static int fibo(int N) {
		
		if(N == 0) {
			return 0;
		}else if(N == 1) {
			return 1;
		}
		
		return fibo(N-2) + fibo(N-1);
		
		
		
	}

}
