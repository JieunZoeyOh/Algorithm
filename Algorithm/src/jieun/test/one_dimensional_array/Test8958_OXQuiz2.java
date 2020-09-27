package jieun.test.one_dimensional_array;
// OX 퀴즈의 결과를 일차원 배열로 입력받아 점수를 계산하는 문제
import java.io.*;
import java.util.StringTokenizer;
public class Test8958_OXQuiz2 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		final int caseNum = Integer.parseInt(br.readLine()); // 총 과목 수
		String[] caseTest = new String[caseNum];
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < caseTest.length; i++) {
			caseTest[i] = br.readLine();
		}
		
		for(String test : caseTest) {
			int sum = 0;
			StringTokenizer st = new StringTokenizer(test, "X");
			while(st.hasMoreTokens()) {
				for(int i = st.nextToken().length(); i >0 ; i--)
					sum += i;
			}
			sb.append(sum + "\n");
		}
		bw.write(sb.toString());
		br.close(); bw.flush(); bw.close();
	}
}
