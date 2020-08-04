package gyu;

import java.util.Scanner;

public class Test1 { //백준 정렬 2750번
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int temp;
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j < n; j++) {
				if(arr[i]>arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		for(int a : arr) {
			System.out.println(a);
		}
	}
}
