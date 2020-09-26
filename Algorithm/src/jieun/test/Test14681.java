package jieun.test;
import java.io.*;
public class Test14681 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int x = Integer.parseInt(br.readLine(), 10);
		int y = Integer.parseInt(br.readLine(), 10);
		
		int result = 1;
		if (x > 0) { // x 양수
			if(y < 0) result = 4;
		} else { // x 음수
			if(y > 0) result = 2;
			else result = 3;
		}
		bw.write(String.valueOf(result));
		br.close();
		bw.flush(); bw.close();
	}
}
