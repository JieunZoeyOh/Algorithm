package jieun.test.while_loop;
// ���� ���� ���ƿ� ������ ������ �ݺ��ϴ� ����
import java.io.*;
public class Test1110 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int count = 0;
		int num = Integer.parseInt(br.readLine());
		int newNum = -1;
		while(num != newNum) {
			if(count == 0) 
				newNum = num;
			int tens = newNum / 10; // 1�� �ڸ�
			int units = newNum % 10; // 10�� �ڸ�
			int temp = tens + units; // 1�� �ڸ� + 10�� �ڸ�
			int unitsFromTemp = temp % 10; // 1�� �ڸ��� 10�� �ڸ��� ��ģ ���� 1�� �ڸ�
			newNum = units * 10 + unitsFromTemp; // ������ 1�� �ڸ��� ���ο� 1�� �ڸ��� ������ ����
			count ++;
		}
		System.out.println(count);
		br.close();
	}
}
