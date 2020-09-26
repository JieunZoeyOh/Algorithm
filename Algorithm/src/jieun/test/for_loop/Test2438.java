package jieun.test.for_loop;
import java.io.*;
public class Test2438 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int input = Integer.parseInt(br.readLine(), 10);
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= input; i++) {
			for(int j = 1; j <= i; j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		bw.write(sb.toString());
		br.close();
		bw.flush(); bw.close();
	}
}
