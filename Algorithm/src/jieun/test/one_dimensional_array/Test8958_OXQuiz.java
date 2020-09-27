package jieun.test.one_dimensional_array;
// OX 퀴즈의 결과를 일차원 배열로 입력받아 점수를 계산하는 문제
import java.io.*;
public class Test8958_OXQuiz {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		final int caseNum = Integer.parseInt(br.readLine()); // 총 과목 수
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < caseNum; i++) {
			String input = br.readLine();
			int sum = 0;
			int cumulative = 1; // 누적
			for (int j = 0; j < input.length(); j++) {
				if(input.charAt(j) == 'O') {
					sum += (cumulative++);
				} else {
					cumulative = 1; // 'X'일 경우 - 1로 초기화
				}
			}
			sb.append(sum + "\n");
		}
		bw.write(sb.toString());
		br.close(); 
		bw.flush(); 
		bw.close();
	}
}
