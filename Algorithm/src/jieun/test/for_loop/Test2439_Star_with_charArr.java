package jieun.test.for_loop;
import java.io.*;
public class Test2439_Star_with_charArr {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int index = Integer.parseInt(br.readLine(), 10);
		StringBuilder sb = new StringBuilder();
		char[] stars = new char[index];
		for(int i = 0; i < index; i++) {
			stars[i] = ' ';
		}
		for(int i = 0; i < index; i++) {
			stars[index-i-1] = '*';
			sb.append(stars).append('\n');
		}
		bw.write(sb.toString());
		br.close();
		bw.flush(); bw.close();
	}
}
