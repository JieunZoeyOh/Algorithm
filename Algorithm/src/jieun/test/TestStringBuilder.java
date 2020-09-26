package jieun.test;
import java.io.*;
public class TestStringBuilder {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int input = Integer.parseInt(br.readLine(), 10);
		StringBuilder sb = new StringBuilder();
		for(int i = input; i > 0; i--) {
			sb.append(i).append("\n");
		}
		bw.write(sb.toString());
		br.close();
		bw.flush(); bw.close();
	}
}
