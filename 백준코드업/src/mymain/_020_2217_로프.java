package mymain;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class _020_2217_로프 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		int hap = 0;

		for (int i = 0; i < N; i++) {
			arr.add(Integer.parseInt(br.readLine()));
		}
		
		//내림차순 정렬
		Collections.sort(arr);
		
		for(int i = N-1; i >=0; i--) {
			
			arr.set(i, arr.get(i) * (N - i));
			if( hap < arr.get(i)) {
				hap = arr.get(i);
			}
			
		}
		
		
		
		
		System.out.println(hap);
		
		

	}

}
