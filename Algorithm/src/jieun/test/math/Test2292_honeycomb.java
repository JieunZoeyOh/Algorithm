package jieun.test.math;
// ������ �����Ǵ� ��Ģ�� ���� ������ ��ġ�� ���ϴ� ����
import java.io.*;
public class Test2292_honeycomb {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String input;
		while((input = br.readLine()) != null && input.length() != 0) {
			int inputNum = Integer.parseInt(input);
			if(inputNum == 1) {
				sb.append(1);
			} else {
				int sumSequence = 0;
				for(int i = 1; ; i++) {
					if(((1 + 6*sumSequence) + 1) <= inputNum && inputNum <= (1 + 6*(sumSequence += i))) {
						sb.append(i+1);
						break;
					}
				}
			}
			sb.append("\n");
		}
		bw.write(sb.toString());
		br.close();
		bw.flush(); bw.close();
	}
}		
	/*
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
	
		System.out.print(solution(n));
	}
	
	private static int solution(int n) {
		// 1: 1 (1)
		// 2 ~ 7 : 2 (6��)
		// 8 ~ 19 : 3 (12��)
		// 20 ~ 37 : 4 (18��)
		// 38 ~ 61 : 5 (24��)
		// ...����..
		// a(n) = a(n-1) + 6(n-1) | a(n): ù ��
		
		if(n == 1) return 1;
		int i=2;
		int k=1;
		
		while(i<=n) {
			i += 6*k++;
		}
		
		return k;
	}
	*/

