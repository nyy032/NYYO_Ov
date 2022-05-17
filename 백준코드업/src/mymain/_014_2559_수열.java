package mymain;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class _014_2559_¼ö¿­ {
    
     static int N;
     static int K;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st;

		ArrayList<Integer> arr = new ArrayList<>();

		st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < N; i++) {

			arr.add(Integer.parseInt(st.nextToken()));

		}
        
       
		int hap = 0;

		int suhap = Integer.MIN_VALUE;

		int g = 0;

		for (int i = 0; i < N - K + 1; i++) {

			for (int j = g; j < g + K; j++) {

				hap = hap + arr.get(j);
			}

			suhap = hap > suhap ? hap : suhap;

			hap = 0;
			g = g + 1;

		}
		System.out.println(suhap);

	}

}
