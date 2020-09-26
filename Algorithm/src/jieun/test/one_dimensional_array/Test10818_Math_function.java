package jieun.test.one_dimensional_array;
// 최솟값과 최댓값을 찾는 문제
import java.io.*;
import java.util.StringTokenizer;
public class Test10818_Math_function {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine(), 10);
		StringTokenizer tokenizer = new StringTokenizer(br.readLine());
		//  StringTokenizer(String str) - 기본 분리 문자(공백, 탭, 개행문자)로 구분
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < num; i++) {
			int current = Integer.parseInt(tokenizer.nextToken());
			min = Math.min(min, current);
			max = Math.max(max, current);
		}
		System.out.println(min + " " + max);
	}
}
