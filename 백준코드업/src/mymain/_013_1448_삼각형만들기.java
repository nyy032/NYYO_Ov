package mymain;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class _013_1448_삼각형만들기 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<Integer> arr = new ArrayList<>();

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {

			arr.add(Integer.parseInt(br.readLine()));

		}

		Collections.sort(arr, Collections.reverseOrder());

		int hap = 0;
		int p = 0;

		while (true) {
			if (arr.get(p) >= arr.get(p + 1) + arr.get(p + 2)) {
				p = p + 1;

				if ((p + 2) == N) {
					System.out.println(-1);
					break;
				}

			} else if (arr.get(p) < arr.get(p + 1) + arr.get(p + 2)) {

				for (int i = p; i < (p + 3); i++) {

					hap = hap + arr.get(i);

				}
				System.out.println(hap);
				break;
			}

		}

	}

}
