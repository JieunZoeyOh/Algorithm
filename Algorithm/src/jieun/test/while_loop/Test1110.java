package jieun.test.while_loop;
// 원래 수로 돌아올 때까지 연산을 반복하는 문제
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
			int tens = newNum / 10; // 1의 자리
			int units = newNum % 10; // 10의 자리
			int temp = tens + units; // 1의 자리 + 10의 자리
			int unitsFromTemp = temp % 10; // 1의 자리와 10의 자리를 합친 값의 1의 자리
			newNum = units * 10 + unitsFromTemp; // 기존의 1의 자리와 새로운 1의 자리를 조합한 숫자
			count ++;
		}
		System.out.println(count);
		br.close();
	}
}
