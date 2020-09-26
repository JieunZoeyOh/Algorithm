package jieun.test.while_loop;
// �Է��� ���� ������ A+B�� ����ϴ� ����. EOF�� ���� �˾� ������.
import java.io.*;
public class Test10951 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuilder sb = new StringBuilder();
		int a = 0, b = 0;
		
		while(true) {
			String line = br.readLine();
			if(line == null || line.length() == 0 || line.equals(" ")) break;
			String[] input = line.split(" ");
			a = Integer.parseInt(input[0]);
			b = Integer.parseInt(input[1]);
			sb.append(a + b);
			sb.append("\n");
		}
		bw.write(sb.toString());
		br.close();
		bw.flush(); bw.close();
	}
}
