package mymain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class _010_10798_세로읽기 {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<ArrayList<Character>> arr = new ArrayList<>();

        char[] c;

        for (int i = 0; i < 5; i++) {
            arr.add(new ArrayList<>());
        }

        int max = 0;
        for (int i = 0; i < 5; i++) {
            c = br.readLine().toCharArray();
            max = Math.max(max, c.length);
            for (int j = 0; j < c.length; j++) {
                arr.get(i).add(c[j]);
            }

        }

		/*
		 * for (int i = 0; i < 5; i++) { for (int j = 0; j < arr.get(i).size(); j++) {
		 * System.out.printf("%s ", arr.get(i).get(j)); } System.out.println();
		 * 
		 * }
		 */

        for (int i = 0; i < max; i++) {

            for (int j = 0; j < 5; j++) {

                if (i >= arr.get(j).size()) {

                } else {
                    System.out.printf("%s", arr.get(j).get(i));
                }

            }
        }

    }

}
