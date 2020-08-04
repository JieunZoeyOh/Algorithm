package jieun.test;

import java.util.Scanner;

public class Test2750 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int index = sc.nextInt(); // 첫번째 받는 값 index
		int array[] = new int[index];
		for (int i = 0; i < index; i++) {
			int temp = sc.nextInt();
			if (Math.abs(temp) <= 1000) {
				boolean overlap = false;
				int j = i;
				while ((j - 1) >= 0) {
					if (array[j - 1] == temp) {
						overlap = true;
					}
					j--;
				}
				if (overlap == true) {
					i--;
				} else {
					array[i] = temp;
				}
			} else {
				i--;
			}
		}
		sc.close();
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		for (int a : array) {
			System.out.println(a);
		}
	}

}
