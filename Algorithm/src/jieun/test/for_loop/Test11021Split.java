package jieun.test.for_loop;
import java.io.*;
public class Test11021Split {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int test = Integer.parseInt(br.readLine(), 10);
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= test; i++) {
			String line = br.readLine();
			String [] arr = line.split(" ");
			sb.append("Case #"+i+": ");
			sb.append(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]));
			sb.append("\n");
		}
		bw.write(sb.toString());
		br.close();
		bw.flush(); bw.close();
	}
}
