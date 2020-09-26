package jieun.test.for_loop;

import java.io.*;

public class Test2741 {
	public static void main(String[] args) {
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	try {
		int input = Integer.parseInt(br.readLine());
		for(int i = 1; i <= input; i++) {
			bw.write(i+"\n");
		}
		br.close();
		bw.flush(); bw.close();
	} catch (NumberFormatException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
	
}
