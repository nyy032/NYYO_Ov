package mymain;

import java.util.Scanner;

public class _003_1672_철근자르기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		
		int n = scan.nextInt(); // 철근의 길이
		int k = scan.nextInt(); // 자르고 싶은 길이
		
		int f = n / k; // 잘라서 나온 철근의 개수
		int cnt = 0;
		
		
		
		
		for(int i=0; i<f; i++) {
			
			if(f>9999) { // 철근의 개수로 if를 주자. cnt로 줬다가는 break줘도 밑도끝도없이 연산해버린다 ㅅㅂ...
				System.out.print("번호 초과 오류");
				break;
			}
			cnt++;
			
			System.out.printf("F-%04d",cnt);
			System.out.println();
		}
	}
}
