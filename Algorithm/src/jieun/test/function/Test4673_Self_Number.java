package jieun.test.function;
// 함수 d를 정의하여 문제를 해결해 봅시다.
// 생성자가 없는 숫자를 셀프 넘버라고 한다. 100보다 작은 셀프 넘버는 총 13개가 있다. 
// 1, 3, 5, 7, 9, 20, 31, 42, 53, 64, 75, 86, 97
// 10000보다 작거나 같은 셀프 넘버를 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
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
