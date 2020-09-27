package jieun.test.function;
// �Լ� d�� �����Ͽ� ������ �ذ��� ���ô�.
// �����ڰ� ���� ���ڸ� ���� �ѹ���� �Ѵ�. 100���� ���� ���� �ѹ��� �� 13���� �ִ�. 
// 1, 3, 5, 7, 9, 20, 31, 42, 53, 64, 75, 86, 97
// 10000���� �۰ų� ���� ���� �ѹ��� �� �ٿ� �ϳ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
import java.io.*;
public class Test4673_Self_Number {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int[] array = new int[10000];
		int count = 1;
		while(true) {
			int result = d(count);
			if(result > 15000)  break;
			
			if(result <= 10000) {
			 array[result - 1]++;
			}
			count++;
		}
		for(int i = 0; i < array.length; i++) {
			if(array[i] == 0)
				sb.append(i+1+"\n");
		}
		bw.write(sb.toString());
		bw.flush(); bw.close();
	}
	
	static int d(int input) {
		int ramainder;
		int sum = 0;
		int num = input;
		do {
			ramainder = num % 10;
			sum += ramainder;
			num /= 10;
		} while (num != 0);
		return input + sum;
	}
}
