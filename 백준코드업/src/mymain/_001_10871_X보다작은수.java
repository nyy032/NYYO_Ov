package mymain;

import java.util.Scanner;

public class _001_10871_X���������� { //����ÿ��� class�� Main���� �ٲٰ�  public class Main���� �ؿ����� 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int X = scan.nextInt();
		int arr[] = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i]=scan.nextInt();
		}
		scan.close();
		
		for(int i=0; i<N; i++) {
			if(arr[i]<X) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
		