package jieun.test.one_dimensional_array;
// 각 숫자가 몇 번 나왔는지 저장하기 위해 일차원 배열을 만드는 문제
// 세 개의 자연수 A, B, C가 주어질 때 A×B×C를 계산한 결과에 
// 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
import java.io.*;
public class Test2577_countNumber2 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int result = 1;
		for(int i = 0; i < 3; i++) {
			result *= Integer.parseInt(br.readLine());
		}
		int[] arr = new int[10];
		for(int i = 0; i < String.valueOf(result).length(); i++) {
			int index = String.valueOf(result).charAt(i) - '0';
			arr[index]++;
		}
		for(int i: arr) {
			sb.append(i + "\n");
		}
		bw.write(sb.toString());
		br.close();
		bw.flush(); bw.close();
	}
}
