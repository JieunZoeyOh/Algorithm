package jieun.test.string;
import java.io.*;
public class Test2908_reverseNumber {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int x = reverse(input[0]);
		int y = reverse(input[1]);
		int result = (x > y) ? x : y;
		System.out.println(result);
	}
	
	static int reverse(String num) {
		char[] number = num.toCharArray();
		char temp = number[0];
		number[0] = number[2];
		number[2] = temp;
		return Integer.parseInt(String.valueOf((number)));
	}
}
