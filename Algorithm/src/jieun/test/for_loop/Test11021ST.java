package jieun.test.for_loop;
import java.io.*;
import java.util.StringTokenizer;
public class Test11021ST {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int test = Integer.parseInt(br.readLine(), 10);
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= test; i++) {
			int a = 0, b = 0;
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			while(st.hasMoreTokens()) {
				a = Integer.parseInt(st.nextToken());
				b = Integer.parseInt(st.nextToken());
			}
			sb.append("Case #"+i+": ").append(a+b+"\n");
		}
		bw.write(sb.toString());
		br.close();
		bw.flush(); bw.close();
	}
}
