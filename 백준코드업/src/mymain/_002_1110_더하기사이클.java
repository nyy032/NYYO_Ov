package mymain;

import java.util.Scanner;

public class _002_1110_더하기사이클 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan = new  Scanner(System.in);
	
	int N = scan.nextInt();
	
	int cnt = 0;
	int copy = N;
	 
 		while(true) {
	 		
		 N = ((N % 10) * 10) + (((N / 10)+(N % 10))%10);
		 //     60    +      8

		 cnt++;
 		
	 		if(copy == N) {
	 		
	 			break;
	 	
	 		} 
	 
 		}
 		System.out.println(cnt);
	}

}
