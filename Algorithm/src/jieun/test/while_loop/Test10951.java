package jieun.test.while_loop;
// 입력이 끝날 때까지 A+B를 출력하는 문제. EOF에 대해 알아 보세요.
import java.io.*;
public class Test10951 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuilder sb = new StringBuilder();
		int a = 0, b = 0;
		
		while(true) {
			String line = br.readLine();
			if(line == null || line.length() == 0 || line.equals(" ")) break;
			String[] input = line.split(" ");
			a = Integer.parseInt(input[0]);
			b = Integer.parseInt(input[1]);
			sb.append(a + b);
			sb.append("\n");
		}
		bw.write(sb.toString());
		br.close();
		bw.flush(); bw.close();
	}
}
