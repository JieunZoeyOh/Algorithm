package jieun.test.one_dimensional_array;
// 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 
// 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
import java.io.*;
public class Test3052_remainder {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		final int QUOTIENT_VALUE = 42; // 나누는 몫
		int[] arr = new int[10]; // 입력 값
		int[] remainder = new int[QUOTIENT_VALUE]; // 나머지 값
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine()) % QUOTIENT_VALUE;
			remainder[arr[i]]++;
		}
		int count = 0;
		for(int i:remainder) {
			if(i != 0) count++;
		}
		br.close();
		System.out.println(count);
	}
}
