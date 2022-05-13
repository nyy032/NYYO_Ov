package mymain;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _016_2018_수들의합5 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());// 자연수 N

		int cnt = 0; // 카운트
		int su = 1;  //su부터 연속 되는 수의 합이 15 일때 cnt
		int hap = 0; //연속 되는 수의 합

		while (true) {// 원하는 조건이 나올때 까지 반복하려고

			for (int i = su; i <= N; i++) {

				hap = hap + i;  // 연속되는 수의 합

				if (hap == N) { 		// 합이 N과 같으면 
					
					cnt++;				// 카운트 1+
					hap = 0;			// 연속 되는 수의 합 초기화
					su++;				// su+1 부터 계산
					break;				// 가까운 for을 탈출
					
				} else if (hap > N) {	// 연속되는 수의 합이 N보다 크면
					
					hap = 0;			// 연속되는 수의 합 초기화
					su++;				// su+1 부터 계산
					break;				// 가까운 for문 탈출 
					
				}

			}
			if (su > N) {// su가 
				break;
			}
		}
		System.out.println(cnt);

	}

}
