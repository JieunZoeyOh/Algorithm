package jieun.test.one_dimensional_array;
//최댓값이 어디에 있는지 찾는 문제
// 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
import java.io.*;
public class Test2562_maxValue {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] numbers = new int[9];
		int maxIndex = 0;
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(br.readLine(), 10);
			maxIndex = (numbers[i] > numbers[maxIndex]) ? i : maxIndex;
		}
		bw.write(numbers[maxIndex] + "\n" + (maxIndex + 1));
		br.close();
		bw.flush(); bw.close();
	}
}
