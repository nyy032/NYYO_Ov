package mymain;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _016_2018_��������5 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());// �ڿ��� N

		int cnt = 0; // ī��Ʈ
		int su = 1;  //su���� ���� �Ǵ� ���� ���� 15 �϶� cnt
		int hap = 0; //���� �Ǵ� ���� ��

		while (true) {// ���ϴ� ������ ���ö� ���� �ݺ��Ϸ���

			for (int i = su; i <= N; i++) {

				hap = hap + i;  // ���ӵǴ� ���� ��

				if (hap == N) { 		// ���� N�� ������ 
					
					cnt++;				// ī��Ʈ 1+
					hap = 0;			// ���� �Ǵ� ���� �� �ʱ�ȭ
					su++;				// su+1 ���� ���
					break;				// ����� for�� Ż��
					
				} else if (hap > N) {	// ���ӵǴ� ���� ���� N���� ũ��
					
					hap = 0;			// ���ӵǴ� ���� �� �ʱ�ȭ
					su++;				// su+1 ���� ���
					break;				// ����� for�� Ż�� 
					
				}

			}
			if (su > N) {// su�� 
				break;
			}
		}
		System.out.println(cnt);

	}

}
