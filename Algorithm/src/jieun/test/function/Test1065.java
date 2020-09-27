package jieun.test.function;
// X가 한수인지 판별하는 함수를 정의하여 문제를 해결해 봅시다.
/*
 * 어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 
 * 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. 
 * N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 
 */
import java.io.*;
public class Test1065 {
	public static void main(String[] args) throws IOException {
		// 1. 일의 자리수 : 1~9
		// 2. 십의 자리수 : 10~99
		// 3. 백의 자리수 : 100~999
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String input = null;
		while((input = br.readLine()) != null && input.length() != 0) {
			int result = count(input, input.length());
			sb.append(result+"\n");
		}
		
		bw.write(sb.toString());
		br.close();
		bw.flush(); bw.close();
	}
	
	static int count(String input, int length) {
		if(length == 1 || length == 2) {
			return Integer.parseInt(input);
		} else if(length == 3) {
			int count = 0;
			for(int i = 100; i <= Integer.parseInt(input); i++) {
				int one = i % 10;
				int ten = (i / 10) % 10;
				int hundred = i / 100;
				if(hundred + one == ten * 2) { // (hundred - ten) == (ten - one)
					count++;
				}
			}
			return 99 + count;
		} else {
			return 144;
		}
	}
}
