package mymain;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class _012_1099_성실한개미 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			arr.add(new ArrayList<>());
		}

		for (int i = 0; i < 10; i++) {

			st = new StringTokenizer(br.readLine());

			for (int k = 0; k < 10; k++) {

				arr.get(i).add(Integer.parseInt(st.nextToken()));

			}

		}

		
		int x = 1;
		int y = 1;

		while (true) {

			if (arr.get(x).get(y) == 0) {
				arr.get(x).set(y, 9);
				y = y + 1;
			} else if (arr.get(x).get(y) == 1) {
				x = x + 1;
				y = y - 1;
				if (arr.get(x).get(y)==1) {
					break;
				}
				
			}else if (arr.get(x).get(y)==2) {
				
				arr.get(x).set(y, 9);
				break;
			
			}
				
			

		}

		for (int j = 0; j < 10; j++) {

			for (int g = 0; g < 10; g++) {

				System.out.printf("%d ", arr.get(j).get(g));

			}
			System.out.println();
		}		
	}

}

