package jieun.test.math;
// 5와 3을 최소 횟수로 합하여 N을 만드는 문제
import java.io.*;
public class Test2839_deliver_sugar {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input;
		StringBuilder sb = new StringBuilder();
		while((input = br.readLine()) != null && input.length() != 0) {
			int number = Integer.parseInt(input);
			int bags = -1;
			ifLoop : 
			if(number / 5 > 0) {
				for(int i = number / 5; i > 0; i--) {
					if((number - (5 * i)) % 3 == 0) {
						bags = i + ((number - (5 * i)) / 3);
						break ifLoop;
					}
				}
				if (number % 3 == 0) bags = number / 3;
			} else if((number / 3) > 0) {
				if((number % 3) == 0) bags = number / 3;
			}
			sb.append(bags);
			sb.append("\n");
		}
		bw.write(sb.toString());
		br.close();
		bw.flush(); bw.close();
	}
}
