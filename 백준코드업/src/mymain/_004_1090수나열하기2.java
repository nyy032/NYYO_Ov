package mymain;

import java.util.Scanner;

public class _004_1090�������ϱ�2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();// ���� ��
		int r = scan.nextInt();// ���(������ ��� ������)
		int n = scan.nextInt();// ���° ���� ��Ÿ������.
		
		long hap =a; //���� �Ǵ� �����.
		
		for(int i=0; i<n-1; i++) {
			
			hap = hap * r;
		
		}
		System.out.println(hap);
	}
}
