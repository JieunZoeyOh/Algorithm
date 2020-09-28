package jieun.test.string;


import java.io.BufferedReader;
// 아스키 코드에 대해 알아보는 문제
// 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 
// 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
import java.io.IOException;
import java.io.InputStreamReader;
public class Test11654_asciiCode {
	public static void main(String[] args) throws IOException {
		int ch = System.in.read();
		System.out.println(ch);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = br.readLine().charAt(0);
		System.out.println(input);
	}
}
