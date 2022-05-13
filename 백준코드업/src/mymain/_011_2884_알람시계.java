package mymain;

import java.util.Scanner;

public class _011_2884_알람시계 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int H = scan.nextInt();
		int M = scan.nextInt();
		
		M = M -45;
		
		if(M<0) {
			M = M + 60;
			H = H - 1;
		}
		if(H<0) {
			H = H + 24;
		}
		
		
		
		System.out.printf("%d %d", H, M);
		
	}

}
