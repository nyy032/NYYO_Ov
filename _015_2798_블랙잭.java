package mymain;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class _015_2798_∫Ì∑¢¿Ë {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		ArrayList<Integer> arr = new ArrayList<>();

		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int hap = 0;
		int suhap = 0;
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < N; i++) {

			arr.add(Integer.parseInt(st.nextToken()));
		}

		for (int i = 0; i < arr.size(); i++) {

			for (int k = 0; k < arr.size(); k++) {
				if (i < k) {

					for (int j = 0; j < arr.size(); j++) {
						if (k < j) {

							hap = arr.get(i) + arr.get(k) + arr.get(j);

							if (hap > suhap && hap <= M) {

								suhap = hap;

							}

							hap = 0;
						}

					}
				}

			}

		}
		System.out.println(suhap);

	}

}
