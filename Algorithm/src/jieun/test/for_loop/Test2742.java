package jieun.test.for_loop;
import java.io.*;
public class Test2742 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int input = Integer.parseInt(br.readLine(), 10);
		for(int i = input; i>0; i--) {
			bw.write(String.valueOf(i));
			bw.newLine();
		}
		
		br.close();
		bw.flush(); bw.close();
	}
}
