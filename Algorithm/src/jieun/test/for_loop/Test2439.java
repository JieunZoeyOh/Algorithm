package jieun.test.for_loop;
import java.io.*;
public class Test2439 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int input = Integer.parseInt(br.readLine(), 10);
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < input; i++) {
			for(int j = input-i-1; j > 0; j--) {
				sb.append(" ");
			}
			for(int j = 0; j < i+1; j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		bw.write(sb.toString());
		br.close();
		bw.flush(); bw.close();
	}
}
