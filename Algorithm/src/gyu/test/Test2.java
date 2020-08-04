package gyu.test;

import java.util.Scanner;

public class Test2 { //백준 정렬 2752번
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		int temp, min, index = 0;
		for(int i = 0; i<3; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		for(int i=0; i<3; i++) {
			min=1000001;
			for(int j=i; j < 3; j++) {
				if(min>arr[j]) {
					min = arr[j];
					 index =j;
				}
			}
			temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
		}
		for(int a : arr) {
			System.out.print(a+" ");
		}
	}
}
