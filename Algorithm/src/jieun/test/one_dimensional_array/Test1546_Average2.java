package jieun.test.one_dimensional_array;
// 평균을 조작하는 문제
// 세준이는 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 
// 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
// 세준이의 최고점이 70이고, 수학점수가 50이었으면
// 수학점수는 50/70*100이 되어 71.43점이 된다.
// 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.
import java.io.*;
public class Test1546_Average2 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		final int SUBJECT = Integer.parseInt(br.readLine()); // 총 과목 수
		String[] score = br.readLine().split(" ");
		
		int sum = 0;
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < score.length; i++) {
			sum += Integer.parseInt(score[i]);
			max = (max < Integer.parseInt(score[i])) ? Integer.parseInt(score[i]) : max;
		}
		System.out.println(((double)sum / max) * 100.0 / SUBJECT);
		br.close();
	}
}
