package gyu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Test3_1 { // 백준 정렬 2751번 - Collections.sort() 내장함수 사용 => 성공!
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int inputCount = Integer.parseInt(br.readLine());
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0; i < inputCount; i++) {
			arr.add(Integer.parseInt(br.readLine()));
		}
		Collections.sort(arr);
		for (int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}
}
