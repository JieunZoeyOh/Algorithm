package jieun.test.string;
// 정수를 문자열로 입력받는 문제
import java.io.*;
public class Test11720_sum_toCharArray {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		char[] numbers = br.readLine().toCharArray();
		int sum = 0;
		for(int i = 0; i < count; i++) {
			sum += numbers[i] - '0';
		}
		System.out.println(sum);
		br.close();
	}
}
