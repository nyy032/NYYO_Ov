package mymain;

import java.util.Scanner;

public class _017_10872_ÆÑÅä¸®¾ó {
	
	static int N;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		N = scan.nextInt();
		
		
		
		System.out.println(facto(N));
		
		
		
	}
	
	public static int facto(int N) {
		
		if(N<=1) {
			return 1;
		}
		
		return N * facto(N-1);
		
	}

}
