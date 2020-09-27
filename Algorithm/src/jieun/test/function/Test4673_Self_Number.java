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
		boolean[] array = new boolean[10000]; // default : false
		
		for(int i = 1; i < array.length; i++) {
			int result = d(i);
			if(result <= 10000)
				array[result - 1] = true;
		}
		
		for(int i = 0; i < array.length; i++) {
			if(!array[i])
				sb.append(i+1+"\n");
		}
		bw.write(sb.toString());
		bw.flush(); bw.close();
	}
	
	static int d(int input) {
		int sum = input;
		while(input != 0) {
			sum += input % 10;
			input /= 10;
		}
		return sum;
	}
}
