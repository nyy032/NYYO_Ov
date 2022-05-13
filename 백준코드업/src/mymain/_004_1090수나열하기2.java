package mymain;

import java.util.Scanner;

public class _004_1090수나열하기2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();// 시작 값
		int r = scan.nextInt();// 등비(몇으로 계속 곱할지)
		int n = scan.nextInt();// 몇번째 수를 나타낼건지.
		
		long hap =a; //누적 되는 결과값.
		
		for(int i=0; i<n-1; i++) {
			
			hap = hap * r;
		
		}
		System.out.println(hap);
	}
}
