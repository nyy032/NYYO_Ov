package mymain;

import java.util.Scanner;

public class _003_1672_ö���ڸ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		
		int n = scan.nextInt(); // ö���� ����
		int k = scan.nextInt(); // �ڸ��� ���� ����
		
		int f = n / k; // �߶� ���� ö���� ����
		int cnt = 0;
		
		
		
		
		for(int i=0; i<f; i++) {
			
			if(f>9999) { // ö���� ������ if�� ����. cnt�� ��ٰ��� break�൵ �ص��������� �����ع����� ����...
				System.out.print("��ȣ �ʰ� ����");
				break;
			}
			cnt++;
			
			System.out.printf("F-%04d",cnt);
			System.out.println();
		}
	}
}
