package jieun.test.function;
// X�� �Ѽ����� �Ǻ��ϴ� �Լ��� �����Ͽ� ������ �ذ��� ���ô�.
/*
 * � ���� ���� X�� �� �ڸ��� ���������� �̷�ٸ�, �� ���� �Ѽ���� �Ѵ�. 
 * ���������� ���ӵ� �� ���� ���� ���̰� ������ ������ ���Ѵ�. 
 * N�� �־����� ��, 1���� ũ�ų� ����, N���� �۰ų� ���� �Ѽ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
 */
import java.io.*;
public class Test1065 {
	public static void main(String[] args) throws IOException {
		// 1. ���� �ڸ��� : 1~9
		// 2. ���� �ڸ��� : 10~99
		// 3. ���� �ڸ��� : 100~999
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String input = null;
		while((input = br.readLine()) != null && input.length() != 0) {
			int result = count(input, input.length());
			sb.append(result+"\n");
		}
		
		bw.write(sb.toString());
		br.close();
		bw.flush(); bw.close();
	}
	
	static int count(String input, int length) {
		if(length == 1 || length == 2) {
			return Integer.parseInt(input);
		} else if(length == 3) {
			int count = 0;
			for(int i = 100; i <= Integer.parseInt(input); i++) {
				int one = i % 10;
				int ten = (i / 10) % 10;
				int hundred = i / 100;
				if(hundred + one == ten * 2) { // (hundred - ten) == (ten - one)
					count++;
				}
			}
			return 99 + count;
		} else {
			return 144;
		}
	}
}
