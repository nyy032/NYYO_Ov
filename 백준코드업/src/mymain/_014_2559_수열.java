package mymain;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class _014_2559_¼ö¿­ {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st;

		ArrayList<Integer> arr = new ArrayList<>();

		st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < N; i++) {

			arr.add(Integer.parseInt(st.nextToken()));

		}

		int w = (N - K) + 1;
		
		int hap = 0;
		
		int suhap= -9999;
		
		int g = 0;

		for (int i = 0; i < w; i++) {

			for (int j = g; j < g + K; j++) {

				hap = hap + arr.get(j);
			}
			
				
			if (hap > suhap) {
				suhap = hap;	
			}
			
			hap = 0;
			g = g + 1;
			

		}
		System.out.println(suhap);

	}

}
