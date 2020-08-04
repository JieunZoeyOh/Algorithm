package gyu;

import java.util.Scanner;

public class Test3 { // 백준 정렬 2751번 - 퀵정렬 이용 => 시간초과!!!
	static void quickSort(int data[], int l, int r) {
		int left = l;
		int right = r;
		int pivot = data[(l+r)/2];
		
		do {
			while(data[left] < pivot)
				left++;
			while(data[right] > pivot)
				right--;
			if(left <= right) {
				int temp = data[left];
				data[left] = data[right];
				data[right] = temp;
				left++;
				right--;
			}
		} while (left <= right);
		
		if(l < right)
			quickSort(data, l, right);
		if(r > left)
			quickSort(data, left, r);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int number=1;
		if(number >= 1 && number <= 1000000) {
			 number = sc.nextInt();
		}
		int data[] = new int[number];

		for (int i = 0; i < number; i++) {
			data[i] = sc.nextInt();
		}
		sc.close();
		quickSort(data, 0, number - 1);
		for (int i = 0; i < number; i++) {
			System.out.println(data[i]);
		}

	}
}
