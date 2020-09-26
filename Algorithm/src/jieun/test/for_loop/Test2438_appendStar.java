package jieun.test.for_loop;
import java.io.*;
public class Test2438_appendStar {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int input = Integer.parseInt(br.readLine(), 10);
		StringBuilder sb = new StringBuilder();
		StringBuilder sb_output = new StringBuilder();
		for(int i = 0; i < input; i++) {
			sb.append("*");
			sb_output.append(sb+"\n");
		}
		bw.write(sb_output.toString());
		br.close();
		bw.flush(); bw.close();
	}
}
