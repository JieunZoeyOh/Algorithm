package jieun.test.string;
// 문자열 반복
// 각 문자를 반복하여 출력하는 문제
import java.io.*;
import java.util.StringTokenizer;
public class Test2675_repeat {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int testCase = Integer.parseInt(br.readLine());
		for(int caseNum = 0; caseNum < testCase; caseNum++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int repeat = Integer.parseInt(st.nextToken());
			char[] word = st.nextToken().toCharArray();
			print(sb, word, repeat);
		}
		bw.write(sb.toString());
		br.close();
		bw.flush(); bw.close();
	}
	
	static StringBuilder print(StringBuilder sb, char[] word, int repeat) {
		for(int i = 0; i < word.length; i++) {
			for(int j = 0; j < repeat; j++) {
				sb.append(word[i]);
			}
		}
		sb.append("\n");
		return sb;
	}
}
