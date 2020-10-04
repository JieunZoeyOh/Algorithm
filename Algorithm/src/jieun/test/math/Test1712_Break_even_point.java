package jieun.test.math;
// 이익이 발생하는 지점을 찾는 문제
import java.io.*;
public class Test1712_Break_even_point {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] data = br.readLine().split(" ");
		if((Integer.parseInt(data[2]) - Integer.parseInt(data[1])) <= 0) {
			System.out.println(-1);
		} else {
			long result = Integer.parseInt(data[0])/(Integer.parseInt(data[2]) - Integer.parseInt(data[1]));
			System.out.println(result + 1);
		}
		br.close();
	}
}