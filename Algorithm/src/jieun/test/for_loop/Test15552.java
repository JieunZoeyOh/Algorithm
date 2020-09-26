package jieun.test.for_loop;
import java.io.*;
import java.util.StringTokenizer;
public class Test15552 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine(), 10);
		
		for(int i=0; i<t; i++) {
			int first = 0, second = 0;
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			while(st.hasMoreTokens()) {
				first = Integer.parseInt(st.nextToken());
				second = Integer.parseInt(st.nextToken());
			}
			bw.write(String.valueOf(first + second));
			bw.write("\n");
		}
		br.close();
		bw.flush(); bw.close();
	}
}
