package jieun.test.for_loop;
import java.io.*;
import java.util.StringTokenizer;
public class Test10871 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String firstLine = br.readLine();
		String[] input = firstLine.split(" ");
		
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		while(st.hasMoreTokens()) {
			int current = Integer.parseInt(st.nextToken());
			if(current < Integer.parseInt(input[1]))
				sb.append(current).append(" ");
		}
		bw.write(sb.toString());
		br.close();
		bw.flush(); bw.close();
	}
}
