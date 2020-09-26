package jieun.test.while_loop;
// 0 0이 들어올 때까지 A+B를 출력하는 문제
import java.io.*;
public class Test10952 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuilder sb = new StringBuilder();
		int a = 0, b = 0;
		do {
			String[] input = br.readLine().split(" ");
			a = Integer.parseInt(input[0]);
			b = Integer.parseInt(input[1]);
			if (a != 0 && b != 0) {
				sb.append(a+b);
				sb.append("\n");
			}
		}
		while (a != 0 && b != 0);
		bw.write(sb.toString());
		br.close();
		bw.flush(); bw.close();
	}
}
